package PageBean;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PFpaymentinformation {
WebDriver driver;
	@FindBy(xpath ="/html/body/h4")
	@CacheLookup
	WebElement pftitle;
		
	@FindBy(how = How.CLASS_NAME,using="Format1")
	@CacheLookup
	WebElement pfcard;
	
	@FindBy(how = How.NAME,using="debit")
	@CacheLookup
	WebElement pfdebit;
	
	@FindBy(id="txtCvv")
	@CacheLookup
	WebElement pfcvv;
	
	@FindBy(xpath="//*[@id=\"txtMonth\"]")
	@CacheLookup
	WebElement pfmonth;
	
	@FindBy(xpath="//*[@id=\"txtYear\"]")
	@CacheLookup
	WebElement pfyear;
	
	@FindBy(xpath="//*[@id=\"btnPayment\"]")
	@CacheLookup
	WebElement pfbtn;
	
	public PFpaymentinformation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getPftitle() {		return pftitle;	}
	public void setPfcard(String card) {		pfcard.sendKeys(card);	}
	public void setPfdebit(String debit) {		pfdebit.sendKeys(debit);	}
	public void setPfcvv(String cvv) {		pfcvv.sendKeys(cvv);	}
	public void setPfmonth(String month) {		pfmonth.sendKeys(month);	}
	public void setPfyear(String year) {		pfyear.sendKeys(year);	}
	public void setPfbtn() {pfbtn.click();	}

}
