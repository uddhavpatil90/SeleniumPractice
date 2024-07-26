package class_25_started;

import org.openqa.selenium.chrome.ChromeDriver;

public class Open_URL {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().forward();
		
		System.out.println("program ended successfully");

	}

}
