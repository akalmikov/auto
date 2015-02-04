package TestSuite;

import PageObj.NavMenu;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import PageObj.Products_series;

public class NewItemTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
	 
	     driver = new FirefoxDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("http://straval.com");
	     NavMenu.Pre_Reg(driver).click();
	     NavMenu.Pre_Reg_NPT(driver).click();
	     NavMenu.Pre_Reg_NTP_PRH(driver).click();
	     ((JavascriptExecutor)driver).executeScript("arguments[0].click();", Products_series.PRH09_3(driver));
	    // Products_series.PRH09_3_selector(driver).click();
	     Products_series.PRH09_3(driver).click();
	     
	     Products_series.PRH09_3_10(driver).click();
	     Products_series.PRH09_3_10_p1(driver).click();
	     Products_series.PRH09_3_10_p2(driver).click();
	     
	}
	
	public void clickOnInvisibleElement(WebElement element) {
        
	    String script = "var object = arguments[0];"
	            + "var theEvent = document.createEvent(\"MouseEvent\");"
	            + "theEvent.initMouseEvent(\"click\", true, true, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);"
	            + "object.dispatchEvent(theEvent);"
	            ;
	         
	    ((JavascriptExecutor)driver).executeScript(script, element);
	}
}
