package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pom.My_Preferences;

//Dipak Automation Coading

public class My_Preferences_Office_documents extends Generic.BaseClass {

	/*
	 * @BeforeClass
	 * 
	 * public void Launch_Browser() throws Exception { loadBrowser("edge");
	 * launchUrl(); Reporter.log("CVS URL started Successfully.", true); }
	 * 
	 * @Test
	 * 
	 * public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully.", true);
	 * 
	 * }
	 */

	@Test(priority = 1)
	public void TC_01_Verify_Browse_Office_documents_Advancedviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Browse_Office_documents_Advancedviewing();

	}

	@Test(priority = 2)
	public void TC_02_Verify_NewWordDocuments_Office_documents_Advancedviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_NewWordDocuments_Office_documents_Advancedviewing();

	}

	@Test(priority = 3)
	public void TC_03_Verify_NewExcelSpreadsheet_Office_documents_Advancedviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_NewExcelSpreadsheet_Office_documents_Advancedviewing();

	}

	@Test(priority = 4)
	public void TC_04_Verify_Browse_Office_documents_Defaultviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Browse_Office_documents_Defaultviewing();

	}
}
