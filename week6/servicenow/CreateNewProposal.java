package assignment.week5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CreateNewProposal extends ProjectCommonMethod{
	@BeforeTest
	public void setUp() {
		excelSheet = "NewProposal";
	}
	@Test(dataProvider = "getData")
	public void createNewProposal(String Category,String desc,String changedesc, String changeDesc1) throws InterruptedException {
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(Category);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(Keys.ENTER)	;	
		WebElement frameElement = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//button[@id='sysverb_new']")).click();

		driver.findElement(By.xpath("(//div[@class='col-xs-10 col-md-9 col-lg-8 form-field input_controls']/input)[3]")).sendKeys("Test Desc");

		driver.findElement(By.xpath("//span[contains(text(),'Change Request')]")).click();
		driver.findElement(By.xpath("//table[@class='wide']//table/tbody[1]/tr[1]/td[4]/input[1]")).sendKeys("Test value");
		driver.findElement(By.xpath("(//table[@class='wide']//table)[2]/tbody[1]/tr[1]/td[4]/textarea[1]")).sendKeys("Test value2");

		String reqNo = driver.findElement(By.xpath("(//div[@class='col-xs-10 col-sm-9 col-md-6 col-lg-5 form-field input_controls']/input)[1]")).getText();
		driver.findElement(By.xpath("//button[@id='sysverb_insert_bottom']")).click();
		Thread.sleep(5000);
		String lsttext = driver.findElement(By.xpath("//table[@id='std_change_proposal_table']/tbody[1]/tr[8]/td[3]/a[1]")).getText();
		System.out.println(lsttext);
		if(lsttext.contains(reqNo)) {
			System.out.println("New request is created Successfully");
		}
			else {
				System.out.println("New Req is not created");
			}
				
		}
		
	}
			


