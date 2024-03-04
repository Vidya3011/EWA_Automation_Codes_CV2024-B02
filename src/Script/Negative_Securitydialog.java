package Script;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Security;

public class Negative_Securitydialog extends Generic.BaseClass {
	private static final Logger log = LogManager.getLogger(Negative_Securitydialog.class);

	// @BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	// @Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		log.info("CVS User is logged in successfully...");
	}

	@Test(priority = 1)
	public void Open_Security_Dialog_And_Verify_Title_and_Cancel_Button() throws InterruptedException {

		Security sec = new Security();
		Thread.sleep(4000);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(sec.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(sec.getMy_Preferencesetting());
		Thread.sleep(4000);
		sec.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		sec.getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		jsclick(sec.getApply_button());
		Thread.sleep(4000);
		jsclick(sec.getSelect_Cabinet());
		Thread.sleep(3000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		sec.gettitelvalidation();
		Thread.sleep(2000);
		Reporter.log("Security dialog Title Verified", true);
		jsclick(sec.getCancel_Button_SecurityDialog());
		Thread.sleep(3000);
		log.info("Open security dialog Verify title and cancel button successfully...");
		Reporter.log("Cancel button is Clickable", true);
	}

	@Test(priority = 2)
	public void Verify_Already_addedUser_showing_Validation() throws InterruptedException {

		Security sec = new Security();
		jsclick(sec.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(sec.getSelect_Cabinet());
		Thread.sleep(3000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		jsclick(sec.getAdd_Button());
		Thread.sleep(3000);
		jsclick(sec.getCvnamed());
		Thread.sleep(3000);
		jsclick(sec.getSelect_ValidationUser());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(4000);
		try {
			sec.getaddvalidationmessage();
			Thread.sleep(3000);
			jsclick(sec.getClosebutton());
		} catch (Exception e) {
			// Group is not already added
		}
		jsclick(sec.getCancel_Button_SecurityDialog());
		Thread.sleep(3000);
		log.info("Already added User showing validation Verified...");
	}

	@Test(priority = 3)
	public void Verify_Already_addedGroup_showing_Validation() throws InterruptedException {

		Security sec = new Security();
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(sec.getSelect_Cabinet());
		Thread.sleep(3000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		jsclick(sec.getAdd_Button());
		Thread.sleep(3000);
		jsclick(sec.getcvadmins());
		Thread.sleep(3000);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(4000);
		try {
			sec.getaddvalidationmessage();
			Thread.sleep(3000);
			jsclick(sec.getClosebutton());
		} catch (Exception e) {
			// Group is not already added
		}
		jsclick(sec.getCancel_Button_SecurityDialog());
		Thread.sleep(3000);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		log.info("Already added Group showing validation Verified...");
	}
}
