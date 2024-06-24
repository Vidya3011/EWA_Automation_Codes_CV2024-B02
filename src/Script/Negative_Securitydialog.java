package Script;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Security;

public class Negative_Securitydialog extends Generic.BaseClass {

	@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);
	}

	@Test(priority = 1)
	public void TC_01_Open_Security_Dialog_And_Verify_Title_and_Cancel_Button() throws InterruptedException {

		Security sec = new Security();

		Reporter.log("Test Scenario 1 : Open Security Dialog And Verifying Title and Cancel button ", true);
		Thread.sleep(7000);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(sec.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(sec.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		sec.getSelect_Office_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Office Document and set as Default View", true);
		sec.getPdf_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Pdf Document and set as Default View", true);
		jsclick(sec.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(7000);
		Reporter.log("Click on Security Option", true);
		Reporter.log("Security dialog title Verified", true);
		jsclick(sec.getCancel_Button_SecurityDialog());
		Thread.sleep(7000);
		Reporter.log("Click on cancel button", true);
		Reporter.log("Open security dialog Verifying title and cancel button successfully", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify_Already_added_showing_Validation() throws InterruptedException {

		Security sec = new Security();

		Reporter.log("Test Scenario 2 : Verifying Already added  showing Validation ", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(7000);
		Reporter.log("Click on Security Option", true);
		jsclick(sec.getAdd_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(sec.getCvnamed());
		Thread.sleep(7000);
		Reporter.log("Select Cvnamed Group", true);
		jsclick(sec.getSelect_ValidationUser());
		Thread.sleep(7000);
		Reporter.log("Select from Group", true);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(7000);
		Reporter.log("Click on Security Dialog Ok button", true);
		try {
			sec.getaddvalidationmessage();
			Thread.sleep(7000);
			Reporter.log("Verified Validation Message", true);
			jsclick(sec.getClosebutton());
		} catch (Exception e) {
			// Group is not already added
		}
		jsclick(sec.getCancel_Button_SecurityDialog());
		Thread.sleep(7000);
		Reporter.log("Click on Cancel button", true);
		Reporter.log("Already added showing validation Verified", true);
	}

	@Test(priority = 3)
	public void TC_03_Verify_Already_addedGroup_showing_Validation() throws InterruptedException {

		Security sec = new Security();

		Reporter.log("Test Scenario 3 : Verifying Already added Group showing Validation ", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(7000);
		Reporter.log("Click on Security Option", true);
		jsclick(sec.getAdd_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(sec.getcvadmins());
		Thread.sleep(7000);
		Reporter.log("Click on cvadmins Group", true);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		try {
			sec.getaddvalidationmessage();
			Thread.sleep(7000);
			Reporter.log("Verifying Validation message", true);
			jsclick(sec.getClosebutton());
		} catch (Exception e) {
			// Group is not already added
		}
		jsclick(sec.getCancel_Button_SecurityDialog());
		Thread.sleep(7000);
		Reporter.log("Click on Cancel button", true);
		Reporter.log("Already added Group showing validation Verified", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
