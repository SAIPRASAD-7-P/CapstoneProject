package com.cra.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class logintestcase extends TestBase{
	LoginPage LoginPage;
	HomePage HomePage;
	
	public logintestcase(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws IOException{
		initialization();
		LoginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title = LoginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "#1 Free CRM Power Up your Entire Business Free Forever");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag = LoginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest(){
		HomePage = LoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	
	@AfterMethod
	public void tearDown(){
		//driver.close();
		driver.quit();
	}
	
}
