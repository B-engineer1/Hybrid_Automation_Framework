package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.UserLogin;
import testBase.BaseClass;
import utlities.DataProviders;

public class TC_03_LoginDataDrivenT extends BaseClass{
	
	 @Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
		public void verify_loginDDT(String email, String password, String res)
		  {
		   logger.info("***** Startig TC_03_LoginDataDriven Test ***** ");
		   
		   try { 
		 //Login page
		   UserLogin ul = new UserLogin(driver);
		   
		   ul.Accept(); 
		   logger.info("Clicked on Accept button pop-up");
		   
		   ul.Nothanksbtn();
		   logger.info("Clicked on not today btn");
		   
		// Home Page
		   HomePage hp=new HomePage(driver);
		   
		   hp.Accounticon();
		   logger.info("Clicked on Account icon button");
           
		   hp.Email_address(email);
		   logger.info("Passed the email data");
		   
		   hp.Password(password);
		   logger.info("Passed the password");
		   
		   hp.Loginbtn();
		   logger.info("Clicked Login button");
		   
		 //My Account Page
			MyAccountPage map=new MyAccountPage(driver);
			boolean targetPage=map.isMyinfoHeaderExists();
			
			if(res.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
				//	map.clickLogout();
					Assert.assertTrue(true);
					
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(res.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
				//	map.clickLogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
			
		   }
		   
			catch(Exception e)
			{
				Assert.fail("An exception occurred: " + e.getMessage());
			}
				
			logger.info("**** Finished TC_003_LoginDDT *****");
		}
}
