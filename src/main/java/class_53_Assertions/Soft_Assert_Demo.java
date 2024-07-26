package class_53_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Demo {

	@Test
	public void withoutSoftAssert() {

		Assert.assertEquals(true, true);
		Assert.assertEquals(true, false); // terminated after test failed without SoftAssert
		Assert.assertEquals("ABCD", "ABCD");
		System.out.println("withoutSoftAssert() executed");

	}

	@Test
	public void withSoftAssert() {

		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(12, 24);
		softAssert.assertEquals(true, false); // continued to next line even if test failed
		softAssert.assertEquals("ABCD", "abcd");
		System.out.println("withSoftAssert() executed");

		softAssert.assertAll();

	}
}
