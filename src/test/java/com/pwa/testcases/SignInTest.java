package com.pwa.testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.pwa.base.TestBase;
import com.pwa.pages.actions.SigninPage;
import com.pwa.utilities.Utilities;

public class SignInTest {

	
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void signInTest(Hashtable<String,String> data) {
		
		if(data.get("runmode").equalsIgnoreCase("N")){
			
			throw new SkipException("Skipping the test as the Run mode is NO");
			
			
		}
		TestBase.initConfiguration();
		SigninPage signin = TestBase.topNav.gotoSignIn();
		signin.doLogin(data.get("username"), data.get("password"));
		
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		if(TestBase.driver!=null){
		TestBase.quitBrowser();
		}
	}
}
