package com.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.LoginPage;
public class MainTest {
	
	static WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		driver=new FirefoxDriver();
		//System.setProperty(ESCAPE_PROPERTY "false");
	}
	@BeforeTest
	public void launchApp()
	{
		driver.manage().timeouts().pageLoadTimeout(160, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void run()
	{
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
	
		driver.findElement(By.id("account")).click();
		//hp.Lnk_My_Account();
		lp.Enter_UserName("pravin");
		lp.Enter_Password("Test123");
		lp.click_Login();
		//hp.chk_Logout();
	}
	@AfterTest
	public void closeTest()
	{
		driver.close();
		driver.quit();
	}
	
	
	

}
