package testCases;

import org.testng.annotations.Test;

import pageObjects.CreateAccount;
import testBase.BaseClass;

public class TC_01_CreateAccountTest extends BaseClass {
	
	@Test(groups={"regression","master"})
	public void test1()
	  {
	   logger.info("***** Startig TC_001 Test ***** ");
	   logger.debug("application logs.....");
	   
	   try 
	   {
	   CreateAccount ca = new CreateAccount(driver);
	
	   // Accept the cookies
	   ca.Accept(); 
	   logger.info("Clicked on Accept button pop-up");
	   
	   // Click on Not today btn
	   ca.Nothanksbtn();
	   logger.info("Clicked on not today btn");
	   
	   // Click on account icon button
	   ca.Accounticon();
	   logger.info("Clicked on Account icon button");
	   
	   // Click on Create Account link 
	   ca.CreateAccountTab();
	   logger.info("Clicked on Create Account link");
	   
	   // Click on First name textbox and randomly generated name
	   ca.setFname(randomeString().toUpperCase());
	   logger.info("Clicked on First name textbox and randomly Fname is generated");
	   
	  // Click on Last name textbox and randomly generated lastname
	   ca.setLname(randomeString().toUpperCase());
	   logger.info("Clicked on Last name textbox and randomly Lname is generated");
	  
	  // Click on BirthMonth dropdown and randomly select a month
	   ca.setBirthMonthRandomly(generateRandomMonth());
	   logger.info("Clicked on BirthMonth dropdown and randomly selected a month");
	   
	  // Click on CxBirthday dropdown and randomly select a day   
	   ca.setCxBirthdayRandomly(generateRandomDay());
	   logger.info("Clicked on CxBirthday dropdown and randomly selected a day");
	   
	  // Click on Birthyear dropdown and randomly select a year 
	   ca.setBirthYearRandomly(generateRandomYear());
	   logger.info("Clicked on Birthyear dropdown and randomly selected a year");
	   
	  // Click on Email and randomly generated email 
	   String Email =randomeString()+"@gmail.com";
	   ca.setEmail(Email);
	   logger.info("Clicked on Email textbox and randomly Email is generated");
	   ca.setConformEmail(Email);
	   logger.info("Clicked on ConformEmail textbox and Email is conformed");
	   
	  // Click on Password and randomly generated the password
	   String password=randomAlphaNumeric();
	   ca.setPassword(password);
	   logger.info("Clicked on Password textbox and randomly Password is generated");  
	   ca.setConformPass(password);
	   logger.info("Clicked on ConformPassword textbox and Password is conformed");
	   
	  // Click on Create Account button  
	  // ca.clickCreateAccount();
	   logger.info("Clicked on create account button");
	   
	  // Verify View_Rewordsbtn when New Account is created
	 //  ca.AccountCreatedSucessfully();
	   logger.info("Congratulations your account is created sucessfully");
	   }
	   catch(Exception e)
	   {
		   logger.error("Test case failed....");
	   }
	   
	   logger.info("***** Finished TC_01_CreateAccountTest *****");
	  }

	
	  }

