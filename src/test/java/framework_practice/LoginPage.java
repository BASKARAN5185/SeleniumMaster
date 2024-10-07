package framework_practice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import frametestpractice.MyBaseCalss;

public class LoginPage extends MyBaseCalss {
	
	@Test
	public void EnterUserName(String username) {
		
		driver.findElement(By.id("")).sendKeys(username);
		
		
	}

}
