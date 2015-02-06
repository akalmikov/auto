package suite;

import org.openqa.selenium.WebDriver;
import po.GenerateData;
import po.parent;
import po.signup;

public class Signup {
	
	WebDriver driver;
	static GenerateData genData = new GenerateData();

	public static void test_signup_as_parent(WebDriver driver){
		 
		 signup.sign_up(driver).click();
	     signup.parentrole(driver).click();
	     parent.login(driver).sendKeys(genData.generateRandomAlphaNumeric(30));
	     parent.pass(driver).sendKeys("password");
	     parent.confpass(driver).sendKeys("password");
	     parent.email(driver).sendKeys(genData.generateEmail(30));
	     parent.fname(driver).sendKeys(genData.generateRandomString(12));
	     parent.lname(driver).sendKeys(genData.generateRandomString(15));
	     
	     parent.ppfname(driver).sendKeys("fname");
	     parent.pplname(driver).sendKeys("lname");
	     parent.ppemail(driver).sendKeys("alextest@dbbest.com");
	     parent.terms(driver).click();
	     parent.submit(driver).click();
	}

	public static void test_signup_as_merchant(WebDriver driver){
		 
		 signup.sign_up(driver).click();
	     signup.merchrole(driver).click();
	     parent.login(driver).sendKeys(genData.generateRandomAlphaNumeric(30));
	     parent.pass(driver).sendKeys("password");
	     parent.confpass(driver).sendKeys("password");
	     parent.email(driver).sendKeys(genData.generateEmail(30));
	     parent.fname(driver).sendKeys(genData.generateRandomString(12));
	     
	     parent.ppfname(driver).sendKeys("fname");
	     parent.pplname(driver).sendKeys("lname");
	     parent.ppemail(driver).sendKeys("alextest@dbbest.com");
	     parent.terms(driver).click();
	     parent.submit(driver).click();
	}
}
//	@BeforeMethod
//	public void before_kid(){
//		
//		driver=new FirefoxDriver();
//		genData=new GenerateData();
//		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://192.168.3.133:8004");
//		signup.sign_up(driver).click();
//	}
//	
//	@Test	
//	public void test_signup_as_kid(){
//		 
//		 
//	     signup.kidrole(driver).click();
//	     parent.login(driver).sendKeys(genData.generateRandomAlphaNumeric(30));
//	     parent.pass(driver).sendKeys("password");
//	     parent.confpass(driver).sendKeys("password");
//	     parent.email(driver).sendKeys(genData.generateEmail(30));
//	     parent.fname(driver).sendKeys(genData.generateRandomString(12));
//	     
//	     parent.ppfname(driver).sendKeys("fname");
//	     parent.pplname(driver).sendKeys("lname");
//	     parent.ppemail(driver).sendKeys("alextest@dbbest.com");
//	     parent.terms(driver).click();
//	     parent.submit(driver).click();
//	}
//}