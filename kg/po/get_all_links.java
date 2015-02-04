package po;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class get_all_links {
	
	public static void get_links(WebDriver driver){
		
	String[] links = null;
	int linksCount = 0;
	int linksNotMailCount = 0;
	String title = null;
		
	List<WebElement> linksize = driver.findElements(By.tagName("a"));{
		linksCount = linksize.size();
		System.out.println("Links Available: "+linksCount);
		links= new String[linksCount];
		System.out.println("List of links Available: "+links);  
		// print all the links from webpage & deleting mailto link from array and show new No of the links
		for(int i=0;i<linksCount;i++)
			{
			String linkHref = linksize.get(i).getAttribute("href");
				if(!linkHref.startsWith("mailto:"))
				{					
					links[linksNotMailCount++] = linksize.get(i).getAttribute("href");
					System.out.println(linksize.get(i).getAttribute("href"));
				}				
			}
		System.out.print("Total no of links Available: "+linksNotMailCount);
			// navigate to each Link on the webpage and verifying page loading
		for(int i=0;i<linksNotMailCount;)
			{
			driver.navigate().to(links[i]);
			title = driver.getTitle();
			if (title.length()>0)
			System.out.println(links[i]+" - "+title);
			else System.out.println("Oops, SOMENTHING WENT WRONG!!");
			break;
			}
	}
}}
	