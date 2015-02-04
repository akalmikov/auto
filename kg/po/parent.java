package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class parent {

	private static WebElement element = null;
	 
	 public static WebElement login(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath(".//*[@id='login']"));
		 return element;
	 }
	 
	 public static WebElement pass(WebDriver driver){
		 
		 element = driver.findElement(By.xpath(".//*[@id='Password']"));
		 return element;
	 }
	 
	 public static WebElement confpass(WebDriver driver){
		 
		 element = driver.findElement(By.xpath(".//*[@id='ConfirmPassword']"));
		 return element;
	 }
	 
	 public static WebElement email(WebDriver driver){
		 
		 element = driver.findElement(By.xpath(".//*[@id='email']"));
		 return element;
	 }
	 
	 public static WebElement fname(WebDriver driver){
				 
		 element = driver.findElement(By.xpath(".//*[@id='FirstName']"));
		 return element;
	 }
		
	 public static WebElement lname(WebDriver driver){
			 
		 element = driver.findElement(By.xpath(".//*[@id='LastName']"));
		 return element;
	}
		
	 public static WebElement ppfname(WebDriver driver){
			 
		 element = driver.findElement(By.xpath(".//*[@id='PayPalFirstName']"));
		 return element;
}
		
	 public static WebElement pplname(WebDriver driver){
			 
		 element = driver.findElement(By.xpath(".//*[@id='PayPalLastName']"));
		 return element;
}	
	 public static WebElement ppemail(WebDriver driver){
			 
		 element = driver.findElement(By.xpath(".//*[@id='PayPalEmail']"));
		 return element;
}	
	 public static WebElement terms(WebDriver driver){
			 
		 element = driver.findElement(By.xpath(".//*[@id='newUserForm']/label/span"));
		 return element;
}	
	 public static WebElement submit(WebDriver driver){
			 
		 element = driver.findElement(By.xpath(".//*[@id='signUp']"));
		 return element;
}
}
