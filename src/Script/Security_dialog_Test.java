package Script;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.Logout;
import Pom.Security;

//Dipak Automation script
public class Security_dialog_Test extends Generic.BaseClass {
	private static final Logger log = LogManager.getLogger(Security_dialog_Test.class);

	//@BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	//@Test

	public void Login_EWA() throws Exception {
		loginCVS();
		log.info("CVS User is logged in successfully...");
	}

	@Test(priority = 1)
	public void Open_Security_Dialog_And_Verify_Title_and_Cancel_Button() throws InterruptedException {

		Security sec = new Security();
		jsclick(BaseClass.Refresh_Button(driver));
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Cabinet(), sec.getSelect_Cabinet());
		Thread.sleep(3000);
		sec.getMoveTo_Menu_RoomName();
		Thread.sleep(4000);
		jsclick(sec.getSecurity_option());
		sec.gettitelvalidation();
		Reporter.log("Security dialog Title Verified", true);
		jsclick(sec.getCancel_Button_SecurityDialog());
		Thread.sleep(3000);
		log.info("Open security dialog Verify title and cancel button successfully...");
		Reporter.log("Cancel button is Clickable", true);
	}

	@Test(priority = 2)
	public void Give_All_permission_To_User_for_Cabinet_and_Verify() throws Exception {

		Security sec = new Security();
		jsclick(Refresh_Button(driver));
		Thread.sleep(4000);
		jsclick(sec.getSelect_Cabinet());
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
		sec.getDoubleClick_CrossBar();
		Thread.sleep(4000);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("All permission should be given to User for Cabinet", true);
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		sec.login_Added_User();
		Thread.sleep(4000);
		jsclick(Refresh_Button(driver));
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Cabinet(), sec.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Drawer(), sec.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Folder(), sec.getSelect_Folder());
		Thread.sleep(4000);
		sec.getOpen_Document_UnderFolder();
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		sec.getSelect_Document();
		Thread.sleep(6000);
		jsclick(sec.getUsername());
		Thread.sleep(6000);
		jsclick(sec.getLogout());
		Thread.sleep(6000);
		loginCVS();
		jsclick(sec.getSelect_Cabinet());
		Thread.sleep(4000);
		sec.getMoveTo_Menu_RoomName();
		jsclick(sec.getSecurity_option());
		Thread.sleep(5000);
		sec.getSelect_Added_User();
		Thread.sleep(3000);
		jsclick(sec.getRemove_Button());
		Thread.sleep(3000);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Added User Remove Successfully on Cabinet level", true);
		log.info("Give all permission to Cabinet and Verify successfully...");

	}

	@Test(priority = 3)
	public void Verify_Delete_permission_Denied_for_User_for_Drawer() throws Exception {

		Security sec = new Security();
		jsclick(Refresh_Button(driver));
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Cabinet(), sec.getSelect_Cabinet());
		Thread.sleep(4000);
		jsclick(sec.getSelect_Drawer());
		Thread.sleep(3000);
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
		sec.getDoubleClick_CrossBar();
		Thread.sleep(4000);
		jsclick(sec.getDelete_Permission());
		Thread.sleep(4000);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Thread.sleep(4000);
		Reporter.log("Delete permission should be Denied Selected User for Drawer", true);
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		Pom.Security.login_Added_User();
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Cabinet(), sec.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Drawer(), sec.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Folder(), sec.getSelect_Folder());
		Thread.sleep(4000);
		sec.getOpen_Document_UnderFolder();
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(8000);
		sec.getSelect_Document();
		Thread.sleep(9000);
		Pom.Security.Verify_Delete_Option_Disable();
		Thread.sleep(4000);
		sec.getClose_Document();
		Thread.sleep(4000);
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		loginCVS();
		movingDoublecli(sec.getSelect_Cabinet(), sec.getSelect_Cabinet());
		Thread.sleep(3000);
		jsclick(sec.getSelect_Drawer());
		Thread.sleep(3000);
		sec.getMoveTo_Menu_RoomName();
		jsclick(sec.getSecurity_option());
		Thread.sleep(4000);
		sec.getSelect_Added_User();
		Thread.sleep(4000);
		jsclick(sec.getRemove_Button());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Added User Remove Successfully on Drawer level", true);
		log.info("Delete permission is denied for Drawer verified Successfully...");

	}

	@Test(priority = 4)
	public void Share_permission_Denied_User_for_Folder() throws Exception {

		Security sec = new Security();
		jsclick(Refresh_Button(driver));
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Cabinet(), sec.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Drawer(), sec.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Folder(), sec.getSelect_Folder());
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
		sec.getDoubleClick_CrossBar();
		Thread.sleep(4000);
		jsclick(sec.getShare_Permission());
		Thread.sleep(4000);
		jsclick(sec.getApply_button_SecurityDialog());
		Thread.sleep(4000);
		jsclick(sec.getOk_button_SecurityDialog());
		Reporter.log("Share permission should be Denied Selected User for Folder", true);
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		Pom.Security.login_Added_User();
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Cabinet(), sec.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Drawer(), sec.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Folder(), sec.getSelect_Folder());
		Thread.sleep(4000);
		sec.getOpen_Document_UnderFolder();
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
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
		loginCVS();
		movingDoublecli(sec.getSelect_Cabinet(), sec.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Drawer(), sec.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Folder(), sec.getSelect_Folder());
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

	@Test(priority = 5)
	public void Verify_Modify_Permissions_Denied_on_subFolder() throws Exception {

		Security sec = new Security();
		jsclick(Refresh_Button(driver));
		Thread.sleep(8000);
		movingDoublecli(sec.getSelect_Cabinet(), sec.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Drawer(), sec.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Folder(), sec.getSelect_Folder());
		Thread.sleep(4000);
		jsclick(sec.getSelect_SubFolder());
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
		Pom.Security.login_Added_User();
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Cabinet(), sec.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Drawer(), sec.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Folder(), sec.getSelect_Folder());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_SubFolder(), sec.getSelect_SubFolder());
		Thread.sleep(4000);
		sec.getOpen_subfolder_Document();
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		sec.getSelect_Document();
		Thread.sleep(6000);
		jsclick(sec.getUsername());
		Thread.sleep(4000);
		jsclick(sec.getLogout());
		Thread.sleep(4000);
		loginCVS();
		movingDoublecli(sec.getSelect_Cabinet(), sec.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Drawer(), sec.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(sec.getSelect_Folder(), sec.getSelect_Folder());
		Thread.sleep(4000);
		jsclick(sec.getSelect_SubFolder());
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
		jsclick(Refresh_Button(driver));
	}

	

}
