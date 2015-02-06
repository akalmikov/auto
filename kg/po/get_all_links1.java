package po;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.*;

//import org.openqa.selenium.firefox.*;

public class get_all_links1 {

  public static List<WebElement> findAllLinks(WebDriver driver)
  {
	  List<WebElement> elementList = new ArrayList<WebElement>();
	  elementList = driver.findElements(By.tagName("a"));
	  //elementList.addAll(driver.findElements(By.tagName("img")));
	  elementList.addAll(driver.findElements(By.tagName("link")));
	  
	  System.out.println(elementList.size());

	  List<WebElement> finalList = new ArrayList<WebElement>(); ;
	  for (WebElement element : elementList)
	  {
		  element.getAttribute("href");
		  element.getAttribute("src");
			  finalList.add(element);
		}
	  	
	  return finalList;
  }
	public static boolean isLinkBroken(URL url) throws Exception
	{
		//boolean responsem = false;
		int responsec = 0;
		//String out = "";
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		try
		{
		    connection.connect();
		    responsec = connection.getResponseCode();
		    //System.out.println(connection.getResponseCode());
		    if (responsec != 404){ 
		    	return true;}
		    //out = new StringBuilder().append(responsem).append(responsec).toString();
		    	//out= Integer.toString(responsec);
		    else {return false;}
		    
		    
		}
		catch(Exception exp)
		{
			return false;
		}
	 				
	}


	public static void main(WebDriver driver) throws Exception {
		  
		    List<WebElement> allImages = findAllLinks(driver);    
		    System.out.println("Total number of elements found " + allImages.size());
		    for( WebElement element : allImages){
		    	try
		    	{
		    		Assert.assertEquals(true, isLinkBroken(new URL(element.getAttribute("href"))));
			        System.out.println("URL: " + element.getAttribute("href")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));
		    		//System.out.println("URL: " + element.getAttribute("outerhtml")+ " returned " + isLinkBroken(new URL(element.getAttribute("href"))));
		    	}
		    	catch(Exception exp)
		    	{
		    		System.out.println("At " + element.getAttribute("innerHTML") + " Exception occured -&gt; " + exp.getMessage());	    		
		    	}
		    	
		    }
		    
	    }
	}