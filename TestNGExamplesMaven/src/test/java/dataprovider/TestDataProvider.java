package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider
	
	public static Object[][] getData(Method m)
	{
		System.out.println("Method /test"+m.getName());
		
		Object[][] data = null;
		
	if(m.getName().equals("createUser"))
		{
			
		
		data = new Object[3][4]; //row//col
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
		}else if (m.getName().equals("deleteUser"))
		{
			  data = new Object[3][4]; //row//col
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
		}
		
		return data;
		
	}
}
