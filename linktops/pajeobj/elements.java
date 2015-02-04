package pajeobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class elements {
	
	 final WebDriver driver;
	
	 private static WebElement element = null;

	 public static WebElement login(WebDriver driver) {
		 
		 element = driver.findElement(By.xpath(".//*[@id='drop4']"));
		 return element;
	 }

	 @FindBy(how = How.XPATH, using = "html/body/div[1]/header/div/div/div/div/nav/div[2]/ul/li[2]/div/div/form/p[2]/input")
	 public WebElement uemail;
	 @FindBy(how = How.XPATH, using = "html/body/div[1]/header/div/div/div/div/nav/div[2]/ul/li[2]/div/div/form/p[2]/input")
	 public WebElement upass;
	 @FindBy(how = How.XPATH, using = ".//*[@id='loginSubmit']/span")
	 public WebElement loginbtn;
	 @FindBy(how = How.XPATH, using = "html/body/div[1]/header/div/div/div/div/nav/div[2]/ul/li[2]/a")
	 public WebElement addlinktop;
	 @FindBy(how = How.XPATH, using = ".//*[@id='videoEditor']/form/div[3]/div/textarea")
	 public WebElement addvideo;
	 @FindBy(how = How.XPATH, using = "html/body/div[1]/div[1]/div/ul/li[2]/a/span")
	 public WebElement textbtn;
	 @FindBy(how = How.XPATH, using = "html/body/div[1]/div[1]/div/ul/li[3]/a/span")
	 public WebElement iconbtn;
	 @FindBy(how = How.XPATH, using = "html/body/div[1]/div[1]/div/ul/li[4]/a/span")
	 public WebElement descbtn;
	 @FindBy(how = How.XPATH, using = ".//*[@id='save']/span")
	 public WebElement savebtn;
	 @FindBy(how = How.XPATH, using = ".//*[@id='labelModal']/div/div/div[2]/form/div[2]/div[1]/div/div[1]/input")
	 public WebElement btnname;
	 @FindBy(how = How.XPATH, using = ".//*[@id='labelModal']/div/div/div[2]/form/div[2]/div[1]/div/div[2]/input")
	 public WebElement btnlink;
	 @FindBy(how = How.XPATH, using = ".//*[@id='labelModal']/div/div/div[2]/form/div[3]/a/span")
	 public WebElement addnewbtn;
	 @FindBy(how = How.XPATH, using = ".//*[@id='labelModal']/div/div/div[2]/form/div[2]/div[2]/div/div[1]/input")
	 public WebElement btnname2;
	 @FindBy(how = How.XPATH, using = ".//*[@id='labelModal']/div/div/div[2]/form/div[2]/div[2]/div/div[2]/input")
	 public WebElement btnlink2;
	 @FindBy(how = How.XPATH, using = ".//*[@id='labelModal']/div/div/div[2]/form/div[4]/div/div[2]/a/span")
	 public WebElement savenewbtn;
	 @FindBy(how = How.XPATH, using = ".//*[@id='labelModal']/div/div/div[2]/form/div[4]/div/div[1]/a/span")
	 public WebElement cancelnewbtn;
	 @FindBy(how = How.XPATH, using = ".//*[@id='labelModal']/div/div/div[2]/form/div[2]/div[2]/a/i")
	 public WebElement delnewbtn;
	 @FindBy(how = How.XPATH, using = ".//*[@id='addBtnModal']/div/div/div[2]/form/div[2]/div[1]/div/div[1]/input")
	 public WebElement addnewlink;
	 @FindBy(how = How.XPATH, using = ".//*[@id='addBtnModal']/div/div/div[2]/form/div[4]/div/div[2]/a/span")
	 public WebElement savenewlink;
	 @FindBy(how = How.XPATH, using = ".//*[@id='descriptionModal']/div/div/div[2]/div/form/input[2]")
	 public WebElement desctitle;
	 @FindBy(how = How.XPATH, using = ".//*[@id='descriptionModal']/div/div/div[2]/div/form/div[1]/select/option[17]")
	 public WebElement desccategory;
	 @FindBy(how = How.XPATH, using = ".//*[@id='descriptionModal']/div/div/div[2]/div/form/textarea")
	 public WebElement descdesc;
	 @FindBy(how = How.XPATH, using = ".//*[@id='descriptionModal']/div/div/div[2]/div/form/div[2]/div[2]/a/span")
	 public WebElement descsave;
	 
	 public elements(WebDriver driver){ 

			this.driver = driver; 

	    	} 
		
	 public void LogIn_Action(String usremail, String upasswd){
		 
	        uemail.sendKeys(usremail);
	        upass.sendKeys(upasswd);
	        loginbtn.click();
	 }
	 l
}
