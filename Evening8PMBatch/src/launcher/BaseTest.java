package launcher;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;

public class BaseTest 
{
	public static WebDriver driver;
	
	public static void launch(String browser)
	{
		if(browser.equalsIgnoreCase("CHROME")) {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}
	}
	
	public static void navigateurl(String url) 
	{
		driver.get(url);
	}

}
