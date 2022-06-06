package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waittillalertpresent {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Selenium/WorkingWithForms.html");
		
		driver.findElement(By.name("txtPwd")).sendKeys("123");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.className("Format")).sendKeys("1234");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.className("Format")).sendKeys(Keys.TAB);

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.alertIsPresent());

		String alert = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();

		wait.until(ExpectedConditions.elementToBeClickable(By.name("submit")));
		driver.findElement(By.id("searchButton")).click();



	}

}
