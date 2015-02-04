package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signin {

	private static WebElement element = null;

	 public static WebElement sign_in(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/p/a[1]"));
		 return element;
	 }

	 public static WebElement username(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath(".//*[@id='UserName']"));
		 return element;
	 }

	 public static WebElement password(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath(".//*[@id='Password']"));
		 return element;
	 }

	 public static WebElement login(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath("html/body/div[1]/form/div/div/div/div/div[2]/div[2]/div[2]/button"));
		 return element;
	 }

}
