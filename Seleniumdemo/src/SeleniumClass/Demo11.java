package SeleniumClass;

import java.awt.AWTException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranyamadikiriMadik\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\saranyamadikiriMadik\\\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://google.com");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
		driver.findElement(By.linkText("Gmail")).sendKeys(selectLinkOpeninNewTab);
	Thread.sleep(3000);
	ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles())	;
	System.out.println(tabs.size());
	driver.switchTo().window(tabs.get(1));
	String title=driver.getTitle();
	System.out.println(title);
	driver.switchTo().window(tabs.get(0));
	String title1=driver.getTitle();
	System.out.println(title1);
	
		
		
		
		
		
		
		
		
		/*Robot robot =new Robot();
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
	       System.out.println(title1);
	       System.out.println(title2); */
	       
	       
	        
	}

}
