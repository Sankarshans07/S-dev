package Project01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanka\\OneDrive\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().deleteAllCookies();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		driver.findElement(By.id("Password")).clear();
		driver.findElement(By.id("Password")).sendKeys("admin");		
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	    String title = driver.getTitle();
	    System.out.println(title);
	    if (driver.getTitle()==("Dashboard / nopCommerce administration")) {
	    	System.out.println("Title is macthed: "+title);
	    }
	    else {
	    	System.out.println("Tiile is noe macthed: "+title);
	    }
	}
}
