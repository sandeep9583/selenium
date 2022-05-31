package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        String alertMessage;
        driver.get("file://C:/Selenium/AlertExample.html");
        try {
        	driver.findElement(By.name("btnAlert")).click();
        	alertMessage = driver.switchTo().alert().getText();
        	Thread.sleep(1000);
        	driver.switchTo().alert().accept();
        	Thread.sleep(1000);
        	driver.close();
        	System.out.println(alertMessage);
        }
        catch(Exception e) {}
	}

}
