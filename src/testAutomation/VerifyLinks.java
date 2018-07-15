package testAutomation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyLinks {

	
WebDriver driver;
	
	@BeforeTest
	public void setupTest() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");	
	}
	
	@Test
	public void verifyLinks1() {
	
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+links.size());
		
		for(int i=0;i<links.size();i++) {
			WebElement ele = links.get(i);
			String url = ele.getAttribute("href");
			verifyLinkActive(url);
		}
	}
	
	@Test 
	//@Parameters("LinkURL")
	public void verifyLinkActive(String linkUrl) {
		try {
			URL url = new URL(linkUrl);
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(3000);
			httpURLConnect.connect();
			
			if(httpURLConnect.getResponseCode()==200) {
				System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage());
			}
			
			else if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND){
				System.out.println(linkUrl+"-"+httpURLConnect.getResponseMessage() +"-"+HttpURLConnection.HTTP_NOT_FOUND);
			}
			
			
			
		}catch(Exception e) {
			
		}
	}
	
	@AfterTest
	public void endTest(){
		driver.quit();
	}
}
