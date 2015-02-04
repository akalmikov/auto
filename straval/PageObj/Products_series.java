package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Products_series {

	 private static WebElement element = null;
	 
	 public static WebElement PRH09_7(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath("html/body/ul[1]/li[7]/a"));
		 return element;
	 }
	 
	 public static WebElement PRH09_6(WebDriver driver){
		 
		 element = driver.findElement(By.xpath("html/body/ul[1]/li[6]/a"));
		 return element;
	 }

	 public static WebElement PRH09_5(WebDriver driver){
		 
		 element = driver.findElement(By.xpath("html/body/ul[1]/li[5]/a"));
		 return element;
	 }

	 public static WebElement PRH09_4(WebDriver driver){
		 
		 element = driver.findElement(By.xpath("html/body/ul[1]/li[4]/a"));
		 return element;
	 }

	 public static WebElement PRH09_3(WebDriver driver){
		 
		 element = driver.findElement(By.xpath("html/body/ul/li[3]/a"));
		 return element;
	 }

	 public static WebElement PRH09_3_selector(WebDriver driver){
		 
		 element = driver.findElement(By.xpath(".//*[@id='size-selector-dd']/a/span[2]"));
		 return element;
	 }
	 
	 public static WebElement PRH09_3_10(WebDriver driver){
		 
		 element = driver.findElement(By.xpath(".//*[@id='sr_926']"));
		 return element;
	 }
	 
	 public static WebElement PRH09_3_10_p1(WebDriver driver){
		 
		 element = driver.findElement(By.xpath("html/body/ul[4]/li[3]/a"));
		 return element;
	 }

	 public static WebElement PRH09_3_10_p2(WebDriver driver){
		 
		 element = driver.findElement(By.xpath("html/body/ul[5]/li[3]/a"));
		 return element;
	 }
	 
	 
}
