package class_57_Cross_browser;

import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Cross_Browser_with_parallel_Threads {

	

	@Test
	@Parameters({"browser","os","version"})
	
	public void url_prechecks(String browser, String os, String version) {
		
		
		if (browser.contains("chrome"))
		{
			ChromeOptions browserOptions = new ChromeOptions();
			browserOptions.setPlatformName(os);
			browserOptions.setBrowserVersion(version);
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "uddhavpatil90");
			ltOptions.put("accessKey", "CBa7hLDnD32Ujp5vj6gCRYqoRPN5m8NTIc5twfipZWSju7uk6L");
			ltOptions.put("video", true);
			ltOptions.put("resolution", "1920x1080");
			ltOptions.put("build", "Automated Test");
			ltOptions.put("project", "Freelance Application");
			ltOptions.put("name", "MyConfig");
			ltOptions.put("w3c", true);
			browserOptions.setCapability("LT:Options", ltOptions);	
		}
		else if (browser.contains("edge"))
		{
			EdgeOptions browserOptions = new EdgeOptions();
			browserOptions.setPlatformName(os);
			browserOptions.setBrowserVersion(version);
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "uddhavpatil90");
			ltOptions.put("accessKey", "CBa7hLDnD32Ujp5vj6gCRYqoRPN5m8NTIc5twfipZWSju7uk6L");
			ltOptions.put("video", true);
			ltOptions.put("resolution", "1920x1080");
			ltOptions.put("build", "Automated Test");
			ltOptions.put("project", "Freelance Application");
			ltOptions.put("name", "MyConfig");
			ltOptions.put("w3c", true);
			browserOptions.setCapability("LT:Options", ltOptions);
		}
		else if (browser.contains("firefox"))
		{
			FirefoxOptions browserOptions = new FirefoxOptions();
			browserOptions.setPlatformName(os);
			browserOptions.setBrowserVersion(version);
			HashMap<String, Object> ltOptions = new HashMap<String, Object>();
			ltOptions.put("username", "uddhavpatil90");
			ltOptions.put("accessKey", "CBa7hLDnD32Ujp5vj6gCRYqoRPN5m8NTIc5twfipZWSju7uk6L");
			ltOptions.put("video", true);
			ltOptions.put("resolution", "1920x1080");
			ltOptions.put("build", "Automated Test");
			ltOptions.put("project", "Freelance Application");
			ltOptions.put("name", "MyConfig");
			ltOptions.put("w3c", true);
			browserOptions.setCapability("LT:Options", ltOptions);
			
		}
		else if (browser.contains("safari"))
		{
			SafariOptions browserOptions = new SafariOptions();
		}
		
		//code for Grid
		
		
		
		// creating hubURL (https://username:accessKey@hub.lambdatest.com/wd/hub)
		String huburl="https://uddhavpatil90:CBa7hLDnD32Ujp5vj6gCRYqoRPN5m8NTIc5twfipZWSju7uk6L@hub.lambdatest.com/wd/hub";
		
		//creating object of RemoteWebDriver(obj of URL class - to pass URL, browserOptions)
		WebDriver driver= new RemoteWebDriver(new URL(huburl), browserOptions);
		// Q. Need to put browserOptions in if else ?
		
		
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
