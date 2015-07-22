package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Software_Testing {
	
	private static WebElement element = null;
	
	public static WebElement ST_Score(WebDriver driver){
		 element = driver.findElement(By.className("score"));
	     return element; 
	    }
	
	public static WebElement ST_Rating(WebDriver driver){
		 element = driver.findElement(By.xpath(".//*[@id='body-content']/div/div/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/div[1]/div/div[1]/div[2]/div"));
	     return element; 
	    }
	 
	 public static WebElement ST_ReviewsStats(WebDriver driver){
		 element = driver.findElement(By.cssSelector(".reviews-stats"));
		 return element;
	    }
}
