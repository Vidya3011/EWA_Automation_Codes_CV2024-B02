package Script;

//Dipak Automation Coading

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.Documents_ContextMenu;

public class Offline_Document extends BaseClass {

	/*
	 * @BeforeClass public void Launch_Browser() throws Exception {
	 * loadBrowser("edge"); launchUrl();
	 * Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test
	 * 
	 * public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully.", true); }
	 */

	@Test(priority = 1)
	public void TC_01_Create_OfflineDocument() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Create_OfflineDocument();
	}

	@Test(priority = 2)
	public void TC_02_Sync_New_Document_onOffline_Doc() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Sync_New_Document_onOffline_Doc();
	}

	@Test(priority = 3)
	public void TC_03_Open_Offline_Doc() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Open_Offline_Doc();
	}

	@Test(priority = 4)
	public void TC_04_Release_Offline_Doc() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Release_Offline_Doc();
	}
}
