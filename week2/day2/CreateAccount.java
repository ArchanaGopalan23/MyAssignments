package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {


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

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// click CRM/SFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		//Click Accounts tab and then Create Account
		driver.findElement(By.xpath("//a[contains(text(),'Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		
		//Input the account name
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		
		//Description and other fields
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='officeSiteName']")).sendKeys("TestSite");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("3000000");
		driver.findElement(By.xpath("(//select[@name='industryEnumId']/option)[4]")).click();
		Select ownership= new Select(driver.findElement(By.name("ownershipEnumId")));
		ownership.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sourceDrop= new Select(source);
		sourceDrop.selectByValue("LEAD_EMPLOYEE");
		WebElement mkt = driver.findElement(By.id("marketingCampaignId"));
		Select mktDrop= new Select(mkt);
		mktDrop.selectByIndex(6);
		Select state = new Select(driver.findElement(By.id("generalStateProvinceGeoId")));
		state.selectByValue("TX");
		//click create account
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		
		
		

		
	}

}
