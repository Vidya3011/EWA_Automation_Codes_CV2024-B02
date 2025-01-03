package Computhink.Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.My_Preferences;

public class Split_Merge_Documents extends BaseClass {

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
