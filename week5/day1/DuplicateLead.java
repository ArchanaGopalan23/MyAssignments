package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DuplicateLead extends ProjectSpecificMethod{
	@Test(dataProvider = "duplicate")
	public  void runDuplicateLead(String phone) throws InterruptedException {

		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.name("submitButton")).click();
	}

	@DataProvider(name="duplicate")
	public String[][] getData() {

		String[][] data = new String [2][1];
		data[0][0] =  "99";
		data[1][0] =  "100";


		return data;

	}
}






