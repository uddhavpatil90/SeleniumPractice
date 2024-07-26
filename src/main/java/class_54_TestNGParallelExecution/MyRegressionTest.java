package class_54_TestNGParallelExecution;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.Debug;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyRegressionTest {
	
	WebDriver driver;
	
	@Test (priority = 0)
	public void NegativeLoginTesting() {
		driver=new ChromeDriver();
		System.out.println("running thread : "+Thread.currentThread().getId() + " for method NegativeLoginTesting()");

			driver.get("https://freelance-learn-automation.vercel.app/login");
			//giving negative testing
			driver.findElement(By.id("email1")).sendKeys("3452@342");
			driver.findElement(By.id("password1")).sendKeys("3452342");
			driver.findElement(By.xpath("//button[@type='submit']")).click();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			String actualResul=	driver.findElement(By.xpath("//h2[normalize-space()='Invalid Email or Password']")).getText();
			
			Assert.assertEquals(actualResul, "Invalid Email or Password");
			driver.quit();
			
	}
	
	@Test (priority = 1)
	public void SocialMediaLinksVerification() {
		driver=new ChromeDriver();
			System.out.println("running thread : "+Thread.currentThread().getId() + " for method SocialMediaLinksVerification()");
			
			driver.get("https://freelance-learn-automation.vercel.app/login");
		List<WebElement> socialmedialist=driver.findElements(By.xpath("//div[@class='social']//a[@href]"));
		
		boolean status=false;
		
		// WebElement -> getAttribute -> in String
		for(WebElement ele:socialmedialist)
		{
			String toString=ele.getAttribute("href");
			
			if(toString.contains("Mukesh"))
			{
				status=true;
				break;
			}
		}
		
		Assert.assertTrue(status);
		
		driver.quit();
	}
	

}
