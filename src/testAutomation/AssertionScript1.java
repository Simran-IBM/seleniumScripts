package testAutomation;

import org.testng.annotations.Test;
import org.testng.Assert;

public class AssertionScript1 {
	
	@Test
	public void test1() {
		
		System.out.println("Test Case 1 Started");
		Assert.assertTrue(true);
		System.out.println("Test Case 1 Completed");
	}
	
	@Test
	public void test2() {
		
		System.out.println("Test Case 2 Started");
		Assert.assertTrue(false);
		System.out.println("Test Case 2 Completed");
	}
	
	@Test
	public void test3() {
		
		System.out.println("Test Case 3 Started");
		String str="Simran";
		Assert.assertTrue(str.contains("Simran"));
		System.out.println("Test Case 3 Completed");
	}
	
	@Test
	public void test4() {
		
		System.out.println("Test Case 4 Started");
		String str="Simran";
		Assert.assertTrue(str.contains("Preet"));
		System.out.println("Test Case 4 Completed");
	}
	
}
