package class_25_started;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class class_25_assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		WebDriver edgeDriver=new EdgeDriver();
		
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
		if (driver.getTitle().contains("Automation"))
		{
			System.out.println("Title contains 'Automation'");
		}
		else
		{
			System.out.println("Title not contains 'Automation'");
		}
		if (driver.getCurrentUrl().contains("login"))
		{
			System.out.println("URL contains 'login'");
		}
		else
		{
			System.out.println("URL not contains 'login'");
		}
		driver.close();
		
		edgeDriver.get("https://freelance-learn-automation.vercel.app/login");
		
		if (edgeDriver.getTitle().contains("Automation"))
		{
			System.out.println("Title contains 'Automation'");
		}
		else
		{
			System.out.println("Title not contains 'Automation'");
		}
		
		if (edgeDriver.getCurrentUrl().contains("login"))
		{
			System.out.println("URL contains 'login'");
		}
		else
		{
			System.out.println("URL not contains 'login'");
		}
		edgeDriver.close();
	}
	
	
		
	}
		


