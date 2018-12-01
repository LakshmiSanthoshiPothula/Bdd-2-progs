package seleniumwddemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetText {
	 
	public static void main(String[] args) {
		
//Step-1 Launch browser
		//WebDriver driver =new FirefoxDriver(); //inbuilt
	System.setProperty("webdriver.chrome.driver", "D:\\BDD libs\\jar-files\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	//to wait till the entire page loaded  IMPLICIT WAIT
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
//Step-2 Navigate to the application
	driver.navigate().to("file:///D:/BDD%20libs/App/hotelbooking.html");//url of our application
	
//Step-3 Find that element which u want to find
     String actualHeading=driver.findElement(By.xpath("//h2")).getText();
	System.out.println(actualHeading);
	
	if(actualHeading.equals("Hotel Booking Form")) {
		System.out.println("matched //element found and matched ");
	}
	
	
	
	String attributeValue=driver.findElement(By.id("txtLastName")).getAttribute("name");
	System.out.println(attributeValue);

	
	
	driver.findElement(By.id("txtLastName")).sendKeys("naidu");
	String elementValue=driver.findElement(By.id("txtLastName")).getAttribute("value");//we will get capgemini
	System.out.println(elementValue);

	

	WebElement btnPayment = driver.findElement(By.id("btnPayment"));
       btnPayment.click();
       
      
	
       
   	//to wait till the particular element get loaded  EXPLICIT WAIT
       WebDriverWait wait = new  WebDriverWait(driver, 10);   //max time 10 seconds
       wait.until(ExpectedConditions.alertIsPresent());
       
       
	
	Alert alert=driver.switchTo().alert();
	
	System.out.println(alert.getText());   //we have do it before ok
	
	alert.accept(); //click ok

	//driver.close();
	}
}
