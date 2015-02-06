package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import po.Before_all;
import suite.Signin;

public class signin_test {
	
	WebDriver driver;
	
	@Test
	public void as_parent(){
		
		Before_all before = new Before_all();
		driver = before.before_all();		
		Signin.test_signin_as_parent(driver);
		
		driver.quit();
	}
	@Test
	public void as_merch(){
		
		Before_all before = new Before_all();
		driver = before.before_all();		
		Signin.test_signin_as_merch(driver);
		
		driver.quit();
	}

}
