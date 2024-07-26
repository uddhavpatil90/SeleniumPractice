package class_47_SeleniumGrid_with_LambdaTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LambdaTest_Demo {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		// LambdaTest Desired Capabilities 
		
		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 11");
		browserOptions.setBrowserVersion("125");
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
		
		// creating hubURL (https://username:accessKey@hub.lambdatest.com/wd/hub)
		String huburl="https://uddhavpatil90:CBa7hLDnD32Ujp5vj6gCRYqoRPN5m8NTIc5twfipZWSju7uk6L@hub.lambdatest.com/wd/hub";
		
		//creating object of RemoteWebDriver(obj of URL class - to pass URL, browserOptions)
		WebDriver driver= new RemoteWebDriver(new URL(huburl), browserOptions);
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("Uddhav Patil");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
