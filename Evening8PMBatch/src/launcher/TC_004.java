package launcher;

import com.relevantcodes.extentreports.LogStatus;

public class TC_004 extends BaseTest
{

	
	
	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("TC_004");
		
		
		loadData();
		test.log(LogStatus.INFO, "Intializing the propertiey files......");
		
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Loading the Browser :- " + p.getProperty("chromebrowser"));
		
		
		navigateurl("amazonurl");
		test.log(LogStatus.INFO, "Navagted to url :-" + p.getProperty("amazonurl"));
		
		
		selectValue("amazondropdown_id","amazondropvalue");
		test.log(LogStatus.INFO, "Selected the item in dropdown :- " + or.getProperty("amazondropvalue")  + " By using locator :-  " + or.get("amazondropdown_id"));
		
		type("amazonsearchtext_name","amazonsearchtextvalue");
		test.log(LogStatus.INFO, "Entered the value  :- " + or.getProperty("amazonsearchtextvalue") + " By using the locator :- " + or.getProperty("amazonsearchtext_name"));	
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.INFO, "Clicked on Button By using locator :- " + or.getProperty("amazonsearchbutton_xpath"));
	
		report.endTest(test);
		report.flush();
	}
}
