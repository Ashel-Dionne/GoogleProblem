package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google {
	
	 private static WebElement element = null;
	 
	 public static WebElement lnk_Apps(WebDriver driver){
		 element = driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a"));
	     return element; 
	    }
	 
	 public static WebElement lnk_Play(WebDriver driver){
		 element = driver.findElement(By.id("gb78"));
		 return element;
	    }
}
