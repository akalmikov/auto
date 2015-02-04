package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class kid {

	private static WebElement element = null;
	 
	 public static WebElement email(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath(".//*[@id='email']"));
		 return element;
	 }
	 
	 public static WebElement captcha(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath(".//*[@id='login']"));
		 return element;
	 }
}
