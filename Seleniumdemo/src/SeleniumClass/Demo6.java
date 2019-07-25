package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranyamadikiriMadik\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\saranyamadikiriMadik\\\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://google.com");
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement link=driver.findElement(By.linkText("Car Rentals"));
		System.out.println("Car Rentals location found");
		Thread.sleep(3000);
		Actions act=new Actions(driver);// Actions contain list of actions to perform keyboard actions
		Thread.sleep(3000);
		Action mouseover=act.moveToElement(link).build();//moveToElement is helpful to move to element of the link and bulid acts as compile it
		Thread.sleep(3000);
		mouseover.perform(); // perform will perform action
		System.out.println("Mouse over on the car Rentals");
		Thread.sleep(3000);
		act.sendKeys(link,(Keys.ENTER)).perform();//entering that link through keyboard, link is the location, keys.enter will perform enter from keyboard
		Thread.sleep(3000);
		System.out.println("Entered from keyboard");
		
		
		driver.close();
		
	}

	
}
