package automationFramework;
		import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.PageFactory;
		import pageObjects.Home_PG_POF;
		import pageObjects.LogIn_PG_POF;
	public class TestCase_POF {
		static WebDriver driver;
		public static void main(String[] args) throws InterruptedException{
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://employees.staging.dbbest.com");
			Home_PG_POF HomePage = PageFactory.initElements(driver, Home_PG_POF.class);
			LogIn_PG_POF LoginPage = PageFactory.initElements(driver, LogIn_PG_POF.class);
			HomePage.lnk_MyAccount.click();
			LoginPage.UserName.sendKeys("testuser_1");
			LoginPage.Password.sendKeys("Test@123");
			LoginPage.btn_Login.click();
			System.out.println(" Login Successful.");
			driver.quit();
		}
	}