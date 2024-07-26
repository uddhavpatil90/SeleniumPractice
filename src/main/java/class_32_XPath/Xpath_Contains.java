package class_32_XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;

public class Xpath_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		//Absulute Xpath :
		// /html/body/div/div/div[2]/div/div[2]/form/div/input[1]
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div/input[1]")).sendKeys("Absulute@gmail.com");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div/input[1]")).clear();
		
		//CSS Selector :
		//driver.findElement(By.cssSelector("document.querySelector('/#email1/')")).sendKeys("withCSS@gmail.com");
	
		//Relative Xpath:
		// //input[@id='email1']
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("relative@gmail.com");
		driver.findElement(By.xpath("//input[@id='email1']")).clear();
				
		//Relative XPath -> contains
		
		driver.findElement(By.xpath("//input[contains(@id,'email1')]")).sendKeys("contains@gmail.com");
		
		// list of elements
		
		
		
	}

}
