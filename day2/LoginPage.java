package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
public static void main(String[] args) {
		
		
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
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//click login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		
		System.out.println(driver.getTitle());
		
		// click CRM/SFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		//Click Lead and create Lead
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		//Find and enter value in name, company and source
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Archana");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Gopalan");

		//Selected Source using parent-Child xpath
		driver.findElement(By.xpath("(//select[@id='createLeadForm_dataSourceId']/option)[4]")).click();
		
		//Find and Enter the industry using advance xpath   
		driver.findElement(By.xpath("(//select[@id='createLeadForm_industryEnumId']/option)[3]")).click();
		//Find and Enter the ownership usind xpath parent-child
		driver.findElement(By.xpath("(//select[@id='createLeadForm_ownershipEnumId']/option)[2]")).click();
		
		//Find and Enter the Marketing Campaign
		WebElement mkt=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select mktdrop = new Select(mkt);
		
		//Select using index
		mktdrop.selectByIndex(2);
		
	   //clcik create Lead
		driver.findElement(By.name("submitButton")).click();
		

		
		
	}
}
