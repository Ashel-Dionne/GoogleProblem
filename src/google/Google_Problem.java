package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.Google;
import pageObjects.Search;
import pageObjects.Software_Testing;



public class Google_Problem {
	
	 private static WebDriver driver = null;
	 
	 public static void main(String[] args) {
	 
	     driver = new FirefoxDriver();
	     
	     driver.get("http://www.google.com");
	     driver.manage().window().maximize();
	     
	     WebDriverWait wait=new WebDriverWait(driver,60);
	     wait.until(ExpectedConditions.titleIs("Google"));
	  
	     Google.lnk_Apps(driver).click();
	     Google.lnk_Play(driver).click();
	     wait.until(ExpectedConditions.titleIs("Google Play"));
	     
	     Search.txt_Search(driver).sendKeys(new String[]{"Testing"});
	     Search.btn_GoogleSearch(driver).click();
	     wait.until(ExpectedConditions.titleIs("Testing - Google Play"));
	     
	     //Search.lnk_SeeMore(driver).click();
	     //wait.until(ExpectedConditions.titleIs("Testing - Android Apps on Google Play"));
	     Search.lnk_SoftwareTesting(driver).click();
	     wait.until(ExpectedConditions.titleIs("Software Testing Concepts - Android Apps on Google Play"));
	     
	     System.out.println("The App Score: "+Software_Testing.ST_Score(driver).getText());
	     System.out.println("The Current Star Rating:"+Software_Testing.ST_Rating(driver).getAttribute("aria-label"));
	     System.out.println("The Review Count: "+Software_Testing.ST_ReviewsStats(driver).getText());
	    
	     driver.quit();
	 }

}