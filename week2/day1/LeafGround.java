package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
		
		//Load URL
		driver.get("https://leafground.com/select.xhtml");
		
		
		//maximize the page
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		WebElement automationTool = driver.findElement(By.className("ui-selectonemenu"));
		
		Select drop1 =new Select(automationTool);
		
		drop1.selectByVisibleText("Selenium");

		

	}

}
