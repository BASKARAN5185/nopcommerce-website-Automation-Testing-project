package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import E_commerce.nopcommerce.com.BaseClass;

public class RegisterPage extends BaseClass {

	// Base class driver setup
	public RegisterPage(RemoteWebDriver driver) {
		BaseClass.driver = driver;
	}

	// Register Page Elements
	By RegsiterHeaer = By.linkText("Register");
	By pagetitle = By.className("page-title");
	By gendermale = By.id("gender-male");
	By genderfemale = By.id("gender-female");
	By FirstName = By.id("FirstName");
	By LastName = By.id("LastName");
	By Email = By.id("Email");
	By Company = By.id("Company");
	By Newsletter = By.name("Newsletter");
	By Password = By.id("Password");
	By ConfirmPassword = By.id("ConfirmPassword");
	By RegsiterButton = By.id("register-button");

	// Elements Action Method
	public Boolean registermenu() {
		driver.findElement(RegsiterHeaer).click();
		return true;
	}

	public Boolean registerButtonClick() {
		driver.findElement(RegsiterButton).click();
		return true;
	}

	public String pageTitle() {
		String title = driver.findElement(pagetitle).getText();
		return title;
	}

	public boolean gender(String gender) {

		if ("male".equalsIgnoreCase(gender)) {
			WebElement male = driver.findElement(gendermale);
			male.click();
			return male.isSelected();
		} else if ("female".equalsIgnoreCase(gender)) {
			WebElement female = driver.findElement(genderfemale);
			female.click();
			return female.isSelected();

		} else {
			return false;
		}

	}

	public void firstname(String name) {
		WebElement Firstname = driver.findElement(FirstName);
		Firstname.clear();
		Firstname.sendKeys(name);

	}

	public void lastname(String lname) {
		WebElement Lastname = driver.findElement(LastName);
		Lastname.clear();
		Lastname.sendKeys(lname);

	}

	public void mail(String gmail) {
		WebElement mail = driver.findElement(Email);
		mail.clear();
		mail.sendKeys(gmail);

	}

	public void companyName(String company) {
		WebElement Company1 = driver.findElement(Company);
		Company1.clear();
		Company1.sendKeys(company);

	}

	public void password(String pass) {
		WebElement pass1 = driver.findElement(Password);
		pass1.clear();
		pass1.sendKeys(pass);

	}

	public void confirmpass(String cpass) {
		WebElement cpass1 = driver.findElement(ConfirmPassword);
		cpass1.clear();
		cpass1.sendKeys(cpass);

	}

	public boolean newletters() {
		WebElement news = driver.findElement(Newsletter);
		news.click();
		return news.isSelected();

	}

	public void fullFormRegistaration(String gender, String firstName, String LastName, String Mail, String companyName,
			String pass, String Confirmpass) {
		gender(gender);
		firstname(firstName);
		lastname(LastName);
		mail(Mail);
		companyName(companyName);
		password(pass);
		confirmpass(Confirmpass);
		newletters();
		registerButtonClick();

	}

}
