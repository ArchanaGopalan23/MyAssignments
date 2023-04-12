package assignment.week7;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTextChange {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		Boolean until = wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//span[text()='I am going to change!']"),"I am going to change!")); //verification String
		String text2 = driver.findElement(By.xpath("//span[text()='Did you notice?']")).getText();
		System.out.println("The invisibility or change in the txt on the button: "+until);
		System.out.println(text2);
	}

}
