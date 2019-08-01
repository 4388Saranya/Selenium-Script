package SeleniumClass;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo16 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranyamadikiriMadik\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\saranyamadikiriMadik\\\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://google.com");
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		//thread.sleep will wait everywhere whereever you have given, 
		//if you have given implicit wait , it will wait wheere ever it requires, which means if any element is not found then it wait for the amount of seconds given. this is applicable for all the lines in the program
		//implicit wait is not specific to any condition
		//once in the program it wil be applicable for all the lines,
		//default waiting time of selenium is 30 seconds
		//default waiting time of implicit wait is 0 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(3000);
		//explicit wait: whenever you want to apply for specific element with condition ,then we go for explicit
		WebDriverWait mywait=new WebDriverWait(driver,30);
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
	  //Fluent wait which is better than explicit wait
		// fluent is similar to explicit wait but has one feature that is we can set the Time Interval
		
		
	}

}
