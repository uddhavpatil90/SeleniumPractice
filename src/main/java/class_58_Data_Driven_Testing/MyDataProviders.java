package class_58_Data_Driven_Testing;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;

public class MyDataProviders {

	
	@DataProvider(name="testData")
	public static Object[][] provideData(){
		
		Reporter.log("Preparing data",true);
		
		Object[][] arr=new Object[3][7];
		
		arr[0][0]="Shafiq";
		arr[0][1]="Shafiq3@gmail.com";
		arr[0][2]="Shafiq@1234";
		arr[0][3]="Selenium";
		arr[0][4]="Male";
		arr[0][5]="Goa";
		arr[0][6]="Reading,Playing";
		
		arr[1][0]="Meghna";
		arr[1][1]="Meghna3@gmail.com";
		arr[1][2]="Meghna@1234";
		arr[1][3]="Cypress";
		arr[1][4]="Female";
		arr[1][5]="Karnataka";
		arr[1][6]="Playing";
		
		arr[2][0]="Srivalli";
		arr[2][1]="Srivalli3@gmail.com";
		arr[2][2]="Srivalli@1234";
		arr[2][3]="GCP";
		arr[2][4]="Male";
		arr[2][5]="Punjab";
		arr[2][6]="Swimming";
		
		Reporter.log("Prepared Data", true);
		
		return arr;
	}
	
	
	
}
