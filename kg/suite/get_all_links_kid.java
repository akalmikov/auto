package suite;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import po.Before_all;
import po.get_all_links;
import suite.Signin;

public class get_all_links_kid {

	WebDriver driver;
	
	@Test
	public void test(){
		
		Before_all before = new Before_all();
		driver = before.before_all();		
		Signin.test_signin_as_kid(driver);		
		get_all_links.get_links(driver);
		driver.quit();
	}
	
}
