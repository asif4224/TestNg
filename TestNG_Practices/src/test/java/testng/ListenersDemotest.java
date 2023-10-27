package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseData1;



public class ListenersDemotest extends BaseData1 {
	
	@Test(retryAnalyzer = common.Retrytest.class)
	public void Ebaytest() {
		driver.get("https://www.ebay.com/");
		Assert.assertTrue(false);
	}
}
