package launcher;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest 
{
	public static WebDriver driver;
	public static String path="./data.properties";
	public static String orPath="./or.properties";
	public static Properties p;
	public static Properties or;
	
	
	public static void loadData() throws Exception
	{
		FileInputStream fis=new FileInputStream(path);
		p=new Properties();
		p.load(fis);
		
		FileInputStream fis1=new FileInputStream(orPath);
		or=new Properties();
		or.load(fis1);
		
	}
	
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equalsIgnoreCase("CHROME")) 
		{
			//logs
			System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "null");
			
			ChromeOptions option=new ChromeOptions();
			
			//page load sync
			option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			
			//Chrome user defined profile
			option.addArguments("user-data-dir=C:\\Users\\DELL\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 5");
			
			
			//notifications
			option.addArguments("--disable-notifications");
			option.addArguments("--disable-infobars");
			option.addArguments("--start-maximized");
			
			//proxy servers  -- //chrome://version
			//option.addArguments("--proxy-server=http://192.168.90.84:1234");
			
			
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver(option);
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
			//logs
			System.setProperty(InternetExplorerDriverService.IE_DRIVER_LOGFILE_PROPERTY, "null");
			
			InternetExplorerOptions opt=new InternetExplorerOptions();
			
			//proxy servers
			DesiredCapabilities cap=new DesiredCapabilities();
			
			String proxy="80.200.90.81:4444";
			Proxy p =new Proxy();
			p.setAutodetect(false);
			p.setProxyType(p.getProxyType());
			p.setSocksProxy(proxy);
			cap.setCapability(CapabilityType.PROXY, p);
			opt.merge(cap);
			
			System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver(opt);
		}
		else if(p.getProperty(browser).equalsIgnoreCase("edge")) 
		{
			//logs
			System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, "null");
			
			EdgeOptions opt=new EdgeOptions();
			
			//page load Strategy
			opt.setPageLoadStrategy("Normal");
			
			System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
			driver=new EdgeDriver(opt);
		}
	}
	
	public static void navigateurl(String url) 
	{
		driver.get(p.getProperty(url));
	}
	
	
	public static void clickElement(String locatorKey) 
	{
		driver.findElement(By.xpath(or.getProperty(locatorKey))).click();
	}

	public static void type(String locatorKey, String value) 
	{
		driver.findElement(By.name(or.getProperty(locatorKey))).sendKeys(or.getProperty(value));
	}

	public static void selectValue(String locatorKey, String dropItem) 
	{
		driver.findElement(By.id(or.getProperty(locatorKey))).sendKeys(or.getProperty(dropItem));
	}

}
