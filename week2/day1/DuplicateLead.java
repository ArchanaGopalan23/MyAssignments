package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		//to Maximize the window
		driver.manage().window().maximize();

		//first page title
		String title = driver.getTitle();//ctrl+2+l
		System.out.println(title);//print the title in console

		//Find the element and Enter the UserName
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		//Find the element and Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();

		System.out.println(driver.getTitle());

		//find the element and click
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		//click lead buttton
		driver.findElement(By.linkText("Leads")).click();

		//click CreateLead
		driver.findElement(By.linkText("Create Lead")).click();
		//Find Element Enter the FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Archana");

		//Find Element Enter the Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gopalan");
		//Enter the Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Enter the FirstName(Local) 
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Archana");
		//Enter the Department  
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		//Enter the Description  
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Testing from TestLeaf");
		//Enter the Email  
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("archanaeee@gmail.com");

		//Click Create Lead
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		
		//Click the Duplicate Button
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//To clear Company name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		//Enter new Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FreshWorks");
		//Clear the First Name 
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		//Enter new value in the FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		// Click Create Lead
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());


	}

}
