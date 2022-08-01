package Project01;

import java.time.Duration;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
   public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\sanka\\OneDrive\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().deleteAllCookies();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");   
		driver.switchTo().frame("globalSqa");
		driver.findElement(By.id("s")).sendKeys("Mobile Testing");
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[4]")).click();
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);
		ArrayList<String> windowhandles = new ArrayList<>();
		driver.switchTo().window(windowhandles.get(0));	
   }

}
