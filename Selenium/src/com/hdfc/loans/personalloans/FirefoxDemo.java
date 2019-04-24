package com.hdfc.loans.personalloans;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxDemo {

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		System.out.println("Start....");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "D:\\sample.txt");
		System.setProperty("webdriver.gecko.driver", "D:\\Browser_Drivers\\geckodriver.exe");
		
		FirefoxOptions option= new FirefoxOptions();
		
		//binary
		//option.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
						
		//page load strategy
		option.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		ProfilesIni p=new ProfilesIni();
		FirefoxProfile pro = p.getProfile("ashwini");
		
		//notifications
		pro.setPreference("dom.webnotifications.enabled", false);
		
		
		//proxy servers
		//pro.setPreference("network.proxy.type", 1);
		//pro.setPreference("network.proxy.socks", "192.168.90.55");
		//pro.setPreference("network.proxy.socks_port", 1744);
		
		option.setProfile(pro);
		

		driver=new FirefoxDriver(option);
		//driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		System.out.println("Stop....");
		
	}

}
