package PageObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;

public class NavMenu {
	
	 private static WebElement element = null;
	 
	 public static WebElement Pre_Reg(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath(".//*[@id='desktop_accordion']/li[1]/a/span[1]"));
		 return element;
	 }
	 
	 public static WebElement Back_Pre(WebDriver driver){
		 
		 element = driver.findElement(By.xpath(".//*[@id='desktop_accordion']/li[2]/a/span[1]"));
		 return element;
	 }
	 
	 public static WebElement Pre_Reg_NPT(WebDriver driver){
		 
		 element = driver.findElement(By.xpath(".//*[@id='desktop_accordion']/li[1]/ul/li[2]/a/span[1]"));
		 return element;
	 }
	 
	 public static WebElement Pre_Reg_NTP_PRH(WebDriver driver){
		 
		 element = driver.findElement(By.xpath(".//*[@id='desktop_accordion']/li[1]/ul/li[2]/ul/li/div/div[1]/ul/li[3]/a"));
		 return element;
	 }
	 
	 public static WebElement Back_Pre_NPT(WebDriver driver){
		 
		 element = driver.findElement(By.xpath(".//*[@id='desktop_accordion']/li[2]/ul/li[2]/a"));
		 return element;
	 }
}
