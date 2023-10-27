package testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import common.BaseData1;

public class Skippingtest extends BaseData1 {
	
	boolean testData=false;
	
	@Test(enabled=true)
	public void SkipTest1() {
		System.out.println("skip test when test is incomplicated");
		Assert.assertTrue(false);
	}
	@Test
	public void Skiptest2() {
		System.out.println("skip test forcefully ");
		throw new SkipException("forcefullyy skipedd test ");
	}
	@Test
	public void SkipTes3() {
		System.out.println("skip test when condition not met");
		
		if(testData==true) {
			System.out.println("test is not skipped");
		}
		else {
			throw new SkipException("test skipped because condition not met");
		}
	}


}
