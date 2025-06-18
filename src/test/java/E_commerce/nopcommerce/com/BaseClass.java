package E_commerce.nopcommerce.com;

import java.time.Duration;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public static RemoteWebDriver driver;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fapparel");

	}

	@AfterClass
	public void teardown() {

		driver.quit();
	}

	public static TakesScreenshot driver() {
		// TODO Auto-generated method stub
		return driver;
	}

}
