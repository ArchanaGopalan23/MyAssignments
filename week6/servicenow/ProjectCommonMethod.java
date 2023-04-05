package assignment.week5;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.github.sukgu.Shadow;

public class ProjectCommonMethod {
	
	public RemoteWebDriver driver;
	public Shadow shadow;
	public String excelSheet;

	@BeforeMethod
	@Parameters({"browser","url","username","password"})
	public void preCondition(String browser,String url,String username,String password) {
		 switch(browser) {
		 case "chrome":
		 {
			 ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				driver = new ChromeDriver(options);
				break;
		 }
		 case "Edge" :
		 {
				driver = new EdgeDriver();
				break;
		 
		 }
			
		 }	

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(url); 
	driver.findElement(By.id("user_name")).sendKeys(username);
	//driver.findElement(By.id("user_password")).sendKeys("QQB!%8jFKa6azaIc");
	driver.findElement(By.id("user_password")).sendKeys(password);
	driver.findElement(By.id("sysverb_login")).click();
	shadow = new Shadow(driver);
	shadow.setImplicitWait(15);
	shadow.findElementByXPath("//div[contains(text(),'All')]").click();
	
	}
	
	
	  @AfterMethod
	  public void postCondition() {
		 driver.close();
		  }
	  @DataProvider(name="getData")
	  public String[][] getData() throws IOException{
		  String[][] inputdata = ReadData.inputdata(excelSheet);
		  return inputdata;
	  }
	 
}
