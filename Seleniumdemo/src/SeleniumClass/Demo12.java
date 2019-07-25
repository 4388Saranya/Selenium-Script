package SeleniumClass;

import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranyamadikiriMadik\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\saranyamadikiriMadik\\\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://google.com");
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		System.out.println("parent window Name--->" +parentwindow);
		WebElement button =driver.findElement(By.id("button1"));
		//To click on the button to open the child browser window three times
		 for(int i=0;i<3;i++)
		{
		Thread.sleep(1000);
		button.click();
		Thread.sleep(2000);
		}
		//This is to identify my child window
		List<String> childwindow= new ArrayList<String>(driver.getWindowHandles());
		System.out.println("parent window + Child window are --->"+childwindow);
		String lastwindow="";
		for(int i=1;i<childwindow.size();i++)
		{
		driver.switchTo().window(childwindow.get(i));
		driver.navigate().to("http://www.google.com");
		System.out.println(driver.getTitle());
		lastwindow=childwindow.get(i).toString();
		}
		driver.switchTo().window(parentwindow);
		driver.navigate().to("http://newtours.demoaut.com/");


	}

}
