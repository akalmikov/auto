package tests;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import po.Before_all;
import suite.Signup;

public class signup_test {

WebDriver driver;
	
	@Test
	public void as_parent(){
		
		Before_all before = new Before_all();
		driver = before.before_all();		
		Signup.test_signup_as_parent(driver);
		
		driver.quit();
	}
	@Test
	public void as_merch(){
		
		Before_all before = new Before_all();
		driver = before.before_all();		
		Signup.test_signup_as_merchant(driver);
		
		driver.quit();
	}
}
