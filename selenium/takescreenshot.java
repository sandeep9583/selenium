package selenium;

import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;


public class takescreenshot {

	public static void main(String[] args) throws InterruptedException,IOException {
		System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.guru99.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[title = 'SAP Beginner']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenShotFile, new File("/C:/Selenium/sample.png"));
		driver.quit();

	}

}
