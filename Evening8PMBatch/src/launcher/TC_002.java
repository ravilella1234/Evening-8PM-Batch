package launcher;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		loadData();
		
		launch("chromebrowser");
		
		navigateurl("amazonurl");
		
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
		 
		 driver.findElement(By.id("twotabsearchtextbox")).clear();
		 
		 driver.findElement(By.name("field-keywords")).sendKeys("philips");
		 
		 //driver.findElement(By.className("nav-input")).clear();
		 
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).clear();
		 
		// driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("toshiba");
		 
		 //driver.findElement(By.linkText("AmazonBasics")).click();
		 
		 Thread.sleep(3000);
		 
		 driver.findElement(By.partialLinkText("AmazonBasi")).click();
		 
		List<WebElement> var = driver.findElements(By.tagName("a"));
		
		for(int i=0;i<var.size();i++)
		{
			if(!var.get(i).getText().isEmpty())
			{
				System.out.println(var.get(i).getText());
			}
			
		}
		 
		 
		
	}

}
