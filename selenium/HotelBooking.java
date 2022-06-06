package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBooking {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:/ch/chromedriver.exe");
			ChromeDriver driver= new ChromeDriver();
			String baseUrl ="file://C:/Selenium/Login.html";
			
			//1 ,2
			driver.get(baseUrl);
			driver.manage().window().maximize();
			
			//3

			String title = driver.findElement(By.xpath("/html/body/div/div[1]/h1")).getText();
			if(title=="Hotel Booking Application") {
				System.out.println("Heading is as expected");
			}
			else {
				System.out.println("Heading does not match");
			}

			//4
			driver.findElement(By.name("userName")).sendKeys("Neelima");
			driver.findElement(By.className("btn")).click();
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}


			//5
			// page refresh
			driver.navigate().refresh();
			driver.findElement(By.name("userPwd")).sendKeys("neel1234");
			driver.findElement(By.className("btn")).click();


			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

			//6
			driver.navigate().refresh();
			driver.findElement(By.name("userName")).sendKeys("Neelima");
			driver.findElement(By.name("userPwd")).sendKeys("neel1234");
			driver.findElement(By.className("btn")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

			//7
			Boolean c = driver.getPageSource().contains("Hotel Booking Form");
			if(c) {
				System.out.println("Heading is as expected");
			}
			else {
				System.out.println("Heading does not match");
			}

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

			//8
			driver.findElement(By.id("btnPayment")).click();
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

			//9
			String alertMessage;
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

			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

			
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

			//10
			driver.navigate().refresh();
			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("txtLastName")).sendKeys("padmavar");
			driver.findElement(By.id("txtEmail")).sendKeys("abc.com");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

			
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

			//11
			driver.navigate().refresh();
			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("txtLastName")).sendKeys("padmavar");
			driver.findElement(By.id("txtEmail")).sendKeys("neelima@gmail.com");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

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

			//12
			driver.navigate().refresh();
			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("txtLastName")).sendKeys("padmavar");
			driver.findElement(By.id("txtEmail")).sendKeys("neelima@gmail.com");
			driver.findElement(By.id("txtPhone")).sendKeys("628548486");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

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

			//13
			driver.navigate().refresh();
			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("txtLastName")).sendKeys("padmavar");
			driver.findElement(By.id("txtEmail")).sendKeys("neelima@gmail.com");
			driver.findElement(By.id("txtPhone")).sendKeys("9285484861");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

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

			//14
			driver.navigate().refresh();
			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("txtLastName")).sendKeys("padmavar");
			driver.findElement(By.id("txtEmail")).sendKeys("neelima@gmail.com");
			driver.findElement(By.id("txtPhone")).sendKeys("9285484861");
			Select drpcity = new Select(driver.findElement(By.name("city")));
			drpcity.selectByVisibleText("Hyderabad");
			Select drpdstate = new Select(driver.findElement(By.name("state")));
            drpdstate.selectByVisibleText("Telangana");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

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

			//15
			driver.navigate().refresh();
			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("txtLastName")).sendKeys("padmavar");
			driver.findElement(By.id("txtEmail")).sendKeys("neelima@gmail.com");
			driver.findElement(By.id("txtPhone")).sendKeys("9285484861");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

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

			//16
			driver.navigate().refresh();
			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("txtLastName")).sendKeys("padmavar");
			driver.findElement(By.id("txtEmail")).sendKeys("neelima@gmail.com");
			driver.findElement(By.id("txtPhone")).sendKeys("9285484861");
			Select drpcity1 = new Select(driver.findElement(By.name("city")));
			drpcity1.selectByVisibleText("Hyderabad");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

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

			//17
			driver.navigate().refresh();
			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("txtLastName")).sendKeys("padmavar");
			driver.findElement(By.id("txtEmail")).sendKeys("neelima@gmail.com");
			driver.findElement(By.id("txtPhone")).sendKeys("9285484861");
			Select drpcity2 = new Select(driver.findElement(By.name("city")));
			drpcity2.selectByVisibleText("Hyderabad");
			Select drpdstate2 = new Select(driver.findElement(By.name("state")));
            drpdstate2.selectByVisibleText("Telangana");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

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

			//18
			driver.navigate().refresh();
			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("txtLastName")).sendKeys("padmavar");
			driver.findElement(By.id("txtEmail")).sendKeys("neelima@gmail.com");
			driver.findElement(By.id("txtPhone")).sendKeys("9285484861");
			Select drpcity3 = new Select(driver.findElement(By.name("city")));
			drpcity3.selectByVisibleText("Hyderabad");
			Select drpdstate3 = new Select(driver.findElement(By.name("state")));
            drpdstate3.selectByVisibleText("Telangana");
			driver.findElement(By.id("txtCardholderName")).sendKeys("Neelima");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

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

			//19
			driver.navigate().refresh();
			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("txtLastName")).sendKeys("padmavar");
			driver.findElement(By.id("txtEmail")).sendKeys("neelima@gmail.com");
			driver.findElement(By.id("txtPhone")).sendKeys("9285484861");
			Select drpcity4 = new Select(driver.findElement(By.name("city")));
			drpcity4.selectByVisibleText("Hyderabad");
			Select drpdstate4 = new Select(driver.findElement(By.name("state")));
            drpdstate4.selectByVisibleText("Telangana");
			driver.findElement(By.id("txtCardholderName")).sendKeys("Neelima");
			driver.findElement(By.id("txtDebit")).sendKeys("123456789");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

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

			//20
			driver.navigate().refresh();
			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("txtLastName")).sendKeys("padmavar");
			driver.findElement(By.id("txtEmail")).sendKeys("neelima@gmail.com");
			driver.findElement(By.id("txtPhone")).sendKeys("9285484861");
			Select drpcity5 = new Select(driver.findElement(By.name("city")));
			drpcity5.selectByVisibleText("Hyderabad");
			Select drpdstate5 = new Select(driver.findElement(By.name("state")));
            drpdstate5.selectByVisibleText("Telangana");
			driver.findElement(By.id("txtCardholderName")).sendKeys("Neelima");
			driver.findElement(By.id("txtDebit")).sendKeys("123456789");
			driver.findElement(By.id("txtCvv")).sendKeys("123");
			driver.findElement(By.id("txtMonth")).sendKeys("02");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

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

			//20
			driver.navigate().refresh();
			driver.findElement(By.id("txtFirstName")).sendKeys("Neelima");
			driver.findElement(By.id("txtLastName")).sendKeys("padmavar");
			driver.findElement(By.id("txtEmail")).sendKeys("neelima@gmail.com");
			driver.findElement(By.id("txtPhone")).sendKeys("9285484861");
			Select drpcity6 = new Select(driver.findElement(By.name("city")));
			drpcity6.selectByVisibleText("Hyderabad");
			Select drpdstate6 = new Select(driver.findElement(By.name("state")));
            drpdstate6.selectByVisibleText("Telangana");
			driver.findElement(By.id("txtCardholderName")).sendKeys("Neelima");
			driver.findElement(By.id("txtDebit")).sendKeys("123456789");
			driver.findElement(By.id("txtCvv")).sendKeys("123");
			driver.findElement(By.id("txtMonth")).sendKeys("02");
			driver.findElement(By.id("txtYear")).sendKeys("2030");
			driver.findElement(By.id("btnPayment")).click();

			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ex) {
				System.out.println(ex.getMessage());
			}

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
