package suite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import po.GenerateData;
import po.signin;
import po.Before_all;

public class Signin {

	
	public static void before(){
	Before_all before = new Before_all();
	WebDriver driver = before.before_all();
	test_signin_as_parent(driver);
	}
	@Test
	public static void test_signin_as_parent(WebDriver driver){
		
		
		signin.sign_in(driver).click();
		signin.username(driver).sendKeys("alexa");
		signin.password(driver).sendKeys("password");
		signin.login(driver).click();
		//String title = driver.getTitle(); //.equals("Welcome to Kids and Go! - The World's First Online Marketplace for Kids");
		Assert.assertEquals("http://192.168.3.133:8004/?isAfterSigningIn=True", driver.getCurrentUrl());
	    
	}
	
	@AfterMethod
	public void after_parent_signin(){
		
		
	    //driver.quit();
	}
}
