package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class merchant {
	
	private static WebElement element = null;
	 
	 public static WebElement name(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath(".//*[@id='login']"));
		 return element;
	 }
	 
	 public static WebElement login(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath(".//*[@id='login']"));
		 return element;
	 }
	 
}
