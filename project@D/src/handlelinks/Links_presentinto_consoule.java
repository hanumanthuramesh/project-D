package handlelinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_presentinto_consoule {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");	
		// how to capture the all links  in web page
		List <WebElement> links=driver.findElements(By.tagName("a"));
		
		// loop for the  all the links present in the counsole 
		for (int i=0;i<=links.size();i++)
		{
			              	
		System.out.println(links.get(i).getText());
		System.out.println(links.get(i).getAttribute("href"));	
		
		}
		// covred thinks are links are printed into consoule 
	}

}
