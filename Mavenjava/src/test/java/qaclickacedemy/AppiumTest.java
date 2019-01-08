package qaclickacedemy;

import org.testng.annotations.Test;

public class AppiumTest {

	@Test
	public void selectMobileDevice()
	{
		System.out.println("Device is samsung");
	}
	
	
	@Test
	public void AbcModel() //TestNG will execute tests in alphabetical order
	{
		System.out.println("Model is S7");
	}
	
}