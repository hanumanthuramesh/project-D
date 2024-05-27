package handlelinks;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Brokenlinks {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.Driver", "C:\\Users\\USER\\Downloads\\Tools\\updated tools file\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe\\");	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		List <WebElement>links= driver.findElements(By.tagName("a"));
		
		//no of links count
		 System.out.println(links.size());	
		for(int i=0;i<links.size();i++)
		{
			// by using href element find the required links
			
			   WebElement element=links.get(i);
			   String url=element.getAttribute("href");
			   
			URL link=new URL(url);
			// use thi below obj for coonecting brower get error statsu code
			HttpURLConnection  httpcon =(HttpURLConnection)link.openConnection();
			//Thread .sleep(3000);
			httpcon.connect();
			// now we capture the response code
			      int rescode=httpcon.getResponseCode();// code should be above >=400 than ots brokenlink
			if (rescode>=400) 
			{
				System.out.println(url+" "+ "is broken link"  );
			}
			else 
			{
				System.out.println(url+" "+ "is valid  link"  );
			}
			
		}	
			
			
		
	}
 
}
//covered thinks are the find broken links ,valid links as well and print it
