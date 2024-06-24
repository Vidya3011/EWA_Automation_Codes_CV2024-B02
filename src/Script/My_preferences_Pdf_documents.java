package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pom.My_Preferences;

//Dipak Automation script
public class My_preferences_Pdf_documents extends Generic.BaseClass {

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
	public void TC_01_Verify_Browse_Pdf_documents_Advancedviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 1 : Verifying Browse Pdf documents Advanced viewing ", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getPdf_document_Advancedviewing();
		Thread.sleep(7000);
		Reporter.log("Select Pdf Document and set as Advanced View", true);
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
		Thread.sleep(5000);
		Reporter.log("Select Document type dropdown", true);
		pojo.getEnter_ReportName();
		Thread.sleep(5000);
		Reporter.log("Enter a Report Name", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Thread.sleep(7000);
		Reporter.log("By using AutoIT add file from external folder", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify_Create_New_pdf_document_Advancedviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 2 : Verifying Create New pdf document Advancedviewing ", true);
		Thread.sleep(7000);
		pojo.getMove_To_PlusIcon();
		Reporter.log("Move to  Plus Icon", true);
		pojo.getNew_pdf_Document_Option();
		Thread.sleep(7000);
		Reporter.log("Click on Pdf Document Option", true);
		pojo.getEnter_pdf_File_Name();
		Thread.sleep(7000);
		Reporter.log("Enter Pdf file name", true);
		jsclick(pojo.getOpen_pdf_page());
		Thread.sleep(7000);
		Reporter.log("Select and Open pdf page", true);
		jsclick(pojo.getCreate_button());
		Thread.sleep(7000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getNavigate_button());
		Thread.sleep(7000);
		Reporter.log("Click on Navigate button", true);
		Reporter.log("Advanced Viewing New PDF Document Created", true);

	}

	@Test(priority = 3)
	public void TC_03_Verify_Browse_PDF_documents_Defaultviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 3 : Verifying Browse PDF documents Defaultviewing ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Pdf Document and set as Default View", true);
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
		Reporter.log("Select Document Type Dropdown", true);
		pojo.getEnter_ReportName();
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Thread.sleep(5000);
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
		jsclick(pojo.getCreate_button());
		Thread.sleep(7000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getNavigate_button());
		Thread.sleep(7000);
		Reporter.log("Click on Navigate button", true);
		Reporter.log("Advanced Viewing New Document Created", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
