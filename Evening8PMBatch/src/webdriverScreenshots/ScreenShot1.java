package webdriverScreenshots;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import launcher.BaseTest;



public class ScreenShot1 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
				
		loadData();
		
		launch("chromebrowser");
		
		navigateurl("amazonurl");
		
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcfile, new File("C:\\Users\\DELL\\Desktop\\img1.png"));
				
		
		//File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcscreen, new File("C:\\Users\\DELL\\Desktop\\gmail.png"));
		//FileHandler.copy(srcfile, new File("C:\\Users\\DELL\\Desktop\\gmail1.png"));
			
	}
}
