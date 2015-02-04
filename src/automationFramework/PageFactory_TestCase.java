package automationFramework;
import java.util.concurrent.TimeUnit;
import pageObjects.SiteMap;
import pageObjects.Home_PG_POF;
import pageObjects.LogIn_PG_POF;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.SeleniumServer;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
public class PageFactory_TestCase {
	
	static WebDriver driver;
	Home_PG_POF HomePage;
	LogIn_PG_POF LoginPage;
	SiteMap Sitemap;

  @BeforeMethod
  public void beforeMethod() {

	  driver = new FirefoxDriver();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("http://employees.staging.dbbest.com");
      LoginPage = PageFactory.initElements(driver, LogIn_PG_POF.class);
      HomePage = PageFactory.initElements(driver, Home_PG_POF.class);
      Sitemap = PageFactory.initElements(driver, SiteMap.class); 
  }

  //@Test
  @SuppressWarnings("deprecation")
//
  //public void test() {
  //
  //   LoginPage.LogIn_Action("kalmykov.a", "Ehrbvfplfq");
  //   HomePage.lnk_MyAccount.click();
  //   System.out.println(" Login Successful.");
  //   
  //
  //
  @Test
  
  public void sitemap() {
	  
	  LoginPage.LogIn_Action("kalmykov.a", "Ehrbvfplfq");
	  HomePage.lnk_MyAccount.click();
	  Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='content']/div/div/div[2]/div[1]/div/div[2]/h2")).getText().equals("Alexander Kalmykov"));
	  Sitemap.MyTasks.click();
	  //Assert.assertTrue(driver.findElement(By.tagName("title")).getText().equals("Tasks"));
	  Sitemap.MyTimeReport.click();
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.textToBePresentInElement(By.xpath(".//*[@id='content']/div/h1"), "Time report"));
	  Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='weekHours']/div/span[1]")).getText().equals("Week Hours"));
  }
  @AfterMethod

  public void afterMethod() {

	  driver.quit();

  }

}