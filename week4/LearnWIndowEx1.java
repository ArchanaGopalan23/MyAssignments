package assignments.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.*;

public class LearnWIndowEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		  //Finding Number of Openend Tabs
		  
		  driver.findElement(By.xpath("//span[contains(text(),'Open Multiple')]")).click();
		  
		  Set<String> windowHandles1 = driver.getWindowHandles();
		  
		  ArrayList<String> windows1 = new ArrayList<String>(windowHandles1);
		  
		  System.out.println("The number of tabs opened are : "+windows1.size());
		  
		 

	}

}
