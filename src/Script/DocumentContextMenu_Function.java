package Script;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.Documents_ContextMenu;

public class DocumentContextMenu_Function extends BaseClass {

	private static final Logger log = LogManager.getLogger(DocumentContextMenu_Function.class);

	 @BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}
	 @Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		log.info("CVS User is logged in successfully...");

	}

	@Test(priority = 1)
	public void Verify_TakeOwnership_ReleaseOwnership_OnDocuments() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Thread.sleep(4000);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(4000);
		movingDoublecli(Doc.getCabinet(), Doc.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(Doc.getDrawer(), Doc.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(Doc.getFolder(), Doc.getFolder());
		Thread.sleep(6000);
		log.info("Folder selected successfully");
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(8000);
		Doc.getSelect_Option_TakeOwnership();
		Thread.sleep(6000);
		Reporter.log("The document OwnerShip Taken Successfully");
		jsclick(Doc.getClick_Username());
		Thread.sleep(2000);
		jsclick(Doc.getClick_LogoutOption());
		Thread.sleep(6000);
		Doc.login_New_User();
		Thread.sleep(4000);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(Doc.getMy_Preferencesetting());
		Thread.sleep(4000);
		Doc.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		Doc.getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		jsclick(Doc.getApply_button());
		Thread.sleep(4000);
		movingDoublecli(Doc.getCabinet(), Doc.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(Doc.getDrawer(), Doc.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(Doc.getFolder(), Doc.getFolder());
		Thread.sleep(4000);
		jsclick(Doc.getOpen_Document());
		Thread.sleep(6000);
		Doc.getVerify_Ownership_Message();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(8000);
		jsclick(Doc.getClick_Username());
		Thread.sleep(2000);
		jsclick(Doc.getClick_LogoutOption());
		Thread.sleep(6000);
		LogDipakUser();
		movingDoublecli(Doc.getCabinet(), Doc.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(Doc.getDrawer(), Doc.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(Doc.getFolder(), Doc.getFolder());
		Thread.sleep(4000);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(3000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(3000);
		Doc.getSelect_Option_ReleaseOwnership();
		Thread.sleep(4000);
		jsclick(Doc.getClick_Username());
		Thread.sleep(3000);
		jsclick(Doc.getClick_LogoutOption());
		Thread.sleep(3000);
		Doc.login_New_User();
		movingDoublecli(Doc.getCabinet(), Doc.getCabinet());
		Thread.sleep(2000);
		movingDoublecli(Doc.getDrawer(), Doc.getDrawer());
		Thread.sleep(2000);
		movingDoublecli(Doc.getFolder(), Doc.getFolder());
		Thread.sleep(6000);
		jsclick(Doc.getOpen_Document());
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(8000);
		Reporter.log("Take and Release Ownership Functionality verified Successfully");
		log.info("Take and Release Ownership Functionality verified Successfully");
		jsclick(Doc.getClick_Username());
		Thread.sleep(4000);
		jsclick(Doc.getClick_LogoutOption());
		Thread.sleep(4000);
		LogDipakUser();
		Thread.sleep(4000);
	}

	@Test(priority = 2)
	public void Verify_Refresh_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(6000);
		movingDoublecli(Doc.getCabinet(), Doc.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(Doc.getDrawer(), Doc.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(Doc.getFolder(), Doc.getFolder());
		Thread.sleep(5000);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Doc.getSelect_Option_Refresh();
		Thread.sleep(6000);
		log.info("Refresh Functionality verified Successfully on Documents");
	}

	@Test(priority = 3)
	public void Verify_Categories_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getSelect_Document());
		Thread.sleep(3000);
		Doc.getMoveTo_Menu_Documents();
		Doc.getSelect_Option_Catagories_andSet_Colors();
		log.info("Categories on Documents Functionality verified Successfully");

	}

	@Test(priority = 4)
	public void Verify_copy_and_paste_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Thread.sleep(6000);
		Doc.getMoveTo_Menu_Documents();
		Doc.getVerify_CopyandPaste_Document();
		Thread.sleep(8000);
		log.info("copy and paste documents Functionality verified Successfully");
	}

	@Test(priority = 5)
	public void Verify_cut_and_paste_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Doc.getVerify_CutandPaste_Document();
		Thread.sleep(6000);
		log.info("cut and paste Document Functionality verified Successfully");
	}

	@Test(priority = 6)
	public void Verify_Delete_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.getVerify_Delete_Document();
		Thread.sleep(8000);
		log.info("Document Delete Functionality verified Successfully");
	}

	@Test(priority = 7)
	public void Verify_CreateFavorites_Document() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.getVerify_CreateFavorites_Document();
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(6000);
		Doc.getOpen_CreateFavorites_Document();
		log.info("CreateFavorites Document Functionality verified Successfully");
	}

	//@Test(priority = 8)
	public void Verify_SendToWorkflow_Document() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(4000);
		movingDoublecli(Doc.getCabinet(), Doc.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(Doc.getDrawer(), Doc.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(Doc.getFolder(), Doc.getFolder());
		Thread.sleep(4000);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(5000);
		Doc.getCreate_SendToWorkflow_Document();
		Thread.sleep(6000);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(4000);
		Doc.getVerify_CopyandPaste_Document();
		Thread.sleep(4000);
		jsclick(Doc.getClick_Username());
		Thread.sleep(2000);
		jsclick(Doc.getClick_LogoutOption());
		Thread.sleep(4000);
		Doc.login_Verify_Workflow_User();
		Thread.sleep(4000);
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
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(3000);
		Doc.getVerifyWF();
		Thread.sleep(8000);
		jsclick(Doc.getClick_Username());
		Thread.sleep(3000);
		jsclick(Doc.getClick_LogoutOption());
		Thread.sleep(4000);
		LogDipakUser();
		Thread.sleep(6000);
		log.info("SendToWorkflow Document Functionality verified Successfully");

	}

	@Test(priority = 9)
	public void Verify_Notification_on_Document() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(7000);
		movingDoublecli(Doc.getCabinet(), Doc.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(Doc.getDrawer(), Doc.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(Doc.getFolder(), Doc.getFolder());
		Thread.sleep(6000);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Doc.getMoveTo_Menu_Documents();
		Doc.getVerify_CopyandPaste_Document();
		Thread.sleep(8000);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Doc.getCreate_Notification_Document();
		Thread.sleep(9000);
		Doc.getClick_signature_Menuoption();
		Thread.sleep(2000);
		Doc.getinputpassword();
		Thread.sleep(4000);
		Doc.getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Doc.getSave_Signature_Document();
		Thread.sleep(4000);
		jsclick(Doc.getClose_Document());
		log.info("Notification_on_Document Functionality verified Successfully");

	}

	@Test(priority = 10)
	public void Verify_SendTo_Mail() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(3000);
		movingDoublecli(Doc.getCabinet(), Doc.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(Doc.getDrawer(), Doc.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(Doc.getFolder(), Doc.getFolder());
		Thread.sleep(6000);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(3000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		Doc.getSentTo_Mail_asReference();
		Thread.sleep(3000);
		log.info("SendTo Mail asReference Functionality verified Successfully");
		jsclick(Doc.getSelect_Document());
		Thread.sleep(3000);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(3000);
		Doc.getSentTo_Mail_asCopy();
		Thread.sleep(2000);
		log.info("SendTo Mail asCopy Functionality verified Successfully");
	}

	@Test(priority = 11)
	public void Verify_SendTo_Print() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.getSentTo_Print();
		log.info("SendTo Print Functionality verified Successfully");

	}

	@Test(priority = 12)
	public void Verify_SendTo_Export() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Doc.getSentTo_Export();
		log.info("SendTo Export Functionality verified Successfully");

	}

	@Test(priority = 13)
	public void Verify_SendTo_GenerateDocumentLink() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(3000);
		movingDoublecli(Doc.getCabinet(), Doc.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(Doc.getDrawer(), Doc.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(Doc.getFolder(), Doc.getFolder());
		Thread.sleep(4000);
		Doc.getSentTo_GenerateDocumentLink();
		Thread.sleep(3000);
		jsclick(Doc.getRefreshbutton());
		log.info("SendTo GenerateDocumentLink Functionality verified Successfully");
	}

	@Test(priority = 14)
	public void Verify_SendTo_SecureLink() throws Exception {
		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Thread.sleep(6000);
		movingDoublecli(Doc.getCabinet(), Doc.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(Doc.getDrawer(), Doc.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(Doc.getFolder(), Doc.getFolder());
		Thread.sleep(6000);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(3000);
		Doc.getSentTo_SecureLink();
		log.info("SendTo SecureLink Functionality verified Successfully");
		Thread.sleep(5000);
		jsclick(Doc.getRefreshbutton());
	}
}
