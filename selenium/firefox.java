package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {

	public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:/ch/geckodriver.exe");
		
        FirefoxDriver driver=new FirefoxDriver();
		String baseUrl="https://www.selenium.dev/";
		driver.get(baseUrl);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());

	}

}
