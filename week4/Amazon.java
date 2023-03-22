package assignments.week4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException   {
		// TODO Auto-generated method stub
	   ChromeOptions options = new ChromeOptions();
	
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		Actions builder = new Actions(driver);
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		String mrp = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();

		System.out.println("The price of the first prod : "+mrp);
		
		String rating = driver.findElement(By.xpath("//div[@class='a-row a-size-small']/span/span")).getText();
		
		System.out.println("The customer rating : "+rating);
			
		WebElement stars = driver.findElement(By.xpath("//a[@class='a-popover-trigger a-declarative']"));
		
		builder.moveToElement(stars).click().perform();
		
		String percentage = driver.findElement(By.xpath("//td[@class='a-text-right a-nowrap']")).getText();

		System.out.println("The percentage of the five star rating: "+percentage);
		
		driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> listWindows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listWindows.get(1));
		
		WebElement constantText = driver.findElement(By.xpath("//a[@id='seeMoreDetailsLink']"));
		
		builder.scrollToElement(constantText).perform();
		
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./snap/img1.png");
		
		FileUtils.copyFile(screenshotAs, dest);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		Thread.sleep(6000);
	 
		String subTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();

     if(subTotal.contains(mrp)) {
			System.out.println(subTotal);
			System.out.println("The product price is correct");
		}else {
			System.out.println("The product price is wrong");
		}


	}

}
