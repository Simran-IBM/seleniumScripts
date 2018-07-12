package testAutomation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandle1 {

	WebDriver driver;
	
	@BeforeTest
	public void setupTest() {
		driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void selectWindows() throws InterruptedException {
		String parent=driver.getWindowHandle();
		System.out.println("Parent window ID is "+parent);
		
		//driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[4]/div[1]/div/div/div/div[1]/div/div/div/div[1]/div[2]/a[1]"));
		
		driver.findElement(By.xpath("//a[contains(@href,'http://www.google.com')]")).click();
		Thread.sleep(10000);
		Set<String> allWindows=driver.getWindowHandles();
		int count = allWindows.size();
		
		System.out.println("Total windows: "+count);
		
		for(String child:allWindows) {
			System.out.println("Child window is: "+child);
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				Thread.sleep(10000);
				System.out.println("Child window is: "+child);
				driver.findElement(By.name("q")).sendKeys("Selenium");
				Thread.sleep(10000);
				driver.close();
				
			}
		}
		driver.switchTo().window(parent);
		System.out.println("Parent window title is: "+driver.getTitle());
	}
	
	@AfterTest
	public void endTest(){
		driver.quit();
	}
}
