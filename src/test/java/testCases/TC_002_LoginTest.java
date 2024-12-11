package testCases;

import org.testng.Assert;

import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.loginPage;
import testBase.BaseClass;

public class TC_002_LoginTest extends BaseClass {
	public void verify_login() {
		try {
	HomePage hp=new HomePage(driver);
	
	//HomePage
	hp.clickMyAccount();
	hp.clicklogin();
	
	//LoginPage
	loginPage lp= new loginPage(driver);
	lp.setEmail(p.getProperty("email"));
	lp.setPswd(p.getProperty("password"));
	lp.login();
	
	//MyAccount
	
	MyAccountPage macc= new MyAccountPage(driver);
	boolean targetPage=macc.isMyAccountExist();
	Assert.assertEquals(targetPage, true, "Login failed" );
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
}
