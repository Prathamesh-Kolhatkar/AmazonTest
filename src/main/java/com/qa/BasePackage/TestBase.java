package com.qa.BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utility.TestUtil;

public class TestBase {
	
		
		public static WebDriverWait wait;
		
		public static  WebDriver driver;
		
		public static Properties prop;
		
		public TestBase() throws IOException {
			
			try
			{
				prop = new Properties();
			
			FileInputStream ip= new FileInputStream("C:\\Java selenium programs\\AmazonTest\\src\\main\\java\\com\\qa\\config\\config.properties");
			
			prop.load(ip);
			
			}catch(FileNotFoundException e){
				
				e.printStackTrace();
				
			}
		}
		
		
		public static WebDriver initialization()
		{
			String browserName=prop.getProperty("browser");
			
			if(browserName.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","D:\\PRACHI\\Chrome\\ChromeDriver.exe");
				driver = new ChromeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			 //wait = new WebDriverWait(driver,30);
			
			driver.get(prop.getProperty("url"));
			
			
			
		
			return driver;
		}
	}



