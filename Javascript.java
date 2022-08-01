package Project01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sanka\\OneDrive\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.findElement(By.id("txtUsername")).clear();
		WebElement username = driver.findElement(By.id("txtUsername"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].value='Admin';", username);	
		driver.findElement(By.id("txtPassword")).clear();
		WebElement password = driver.findElement(By.id("txtPassword"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].value='admin123';", password);
		WebElement login = driver.findElement(By.id("btnLogin"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", login);
		driver.findElement(By.linkText("PIM")).click();
		WebElement lastpage = driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].scrollIntoView(true);", lastpage);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-1500);");
		
	}
}
