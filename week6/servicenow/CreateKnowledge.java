package assignment.week5;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class CreateKnowledge extends ProjectCommonMethod{
	@BeforeTest
	public void setUp() {
		excelSheet="Knowledge";
	}

	@Test(dataProvider="getData")
	public void createKnowledge(String category, String tech, String techCategory, String desc) throws InterruptedException {
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(category);
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(Keys.ENTER)	;	
		WebElement frameElement = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//span[text() ='Create an Article']")).click();
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys(tech);
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_category']")).sendKeys(techCategory);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys(desc);
		driver.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default']")).click();

	}
}
