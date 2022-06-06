package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
		
		@Test
		public void verifyHomePageTitle() {
			System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
			String baseurl = "https://www.guru99.com/";
			ChromeDriver driver=new ChromeDriver();
			driver.get(baseurl);
			String expectedTitle="Meet Guru99 - Free Training";
			String actualTitle = driver.getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
			
		}
	

}
