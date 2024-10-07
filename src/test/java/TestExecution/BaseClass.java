package TestExecution;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import actions.Configuration;

public class BaseClass {

	@BeforeClass
	public void setup() {
	//chrome || edge  || firefox
	Configuration.openBrowser("chrome");
	Configuration.openApplication("https://dev.canlierp.mo.vc/");
	
	
	}
	
	@AfterClass
	public void teardown() {
		// Configuration.closeBrowser();
	}

	
	
}
