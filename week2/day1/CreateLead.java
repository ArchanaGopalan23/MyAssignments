package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		//Enter the Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");

		//Find Element Enter the FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Archana");

		//Find Element Enter the Last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gopalan");

		//Find the dropdown and select Source

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));//ctrl+2+l

		//create object for Select Class

		Select drop1=new Select(source);

		drop1.selectByVisibleText("Employee");

		//Find the dropdown and select Marketing Campaign

		WebElement mrktngCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drop2=new Select(mrktngCampaign);
		drop2.selectByValue("9001");

		//Find the dropdown and select Ownership

		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drop3=new Select(ownership);
		drop3.selectByIndex(5);

		//Find the dropdown and select Country

		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drop4=new Select(country);
		drop4.selectByVisibleText("India");
		
		
		//Click Create Lead
		driver.findElement(By.name("submitButton")).click();

		//To verify the lead created
		System.out.println(driver.getTitle());


		//close the browser
		//driver.close();

	}

}
