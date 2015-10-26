package completeCode;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


abstract class Automation {
	 
	 static WebDriver driver;
		
	 static String URL = "http://google.com";
	
	 static String Title1 = "Google";
	 static String Title2 = "Google Play";
	 static String Title3 = "Testing - Google Play";
	 static String Title4 = "Software Testing Concepts - Android Apps on Google Play";
	
	 static String Test = "Testing"; 
 }
	 
	 

public class ModuleDrivenGoogle extends Automation {

	public static void startDriver() {
		driver = new FirefoxDriver();
	}


	public static void stopDriver() {
		driver.quit();
	}


	public static void openUrl() {
		driver.get(URL);
		driver.manage().window().maximize();
		Assert.assertEquals(Title1, driver.getTitle());
	}


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


	public static void googlePlay() throws InterruptedException {
		
		WebElement Gplay=driver.findElement(By.id("gb78"));
		Boolean gplay = Gplay.isDisplayed();
		Assert.assertEquals(true, gplay);
		Gplay.click();
		Thread.sleep(3000);
		Assert.assertEquals(Title2,driver.getTitle());
	}
	

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
	

	public static void selectApp() throws InterruptedException {
		
		WebElement App=driver.findElement(By.xpath("html/body/div[4]/div[6]/div[2]/div/div[1]/div/div/div[4]/div/div[2]/h2/a"));
		Boolean display = App.isDisplayed();
		Assert.assertEquals(true, display);
		App.click();
		Thread.sleep(3000);
		//Assert.assertEquals(Title4,driver.getTitle());
	}
	
	
	public static void starRating() {
		
		WebElement Star=driver.findElement(By.cssSelector(".score"));
		String Rating=Star.getText();
		System.out.println("The Current Star Rating: "+Rating);
		
		WebElement star=driver.findElement(By.cssSelector(".tiny-star.star-rating-non-editable-container"));
		String rating=star.getAttribute("aria-label");
		System.out.println(rating);
	}
	
	
	public static void reviewCount() {
		
		WebElement Review=driver.findElement(By.cssSelector(".reviews-stats"));
		String count=Review.getText();
		System.out.println("The Review Count: "+count);
	
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		startDriver();
		openUrl();
		clickGrid();
		googlePlay();
		searchText();
		selectApp();
		starRating();
		reviewCount();
		stopDriver();
	}

}
