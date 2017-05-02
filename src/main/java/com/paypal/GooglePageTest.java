package com.paypal;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.paypal.data.*;
import com.paypal.page.googlePageElements;
import com.paypal.page.paypal;
import com.paypal.page.selioio;
import com.paypal.selion.annotations.WebTest;
import com.paypal.selion.platform.asserts.SeLionAsserts;
import com.paypal.selion.platform.dataprovider.DataProviderFactory;
import com.paypal.selion.platform.dataprovider.impl.FileSystemResource;
import com.paypal.selion.platform.grid.Grid;
import com.paypal.selion.platform.html.TextField;
import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import com.paypal.selion.platform.dataprovider.DataResource;
import com.paypal.selion.platform.dataprovider.SeLionDataProvider;


public class GooglePageTest {
	
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
	
	
	
	  @DataProvider(name = "Parameterize")
	  
	  public static Object[][] credentials() {
	 
	        return new Object[][] { { "searchData", "IPL" }, { "searchData", "Selion" }};
	 
	  }
	@DataProvider(name="paypalData")
	public Object[][] getpaypalDataProvider() throws IOException {
		DataResource datasource= new FileSystemResource("src/main/resources/testdata/paypaldata.json",PayPalData.class);
		System.out.println("dataprosdfsdfdvider:");
		SeLionDataProvider dataprovider=null;
		try{
		 dataprovider= DataProviderFactory.getDataProvider(datasource);
		System.out.println("dataprovider:"+dataprovider.getAllData());
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return dataprovider.getAllData();
	}
	
/*	
	@Test(dataProvider="googlParamData",enabled=true)
	@WebTest
	public void testGoogleSearch(GoogleData googleData) throws InterruptedException{
		

		googlePageElements googleElement=new googlePageElements("US");
		Grid.driver().get("http://www.google.com");		
		googleElement.getGoogleTextField().type(googleData.getSearchData());
		googleElement.getSearchButton().click();
		  Thread.sleep(5000);
		googleElement.getFirstLink().click();
		Thread.sleep(3000);
		Grid.driver().getTitle();
		
		  
		  
	}*/
	
	@Test(dataProvider="googlTestData",enabled=true)
	@WebTest
	public void testGoogleParamerter(GoogleData googleData) throws InterruptedException{
		

		googlePageElements googleElement=new googlePageElements("US");
		Grid.driver().get("http://www.google.com");		
		googleElement.getGoogleTextField().type(googleData.getSearchData());
		googleElement.getSearchButton().click();
		
		  
		  
	}
	


	
	/*@Test(dataProvider="paypalData",enabled=true	)
	@WebTest
	public void testPaypalLogin(PayPalData loginData) throws InterruptedException{
		
		Grid.driver().get("https://www.paypal.com/in/home");
		paypal payPal=new paypal("US");	
		payPal.getLoginButton().click();
		Thread.sleep(5000);
		payPal.getUserIDTextField().type(loginData.getLoginID());
		payPal.getPasswordTextField().type(loginData.getPassword());
		Thread.sleep(3000);
		payPal.getSignButton().click();
		Thread.sleep(5000);
			
		 
	}
	
	
	@Test(dataProvider="paypalData",enabled=true	)
	@WebTest
	public void testSelion(PayPalData loginData) throws InterruptedException{
		
		Grid.driver().get("http://paypal.github.io/SeLion/");
		selioio seLioio=new selioio("US");
		
		Thread.sleep(5000);
		Grid.driver().manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)Grid.driver();
		jse.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(5000);
		seLioio.getUserIDLink().click();
		//Grid.driver().getTitle();
		Thread.sleep(5000);
		Grid.driver().navigate().back();
		Thread.sleep(5000);
		seLioio.getViewLink().click();
			
		 
	}
	*/

}
