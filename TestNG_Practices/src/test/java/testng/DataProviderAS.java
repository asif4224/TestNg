package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.commonDataProvideMethods;

public class DataProviderAS {
	
	@Test(dataProvider = "create",dataProviderClass = commonDataProvideMethods.class)
	public void test2(String user,String pass, String text) {
		System.out.println(user+"==="+pass+"===="+text);
	}
	
	@Test(dataProvider = "create",dataProviderClass =commonDataProvideMethods.class)
	public void test1(String username,String password) {
		System.out.println("dataset are "+username+"====="+password);
	}
	
	
//	@DataProvider(name="data1")
//	public Object[][] dataSet() {
//		
//		Object[][] dataset=new Object[4][2];
//		
//		//dataset1
//		dataset[0][0]="user1";
//		dataset[0][1]="pass1";
//		
//		//dataset2
//		dataset[1][0]="iuser2";
//		dataset[1][1]="pass2";
//		
//		//dataset3
//		dataset[2][0]="user3";
//		dataset[2][1]="pass3";
//		
//		//dataset4
//		
//		dataset[3][0]="user4";
//		dataset[3][1]="pass4";
//		
//		return dataset;
//	}
//	
//	@DataProvider(name="data2")
//	public Object[][] data2(){
//		
//		return new Object[][] {
//			{"user1","pass1","text1"},
//			{"user2","pass2","text3"},
//			{"user3","pass3","text3"}
//		};
	}
