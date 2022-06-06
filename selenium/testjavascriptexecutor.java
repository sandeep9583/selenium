package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testjavascriptexecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("file://C:/Selenium/WorkingWithForms.html");

		WebElement elebtn = driver.findElement(By.name("submit"));
		
		driver.findElement(By.name("txtPwd")).sendKeys("Sand123");
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("Enter password");
        driver.findElement(By.className("Format")).sendKeys("Sand1234");
        try {
			Thread.sleep(2000);
		}
		catch(InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
        System.out.println("Enter wrong password");
		
		

		js.executeScript("arguments[0].click();", elebtn);
		js.executeScript("alert('password donot match')");

		driver.switchTo().alert().accept();
		//driver.quit();


	}

}
