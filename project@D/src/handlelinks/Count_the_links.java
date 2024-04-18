package handlelinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_the_links {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");	
		// how to capture the all links  in web page
		List <WebElement> links=driver.findElements(By.tagName("a"));
System.out.println("no of links present in is:"+links.size());
       // System.out.println(links.size());            

	}
//  coverd thinks are no of links count in web page  
	// links are diffrent from broken links
}
