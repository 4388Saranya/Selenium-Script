package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo7 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranyamadikiriMadik\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\saranyamadikiriMadik\\\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://google.com");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		//the above line will click three times tab and enter it
	}

}
