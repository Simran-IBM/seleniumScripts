package testAutomation;

import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieTest {
	
	public static void main(String args[]) {
		
		WebDriver driver;
System.setProperty("webdriver.chrome.driver",".\\lib\\geckoDriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("http://yahoo.com");
		
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("Size of Cookies "+cookies.size());
		
		for (Cookie cookie: cookies) {
			System.out.println(cookie.getName()+" = "+cookie.getValue());
		}
		
		//driver.manage().deleteAllCookies();
		//System.out.println("Size of Cookies "+cookies.size());
		
		driver.close();
	}

}
