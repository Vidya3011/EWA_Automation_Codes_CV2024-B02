package Computhink.Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.My_Preferences;

//Dipak Automation Coading

public class My_preferences_Pdf_documents extends Computhink.Generic.BaseClass {




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
	public void TC_01_Verify_Browse_Pdf_documents_Advancedviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Browse_Pdf_documents_Advancedviewing();

	}

	@Test(priority = 2)
	public void TC_02_Verify_Create_New_pdf_document_Advancedviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Create_New_pdf_document_Advancedviewing();

	}

	@Test(priority = 3)
	public void TC_03_Verify_Browse_PDF_documents_Defaultviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Browse_PDF_documents_Defaultviewing();
	}
}
