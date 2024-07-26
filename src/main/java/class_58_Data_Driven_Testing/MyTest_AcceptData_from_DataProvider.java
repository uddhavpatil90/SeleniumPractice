package class_58_Data_Driven_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MyTest_AcceptData_from_DataProvider {

	@Test(dataProvider = "testData", dataProviderClass = MyDataProviders.class)

	public void registerUser(String name, String email, String password, String interest, String gender, String state,
			String hobbies) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://freelance-learn-automation.vercel.app/signup");

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys(name);

		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

		driver.findElement(By.xpath("//label[normalize-space()='" + interest + "']")).click();

		driver.findElement(By.xpath("//label[text()='" + gender + "']//preceding::input[1]")).click();

		Select stateDD = new Select(driver.findElement(By.id("state")));

		stateDD.selectByVisibleText(state);

		Select hobbiesDD = new Select(driver.findElement(By.xpath("//select[@id='hobbies']")));

		String[] hobbiesArray = hobbies.split(",");

		if (hobbies.length() == 1) {
			hobbiesDD.selectByVisibleText(hobbies);
		} else {
			for (String hobbiesValue : hobbiesArray) {
				hobbiesDD.selectByVisibleText(hobbiesValue);
			}
		}

		WebElement submitButton = driver.findElement(By.xpath("//button[normalize-space()='Sign up']"));

		try {
			submitButton.click();
		} catch (Exception e) {

			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].click();", submitButton);
		}

		driver.quit();

	}

}
