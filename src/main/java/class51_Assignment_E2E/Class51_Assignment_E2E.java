package class51_Assignment_E2E;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Class51_Assignment_E2E {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class51_Assignment_E2E obj=new Class51_Assignment_E2E();
		obj.newCategoryAddition();
		obj.newCategoryDeletion();
				
	}

	WebDriver driver ;

	public void newCategoryAddition() {

	driver= new ChromeDriver();
	driver.get("https://freelance-learn-automation.vercel.app/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.findElement(By.xpath("//img[@alt='menu']")).click();
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	
	//clicking on new user signup
	driver.findElement(By.xpath("//a[text()='New user? Signup']")).click();
	
	//checkbox count verification
	int checkboxCount=  driver.findElements(By.xpath("//input[@type='checkbox']")).size();

	//Q. how we can add assertion to verify count > 5 ?
	if (checkboxCount>5)
	{
		driver.navigate().back();
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
		//mousehover
		WebElement tempMousehoverElement= driver.findElement(By.xpath("//div[span='Manage']"));
		new Actions(driver).clickAndHold(tempMousehoverElement).perform();
		driver.findElement(By.xpath("//img[@alt='manage category']")).click();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
		//Window handle / next tab
		//driver.switchTo().newWindow(WindowType.TAB); -- Not working
	
		ArrayList<String> list1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list1.get(1));

		
		//Handle Alert - with sendKeys
		
		//driver.findElement(By.xpath("//button[text()='Add New Category ']")).click(); //No such element
		driver.findElement(By.xpath("//img[@alt='add']")).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Azur DevOps Uddhav");
		alt.accept();
		
		//Assertion - Verify DevOps in the list
		String actualResult=driver.findElement(By.xpath("//td[text()='Azur DevOps Uddhav']")).getText();
		String expectedResult="Azur DevOps Uddhav";
		//Assert.assertEquals(actualElement, "Azur DevOps Uddhav");
		
		if (actualResult.contains(expectedResult))
		{
			System.out.println("Category Added");
		}
		else
		{
			System.out.println("Category not added");
		}
		//logout 
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		driver.quit();
		
		
	}	
	else 
	{
		System.out.println("current checkbox count is not more than 5");
	}
	
	driver.quit();
	
	}

	public void newCategoryDeletion() {
		driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//img[@alt='menu']")).click();
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//clicking on new user signup
		driver.findElement(By.xpath("//a[text()='New user? Signup']")).click();
		
		String ActualResult=driver.findElement(By.xpath("//label[text()='Azur DevOps Uddhav']")).getText();
		
		System.out.println(ActualResult);
		
		String ExpectedResult="Azur DevOps Uddhav";
	
		//Q. unable to write xpath for checkbox where label=Azur DevOps Uddhav ?
				
		if (ActualResult.contains(ExpectedResult)) {
			System.out.println("Category added successfully");
		}
		else
		{
			System.out.println("Category not added");
		}
		
		//Assert.assertEquals(ActualResult, ExpectedResult);
		
		driver.navigate().back();
		
		driver.findElement(By.id("email1")).sendKeys("admin@email.com");
		driver.findElement(By.id("password1")).sendKeys("admin@123");
		driver.findElement(By.xpath("//button[@class='submit-btn']")).click();
		
		//mousehover
		WebElement tempMousehoverElement= driver.findElement(By.xpath("//div[span='Manage']"));
		new Actions(driver).clickAndHold(tempMousehoverElement).perform();
		driver.findElement(By.xpath("//img[@alt='manage category']")).click();
		
		ArrayList<String> list1=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(list1.get(1));

		//Q. element not clickable ?
		
		WebElement deleteButton=driver.findElement(By.xpath("//td[text()='Azur DevOps Uddhav']//following::button[1]"));
		
		try {
			deleteButton.click();
		} catch (Exception e) {
			
			
			
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].click();", deleteButton);
		}
		
		
		driver.findElement(By.xpath("//button[text()='Delete']")).click();
		
		//using Explicit Wait - for specific web element enabled
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		wt.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//td[text()='Azur DevOps Uddhav']"), 0));
		
		
		List<WebElement> allCategories=driver.findElements(By.xpath("//td[text()='Azur DevOps Uddhav']"));
		
		//Assertion - Verify DevOps in the list (if list.size==0 then no element -> means deleted
		
		Assert.assertTrue(allCategories.size()==0,"Expected validation failed - Record not deleted");
		
		driver.quit();
		
		}

	
	
	
	}
	

