package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
	private static WebElement element;
	public WebDriver driver;

	By username = By.id("log");
	By pswd = By.id("pwd");
	By chkLogin = By.id("login");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void click_Login() {
		driver.findElement(chkLogin).click();
		Reporter.log("User Click on Login");
	}

	public void Enter_Password(String psw) {
		driver.findElement(pswd).sendKeys(psw);
		Reporter.log(psw + "is enter");
	}

	public void Enter_UserName(String nm) {
		if (driver.findElements(username).size() == 1) {
			if (driver.findElement(username).isEnabled()) {
				driver.findElement(username).sendKeys(nm);
				Reporter.log("<font color='green'>" + nm + "is enter");
			} else {
				Reporter.log("Username" + nm + "not available");
				Assert.assertFalse(true);
			}
		}
	}

}