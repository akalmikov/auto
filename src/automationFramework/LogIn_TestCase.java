package automationFramework;
	import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LogIn_TestCase {
		private static WebDriver driver = null;
    public static void main(String[] args) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.get("http://employees.staging.dbbest.com");
       // driver.findElement(By.xpath(".//*[@id='Username']")).sendKeys("kalmykov.a");
        //driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("Ehrbvfplfq");
        //driver.findElement(By.xpath(".//*[@id='submitBtn']")).click();
        //System.out.println(" Login Successful.");
        //driver.quit();

            }

    }