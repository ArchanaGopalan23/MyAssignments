package assignments.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Single Frame example
		driver.switchTo().frame(0);
		
		driver.findElement(By.id("Click")).click();
		
		String text1 = driver.findElement(By.xpath("//button[contains(text(),'Hurray')]")).getText();
		System.out.println(text1);
		//Nested Frame Example
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		driver.findElement(By.id("Click")).click();
		String text2 = driver.findElement(By.xpath("//button[contains(text(),'Hurray')]")).getText();
		System.out.println(text2);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();

		
		

		
		

	}

}
