package assignment.week5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.sukgu.Shadow;

public class ProjectCommonMethod {
	
	public ChromeDriver driver;
	public Shadow shadow;
	@BeforeMethod
	@Parameters({"url","username","password"})
	public void preCondition(String url,String username,String password) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(options);
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
	 
}
