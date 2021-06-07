package testcasessuiteb;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ValidateUsersRegTest {
	
	@Test
	public void validate()
	{
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals("ABC", "ABC");
		softAssert.assertEquals("ABC", "ABCfggg"); // fail
		softAssert.assertEquals(5>11, "Arithmatic Error"); // fail
		
		softAssert.fail("404 Error fail"); // fail (Two type sof and hard Assertions)
		
		
		softAssert.assertAll(); // will give you the list of all failiur 
	}

}
