package Script;
//Dipak Automation script

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.TemplatePage;

public class Negative_Templates extends Generic.BaseClass {
	private static final Logger log = LogManager.getLogger(Negative_Templates.class);

	// @BeforeClass
	public void LandBrowser() {

		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	// @Test
	public void Login_EWA() throws Exception {
		LogDipakUser();
		log.info("CVS User is logged in successfully...");

	}

	@Test(priority = 1)
	public void verify_message_Select_Folder_ToCreateDoc() throws Exception {

		TemplatePage pojo = new TemplatePage();
		Thread.sleep(6000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(3000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		pojo.getFolderSelectMessage();
		Thread.sleep(3000);
		movingDoublecli(pojo.getTemplate_Test_Cabinet(), pojo.getTemplate_Test_Cabinet());
		Thread.sleep(4000);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		pojo.getFolderSelectMessage();
		Thread.sleep(3000);
		movingDoublecli(pojo.getTemplate_Test_Drawer(), pojo.getTemplate_Test_Drawer());
		Thread.sleep(4000);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		pojo.getFolderSelectMessage();
		Thread.sleep(3000);
		movingDoublecli(pojo.getTemplate_Folder(), pojo.getTemplate_Folder());
		Thread.sleep(4000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Reporter.log("Select Folder message verified", true);
		Thread.sleep(4000);
	}

	@Test(priority = 2)
	public void verify_message_addPages_Using_SaveandClearButton() throws Exception {

		TemplatePage pojo = new TemplatePage();
		Thread.sleep(6000);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(4000);
		pojo.getFolder_ErrorMessage();
		Thread.sleep(4000);
		jsclick(pojo.getsavetemp());
		Thread.sleep(4000);
		pojo.getFolder_ErrorMessage();
		Thread.sleep(4000);
		jsclick(pojo.getClearButton());
		Thread.sleep(4000);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(4000);
		pojo.getFolder_ErrorMessage();
		Thread.sleep(4000);
		jsclick(pojo.getsavetemp());
		Thread.sleep(4000);
		pojo.getFolder_ErrorMessage();
		Thread.sleep(4000);
		Reporter.log("Add pages message verified", true);
	}

	@Test(priority = 3)
	public void Verify_TextboxName_and_Templatename_validation() throws Exception {

		TemplatePage pojo = new TemplatePage();
		Thread.sleep(6000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt2 = driver.switchTo().alert();
		alt2.accept();
		Thread.sleep(4000);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(4000);
		pojo.getvalidationerror();
		Thread.sleep(2000);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(4000);
		pojo.getTemplate_NameTextbox().sendKeys(pojo.Templates_excelRead(4, 0));
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(4000);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Created_OK_button());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getSelect_Created_Template());
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(6000);
		jsclick(pojo.getCreatedoc());
		Thread.sleep(6000);
		pojo.getReportvaluevalidationerror();
		Thread.sleep(4000);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(4000);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Template Deleted Successfully", true);
		Reporter.log("Texbox and Template name validate", true);
	}

	@Test(priority = 4)
	public void Verify_validation_Duplicate_Template_Created() throws Exception {

		TemplatePage pojo = new TemplatePage();
		Thread.sleep(6000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(3000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Test_Cabinet(), pojo.getTemplate_Test_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Test_Drawer(), pojo.getTemplate_Test_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Folder(), pojo.getTemplate_Folder());
		Thread.sleep(4000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(4000);
		pojo.getSelect_ReportName_Test().sendKeys(pojo.Templates_excelRead(1, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Reporter.log("file is uploaded successfully and Verify Browse Templates Defaultviewing", true);
		log.info("verify to CreateorBrowse Template Defaultviewing");
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		jsclick(pojo.getSave_Template_Button());
		Reporter.log("Save Template button clicked successfully", true);
		jsclick(pojo.getTemplate_Description_No_button());
		Thread.sleep(3000);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(3000);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(4000);
		pojo.getTemplate_NameTextbox().sendKeys(pojo.Templates_excelRead(4, 0));
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(4000);
		pojo.getTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(5, 0));
		Thread.sleep(3000);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(4000);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Created_OK_button());
		Thread.sleep(4000);
		log.info("verify to CreateorBrowse Template Defaultviewing");
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(3000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Test_Cabinet(), pojo.getTemplate_Test_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Test_Drawer(), pojo.getTemplate_Test_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Folder(), pojo.getTemplate_Folder());
		Thread.sleep(4000);
		Reporter.log("Folder is selected for Templates", true);
		pojo.getOK_Button_BrowseforFolder().click();
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(4000);
		pojo.getSelect_ReportName_Test().sendKeys(pojo.Templates_excelRead(1, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Reporter.log("file is uploaded successfully and Verify Browse Templates Defaultviewing", true);
		log.info("verify to CreateorBrowse Template Defaultviewing");
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		jsclick(pojo.getSave_Template_Button());
		Reporter.log("Save Template button clicked successfully", true);
		jsclick(pojo.getTemplate_Description_No_button());
		Thread.sleep(3000);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(3000);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(4000);
		pojo.getTemplate_NameTextbox().sendKeys(pojo.Templates_excelRead(4, 0));
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(4000);
		pojo.getTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(5, 0));
		Thread.sleep(3000);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(4000);
		pojo.getVerify_DuplicateTemp_Message();
		Thread.sleep(3000);
		jsclick(pojo.getOkbutton());
		Thread.sleep(2000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(2000);
		jsclick(pojo.getNobutton());
		Thread.sleep(2000);
		jsclick(pojo.getRefreshbutton());
		Reporter.log("Duplicate Template not creating validate", true);
		Thread.sleep(6000);
		jsclick(pojo.getSelect_Created_Template());
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt2 = driver.switchTo().alert();
		alt2.accept();
		Thread.sleep(6000);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(4000);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Template Deleted Successfully", true);

	}

	@Test(priority = 5)
	public void verify_to_CreateorBrowse_Template_Advancedviewing_Officedoc() throws Exception {

		TemplatePage pojo = new TemplatePage();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Office_document_Advancedviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(3000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Test_Cabinet(), pojo.getTemplate_Test_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Test_Drawer(), pojo.getTemplate_Test_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Folder(), pojo.getTemplate_Folder());
		Thread.sleep(4000);
		Reporter.log("Folder is selected for Templates", true);
		pojo.getOK_Button_BrowseforFolder().click();
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(4000);
		pojo.getSelect_ReportName_Test().sendKeys(pojo.Templates_excelRead(1, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficedoc.exe");
		Reporter.log("file is uploaded successfully and Verify Browse Templates Advancedviewing", true);
		log.info("verify to CreateorBrowse Template Advancedviewing");
		Thread.sleep(8000);
		pojo.getMove_To_PlusIcon();
		pojo.getNew_Word_Document_Option();
		Thread.sleep(3000);
		jsclick(pojo.getOKButton());
		Thread.sleep(3000);
		pojo.getFilenamevalidation();
		Thread.sleep(3000);
		pojo.getEnter_Word_File_Name();
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Word_page());
		Thread.sleep(4000);
		Reporter.log("Advanced Viewing New Word Document Created", true);
		log.info("Advanced Viewing New Word Document Created");
		pojo.getMove_To_PlusIcon();
		pojo.getNew_Excel_Spreadsheet_Option();
		Thread.sleep(3000);
		jsclick(pojo.getOKButton());
		Thread.sleep(3000);
		pojo.getFilenamevalidation();
		Thread.sleep(3000);
		pojo.getEnter_Excel_File_Name();
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Excel_page());
		Thread.sleep(6000);
		Reporter.log("Advanced Viewing New Excel Document Created", true);
		log.info("Advanced Viewing New Excel Document Created");
		jsclick(pojo.getSave_Template_Button());
		Reporter.log("Save Template button clicked successfully", true);
		jsclick(pojo.getTemplate_Description_No_button());
		Thread.sleep(3000);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(3000);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(4000);
		pojo.getTemplate_NameTextbox().sendKeys(pojo.Templates_excelRead(4, 0));
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(4000);
		pojo.getTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(5, 0));
		Thread.sleep(3000);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(4000);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Created_OK_button());
		Thread.sleep(4000);
		log.info("verify to CreateorBrowse Officedoc Template advancedviewing");
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(3000);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(8000);
		jsclick(pojo.getCreatedoc());
		Thread.sleep(6000);
		pojo.getNavigateDoc();
		Thread.sleep(6000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(8000);
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
		Thread.sleep(4000);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Template Deleted Successfully", true);
	}

	@Test(priority = 6)
	public void verify_Validation_Formmapping_PDFTemplate_Advancedviewing() throws Exception {

		TemplatePage pojo = new TemplatePage();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getPdf_document_Advancedviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(3000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Test_Cabinet(), pojo.getTemplate_Test_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Test_Drawer(), pojo.getTemplate_Test_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Folder(), pojo.getTemplate_Folder());
		Thread.sleep(4000);
		Reporter.log("Folder is selected for Templates", true);
		pojo.getOK_Button_BrowseforFolder().click();
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(4000);
		pojo.getSelect_ReportName_Test().sendKeys(pojo.Templates_excelRead(1, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getNew_pdf_Document_Option();
		Thread.sleep(3000);
		jsclick(pojo.getOKButton());
		Thread.sleep(3000);
		pojo.getFilenamevalidation();
		Thread.sleep(3000);
		pojo.getEnter_pdf_File_Name();
		Thread.sleep(6000);
		jsclick(pojo.getClick_Formmapper());
		Thread.sleep(4000);
		pojo.getFormmappingvalidation();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(2000);
		jsclick(pojo.getNobutton());
		Thread.sleep(2000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		Reporter.log("Form mapping validation verified", true);
	}

	@Test(priority = 7)
	public void Set_Defaultview() throws Exception {

		TemplatePage pojo = new TemplatePage();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
	}
}
