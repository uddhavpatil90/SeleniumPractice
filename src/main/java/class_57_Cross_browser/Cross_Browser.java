package class_57_Cross_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Cross_Browser {

	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void url_prechecks(String browser) {
		
		String lbrowser=browser;
		
		if (lbrowser.contains("chrome"))
		{
			driver= new ChromeDriver();			
		}
		else if (lbrowser.contains("edge"))
		{
			driver= new EdgeDriver();			
		}
		else if (lbrowser.contains("firefox"))
		{
			driver= new FirefoxDriver();			
		}
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().window().maximize();
		
		//SoftAssertion
		SoftAssert softAssert= new SoftAssert();
		String actual=driver.findElement(By.xpath("//h1[text()='Learn Automation Courses']")).getText();
		String expected="Learn Automation Courses";
		softAssert.assertEquals(actual,expected);
		
		softAssert.assertAll();
		
		driver.quit();
				
	}
	
	
}
