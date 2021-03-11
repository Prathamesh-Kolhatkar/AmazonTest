package com.qa.utility;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.qa.BasePackage.TestBase;
import com.qa.Pages.SearchResultsPage;

public class CommonFunctions extends SearchResultsPage{

	public CommonFunctions() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public WebDriver SwitchWindows(WebDriver driver)
	{
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String parentid = it.next();
	    String childid= it.next();
	    driver.switchTo().window(childid);
	    return driver;
	}
}
