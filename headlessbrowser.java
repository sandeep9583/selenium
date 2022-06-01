package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class headlessbrowser {

	public static void main(String[] args) {
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("https://www.google.com/");
		System.out.println("Title of the page is -> "+driver.getTitle());
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");
		WebElement button = driver.findElement(By.name("btnK"));
		button.click();
		System.out.println("Title of the page is-> "+driver.getTitle());
		
	}

}