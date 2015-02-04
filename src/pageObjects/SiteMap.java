package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class SiteMap {
	
	final WebDriver driver;
	@FindBy(how = How.XPATH, using = ".//*[@id='sidebar']/div/div/a/strong")
	public WebElement lnk_MyAccount;
	@FindBy(how = How.XPATH, using = ".//*[@id='520171']/a")
	public WebElement MyTasks;
	@FindBy(how = How.XPATH, using = ".//*[@id='520256']/a")
	public WebElement MyTimeReport;
	public SiteMap(WebDriver driver)
	{
		this.driver = driver;
		}
}