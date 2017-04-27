package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage {

	private static WebElement element;
	 WebDriver driver;
	  
	 By acc=By.id("account");
	 By logout=By.id("account_logout");
	
	 public HomePage(WebDriver Driver)
	 {
		 this.driver=driver;
	 }
	/*@FindBy(name="q")
	public WebElement txtsearch;
	@FindBy(xpath=("//*[@id='one']"))
	public WebElement txtid;*/
	 public  void Lnk_My_Account()
	 {
		 //driver.findElement(ax).click();
		 driver.findElement(By.id("account")).click();
	 }
	 public void chk_Logout()
	 {
		 driver.findElement(logout).click();
		
	 }
	

}
