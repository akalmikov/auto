package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import java.lang.Object;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class handleiframe {

	WebDriver driver;
	@Test
	public void frame(){
		driver=new FirefoxDriver();
		driver.get("http://headsupfaculty.com");
		driver.findElement(By.xpath("html/body/div[4]/div/div/div/div[2]/div/div/ul/li[2]/a/span")).click();
		driver.findElement(By.xpath(".//*[@id='UserName']")).sendKeys("Shelly");
		driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("11Password");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div[9]/a[1]")).click();
		driver.findElement(By.cssSelector(".edit")).click();
		driver.switchTo().frame(driver.findElement(By.id("Testimonial_ifr")));
		WebElement element = driver.findElement(By.className("mce-content-body"));
		((JavascriptExecutor)driver).executeScript("arguments[0].innerHTML = '<h1>Set text using innerHTML</h1>'", element);
		driver.switchTo().defaultContent();
//		((JavascriptExecutor)driver).executeScript("tinyMCE.activeEditor.setContent('<h1>Native API text</h1> TinyMCE')");
		driver.findElement(By.xpath(".//*[@id='submit']")).click();
		
}}
