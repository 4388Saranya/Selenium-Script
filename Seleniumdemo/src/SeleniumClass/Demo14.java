//this program is identilfy the element in .html file and table values
package SeleniumClass;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo14 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saranyamadikiriMadik\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\saranyamadikiriMadik\\\\geckodriver.exe");
		// WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://google.com");
		driver.get("file:///C:/Users/saranyamadikiriMadik/Desktop/jank2.html");
		driver.manage().window().maximize();
		String Phonenumber=driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
        System.out.println(Phonenumber);	
        //different type of xpaths . the following one is to identify the preceding value in table. it is getting one step back value
        
       String Address=driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]//preceding-sibling::td[1]")).getText();
       System.out.println(Address); 
       //same for following which is after that value
       String Gmail=driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]//following-sibling::td")).getText();     
	  System.out.println(Gmail);
	  //similarly we can go to parent tr and then preceding and following sibling
	  //  //table/tbody/tr[2]/td[3]//parent::tr//preceding-sibling::tr[1]
	//  //table/tbody/tr[2]/td[3]//ancestor::tbody/tr/td[1]
	  //  //table/tbody/tr[2]/td[3]//parent::tr//child::td[4]
	}

}
