package SeleniumClass;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo13 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranyamadikiriMadik\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\saranyamadikiriMadik\\\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://google.com");
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
        String Title = js.executeScript("return document.title").toString();
        System.out.println(Title);
        
        //String URL=driver.getCurrentUrl();
        //system.out.println(URL);
        String URL = js.executeScript("return document.URL").toString();
        System.out.println(URL);
        //domain
        String domain = js.executeScript("return document.domain").toString();
        System.out.println(domain);
        //refresh
        //driver.navigate().refresh();
        js.executeScript("document.getElementById('txtUsername').value='Admin'");
        Thread.sleep(3000);
        js.executeScript("history.go(0)");
        js.executeScript("document.getElementById('txtUsername').value='Admin'");
       //stored element in a variable
        WebElement ele=(WebElement) js.executeScript("return document.getElementById('txtUsername')");
        //fetching the value using get attribute
        String name=ele.getAttribute("value");
        //printing
        System.out.println(name);
        js.executeScript("document.getElementById('txtPassword').value='admin123'");
        js.executeScript("document.getElementById('btnLogin').click()");
        Thread.sleep(3000);
        js.executeScript("document.getElementById('menu_pim_viewPimModule').click()");
        Thread.sleep(1000);
        js.executeScript("document.getElementById('menu_pim_viewEmployeeList').click()");
        Thread.sleep(1000);
        
        
        
        
	}

}
