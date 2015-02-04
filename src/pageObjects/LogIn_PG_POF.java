package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LogIn_PG_POF {

	final WebDriver driver;
	@FindBy(how = How.XPATH, using = ".//*[@id='Username']")
	public WebElement UserName;
	@FindBy(how = How.XPATH, using = ".//*[@id='Password']")
	public WebElement Password;
	@FindBy(how = How.XPATH, using = ".//*[@id='submitBtn']")
	public WebElement btn_Login ;

	public LogIn_PG_POF(WebDriver driver){ 

		this.driver = driver; 

    	} 
	
	public void LogIn_Action(String sUserName, String sPassword){
		 
        UserName.sendKeys(sUserName);
        Password.sendKeys(sPassword);
        btn_Login.click();
	}
}