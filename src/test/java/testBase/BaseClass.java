package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

public WebDriver driver;
public Properties p;
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException
	{
		
		FileReader file= new FileReader("./src//test//resources//properties//config.properties");
		p= new Properties();
		p.load(file);
		
		switch (br.toLowerCase())
		{
		case "chrome": driver= new ChromeDriver(); break;
		case "edge": driver = new EdgeDriver();break;
		default: System.out.println("Invalid Browser Name...");return;
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));//reading url from properties file 
		driver.manage().window().maximize();
	}
	
	/*@AfterClass
	public void tearDown()
	{
		driver.quit();
	}*/
	
	
	public String randomString()
	{
		String randomGeneratedString=RandomStringUtils.randomAlphabetic(5);
		return randomGeneratedString;
	}
	public String randomNumber()
	{
		String randomGeneratedNumber=RandomStringUtils.randomNumeric(5);
		return randomGeneratedNumber;
	}
	public String alphanumeric()
	{
		
		String randomGeneratedString=RandomStringUtils.randomAlphabetic(5);
		String randomGeneratedNumber=RandomStringUtils.randomNumeric(5);
		return (randomGeneratedString+"@"+randomGeneratedNumber);
	}

	
	
}
