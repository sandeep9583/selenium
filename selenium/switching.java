package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class switching {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        driver.get("file://C:/Selenium/PopupWin.html");
        
        String parentWindow = driver.getWindowHandle().toString();
        driver.findElement(By.name("Open")).click();
        driver.switchTo().window("PopupWindow");
        driver.close();
        try {
    		Thread.sleep(5000);
    	}
    	catch(InterruptedException ex) {
    		System.out.println(ex.getMessage());
    	}
        
        driver.switchTo().window(parentWindow);
        driver.close();

	}

}
