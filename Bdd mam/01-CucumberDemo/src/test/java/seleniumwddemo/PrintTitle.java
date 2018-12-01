package seleniumwddemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitle {
public static void main(String[] args) throws InterruptedException {
		
	    //Step-1 Launch browser
			//WebDriver driver =new FirefoxDriver(); //inbuilt
			
			System.setProperty("webdriver.chrome.driver", "D:\\BDD libs\\jar-files\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			
	   //Step-2 Navigate to the application
			driver.navigate().to("file:///D:/BDD%20libs/App/hotelbooking.html");//url of our application
			System.out.println(driver.getTitle());
		   System.out.println(driver.getCurrentUrl());
		   System.out.println(driver.getPageSource());
	  Thread.sleep(1000);
}

}
