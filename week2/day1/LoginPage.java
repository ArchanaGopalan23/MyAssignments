package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	public static void main(String[] args) {
		
		
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		//maximize the page
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		//get the username and password
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click login
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		System.out.println(driver.getTitle());
		//close the link		
		driver.close();
		
		
	}

}
