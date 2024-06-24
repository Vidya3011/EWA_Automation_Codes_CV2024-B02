package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Language;

public class Dutch_Language_Test extends Generic.BaseClass {

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

	// Verifying Dutch Language // Create Document with annotation in Dutch laguage

	@Test(priority = 1)
	public void TC_01_CreateandOpen_NewDocument_Dutch_Language() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 1 : Verifying Create and Open New Document Dutch Language ", true);
		Thread.sleep(7000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Office documentv and set as Default View", true);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Pdf documentv and set as Default View", true);
		pojo.getSelect_Dropdown_Actual_Size();
		Thread.sleep(7000);
		Reporter.log("Select Viewer zoom and set as Actual Size", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getUsername());
		Thread.sleep(7000);
		Reporter.log("Click on Username", true);
		jsclick(pojo.getLogout());
		Thread.sleep(7000);
		Reporter.log("Click on Logout Option", true);
		jsclick(pojo.getDutch_Language());
		Thread.sleep(7000);
		Reporter.log("Click on Dutch Language", true);
		LogDipakUser();
		Thread.sleep(7000);
		Reporter.log("Login EWA with User credential", true);
		jsclick(pojo.getNewDocuments_MenuOption());
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
		Reporter.log("Folder is selected for Create New Documents", true);
		pojo.getOK_Button_BrowseforFolder().click();
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(7000);
		Reporter.log("Select a Document Type dropdown", true);
		pojo.getEnter_Report_Name_Text().sendKeys(pojo.Language_excelRead(11, 2));
		Thread.sleep(7000);
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hyphen.exe");
		Thread.sleep(7000);
		Reporter.log("By using AutoIT add file from external folder", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("Document Uploaded successfully", true);
		pojo.getClickOCR().click();
		Thread.sleep(7000);
		Reporter.log("Click on OCR menu Option", true);
		pojo.getSet_OCR_ToDocumentPDF();
		Thread.sleep(6000);
		Reporter.log("Set OCR On page", true);
		jsclick(pojo.getReportName());
		Thread.sleep(7000);
		Reporter.log("Click on Report Name and set OCR Value as Report Name", true);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getNavigate_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Navigate button", true);
		pojo.getOCRReportnamevalidation_BeforeCreateDOC();
		Thread.sleep(7000);
		Reporter.log("Verifying OCR Report name ", true);
		jsclick(pojo.getReportNameValueBeforeDoc());
		Thread.sleep(7000);
		Reporter.log("Report name Verified and Open Document", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu Option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("New Document Create and open in Dutch language", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify_OCR_afterCreatingDocument() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 2 : Verifying OCR after Creating Document ", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(3000);
		Reporter.log("Browse Document Page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Underscore.exe");
		Thread.sleep(6000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Underscore_page());
		Thread.sleep(7000);
		Reporter.log("Open Document Page from Document List", true);
		jsclick(pojo.getUpdateDutch_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Update button", true);
		pojo.getClickOCR().click();
		Thread.sleep(7000);
		Reporter.log("Click on OCR button", true);
		pojo.getSet_OCR_ToDocument();
		Thread.sleep(7000);
		Reporter.log("Set OCR To Document", true);
		pojo.getReportName().click();
		Thread.sleep(7000);
		Reporter.log("Click on Report Name and set OCR Extarcted Name", true);
		jsclick(pojo.getDutchSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Save button", true);
		jsclick(pojo.getDutchUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getDutchProperties_option());
		Thread.sleep(7000);
		Reporter.log("Click on Properties Option", true);
		jsclick(pojo.getClose_Documentpage());
		Thread.sleep(7000);
		Reporter.log("Close the document Page", true);
		pojo.getOCRReportnamevalidation_AfterCreateDOC();
		Thread.sleep(7000);
		Reporter.log("Verifying OCR Name as Document name", true);
		jsclick(pojo.getReportNameValueAfterDoc());
		Reporter.log("After Creating Document OCR Functionality verified Sucessfully", true);

	}

	@Test(priority = 3)
	public void TC_03_Addsignature_Dutch_Language() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 3 : Add signature Dutch Language ", true);
		Thread.sleep(7000);
		jsclick(pojo.getClick_signature_Menuoption());
		Thread.sleep(7000);
		Reporter.log("Click on Signature menu Option", true);
		try {
		pojo.getinputpassword();
		Thread.sleep(7000);
		Reporter.log("Enter a Password", true);
		} catch (Exception e) {
			System.out.println("signature is not password protected...");
		}
		pojo.getAdd_Signature_Onpage();
		Thread.sleep(7000);
		Reporter.log("Add signature on page", true);
		Reporter.log("signature added Successfully on  Document", true);
	}

	@Test(priority = 4)
	public void TC_04_AddRedaction_Dutch_Language() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 4 : Add Redaction Dutch Language ", true);
		Thread.sleep(7000);
		pojo.getMove_to_Annotation_Option_inViewer();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Annotation menu Option", true);
		pojo.getRedaction_Option();
		Thread.sleep(7000);
		Reporter.log("Click on Redaction Option", true);
		pojo.getSet_Redaction_ToDocument();
		Thread.sleep(7000);
		Reporter.log("Set Redaction on Page", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Redaction added Successfully on  Document", true);
	}

	@Test(priority = 5)
	public void TC_05_ShowHideThumbnail_Dutch_Language() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 5 : Show Hide Thumbnail Dutch Language ", true);
		Thread.sleep(7000);
		jsclick(pojo.getshowHideThumbnail());
		Thread.sleep(7000);
		Reporter.log("Click on Show Hide Thumbnail", true);
		jsclick(pojo.getshowHideThumbnail());
		Thread.sleep(7000);
		Reporter.log("Verifying showing Thumbnail and Again Click Show Hide Thumbnail", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("Show Hide Thumbnail options verified", true);
	}

	// Create Template in Dutch laguage

	@Test(priority = 6)
	public void TC_06_verify_to_CreateorBrowse_Template_Defaultviewing() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 6 : Verifying to Create or Browse Template Default viewing ", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Office document and set as Default View", true);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on Template Tab", true);
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
		Reporter.log("Folder is selected for Templates", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(7000);
		Reporter.log("Select Document type dropdown", true);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(7000);
		Reporter.log("Click on Report Name", true);
		pojo.getSelect_ReportName_Testvalue();
		Thread.sleep(7000);
		Reporter.log("Enter Report Name", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(7000);
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getSave_Template_Button());
		Reporter.log("Save Template button clicked successfully", true);
		jsclick(pojo.getTemplate_Description_No_button());
		Thread.sleep(7000);
		Reporter.log("Click on No button", true);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Save Template button", true);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(7000);
		Reporter.log("Click on Template Name Textbox", true);
		pojo.getTemplate_NameTextboxvalue();
		Thread.sleep(7000);
		Reporter.log("Enter Template Name into Template Name field", true);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(7000);
		Reporter.log("Click on Template Description message box", true);
		pojo.getTemplate_Description_Messageboxvalue();
		Thread.sleep(7000);
		Reporter.log("Enter Template Description message into Description field", true);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(7000);
		Reporter.log("Verified Template Created successfully", true);
		jsclick(pojo.getTemplate_Created_OK_button());
		Thread.sleep(7000);
		Reporter.log("Verifying to CreateorBrowse Template Defaultviewing", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
	}

	@Test(priority = 7)
	public void TC_07_Verify_to_Edit_and_Delete_DefaultTemplate() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 7 : Verifying to Edit and Delete Default Template ", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(pojo.getSelect_Created_Template());
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("Select Created Template", true);
		jsclick(pojo.getClick_Edit_Template_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Edit Template Fab button", true);
		pojo.getEditTemplate_Description_Messagebox().clear();
		Thread.sleep(7000);
		Reporter.log("Click on Template Description message box", true);
		pojo.getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(7000);
		Reporter.log("Edit Template Description", true);
		jsclick(pojo.getEditTemplate_Description_OK_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		jsclick(pojo.getEditTemplate_Created_OK_button());
		Thread.sleep(7000);
		Reporter.log("Click on  Ok button", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(7000);
		Reporter.log("Select Created Template", true);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(7000);
		Reporter.log("Click on  Delete Template Fab button", true);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Click on  Ok button", true);
		Reporter.log("Template Deleted Successfully", true);

	}

	@Test(priority = 8)
	public void TC_08_verify_to_CreateorBrowse_Template_Advancedviewing_OfficeDoc() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 8 : Verifying to Create or Browse Template Advanced viewing OfficeDoc ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_Office_document_Advancedviewing();
		Thread.sleep(7000);
		Reporter.log("Select Office Document and set as Advanced View", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(7000);
		Reporter.log("Click on  Destination Folder Textbox", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(7000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(7000);
		Reporter.log("Select Document Type dropdown", true);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(7000);
		Reporter.log("Click on  Report Name Textbox", true);
		pojo.getSelect_ReportName_Testvalue();
		Thread.sleep(7000);
		Reporter.log("Enter value Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficeDoc.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(7000);
		jsclick(pojo.getSave_Template_Button());
		Reporter.log("Save Template button clicked successfully", true);
		jsclick(pojo.getTemplate_Description_No_button());
		Thread.sleep(7000);
		Reporter.log("Click on No button", true);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Save Template button", true);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(7000);
		Reporter.log("Click on Template Name  Textbox", true);
		pojo.getTemplate_NameTextboxvalue();
		Thread.sleep(7000);
		Reporter.log("Enter value Template Name field", true);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(7000);
		Reporter.log("Click on Template Description messagebox", true);
		pojo.getTemplate_Description_Messageboxvalue();
		Thread.sleep(7000);
		Reporter.log("Enter message Template Description field", true);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(7000);
		Reporter.log("Template Created successfully Verified", true);
		jsclick(pojo.getTemplate_Created_OK_button());
		Reporter.log("Click on Ok button", true);
		Reporter.log("Verifying to CreateorBrowse OfficeDoc Template advancedviewing", true);

	}

	@Test(priority = 9)
	public void TC_09_Verify_to_Edit_and_Delete_AdvancedTemplate_OfficeDoc() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 9 : Verifying to Edit and Delete Advanced Template Office Doc ", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(7000);
		Reporter.log("Select Created Template", true);
		jsclick(pojo.getClick_Edit_Template_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Edit Template", true);
		pojo.getEditTemplate_Description_Messagebox().clear();
		Thread.sleep(7000);
		Reporter.log("Click on Edit Template Description messagebox", true);
		pojo.getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(7000);
		Reporter.log("Edit Template Description", true);
		jsclick(pojo.getEditTemplate_Description_OK_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		jsclick(pojo.getEditTemplate_Created_OK_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(7000);
		Reporter.log("Select Created Template", true);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Delete Template Fab button", true);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Template Deleted Successfully", true);

	}

	@Test(priority = 10)
	public void TC_10_verify_to_Create_Formmapping_PDFTemplate_Advancedviewing() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 10 : Verifying to Create Formmapping PDF Template Advanced viewing ", true);
		Thread.sleep(7000);
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
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on Template Tab", true);
		pojo.getDestination_Folder_Textbox().click();
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
		Reporter.log("Folder is selected for Templates", true);
		pojo.getOK_Button_BrowseforFolder().click();
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(7000);
		Reporter.log("Select Document type dropdown", true);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(7000);
		Reporter.log("Click on Report Name Textbox", true);
		pojo.getSelect_ReportName_Testvalue();
		Thread.sleep(7000);
		Reporter.log("Enter value Report Name field", true);
		pojo.getMove_To_PlusIcon();
		pojo.getNew_pdf_Document_Option();
		Thread.sleep(7000);
		Reporter.log("Browse a Document", true);
		pojo.getEnter_pdf_File_Name();
		Thread.sleep(7000);
		Reporter.log("Enter Pdf File Name", true);
		jsclick(pojo.getpdfViewer());
		Thread.sleep(7000);
		Reporter.log("Click on Pdf Viewerr", true);
		jsclick(pojo.getTextbox());
		Thread.sleep(7000);
		Reporter.log("Click on Textbox", true);
		jsclick(pojo.getAdd_Textbox_Onpage());
		Thread.sleep(7000);
		Reporter.log("Select and add Textbox on  Page", true);
		jsclick(pojo.getClick_Formmapper());
		Reporter.log("Click on  Form mapping", true);
		pojo.getSelect_Formfield();
		Thread.sleep(7000);
		Reporter.log("Select Form field", true);
		jsclick(pojo.getFormOK());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Save Template button", true);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(7000);
		Reporter.log("Click on Template name textbox", true);
		pojo.getTemplate_NameTextboxvalue();
		Thread.sleep(7000);
		Reporter.log("Enter Template Name", true);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(7000);
		Reporter.log("Click on Template Description messagebox", true);
		pojo.getTemplate_Description_Messageboxvalue();
		Thread.sleep(7000);
		Reporter.log("Enter message in Template Description", true);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(7000);
		Reporter.log("Verified Template Created successfully", true);
		jsclick(pojo.getTemplate_Created_OK_button());
		Reporter.log("Click on Ok button", true);
		Reporter.log("Verifying to CreateorBrowse Formmapping Template advancedviewing", true);

	}

	@Test(priority = 11)
	public void TC_11_Verify_to_Edit_and_Delete_Formfield() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 11: Verifying to Edit and Delete Form field ", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(7000);
		Reporter.log("Select Created Template", true);
		jsclick(pojo.getClick_Edit_Template_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Edit Template Fab button", true);
		pojo.getEditTemplate_Description_Messagebox().clear();
		Thread.sleep(7000);
		Reporter.log("Click on Edit Template Description messagebox", true);
		pojo.getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(7000);
		Reporter.log("Edit a Template", true);
		jsclick(pojo.getEditTemplate_Description_OK_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		jsclick(pojo.getEditTemplate_Created_OK_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Template Tab", true);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(7000);
		Reporter.log("Select Created Template", true);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Delete Template Fab button", true);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Formmapping Template Deleted Successfully", true);
	}

	@Test(priority = 12)
	public void TC_12_Set_Defaultview() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 12 :Set Default view ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Office Document and set as Default view", true);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Pdf Document and set as Default view", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
	}

	// Verifying Load more in Search and Folder in Spanish laguage

	@Test(priority = 13)
	public void TC_13_Verify_Load_MoreCount_On_Search() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 13 : Verifying Load More Count On Search ", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on  Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getEnter_Loadmorecount();
		Thread.sleep(7000);
		Reporter.log("Enter Load more count", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.getVerify_Loadmorecount_Searchresult();
		Thread.sleep(7000);
		Reporter.log("Verified Load more count on Search Result", true);
		jsclick(pojo.getLoadmorebutton());
		Thread.sleep(7000);
		Reporter.log("Click on Load More button", true);
		pojo.getVerify_Loadmorecount_Searchresult();
		Thread.sleep(7000);
		Reporter.log("Minumum number of Load More count on Search Verified successfully", true);
	}

	@Test(priority = 14)
	public void TC_14_Verify_Load_MoreCount_On_Folder() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 14 : Verifying Load More Count On Folder ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("Expand a Folder", true);
		pojo.getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(7000);
		Reporter.log("Verified Load More count On Folder Document", true);
		jsclick(pojo.getLoadmorebutton());
		Thread.sleep(7000);
		Reporter.log("Click on Load more button", true);
		pojo.getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(7000);
		Reporter.log("Minumum number of Load More count on Folder Verified successfully", true);

	}

	// Verifying Custom Columns in Spanish Language

	// Custom columns for Room

	@Test(priority = 15)
	public void TC_15_Open_Custom_List_Dialog_And_Verify_Title_Roomcolumn() throws InterruptedException {

		Language pojo = new Language();

		Reporter.log("Test Scenario 15 : Open Custom List Dialog And Verifying Title Room column ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		pojo.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(pojo.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		pojo.getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Column Option", true);
		pojo.gettitelvalidation();
		Reporter.log("Custom List title validate", true);
	}

	@Test(priority = 16)
	public void TC_16_Verify__Text_of_Custom_List_Dialog_Roomcolumn() throws InterruptedException {

		Language pojo = new Language();

		Reporter.log("Test Scenario 16 : Verifying  Text of Custom List Dialog Room column ", true);
		Thread.sleep(7000);
		pojo.getextvalidation();
		Reporter.log("Custom List Dialog Text verified", true);
	}

	@Test(priority = 17)
	public void TC_17_Set_And_Verify_Custom_Columns_NodeLevel() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 17 : Set And Verifying Custom Columns Node Level ", true);
		Thread.sleep(7000);
		pojo.getSearchBoxIndices1();
		Thread.sleep(7000);
		Reporter.log("Enter Indices Value In Search box", true);
		jsclick(pojo.getSelect_Indices01());
		Thread.sleep(7000);
		Reporter.log("Select Entered Indices", true);
		pojo.getSearchBoxIndices2();
		Thread.sleep(7000);
		Reporter.log("Enter Indices Value In Search box", true);
		jsclick(pojo.getSelect_Indices02());
		Thread.sleep(7000);
		Reporter.log("Select Entered Indices", true);
		pojo.getSearchBoxIndices3();
		Thread.sleep(7000);
		Reporter.log("Enter Indices Value In Search box", true);
		jsclick(pojo.getSelect_Indices03());
		Thread.sleep(7000);
		Reporter.log("Select Entered Indices", true);
		pojo.Ok_Button_CustomList();
		Reporter.log("All Indices Selected Successfully", true);
		Thread.sleep(7000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.Verify_CompactView_checkbox();
		Thread.sleep(7000);
		Reporter.log("Check Compact View Checkbox", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		pojo.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(pojo.get_clickRecent_Folder());
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		pojo.Verify_Indicess_Value();
		Thread.sleep(7000);
		Reporter.log("Custom Columns is set Node Level successfully", true);

	}

	@Test(priority = 18)
	public void TC_18_Verify_Default_Custom_Columns() throws InterruptedException {

		Language pojo = new Language();

		Reporter.log("Test Scenario 18 : Verifying Default Custom Columns ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		pojo.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(pojo.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		pojo.getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Roomname  Tab", true);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Columns Option", true);
		pojo.getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Roomname Tab", true);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Columns Tab", true);
		pojo.getDefault_Button_CustomList();
		Thread.sleep(7000);
		Reporter.log("Click on Custom List Default button", true);
		pojo.Ok_Button_CustomList();
		Reporter.log("Set and Verifying Default Custom columns successfully", true);
	}

	@Test(priority = 19)
	public void TC_19_Verify_Cancel_Button_of_CustomList() throws InterruptedException {

		Language pojo = new Language();

		Reporter.log("Test Scenario 19 : Verifying Cancel button of Custom List ", true);
		pojo.getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover on Roomname Tab", true);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Column Option", true);
		pojo.getCancel_Button_CustomList();
		Reporter.log("Cancle button is clicked", true);
		Reporter.log("Verified Cancel button of Custom List ", true);
	}

	@Test(priority = 20)
	public void TC_20_Verify_Custom_Columns_RoomLevel() throws InterruptedException {

		Language pojo = new Language();

		Reporter.log("Test Scenario 20 : Verifying Custom Columns Room Level ", true);
		pojo.getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover on Roomname Tab", true);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Column Option", true);
		jsclick(pojo.getClick_DropdownOption());
		Reporter.log("Click on dropdown Option", true);
		pojo.Select_DropdownValue();
		Thread.sleep(7000);
		Reporter.log("Select Dropdown Value", true);
		jsclick(pojo.getSet_RoomLevel_Indices());
		Thread.sleep(7000);
		Reporter.log("Set Room Level Indices", true);
		pojo.Ok_Button_CustomList();
		Reporter.log("Indices is Selected Successfully for RoomLevel", true);

	}

	@Test(priority = 21)
	public void TC_21_Verify_Reset_Columns_Functionality() throws InterruptedException {

		Language pojo = new Language();

		Reporter.log("Test Scenario 21 : Verifying Reset Columns Functionality ", true);
		pojo.getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover on Roomname Tab", true);
		jsclick(pojo.getReset_Column_option());
		Thread.sleep(7000);
		Reporter.log("Click on Reset Columns", true);
		jsclick(pojo.getResetColumn_popup_OK_button());
		Reporter.log("Custom columns Reset Successfully", true);

	}

	// Custom columns for Search

	@Test(priority = 22)
	public void TC_22_Open_Custom_List_Dialog_And_Verify_Title_Searchcolumn() throws InterruptedException {

		Language pojo = new Language();
		Reporter.log("Test Scenario 22:Open Custom List Dialog And Verifying Title Search column ", true);
		pojo.MoveTo_Search_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Search Tab", true);
		jsclick(pojo.getSearch_Custom_Columns_option());
		Thread.sleep(7000);
		Reporter.log("Click on  Custom Column Option", true);
		pojo.getSearch_titelvalidation();
		Reporter.log("Search Custom List title validate", true);
	}

	@Test(priority = 23)
	public void TC_23_Verify__Text_of_Custom_List_Dialog_Searchcolumn() throws InterruptedException {

		Language pojo = new Language();
		Reporter.log("Test Scenario 23 :Verifying  Text of Custom List Dialog Search column ", true);
		Thread.sleep(7000);
		pojo.getSearch_textvalidation();
		Reporter.log("Search Custom List Dialog Text verified", true);
	}

	@Test(priority = 24)
	public void TC_24_Verify_Set_Custom_Columns_for_Search() throws Exception {

		Language pojo = new Language();
		Reporter.log("Test Scenario 24 : Verifying Set Custom Columns for Search ", true);
		Thread.sleep(7000);
		pojo.getSearchBoxIndices4();
		Thread.sleep(7000);
		Reporter.log("Search Indices 1 in Search box", true);
		jsclick(pojo.getSearch_Select_Indices01());
		Thread.sleep(7000);
		Reporter.log("Select Search Indices 1", true);
		pojo.getSearchBoxIndices5();
		Thread.sleep(7000);
		Reporter.log("Search Indices 2 in Search box", true);
		jsclick(pojo.getSearch_Select_Indices02());
		Thread.sleep(7000);
		Reporter.log("Select Search Indices 2", true);
		pojo.getSearchBoxIndices6();
		Thread.sleep(7000);
		Reporter.log("Search Indices 3 in Search box", true);
		jsclick(pojo.getSearch_Select_Indices03());
		Thread.sleep(7000);
		Reporter.log("Select Search Indices 3", true);
		jsclick(pojo.getSearch_Ok_Button_CustomList());
		Reporter.log("All Indices Selected Successfully", true);
		Thread.sleep(7000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab", true);
		jsclick(pojo.getDocument_Location());
		Thread.sleep(7000);
		Reporter.log("Click on Document Location", true);
		selectElement(pojo.getSelect_Cabinet2());
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer2());
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder2());
		Thread.sleep(7000);
		Reporter.log("Expand a Folder", true);
		jsclick(pojo.getOk_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.Search_Verify_Indicess_Value4();
		Thread.sleep(7000);
		Reporter.log("Verified Selected Indices 1", true);
		pojo.Search_Verify_Indicess_Value5();
		Thread.sleep(7000);
		Reporter.log("Verified Selected Indices 2", true);
		pojo.Search_Verify_Indicess_Value6();
		Thread.sleep(7000);
		Reporter.log("Verified Selected Indices 3", true);
		Reporter.log("Custom column is set successfully for Search Functionality", true);
	}

	@Test(priority = 25)
	public void TC_25_Verify_Reset_Columns_for_Search() throws InterruptedException {

		Language pojo = new Language();

		Reporter.log("Test Scenario 25 : Verifying Reset Columns for Search ", true);
		pojo.MoveTo_Search_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Search Tab", true);
		jsclick(pojo.getClick_ResetColumn());
		Thread.sleep(7000);
		Reporter.log("Click on Reset Column", true);
		jsclick(pojo.getOk_Button_ResetColumn());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on  Find button", true);
		Reporter.log("Reset Custom Columns Successfully for Search", true);

	}

	// Custom column for ToDolist

	@Test(priority = 26)
	public void TC_26_Open_Custom_List_Dialog_And_Verify_Title_ToDoList() throws InterruptedException {

		Language pojo = new Language();

		Reporter.log("Test Scenario 26 : Open Custom List Dialog And Verifying Title ToDoList ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(pojo.getToDoList_Custom_Columns_option());
		Thread.sleep(7000);
		Reporter.log("Click on  Custom Column Option", true);
		pojo.ToDoList_titelvalidation();
		Reporter.log("ToDoList Custom List title validate", true);
	}

	@Test(priority = 27)
	public void TC_27_Verify__Text_of_Custom_List_Dialog_ToDoList() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 27 : Verifying  Text of Custom List Dialog ToDoList ", true);
		Thread.sleep(7000);
		pojo.ToDoList_textvalidation();
		Thread.sleep(9000);
		Reporter.log("Custom List Dialog Text verified", true);
		jsclick(pojo.getToDoList_Select_Indices01());
		Thread.sleep(7000);
		Reporter.log("Select Indices 1", true);
		Language.ToDoList_Ok_Button_CustomList();
		Reporter.log("Click on  Ok button", true);
		Reporter.log("Indices Selected Successfully", true);
	}

	@Test(priority = 28)
	public void TC_28_Verify_Set_Custom_Columns_for_ToDoList() throws Exception {

		Language pojo = new Language();
		Reporter.log("Test Scenario 28 : Verifying Set Custom Columns for ToDoList ", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("select a Folder", true);
		jsclick(pojo.getSelectDoc());
		Thread.sleep(7000);
		Reporter.log("Check Document from document List", true);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Documents Tab", true);
		jsclick(pojo.getsendWorkflow());
		Thread.sleep(7000);
		Reporter.log("Click on SendToWorkflow Option", true);
		jsclick(pojo.getWFAssign());
		Thread.sleep(7000);
		Reporter.log("Send document to Workflow", true);
		pojo.getSelectDoc();
		Thread.sleep(7000);
		Reporter.log("Check Document from Document List", true);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Documents Tab", true);
		pojo.getVerify_CopyandPaste_Document();
		Thread.sleep(7000);
		Reporter.log("Copy and Paste Document Successfully", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(pojo.getSelect_All_Item());
		Thread.sleep(7000);
		Reporter.log("Click on All Item Option", true);
		Reporter.log("Custom column is set successfully for ToDoList Functionality", true);
	}

	@Test(priority = 29)
	public void TC_29_Reset_Custom_Columns_for_ToDoList() throws InterruptedException {
		Language pojo = new Language();

		Reporter.log("Test Scenario 29 : Reset Custom Columns for ToDoList ", true);
		Thread.sleep(7000);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(pojo.getTo_Do_Resetcolumn_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Reset Column Option", true);
		jsclick(pojo.getToDoList_Reset_Column_OK_Button());
		Reporter.log("ToDoList Custom column Reset Successfully", true);

	}

	// Document Context Menu

	@Test(priority = 30)
	public void TC_30_Verify_Refresh_Option() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 30 : Verifying Refresh Option ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		pojo.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(pojo.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(7000);
		Reporter.log("Check Document from document List", true);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Documents Tab", true);
		pojo.getSelect_Option_Refresh();
		Thread.sleep(7000);
		Reporter.log("Click on Reffresh Option", true);
		Reporter.log("Refresh Functionality verified Successfully on Documents", true);
	}

	@Test(priority = 31)
	public void TC_31_Verify_Categories_Option() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 31 : Verifying Categories Option ", true);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(7000);
		Reporter.log("Check Document from document List", true);
		pojo.getMoveTo_Menu_Documents();
		Reporter.log("Mousehover on Documents Tab", true);
		pojo.getSelect_Option_Catagories_andSet_Colors();
		Reporter.log("Click on  Catagories Option and set", true);
		Reporter.log("Categories on Documents Functionality verified Successfully", true);

	}

	@Test(priority = 32)
	public void TC_32_Verify_copy_and_paste_Option() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 32 : Verifying copy and paste Option ", true);
		Thread.sleep(7000);
		pojo.getMoveTo_Menu_Documents();
		Reporter.log("Mousehover on Documents Tab", true);
		pojo.getVerify_CopyandPaste_Document();
		Thread.sleep(7000);
		Reporter.log("copy and paste Documents Functionality verified Successfully", true);
	}

	@Test(priority = 33)
	public void TC_33_Verify_cut_and_paste_Option() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 33 : Verifying cut and paste Option ", true);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(7000);
		Reporter.log("Check Document from document List", true);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Documents Tab", true);
		pojo.getVerify_CutandPaste_Document();
		Thread.sleep(7000);
		Reporter.log("cut and paste Document Functionality verified Successfully", true);
	}

	@Test(priority = 34)
	public void TC_34_Verify_Delete_Option() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 34 : Verifying Delete Option ", true);
		pojo.getVerify_Delete_Document();
		Thread.sleep(7000);
		Reporter.log("Document Delete Functionality verified Successfully", true);
	}

	@Test(priority = 35)
	public void TC_35_Verify_CreateFavorites_Document() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 35 : Verifying Create Favorites Document ", true);
		pojo.getVerify_CreateFavorites_Document();
		Reporter.log("Verified Create Favorites Document ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		pojo.getOpen_CreateFavorites_Document();
		Reporter.log("CreateFavorites Document Functionality verified Successfully", true);
	}

	@Test(priority = 36)
	public void TC_36_Verify_Notification_on_Document() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 36 : Verifying Notification on Document ", true);

		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		pojo.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(pojo.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(7000);
		Reporter.log("Check Document from document List", true);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Documents Tab", true);
		pojo.getVerify_CopyandPaste_Document();
		Thread.sleep(7000);
		Reporter.log("Copy and Paste Document", true);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(7000);
		Reporter.log("Check Document from document List", true);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Documents Tab", true);
		pojo.getCreate_Notification_Document();
		Thread.sleep(9000);
		Reporter.log("Create Notification on Document", true);
		jsclick(pojo.getClick_signature_Menuoption());
		Thread.sleep(7000);
		Reporter.log("Click on Signature option", true);
		pojo.getinputpassword();
		Thread.sleep(7000);
		Reporter.log("Enter a Password", true);
		pojo.getAdd_Signature_Onpage();
		Thread.sleep(7000);
		Reporter.log("Add signature on page", true);
		pojo.getSave_Signature_Document();
		Thread.sleep(7000);
		Reporter.log("Click save button and save added signature", true);
		jsclick(pojo.getclosedoc());
		Reporter.log("Close Document", true);
		Reporter.log("Notification_on_Document Functionality verified Successfully", true);

	}

	@Test(priority = 37)
	public void TC_37_Verify_SendTo_Mail() throws Exception {

		Language pojo = new Language();

		Reporter.log("Test Scenario 37 : Verifying SendTo Mail ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		pojo.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(pojo.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(7000);
		Reporter.log("Check a Document from document List", true);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Documents Tab", true);
		pojo.getSentTo_Mail_asReference();
		Thread.sleep(7000);
		Reporter.log("SendTo Mail asReference Functionality verified Successfully", true);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(7000);
		Reporter.log("Check Document from document List", true);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Documents Tab", true);
		pojo.getSentTo_Mail_asCopy();
		Thread.sleep(7000);
		Reporter.log("SendTo Mail asCopy Functionality verified Successfully", true);
	}

	@Test(priority = 38)
	public void TC_38_Verify_SendTo_Print() throws Exception {

		Language pojo = new Language();
		Reporter.log("Test Scenario 38 : Verifying Send To Print ", true);
		pojo.getSentTo_Print();
		Reporter.log("SendTo Print Functionality verified Successfully", true);

	}

	@Test(priority = 39)
	public void TC_39_Verify_SendTo_Export() throws Exception {

		Language pojo = new Language();
		Reporter.log("Test Scenario 39 : Verifying Send To Export ", true);
		pojo.getSentTo_Export();
		Reporter.log("SendTo Export Functionality verified Successfully", true);

	}

	@Test(priority = 40)
	public void TC_40_Verify_SendTo_GenerateDocumentLink() throws Exception {

		Language pojo = new Language();
		Reporter.log("Test Scenario 40 : Verifying SendTo Generate Document Link ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		pojo.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(pojo.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		pojo.getSentTo_GenerateDocumentLink();
		Thread.sleep(7000);
		Reporter.log("Send document to Generate Document Link", true);
		jsclick(pojo.getRefreshbutton());
		Reporter.log("Click on Refresh button", true);
		Reporter.log("SendTo GenerateDocumentLink Functionality verified Successfully", true);
	}

	@Test(priority = 41)
	public void TC_41_Verify_SendTo_SecureLink() throws Exception {
		Language pojo = new Language();
		Reporter.log("Test Scenario 41 : Verifying SendTo SecureLink ", true);
		Thread.sleep(7000);
		pojo.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(pojo.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(7000);
		Reporter.log("Check Document from document List", true);
		pojo.getSentTo_SecureLink();
		Thread.sleep(7000);
		Reporter.log("Send document to Secure Link", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("SendTo SecureLink Functionality verified Successfully", true);
		driver.close();
		Reporter.log("Close the Application", true);

	}
}
