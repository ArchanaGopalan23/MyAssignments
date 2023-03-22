package assignments.week4;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetRowColumnOfTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://html.com/tags/table/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		WebElement firstTable = driver.findElement(By.xpath("//caption[contains(text(),'The Three')]"));
		
		System.out.println("Table name: "+firstTable.getText());
		
		WebElement table1 = driver.findElement(By.xpath("(//div[@class='render'])[1]/table"));
		
		List<WebElement> table1Rows = table1.findElements(By.tagName("tr"));
		
		System.out.println("First Table Rows"+table1Rows.size());
		
		List<WebElement> table1Columns = table1.findElements(By.tagName("th"));
		
		System.out.println("First Table Columns "+table1Columns.size());
		
		WebElement secondTable = driver.findElement(By.xpath("//div[@class='related-pages']/h2"));
		
		System.out.println("Table name: "+secondTable.getText());
		
		WebElement table2 = driver.findElement(By.xpath("//table[@class='attributes-list']"));

		List<WebElement> table2Rows = table2.findElements(By.tagName("tr"));
		
		System.out.println("Second Table Rows : "+table2Rows.size());
		
		List<WebElement> table2Col = table2.findElements(By.tagName("th"));
		
		System.out.println("Second Table Columns : "+table2Col.size());
		
		for (int i =1; i <=table1Rows.size()-2; i++) {
			
			//String rowValue = driver.findElement(By.xpath("(//div[@class='render'])[1]/table//tr["+i+"]/td[1]")).getText();
			//System.out.println(rowValue);
			for (int j = 1; j <=table1Columns.size(); j++) {
				String columnValue = driver.findElement(By.xpath("(//div[@class='render'])[1]/table//tr["+i+"]/td["+j+"]")).getText();
				System.out.println(columnValue);
				
			}
			
		}





	}

}
