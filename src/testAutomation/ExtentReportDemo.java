package testAutomation;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentReportDemo {
	
	@Test
	public void loginTest() {
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/test.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Login Test");
		logger.log(Status.INFO, "Login to Amazon");
		logger.log(Status.PASS, "Title verified");
		extent.flush();
		
		ExtentTest logger2 = extent.createTest("Logoff Test");
		logger2.log(Status.FAIL, "Title verified");
		extent.flush();
		
		
	}

}
