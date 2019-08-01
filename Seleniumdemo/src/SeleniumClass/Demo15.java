package SeleniumClass;

import java.awt.AWTException;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo15 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranyamadikiriMadik\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\saranyamadikiriMadik\\\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://google.com");
		driver.get("https://www.toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//the below statement is to find the frames in the website and to print how many are there
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
        
		System.out.println("Number of frames in the page are --->" + frames.size());	
		 
		for(int i=0;i<frames.size();i++)
		{
        
			System.out.println(frames.get(i).getAttribute("name"));
			
	
	}
		
		driver.switchTo().frame("iframe2");// this is to switch one frame to other frame
		//driver.findElement(By.linkText("Sortable")).click();// clicked on Sortable on the switched frame. once the action in other frame is done
		//should write the below one to come out of the frame and to default one
		driver.switchTo().defaultContent();
		driver.switchTo().frame("iframe1");
		Thread.sleep(3000);
		String text=driver.findElement(By.xpath("//*[@id='primary-menu']/li[1]/a/span/span")).getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		
	

}
}
