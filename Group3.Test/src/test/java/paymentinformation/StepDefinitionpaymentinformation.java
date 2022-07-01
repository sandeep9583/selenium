package paymentinformation;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageBean.PFpaymentinformation;
import PageBean.PFuserinformation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionpaymentinformation {
	private WebDriver driver;
	WebDriverWait wait;
	private PFpaymentinformation pfpaymentobj;
	@Given("user is on paymentinformation page")
	public void user_is_on_paymentinformation_page() {
		System.setProperty("webdriver.chrome.driver", "C:/QMT/chromedriver.exe");
		driver=new ChromeDriver();
		String baseUrl="file://C:/QMT/PaymentDetails.html";
		driver.get(baseUrl);
		pfpaymentobj = new PFpaymentinformation(driver);
	    wait = new WebDriverWait(driver, 10);
	}
	@Then("validate page title")
	public void validate_page_title() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String strheading = pfpaymentobj.getPftitle().getText();
		Assert.assertEquals("Step 2: Payment Details", strheading);
		
		driver.quit();
		
	}
	@When("user enter card holder name {string}")
	public void user_enter_card_holder_name(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfpaymentobj.setPfcard(string);
		
	}
	@When("user enter debitcard {string}")
	public void user_enter_debitcard(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfpaymentobj.setPfdebit(string);
		
	    
	}
	@When("user enter cvv  {string}")
	public void user_enter_cvv(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfpaymentobj.setPfcvv(string);
		
	    
	}
	@When("user enter month  {string}")
	public void user_enter_month(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfpaymentobj.setPfmonth(string);
		
	}
	@When("user enter year {string}")
	public void user_enter_year(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfpaymentobj.setPfyear(string);
		
	    
	}
	@When("user clicks the Submit btn")
	public void user_clicks_the_submit_btn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfpaymentobj.setPfbtn();
		Thread.sleep(1000);
		String parentWindow = driver.getWindowHandle().toString();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.switchTo().window(parentWindow);
		Thread.sleep(1000);
		driver.quit();
	    
	}

}
