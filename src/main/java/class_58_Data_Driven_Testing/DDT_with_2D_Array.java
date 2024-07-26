package class_58_Data_Driven_Testing;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT_with_2D_Array {

	@Test (dataProvider ="testdata")
	public void receiveData(String s1, String s2) {
		// Reporter.log(String s, boolean flag)-> used to print the messages on HTML
		// report and console
		// String s = Message which expected to be printed
		// boolean true = Means Message printed on console as well
		
		Reporter.log("Log Started", true);
		Reporter.log(s1,true);
		Reporter.log(s2,true);
			
		
	}

	@DataProvider(name="testdata")
	// 1. Declaring method with return Type = Object 2D array
	public Object[][] provideData() {

		// 2. Create Object 2D array
		Object[][] arr = new Object[3][2];

		// 3. Insert Data in 2D array
		arr[0][0] = "selenium";
		arr[0][1] = "PlayWrite";

		arr[1][0] = "Cypress";
		arr[1][1] = "C++";

		arr[2][0] = "Jenkins";
		arr[2][1] = "GitHub";

		// 4. return array
		return arr;

	}

}
