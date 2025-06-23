package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import E_commerce.nopcommerce.com.BaseClass;

public class LoginPage extends BaseClass {

	public LoginPage(RemoteWebDriver driver) {

		BaseClass.driver = driver;
	}

	// Page elements
	By username = By.id("Email");
	By password = By.id("Password");
	By loginbutton = By.xpath("//*[@id=\"main\"]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");

	// elements Action Methods
    public void Username(String name) {
		driver.findElement(username).clear();
		driver.findElement(username).sendKeys(name);
	}

	public void password(String pass) {
		driver.findElement(password).clear();
		driver.findElement(password).sendKeys(pass);
	}

	public void loginbutton() {
		driver.findElement(username).click();
	}

	public boolean loginbuttondisplayed() {
		return driver.findElement(username).isDisplayed();
	}

	public void login(String name, String pass) {
		Username(name);
		password(pass);
		loginbutton();
	}

	public String getpageurl() {
		String Url = driver.getCurrentUrl();
		return Url;
	}

}
