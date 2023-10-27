package testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
@Test(groups="smoke")
public class TestGroup {
	
	public void loginToApplication() {
		System.out.println("login to application");
	}
	@AfterTest
	public void LogoutFromApplication() {
		System.out.println("logout from application");
	}
	@Test(priority=0, description="login Test",groups="regression")
	public void Login() {
		System.out.println("login successful");
	}
	@Test(priority=-1,description="logout Test",groups="smoke")
	public void logout() {
		System.out.println("logout successful");
	}
	@Test(priority=-1,description="logout Test",groups={"smoke","regression"})
	public void logout1() {
		System.out.println("logout successful both group");
	}

}
