package assignment.week5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class OrderingMobile extends ProjectCommonMethod{
	@BeforeTest
	public void setUp() {
			excelSheet = "OrderMobile";
	}
	@Test(dataProvider="getData")
	public void orderMobile(String category, String phone) {
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(category);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(Keys.ENTER)	;	
		WebElement frameElement = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//span[contains(text(),'Cell phones')]")).click();
		shadow.findElementByXPath("//h2[contains(text(),'iPhone 13 pro')]").click();
		driver.findElement(By.xpath("//label[contains(text(),'Gold')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Yes')]")).click();
		WebElement select = driver.findElement(By.xpath("//option[contains(text(),'None')]/parent::select"));
		Select  plan= new Select(select);
		plan.selectByIndex(1);
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys(phone);
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		System.out.println(driver.getTitle());
		String reqNo = driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
		System.out.println(reqNo);
		
		

	}
}
