package Orange_HRMS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMS_emp {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanka\\OneDrive\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().deleteAllCookies();
		driver.get("https:opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
        driver.findElement(By.xpath("//b[contains(text(),'PIM')]")).click();
        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("firstName")).sendKeys("Aarav");
        driver.findElement(By.id("lastName")).sendKeys("Surya");
        driver.findElement(By.id("employeeId")).clear();
        driver.findElement(By.id("employeeId")).sendKeys("776");
        driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\sanka\\OneDrive\\Documents\\Drivers\\Emplogo.jpg");   
        driver.findElement(By.id("btnSave")).click();  
        File f1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f1, new File("C:\\Users\\sanka\\OneDrive\\Pictures\\Selenium Screenshots\\snip.png"));
        
	}

}
