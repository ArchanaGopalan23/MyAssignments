package assignments.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   // ChromeOptions options = new ChromeOptions();
			
			//options.addArguments("--remote-allow-origins=*");
			
			//ChromeDriver driver = new ChromeDriver(options);
			
			EdgeDriver driver = new EdgeDriver();

			
			driver.get("https://www.myntra.com/");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			Actions builder = new Actions(driver);
			
			WebElement menFashion = driver.findElement(By.xpath("(//a[@class='desktop-main'])[1]"));
			
			builder.moveToElement(menFashion).perform();
			
			driver.findElement(By.xpath("//a[text()='Jackets']")).click();
			
			//doesn't work after this step Access Denied
			
			
			
			
	}

}
