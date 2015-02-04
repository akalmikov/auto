package suite;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import po.Before_all;
import suite.Signin;
import suite.get_all_links;

public class get_all_links_parent {

	WebDriver driver;
	
	@Test
	public void test(){
		
		Before_all before = new Before_all();
		driver = before.before_all();		
		Signin.test_signin_as_parent(driver);		
		get_all_links.get_links(driver);
	}
}
