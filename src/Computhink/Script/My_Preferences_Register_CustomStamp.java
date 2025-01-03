package Computhink.Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.My_Preferences;

public class My_Preferences_Register_CustomStamp extends BaseClass {

<<<<<<< HEAD
	/*@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("edge");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}*/
	
=======
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

>>>>>>> origin/Dipak-Pandurang-Gawali
	@Test(priority = 1)
	public void TC_01_Verify_Register_Custom_Stamp_UI_and_UploadStamp() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Register_Custom_Stamp_UI_and_UploadStamp();
	}

	@Test(priority = 2)
	public void TC_02_Add_Register_Custom_Stamp_LeadViewer() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Add_Register_Custom_Stamp_LeadViewer();
	}

	@Test(priority = 3)
	public void TC_03_Add_Register_Custom_Stamp_AdvancedViewer() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Add_Register_Custom_Stamp_AdvancedViewer();
	}

	@Test(priority = 4)
	public void TC_04_Reset_Register_Custom_Stamp() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Reset_Register_Custom_Stamp();
	}
}
