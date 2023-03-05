package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		//EdgeDriver driver = new EdgeDriver();
		
		//Load the Url
		
		//driver.get("https://www.facebook.com");
		
		driver.get("https://www.amazon.com");
		//to Maximize the window
		driver.manage().window().maximize();



		

	}

}
