package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFBRegisteration {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Simran\\eclipse-workspace\\seleniumTestAutomation\\lib\\geckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"u_0_j\"]")).sendKeys("Simran");
        driver.findElement(By.xpath("//*[@id=\"u_0_a\"]")).click();
        driver.close();

	}

}
