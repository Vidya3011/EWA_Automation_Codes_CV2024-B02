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

public class My_Preferences_PDF_with_Overlay extends BaseClass {

	@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully.", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}

	@Test(priority = 1)
	public void TC_01_Verify_PDF_with_Overlay_Disable() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 1 : Verifying PDF with Overlay Disable ", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on  Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getSelect_PDF_with_Overlay_Disable();
		Thread.sleep(7000);
		Reporter.log("Select Pdf With Overlay and set as Disable", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
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
		Reporter.log("Select a Document Type dropdown", true);
		pojo.getEnter_ReportNamePDFwithOverlay();
		Reporter.log("Enter a Report Name", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PDFwithOverlay.exe");
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 30);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(7000);
		pojo.getMove_to_ViewMenu_Option_inViewer();
		Thread.sleep(7000);
		Reporter.log("Mousehover to View Menu Option", true);
		pojo.getVerify_PDF_with_Overlay_option();
		Thread.sleep(7000);
		Reporter.log("Verifying PDF with overlay Option", true);
		jsclick(pojo.getCreate_button());
		Thread.sleep(7000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getNavigate_button());
		Reporter.log("Click on Navigate button", true);
		Reporter.log("Verifying PDF with Overlay is Disable", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify_PDF_with_Overlay_Enable() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 2 : Verifying PDF with Overlay Enable ", true);
		Thread.sleep(7000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_PDF_with_Overlay_Enable();
		Thread.sleep(7000);
		Reporter.log("Verified Pdf With Overlay Enable", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getOpen_Document());
		Thread.sleep(7000);
		Reporter.log("Select and Open document", true);
		pojo.getMove_to_ViewMenu_Option_inViewer();
		Thread.sleep(7000);
		Reporter.log("Mousehover to View menu Option", true);
		pojo.getVerify_PDF_with_Overlay_option();
		Thread.sleep(7000);
		Reporter.log("Verifying Pdf with overlay Option", true);
		jsclick(pojo.getClick_PDF_with_Overlay_option());
		Reporter.log("Verifying PDF with Overlay is Enable", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on  My Preferences", true);
		pojo.getSelect_PDF_with_Overlay_Disable();
		Thread.sleep(7000);
		Reporter.log("Select Pdf With Overlay and set as Disable", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
