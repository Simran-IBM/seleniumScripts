package testAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest {
	
	
	@Test
	public void testSoft() {
		
		SoftAssert assertion = new SoftAssert();
		System.out.println("Test Case Soft Assertion Started");
		assertion.assertEquals(12, 13, "Count doesn't Match");
		System.out.println("Test Case Soft Assertion Completed");
		assertion.assertAll();
	}
	
	@Test
	public void testHard() {
		
		System.out.println("Test Case Hard Assertion Started");
		Assert.assertEquals(12, 13);
		System.out.println("Test Case Hard Assertion Completed");
	}

}
