package com.qa.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BasePackage.TestBase;
import com.qa.Pages.HomeSearchPage;

public class HomeSearchPageTest extends TestBase{
	
	HomeSearchPage homeSearchPage;

	public HomeSearchPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	@BeforeMethod
	
	public void setUp() throws IOException
	{
		initialization();	
		
	}
	
	@Test
	
	public void verifyTitleOfHomeSearchPage() throws IOException
	{
		boolean value = new HomeSearchPage().logoOfHomeSearchPage();
		
		Assert.assertEquals(value,true);
		
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		
		driver.quit();
	}
}
