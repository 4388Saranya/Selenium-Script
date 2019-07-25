package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranyamadikiriMadik\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\saranyamadikiriMadik\\\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://google.com");
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("userName")).sendKeys("sunil");
		driver.findElement(By.name("password")).sendKeys("sunil");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.xpath("//*[contains (text(),'login')]")).click();
		Thread.sleep(3000);
		System.out.println("Login Successfully");
		//if(driver.findElement(By.xpath("//*[contains (text(),'tripType')]")).isSelected())
		
			
		
		// TODO Auto-generated method stub

	}

}
