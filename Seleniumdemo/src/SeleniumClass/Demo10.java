package SeleniumClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo10 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranyamadikiriMadik\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\saranyamadikiriMadik\\\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://google.com");
		driver.get("http://realestate.upskills.in/admin");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys("Admin");
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
		WebElement link=driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		Actions act=new Actions(driver);
		act.contextClick(link).build().perform();//contextClick will be useful to do right click
		Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        robot.keyPress(KeyEvent.VK_ENTER);
       Thread.sleep(3000);
       String title1=driver.getTitle();
       robot.keyPress(KeyEvent.VK_CONTROL);
       Thread.sleep(3000);
       robot.keyPress(KeyEvent.VK_TAB);
       Thread.sleep(2000);
       String title2=driver.getTitle();
       if(title1.equals(title2))
       {
    	   System.out.println("title same");
       }
       
       else
       {
    	   System.out.println("title not same");
       }
       
       
        


		

	}

}
