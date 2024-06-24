package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.Documents_ContextMenu;

public class Negative_DocumentContextMenu extends BaseClass {

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
	public void TC_01_Verify_BlankToemailID() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 1 : Verifying Blank To email ID ", true);
		Thread.sleep(9000);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Doc.getSelect_Cabinet());
		Thread.sleep(9000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Doc.getSelect_Drawer());
		Thread.sleep(9000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Doc.getSelect_Folder());
		Thread.sleep(9000);
		Reporter.log("select a Folder", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(9000);
		Reporter.log("Check Document name ", true);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(9000);
		Reporter.log("Mousehover to Documents Tab", true);
		Doc.getVerify_SendTo_Blankemailid();
		Thread.sleep(9000);
		Reporter.log("Verified Send To Blank Email ID", true);
		Doc.getmessagevalidation();
		Reporter.log("Verified Message Validation", true);
		Reporter.log("Blank TOEmail ID Verified successfully", true);
	}

	@Test(priority = 2)
	public void TC_02_Verify_InvalidToEmailId() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 2 : Verifying Invalid To Email Id ", true);
		Thread.sleep(9000);
		Doc.getVerify_SendTo_InvalidEmail();
		Thread.sleep(9000);
		Reporter.log("Verified Send To Invalid Email ID", true);
		Doc.getmessagevalidationInvalid();
		Reporter.log("Verified message validation", true);
		Reporter.log("Invalid TOEmail ID Verified successfully", true);
	}

	@Test(priority = 3)
	public void TC_03_Verify_InvalidCCEmailId() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 3 : Verifying Invalid CC Email Id", true);
		Thread.sleep(9000);
		Doc.getVerify_SendTo_InvalidCCEmail();
		Thread.sleep(9000);
		Reporter.log("Verified Invalid Send TO CC Email ID", true);
		Doc.getmessagevalidationCCEmailInvalid();
		Reporter.log("Verified message validation cc Invalid Email", true);
		Reporter.log("Invalid CCEmail ID Verified successfully", true);
	}

	@Test(priority = 4)
	public void TC_04_Verify_MailDialog_Cancel_button() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 4: Verifying Mail Dialog Cancel button ", true);
		Thread.sleep(9000);
		jsclick(Doc.getDialogCancel());
		Reporter.log("Click on  Mail dialog Cancel button", true);
		Reporter.log("Mail dialog Cancel button Verified successfully", true);
	}

	@Test(priority = 5)
	public void TC_05_Verify_PrintDialog_Cancel_button() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 5 : Verifying Print Dialog Cancel button ", true);
		Thread.sleep(9000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(9000);
		Reporter.log("Mousehover to Document Tab", true);
		Doc.getSentTo_PrintValidation();
		Thread.sleep(9000);
		Reporter.log("Verified Send to Print Validation", true);
		jsclick(Doc.getPrintDialogCancel());
		Reporter.log("Click on  Print dialog Cancel button", true);
		Reporter.log("Print dialog Cancel button Verified successfully", true);
	}

	@Test(priority = 6)
	public void TC_06_Verify_ExportDialog_Cancel_button() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 6 : Verifying Export Dialog Cancel button ", true);
		Thread.sleep(9000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(9000);
		Reporter.log("Mousehover to Document Tab", true);
		Doc.getSentTo_ExportCancel();
		Thread.sleep(9000);
		Reporter.log("Click on Send TO Export Option", true);
		jsclick(Doc.getDialogCancel());
		Reporter.log("Click on Export dialog Cancel button", true);
		Reporter.log("Export dialog Cancel button Verified successfully", true);
	}

	@Test(priority = 7)
	public void TC_07_Verify_SecureLink_mailvalidation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 7 : Verifying SecureLink mail validation ", true);
		Thread.sleep(9000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(9000);
		Reporter.log("Mousehover to Document Tab", true);
		Doc.get_SecureLinkblankmail_Validation();
		Thread.sleep(9000);
		Reporter.log("Verified Secure Link Mail Validation", true);
		Doc.getmessagevalidationBlankmail();
		Thread.sleep(9000);
		Reporter.log("Verified message validation blank Mail", true);
		Doc.getenter_SecureLinkRecipientaddress();
		Thread.sleep(9000);
		Reporter.log("Enter  Secure link Recipient address", true);
		Doc.getmessagevalidationConfirmmail();
		Thread.sleep(9000);
		Reporter.log("Verified message validation Confirm mail", true);
		Doc.getClearRecipientmail();
		Thread.sleep(9000);
		Reporter.log("Verifying and clear Recipient Mail address", true);
		Doc.getenter_validemailmessage();
		Thread.sleep(9000);
		Reporter.log("Enter  Validation message", true);
		Doc.getVerifyMismatch_SecureLink_Confirmmail();
		Thread.sleep(9000);
		Reporter.log("Verified Mismatch secure link Confirm mail", true);
		Doc.get_Mismatch_validation();
		Thread.sleep(9000);
		Reporter.log("Verified Mismatch Validation", true);
		Doc.get_Confirmmail_Invalid();
		Thread.sleep(9000);
		Reporter.log("Enter Confirm mail Invalid", true);
		Doc.get_Mismatch_validation();
		Thread.sleep(9000);
		Reporter.log("Verified Mismatch Validation", true);
		Doc.get_EnterConfirmmail();
		Thread.sleep(9000);
		Reporter.log("Enter Confirm Mail ", true);
		jsclick(Doc.getSecureOK());
		Thread.sleep(9000);
		Reporter.log("Click on Secure OK button", true);
		Doc.get_Mismatch_validation();
		Reporter.log("Verified Mismatch Validation", true);
		Doc.getRecepientEmail_SecureLink();
		Thread.sleep(9000);
		Reporter.log("Enter Recepient Email securelink", true);
		Doc.get_Mismatch_validation();
		Reporter.log("Verified Mismatch Validation", true);
		Doc.getRecepietConfirmEmail_SecureLink();
		Thread.sleep(9000);
		Reporter.log("Enter Recepient Confirm mail", true);
		Doc.get_Mismatch_validation();
		Reporter.log("Verified Mismatch Validation", true);
		Doc.getRecepietConfirmEmailInvalid_SecureLink();
		Thread.sleep(9000);
		Reporter.log("Enter Invalid Recepient Confirm mail", true);
		Doc.get_Mismatch_validation();
		Thread.sleep(9000);
		Reporter.log("Verified Mismatch Validation", true);
		Doc.getenterConfirmRecepietEmail_SecureLink();
		Thread.sleep(9000);
		Reporter.log("Enter Confirm Recepient Email", true);
		try {
			jsclick(Doc.getSecureMessageOK());
			Thread.sleep(9000);
			Reporter.log("Click on Secure message Ok button", true);
			jsclick(Doc.getSecureDialogCancel());
		} catch (Exception e1) {
			// Secure link not send

		}
		Reporter.log("Securelink Mail validation Verified successfully", true);
	}

	@Test(priority = 8)
	public void TC_08_Verify_Accept_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 8 : Verifying Accept Workflow Validation ", true);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(9000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Doc.getSetting_Icon());
		Thread.sleep(9000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(Doc.getMy_Preferencesetting());
		Thread.sleep(9000);
		Reporter.log("Click on My Preferences", true);
		Doc.getSelect_Office_document_Defaultviewing();
		Thread.sleep(9000);
		Reporter.log("Select Office document and set as Default View", true);
		Doc.getPdf_document_Defaultviewing();
		Thread.sleep(9000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(Doc.getApply_button());
		Thread.sleep(6000);
		Reporter.log("Click on  Apply button", true);
		Doc.MoveTo_ToDoList_Option();
		Reporter.log("Move to  To Do List Tab ", true);
		jsclick(Doc.getSelect_All_Item());
		Thread.sleep(6000);
		Reporter.log("Click on All Item Option", true);
		jsclick(Doc.getOpen_ToDoDocument());
		Thread.sleep(9000);
		Reporter.log("Select and Open To Do List Document", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Reporter.log("Document open successfully ", true);
		Thread.sleep(9000);
		Doc.getVerifyAccept();
		Thread.sleep(9000);
		Reporter.log("Verified Accept Tab", true);
		Doc.get_comment_Validation();
		Thread.sleep(9000);
		Reporter.log("Verified Comment Validation", true);
		jsclick(Doc.getwfactionCancel());
		Thread.sleep(9000);
		Reporter.log("Verified Accept Workflow action Cancel button", true);
		Reporter.log("Accept workflow validation Verified successfully");
	}

	@Test(priority = 9)
	public void TC_09_Verify_Reject_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 9 : Verifying Reject Workflow Validation", true);
		Doc.getVerifyReject();
		Thread.sleep(9000);
		Reporter.log("Verified Reject Tab", true);
		Doc.get_comment_Validation();
		Thread.sleep(9000);
		Reporter.log("Verified Comment Validation", true);
		jsclick(Doc.getwfactionCancel());
		Thread.sleep(9000);
		Reporter.log("Verified Reject Workflow action Cancel button", true);
		Reporter.log("Reject workflow validation Verified successfully", true);

	}

	@Test(priority = 10)
	public void TC_10_Verify_EndWorkflow_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 10 : Verifying EndWorkflow Workflow Validation ", true);
		Doc.getVerifyEndWorkflow();
		Thread.sleep(9000);
		Reporter.log("Verified End Workflow Tab", true);
		Doc.get_comment_Validation();
		Thread.sleep(9000);
		Reporter.log("Verified Comment Validation", true);
		jsclick(Doc.getwfactionCancel());
		Thread.sleep(9000);
		Reporter.log("Verified End Workflow Action Cancel button", true);
		Reporter.log("End workflow validation Verified successfully", true);

	}

	@Test(priority = 11)
	public void TC_11_Verify_Summary_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 11 : Verifying Summary Workflow Validation", true);
		Doc.getverifySummary();
		Thread.sleep(9000);
		Reporter.log("Verified Workflow Summary Tab", true);
		jsclick(Doc.getSummaryCancel());
		Thread.sleep(9000);
		Reporter.log("Verified Workflow Summary Cancel button", true);
		Reporter.log("Summary workflow validation Verified successfully", true);
	}

	@Test(priority = 12)
	public void TC_12_Verify_Comment_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 12 : Verifying Comment Workflow Validation ", true);
		Doc.getverifyComment();
		Thread.sleep(9000);
		Reporter.log("Verified Workflow Comment Tab", true);
		Doc.get_comment_Validation();
		Thread.sleep(9000);
		Reporter.log("Verified Workflow Comment Validation", true);
		jsclick(Doc.getwfactionCancel());
		Thread.sleep(9000);
		Reporter.log("Click on  Workflow action Cancel button", true);
		Reporter.log("Comment workflow validation Verified successfully", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
