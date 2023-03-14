package week3.day2;

import java.time.Duration;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://amazon.in");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		/*
		 * for(int i=0; i<findElements.size();i++) {
		 * System.out.println(findElements.get(i).getText()); }
		 */
		
		 Set<WebElement> set = new TreeSet<WebElement>(findElements);
		 for (WebElement webElement : set) {
			 
			 System.out.println(webElement.getText());
			
		}
	}
}


