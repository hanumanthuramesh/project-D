package handlelinks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatelinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//driver.findElement(By.linkText("Best Sellers")).click();
		driver.findElement(By.partialLinkText("Sellers")).click();
		
		
		
		
		
		
		
		
		
		
		
	}
// covered thinks are the link text and partial linktext
}
