package class_53_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_class {

	@Test

	// Assert.assertEquals(actual,expected) -> validate all types
	// Assert.assertTrue()

	public void assertEqualsDemo() {
		System.out.println("getting started");
		String Actual = "Uddhav";
		String Expected = "Uddhav";
		Assert.assertEquals(Actual, Expected); // actual!=expected -> Failure

	}

	@Test
	public void assertTrueDemo() {

		// assertTrue will always expect true
		boolean actualStatus = true;
		Assert.assertTrue(actualStatus); // expected = true, actual=true --> Passed

	}

	@Test
	public void assertFalseDemo() {

		// assertTrue will always expect true
		boolean actualStatus = false;
		Assert.assertFalse(actualStatus, "message"); // expected = false, actual=false --> Passed

	}

}
