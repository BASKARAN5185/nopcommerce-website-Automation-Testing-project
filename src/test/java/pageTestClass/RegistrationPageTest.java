package pageTestClass;

import org.testng.Assert;
import org.testng.annotations.Test;

import E_commerce.nopcommerce.com.BaseClass;
import pageObjectModel.RegisterPage;

public class RegistrationPageTest extends BaseClass {

	RegisterPage Reg = new RegisterPage(driver);

	@Test(priority = 1)
	void clickTheRegisterManu() {
		Reg.registermenu();
		Assert.assertTrue(getpageurl().contains("register"), "The page is not regsiteration ");
	}

	@Test(priority = 2)
	void Registerformfilling() {
		Reg.fullFormRegistaration("male", "Guna", "S", "guna@gmail.com", "ABC Inc", "Guna@123", "Guna@124");
	}

}
