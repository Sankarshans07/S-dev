package Orange_HRMS;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanka\\OneDrive\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().deleteAllCookies();
		driver.get("https:opensource-demo.orangehrmlive.com/");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[1]")).click();
		Thread.sleep(2000);
		String handles = driver.getWindowHandle();
		System.out.println(handles);
		ArrayList<String> windowhandles = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windowhandles.size());
		driver.switchTo().window(windowhandles.get(2));
	}
}
