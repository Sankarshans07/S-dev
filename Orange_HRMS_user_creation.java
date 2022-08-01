package Orange_HRMS;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_HRMS_user_creation {

	public static void main(String[] args) throws InterruptedException {
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
			driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("#btnAdd")).click();
			driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Aarav Surya");
			driver.findElement(By.id("systemUser_userName")).sendKeys("Aarav@emp1");
			driver.findElement(By.id("systemUser_password")).sendKeys("Aaravtest@123456");
			driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Aaravtest@123456");
			Thread.sleep(3000);
			driver.findElement(By.id("btnSave")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("searchSystemUser[userName]")).sendKeys("Aarav@emp1");
			driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Admin A");
			Thread.sleep(3000);		
			driver.findElement(By.id("searchBtn")).click();
			driver.findElement(By.linkText("Aarav@emp1")).click();
			driver.findElement(By.className("addbutton")).click();
			driver.findElement(By.id("btnSave")).click();
	}

}
