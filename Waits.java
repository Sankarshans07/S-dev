package Project01;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sanka\\OneDrive\\Documents\\Drivers\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://opensource-demo.orangehrmlive.com/'");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
			driver.findElement(By.id("txtUsername")).clear();
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).clear();
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			// Explicit wait 
		   WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(60));
			waits.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='btnLogin']")));
		   driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			//Implicit wait
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		    //Fluent wait
		   FluentWait<WebDriver> fwaits = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(5)).ignoring(Exception.class);
		   WebElement Leavelist = fwaits.until(ExpectedConditions.elementToBeClickable(By.xpath("//tbody/tr[1]/td[2]/div[1]/a[1]/img[1]")));
		    Leavelist.click();
		    System.out.println("Leavelist clicked");
		   
 	    
		    /*clickon(driver, driver.findElement(By.xpath("//input[@id='btnLogin']")), Duration.ofSeconds(60));
	}	
	public static void clickon(WebDriver driver,WebElement locator,Duration timeout) {
		new WebDriverWait(driver, timeout).ignoring(Exception.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();*/
		    
		 	}
}
