package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import E_commerce.nopcommerce.com.BaseClass;

public class ITestListeners implements ITestListener {
	ExtentSparkReporter Sparkreport;
	ExtentReporter extendReport;
	ExtentTest test;

	@Override
	public void onStart(ITestContext context) {

		System.out.println("Start :" + context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Finish :" + context.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test is Skp :" + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test is Pass :" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test is Fail :" + result.getName());
		File Scr = ((TakesScreenshot) BaseClass.driver()).getScreenshotAs(OutputType.FILE);

		File des = new File(
				"C:\\Users\\xmedia\\eclipse-workspace\\nopcommerce.com\\Screenshot\\" + result.getName() + ".png");
		try {
			org.openqa.selenium.io.FileHandler.copy(Scr, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
