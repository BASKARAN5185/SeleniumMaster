package frametestpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class MyBaseCalss {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void browseropen() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\webdriver\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("www.google.com");
	}
	
	
	@AfterClass
	public static void browserclose() {
		
		driver.close();
		
	}

}
