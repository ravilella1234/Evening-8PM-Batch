package launcher;

import javax.swing.SortingFocusTraversalPolicy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TC_005 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		
		SoftAssert s=new SoftAssert();
		
		loadData();
		
		launch("chromebrowser");
		
		navigateurl("amazonurl");
		
		/*String actualLink = driver.findElement(By.linkText("AmazonBasics")).getText();
		String expectedLink="AmazonBasics";
		
		System.out.println("Actual Links :" + actualLink);
		System.out.println("Excpected Links :" + expectedLink);
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		//if(actualLink.contains(expectedLink))
		if(actualLink.contentEquals(expectedLink))
			System.out.println("Both Links are equal....");
		else
			System.out.println("Both Links are not equal....");*/
		
		
		/*String actualLink = driver.findElement(By.linkText("AmazonBasics")).getAttribute("innerHTML");
		String expectedLink="AmazonBasics";
		
		System.out.println("Actual Links :" + actualLink);
		System.out.println("Excpected Links :" + expectedLink);
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		//if(actualLink.contains(expectedLink))
		if(actualLink.contentEquals(expectedLink))
			System.out.println("Both Links are equal....");
		else
			System.out.println("Both Links are not equal....");*/
		
		
		/*WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		
		loc.sendKeys("sony");
		String var = loc.getAttribute("value");
		System.out.println("Text is : " + var);*/
		
		
		String actualLink = driver.findElement(By.linkText("AmazonBasics")).getAttribute("innerHTML");
		String expectedLink="AmazonBasic";
		
		System.out.println("Actual Links :" + actualLink);
		System.out.println("Excpected Links :" + expectedLink);
		
		//Assert.assertEquals(actualLink, expectedLink);
		//Assert.assertTrue(actualLink.equals(expectedLink), "Both links are not equal..");
		
		//s.assertEquals(actualLink, expectedLink);
		s.assertTrue(actualLink.equals(expectedLink), "Both links are not equal..");
		
		s.assertTrue(false, "error1");
		
		s.assertTrue(true, "error2");
		
		s.assertTrue(false, "error3");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
		
		s.assertAll();

	}

}
