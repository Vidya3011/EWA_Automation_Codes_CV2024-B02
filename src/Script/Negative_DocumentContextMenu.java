package Script;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.Documents_ContextMenu;

public class Negative_DocumentContextMenu extends BaseClass {

	private static final Logger log = LogManager.getLogger(Negative_DocumentContextMenu.class);

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
	public void Verify_BlankToemailID() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Thread.sleep(2000);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(3000);
		movingDoublecli(Doc.getCabinet(), Doc.getCabinet());
		Thread.sleep(2000);
		movingDoublecli(Doc.getDrawer(), Doc.getDrawer());
		Thread.sleep(2000);
		movingDoublecli(Doc.getFolder(), Doc.getFolder());
		Thread.sleep(6000);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(3000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		Doc.getVerify_SendTo_Blankemailid();
		Thread.sleep(2000);
		Doc.getmessagevalidation();
		log.info("Blank TOEmail ID Verified successfully");
	}

	@Test(priority = 2)
	public void Verify_InvalidToEmailId() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Thread.sleep(2000);
		Doc.getVerify_SendTo_InvalidEmail();
		Thread.sleep(3000);
		Doc.getmessagevalidationInvalid();
		log.info("Invalid TOEmail ID Verified successfully");
	}

	@Test(priority = 3)
	public void Verify_InvalidCCEmailId() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Thread.sleep(2000);
		Doc.getVerify_SendTo_InvalidCCEmail();
		Thread.sleep(2000);
		Doc.getmessagevalidationCCEmailInvalid();
		log.info("Invalid CCEmail ID Verified successfully");
	}

	@Test(priority = 4)
	public void Verify_MailDialog_Cancel_button() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Thread.sleep(2000);
		jsclick(Doc.getDialogCancel());
		log.info("Mail dialog Cancel button Verified successfully");
	}

	@Test(priority = 5)
	public void Verify_PrintDialog_Cancel_button() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Thread.sleep(2000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		Doc.getSentTo_PrintValidation();
		Thread.sleep(2000);
		jsclick(Doc.getPrintDialogCancel());
		log.info("Print dialog Cancel button Verified successfully");
	}

	@Test(priority = 6)
	public void Verify_ExportDialog_Cancel_button() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Thread.sleep(2000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		Doc.getSentTo_ExportCancel();
		Thread.sleep(2000);
		jsclick(Doc.getDialogCancel());
		log.info("Export dialog Cancel button Verified successfully");
	}

	@Test(priority = 7)
	public void Verify_SecureLink_mailvalidation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Thread.sleep(2000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		Doc.get_SecureLinkblankmail_Validation();
		Thread.sleep(2000);
		Doc.getmessagevalidationBlankmail();
		Thread.sleep(2000);
		Doc.getenter_SecureLinkRecipientaddress();
		Thread.sleep(2000);
		Doc.getmessagevalidationConfirmmail();
		Thread.sleep(2000);
		Doc.getClearRecipientmail();
		Thread.sleep(2000);
		Doc.getenter_validemailmessage();
		Thread.sleep(2000);
		Doc.getVerifyMismatch_SecureLink_Confirmmail();
		Thread.sleep(2000);
		Doc.get_Mismatch_validation();
		Thread.sleep(2000);
		Doc.get_Confirmmail_Invalid();
		Thread.sleep(2000);
		Doc.get_Mismatch_validation();
		Thread.sleep(2000);
		Doc.get_EnterConfirmmail();
		Thread.sleep(2000);
		jsclick(Doc.getSecureOK());
		Thread.sleep(2000);
		Doc.get_Mismatch_validation();
		Doc.getRecepientEmail_SecureLink();
		Thread.sleep(2000);
		Doc.get_Mismatch_validation();
		Doc.getRecepietConfirmEmail_SecureLink();
		Thread.sleep(2000);
		Doc.get_Mismatch_validation();
		Doc.getRecepietConfirmEmailInvalid_SecureLink();
		Thread.sleep(2000);
		Doc.get_Mismatch_validation();
		Thread.sleep(2000);
		Doc.getenterConfirmRecepietEmail_SecureLink();
		Thread.sleep(2000);
		try {
			jsclick(Doc.getSecureMessageOK());
			Thread.sleep(2000);
			jsclick(Doc.getSecureDialogCancel());
		} catch (Exception e1) {
			// Secure link not send

		}
		log.info("Securelink Mail validation Verified successfully");
	}

	@Test(priority = 8)
	public void Verify_Accept_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(5000);
		jsclick(Doc.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(Doc.getMy_Preferencesetting());
		Thread.sleep(4000);
		Doc.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		Doc.getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		jsclick(Doc.getApply_button());
		Thread.sleep(6000);
		Doc.MoveTo_ToDoList_Option();
		jsclick(Doc.getSelect_All_Item());
		Thread.sleep(6000);
		jsclick(Doc.getOpen_ToDoDocument());
		Thread.sleep(7000);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(5000);
		Doc.getVerifyAccept();
		Thread.sleep(2000);
		Doc.get_comment_Validation();
		Thread.sleep(2000);
		jsclick(Doc.getwfactionCancel());
		Thread.sleep(2000);
		log.info("Accept workflow validation Verified successfully");
	}

	@Test(priority = 9)
	public void Verify_Reject_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.getVerifyReject();
		Thread.sleep(2000);
		Doc.get_comment_Validation();
		Thread.sleep(2000);
		jsclick(Doc.getwfactionCancel());
		Thread.sleep(2000);
		log.info("Reject workflow validation Verified successfully");

	}

	@Test(priority = 10)
	public void Verify_EndWorkflow_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.getVerifyEndWorkflow();
		Thread.sleep(2000);
		Doc.get_comment_Validation();
		Thread.sleep(2000);
		jsclick(Doc.getwfactionCancel());
		Thread.sleep(2000);
		log.info("End workflow validation Verified successfully");

	}

	@Test(priority = 11)
	public void Verify_Summary_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.getverifySummary();
		Thread.sleep(2000);
		jsclick(Doc.getSummaryCancel());
		Thread.sleep(3000);
		log.info("Summary workflow validation Verified successfully");
	}

	@Test(priority = 12)
	public void Verify_Comment_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.getverifyComment();
		Thread.sleep(2000);
		Doc.get_comment_Validation();
		Thread.sleep(2000);
		jsclick(Doc.getwfactionCancel());
		Thread.sleep(2000);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(5000);
		log.info("Comment workflow validation Verified successfully");
	}
}
