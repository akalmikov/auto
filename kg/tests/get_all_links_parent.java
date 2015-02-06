package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import po.Before_all;
import po.get_all_links1;
import suite.Signin;

public class get_all_links_parent {

	WebDriver driver;
	
	@Test
	public void get_links() throws Exception{
		
		Before_all before = new Before_all();
		driver = before.before_all();		
		Signin.test_signin_as_parent(driver);		
		get_all_links1.main(driver);
	}
	@AfterMethod
	public void after(){
		driver.quit();
	}
}
