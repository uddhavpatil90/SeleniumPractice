package class_30_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		Thread.sleep(2000);

		
		//new comment added
		//added to test gitHub changes
		WebElement stateDropdown = driver.findElement(By.xpath("//select[@id='state']"));

		// Creating Object of Select Class
		Select state = new Select(stateDropdown);

		// getOptions() -> return all the WebElements
		// e.getText() -> convert WebElement to String
		List<WebElement> allStates = state.getOptions();
		for (WebElement e : allStates) {
			System.out.println(e.getText());
		}

		
		// isMultiple() -> return true/false
		System.out.println("State Dropdown multiple select  = "+state.isMultiple());
		
		// selectByIndex() -> Select the option at the given index -> not recommended
		state.selectByIndex(2);
		Thread.sleep(2000);
		
		// selectByValue() -> Select all options that have a value matching the argument
		state.selectByValue("Goa");
		Thread.sleep(2000);
		
		// selectByVisibleText -> Select all options that display text matching the argument
		state.selectByVisibleText("Bihar");
		Thread.sleep(2000);
		
		
		// MultiSelect - 
		// Note : for multi-select -> additional tag present 'multiple'
		Select hobbies=new Select(driver.findElement(By.name("hobbies")));
		
		hobbies.selectByVisibleText("Playing");
		hobbies.selectByVisibleText("Swimming");
		Thread.sleep(2000);
		
		driver.quit();
	}

}
