package tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import po.Before_all;
import po.get_all_links1;

public class get_all_links_unautorized{

	WebDriver driver;
	
	@Test
	public void test() throws Exception{
		
		Before_all before = new Before_all();
		driver = before.before_all();		
		get_all_links1.main(driver);
	}
	@AfterMethod
	public void after(){
		driver.quit();
	}
}
