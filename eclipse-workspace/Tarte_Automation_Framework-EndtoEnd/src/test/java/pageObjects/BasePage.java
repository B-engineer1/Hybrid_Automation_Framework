package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	WebDriver driver;
	
	public BasePage(WebDriver driver)// Reusable constructor for all pom class
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
	
}
