package Project01;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanka\\OneDrive\\Documents\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[2]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"social-icons\"]/a[4]/img")).click();
		String parenthandle = driver.getWindowHandle();
	    System.out.println(parenthandle);
	    Set<String> windowhandle = driver.getWindowHandles();
	    ArrayList<String> getwindow = new ArrayList<String>(windowhandle);	   
	  //  getwindow.addAll(windowhandle); //adding tabindex to array
	    System.out.println("Numbers of tabs opened: "+getwindow.size());
	   for(String tabs:getwindow) {  
	    	/*if(!windowhandle.equals(parenthandle)) {
	    		Thread.sleep(3000);
	    	}*/
	    	System.out.println(tabs);
	    } 
	    driver.switchTo().window(getwindow.get(4));
	}

}
