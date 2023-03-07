package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {


	public static void main(String[] args) {
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();

		//Load URL
		driver.get("https://en-gb.facebook.com/");


		//maximize the page
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//FInd and click Create New Account
		driver.findElement(By.partialLinkText("Create")).click();
		
		//Find and Enter the details
		driver.findElement(By.name("firstname")).sendKeys("Shivnarayan");
		driver.findElement(By.name("lastname")).sendKeys("Keerthivasan");
		driver.findElement(By.name("reg_email__")).sendKeys("sparkyarcs@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sparkyarcs@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("test123!");
		Select day= new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("23");
		driver.findElement(By.xpath("(//select[@id='month']/option)[8]")).click();
		Select year= new Select(driver.findElement(By.id("year")));
		year.selectByIndex(12);
		driver.findElement(By.xpath("//label[text()='Female']")).click();

	}
}
