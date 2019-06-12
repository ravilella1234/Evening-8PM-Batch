package launcher;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		loadData();
		
		System.out.println("start");
		
		launch("chromebrowser");
		
		navigateurl("iciciurl");

		System.out.println("stop");
	}

}
