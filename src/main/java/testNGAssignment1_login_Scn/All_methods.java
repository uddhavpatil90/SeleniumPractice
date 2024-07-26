package testNGAssignment1_login_Scn;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_methods {

	WebDriver driver;

	@Test
	public void pageVerification() {

		driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		String actualResult = driver.findElement(By.xpath("//h2[text()='Sign In']")).getText();
		String expectedResult = "Sign In";

		Assert.assertEquals(actualResult, expectedResult);

		driver.quit();

	}

	@Test
	public void negativeTestLoginWithoutUserPass() {
		driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.className("submit-btn")).click();
		
		String ActualResult = driver.findElement(By.xpath("//h2[@class='errorMessage']")).getText();
		String expectedResult = "Email and Password is required";

		Assert.assertEquals(ActualResult, expectedResult);

		driver.quit();
	}

	@Test
	public void negativeTestLoginWithoutPass() {
		driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("uddhav@gmail.com");
		driver.findElement(By.className("submit-btn")).click();

		String ActualResult = driver.findElement(By.xpath("//h2[@class='errorMessage']")).getText();
		String expectedResult = "Password is required";

		Assert.assertEquals(ActualResult, expectedResult);

		driver.quit();
	}

	@Test
	public void negativeTestLoginWithoutUser() {
		driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("MyPassword");
		driver.findElement(By.className("submit-btn")).click();

		String ActualResult = driver.findElement(By.xpath("//h2[@class='errorMessage']")).getText();
		String expectedResult = "Email is required";

		Assert.assertEquals(ActualResult, expectedResult);

		driver.quit();
	}

	@Test
	public void negativeTestLoginWithInvalidCreds() {
		driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("MyPassword");
		driver.findElement(By.className("submit-btn")).click();

		String ActualResult = driver.findElement(By.xpath("//h2[@class='errorMessage']")).getText();
		String expectedResult = "Email and Password Doesn't match";

		Assert.assertEquals(ActualResult, expectedResult);

		driver.quit();
	}

	@Test
	public void LoginWithValidCreds() {
		driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("admin@email.com");
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("admin@123");
		driver.findElement(By.className("submit-btn")).click();
		String ActualResult = driver.findElement(By.xpath("//h4[@class='welcomeMessage']")).getText();
		String expectedResult = "Welcome Admin Manager to Learn Automation Courses";
		Assert.assertEquals(ActualResult, expectedResult);

		driver.quit();
	}

}
