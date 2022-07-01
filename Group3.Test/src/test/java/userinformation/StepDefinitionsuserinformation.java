package userinformation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageBean.PFuserinformation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class StepDefinitionsuserinformation {

	private WebDriver driver;
	WebDriverWait wait;
	private PFuserinformation pfuserobj;
	@Given("user is on userinformation page")
	public void user_is_on_userinformation_page() {
		System.setProperty("webdriver.chrome.driver", "C:/QMT/chromedriver.exe");
		driver=new ChromeDriver();
		String baseUrl="file://C:/QMT/UserInformation.html";
		driver.get(baseUrl);
		pfuserobj = new PFuserinformation(driver);
	    wait = new WebDriverWait(driver, 10);
	}
	@Then("validate page title")
	public void validate_page_title() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String strheading = pfuserobj.getPftitle().getText();
		Assert.assertEquals("PERSONAL INFORMATION", strheading);
		driver.quit();
	}
	@When("user enter applicant name {string}")
	public void user_enter_applicant_name(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfuserobj.setPfaname(string);
		
	}
	@When("user enter first name {string}")
	public void user_enter_first_name(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfuserobj.setPffnname(string);
		
	}
	@When("user enter last name {string}")
	public void user_enter_last_name(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfuserobj.setPflnnname(string);
	    
	}
	@When("user enter father name {string}")
	public void user_enter_father_name(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfuserobj.setPfftname(string);
		
	}
	@When("user enter date of birth {string}")
	public void user_enter_date_of_birth(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfuserobj.setPfdob(string);
		
	}
	@When("user enter gender {string}")
	public void user_enter_gender(String string) throws InterruptedException {
		if("M".equals(string)) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			pfuserobj.setPfmale();
		}
		else if("F".equals(string)) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			pfuserobj.setPffemale();
		}
		else {System.out.println("Please enter valid Gender");}
		
	}
	@When("user enter mobile {string}")
	public void user_enter_mobile(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfuserobj.setpfmobile(string);
		
	}
	@When("user enter email {string}")
	public void user_enter_email(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfuserobj.setpfemail(string);
		
	}
	@When("user enter landline {string}")
	public void user_enter_landline(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfuserobj.setPflnn(string);
		
	} 
	@When("user enter communication {string}")
	public void user_enter_communication(String string) throws InterruptedException {
		if("Office".equals(string)) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			pfuserobj.setPfoffice();
		}
		else if("Residence".equals(string)) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			pfuserobj.setPfresidence();
		}
		else {System.out.println("Please enter valid Communication");}
		
	}
	@When("user enter residence address {string}")
	public void user_enter_residence_address(String string) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfuserobj.setPfra(string);
		
	}
	@When("user clicks the Submit btn")
	public void user_clicks_the_submit_btn() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		pfuserobj.setPfbtn();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.quit();
	}
}