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

public class Negative_DocumentContextMenu extends BaseClass {

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
	public void TC_01_Verify_BlankToemailID() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_BlankToemailID();
	}

	@Test(priority = 2)
	public void TC_02_Verify_InvalidToEmailId() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_InvalidToEmailId();
	}

	@Test(priority = 3)
	public void TC_03_Verify_InvalidCCEmailId() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_InvalidCCEmailId();
	}

	@Test(priority = 4)
	public void TC_04_Verify_MailDialog_Cancel_button() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_MailDialog_Cancel_button();

	}

	@Test(priority = 5)
	public void TC_05_Verify_PrintDialog_Cancel_button() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_PrintDialog_Cancel_button();

	}

	@Test(priority = 6)
	public void TC_06_Verify_Export_Dialog_Cancel_button() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_ExportDialog_Cancel_button();

	}

	@Test(priority = 7)
	public void TC_07_Verify_SecureLink_mailvalidation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_SecureLink_mailvalidation();

	}

	@Test(priority = 8)
	public void TC_08_Verify_Accept_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_Accept_Workflow_Validation();

	}

	@Test(priority = 9)
	public void TC_09_Verify_Reject_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_Reject_Workflow_Validation();

	}

	@Test(priority = 10)
	public void TC_10_Verify_EndWorkflow_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_EndWorkflow_Workflow_Validation();
	}

	@Test(priority = 11)
	public void TC_11_Verify_Summary_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_Summary_Workflow_Validation();
	}

	@Test(priority = 12)
	public void TC_12_Verify_Comment_Workflow_Validation() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.Verify_Comment_Workflow_Validation();
	}
}
