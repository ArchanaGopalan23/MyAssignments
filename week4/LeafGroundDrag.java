package assignments.week4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LeafGroundDrag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.leafground.com/drag.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement obj = driver.findElement(By.xpath("//div[@id='form:conpnl_content']"));
		
		
		System.out.println(obj.getLocation().getX());
		
		System.out.println(obj.getLocation().getY());
		
		Actions builder =new Actions(driver);
		builder.dragAndDropBy(obj, 100, 100).perform();
		
		System.out.println(obj.getLocation().getX());
		
		System.out.println(obj.getLocation().getY());
		
		WebElement source = driver.findElement(By.id("form:drag_content"));
        WebElement dest = driver.findElement(By.id("form:drop_content"));
        
        builder.dragAndDrop(source, dest).perform();
		System.out.println(dest.getCssValue("background-color"));

		
		
		


	}

}
