package pageTestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import E_commerce.nopcommerce.com.BaseClass;
import pageObjectModel.LoginPage;

public class LoginPageTest extends BaseClass {

	LoginPage lg = new LoginPage(driver);

	@Test(priority = 8)
	void vaildCredentials() {
		lg.login("Baskaran", "Bas@123");
		Assert.assertEquals(lg.getpageurl(), "https://demo.nopcommerce.com/login?returnUrl=%2Fapparel");

	}

	@Test(priority = 1)

	void invalidUsername() {
		lg.login("Ba44skaran", "Bas@123");
		Assert.assertEquals(lg.getpageurl(), "https://demo.nopcommerce.com/login?returnUrl=%2Fapparel");

	}

	@Test(priority = 2)
	void invalidpassword() {
		lg.login("Baskaran", "Bas@12443");
		Assert.assertEquals(lg.getpageurl(), "https://demo.nopcommerce.com/login?returnUrl=%2Fapparel");

	}

	@Test(priority = 3)
	void emptyusername() {
		lg.login("", "Bas@123");
		Assert.assertEquals(lg.getpageurl(), "https://demo.nopcommerce.com/login?returnUrl=%2Fapparel");

	}

	@Test(priority = 4)
	void emptypassword() {
		lg.login("Baskaran", "");
		Assert.assertEquals(lg.getpageurl(), "https://demo.nopcommerce.com/login?returnUrl=%2Fapparel");

	}

	@Test(priority = 5)
	void emptyusernameandpassword() {
		lg.login("", "");
		Assert.assertEquals(lg.getpageurl(), "https://demo.nopcommerce.com/login?returnUrl=%2Fapparel");

	}

	@Test(priority = 6)
	void UsernameandpasswordCaseSensitive() {
		lg.login("BASKARAN", "BAS@12443");
		Assert.assertEquals(lg.getpageurl(), "https://demo.nopcommerce.com/login?returnUrl=%2Fapparel");

	}

	@Test(priority = 7)
	void SqlInjection() {
		lg.login("'OR'1'='1", "'OR'1'='1");
		Assert.assertEquals(lg.getpageurl(), "https://demo.nopcommerce.com/login?returnUrl=%2Fapparel");

	}

	@Test(priority = 9, timeOut = 5000, enabled = false)
	void LodingPagetime() {
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fapparel");
		lg.loginbuttondisplayed();

		driver.close();

	}

}
