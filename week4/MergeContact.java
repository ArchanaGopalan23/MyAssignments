package assignments.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) {
				
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Find the element and Enter the UserName
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		//Find the element and Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click the login button
		driver.findElement(By.className("decorativeSubmit")).click();

		//find the element and click
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("((//div[@class='x-panel-header'])/a)[3]")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//Clicking From lookup
		driver.findElement(By.xpath("(//img[contains(@src,'/images/fieldlookup.gif')])[1]")).click();
		//switch to From lookup window
		Set<String> windowHandlesFrom = driver.getWindowHandles();
		List<String> listWindowFrom=new ArrayList<String>(windowHandlesFrom);
		driver.switchTo().window(listWindowFrom.get(1));
		//confirming the title is From Lookup
		System.out.println(driver.getTitle());
		//clicking the first record
		//driver.findElement(By.linkText("Jala")).click();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		//Returning to Merge Contacts page again
		driver.switchTo().window(listWindowFrom.get(0));
		//confirming the title is Merge Contacts
		System.out.println(driver.getTitle());
		//clicking To lookup
		driver.findElement(By.xpath("(//img[contains(@src,'/images/fieldlookup.gif')])[2]")).click();
		//Switching To Lookup window
		Set<String> windowHandlesTo = driver.getWindowHandles();
		List<String> listWindowTo=new ArrayList<String>(windowHandlesTo);
		driver.switchTo().window(listWindowTo.get(1));
		//confirming the title is To Lookup
		System.out.println(driver.getTitle());
		//Clicking the second record
		//driver.findElement(By.linkText("venki")).click();
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		//Returning to Merge Contacts page again
		driver.switchTo().window(listWindowTo.get(0));
		//Confirm on Merge Window
		System.out.println(driver.getTitle());
        //click Merge button
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//Accept alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.getTitle());


		
	}

}
