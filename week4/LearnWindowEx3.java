package assignments.week4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.leafground.com/window.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		//delay in opening new tabs
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> listWindows = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(listWindows.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(listWindows.get(2));
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
	}

}
