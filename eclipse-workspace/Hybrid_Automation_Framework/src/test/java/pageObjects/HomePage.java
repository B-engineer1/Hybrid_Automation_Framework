package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	WebDriver driver;
	 
	// Constructor 
	public HomePage(WebDriver driver) {
		
		super(driver);
	}

	// Locators 
	
	@FindBy(xpath="//a[@aria-label='Login to your account']")
	WebElement Account_icon_btn;
	
	@FindBy(id="login-form-email")
	WebElement Emali_address;
	
	@FindBy(id="login-form-password")
	WebElement Password;
	
	@FindBy(xpath="//button[@class='btn btn-block btn-primary log-in']")
	WebElement Login_btn;
	
	@FindBy(xpath="(//div[@class='yotpo-inner-text'])[1]")
	WebElement Login_sucessful;
	
	
    // Methods 
	
	public void Accounticon()
	{
		Account_icon_btn.click();
		
	}
	
	public void Email_address(String email)
	{
		Emali_address.sendKeys(email);
	}
	
	public void Password(String password)
	{
		Password.sendKeys(password);
	}
	
	public void Loginbtn()
	{
		Login_btn.click();
	}
	public void Loginsucessful()
	{
		Login_sucessful.isDisplayed();
	}
	
	
}
