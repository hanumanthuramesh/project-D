package handlelinks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		// scroll script
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// Scroll Down
		js.executeScript("window.scrollBy(0,700)", "");
		// Scroll Up
        js.executeScript("window.scroll By(0,-300)", "");
       // Scroll left
        js.executeScript("window.scroll By(-600,0)", "");
       // Scroll Right
        js.executeScript("window.scroll By(600,0)", "");
        
        
        
	}
// covered thinks are scroll Up,Down,left  and Right
}