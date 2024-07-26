package class_52_Assignment_First_TestNG_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNGClass {

	WebDriver driver;
	
	@Test
	public void firstTestNGMethod() {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.quit();
	}
	
	
}
