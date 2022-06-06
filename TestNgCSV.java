package TestNG;

import java.io.FileReader;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import au.com.bytecode.opencsv.CSVReader;

import org.openqa.selenium.support.ui.ExpectedConditions;



public class TestNgCSV {

    WebDriver driver;
    @Test
    public  void TestExcel() throws Exception{    
        CSVReader reader = new CSVReader(new FileReader("C:/Selenium/csvdemo.csv"));
        List<String[]> records = reader.readAll();
        Iterator<String[]> iterator = records.iterator();

        while (iterator.hasNext()) {
            String[] record = iterator.next();
            String res = record[0];
            String un = record[1];
            String pwd = record[2];
            System.out.println("res = " + res+"username = "+un+"password = "+pwd);

            System.out.println("Launching Chrome browser");
            System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
            driver = new ChromeDriver();
            String baseUrl ="file://C:/Selenium/Login.html";
            driver.get(baseUrl);
            WebDriverWait wait = new WebDriverWait(driver, 10);
            driver.findElement(By.name("userName")).sendKeys(un);
			driver.findElement(By.name("userPwd")).sendKeys(pwd);
            Thread.sleep(3000);
			driver.findElement(By.className("btn")).click();
            Thread.sleep(2000);
            if(res.equals("valid")){
                wait.until(ExpectedConditions.titleIs("Hotel Booking"));
            }
            else if(res.equals("blank")){
                wait.until(ExpectedConditions.presenceOfElementLocated(By.className("errMessage")));
            }
            else{
                if(wait.until(ExpectedConditions.alertIsPresent())!=null){
                    driver.switchTo().alert().accept();
                    }
                }

            driver.close();
               
            }

        }
}
	

}
