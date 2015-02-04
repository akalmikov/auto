package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class signup {

 private static WebElement element = null;
	 
	 public static WebElement sign_up(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath("html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/p/a[2]"));
		 return element;
	 }
	 
	 public static WebElement parentrole(WebDriver driver){
		 
		 element = driver.findElement(By.xpath(".//*[@id='parent']"));
		 return element;
	 }
	 
	 public static WebElement kidrole(WebDriver driver){
		 
		 element = driver.findElement(By.xpath(".//*[@id='kid']"));
		 return element;
	 }
	 
	 public static WebElement merchrole(WebDriver driver){
		 
		 element = driver.findElement(By.xpath(".//*[@id='merchant']"));
		 return element;
	 }
	 
}
