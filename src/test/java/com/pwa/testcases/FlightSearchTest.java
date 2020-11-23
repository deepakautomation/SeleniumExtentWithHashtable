package com.pwa.testcases;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pwa.base.TestBase;
import com.pwa.errorcollectors.ErrorCollector;
import com.pwa.pages.actions.HomePage;
import com.pwa.utilities.Utilities;

public class FlightSearchTest extends TestBase{
	
	/*@BeforeTest
	public void setUp(){
		
		Page.initConfiguration();
	}*/
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void flightSearchTest(Hashtable<String,String> data) {
		
		
		System.out.println("Printing no of adults and children : "+data.get("noOfAdults")+"---"+ data.get("noOfChildern"));
		
		HomePage home = new HomePage();
		//Assert.assertEquals(home.findTabCount(), 7);
	/*	ErrorCollector.verifyEquals(home.findTabCount(), 6);
		ErrorCollector.verifyEquals(home.findTabCount(), 7);
		ErrorCollector.verifyEquals(home.findTabCount(), 8);
*/		//ErrorCollector.verifyEquals(home.findTabCount(), 7);
//		home.gotoFlights().bookAFlight(data.get("fromCity"), data.get("toCity"), data.get("fromDate"), data.get("toDate"), data.get("noOfAdults"), data.get("noOfChildern"));
		
		
home.gotoFlights();
		
		
		
		
	}
	
	/*@AfterMethod
	public void tearDown(){
		if(Page.driver!=null){
		Page.quitBrowser();
		}
	}*/
	

}
