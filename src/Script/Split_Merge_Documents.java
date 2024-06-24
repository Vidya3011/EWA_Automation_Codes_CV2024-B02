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

public class Split_Merge_Documents extends BaseClass {

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
	public void TC_01_Create_PDF() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Reporter.log("Test Scenario 1: Verifying  Create new Pdf document", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		Reporter.log("Click on My preferences option", true);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		Reporter.log("Select Office document and set Default view Option", true);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		Reporter.log("Select Pdf document and set Default view Option", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(2000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(2000);
		Reporter.log("Click on Destination Folder Checkbox", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(4000);
		Reporter.log("Expand a cabinet", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(4000);
		Reporter.log("Expand a drawer", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(4000);
		Reporter.log("select a folder", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		Reporter.log("Click on Ok button", true);
		pojo.getSelect_Document_Type_Dropdown();
		Thread.sleep(4000);
		Reporter.log("Select Document type dropdown value", true);
		pojo.getEnter_ReportName();
		Thread.sleep(2000);
		Reporter.log("Enter value into Report name field", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(4000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getCreate_button());
		Thread.sleep(4000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getViewDocument_Button());
		Thread.sleep(6000);
		Reporter.log("Click on View document option", true);
		Reporter.log("PDF is created successfully", true);
	}

	@Test(priority = 2)
	public void TC_02_Verify_CopyPaste_Viewer() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Reporter.log("Test Scenario 2: Verifying  Copy and Paste from Viewer menu option", true);
		jsclick(pojo.getSelectCheckbox());
		Thread.sleep(5000);
		Reporter.log("Select First page Thumbnail", true);
		movingclkElement(pojo.getClick_Pagemenu());
		Thread.sleep(4000);
		Reporter.log("Click on Page menu option", true);
		jsclick(pojo.getCopypage());
		Thread.sleep(4000);
		Reporter.log("Click on Copy option", true);
		jsclick(pojo.getClickokbutton());
		Thread.sleep(4000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getClick_Pagemenu());
		Thread.sleep(4000);
		Reporter.log("Click on Page menu option", true);
		jsclick(pojo.getPastepage());
		Thread.sleep(4000);
		Reporter.log("Click on Paste option", true);
		jsclick(pojo.getClickokbutton());
		Thread.sleep(4000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		Reporter.log("Click on Save menu option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Copy and paste document Verifying successfully", true);
	}

	@Test(priority = 3)
	public void TC_03_Verify_Split_Merge_Viewer() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Reporter.log("Test Scenario 3: Verifying  Split and Merge from Viewer menu option", true);
		jsclick(pojo.getSelectCheckbox());
		Thread.sleep(4000);
		Reporter.log("Select Frst page Thumbnail", true);
		jsclick(pojo.getClick_Pagemenu());
		Thread.sleep(4000);
		Reporter.log("Click on Page menu option", true);
		jsclick(pojo.getSplitpage());
		Thread.sleep(5000);
		Reporter.log("Click on Split option", true);
		pojo.getEnter_SplitPageNumber();
		Thread.sleep(4000);
		Reporter.log("Enter value in  From and To page number", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		Reporter.log("Click on save menu option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelectCheckbox());
		Thread.sleep(4000);
		Reporter.log("Select Second page Thumbnail", true);
		jsclick(pojo.getSelectAllCheckbox());
		Reporter.log("Select Anor Document from Thumbnail", true);
		jsclick(pojo.getClick_Pagemenu());
		Thread.sleep(4000);
		Reporter.log("Click on Page Menu option", true);
		jsclick(pojo.getMergepage());
		Thread.sleep(4000);
		Reporter.log("Click on Merge option", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		Reporter.log("Click on Save menu option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Split and Merge Documents Verifying successfully", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
