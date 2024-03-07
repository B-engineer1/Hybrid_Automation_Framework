package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
 
	 WebDriver driver;
	
	// Constructor 
	public MyAccountPage(WebDriver driver) {
		
		super(driver);	
	}
	
	// Locators
	
	@FindBy(xpath="//h2[normalize-space()='My Info']")
	WebElement headerMyinfo;
	
	@FindBy(xpath="//a[@class='account-logout-link link-secondary ga4event']")
	WebElement logoutlink;
	
	
	// Methods 
	
	public boolean isMyinfoHeaderExists()
	{
		try 
		{
			return (headerMyinfo.isDisplayed());
		} 
		catch (Exception e)
		{
			return (false);
		}
	}
	public void clickLogout()
	{
		logoutlink.click();
	}
	
	
}
