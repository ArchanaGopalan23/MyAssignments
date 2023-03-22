package assignments.week4;

import java.lang.module.FindException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.nykaa.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions builder = new Actions(driver);
		
		WebElement brands = driver.findElement(By.linkText("Brands"));
		
		builder.moveToElement(brands).perform();
		
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click(); 
		
	//	driver.findElement(By.xpath("(//div[@class='control-indicator radio'])[3]")).click();
		
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		
		driver.findElement(By.xpath("//div[@id='first-filter']/div")).click();
		Thread.sleep(1000);

	    driver.findElement(By.xpath("(//li[@class='css-1do4irw'])[1]")).click();
    
	    driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
	  	driver.findElement(By.xpath("//span[contains(text(),'Shampoo')]")).click();

        driver.findElement(By.xpath("//span[text()='Concern']")).click();
        
        driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
        
        String filter1 = driver.findElement(By.xpath("(//span[@class='filter-value'])[1]")).getText();
        
        String filter2 =driver.findElement(By.xpath("(//span[@class='filter-value'])[2]")).getText();
        
        
        System.out.println("Filters are: "+filter1+ ", "+filter2);
        
        driver.findElement(By.xpath("//div[contains(text(),'Paris Colour ')]")).click();
        
        Set<String> windowHandles = driver.getWindowHandles();
        
		List<String> listWindow=new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listWindow.get(1));

        driver.findElement(By.xpath("//span[text()='180ml']")).click();
        
        String mrp= driver.findElement(By.xpath("(//div[@class='css-1d0jf8e'])[2]")).getText();
        System.out.println(mrp);
        
        driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();

        driver.findElement(By.xpath("//span[@class='cart-count']")).click();
        
        driver.switchTo().frame(0);
                
        String grandTotal= driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();

        System.out.println("The grand Total is: "+grandTotal);
        
        driver.findElement(By.xpath("//span[text()='Proceed']")).click();
        
        Set<String> windowHandles1 = driver.getWindowHandles();
        
		List<String> listWindow1=new ArrayList<String>(windowHandles1);
		
		driver.switchTo().window(listWindow1.get(1));
		
        driver.findElement(By.xpath("//input[@class='input text-center login-input']")).click();

	    driver.findElement(By.name("emailMobile")).sendKeys("9940134276");
	    
	    driver.findElement(By.id("submitVerification")).click();
	    
	    //I was not able to receive the OTP as my Indian SIM is not working so am not proceeding with rest of the steps

	     //closing all the windows
         driver.quit();
     
     
        

        
      

        

        

		
		
		
		
		
	
		

	}

}
