package com.hdfc.loans.personalloans;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChomeProf 
{

	public static void main(String[] args) 
	{
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 4");
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.amazon.in");
		
		
	}

}
