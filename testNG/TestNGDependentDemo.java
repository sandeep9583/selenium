package TestNG;

import org.testng.annotations.Test;

public class TestNGDependentDemo {
	@Test(dependsOnMethods = {"SignIn"})
	public void LogOut() {
		System.out.println("This will execute third (Log Out)");
	}
	@Test
	public void OpenBrowser() {
		System.out.println("This will execute first (Open Browser)");
	}
	
	@Test(dependsOnMethods = {"OpenBrowser"})
	public void SignIn() {
		System.out.println("This will execute second (SignIn)");
	}

}
