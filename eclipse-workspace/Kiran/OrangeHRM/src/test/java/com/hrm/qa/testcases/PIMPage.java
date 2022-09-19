package com.hrm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.hrm.qa.pages.LoginPage;
import com.hrm.qa.pages.PIM;
import com.hrm.qa.testbase.Testbase;

public class PIMPage extends Testbase {

	
	LoginPage log;
	PIM pim;
	
	public PIMPage() {
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException{
		initialization();
		log=new LoginPage(d);
		log.enterusername();
		Thread.sleep(5000);
		log.enterpassword();
		Thread.sleep(5000);
		log.Clickonloginbtn();
	}
	
	@AfterMethod
	public void teardown() {
		d.quit();
	}
}
