package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestClick {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
		
        ChromeDriver driver=new ChromeDriver();		
		
		String baseUrl="https://www.selenium.dev/";
		
		String expectedTitle="Selenium";
		String actualTitle="";
		
		driver.get(baseUrl);
		actualTitle=driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
	//driver.close();

	}

}
