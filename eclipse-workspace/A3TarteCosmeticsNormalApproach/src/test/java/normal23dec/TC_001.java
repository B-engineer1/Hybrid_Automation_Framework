package normal23dec;// completed in 24 Dec 023

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_001 {

	public static void main(String[] args) throws InterruptedException {
		
	//WebDriver	
   	WebDriver driver = new ChromeDriver();
   	
   	// Implicate wait
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   	
   	// Launch the url and maximize the window 
    driver.get("https://tartecosmetics.com/en_IN/home/");
    driver.manage().window().maximize();
    
    // Accept pop-up
    driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    // Spin the wheel No thanks button 
    driver.findElement(By.xpath("(//button[@class='bx-button'])[2]")).click();
    // Click on profile logo button
    driver.findElement(By.xpath("//div[@class='user nav-item']")).click();
    // Email address and Password  
    driver.findElement(By.id("login-form-email")).sendKeys("abhishekw469@gmail.com");
    driver.findElement(By.id("login-form-password")).sendKeys("Abhishekw469@");
    // Click on login button 
    driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary log-in']")).click();
    Thread.sleep(2000);
    // Click on Bestseller product
    // when you found /a tag then use actions class 
    WebElement element = driver.findElement(By.xpath("//a[@href='/en_IN/best-sellers/']"));
    Actions act = new Actions(driver);
	act.click(element).build().perform();
	 Thread.sleep(2000);
    // Click on product
    driver.findElement(By.xpath("(//div[@class='product-tile'])[4]")).click();
    // Click on add to cart button 
    driver.findElement(By.xpath("(//button[@class='add-to-cart btn btn-primary ga4event-ecomm'])[1]")).click();
    Thread.sleep(1000);
    // Click on View bag button 
   	driver.findElement(By.xpath("//div[@class='default-added-to-bag-success-buttons']/a[@href='/en_IN/bag/']")).click();
   	Thread.sleep(1000);
	// Click on checkout button 
   	driver.findElement(By.xpath("//a[@class='btn btn-primary btn-block checkout-btn add-spinner ']")).click();
   	
  //The script is running successfully next step is payment method   	 
   	
   	
	}

}
