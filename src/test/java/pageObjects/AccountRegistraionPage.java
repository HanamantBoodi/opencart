package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistraionPage extends BasePage {

	public AccountRegistraionPage(WebDriver driver)
	{
		super(driver);
	}
 @FindBy(xpath="//input[@id='input-firstname']")
 WebElement txtFirstName;
 @FindBy(xpath="//input[@id='input-lastname']")
 WebElement txtLastName;
 @FindBy(xpath="//input[@id='input-email']")
 WebElement txtEmail;
 @FindBy(xpath="//input[@id='input-telephone']")
 WebElement mobileNumber;
 @FindBy(xpath="//input[@id='input-password']")
 WebElement txtPassword;
 @FindBy(xpath="//input[@id='input-confirm']")
 WebElement cnfPassword;
 @FindBy(xpath="//input[@name='agree']")
 WebElement agree;
 @FindBy(xpath="//input[@value='Continue']")
 WebElement conitnue;
 @FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
 WebElement confirmation;
 
 
 public void setFirstName(String fname) 
 {
	 txtFirstName.sendKeys(fname);
 }
 
public  void setLastName(String lname) 
 {
	 txtLastName.sendKeys(lname);
 }
 
 
 public void setEmail(String email) 
 {
	 txtEmail.sendKeys(email);
 }
 public void setmobileNumber(String mblno) 
 {
	 mobileNumber.sendKeys(mblno);
 }
 
 public void setPassword(String password) 
 {
	 txtPassword.sendKeys(password); 
 }
 public void setcnfPassword(String cfpassword) 
 {
	 cnfPassword.sendKeys(cfpassword); 
 }
 
 public void setAgree() 
 {
	 agree.click();
 }
 public void setContinue() 
 {
	 conitnue.click();
 }
 
 public String confirmation() 
 {
	 try 
	 {
		 return (confirmation.getText());
	 }
	 catch (Exception e)
	 {
		 return (e.getMessage());
	 }
	 
 }
	
	}




