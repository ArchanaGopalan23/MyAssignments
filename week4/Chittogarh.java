package assignments.week4;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chittogarh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.chittorgarh.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.id("navbtn_stockmarket")).click();
		
		driver.findElement(By.xpath("(//a[text()='NSE Bulk Deals'])[1]")).click();
		
		WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));
        
        System.out.println(rows.size());
        Set<String> securityNamesSet = new HashSet<String>();
		for (int i = 2; i < rows.size(); i++) {
			String text = driver.findElement(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr["+i+"]/td[1]")).getText();
			securityNamesSet.add(text);
	
		}
		for (String names : securityNamesSet) {
			System.out.println(names);
			
		}
	}

}
