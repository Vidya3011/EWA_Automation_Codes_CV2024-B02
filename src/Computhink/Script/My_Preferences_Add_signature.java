package Computhink.Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Generic.BaseClass;
import Computhink.Pom.My_Preferences;

public class My_Preferences_Add_signature extends BaseClass {

<<<<<<< HEAD
	/*
	 * @BeforeClass
	 * 
	 * public void Launch_Browser() throws Exception { loadBrowser("edge");
	 * launchUrl(); Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test
	 * 
	 * public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully", true);
	 * 
	 * }
	 */
=======
	/*@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("edge");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully", true);

	}*/
>>>>>>> origin/Dipak-Pandurang-Gawali

	@Test(priority = 1)
	public void TC_01_Verify_Upload_New_Signature() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Upload_New_Signature();

	}

	@Test(priority = 2)
	public void TC_02_Verify_Type_New_Signature() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Type_New_Signature();

	}
}
