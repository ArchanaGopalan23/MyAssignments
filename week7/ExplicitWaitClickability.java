package assignment.week7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClickability {
public static void main(String args[]) {
	// TODO Auto-generated method stub
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.leafground.com/waits.xhtml");
			//First button clicked
			 driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
			//Wait until Click Second is enabled
			WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']")));
			driver.findElement(By.xpath("//span[text()='Click Second']")).click();
			String text2 = driver.findElement(By.xpath("//span[text()='Message 2']")).getText();
			System.out.println(text2);	
			
			
	
}
}
