package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//a[@title='My Account']")
	WebElement lnkMyaccount;
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement lnkregister;
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement loginpage;
	
	
	
  public void clickMyAccount() 
  {
	  lnkMyaccount.click();
  }
  
  public void clickRegister() 
  {
	  lnkregister.click();
  }
  public void clicklogin() 
  {
	  loginpage.click();
  }
}
