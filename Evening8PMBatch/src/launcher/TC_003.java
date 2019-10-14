package launcher;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.LogStatus;

public class TC_003 extends BaseTest
{

	private static final Logger log=Logger.getLogger(TC_003.class.getName());
	
	public static void main(String[] args) throws Exception 
	{
		
		
		loadData();
		log.info("Intializing the propertiey files......");
		
		
		launch("chromebrowser");
		log.info("Loading the Browser :- " + p.getProperty("chromebrowser"));
		
		
		navigateurl("amazonurl");
		log.info("Navagted to url :-" + p.getProperty("amazonurl") );
		
		
		selectValue("amazondropdown_id","amazondropvalue");
		log.info("Selected the item in dropdown :- " + or.getProperty("amazondropvalue")  + " By using locator :-  " + or.get("amazondropdown_id"));
		
		type("amazonsearchtext_name","amazonsearchtextvalue");
		log.info("Entered the value  :- " + or.getProperty("amazonsearchtextvalue") + " By using the locator :- " + or.getProperty("amazonsearchtext_name"));
			
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked on Button By using locator :- " + or.getProperty("amazonsearchbutton_xpath"));
	
	}
}
