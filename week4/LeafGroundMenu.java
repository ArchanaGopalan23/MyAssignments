package assignments.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    ChromeOptions options = new ChromeOptions();
			
			options.addArguments("--remote-allow-origins=*");
			
			ChromeDriver driver = new ChromeDriver(options);
			
			driver.get("https://www.leafground.com/menu.xhtml");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			WebElement rightClick = driver.findElement(By.xpath("(//div[@class='card'])[6]/h5"));
			
			Actions builder = new Actions(driver);
			//right click
			
		     builder.contextClick(rightClick).release().perform();
			//builder.contextClick().perform();
		
			//click
			WebElement clickElement = driver.findElement(By.xpath("//span[text()='Orders']"));
			
			builder.click(clickElement).perform();

	}

}
