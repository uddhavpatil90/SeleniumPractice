package class_31_Breakout;

import java.sql.Date;
import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Registration_Script {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://freelance-learn-automation.vercel.app/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("//a[text()='New user? Signup']")).click();

		// URL Verification
		String url = driver.getCurrentUrl();
		if (url.contains("signup")) {
			System.out.println("URL contains 'singup'");
		} else {
			System.out.println("URL not contains 'signup'");
		}

		// Signup Button disabled verification
		WebElement signupButton = driver.findElement(By.className("submit-btn"));

		if (signupButton.isEnabled()) {
			System.out.println("Sing-in Button is enabled - not expected");
		} else {
			System.out.println("Sign-in Button is disabled before filling form");
		}

		// Creating Random Email
		String username = "uddhav";
		String email = "uddhav+" + System.currentTimeMillis() + "@gmail.com";
		String password = "uddhav";

		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(3000);

		// selecting specific checkbox - with Label
		driver.findElement(By.xpath("//label[text()='Selenium']//preceding::input[1]")).click();

		// selecting specific Gender - with Label
		driver.findElement(By.xpath("//label[text()='Female']//preceding::input[1]")).click();
		driver.findElement(By.xpath("//label[text()='Male']//preceding::input[1]")).click();

		// Selecting State
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("Gujarat");

		// Selecting multiple options
		new Select(driver.findElement(By.id("hobbies"))).selectByVisibleText("Playing");
		new Select(driver.findElement(By.id("hobbies"))).selectByVisibleText("Swimming");

		// Addition Explicit Wait:
		// WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(5));
		// wt.until(ExpectedConditions.numberOfElementsToBe(By.className("submit-btn"),
		// 1));

		WebElement submitButton = driver.findElement(By.className("submit-btn"));
		if (submitButton.isEnabled()) {
			System.out.println("Verification Passed - Submit button Enabled successfully");

			// Clicking on Submit button with JavascriptExecutor
			try {
				submitButton.click();
			} catch (Exception e) {

				JavascriptExecutor js = (JavascriptExecutor) driver;

				js.executeScript("arguments[0].click();", submitButton);
			}

		} else {
			System.out.println("Verification Failed - Submit button not Enabled");
		}

		driver.findElement(By.id("email1")).sendKeys(email);
		driver.findElement(By.id("password1")).sendKeys(password);
		driver.findElement(By.className("submit-btn")).click();

		String welcomeMessage = driver.findElement(By.xpath("//h4[@class='welcomeMessage']")).getText();

		if (welcomeMessage.contains("Welcome " + username + " to Learn Automation Courses")) {
			System.out.println("Verification Passed - Login Successfully");
		} else {
			System.out.println("Verification Failed - Login Unsuccessful");
		}

		driver.quit();
	}
	
	
	

}
