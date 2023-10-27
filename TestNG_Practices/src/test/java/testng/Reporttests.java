package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporttests {
	@Test
	public void reportTes1() {
		//Reporter.log("test report 1");
		System.out.println("report test 1");
	}
	@Test
	public void reportTest2() {
		//Reporter.log("test report 2");
		System.out.println("report test 2");
		//Assert.assertTrue(false);
	}
	@Test
	public void reportTest3() {
		//Reporter.log("test report 3");
		System.out.println("report test 3");
	}
	@Test
	public void reportTest4() {
		System.out.println("report test 4");
	}

}
