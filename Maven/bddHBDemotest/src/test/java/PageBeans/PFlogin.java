package PageBeans;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PFlogin {
	WebDriver driver;
	
	@FindBy(name="userName")
	@CacheLookup
	WebElement pfuname;
	

	@FindBy(how = How.NAME,using="userPwd")
	@CacheLookup
	WebElement pfpwd;
	
	@FindBy(how = How.CLASS_NAME,using="btn")
	@CacheLookup
	WebElement pfbtn;
	
	public PFlogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	public void login(String uname,String pass) {
		
		pfuname.sendKeys(uname);
		pfpwd.sendKeys(pass);
		pfbtn.click();
	}
	public WebElement getPfuname() {		return pfuname;	}
	public void setPfuname(String uname) {		pfuname.sendKeys(uname);	}
	public WebElement getPfpwd() {		return pfpwd;	}
	public void setPfpwd(String pass) {		pfpwd.sendKeys(pass);	}
	public void setPfbtn() {		pfbtn.click();	}

}
