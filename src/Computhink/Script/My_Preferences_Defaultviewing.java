package Computhink.Script;

<<<<<<< HEAD
//Dipak Automation Coading

=======
>>>>>>> origin/Dipak-Pandurang-Gawali
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.My_Preferences;

<<<<<<< HEAD
//Dipak Automation script
=======
//Dipak Automation Coading
>>>>>>> origin/Dipak-Pandurang-Gawali

public class My_Preferences_Defaultviewing extends Computhink.Generic.BaseClass {

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
	public void TC_01_Verify_Defaultviewing_Convert_To_PDF() throws Exception {

		My_Preferences pojo = new My_Preferences();
<<<<<<< HEAD

=======
>>>>>>> origin/Dipak-Pandurang-Gawali
		pojo.Verify_Defaultviewing_Convert_To_PDF();

	}

	@Test(priority = 2)
	public void TC_02_Verify_Defaultviewing_Native_Format() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Defaultviewing_Native_Format();
	}
}
