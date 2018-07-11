package testAutomation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	WebDriver driver;
	
	@BeforeTest
	public void setupTest() {
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	@Test
	public void selectDDvalue() throws InterruptedException {
		
		
		WebElement month_dropdown=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select month_dd=new Select(month_dropdown);
		month_dd.selectByIndex(3);
		
		Thread.sleep(3000);
		
		month_dd.selectByValue("10");
	}
	
	@AfterTest
	public void endTest(){
		driver.close();
	}
}
