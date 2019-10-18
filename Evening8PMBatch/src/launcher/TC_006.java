package launcher;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest 
{

	public static void main(String[] args) throws Exception 
	{
		test=report.startTest("TC_006");
		
		loadData();
		test.log(LogStatus.INFO, "Intializing the propertiey files......");
		
		
		launch("chromebrowser");
		test.log(LogStatus.INFO, "Loading the Browser :- " + p.getProperty("chromebrowser"));
		
		
		navigateurl("amazonurl");
		test.log(LogStatus.INFO, "Navagted to url :-" + p.getProperty("amazonurl"));
		
		String expectedTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(!verifyTitle(expectedTitle))
			reportFailure("Given title is not matching....");
		else
			reportPass("Given Title is Matching....");
		
		
		String expectedLink="AmazonBasic";
		if(!verifyElement(expectedLink))
			reportFailure("Both Elements are not equal..");
		else
			reportPass("Both Elements are equal....");
		
		
		
		/*if(actualTitle.equals(expectedTitle))
			System.out.println("Both titles are equal...");
		else
			System.out.println("Both titles are not equal...");*/
		
		report.endTest(test);
		report.flush();
		
	}

	
}
