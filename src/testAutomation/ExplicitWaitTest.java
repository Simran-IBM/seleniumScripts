package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExplicitWaitTest {

	
WebDriver driver;
	
	@BeforeTest
	public void setupTest() {
		driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void waitTest()  {
		
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
		
		//driver.findElement(By.xpath("//*[@id='demo']"));
		//WebElement element=driver.findElement(By.xpath("//p[text()='WebDriver']"));
		
		Boolean status=element.isDisplayed();
		
		if(status)
		{
			System.out.println("Element is displayed");
		}
		
		else {
			System.out.println("Element is not displayed");
		}
		
	}
	
	@AfterTest
	public void endTest(){
		driver.close();
	}
}
