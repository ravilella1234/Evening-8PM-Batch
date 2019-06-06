package launcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class BrowserLaunch 
{

	public static void main(String[] args) 
	{
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");

		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.bestbuy.com");
		
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\DELL\\Desktop\\Drivers\\IEDriverServer.exe");
		//System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
		System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.get("https://www.snapdeal.com");
		
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\DELL\\Desktop\\Drivers\\MicrosoftWebDriver.exe");
		//System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
		System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.icicibank.com");
	}

}
