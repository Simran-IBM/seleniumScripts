package testAutomation;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AssertionScript {
	
	@Test
	public void test1() {
		
		System.out.println("Test Case 1 Started");
		Assert.assertEquals(12, 13);
		System.out.println("Test Case 1 Completed");
	}
	
	@Test
	public void test2() {
		
		System.out.println("Test Case 2 Started");
		Assert.assertEquals(12, 13, "Count doesn't match");
		System.out.println("Test Case 2 Completed");
	}
	
	@Test
	public void test3() {
		
		System.out.println("Test Case 3 Started");
		Assert.assertEquals("Hello", "Hello", "Not Matched");
		System.out.println("Test Case 3 Completed");
	}


}
