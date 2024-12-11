package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage{
	
	public loginPage(WebDriver driver) 
	{
		super(driver);
	}

	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	 public void setEmail(String email)
	 {
		 txtEmailAddress.sendKeys(email);
	 }
	 public void setPswd(String pwd)
	 {
		 txtPassword.sendKeys(pwd);
	 }
	 public void login()
	 {
		 login.click();
	 }
	 
}


