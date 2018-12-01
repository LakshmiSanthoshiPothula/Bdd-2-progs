package seleniumwddemo;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HotelBookingTest {
	static WebDriver driver;
    @BeforeClass
    public static void  start() {

		System.setProperty("webdriver.chrome.driver", "D:\\BDD libs\\jar-files\\chromedriver.exe");
		 driver =new ChromeDriver();
		 driver.get("file:///D:/BDD%20libs/App/hotelbooking.html");
				
    }
    @AfterClass
    public static void stop() {
     //driver.close();
    }
	
	
	@Test
	public void testAfirstname() {
		
		WebElement firstname=driver.findElement(By.name("txtFN"));
		firstname.sendKeys("Santhoshi");

}

	@Test
	public void testBlastname() {
		
		WebElement lastname=driver.findElement(By.name("txtLN"));
		lastname.sendKeys("Sunaina");
		
}
	
	@Test
	public void testCEmail() {
		
		WebElement Email=driver.findElement(By.name("Email"));
		Email.sendKeys("santhu@gmail.com");
}
	
	@Test
	public void testDPhone() {
		

		WebElement Phone=driver.findElement(By.name("Phone"));
		Phone.sendKeys("9505815715");
}
	
	@Test
	public void testEaddress() {
		
		WebElement address=driver.findElement(By.xpath("//textarea[@rows='5']"));
		address.sendKeys("Sipcot IT park,Chennai");

}
	
	
	@Test
	public void testFcity() {

		WebElement city=driver.findElement(By.xpath("//option[@value='Pune']"));
		city.click();
		
}
	
	@Test
	public void testGstate() {

		WebElement state=driver.findElement(By.xpath("//option[@value='Maharashtra']"));
		state.click();
}
	
	@Test
	public void testHrooms() {
		
		WebElement rooms=driver.findElement(By.xpath("//option[@value='6']"));
		rooms.click();

}
	

	@Test
	public void testIcardHolderName() {
		

		   WebElement cardHolderName= driver.findElement(By.id("txtCardholderName"));
	      
	       cardHolderName.sendKeys("Santhu");

}
	
	@Test
	public void testJdebit() {
		
		 WebElement debit = driver.findElement(By.name("debit"));
	      
	       debit.sendKeys("6483930475");
}
	
	@Test
	public void testKcvv() {
		

	       WebElement cvv = driver.findElement(By.name("cvv"));
	      
	       cvv.sendKeys("6949465756");

}

	@Test
	public void testLmonth() {
		

	       WebElement month = driver.findElement(By.name("month"));
	     
	       month.sendKeys("October");
	       

}
	
	@Test
	public void testMyear() throws InterruptedException {
		

	       WebElement year = driver.findElement(By.name("year"));
	      
	       year.sendKeys("2018");
	       Thread.sleep(1000);
}

	

	@Test
	public void testNbtnPayment() {
		

		WebElement btnPayment = driver.findElement(By.id("btnPayment"));
	       btnPayment.click();
}

}
