package com.qa.Pages;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.qa.BasePackage.TestBase;
import com.qa.utility.CommonFunctions;

public class SearchResultsPage extends TestBase{
	
	CommonFunctions CF;

	public SearchResultsPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}

	
	public String selectSearchedProduct()
	{
		driver.findElement(By.xpath("//*[contains(text(),'New Apple iPhone 12 (64GB) - Green')]")).click();
		
		//driver=CF.SwitchWindows(SearchResultsPage.driver);
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String parentid = it.next();
	    String childid= it.next();
	    driver.switchTo().window(childid);
		
		String title= driver.getTitle();
		
		return title;
		
	}
}
