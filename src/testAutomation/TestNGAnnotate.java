package testAutomation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotate {
	
	@BeforeClass
	public void login() {
		System.out.println("BeforeClass-Login Successful");
	}
	
	@AfterClass
	public void logout() {
		System.out.println("AfterClass-Logout Successful");
	}
	
	
	@BeforeTest
	public void setupTest() {
		System.out.println("BeforeTest-Setup Successful");
	}
	
	@AfterTest
	public void endTest() {
		System.out.println("AfterTest-EndTest Successful");
	}
	@BeforeMethod
	public void login1() {
		System.out.println("BeforeMethod-Login Successful");
	}
	
	@AfterMethod
	public void logout1() {
		System.out.println("AfterMethod-Logout Successful");
	}

	@Test
	public void addVendor() {
		System.out.println("Test-Add Vendor Successful");
	}
	
	@Test
	public void addProduct() {
		System.out.println("Test-Add Product Successful");
	}
	
}
