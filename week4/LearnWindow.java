package assignments.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		System.out.println(driver.getTitle());

	
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		ArrayList<String> windows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(windows.get(1));
		
		System.out.println("New Window name : "+driver.getTitle());
		
		driver.close();
		
		//Returning to main window
		
		driver.switchTo().window(windows.get(0));
		
		
		
		  
		 
		

		
		
		

	}

}
