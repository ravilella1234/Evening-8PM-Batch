package launcher;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_003 extends BaseTest
{

	private static final Logger log=Logger.getLogger(TC_003.class.getName());
	
	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("TC_003");
		
		loadData();
		log.info("Intializing the propertiey files......");
		test.log(LogStatus.INFO, "Intializing the propertiey files......");
		
		launch("chromebrowser");
		log.info("Loading the Browser :- " + p.getProperty("chromebrowser"));
		test.log(LogStatus.INFO, "Loading the Browser :- " + p.getProperty("chromebrowser"));
		
		navigateurl("amazonurl");
		log.info("Navagted to url :-" + p.getProperty("amazonurl") );
		test.log(LogStatus.INFO, "Navagted to url :-" + p.getProperty("amazonurl") );
		
		selectValue("amazondropdown_id","amazondropvalue");
		log.info("Selected the item in dropdown :- " + or.getProperty("amazondropvalue")  + " By using locator :-  " + or.get("amazondropdown_id"));
		test.log(LogStatus.INFO, "Selected the item in dropdown :- " + or.getProperty("amazondropvalue")  + " By using locator :-  " + or.get("amazondropdown_id"));
		
		type("amazonsearchtext_name","amazonsearchtextvalue");
		log.info("Entered the value  :- " + or.getProperty("amazonsearchtextvalue") + " By using the locator :- " + or.getProperty("amazonsearchtext_name"));
		test.log(LogStatus.INFO, "Entered the value  :- " + or.getProperty("amazonsearchtextvalue") + " By using the locator :- " + or.getProperty("amazonsearchtext_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on Button By using locator :- " + or.getProperty("amazonsearchbutton_xpath"));
		test.log(LogStatus.INFO, "Clicked on Button By using locator :- " + or.getProperty("amazonsearchbutton_xpath"));
		
		report.endTest(test);
		report.flush();
		
		
		/*driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();*/
		
	}

	

}
