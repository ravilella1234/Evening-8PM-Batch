package launcher;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		loadData();
		
		launch("chromebrowser");
		
		navigateurl("amazonurl");
		
		selectValue("amazondropdown_id","amazondropvalue");
		
		type("amazonsearchtext_name","amazonsearchtextvalue");
		
		clickElement("amazonsearchbutton_xpath");
		
		
		
		
		
		/*driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();*/
		
	}

	

}
