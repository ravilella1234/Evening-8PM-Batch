package launcher;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) 
	{
		launch("firefox");
		
		navigateurl("https://www.bestbuy.com");

	}

}