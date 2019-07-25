package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//http://newtours.demoaut.com/
		
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranyamadikiriMadik\\chromedriver.exe");
			// System.setProperty("webdriver.gecko.driver", "C:\\Users\\saranyamadikiriMadik\\\\geckodriver.exe");
			// WebDriver driver=new FirefoxDriver();
			WebDriver driver=new ChromeDriver();
			
			//driver.get("http://google.com");
			driver.get("http://newtours.demoaut.com/");
			
			driver.manage().window().maximize();
			WebElement UN=driver.findElement(By.name("userName"));
			if(UN.isEnabled())
			{
				UN.sendKeys("sunil");
				Thread.sleep(3000);
				UN.clear();
				Thread.sleep(2000);
				UN.sendKeys("sunil");
			}
			if(driver.findElement(By.name("userName")).isDisplayed())
			{
				//System.out.println(driver.findElement(By.name("userName")).getAttribute("value"));
				String name=UN.getAttribute("value");
				System.out.println("This will fetch the value of the attribute"+name);
				String name1=UN.getAttribute("name");
				driver.findElement(By.name(name1)).clear();
				Thread.sleep(2000);
				System.out.println("This will fetch the attribute name"  +name1);
				
				String type=UN.getAttribute("type");
				System.out.println(type);
				
			}
			String Label=driver.findElement(By.xpath("//*[contains(text(),'user)]")).getText();
			System.out.println(Label);
			//driver.findElement(By.name("userName")).sendKeys("sunil");
			//driver.findElement(By.name("password")).sendKeys("sunil");
			//driver.findElement(By.name("login")).click();
			
	}

}
