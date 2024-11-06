package Computhink.Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.Security;

public class Negative_Securitydialog extends Computhink.Generic.BaseClass {

	/*
	 * @BeforeClass
	 * 
	 * public void Launch_Browser() throws Exception { loadBrowser("edge");
	 * launchUrl(); Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test
	 * 
	 * public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully.", true); }
	 */

	@Test(priority = 1)
	public void TC_01_Open_Security_Dialog_And_Verify_Title_and_Cancel_Button() throws Exception {

		Security sec = new Security();
		sec.Security_Dialog_Cancel_Button();

	}

	@Test(priority = 2)
	public void TC_02_Verify_Already_added_showing_Validation() throws Exception {

		Security sec = new Security();
		sec.Added_Users_Validation();

	}

	@Test(priority = 3)
	public void TC_03_Verify_Already_addedGroup_showing_Validation() throws Exception {

		Security sec = new Security();
		sec.Added_Group_Validation();
	}
}
