package testcases.suitea;

//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	
	@BeforeTest
	public void init()
	{
		System.out.println("-----------BeforeTest----------------");
		// start the browser 
	}
	
	@AfterTest
	
	public void quit()
	{
		System.out.println("-----------AfterTest----------------");	
		//close the browser
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("----------------Before Method--------------------------");
		//initialize the reports
	}
	

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("----------------After Method--------------------------");
		//finalize the reports
	}
	
	@Test
	
	public void doLogin()
	{
	//	String expectedResult="ABC";
	//	String actualResult = "ABC";
		
		
        // Assert.assertEquals(actualResult, expectedResult); // use assertions 
		
		//Assert.assertTrue(5>12, "Error Message");
		// Assert.assertTrue(isElementPresent("XXX"), "Element is not found");
		System.out.println("-------------A-------------");
		//	Assert.fail("Own Custom error message- 404 error");
		
		// Assertion failer will happen none of the below code will apply
		
		System.out.println("-------------B-------------");
		
		
	}
	@Test
	
	public void logout()
	{
		System.out.println("Logging Out");
	}
}
