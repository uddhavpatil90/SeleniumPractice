package class_52_TestNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HardAssertDemo1 {
	
	
	WebDriver driver=new ChromeDriver();
	
@BeforeTest 
public void pre_requisites() {
	
	driver.get("https://freelance-learn-automation.vercel.app/login");
	driver.manage().window().maximize();
	
	
}

@Test (priority=0)
public void verifyTitle() {
	String actualTitle=driver.getTitle();
	String expectedTitle="Learn Automation Courses";
	Assert.assertEquals(actualTitle, expectedTitle);
}

@AfterTest
public void post_requisite() {
	driver.quit();
}




}
