package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the Browser
				ChromeDriver driver = new ChromeDriver();
				
				//Load URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				
				//maximize the page
				driver.manage().window().maximize();
				
				//Implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				System.out.println(driver.getTitle());
				
				//get the username and password
				
		        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

				//click login
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				
				
				System.out.println(driver.getTitle());
				
				// click CRM/SFA
				driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
				
				//Click Lead and create Lead
				driver.findElement(By.xpath("//a[text()='Leads']")).click();
				//Find and enter Find leads
				driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
				
				//Enter Firstname
				driver.findElement(By.name("firstName")).sendKeys("Archana");
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Archana");

				
				//click Find Leads
				driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
				
				//clicking the first lead
				driver.findElement(By.xpath("//a[text()='15398']")).click();
				
				//Page Title
				System.out.println(driver.getTitle());
				driver.findElement(By.xpath("//a[text()='Edit']")).click();
				
				//updating company name
				driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
				driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Amazon");
				driver.findElement(By.name("submitButton")).click();
				
				//checking whether comapny is updated  correctly
				
				String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				
				if(companyName.contains("Amazon"))
					System.out.println("Company Updated Correctly");
				else
					System.out.println("Company Not Updated");
				
				
				driver.close();
				

				


	}

}
