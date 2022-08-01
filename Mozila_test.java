package Project01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mozila_test{
	
	public static void main(String[] args) throws InterruptedException {	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\sanka\\OneDrive\\Documents\\Drivers\\geckodriver.exe\\");
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	driver.manage().deleteAllCookies();
	String currenturl = driver.getCurrentUrl();
	driver.get("https:opensource-demo.orangehrmlive.com/");
	driver.findElement(By.id("txtUsername")).clear();
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.name("Submit")).click();
	WebElement element = driver.findElement(By.linkText("PIM"));
	Actions action = new Actions(driver);
	action.moveToElement(element).perform();
	Thread.sleep(2000);
	driver.findElement(By.id("menu_pim_addEmployee")).click();
	System.out.println(currenturl);
	String title = driver.getTitle();
	System.out.println(title);
	//driver.findElement(By.linkText("PIM")).click();
	//action.scrollByAmount(100,500).perform();
	//driver.switchTo().frame("Admin");
	action.scrollByAmount(200, 600).perform();
}
}