package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MyAccountPage;
import pageObjects.UserLogin;
import testBase.BaseClass;

public class TC_02_LoginTest extends BaseClass {
     
	 @Test(groups={"sanity","master"})
	public void test1()
	  {
	   logger.info("***** Startig TC_001 Test ***** ");
	   logger.debug("application logs.....");
	   
	   try 
	   {
		   
	   // Login Page	   
	   UserLogin ul = new UserLogin(driver);
	   
	   // Accept the cookies
	   ul.Accept(); 
	   logger.info("Clicked on Accept button pop-up");
	   
	   // Click on Not today btn
	   ul.Nothanksbtn();
	   logger.info("Clicked on not today btn");
	   
	   // Click on account icon button
	   ul.Accounticon();
	   logger.info("Clicked on Account icon button");
	   
	   // Click on Email address field
	   logger.info("Entering valid email id....");
	   ul.Email_address(p.getProperty("email"));
	   
	   // Click on Password field
	   logger.info("Entering valid password..");
	   ul.Password(p.getProperty("password"));
	   
	   // Click on Login button
	   ul.Loginbtn();
	   logger.info("Click on login btn");
	   
	   // Checking Hey! Abhishek message
	   ul.Loginsucessful();
	   logger.info("Hey! Abhishek login is sucessful");
	  
	  // MyAccountPage
	   MyAccountPage map = new MyAccountPage(driver);
	   
	  // Verify Users Account in  MyAccountPage
	   
	   boolean targetPagetheader = map.isMyinfoHeaderExists();
	   
	   Assert.assertEquals(targetPagetheader, true,"Login failed");
	   
	   map.clickLogout();
	   logger.info("Hey! Abhishek you sucessfuly logout");
	   }
	   catch(Exception e)
	   {
		   Assert.fail();
		   logger.error("Test case failed....");
	   }
	   
	   logger.info("***** Finished TC_01_LoginTest ***** ");
	  } 
	
}
