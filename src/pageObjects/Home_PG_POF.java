package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class Home_PG_POF {
	
	final WebDriver driver;
	@FindBy(how = How.XPATH, using = ".//*[@id='sidebar']/div/div/a/strong")
	public WebElement lnk_MyAccount;
	public Home_PG_POF(WebDriver driver)
	{
		this.driver = driver;
		}
}