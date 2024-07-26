package class_54_TestNGParallelExecution;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SanityChecks {


	WebDriver driver;



@Test (priority=0)
public void verifyTitle() {
	 driver=new ChromeDriver();
	System.out.println("running thread : "+Thread.currentThread().getId() + " for method NegativeLoginTesting()");
	driver.get("https://freelance-learn-automation.vercel.app/login");
	String actualTitle=driver.getTitle();
	String expectedTitle="Learn Automation Courses";
	
	Assert.assertEquals(actualTitle, expectedTitle);
	
	driver.quit();
}

@Test (priority=1)
public void verifyLoginButton() {
	
	driver=new ChromeDriver();
	System.out.println("running thread : "+Thread.currentThread().getId() + " for method verifyLoginButton");
	driver.get("https://freelance-learn-automation.vercel.app/login");
	boolean buttonEnabledCheck=	driver.findElement(By.xpath("//button[@class='submit-btn']")).isEnabled();
	
	Assert.assertEquals(buttonEnabledCheck, true);
	driver.quit();
}



}
