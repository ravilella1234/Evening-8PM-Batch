package com.hdfc.loans.educationloans;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FireClass 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		
		//logs
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		
		
		//FirfoxOption
		FirefoxOptions option=new FirefoxOptions();
		
		//Binaries
		//option.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		
		//PageLoadStartegy
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		ProfilesIni pro=new ProfilesIni();
		FirefoxProfile profile = pro.getProfile("firefox2");
		
		
		profile.setPreference("dom.webnotifications.enabled", false);
		
		
		profile.setPreference("network.proxy.type", 1);
		profile.setPreference("network.proxy.socks", "192.168.90.54");
		profile.setPreference("network.proxy.socks_port", 1744);
		
		option.setProfile(profile);
		
		
		
		
		FirefoxDriver driver=new FirefoxDriver(option);
		System.out.println("start");
		driver.get("https://www.icicibank.com/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
		
		System.out.println("End");
			
		

	}

}
