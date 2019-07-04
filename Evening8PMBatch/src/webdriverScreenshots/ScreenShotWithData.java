package webdriverScreenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import launcher.BaseTest;

public class ScreenShotWithData extends BaseTest
{

	public static void main(String[] args) throws Exception
	{
		loadData();
		
		launch("chromebrowser");
		
		navigateurl("newtoururl");
		
		Date dt=new Date();
		System.out.println(dt);
		//String dateFormat=dt.toString().replace(":", "_").replace(" ", "_")+".jpeg";
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrFile, new File("C:\\Users\\DELL\\Desktop\\"+dateFormat.format(dt)+".png" ));
		//FileHandler.copy(scrFile, new File("C:\\Users\\DELL\\Desktop\\"+dateFormat));

	}

}
