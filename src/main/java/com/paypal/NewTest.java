package com.paypal;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paypal.data.GoogleData;
import com.paypal.page.googlePageElements;
import com.paypal.selion.annotations.WebTest;
import com.paypal.selion.platform.dataprovider.DataProviderFactory;
import com.paypal.selion.platform.dataprovider.DataResource;
import com.paypal.selion.platform.dataprovider.SeLionDataProvider;
import com.paypal.selion.platform.dataprovider.impl.FileSystemResource;
import com.paypal.selion.platform.grid.Grid;

public class NewTest {
	
	@DataProvider(name="googlTestData")
	public Object[][] getGoogleDataProvider() throws IOException {
		DataResource datasource= new FileSystemResource("src/main/resources/testdata/googleData.xlsx",GoogleData.class);
		System.out.println("dataprosdfsdfdvider:");
		SeLionDataProvider dataprovider=null;
		try{
		 dataprovider= DataProviderFactory.getDataProvider(datasource);
		System.out.println("dataprovider:"+dataprovider.getAllData());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(dataprovider.getAllData().length);
		return dataprovider.getAllData();
	}
	
	@DataProvider(name="googlParamData")
	public Object[][] getTestParamertrize() throws IOException {
		DataResource datasource= new FileSystemResource("src/main/resources/testdata/testPrametrize.json",GoogleData.class);
		System.out.println("dataprosdfsdfdvider:");
		SeLionDataProvider dataprovider=null;
		try{
		 dataprovider= DataProviderFactory.getDataProvider(datasource);
		System.out.println("dataprovider:"+dataprovider.getAllData());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(dataprovider.getAllData());
		return dataprovider.getAllData();
	}
	
	
	@Test(dataProvider="googlTestData",enabled=true)
	@WebTest
	public void testGoogleParamerter(GoogleData googleData) throws InterruptedException{
		

		googlePageElements googleElement=new googlePageElements("US");
		Grid.driver().get("http://www.google.com");		
		googleElement.getGoogleTextField().type(googleData.getSearchData());
		googleElement.getSearchButton().click();
		  Thread.sleep(5000);
		  
		  
	}
	
	
	
		
	@Test(dataProvider="googlParamData",enabled=true)
	@WebTest
	public void testGoogleSearch(GoogleData googleData) throws InterruptedException{
		

		googlePageElements googleElement=new googlePageElements("US");
		Grid.driver().get("http://www.google.com");		
		googleElement.getGoogleTextField().type(googleData.getSearchData());
		googleElement.getSearchButton().click();
		  Thread.sleep(5000);
	
		
		  
		  
	}
	


}

