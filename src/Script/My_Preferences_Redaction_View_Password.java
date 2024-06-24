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

public class My_Preferences_Redaction_View_Password extends BaseClass {

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

		Reporter.log("Test Scenario 1: Verifying Redaction View Password ", true);
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(7000);
		Reporter.log("Click on New Document Tab", true);
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
		Reporter.log("Expand a Folder", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getSelect_Document_Type_Dropdown();
		Thread.sleep(7000);
		Reporter.log("Select Document Type ", true);
		pojo.getEnter_ReportName_RedactionPassword();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse a Document", true);
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
		Reporter.log("Click on Annotation Menu Option", true);
		pojo.getRedaction_Option();
		Thread.sleep(7000);
		Reporter.log("Click on Redaction Option", true);
		pojo.getSet_Redaction_ToDocument();
		Thread.sleep(7000);
		Reporter.log("Enter password and set Redaction on Document ", true);
		jsclick(pojo.getCreate_button());
		Thread.sleep(7000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getNavigate_button());
		Thread.sleep(7000);
		Reporter.log("Click on Navigate button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getEnter_RedactionPassword_MyPreferences();
		Thread.sleep(7000);
		Reporter.log("Enter Redaction Password", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getOpen_Document());
		Thread.sleep(9000);
		Reporter.log("Select and Open Document", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Reaction View Password Functionality Verified Successfulluy", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify_Reset_My_Preferences() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 2: Verifying Reset My Preferences ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getReset_Button();
		Thread.sleep(7000);
		Reporter.log("Click on Reset button", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on  Apply button", true);
		Reporter.log("Reset Successfully", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
