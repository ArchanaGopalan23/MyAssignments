package assignments.week4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;


public class Jquery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//into frame of droppable
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement dest = driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
		
		//use of Actions class 
		Actions builder =new Actions(driver);
		
		//droppable
		builder.dragAndDrop(source, dest).perform();
		System.out.println(dest.getCssValue("background-color"));
		//coming out of frame
		driver.switchTo().defaultContent();

		//Selectable
		driver.findElement(By.linkText("Selectable")).click();
		//into frame
		driver.switchTo().frame(0);
		WebElement item1 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[2]"));
		WebElement item6 = driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[6]"));
		//click and hold
		builder.clickAndHold(item1).clickAndHold(item6).release().perform();
		//coming out of frame
		driver.switchTo().defaultContent();
		
		//sortable
		driver.findElement(By.linkText("Sortable")).click();
		//into frame
		driver.switchTo().frame(0);
		WebElement item3 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[3]"));
		WebElement item5 = driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[5]"));
		builder.click(item3).clickAndHold().moveToElement(item5).moveByOffset(0, 10).release().perform();
		

		
		
	}

}
