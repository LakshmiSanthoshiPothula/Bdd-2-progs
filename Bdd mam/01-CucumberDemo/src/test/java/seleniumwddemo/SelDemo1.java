package seleniumwddemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelDemo1 {
	public static void main(String[] args) throws InterruptedException {
		
    //Step-1 Launch browser
		//WebDriver driver =new FirefoxDriver(); //inbuilt
		
		System.setProperty("webdriver.chrome.driver", "D:\\BDD libs\\jar-files\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
   //Step-2 Navigate to the application
		driver.get("file:///D:/BDD%20libs/App/login.html");//url of our application
		
		
   //Step-3 Enter User name
		
		//driver.findElement(By.name("userName")).sendKeys("capgemini");
		WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("capgemini");
		
		
  //Step4 Enter passwords
		WebElement pass=driver.findElement(By.name("userPwd"));
		pass.clear();
	    pass.sendKeys("capg1234");
	    
	    
  //Step 5 Hit login
	    WebElement button=	driver.findElement(By.className("btn"));
	    button.click();
		
		
  //Step 6 close browser
     driver.close();
	}

}
