package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.My_Preferences;

public class Negative_Mypreference_Redactionpassword extends BaseClass {

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
	public void TC_01_Verify_Redaction_View_Password() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 1 : Verifying Redaction View Password", true);
		Thread.sleep(7000);
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(7000);
		Reporter.log("Click on New Documents Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(7000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(7000);
		Reporter.log("select a Folder", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getSelect_Document_Type_Dropdown();
		Thread.sleep(7000);
		Reporter.log("Select value from Document type Dropdown", true);
		pojo.getEnter_ReportName_RedactionPassword();
		Reporter.log("Enter a Report Name", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(7000);
		pojo.getMove_to_Annotation_Option_inViewer();
		Thread.sleep(7000);
		Reporter.log("Move to  Annotation Option in Viewer", true);
		pojo.getRedaction_Option();
		Thread.sleep(7000);
		Reporter.log("Click on Redaction option", true);
		pojo.getvalidate_Redaction_Emptypassword();
		Thread.sleep(7000);
		Reporter.log("Verified Redaction empty password", true);
		pojo.getmessagevalidation1();
		Thread.sleep(7000);
		Reporter.log("Verified Validation message", true);
		pojo.getenter_Password();
		Thread.sleep(7000);
		Reporter.log("Enter Invalid Password", true);
		pojo.getmessagevalidate2();
		Thread.sleep(7000);
		Reporter.log("Verified Validation message", true);
		pojo.getenter_Confirmpassword();
		Thread.sleep(7000);
		Reporter.log("Enter Invalid Confirm password", true);
		pojo.getmessagevalidate2();
		Thread.sleep(7000);
		Reporter.log("Verified Validation message", true);
		pojo.getenter_validpassword();
		Thread.sleep(7000);
		Reporter.log("Enter Valid password", true);
		jsclick(pojo.getCreate_button());
		Thread.sleep(7000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getNavigate_button());
		Thread.sleep(7000);
		Reporter.log("Click on Navigate button", true);
		Reporter.log("Redaction view password validation Verified", true);
	}

	@Test(priority = 2)
	public void TC_02_Verify_InvalidRedaction_View_Password() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 2 : Verifying Invalid Redaction View Password", true);
		Thread.sleep(7000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My preferences option", true);
		pojo.getEnter_InvalidRedactionPassword_MyPreferences();
		Thread.sleep(7000);
		Reporter.log("Enter Invalid Redaction password under Textbox", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getOpen_Document());
		Thread.sleep(7000);
		Reporter.log("Open Redaction added Document", true);
		Reporter.log("Invalid Redaction verified in My preferences.", true);
	}

	@Test(priority = 3)
	public void TC_03_Verify_ResetInvalidPassword_My_Preferences() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 3 : Verifying Reset Invalid Password My Preferences", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getReset_InvalidRedactionPassword_MyPreferences();
		Thread.sleep(7000);
		Reporter.log("Reset Invalid Password", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		Reporter.log("Reset Invalid Reset Password Successfully", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
