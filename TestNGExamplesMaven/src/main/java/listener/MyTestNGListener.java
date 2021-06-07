package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestNGListener implements ITestListener{
	
	// ITestListener and ITestResult are the listenrs interface
	
	// implement ITestListener class
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Failed"); // register with testng.xml only  run when testng.xml will run because testng class is having Listeners class
		
		System.out.println(result.getName());
	//System.out.println(result.getTestContext().getName(name));
		System.out.println(result.getStatus());
		System.out.println(result.getThrowable().getMessage()); // why the test case fail 
	}
	
/*	
         public void onTestSuccess​(ITestResult result)
{
	System.out.println("Test passed"+result.getName()); // confusing output // will give all passed test
	
}*/
	 

}
