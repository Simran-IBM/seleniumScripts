package testAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Simran\\eclipse-workspace\\seleniumTestAutomation\\lib\\geckoDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.seleniumhq.org/");
        driver.manage().window().maximize();
        driver.close();
        
	}

}
