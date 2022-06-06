package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGAssertions {
	String a ="hello";
	@Test
	public void softAssert() {
		SoftAssert sa = new SoftAssert();
		System.out.println("softAssert Method was started");
		sa.assertEquals(a,"hi");
		System.out.println("softAssert Method was executed");
		
	}
	@Test
	public void hardAssert() {
		System.out.println("hardAssert Method was started");
		Assert.assertEquals(a,"hi");
		System.out.println("hardAssert Method was executed");
	}

}
