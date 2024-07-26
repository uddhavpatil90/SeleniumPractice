package class_58_Data_Driven_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Syntax {

	WebDriver driver;

	@Test(dataProvider = "testData", dataProviderClass = ClassName.class)
	public void receiveData(String username, String email, String password) {
		driver.findElement(By.xpath("")).sendKeys(username);
		driver.findElement(By.xpath("")).sendKeys(email);
		driver.findElement(By.xpath("")).sendKeys(password);
	}

	@DataProvider(name = "testData")
	public static Object[][] provideData() {
		
		Object[][] arr = new Object[2][3];

		return arr;
	}

}
