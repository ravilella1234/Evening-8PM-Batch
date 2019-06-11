package launcher;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class BaseTest 
{
	public static WebDriver driver;
	public static String path="./data.properties";
	public static Properties p;
	
	
	public static void loadData() throws Exception
	{
		FileInputStream fis=new FileInputStream(path);
		p=new Properties();
		p.load(fis);
	}
	
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equalsIgnoreCase("CHROME")) 
		{
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(p.getProperty(browser).equalsIgnoreCase("firefox")) 
		{

			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
			
			FirefoxOptions option=new FirefoxOptions();

			//setting the firefox binaries
			option.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
			
			//page load strategy
			option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			
			
			//profiling --> firefox.exe -p
			ProfilesIni p=new ProfilesIni();
			FirefoxProfile profile = p.getProfile("sai");
			
			//notifications
			profile.setPreference("dom.webnotifications.enabled", false);
			
			
			//proxy servers
			//profile.setPreference("network.proxy.type", 1);
			//profile.setPreference("network.proxy.socks", "192.168.90.54");
			//profile.setPreference("network.proxy.socks_port", 1744);
			
			option.setProfile(profile);
			
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver(option);
		}
		else if(p.getProperty(browser).equalsIgnoreCase("ie")) 
		{
			System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else if(p.getProperty(browser).equalsIgnoreCase("edge")) 
		{
			System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}
	}
	
	public static void navigateurl(String url) 
	{
		driver.get(p.getProperty(url));
	}

}
