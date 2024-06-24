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

public class DocumentContextMenu_Function extends BaseClass {

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
	public void TC_01_Verify_TakeOwnership_ReleaseOwnership_OnDocuments() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 1 : Verifying Take Ownership and Release Ownership On Document", true);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Doc.getSelect_Cabinet());
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Doc.getSelect_Drawer());
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Doc.getSelect_Folder());
		Thread.sleep(6000);
		Reporter.log("Expand a Folder", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List ", true);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		Doc.getSelect_Option_TakeOwnership();
		Thread.sleep(6000);
		Reporter.log("Click on Take Ownership Option", true);
		Reporter.log("Document OwnerShip Taken Successfully");
		jsclick(Doc.getClick_Username());
		Thread.sleep(2000);
		Reporter.log("Click on Username", true);
		jsclick(Doc.getClick_LogoutOption());
		Thread.sleep(6000);
		Reporter.log("Click on Logout Option", true);
		Doc.login_New_User();
		Thread.sleep(6000);
		Reporter.log("Login EWA with New User Credential", true);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Doc.getMy_Preferencesetting());
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		Doc.getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office Document and set as Default View", true);
		Doc.getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and Set as Default View", true);
		jsclick(Doc.getApply_button());
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		selectElement(Doc.getSelect_Cabinet());
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Doc.getSelect_Drawer());
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Doc.getSelect_Folder());
		Thread.sleep(10000);
		Reporter.log("Expand a Folder", true);
		jsclick(Doc.getOpen_Document());
		Thread.sleep(6000);
		Reporter.log("Select and Open Document from Document List", true);
		Doc.getVerify_Ownership_Message();
		Thread.sleep(6000);
		Reporter.log("Verified Document is in Ownership", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		Reporter.log("Document Open successfully and verified", true);
		jsclick(Doc.getClick_Username());
		Thread.sleep(2000);
		Reporter.log("Click on Username", true);
		jsclick(Doc.getClick_LogoutOption());
		Thread.sleep(6000);
		Reporter.log("Click on Logout Option", true);
		LogDipakUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with another user Credential", true);
		selectElement(Doc.getSelect_Cabinet());
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Doc.getSelect_Drawer());
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Doc.getSelect_Folder());
		Thread.sleep(6000);
		Reporter.log("Expand a Folder", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Reporter.log("Check document from Document List", true);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		Doc.getSelect_Option_ReleaseOwnership();
		Thread.sleep(6000);
		Reporter.log("Click on Release Ownership Option ", true);
		jsclick(Doc.getClick_Username());
		Thread.sleep(6000);
		Reporter.log("Click on Username", true);
		jsclick(Doc.getClick_LogoutOption());
		Thread.sleep(6000);
		Reporter.log("Click on Logout Option", true);
		Doc.login_New_User();
		Thread.sleep(6000);
		Reporter.log("Login EWA with another User Credential", true);
		selectElement(Doc.getSelect_Cabinet());
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Doc.getSelect_Drawer());
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Doc.getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("Expand a Folder", true);
		jsclick(Doc.getOpen_Document());
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		Reporter.log("Take and Release Ownership Functionality verified Successfully");
		jsclick(Doc.getClick_Username());
		Thread.sleep(6000);
		Reporter.log("Click on Username", true);
		jsclick(Doc.getClick_LogoutOption());
		Thread.sleep(6000);
		Reporter.log("Click on Logout Option", true);
		LogDipakUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with User Credential", true);
	}

	@Test(priority = 2)
	public void TC_02_Verify_Refresh_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 2: Verifying Refresh Option", true);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Doc.getSelect_Cabinet());
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		Doc.getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Doc.get_clickRecent_Folder());
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Reporter.log("Check document from Document List", true);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		Doc.getSelect_Option_Refresh();
		Thread.sleep(6000);
		Reporter.log("Click Refresh Option", true);
		Reporter.log("Refresh Functionality verified Successfully on Documents", true);
	}

	@Test(priority = 3)
	public void TC_03_Verify_Categories_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 3:Verifying Categories Option ", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Reporter.log("Check document from Document List", true);
		Doc.getMoveTo_Menu_Documents();
		Reporter.log("Mousehover on Documents Tab", true);
		Doc.getSelect_Option_Catagories_andSet_Colors();
		Reporter.log("Click on Catagories option and set Color", true);
		Reporter.log("Categories on Documents Functionality verified Successfully", true);

	}

	@Test(priority = 4)
	public void TC_04_Verify_copy_and_paste_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 4 : Verifying copy and paste Option ", true);
		Thread.sleep(6000);
		Doc.getMoveTo_Menu_Documents();
		Reporter.log("Mousehover on Documents Tab", true);
		Doc.getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		Reporter.log("Copy and paste Document", true);
		Reporter.log("copy and paste documents Functionality verified Successfully", true);
	}

	@Test(priority = 5)
	public void TC_05_Verify_cut_and_paste_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 5 : Verifying cut and paste Option ", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List", true);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		Doc.getVerify_CutandPaste_Document();
		Thread.sleep(7000);
		Reporter.log("cut and paste Document Functionality verified Successfully", true);
	}

	@Test(priority = 6)
	public void TC_06_Verify_Delete_Option() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getSelect_Document());
		Thread.sleep(5000);
		Reporter.log("Test Scenario 6 : Verifying Delete Option ", true);
		Doc.getVerify_Delete_Document();
		Thread.sleep(8000);
		Reporter.log("Document Delete Functionality verified Successfully", true);
	}

	@Test(priority = 7)
	public void TC_07_Verify_CreateFavorites_Document() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 7 : Verifying Create Favorites Document", true);
		Doc.getVerify_CreateFavorites_Document();
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		Doc.getOpen_CreateFavorites_Document();
		Reporter.log("CreateFavorites Document Functionality verified Successfully", true);
	}

	@Test(priority = 8)
	public void TC_08_Verify_SendToWorkflow_Document() throws Exception {

		Reporter.log("Test Scenario 8 : Verifying Send To Workflow Document ", true);
		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		Doc.getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Doc.get_clickRecent_Folder());
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List", true);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		Doc.getCreate_SendToWorkflow_Document();
		Thread.sleep(6000);
		Reporter.log("Document send To Workflow", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List", true);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		Doc.getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		Reporter.log("Verified Copy and Paste Document", true);
		jsclick(Doc.getClick_Username());
		Thread.sleep(2000);
		Reporter.log("Click on Username", true);
		jsclick(Doc.getClick_LogoutOption());
		Thread.sleep(6000);
		Reporter.log("Click on Logout Option", true);
		Doc.login_Verify_Workflow_User();
		Thread.sleep(6000);
		Reporter.log("Login with Workflow assign ", true);
		jsclick(Doc.getSetting_Icon());
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(Doc.getMy_Preferencesetting());
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		Doc.getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office Document and set as Default View", true);
		Doc.getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and set as Default View", true);
		jsclick(Doc.getApply_button());
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Doc.MoveTo_ToDoList_Option();
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(Doc.getSelect_All_Item());
		Thread.sleep(6000);
		Reporter.log("Select All Item Option", true);
		jsclick(Doc.getOpen_ToDoDocument());
		Thread.sleep(6000);
		Reporter.log("Open ToDoList Document", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		Doc.getVerifyWF();
		Reporter.log("Verified Workflow", true);
		Thread.sleep(6000);
		jsclick(Doc.getClick_Username());
		Thread.sleep(6000);
		Reporter.log("Click on Username", true);
		jsclick(Doc.getClick_LogoutOption());
		Thread.sleep(6000);
		Reporter.log("Click on Logout Option", true);
		LogDipakUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with User Credential", true);
		Reporter.log("SendToWorkflow Document Functionality verified Successfully");

	}

	@Test(priority = 9)
	public void TC_09_Verify_Notification_on_Document() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 9 : Verifying Notification on Document ", true);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Doc.getSelect_Cabinet());
		Thread.sleep(6000);
		Doc.getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Doc.get_clickRecent_Folder());
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List", true);
		movingElement(Doc.MoveTo_Menu_Documents());
		Reporter.log("Mousehover on Documents Tab", true);
		Doc.getVerify_CopyandPaste_Document();
		Thread.sleep(6000);
		Reporter.log("Verified Copy and Paste Document", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List", true);
		movingElement(Doc.MoveTo_Menu_Documents());
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		Doc.getCreate_Notification_Document();
		Thread.sleep(6000);
		Reporter.log("Create and Verifying Notification Document ", true);
		Doc.getClick_signature_Menuoption();
		Thread.sleep(6000);
		Reporter.log("Click on Signature Menu Option", true);
		Doc.getinputpassword();
		Thread.sleep(6000);
		Reporter.log("Enter a Password", true);
		Doc.getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Reporter.log("Add New signature on page", true);
		Doc.getSave_Signature_Document();
		Thread.sleep(6000);
		Reporter.log("Click on Save button and save page", true);
		jsclick(Doc.getclosedoc());
		Reporter.log("Click on Close button on Viewer", true);
		Reporter.log("Notification_on_Document Functionality verified Successfully", true);

	}

	@Test(priority = 10)
	public void TC_10_Verify_SendTo_Mail_as_References() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 10 : Verifying SendTo Mail as References ", true);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		Doc.getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Doc.get_clickRecent_Folder());
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List", true);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		Reporter.log("Mousehover on Documents Tab", true);
		Doc.getSentTo_Mail_asReference();
		Thread.sleep(6000);
		Reporter.log("SendTo Mail asReference Functionality verified Successfully", true);
	}

	@Test(priority = 11)
	public void TC_11_Verify_SendTo_Mail_ascopy() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 11 : Verifying SendTo Mail as copy ", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List", true);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		Doc.getSentTo_Mail_asCopy();
		Thread.sleep(2000);
		Reporter.log("SendTo Mail asCopy Functionality verified Successfully", true);
	}

	@Test(priority = 12)
	public void TC_12_Verify_SendTo_Print() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Reporter.log("Test Scenario 12 : Verifying SendTo Print ", true);
		Doc.getSentTo_Print();
		Reporter.log("SendTo Print Functionality verified Successfully", true);

	}

	@Test(priority = 13)
	public void TC_13_Verify_SendTo_Export() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Reporter.log("Test Scenario 13 : Verifying SendTo Export ", true);
		Doc.getSentTo_Export();
		Reporter.log("SendTo Export Functionality verified Successfully", true);

	}

	@Test(priority = 14)
	public void TC_14_Verify_SendTo_GenerateDocumentLink() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Reporter.log("Test Scenario 14 : Verifying SendTo Generate Document Link ", true);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		Doc.getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Documents Tab", true);
		jsclick(Doc.get_clickRecent_Folder());
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		Doc.getSentTo_GenerateDocumentLink();
		Thread.sleep(6000);
		Reporter.log("Document send to Generate Document", true);
		jsclick(Doc.getRefreshbutton());
		Reporter.log("Click on Refresh button", true);
		Reporter.log("SendTo GenerateDocumentLink Functionality verified Successfully", true);
	}

	@Test(priority = 15)
	public void TC_15_Verify_SendTo_SecureLink() throws Exception {

		Reporter.log("Test Scenario 15 : Verifying Send To SecureLink ", true);
		Documents_ContextMenu Doc = new Documents_ContextMenu();
		Thread.sleep(6000);
		Doc.getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Doc.get_clickRecent_Folder());
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Doc.getSelect_Document());
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List", true);
		Doc.getSentTo_SecureLink();
		Thread.sleep(6000);
		Reporter.log("SendTo SecureLink Functionality verified Successfully", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
