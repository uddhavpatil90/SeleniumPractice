package class_29_Interact_with_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		System.out.println("application loaded successfully");
		
		WebElement id=driver.findElement(By.id("email1"));
		id.sendKeys("uddhavpatil");
		Thread.sleep(2000);
		
		id.clear();
		id.sendKeys("mahesh");
		Thread.sleep(2000);
		
		driver.quit();
		
		System.out.println("application closed successfully");
		
		
		
	}

}
