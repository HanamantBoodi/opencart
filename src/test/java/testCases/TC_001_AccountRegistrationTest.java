package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistraionPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	
	@Test
	public void verify()
	{
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		hp.clickRegister();
		
	
		
		AccountRegistraionPage reg = new AccountRegistraionPage(driver);
		
		reg.setFirstName(randomString().toUpperCase());
		reg.setLastName(randomString().toUpperCase());
		reg.setEmail(randomString()+"@gmail.com".toLowerCase());
		reg.setmobileNumber(randomNumber());
		
		String pwd= alphanumeric();
		reg.setPassword(pwd);
		reg.setcnfPassword(pwd);
		reg.setAgree();
		reg.setContinue();
		
		String cnfMsg=reg.confirmation();
		Assert.assertEquals(cnfMsg, "Your Account Has Been Created!");
		
	}
	
	
}
