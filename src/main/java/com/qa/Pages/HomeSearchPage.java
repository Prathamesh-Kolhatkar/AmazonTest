package com.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BasePackage.TestBase;

public class HomeSearchPage extends TestBase{
	
	//PAGE FACTORY OR OBJECT REPOSITORY

	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement SearchButton;
	
	@FindBy(id="nav-logo-sprites")
	WebElement AmazonLogo;
	
	public HomeSearchPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}

	
	public SearchResultsPage SearchAProduct() throws IOException
	{
		SearchBox.sendKeys("Iphone12");
		SearchButton.click();
		
		return new SearchResultsPage();
		
		
	}
	
	
	public boolean logoOfHomeSearchPage()
	{
		
	return AmazonLogo.isDisplayed();
		
	}
	
	
	
}
