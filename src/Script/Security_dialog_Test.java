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

import Pom.Security;

//Dipak Automation script
public class Security_dialog_Test extends Generic.BaseClass {
	private static final Logger log = LogManager.getLogger(Security_dialog_Test.class);

	@BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	@Test

	public void Login_EWA() throws Exception {
		loginCVS();
		log.info("CVS User is logged in successfully...");
	}

	@Test(priority = 1)
	public void Give_All_permission_To_User_for_Cabinet() throws Exception {

		Security sec = new Security();
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(3000);
		sec.login_Admin1_User();
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		jsclick(sec.getAdd_Button());
		Thread.sleep(3000);
		jsclick(sec.getCvnamed());
		Thread.sleep(3000);
		jsclick(sec.getSelect_User());
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
		sec.getSelect_Added_User_Folder();
		Thread.sleep(4000);
		jsclick(sec.getNewEntry());
		sec.getDoubleClick_CrossBar();
		Thread.sleep(4000);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("All permission should be given to User for Cabinet", true);
	}

	@Test(priority = 2)
	public void Verify_All_permission_To_User_for_Cabinet() throws Exception {

		Security sec = new Security();
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		loginCVS();
		Thread.sleep(4000);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(5000);
		jsclick(sec.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(sec.getMy_Preferencesetting());
		Thread.sleep(4000);
		sec.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		sec.getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		jsclick(sec.getApply_button());
		Thread.sleep(6000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Folder());

		Thread.sleep(10000);
		sec.getOpen_Document_UnderFolder();
		alertIsPresent();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		sec.getSelect_Document();
		Thread.sleep(4000);
	}

	@Test(priority = 3)
	public void Remove_All_permission_To_User_for_Cabinet() throws Exception {

		Security sec = new Security();
		jsclick(sec.getUsername());
		Thread.sleep(2000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		sec.login_Admin1_User();
		Thread.sleep(6000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		sec.getMoveTo_Menu_RoomName();
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		sec.getSelect_Added_User();
		Thread.sleep(3000);
		jsclick(sec.getRemove_Button());
		Thread.sleep(3000);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Added User Remove Successfully on Cabinet level", true);
		log.info("Give all permission to Cabinet and Verify successfully...");

	}

	@Test(priority = 4)
	public void Set_Delete_permission_Denied_for_User_for_Drawer() throws Exception {

		Security sec = new Security();
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(4000);
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		jsclick(sec.getAdd_Button());
		Thread.sleep(3000);
		jsclick(sec.getCvnamed());
		Thread.sleep(3000);
		jsclick(sec.getSelect_User());
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
		sec.getSelect_Added_User_Folder();
		Thread.sleep(4000);
		jsclick(sec.getNewEntry());
		sec.getDoubleClick_CrossBar();
		Thread.sleep(4000);
		jsclick(sec.getDelete_Permission());
		Thread.sleep(4000);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Thread.sleep(4000);
		Reporter.log("Delete permission should be Denied Selected User for Drawer", true);
	}

	@Test(priority = 5)
	public void Verify_Delete_permission_Denied_for_User_for_Drawer() throws Exception {

		Security sec = new Security();
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		loginCVS();
		Thread.sleep(4000);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(7000);
		sec.getOpen_Document_UnderFolder();
		alertIsPresent();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(6000);
		sec.getSelect_Document();
		Thread.sleep(9000);
		Pom.Security.Verify_Delete_Option_Disable();
		Thread.sleep(4000);
		sec.getClose_Document();
		Thread.sleep(4000);
	}

	@Test(priority = 6)
	public void Remove_Delete_permission_Denied_for_User_for_Drawer() throws Exception {

		Security sec = new Security();
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		sec.login_Admin1_User();
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		sec.getMoveTo_Menu_RoomName();
		jsclick(sec.getSecurity_option());
		Thread.sleep(8000);
		sec.getSelect_Added_User();
		Thread.sleep(4000);
		jsclick(sec.getRemove_Button());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Thread.sleep(4000);
		Reporter.log("Added User Remove Successfully on Drawer level", true);
		log.info("Delete permission is denied for Drawer verified Successfully...");

	}

	@Test(priority = 7)
	public void Share_permission_Denied_User_for_Folder() throws Exception {

		Security sec = new Security();
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(4000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(4000);
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		jsclick(sec.getAdd_Button());
		Thread.sleep(3000);
		jsclick(sec.getCvnamed());
		Thread.sleep(3000);
		jsclick(sec.getSelect_User());
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
		sec.getSelect_Added_User_Folder();
		Thread.sleep(4000);
		jsclick(sec.getNewEntry());
		sec.getDoubleClick_CrossBar();
		Thread.sleep(4000);
		jsclick(sec.getShare_Permission());
		Thread.sleep(4000);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Thread.sleep(4000);
		Reporter.log("Share permission should be Denied Selected User for Folder", true);
		jsclick(sec.getUsername());
		Thread.sleep(3000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		loginCVS();
		Thread.sleep(2000);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(7000);
		sec.getOpen_Document_UnderFolder();
		alertIsPresent();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		sec.getSelect_Document();
		Thread.sleep(4000);
		sec.getVerify_Share_Document_Option_Disable();
		Thread.sleep(4000);
		sec.getClose_Document();
		Thread.sleep(4000);
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		sec.login_Admin1_User();
		Thread.sleep(6000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(4000);
		sec.getMoveTo_Menu_RoomName();
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		sec.getSelect_Added_User_Folder();
		Thread.sleep(4000);
		jsclick(sec.getRemove_Button());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Added User Remove Successfully on Folder level", true);
		log.info("Share permission is denied for Folder verified Successfully...");
	}

	@Test(priority = 8)
	public void Verify_Modify_Permissions_Denied_on_subFolder() throws Exception {

		Security sec = new Security();
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(4000);
		selectElement(sec.getSelect_subFolder());
		Thread.sleep(4000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(4000);
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		jsclick(sec.getAdd_Button());
		Thread.sleep(3000);
		jsclick(sec.getCvnamed());
		Thread.sleep(3000);
		jsclick(sec.getSelect_User());
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
		sec.getSelect_Added_User_Folder();
		Thread.sleep(4000);
		jsclick(sec.getNewEntry());
		sec.getDoubleClick_CrossBar();
		Thread.sleep(4000);
		jsclick(sec.getModify_Permission());
		Thread.sleep(4000);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Modify permission should be Denied Selected User for SubFolder", true);
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		loginCVS();
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(7000);
		selectElement(sec.getSelect_subFolder());
		Thread.sleep(7000);
		sec.getOpen_subfolder_Document();
		alertIsPresent();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		sec.getSelect_Document();
		Thread.sleep(4000);
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		sec.login_Admin1_User();
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(4000);
		selectElement(sec.getSelect_subFolder());
		Thread.sleep(4000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(4000);
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		sec.getSelect_Added_User_Folder();
		Thread.sleep(4000);
		jsclick(sec.getRemove_Button());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Added User Remove Successfully on subFolder level", true);
		log.info("Modify permission is denied for Subfolder verified Successfully...");
		jsclick(sec.getRefreshbutton());
	}

	@Test(priority = 9)
	public void Give_Different_permission_To_Group_for_AllNodes() throws Exception {

		Security sec = new Security();
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
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
		Thread.sleep(3000);
		sec.getSelect_Added_Group();
		Thread.sleep(4000);
		jsclick(sec.getNewEntry());
		sec.getDoubleClick_CrossBar();
		Thread.sleep(4000);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("All permission should be given to User for Cabinet", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(4000);
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		jsclick(sec.getAdd_Button());
		Thread.sleep(3000);
		jsclick(sec.getcvadmins());
		Thread.sleep(3000);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(4000);
		sec.getaddvalidationmessage();
		Thread.sleep(3000);
		jsclick(sec.getClosebutton());
		Thread.sleep(3000);
		sec.getSelect_Added_Group();
		Thread.sleep(4000);
		jsclick(sec.getNewEntry());
		Thread.sleep(4000);
		sec.getDoubleClick_CrossBar();
		Thread.sleep(4000);
		jsclick(sec.getDelete_Permission());
		Thread.sleep(4000);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Thread.sleep(4000);
		Reporter.log("Delete permission should be Denied Selected User for Drawer", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(4000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(4000);
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		jsclick(sec.getAdd_Button());
		Thread.sleep(3000);
		jsclick(sec.getcvadmins());
		Thread.sleep(3000);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(4000);
		sec.getaddvalidationmessage();
		Thread.sleep(3000);
		jsclick(sec.getClosebutton());
		Thread.sleep(3000);
		sec.getSelect_Added_Group();
		Thread.sleep(4000);
		jsclick(sec.getNewEntry());
		Thread.sleep(4000);
		sec.getDoubleClick_CrossBar();
		Thread.sleep(4000);
		jsclick(sec.getShare_Permission());
		Thread.sleep(4000);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Thread.sleep(4000);
		Reporter.log("Share permission should be Denied Selected User for Folder", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(7000);
		selectElement(sec.getSelect_subFolder());
		Thread.sleep(7000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(4000);
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		jsclick(sec.getAdd_Button());
		Thread.sleep(3000);
		jsclick(sec.getcvadmins());
		Thread.sleep(3000);
		jsclick(sec.getOk_button_UserDialog());
		Thread.sleep(4000);
		sec.getaddvalidationmessage();
		Thread.sleep(3000);
		jsclick(sec.getClosebutton());
		Thread.sleep(3000);
		sec.getSelect_Added_Group();
		Thread.sleep(4000);
		jsclick(sec.getNewEntry());
		Thread.sleep(4000);
		sec.getDoubleClick_CrossBar();
		Thread.sleep(4000);
		jsclick(sec.getModify_Permission());
		Thread.sleep(4000);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Modify permission should be Denied Selected User for SubFolder", true);
	}

	@Test(priority = 10)
	public void Verify_Respective_permission_To_GroupUser_for_AllNodes() throws Exception {

		Security sec = new Security();
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		sec.login_Added_GroupUser();
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
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		sec.getVerify_Delete_option();
		Thread.sleep(3000);
		Reporter.log("Delete permission should be Denied Selected User for Drawer", true);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(7000);
		sec.getOpen_Document_UnderFolder();
		alertIsPresent();
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		sec.getSelect_Document();
		Thread.sleep(4000);
		sec.getVerify_Share_Document_Option_Disable();
		Thread.sleep(4000);
		Reporter.log("share permission should be Denied Selected User for Folder", true);
		sec.getClose_Document();
		Thread.sleep(4000);
		jsclick(sec.getRefreshbutton());
		Thread.sleep(4000);
		Thread.sleep(4000);
		selectElement(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Drawer());
		Thread.sleep(4000);
		selectElement(sec.getSelect_Folder());
		Thread.sleep(7000);
		selectElement(sec.getSelect_subFolder());
		Thread.sleep(4000);
		sec.getOpen_subfolder_Document();
		alertIsPresent();
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(4000);
		sec.getSelect_Document();
		Thread.sleep(4000);
		Reporter.log("Modify permission should be Denied Selected User for SubFolder", true);
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		driver.close();
	}
}
