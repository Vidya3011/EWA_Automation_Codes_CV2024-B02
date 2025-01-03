package Computhink.Script;

//Dipak Automation Coading


import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.My_Preferences;

public class Split_Merge_Documents extends BaseClass {

	
	@BeforeClass
	public void loadBrowser() throws Exception {
		loadBrowser("Chrome");

		//log.info("Chrome Browser Launched");
		Reporter.log("Chrome Browser launched Successfully...");
		launch47Url();
		// launchLocalUrl();
		Reporter.log("Contentverse URL launched successfully...");
	//	log.info("Contentverse URL launched successfully...");
	}

	@Test(priority = 1)
	public void Login() throws Exception {
	
		//LogoutPage();
		loginRNISHA47();
		
		Reporter.log("User logged in successfully... ");
		//log.info("Rnisha user logged in 'CVWin19Server.Win2019_TestRoom'successfully... ");
	}



	/*
	 * @BeforeClass
	 * 
	 * public void Launch_Browser() throws Exception { loadBrowser("edge");
	 * launchUrl(); Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test
	 * 
	 * public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully.", true);
	 * 
	 * }
	 */

	@Test(priority = 1)

	public void Create_PDF_Document() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Create_PDF_Document();
	}

	//@Test(priority = 2)
	public void TC_02_Verify_CopyPaste_Viewer() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_CopyPaste_Viewer();
	}

	@Test(priority = 3)
	public void TC_03_Verify_Split_Merge_Viewer() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Split_Merge_Viewer();

	public void Create_Documents() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Create_Documents_SplitMerge();
	}

	@Test(priority = 2)
	public void TC_02_Select_PdfPage_And_Verify_SplitAll() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Select_PdfPage_SplitAll();

	}
}
