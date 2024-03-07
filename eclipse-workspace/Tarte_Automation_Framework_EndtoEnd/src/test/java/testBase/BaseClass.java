package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;//log4j
import org.apache.logging.log4j.Logger;//log4j
import org.apache.poi.hpsf.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	static public WebDriver driver;
	public Logger logger; // global variable for log4j2
	public Properties p;
	
	@BeforeClass(groups={"sanity","regression","master"})
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException
	{
		// Loading properties file
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
		
		// Loading log4j2 file 
	    logger =LogManager.getLogger(this.getClass());
	    
	  //Launching browser based on condition  
	    switch(br.toLowerCase())
	    {
	    case "chrome":driver = new ChromeDriver();break;
	    case "edge": driver = new EdgeDriver();break;
	    default : System.out.println("No matching browser....");
	            return;
	    }
	    
		driver.manage().deleteAllCookies();// delete all cookies 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
	}
	
	@AfterClass(groups={"sanity","regression","master"})
	public void tearDown()
	{
		driver.quit();
	}
	
  // Generating random String data in Alphabetic 	
	public String randomeString()
	{
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
  // Generating random String data in Numeric 	
	public String randomeNumber()
	{
		String generatedString=RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
  // Generating random String data in AlphaNumeric
	public String randomAlphaNumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(5);
		String num=RandomStringUtils.randomNumeric(3);
		
		return (str+"@"+num);
	}
  // Generating random data for month
	public int generateRandomMonth() {
        // Generate random month (1 to 12)
        return new Random().nextInt(12) + 1;
    }
  // Generating random data for day
    public int generateRandomDay() {
        // Generate random day (1 to 28/30/31)
        return new Random().nextInt(31) + 1; // Adjust for month length accordingly
    }
 // Generating random data for year 
    public int generateRandomYear() {
        // Generate random year (1900 to 2023)
        return new Random().nextInt(111) + 1900;
    }

    public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
}
	

