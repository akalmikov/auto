package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import po.Before_all;
import po.get_all_links1;
import suite.Signin;

public class get_all_links_merch {

	WebDriver driver;
	
	@Test
	public void test(){
		
		Before_all before = new Before_all();
		driver = before.before_all();		
		Signin.test_signin_as_merch(driver);		
		try {
			get_all_links1.main(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	@AfterMethod
	public void after(){
		driver.quit();
	}
}
