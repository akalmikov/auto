package suite;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class get_all_links {

	
	@Test
	public static void get_links(WebDriver driver){
		
	String[] links = null;
	int linksCount = 0;
	String title = null;
	int pagecount = 0;

	
	List<WebElement> linksize = driver.findElements(By.tagName("a"));{
		linksCount = linksize.size();
		System.out.println("Total no of links Available: "+linksCount);
		links= new String[linksCount];
		System.out.println("List of links Available: ");  
		// print all the links from webpage 
		for(int i=0;i<linksCount;i++)
			{
			links[i] = linksize.get(i).getAttribute("href");
			System.out.println(linksize.get(i).getAttribute("href"));
			} 
			// navigate to each Link on the webpage
		for(int i=0;i<linksCount;i++)
			{
			driver.navigate().to(links[i]);
			title = driver.getTitle();
			if (title.length()>0)
			System.out.println(links[i]+title);
			else System.out.println("Oops, SOMENTHING WENT WRONG!!");
			//get_links(driver);
			}
	}
}}
	