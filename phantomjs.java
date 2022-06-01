package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class phantomjs {

	public static void main(String[] args) {
		    System.setProperty("phantomjs.binary.path", "C:/ch/phantomjs.exe");
	        WebDriver driver = new PhantomJSDriver();	
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com/");
	       

	}

}
