package webdriverScreenshots;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import launcher.BaseTest;

public class ScreenShot2 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		loadData();
		
		launch("chromebrowser");
		
		navigateurl("amazonurl");
		
		
		List<WebElement> links=driver.findElements(By.linkText("Rajanikanth"));
		System.out.println(links.size());
		if(links.size()==0)
		{
			File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scrFile, new File("C:\\Users\\DELL\\Desktop\\img2.jpeg"));
		}
		
		
		
		
		/*String val = driver.getPageSource();
		if(val.contains("Ravikanth"))
		{
			File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("C:\\Users\\DELL\\Desktop\\google.png"));
		}*/
			
		
	}
}
