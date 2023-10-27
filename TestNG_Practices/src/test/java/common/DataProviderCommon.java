package common;

import org.testng.annotations.DataProvider;

public class DataProviderCommon {
	
	@DataProvider(name="data1")
	public Object[][] dataSetup(){
		return new Object[][] {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"},
			{"performance_glitch_user","secret_sauce"}
		};
	}

}
