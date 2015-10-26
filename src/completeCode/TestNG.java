package completeCode;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

abstract class Google2{
			 static WebDriver driver;
				
			 static String URL = "http://google.com";
			
			 static String Title1 = "Google";
			 static String Title2 = "Google Play";
			 static String Title3 = "Testing - Google Play";
			 static String Title4 = "Software Testing Concepts - Android Apps on Google Play";
			
			 static String Test = "Testing"; 
		 }

	public class TestNG extends Google2{
		
		@BeforeTest
		public static void startDriver() {
			driver = new FirefoxDriver();
		}

		@AfterTest
		public static void stopDriver() {
			driver.quit();
		}

		@Test(priority=1)
		public static void openUrl() {
			driver.get(URL);
			driver.manage().window().maximize();
			Assert.assertEquals(Title1, driver.getTitle());
		}

		@Test(priority=2)
		public static void clickGrid() throws InterruptedException {
			WebElement Grid = driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a"));
			Boolean grid = Grid.isDisplayed();
			Assert.assertEquals(true, grid);
			Grid.click();
			Thread.sleep(2000);
			WebElement Modal = driver.findElement(By.xpath(".//*[@id='gbwa']/div[2]/ul[1]"));
			Boolean modal = Modal.isDisplayed();
			Assert.assertEquals(true, modal);
		}

		@Test(priority=3)
		public static void googlePlay() throws InterruptedException {
			WebElement Gplay=driver.findElement(By.id("gb78"));
			Boolean gplay = Gplay.isDisplayed();
			Assert.assertEquals(true, gplay);
			Gplay.click();
			Thread.sleep(3000);
			Assert.assertEquals(Title2,driver.getTitle());
		}
		
		@Test(priority=4)
		public static void searchText() throws InterruptedException	{
			WebElement Text=driver.findElement(By.id("gbqfq"));
			Boolean text = Text.isDisplayed();
			Assert.assertEquals(true, text);
			Text.sendKeys(new String[] {Test});
			WebElement Search=driver.findElement(By.id("gbqfb"));
			Boolean search = Search.isDisplayed();
			Assert.assertEquals(true, search);
			Search.click();
			Thread.sleep(3000);
			Assert.assertEquals(Title3,driver.getTitle());
		}
		
		@Test(priority=5)
		public static void selectApp() throws InterruptedException {
			WebElement App=driver.findElement(By.linkText("Software Testing Concepts"));
			Boolean display = App.isDisplayed();
			Assert.assertEquals(true, display);
			App.click();
			Thread.sleep(3000);
			Assert.assertEquals(Title4,driver.getTitle());
		}
		
		@Test(priority=6)
		public static void starRating() {
			WebElement Star=driver.findElement(By.cssSelector(".score"));
			String Rating=Star.getText();
			System.out.println("The Current Star Rating: "+Rating);
			WebElement star=driver.findElement(By.cssSelector(".tiny-star.star-rating-non-editable-container"));
			String rating=star.getAttribute("aria-label");
			System.out.println(rating);
		}
		
		@Test(priority=7)
		public static void reviewCount() {
			WebElement Review=driver.findElement(By.cssSelector(".reviews-stats"));
			String count=Review.getText();
			System.out.println("The Review Count: "+count);
		
		}


		

	}