package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registration {

	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        String baseUrl ="file://C:/Selenium/WorkingWithForms.html";
        driver.get(baseUrl);
        driver.findElement(By.id("txtUserName")).sendKeys("Sandeep");
        driver.findElement(By.name("txtPwd")).sendKeys("Sand123");
        driver.findElement(By.className("Format")).sendKeys("Sand123");
//        String alertMessage = driver.switchTo().alert().getText();
//        if(alertMessage.equals("New Password created!")) {
//        	;
//        	try {
//        		System.out.println("Alert displayed");
//				Thread.sleep(2000);
//        		driver.switchTo().alert().accept();
//            	driver.findElement(By.className("Format")).clear();
//            	driver.findElement(By.className("Format")).sendKeys("Sand123");
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//        		
//        }
//        else {
//        	System.out.println("alert not displayed.Need to fix the defect");
//        }
//        
        
        driver.findElement(By.cssSelector("input.Format1")).sendKeys("Sandeep");
        driver.findElement(By.name("txtLN")).sendKeys("Bandaru");
        driver.findElement(By.cssSelector("input[value='Male']")).click();
        driver.findElement(By.name("DtOB")).sendKeys("31-05-2022");
        driver.findElement(By.id("txtAddress")).sendKeys("myhome");
        driver.findElement(By.id("txtEmail")).sendKeys("sandeep@gmail.com");
        
        Select drpcity = new Select(driver.findElement(By.name("City")));
        drpcity.selectByVisibleText("Mumbai");
        drpcity.selectByIndex(3);
        drpcity.selectByValue("Pune");
        
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[11]/td[2]/input")).sendKeys("8765325785");
        
        List <WebElement> ele =driver.findElements(By.name("chkHobbies"));
        for(WebElement eachele : ele){
        	eachele.click();
        	try {
        		Thread.sleep(500);
        	}
        	catch(InterruptedException ex) {
        		System.out.println(ex.getMessage());
        	}
        }
        
        Boolean b = driver.getPageSource().contains("Email Registration");
        if(b) {
        	System.out.println("Heading is as expected");
        }
        else {
        	System.out.println("Heading does not match");
        }
        System.out.println("Page URl is = "+driver.getCurrentUrl());
        driver.findElement(By.name("submit")).click();
        
   

	}

}
