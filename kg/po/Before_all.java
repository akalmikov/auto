package po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Before_all {

	WebDriver driver;
	GenerateData genData;
	String base_url = "http://192.168.3.133:8004";
	@BeforeMethod
	public WebDriver before_all(){
		
		driver=new FirefoxDriver();
		genData=new GenerateData();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(base_url);
		return driver;
	}
	
}
