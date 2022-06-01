package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class partiallink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        String baseUrl ="file://C:/Selenium/WorkingWithForms.html";
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.linkText("Click her to navigate to google page")).click();
        System.out.println("The pafe title is : "+driver.getTitle());
        driver.navigate().back();

	}

}
