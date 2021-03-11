package com.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BasePackage.TestBase;
import com.qa.Pages.HomeSearchPage;
import com.qa.Pages.SearchResultsPage;

public class SearchResultsPageTest extends TestBase{

	public SearchResultsPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	
	public void setUp() throws IOException
	{
		initialization();	
		
	}
	
	@Test
	
	public void verifyTitleOfSearchedProductTest() throws IOException
	{
		SearchResultsPage searchResultPage =new HomeSearchPage().SearchAProduct();
		
		String title = searchResultPage.selectSearchedProduct();
		
		Assert.assertEquals(title, "New Apple iPhone 12 (64GB) - Green: Amazon.in", "Title is not matching means product selected is wrong");
		
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		
		driver.quit();
	}
	
	

}
