package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();

		for(int i=0; i<=4;i++){
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			js.executeScript("window.scrollBy(0,400)");
		}

	}

}
