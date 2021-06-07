package testcases.suitea;

//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.TestDataProvider;

public class CreateUser {
	//step2 -linking
	
//	@Test(dataProvider ="getData") // map the data provider// step2
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "getData")
	
	
	public void createUser(String browser, String userType , int phone , String email)// step 3 define parameters
	{// Step 3 
		System.out.println(browser+"----"+ "---"+ userType+"------"+phone+"--------"+email);
		 
	}
	
	// Step 1 
	// @DataProvider
	
/*	public static Object[][] getData()
	{
		Object[][]  data = new Object[3][4]; //row//col
		//row1 
		data[0][0] ="Chome";
		data[0][1] ="Admin"; 
		data[0][2] =12334566;
     	data[0][3] ="RCB@Test.com";
		
		//row2
		
		data[1][0] ="Mozila";
		data[1][1] ="SuperAdmin";
		data[1][2] = 6453676;
		data[1][3] ="Jem@test.com";
		
		//row3 
		data[2][0] ="IE";
		data[2][1] ="SuperUSER";
		data[2][2] = 89000000;
		data[2][3] ="raji@test.com";
		return data;
		
	}*/
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "getData")
	public void deleteUser(String browser, String userType , int phone , String email)// step 3 define parameters
	{// Step 3 
		System.out.println(browser+"----"+ "---"+ userType+"------"+phone+"--------"+email);
		 
	}
 
}
