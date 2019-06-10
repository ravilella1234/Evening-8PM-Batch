package launcher;

import java.io.FileInputStream;
import java.util.Properties;

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
		if(p.getProperty(browser).equalsIgnoreCase("CHROME")) {
			System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}else if(p.getProperty(browser).equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(p.getProperty(browser).equalsIgnoreCase("ie")) {
			System.setProperty(InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}else if(p.getProperty(browser).equalsIgnoreCase("edge")) {
			System.setProperty(EdgeDriverService.EDGE_DRIVER_EXE_PROPERTY, System.getProperty("user.dir")+"//drivers//MicrosoftWebDriver.exe");
			driver=new EdgeDriver();
		}
	}
	
	public static void navigateurl(String url) 
	{
		driver.get(p.getProperty(url));
	}

}
