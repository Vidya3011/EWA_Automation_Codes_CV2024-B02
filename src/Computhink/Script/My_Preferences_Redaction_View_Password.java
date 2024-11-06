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

public class My_Preferences_Redaction_View_Password extends BaseClass {

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
	public void TC_01_Verify_Redaction_View_Password() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.MyPreferences_Verify_Redaction_View_Password();

	}

	@Test(priority = 2)
	public void TC_02_Verify_Reset_My_Preferences() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Reset_My_Preferences();
	}
}
