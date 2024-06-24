package Script;
//Dipak Automation script

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.TemplatePage;

public class Negative_Templates extends Generic.BaseClass {

	@BeforeClass
	public void Launch_Browser() throws Exception {

		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfull", true);
	}

	@Test
	public void Login_EWA() throws Exception {
		LogDipakUser();
		// loginadminuser(); 
		Reporter.log("User has logged in successfully.", true);

	}

	// @Test(priority = 1)
	public void TC_01_Set_permission_for_Template() throws Exception {

		TemplatePage pojo = new TemplatePage();
		Thread.sleep(8000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(8000);
		jsclick(pojo.getSelect_Document_Template());
		Thread.sleep(6000);
		movingclkElement(pojo.getSelect_Userlist());
		Thread.sleep(8000);
		pojo.Select_AllUser();
		Thread.sleep(8000);
		jsclick(pojo.getTemplateApply());
		Thread.sleep(8000);
		jsclick(pojo.getUsername());
		Thread.sleep(8000);
		jsclick(pojo.getLogout());

	}

	@Test(priority = 1)
	public void TC_02_Login_Template_permissionassign_User_and_verify_message_Select_Folder_ToCreateDoc()
			throws Exception {

		TemplatePage pojo = new TemplatePage();

		Reporter.log("Test Scenario 1 : Verifying message Select Folder To Create Document ", true);

		Thread.sleep(8000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office Documnet and set as Default view", true);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf Documnet and set as Default view", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(8000);
		Reporter.log("Click on Template Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(8000);
		Reporter.log("Click on Destination Folder TextBox", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		pojo.getFolderSelectMessage();
		Thread.sleep(8000);
		Reporter.log("Verified Select Folder Validation message", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		pojo.getFolderSelectMessage();
		Thread.sleep(8000);
		Reporter.log("Verified Select Folder Validation message", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		pojo.getFolderSelectMessage();
		Thread.sleep(8000);
		Reporter.log("Verified Select Folder validation message", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(8000);
		Reporter.log(" select a Folder", true);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Reporter.log("Click on Ok button", true);
		Thread.sleep(8000);
	}

	@Test(priority = 2)
	public void TC_02_verify_message_addPages_Using_SaveandClearButton() throws Exception {

		TemplatePage pojo = new TemplatePage();

		Reporter.log("Test Scenario 2 : Verifying message add Pages Using Save and Clear button ", true);
		Thread.sleep(8000);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Save Template button", true);
		pojo.getFolder_ErrorMessage();
		Thread.sleep(8000);
		Reporter.log("Verified Error message", true);
		jsclick(pojo.getsavetemp());
		Thread.sleep(8000);
		Reporter.log("Click on Save Template button", true);
		pojo.getFolder_ErrorMessage();
		Thread.sleep(8000);
		Reporter.log("Verified Error message", true);
		jsclick(pojo.getClearButton());
		Thread.sleep(8000);
		Reporter.log("Click on Clear button", true);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Save Template button", true);
		pojo.getFolder_ErrorMessage();
		Thread.sleep(8000);
		Reporter.log("Verified Error message", true);
		jsclick(pojo.getsavetemp());
		Thread.sleep(8000);
		Reporter.log("Click on Save Template button", true);
		pojo.getFolder_ErrorMessage();
		Thread.sleep(8000);
		Reporter.log("Verified Error message", true);
		Reporter.log("Add pages message verified", true);
	}

	@Test(priority = 3)
	public void TC_03_Verify_TextboxName_and_Templatename_validation() throws Exception {

		TemplatePage pojo = new TemplatePage();

		Reporter.log("Test Scenario 3 : Verifying Textbox Name and Templatename validation ", true);
		Thread.sleep(8000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Reporter.log("Select Document type dropdown", true);
		Thread.sleep(8000);
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse  Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(8000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Save Template button", true);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Template Description Ok button", true);
		pojo.getvalidationerror();
		Thread.sleep(8000);
		Reporter.log("Verified Validation error message", true);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(8000);
		Reporter.log("Click on Template Name Textbox", true);
		pojo.getTemplate_NameTextbox().sendKeys(pojo.Templates_excelRead(4, 0));
		Thread.sleep(8000);
		Reporter.log("Enter Value Template Name Name Textbox", true);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(4000);
		Reporter.log("Verified Template created successfully", true);
		jsclick(pojo.getTemplate_Created_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(8000);
		Reporter.log("Select Created Template from Template Tab", true);
		jsclick(pojo.getCreatedoc());
		Thread.sleep(8000);
		Reporter.log("Click on Create button", true);
		pojo.getReportvaluevalidationerror();
		Thread.sleep(8000);
		Reporter.log("Verified validation Error", true);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Delete Template Fab button", true);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Template Deleted Successfully", true);
		Reporter.log("Texbox and Template name validate", true);
	}

	@Test(priority = 4)
	public void TC_04_Verify_validation_Duplicate_Template_Created() throws Exception {

		TemplatePage pojo = new TemplatePage();

		Reporter.log("Test Scenario 4 : Verifying validation Duplicate Template Created ", true);
		Thread.sleep(8000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office Document and set as Default View", true);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select PdfC Document and set as Default View", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(8000);
		Reporter.log("Click on Template Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(8000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(8000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(8000);
		Reporter.log("Select Document type dropdown", true);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(8000);
		Reporter.log("Click on Report Name textbox", true);
		pojo.getSelect_ReportName_Test().sendKeys(pojo.Templates_excelRead(1, 0));
		Reporter.log("Enter Report value into ReportName textbox", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(3000);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		jsclick(pojo.getSave_Template_Button());
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getTemplate_Description_No_button());
		Thread.sleep(8000);
		Reporter.log("Click on Template Description No button", true);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Save Template button", true);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(8000);
		Reporter.log("Click on Template Name textbox", true);
		pojo.getTemplate_NameTextbox().sendKeys(pojo.Templates_excelRead(4, 0));
		Thread.sleep(8000);
		Reporter.log("Enter Template Name", true);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(8000);
		Reporter.log("Click on Template Description messagebox", true);
		pojo.getTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(5, 0));
		Thread.sleep(8000);
		Reporter.log("Enter message under Template Description", true);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Template Description dialog OK button", true);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(4000);
		Reporter.log("Verified Template created successfully", true);
		jsclick(pojo.getTemplate_Created_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Verifying to CreateorBrowse Template Defaultviewing", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(8000);
		Reporter.log("Click on Template Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(8000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(8000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(8000);
		Reporter.log("Select Document type dropdown", true);
		jsclick(pojo.getSelect_ReportName_Test());
		Reporter.log("Select Report name textbox", true);
		pojo.getSelect_ReportName_Test().sendKeys(pojo.Templates_excelRead(1, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field");
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(3000);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		jsclick(pojo.getSave_Template_Button());
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getTemplate_Description_No_button());
		Thread.sleep(8000);
		Reporter.log("Click on Template Description No button", true);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Save Template button", true);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(2000);
		Reporter.log("Click on Template Name textbox", true);
		pojo.getTemplate_NameTextbox().sendKeys(pojo.Templates_excelRead(4, 0));
		Thread.sleep(8000);
		Reporter.log("Enter Template Name", true);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(8000);
		Reporter.log("Click on Template Decription messagebox", true);
		pojo.getTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(5, 0));
		Thread.sleep(8000);
		Reporter.log("Enter message in Template description textbox", true);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		pojo.getVerify_DuplicateTemp_Message();
		Thread.sleep(8000);
		Reporter.log("Verified Template already exist validation message", true);
		movingclkElement(pojo.getOkbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getNobutton());
		Thread.sleep(8000);
		Reporter.log("Click on No button", true);
		jsclick(pojo.getRefreshbutton());
		Reporter.log("Click on  Refresh button", true);
		Reporter.log("Duplicate Template not creating validate", true);
		Thread.sleep(8000);
		jsclick(pojo.getSelect_Created_Template());
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt2 = driver.switchTo().alert();
		alt2.accept();
		Thread.sleep(8000);
		Reporter.log("Select created Template from Template Tab", true);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Delete Template Fab button", true);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Template Deleted Successfully", true);

	}

	@Test(priority = 5)
	public void TC_05_verify_to_CreateorBrowse_Template_Advancedviewing_Officedoc() throws Exception {

		TemplatePage pojo = new TemplatePage();

		Reporter.log("Test Scenario 5 : Verifying to Create or Browse Template Advancedviewing Officedoc", true);
		Thread.sleep(6000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getSelect_Office_document_Advancedviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Advanced view", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(8000);
		Reporter.log("Click on Templates Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(8000);
		Reporter.log("Click on Destination Folder textbox", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(8000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(8000);
		Reporter.log("Select Document type dropdown value", true);
		jsclick(pojo.getSelect_ReportName_Test());
		Reporter.log("Click on Report Name", true);
		pojo.getSelect_ReportName_Test().sendKeys(pojo.Templates_excelRead(1, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon1());
		pojo.getNew_Word_Document_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Word document", true);
		jsclick(pojo.getOKButton());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		pojo.getFilenamevalidation();
		Thread.sleep(8000);
		Reporter.log("Verified Validation error", true);
		pojo.getEnter_Word_File_Name();
		Thread.sleep(2000);
		Reporter.log("Enter Word file name", true);
		jsclick(pojo.getOpen_Word_page());
		Thread.sleep(2000);
		Reporter.log("Select word page", true);
		Reporter.log("Advanced Viewing New Word Document Created", true);
		movingElement(pojo.getMove_To_PlusIcon1());
		pojo.getNew_Excel_Spreadsheet_Option();
		Thread.sleep(8000);
		Reporter.log("Browse Excel document", true);
		jsclick(pojo.getOKButton());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		pojo.getFilenamevalidation();
		Thread.sleep(8000);
		Reporter.log("Verified Validation error message", true);
		pojo.getEnter_Excel_File_Name();
		Thread.sleep(8000);
		Reporter.log("Enter Excel file name", true);
		jsclick(pojo.getOpen_Excel_page());
		Thread.sleep(8000);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(8000);
		Reporter.log("Browse  Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficedoc.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(8000);
		Reporter.log("Advanced Viewing New Excel Document Created", true);
		jsclick(pojo.getSave_Template_Button());
		Reporter.log("Save Template button clicked successfully", true);
		jsclick(pojo.getTemplate_Description_No_button());
		Thread.sleep(8000);
		Reporter.log("Click on Template description No button", true);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Save Template button", true);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(8000);
		Reporter.log("Click on Template name Textbox", true);
		pojo.getTemplate_NameTextbox().sendKeys(pojo.Templates_excelRead(4, 0));
		Thread.sleep(8000);
		Reporter.log("Enter Template Name", true);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(8000);
		Reporter.log("Click on Template Description messagebox", true);
		pojo.getTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(5, 0));
		Thread.sleep(8000);
		Reporter.log("Enter message under Template Description", true);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(4000);
		Reporter.log("Verified Template created successfully", true);
		jsclick(pojo.getTemplate_Created_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Verifying to CreateorBrowse Officedoc Template advancedviewing", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(8000);
		Reporter.log("Mousehover to Template Tab", true);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(7000);
		Reporter.log("Select created Template", true);
		jsclick(pojo.getCreatedoc());
		Thread.sleep(8000);
		Reporter.log("Click on Create button", true);
		pojo.getNavigateDoc();
		Thread.sleep(8000);
		Reporter.log("Click on Navigate button", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(8000);
		Reporter.log("Select Created Template", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			// Alert not present
		}
		Thread.sleep(7000);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Delete Template Fab button", true);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Click on Ok button", true);
		Reporter.log("Template Deleted Successfully", true);
	}

	@Test(priority = 6)
	public void TC_06_verify_Validation_Formmapping_PDFTemplate_Advancedviewing() throws Exception {

		TemplatePage pojo = new TemplatePage();

		Reporter.log("Test Scenario 6 : Verifying Validation Formmapping PDF Template Advancedviewing ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		pojo.getPdf_document_Advancedviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Advanced view", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(8000);
		Reporter.log("Click on Template Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(8000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(8000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(8000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(8000);
		Reporter.log("Folder is selected for Templates", true);
		pojo.getOK_Button_BrowseforFolder().click();
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(8000);
		Reporter.log("Select Document type dropdown", true);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(8000);
		Reporter.log("Click on Report Name", true);
		pojo.getSelect_ReportName_Test().sendKeys(pojo.Templates_excelRead(1, 0));
		Reporter.log("Enter value Report Name Textbox", true);
		movingElement(pojo.getMove_To_PlusIcon1());
		pojo.getNew_pdf_Document_Option();
		Thread.sleep(8000);
		Reporter.log("Browse New Pdf document", true);
		jsclick(pojo.getOKButton());
		Thread.sleep(8000);
		Reporter.log("Click on  Ok button", true);
		pojo.getFilenamevalidation();
		Thread.sleep(8000);
		Reporter.log("Verified Validation error message ", true);
		pojo.getEnter_pdf_File_Name();
		Thread.sleep(8000);
		Reporter.log("Enter value Pdf file name field", true);
		jsclick(pojo.getClick_Formmapper());
		Thread.sleep(8000);
		Reporter.log("Click on Form mapping", true);
		pojo.getFormmappingvalidation();
		Reporter.log("Verified Form mapping validation message", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getNobutton());
		Thread.sleep(8000);
		Reporter.log("Click on No button", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("Form mapping validation verified", true);
	}

	@Test(priority = 7)
	public void TC_07_Set_Defaultview() throws Exception {

		TemplatePage pojo = new TemplatePage();

		Reporter.log("Test Scenario 7 : Set Defaultview", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office document and set as Default View", true);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf document and set as Default View", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		driver.close();
		Reporter.log("Close the application", true);
	}
}
