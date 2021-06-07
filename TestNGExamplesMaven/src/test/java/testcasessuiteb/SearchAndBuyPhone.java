package testcasessuiteb;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SearchAndBuyPhone {
	
	//boolean flag=true; // read - xls,Json
	
	
	boolean flag=false;
	//ITestContext : interface
	
	@Test(priority = 1) // there is no such main function in testNG
	public void search(ITestContext context)  // function is a Test case  there is no main function in TestNg
	{ // failing Skipping
		if(flag)
			
			throw new SkipException("Skipping Test");
		 System.out.println("Searching Phone");
		 //phone name
		 context.setAttribute("phoneName", "Iphone 12");
		 
		 ///how to we transfer test results from one to another
		 
	}// test cases in seperate java file can not be passed as ITestContext  // for this structure just in the same file
	
	@Test(priority = 2, dependsOnMethods = {"search"}) // give the priority for the execution
	public void selectPhone(ITestContext context)
	{
		String name = (String)context.getAttribute("phoneName");
		
		System.out.println("Selecting phone"+name);
		Assert.fail(); // in case any one of these is giving the error
	}
   
	@Test(priority = 3,dependsOnMethods = {"search", "selectPhone"} )
	public void checkout()
	{
		System.out.println("Checking out");
	}
}
