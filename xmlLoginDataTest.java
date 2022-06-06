package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class xmlLoginDataTest {
	@Test
	@Parameters({"sun","spwd"})
	public void verifyLogin(String u,String p) {
		System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file://C:/Selenium/Login.html");
        driver.findElement(By.name("userName")).sendKeys(u);
        driver.findElement(By.name("userPwd")).sendKeys(p);
        driver.findElement(By.className("btn")).click();
        driver.close();
	}

}
