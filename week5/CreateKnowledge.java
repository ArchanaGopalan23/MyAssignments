package assignment.week5;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class CreateKnowledge extends ProjectCommonMethod{

	@Test
	public void createKnowledge() throws InterruptedException {
		shadow.findElementByXPath("//input[@id='filter']").sendKeys("Knowledge");
		shadow.findElementByXPath("//input[@id='filter']").sendKeys(Keys.ENTER)	;	
		WebElement frameElement = shadow.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//span[text() ='Create an Article']")).click();
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_knowledge_base']")).sendKeys("IT");
		driver.findElement(By.xpath("//input[@id='sys_display.kb_knowledge.kb_category']")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@id='kb_knowledge.short_description']")).sendKeys("IT Description");
		driver.findElement(By.xpath("//button[@class='form_action_button  action_context btn btn-default']")).click();

	}
}
