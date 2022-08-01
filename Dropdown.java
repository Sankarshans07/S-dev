package Project01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanka\\OneDrive\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement element = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Denmark");
		Thread.sleep(3000);
		dropdown.selectByVisibleText("India");
		Thread.sleep(3000);
		dropdown.selectByValue("CHE");
		Thread.sleep(3000);
		dropdown.selectByIndex(0);
	}
}
