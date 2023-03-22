package assignments.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Alert sample1
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = driver.findElement(By.xpath("//span[contains(text(),'You')]")).getText();
		System.out.println(text);
		
		//Alert Sample 2
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		Alert prompt = driver.switchTo().alert();
		String msg= prompt.getText();
		System.out.println(msg);
		prompt.sendKeys("Testleaf");
		prompt.accept();
		String getText = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(getText);
		
		//alert sample 3
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.dismiss();
		String cancel = driver.findElement(By.xpath("//span[contains(text(),'Cancel')]")).getText();
		System.out.println(cancel);
		
		//alert sample 4
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
		String msg1 = driver.findElement(By.xpath("//p[contains(text(),'You have clicked')]")).getText();
		System.out.println(msg1);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		//alert sample 5
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		String delTxt = driver.findElement(By.xpath("//span[contains(text(),'Are you')]")).getText();
		System.out.println(delTxt);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		driver.findElement(By.name("j_idt88:j_idt111")).click();
		String msg2 = driver.findElement(By.xpath("//p[contains(text(),'Sweet Alert')]")).getText();
		System.out.println(msg2);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button']//span)[3]")).click();

		
		

		

		
		
		
		
	}

}
