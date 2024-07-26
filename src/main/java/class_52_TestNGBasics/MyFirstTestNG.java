package class_52_TestNGBasics;

import org.openqa.selenium.internal.Debug;
import org.testng.annotations.Test;

public class MyFirstTestNG {
	
	//if 2 test same priority -> execution as per alphabetical order
	@Test (priority = 0)
	public void test1() {}
	
	@Test (priority = 1)
	public void test2() {
		
	}
	

}
