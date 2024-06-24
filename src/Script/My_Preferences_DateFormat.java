package Script;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.My_Preferences;

public class My_Preferences_DateFormat extends BaseClass {

	@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully", true);

	}

	@Test(priority = 1)
	public void TC_01_Verify_DateFormat_YYYY_MM_DD() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 1 : Verifying Date Format YYYY_MM_DD ", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getYYYY_MM_DD_DateFormat();
		Thread.sleep(7000);
		Reporter.log("Select Date Format and set as YYYY_MM_DD", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.Verify_YYYY_MM_DD_Date();
		Thread.sleep(7000);
		Reporter.log("Verified showing date format YYYY_MM_DD", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("select a Folder", true);
		pojo.Verify_YYYY_MM_DD_Date();
		Thread.sleep(7000);
		Reporter.log("Verified DateFormat YYYY-MM-DD on Search and Folder Documents List", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify_DateFormat_DD_MM_YYYY() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 2 : Verifying Date Format DD_MM_YYYY ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on  Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getDD_MM_YYYY_DateFormat();
		Thread.sleep(7000);
		Reporter.log("Select Date Format and set as DD_MM_YYYY", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.Verify_DD_MM_YYYY_Date();
		Thread.sleep(7000);
		Reporter.log("Verified showing Date format DD_MM_YYYY", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		pojo.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(pojo.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		pojo.Verify_DD_MM_YYYY_Date();
		Thread.sleep(7000);
		Reporter.log("Verified DateFormat DD-MM-YYYY on Search and Folder Documents List", true);

	}

	@Test(priority = 3)
	public void TC_03_Verify_DateFormat_MM_DD_YYYY() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 3 : Verifying Date Format MM_DD_YYYY ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getMM_DD_YYYY_DateFormat();
		Thread.sleep(7000);
		Reporter.log("Select Date Format and set as MM_DD_YYYY", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.Verify_MM_DD_YYYY_Date();
		Thread.sleep(7000);
		Reporter.log("Verified showing MM_DD_YYYY Date FormatClic", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		pojo.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(pojo.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		pojo.Verify_MM_DD_YYYY_Date();
		Thread.sleep(7000);
		Reporter.log("Verified DateFormat MM-DD-YYYY on Search and Folder Documents List", true);

	}

	@Test(priority = 4)
	public void TC_04_Verify_DateFormat_Default() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 4 : Verifying Date Format Default ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getDefault_DateFormat();
		Thread.sleep(7000);
		Reporter.log("Select Date Format and set as Default", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.Verify_Default_Date();
		Thread.sleep(7000);
		Reporter.log("Verified Default Date Format shwoing successfully", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		pojo.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(pojo.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		pojo.Verify_Default_Date();
		Thread.sleep(7000);
		Reporter.log("Verified DateFormat Default on Search and Folder Documents List", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
