package Project01;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alerts {	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanka\\OneDrive\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[contains(text(),'alert box:')]")).click();
		Alert a = driver.switchTo().alert();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		a.accept();
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]")).click();
		String alerttext = driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(3000);
		a.dismiss();
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]")).click();
		a.sendKeys("Testing Alerts");
		a.accept();
		driver.get("https://www.selenium.dev/");
		Actions action1 = new Actions(driver);
		action1.scrollByAmount(0, 500).perform();
		File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("C:\\\\Users\\\\sanka\\\\OneDrive\\\\Pictures\\\\Selenium Screenshots\\\\Alerts.png"));
		
	}
}
