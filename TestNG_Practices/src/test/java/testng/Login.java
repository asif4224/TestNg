package testng;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.BaseData1;

public class Login{
	
//	
//	@BeforeClass
//	public void beforeclass() {
//		System.out.println("before class exexecute first before ruuning of this class methods");
//	}
//	@AfterClass
//	public void afterclass() {
//		System.out.println("after class will be execute once the test gets execute of given class");
//	}
//	@BeforeTest
//	public void loginToApplication() {
//		System.out.println("login to application");
//	}
//	@AfterTest
//	public void LogoutFromApplication() {
//		System.out.println("logout from application");
//	}
	@Test(priority=0, description="login Test")
	public void Login() {
		System.out.println("login successful");
	}
	@Test(priority=-1,description="logout Test")
	public void logout() {
		System.out.println("logout successful");
		Assert.assertTrue(false);
	}

}
