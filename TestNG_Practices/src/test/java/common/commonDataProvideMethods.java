package common;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class commonDataProvideMethods {
	
	@DataProvider(name="create")
	public Object[][] setup2(Method m) {
		
		Object[][] dataset=null;
		if(m.getName().equals("test1")) {
			
			dataset= new Object[][] 
					{
				{"user1","pass1"},
				{"user2","pass2"},
				{"user3","pass3"},
				{"user4","pass4"}
					};
		}
		else if(m.getName().equals("test2")) {
			dataset=new Object[][] 
					{
				{"user1","pass1","text1"},
				{"user2","pass2","text2"},
				{"user3","pass3","text3"},
				{"user4","pass4","text4"}
					};
		}
		return dataset;
	
	}
}
