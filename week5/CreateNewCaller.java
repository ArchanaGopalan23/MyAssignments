package assignment.week5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class CreateNewCaller extends ProjectCommonMethod{
	@Test
	public void createNewCaller() throws InterruptedException {
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Callers");
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(Keys.ENTER)	;	
		WebElement frameElement = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Sruthi");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("Shankar");
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("shruthi123@abc.com");
		driver.findElement(By.xpath("//input[@id='sys_user.phone']")).sendKeys("40");
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("Ms");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("101");
		driver.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default']")).click();
		driver.findElement(By.xpath("//input[@class='form-control']")).clear();
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Sruthi",Keys.ENTER);
		driver.findElement(By.xpath("//table[@id='sys_user_table']/thead/tr[2]/td[3]//div//input")).sendKeys("Shankar");
		driver.findElement(By.xpath("//table[@id='sys_user_table']/thead/tr[2]/td[4]//div//input")).sendKeys("Sruthi",Keys.ENTER);
		WebElement table = driver.findElement(By.xpath("//table[@id='sys_user_table']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		String name = driver.findElement(By.xpath("//input[@class='form-control']")).getText();
		System.out.println(name);
		String tableFirstName = driver.findElement(By.xpath("//table[@id='sys_user_table']/tbody/tr/td[4]")).getText();
		String tableLastName = driver.findElement(By.xpath("//table[@id='sys_user_table']/tbody/tr/td[3]")).getText();
		//Thread.sleep(3000);
		//String firstname = driver.findElement(By.xpath("//table[@id='sys_user_table']/thead/tr[2]/td[4]//div//input")).getText();
		//String lastname = driver.findElement(By.xpath("//table[@id='sys_user_table']/thead/tr[2]/td[3]//div//input")).getText();
		
		System.out.println(tableFirstName+" "+tableLastName);
		
		if(rows.size()>2 && tableFirstName!=" " && tableLastName!=" ") {
			System.out.println("New caller record is created Successfully");
		}
			else {
				System.out.println("New caller record is not created ");

			}
		}
	}


