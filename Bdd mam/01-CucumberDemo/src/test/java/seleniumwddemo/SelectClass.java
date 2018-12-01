package seleniumwddemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
	
	public static void main(String[] args) {
		//Step-1 Launch browser
				//WebDriver driver =new FirefoxDriver(); //inbuilt
			System.setProperty("webdriver.chrome.driver", "D:\\BDD libs\\jar-files\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			
			
			
			 //to maximiZe window before opening
			driver.manage().window().maximize(); //to maximiZe window before opening
			
			
		//Step-2 Navigate to the application
			driver.navigate().to("file:///D:/BDD%20libs/App/hotelbooking.html");//url of our application
			
			
			
			//SLECTING CITY .selectByVisibleText
			
			
	  //Step-3  identify the select element
			
			WebElement city=driver.findElement(By.name("city"));
			
			
	 //step-4 create select class for city  		
			Select selectCity =new Select(city);
			
	// step-5 select by giving your choice
		    selectCity.selectByVisibleText("Hyderabad");
		    
		 //SELECTING STATE .selectByIndex   
		    WebElement state=driver.findElement(By.name("state"));
			Select selectState =new Select(state);
		    selectState.selectByIndex(4);
		    
		    
		//SELECTING   .selectByValue
		    
		    WebElement guests=driver.findElement(By.name("persons"));
			Select selectPersons =new Select(guests);
		    selectPersons.selectByValue("6");
		    
		  
		    
		    
	}

}
