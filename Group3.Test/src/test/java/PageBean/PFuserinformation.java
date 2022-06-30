package PageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PFuserinformation {

	WebDriver driver;
	
	@FindBy(xpath ="/html/body/form/table/tbody/tr[1]/td")
	@CacheLookup
	WebElement pftitle;
	
	@FindBy(id="txtName")
	@CacheLookup
	WebElement pfaname;
	
	@FindBy(id="txtFirstName")
	@CacheLookup
	WebElement pffnname;
	
	@FindBy(xpath="//*[@id=\"txtLastName\"]")
	@CacheLookup
	WebElement pflnname;
	
	@FindBy(xpath="//*[@id=\"txtFatherName\"]")
	@CacheLookup
	WebElement pfftname;
	
	@FindBy(xpath="//*[@id=\"txtDOB\"]")
	@CacheLookup
	WebElement pfdob;
	
	@FindBy(xpath="//*[@id=\"rdbMale\"]")
	@CacheLookup
	WebElement pfmale;
	
	@FindBy(xpath="//*[@id=\"rdbFemale\"]")
	@CacheLookup
	WebElement pffemale;
	
	@FindBy(xpath="//*[@id=\"txtMobileNo\"]")
	@CacheLookup
	WebElement pfmobile;
	
	@FindBy(xpath="//*[@id=\"txtEmail\"]")
	@CacheLookup
	WebElement pfemail;
	
	@FindBy(xpath="//*[@id=\"txtLndLine\"]")
	@CacheLookup
	WebElement Pflnn;
	
	@FindBy(xpath="//*[@id=\"rdbResAddress\"]")
	@CacheLookup
	WebElement Pfresidence;
	
	@FindBy(xpath="//*[@id=\"rdbOfficeAdd\"]")
	@CacheLookup
	WebElement Pfoffice;
	
	@FindBy(xpath=" //*[@id=\"txtAResidenceAdd\"]")
	@CacheLookup
	WebElement Pfra;
	
	@FindBy(xpath="//*[@id=\"btnSubmit\"]")
	@CacheLookup
	WebElement pfbtn;
	
	public PFuserinformation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getPftitle() {		return pftitle;	}
	public void setPfaname(String aname) {		pfaname.sendKeys(aname);	}
	public void setPffnname(String fnname) {		pffnname.sendKeys(fnname);	}
	public void setPflnnname(String lnname) {		pflnname.sendKeys(lnname);	}
	public void setPfftname(String ftname) {		pfftname.sendKeys(ftname);	}
	public void setPfdob(String dob) {		pfdob.sendKeys(dob);	}
	public void setPfmale() {		pfmale.click();}
	public void setPffemale() {		pffemale.click();}
	public void setpfmobile(String mobile) {		pfmobile.sendKeys(mobile);}
	public void setpfemail(String email) {		pfemail.sendKeys(email);}
	public void setPflnn(String landline) {		Pflnn.sendKeys(landline);}
	public void setPfresidence() {		Pfresidence.click();}
	public void setPfoffice() {		Pfoffice.click();}
	public void setPfra(String address) {		Pfra.sendKeys(address);}
	public void setPfbtn() {pfbtn.click();	}
}
