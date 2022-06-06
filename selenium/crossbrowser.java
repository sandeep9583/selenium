package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class crossbrowser {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		String browser = "firefox";

		if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "C:/ch/IEDriverServer.exe");
			driver = new InternetExplorerDriver();}
		else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
			driver = new ChromeDriver();}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:/ch/geckodriver.exe");
			driver = new FirefoxDriver();}
		else{
			throw new Exception("Browser is not supported");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.selenium.dev");
			

	}

}
