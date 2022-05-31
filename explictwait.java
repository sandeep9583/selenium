package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explictwait {

	public static void main(String[] args) {
		    System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
	        ChromeDriver driver=new ChromeDriver();			        
			String baseUrl="https://www.wikipedia.org/";
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(baseUrl+"/wiki/Main_Page");
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("searchInput")));
			driver.findElement(By.id("searchInput")).clear();
			driver.findElement(By.id("searchInput")).sendKeys("pwc");
			driver.findElement(By.id("searchButton")).click();

	}

}
