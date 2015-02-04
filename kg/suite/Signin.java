package suite;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import po.signin;
import po.Before_all;

public class Signin {

	
	public static void before(){
	Before_all before = new Before_all();
	WebDriver driver = before.before_all();
	test_signin_as_parent(driver);
	}
	
	public static void test_signin_as_parent(WebDriver driver){
		
		
		signin.sign_in(driver).click();
		signin.username(driver).sendKeys("alexa");
		signin.password(driver).sendKeys("password");
		signin.login(driver).click();
		//String title = driver.getTitle(); //.equals("Welcome to Kids and Go! - The World's First Online Marketplace for Kids");
		Assert.assertEquals("http://192.168.3.133:8004/?isAfterSigningIn=True", driver.getCurrentUrl());
	    
	}
	
	public static void test_signin_as_merch(WebDriver driver){
		
		
		signin.sign_in(driver).click();
		signin.username(driver).sendKeys("alexm");
		signin.password(driver).sendKeys("password");
		signin.login(driver).click();
		//String title = driver.getTitle(); //.equals("Welcome to Kids and Go! - The World's First Online Marketplace for Kids");
		Assert.assertEquals("http://192.168.3.133:8004/?isAfterSigningIn=True", driver.getCurrentUrl());
	    
	}
	
	public static void test_signin_as_kid(WebDriver driver){
		
		
		signin.sign_in(driver).click();
		signin.username(driver).sendKeys("alexk");
		signin.password(driver).sendKeys("password");
		signin.login(driver).click();
		//String title = driver.getTitle(); //.equals("Welcome to Kids and Go! - The World's First Online Marketplace for Kids");
		Assert.assertEquals("http://192.168.3.133:8004/?isAfterSigningIn=True", driver.getCurrentUrl());
	    
	}
	public void after_parent_signin(){
		
		
	    //driver.quit();
	}
}
