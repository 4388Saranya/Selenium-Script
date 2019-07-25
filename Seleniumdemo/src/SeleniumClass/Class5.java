package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranyamadikiriMadik\\chromedriver.exe");
				// System.setProperty("webdriver.gecko.driver", "C:\\Users\\saranyamadikiriMadik\\\\geckodriver.exe");
				// WebDriver driver=new FirefoxDriver();
				WebDriver driver=new ChromeDriver();
			
				//driver.get("http://google.com");
				driver.get("http://elearning.upskills.in/");
				driver.manage().window().maximize();
				driver.findElement(By.id("login")).sendKeys("admin");
				System.out.println("Username entered");
				Thread.sleep(2000);
				driver.findElement(By.id("password")).sendKeys("admin@123");
				System.out.println("Password is entered");
				Thread.sleep(2000);
				driver.findElement(By.id("form-login_submitAuth")).click();
				System.out.println("Logged in successfully");
				Thread.sleep(3000);
				 driver.findElement(By.xpath("//*[@class='list-items-admin']/li[4]/a")).click();
				//driver.findElement(By.xpath("//div[@class='panel panel-default block-admin-users']//a[contains(text(),'Import users list')]")).click();
				System.out.println("Import Users Hyper link is selected");
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='user_import_import_file']")).sendKeys("C:\\Users\\saranyamadikiriMadik\\Downloads\\comment is mandatory.jpg");
				Thread.sleep(3000);
				System.out.println("Choose File is clicked and file is uploaded");
			
				Thread.sleep(3000);
				
				
				
	}

}
