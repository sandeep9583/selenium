package selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implictwait {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();		
        
        
		String baseUrl="https://www.wikipedia.org/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl+"/wiki/Main_Page");
		driver.findElement(By.id("searchInput")).clear();
		driver.findElement(By.id("searchInput")).sendKeys("pwc");
		driver.findElement(By.id("searchButton")).click();
		
//		String baseUrl="https://www.google.com/";
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.get(baseUrl);
//		driver.findElement(By.name("q")).sendKeys("pwc");
//		driver.findElement(By.name("btnK")).click();
	
	}

}
