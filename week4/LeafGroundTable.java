package assignments.week4;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LeafGroundTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://leafground.com/table.xhtml");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement table = driver.findElement(By.xpath("(//table[@role='grid'])[2]"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		Set<String> countries = new HashSet<String>();
		System.out.println("Country Names");
		for (int i = 1; i < rows.size(); i++) {
			
			String text = driver.findElement(By.xpath("(//table[@role='grid'])[2]//tr["+i+"]/td[2]")).getText();
			
			countries.add(text);
			
		}
		for (String country : countries) {
			System.out.println(country);

			
		}

		
		

	}

}
