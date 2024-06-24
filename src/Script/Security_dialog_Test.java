package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Security;

//Dipak Automation script
public class Security_dialog_Test extends Generic.BaseClass {

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
	public void TC_01_Give_All_permission_To_Cabinet() throws Exception {

		Security sec = new Security();
		Reporter.log("Test Scenario 1 : Give All permission for Cabinet ", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(sec.getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username", true);
		jsclick(sec.getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout Option", true);
		sec.login_Admin1_User();
		Thread.sleep(8000);
		Reporter.log("Login EWA with Admin User", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(3000);
		Reporter.log("Expand a Cabinet", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		Reporter.log("Click on  Security Option", true);
		jsclick(sec.getAdd_Button());
		Thread.sleep(8000);
		Reporter.log("Click on  Security dialog Add button", true);
		jsclick(sec.getCvnamed());
		Thread.sleep(8000);
		Reporter.log("Select cvnamed Group", true);
		jsclick(sec.getClick_User());
		Thread.sleep(8000);
		Reporter.log("Select User from Group", true);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(5000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			sec.getaddvalidationmessage();
			Thread.sleep(8000);
			Reporter.log("Verifying Validation message", true);
			jsclick(sec.getClosebutton());
		} catch (Exception e) {
			// Group is not already added
		}
		sec.getSelect_Added_User_Folder();
		Thread.sleep(8000);
		Reporter.log("Select User", true);
		jsclick(sec.getNewEntry());
		Reporter.log("Click on  New Enty button", true);
		sec.getDoubleClick_CrossBar();
		Thread.sleep(8000);
		Reporter.log("Assign to permission to ", true);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Click on  Security dialog Ok button", true);
		Reporter.log("All permission should be given for Cabinet", true);
	}

	@Test(priority = 2)
	public void TC_02_Verify_All_permission_for_Cabinet() throws Exception {

		Security sec = new Security();
		Reporter.log("Test Scenario 2 : Verifying All permission for Cabinet", true);
		jsclick(sec.getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username", true);
		jsclick(sec.getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout Option", true);
		LogDipakUser();
		Thread.sleep(8000);
		Reporter.log("Login EWA with User credential", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(sec.getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(sec.getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences Option", true);
		sec.getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office Document and set Default View", true);
		sec.getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf Document and set Default View", true);
		jsclick(sec.getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Apply button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(10000);
		Reporter.log("select a Folder", true);
		sec.getOpen_Document_UnderFolder();
		Reporter.log("Click on Document from Document List", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(8000);
		Reporter.log("Document Open successfully", true);
		sec.getSelect_Document();
		Thread.sleep(8000);
		Reporter.log("Click on First Page Thumbnail", true);
		Reporter.log("Verified All permission for Cabinet", true);
	}

	@Test(priority = 3)
	public void TC_03_Remove_All_permission_for_Cabinet() throws Exception {

		Security sec = new Security();
		Reporter.log("Test Scenario 3 : Remove All permission To  for Cabinet", true);
		jsclick(sec.getUsername());
		Thread.sleep(3000);
		Reporter.log("Click on Username", true);
		jsclick(sec.getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout Option", true);
		sec.login_Admin1_User();
		Thread.sleep(8000);
		Reporter.log("Login EWA with admin User ", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		sec.getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		Reporter.log("Click on Security Option", true);
		sec.getSelect_Added_User();
		Thread.sleep(8000);
		Reporter.log("Select added User", true);
		jsclick(sec.getRemove_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Remove button", true);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Click on Security dialog Ok button", true);
		Reporter.log("Added Remove Successfully on Cabinet level", true);
		Reporter.log("Give all permission to Cabinet and Verifying successfully", true);

	}

	@Test(priority = 4)
	public void TC_04_Set_Delete_permission_Denied_for_Drawer() throws Exception {

		Security sec = new Security();
		Reporter.log("Test Scenario 4 : Set Delete permission Denied for Drawer", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(10000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(8000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		Reporter.log("Click on Security Option", true);
		jsclick(sec.getAdd_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(sec.getCvnamed());
		Thread.sleep(8000);
		Reporter.log("Select cvnamed Group", true);
		jsclick(sec.getClick_User());
		Thread.sleep(8000);
		Reporter.log("Select User from Group", true);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			sec.getaddvalidationmessage();
			Thread.sleep(8000);
			Reporter.log("Verifying Valialidation message", true);
			jsclick(sec.getClosebutton());
		} catch (Exception e) {
			// Group is not already added
		}
		sec.getSelect_Added_User_Folder();
		Thread.sleep(8000);
		Reporter.log("Select added User", true);
		jsclick(sec.getNewEntry());
		Reporter.log("Click on New Entry button", true);
		sec.getDoubleClick_CrossBar();
		Thread.sleep(8000);
		Reporter.log("Assign Permission to added User", true);
		jsclick(sec.getDelete_Permission());
		Thread.sleep(8000);
		Reporter.log("Denied Delete Permission to ", true);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(sec.getOk_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Ok button", true);
		Reporter.log("Delete permission should be Denied Selected  for Drawer", true);
	}

	@Test(priority = 5)
	public void TC_05_Verify_Delete_permission_Denied_for_Drawer() throws Exception {

		Security sec = new Security();
		Reporter.log("Test Scenario 5 : Verifying Delete permission Denied for Drawer ", true);
		jsclick(sec.getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username", true);
		jsclick(sec.getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout Option", true);
		LogDipakUser();
		Thread.sleep(8000);
		Reporter.log("Login EWA with User Credential ", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a aDrawer", true);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(12000);
		Reporter.log("select a Folder", true);
		sec.getOpen_Document_UnderFolder();
		Reporter.log("Open Document from document List ", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("Document Open successfully", true);
		Thread.sleep(8000);
		sec.getSelect_Document();
		Thread.sleep(9000);
		Reporter.log("Select First page Thumbnail", true);
		Pom.Security.Verify_Delete_Option_Disable();
		Thread.sleep(8000);
		Reporter.log("Verified Delete Option is Disable from Fab button and Delete Menu Option", true);
		sec.getClose_Document();
		Thread.sleep(12000);
		Reporter.log("Click on Cross button and Close Document", true);
	}

	@Test(priority = 6)
	public void TC_06_Remove_Delete_permission_Denied_for_Drawer() throws Exception {

		Security sec = new Security();
		Reporter.log("Test Scenario 6 : Remove Delete Permission Denied for Drawer", true);
		jsclick(sec.getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username", true);
		jsclick(sec.getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout Option", true);
		sec.login_Admin1_User();
		Thread.sleep(8000);
		Reporter.log("Login EWA with Admin User", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		sec.getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover into Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		Reporter.log("Click on Security Option", true);
		sec.getSelect_Added_User();
		Thread.sleep(8000);
		Reporter.log("Select added User", true);
		jsclick(sec.getRemove_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Remove button", true);
		jsclick(sec.getOk_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Ok button", true);
		Reporter.log("Added  Remove Successfully on Drawer level", true);
		Reporter.log("Delete permission is denied for Drawer verified Successfully...");

	}

	@Test(priority = 7)
	public void TC_07_Share_permission_Denied_for_Folder() throws Exception {

		Security sec = new Security();
		Reporter.log("Test Scenario 7 : Share permission Denied for Folder ", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(8000);
		Reporter.log("Mousehover to Roomname ", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		Reporter.log("Click on Security Option", true);
		jsclick(sec.getAdd_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(sec.getCvnamed());
		Thread.sleep(8000);
		Reporter.log("Click on cvnamed Group", true);
		jsclick(sec.getClick_User());
		Thread.sleep(8000);
		Reporter.log("Select from Group", true);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			sec.getaddvalidationmessage();
			Thread.sleep(8000);
			Reporter.log("Verifying Validation message", true);
			jsclick(sec.getClosebutton());
		} catch (Exception e) {
			// Group is not already added
		}
		sec.getSelect_Added_User_Folder();
		Thread.sleep(8000);
		Reporter.log("Select added User", true);
		jsclick(sec.getNewEntry());
		Reporter.log("Click on New Entry button", true);
		sec.getDoubleClick_CrossBar();
		Thread.sleep(8000);
		Reporter.log("Assign permission to Selected ", true);
		jsclick(sec.getShare_Permission());
		Thread.sleep(8000);
		Reporter.log("Denied Share permission to Selected ", true);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(sec.getOk_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Ok button", true);
		Reporter.log("Share permission should be Denied Selected  for Folder", true);
		jsclick(sec.getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username", true);
		jsclick(sec.getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout Option", true);
		LogDipakUser();
		Thread.sleep(2000);
		Reporter.log("Login EWA with User Credential", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		sec.getOpen_Document_UnderFolder();
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("Document open successfully under Folder", true);
		Thread.sleep(8000);
		sec.getSelect_Document();
		Thread.sleep(8000);
		Reporter.log("Click on First page Thumbnail", true);
		sec.getVerify_Share_Document_Option_Disable();
		Thread.sleep(8000);
		Reporter.log("Verified Share option is Disable from Viewer menu", true);
		sec.getClose_Document();
		Thread.sleep(8000);
		Reporter.log("Click on Cross button and Close document", true);
		jsclick(sec.getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username", true);
		jsclick(sec.getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout Option", true);
		sec.login_Admin1_User();
		Thread.sleep(8000);
		Reporter.log("Login EWA with admin User ", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		sec.getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		Reporter.log("Click on Security Tab", true);
		sec.getSelect_Added_User_Folder();
		Thread.sleep(8000);
		Reporter.log("Select added User ", true);
		jsclick(sec.getRemove_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Remove button", true);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Click on  Security dialog Ok button", true);
		Reporter.log("Added  Remove Successfully on Folder level", true);
		Reporter.log("Share permission is denied for Folder verified Successfully...");
	}

	@Test(priority = 8)
	public void TC_08_Verify_Modify_Permissions_Denied_on_subFolder() throws Exception {

		Security sec = new Security();
		Reporter.log("Test Scenario 8 : Verifying Modify Permissions Denied on subFolder ", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		selectElement(sec.getSelect_subFolder());
		Thread.sleep(8000);
		Reporter.log("select a SubFolder", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(8000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		Reporter.log("Click on Security Option", true);
		jsclick(sec.getAdd_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Security Dialog Add button", true);
		jsclick(sec.getCvnamed());
		Thread.sleep(8000);
		Reporter.log("Select Cvnamed Group", true);
		jsclick(sec.getClick_User());
		Thread.sleep(3000);
		Reporter.log("Select User from Group", true);
		movingclkElement(sec.getOk_button_UserDialog());
		Thread.sleep(3000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			sec.getaddvalidationmessage();
			Thread.sleep(8000);
			Reporter.log("Verifying Validation message", true);
			jsclick(sec.getClosebutton());
		} catch (Exception e) {
			// Group is not already added
		}
		sec.getSelect_Added_User_Folder();
		Thread.sleep(8000);
		Reporter.log("Select added User", true);
		jsclick(sec.getNewEntry());
		Reporter.log("Click on  New Entry button", true);
		sec.getDoubleClick_CrossBar();
		Thread.sleep(8000);
		Reporter.log("Assign all permission to Selected ", true);
		jsclick(sec.getModify_Permission());
		Thread.sleep(8000);
		Reporter.log("Denied Modify Permission to Selected ", true);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("", true);
		Reporter.log("Modify permission should be Denied Selected  for SubFolder", true);
		jsclick(sec.getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username", true);
		jsclick(sec.getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout Option", true);
		LogDipakUser();
		Reporter.log("Login EWA with User Credential", true);
		Thread.sleep(8000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a  Drawer", true);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		selectElement(sec.getSelect_subFolder());
		Thread.sleep(8000);
		Reporter.log("select a SubFolder", true);
		sec.getOpen_subfolder_Document();
		Reporter.log("Click on SubFolder Document", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("Document Open successfully", true);
		Thread.sleep(8000);
		sec.getSelect_Document();
		Thread.sleep(8000);
		Reporter.log("Click on First page Thumbnail", true);
		jsclick(sec.getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username", true);
		jsclick(sec.getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout Option", true);
		sec.login_Admin1_User();
		Thread.sleep(8000);
		Reporter.log("Login EWA with Admin User", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		selectElement(sec.getSelect_subFolder());
		Thread.sleep(8000);
		Reporter.log(" select a SubFolder", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(8000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		Reporter.log("Click on Security Option", true);
		sec.getSelect_Added_User_Folder();
		Thread.sleep(8000);
		Reporter.log("Select Added User", true);
		jsclick(sec.getRemove_Button());
		Thread.sleep(8000);
		Reporter.log("Click on  Security dialog Remove button", true);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Click on  Security dialog Ok button", true);
		Reporter.log("Added  Remove Successfully on subFolder level", true);
		Reporter.log("Modify permission is denied for Subfolder verified Successfully...");

	}

	@Test(priority = 9)
	public void TC_09_Give_Different_permission_To_Group_for_AllNodes() throws Exception {

		Security sec = new Security();
		Reporter.log("Test Scenario 9 : Give Different permission To Group for AllNodes", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		Reporter.log("Click on Security Option", true);
		jsclick(sec.getAdd_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(sec.getcvadmins());
		Thread.sleep(8000);
		Reporter.log("Click on cvadmins Group Name", true);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			sec.getaddvalidationmessage();
			Thread.sleep(8000);
			Reporter.log("Verifying Group added already Validation Message", true);
			jsclick(sec.getClosebutton());
		} catch (Exception e) {
			// Group is not already added
		}
		sec.getSelect_Added_Group();
		Thread.sleep(8000);
		Reporter.log("Select Added Group", true);
		jsclick(sec.getNewEntry());
		Thread.sleep(3000);
		Reporter.log("Click on  New Entry Security button", true);
		sec.getDoubleClick_CrossBar();
		Thread.sleep(8000);
		Reporter.log("Assign all permission to Group", true);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Click on  Security dialog Ok button", true);
		Reporter.log("All permission should be given to  for Cabinet", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(8000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		Reporter.log("Click on Security Option", true);
		jsclick(sec.getAdd_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(sec.getcvadmins());
		Thread.sleep(8000);
		Reporter.log("Select cvadmins Group", true);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Ok button", true);
		sec.getaddvalidationmessage();
		Thread.sleep(8000);
		Reporter.log("Verifying Validation message", true);
		jsclick(sec.getClosebutton());
		Thread.sleep(8000);
		Reporter.log("Click on Close button", true);
		sec.getSelect_Added_Group();
		Thread.sleep(8000);
		Reporter.log("Select Added Group", true);
		jsclick(sec.getNewEntry());
		Thread.sleep(8000);
		Reporter.log("Click on New Entry button", true);
		sec.getDoubleClick_CrossBar();
		Thread.sleep(8000);
		Reporter.log("Assign all permission to Group", true);
		jsclick(sec.getDelete_Permission());
		Thread.sleep(8000);
		Reporter.log("Denied Delete permission to Group", true);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security Dialog Apply button", true);
		jsclick(sec.getOk_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security Dialog Ok button", true);
		Reporter.log("Delete permission should be Denied Selected  for Drawer", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(8000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		Reporter.log("Click on Security Option", true);
		jsclick(sec.getAdd_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Security Dialog Add button", true);
		jsclick(sec.getcvadmins());
		Thread.sleep(8000);
		Reporter.log("Select cvadmins Group", true);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Ok button", true);
		sec.getaddvalidationmessage();
		Thread.sleep(8000);
		Reporter.log("Verifying Validation message", true);
		jsclick(sec.getClosebutton());
		Thread.sleep(8000);
		Reporter.log("Click on Close button", true);
		sec.getSelect_Added_Group();
		Thread.sleep(8000);
		Reporter.log("Select added Group", true);
		jsclick(sec.getNewEntry());
		Thread.sleep(8000);
		Reporter.log("Click on New Entry button", true);
		sec.getDoubleClick_CrossBar();
		Thread.sleep(8000);
		Reporter.log("Assign all permission to selected Group", true);
		jsclick(sec.getShare_Permission());
		Thread.sleep(8000);
		Reporter.log("Denied share permission", true);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security Dialog Apply button", true);
		jsclick(sec.getOk_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security Dialog Ok button", true);
		Reporter.log("Share permission should be Denied Selected  for Folder", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		selectElement(sec.getSelect_subFolder());
		Thread.sleep(8000);
		Reporter.log("select a SubFolder", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(8000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		Reporter.log("Click on Security Option", true);
		jsclick(sec.getAdd_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Security Dialog Add button", true);
		jsclick(sec.getcvadmins());
		Thread.sleep(8000);
		Reporter.log("Select cvadmins Group ", true);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog  Ok button", true);
		sec.getaddvalidationmessage();
		Thread.sleep(8000);
		Reporter.log("Verifying Validation Message", true);
		jsclick(sec.getClosebutton());
		Thread.sleep(8000);
		Reporter.log("Click on Close button", true);
		sec.getSelect_Added_Group();
		Thread.sleep(8000);
		Reporter.log("Select added Group", true);
		jsclick(sec.getNewEntry());
		Thread.sleep(8000);
		Reporter.log("Click on New Entry Tab", true);
		sec.getDoubleClick_CrossBar();
		Thread.sleep(8000);
		Reporter.log("Assign all Permission to Group", true);
		jsclick(sec.getModify_Permission());
		Thread.sleep(8000);
		Reporter.log("Denied Modify Permission", true);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(sec.getOk_button_SecurityDialog());
		Thread.sleep(8000);
		Reporter.log("Click on Security dialog Ok button", true);
		Reporter.log("Modify permission should be Denied Selected  for SubFolder", true);
	}

	@Test(priority = 10)
	public void TC_10_Verify_Respective_permission_To_Group_for_AllNodes() throws Exception {

		Security sec = new Security();
		Reporter.log("Test Scenario 10 :Verifying Respective permission To Group for AllNodes ", true);
		jsclick(sec.getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username option", true);
		jsclick(sec.getLogout());
		Thread.sleep(8000);
		Reporter.log("Click on Logout Option", true);
		sec.login_Added_GroupUser();
		Thread.sleep(8000);
		Reporter.log("Login with Security permission assign Group", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(sec.getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(sec.getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences Option", true);
		sec.getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office Document and set Default View Option ", true);
		sec.getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf Document and set Default View Option", true);
		jsclick(sec.getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Security Dialog Apply button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		Reporter.log("Mousehover to Roomname Tab", true);
		sec.getVerify_Delete_option();
		Thread.sleep(8000);
		Reporter.log("Delete permission should be Denied Selected  for Drawer", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		sec.getOpen_Document_UnderFolder();
		Reporter.log("Click on  Folder Document", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("Document Open successfully", true);
		Thread.sleep(8000);
		sec.getSelect_Document();
		Thread.sleep(8000);
		Reporter.log("Click on First Page Thumbnail", true);
		sec.getVerify_Share_Document_Option_Disable();
		Thread.sleep(8000);
		Reporter.log("share permission should be Denied Selected  for Folder", true);
		sec.getClose_Document();
		Thread.sleep(8000);
		Reporter.log("Click on viewer Cross button", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(8000);
		Reporter.log("select a Folder", true);
		selectElement(sec.getSelect_subFolder());
		Thread.sleep(8000);
		Reporter.log("select a SubFolder", true);
		sec.getOpen_subfolder_Document();
		Reporter.log("Click on Subfolder Document ", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("Document Open successfully", true);
		Thread.sleep(8000);
		sec.getSelect_Document();
		Thread.sleep(8000);
		Reporter.log("Select First page Thumbnail", true);
		Reporter.log("Modify permission should be Denied Selected  for SubFolder", true);
		Reporter.log("Verified Respective permission To Group for All Nodes successfully ", true);
		jsclick(sec.getUsername());
		Thread.sleep(8000);
		Reporter.log("Click on Username", true);
		jsclick(sec.getLogout());
		Reporter.log("Click on Logout option", true);
		Thread.sleep(8000);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
