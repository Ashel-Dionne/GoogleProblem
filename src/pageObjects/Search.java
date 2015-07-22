package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
	
	private static WebElement element = null;
	 
	 public static WebElement txt_Search(WebDriver driver){
		 element = driver.findElement(By.id("gbqfq"));
	     return element; 
	    }
	 
	 public static WebElement btn_GoogleSearch(WebDriver driver){
		 element = driver.findElement(By.id("gbqfb"));
		 return element;
	    }
	 
	 public static WebElement lnk_SeeMore(WebDriver driver){
		 element = driver.findElement(By.linkText("See more"));
		 return element;
	    }
	 
	 public static WebElement lnk_SoftwareTesting(WebDriver driver){
		 element = driver.findElement(By.linkText("Software Testing Concepts"));
		 return element;
	    }
}
