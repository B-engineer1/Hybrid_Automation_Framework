package pageObjects;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount extends BasePage {

	public CreateAccount(WebDriver driver) {
		super(driver);
		
	}
	
	// Locators 
	@FindBy(xpath="//button[@id='onetrust-accept-btn-handler']")
	WebElement Accept_cookies;
	
	@FindBy(xpath="(//button[@class='bx-button'])[2]")
	WebElement No_thanks_btn;
	
	@FindBy(xpath="//div[@class='user nav-item']")
	WebElement Account_icon_btn;
	
	@FindBy(xpath="//a[normalize-space()='Create Account']")
	WebElement Create_Account_tab;
	
	@FindBy(id="registration-form-fname")
	WebElement F_name;
	
	@FindBy(id="registration-form-lname")
	WebElement L_name;
	
	@FindBy(xpath="//select[@id='birthmonth']")
	WebElement Birth_Month;
	
	@FindBy(xpath="//select[@id='customerbirthday']")
	WebElement Cx_Birthday;
	
	@FindBy(xpath="//select[@id='year']")
	WebElement Birth_year;
	
	@FindBy(id="registration-form-email")
	WebElement Email_1;
	
	@FindBy(id="registration-form-email-confirm")
	WebElement Conform_Email;
	
	@FindBy(id="registration-form-password")
	WebElement Password_1;
	
	@FindBy(id="registration-form-password-confirm")
	WebElement Conform_Pass;
	
	@FindBy(xpath="//button[@class='btn btn-block btn-primary myaccount-button ga4event-ecomm']")
	WebElement Create_Account;
	
	@FindBy(xpath="(//button[@tabindex='0'])[1]")
	WebElement View_Rewordsbtn;
	
	
	// Methods 
	public void Accept() 
	{
		Accept_cookies.click();
	}
	
	public void Nothanksbtn()
	{
		No_thanks_btn.click();
	}

	public void Accounticon()
	{
		Account_icon_btn.click();
	}
	public void CreateAccountTab()
	{
		Create_Account_tab.click();
	}
	public void setFname(String fname)
	{
		F_name.sendKeys(fname);
	}
	public void setLname(String lname)
	{
		L_name.sendKeys(lname);
	}
	public void setBirthMonthRandomly(int i) 
	{
	    Select select = new Select(Birth_Month);
	    // Generate random month (1 to 12)
	    int randomMonth = new Random().nextInt(12) + 1;
	    select.selectByValue(String.valueOf(randomMonth));
	}  
	public void setCxBirthdayRandomly(int i) 
	 {
	     Select select = new Select(Cx_Birthday);
	     // Generate random day (1 to 31)
	     int randomDay = new Random().nextInt(31) + 1;
	     select.selectByValue(String.valueOf(randomDay));
	 }
	public void setBirthYearRandomly(int i)
	 {
	     Select select = new Select(Birth_year);
	     // Generate random year (1900 to 2011)
	     int randomYear = new Random().nextInt(111) + 1900;
	     select.selectByValue(String.valueOf(randomYear));
	 }
	public void setEmail(String email)
	{
		Email_1.sendKeys(email);
	}
	public void setConformEmail(String conformemail)
	{
		Conform_Email.sendKeys(conformemail);
	}
	public void setPassword(String pwd)
	{
		 Password_1.sendKeys(pwd);
	}
	public void setConformPass(String conpwd)
	{
		Conform_Pass.sendKeys(conpwd);
	}
	public void clickCreateAccount()
	{
		Create_Account.click();
	}
	public void AccountCreatedSucessfully()
	{
		View_Rewordsbtn.isDisplayed();
	}
	
	}	
	
	
	


