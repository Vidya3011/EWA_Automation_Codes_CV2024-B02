package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pom.TemplatePage;

//Dipak Automation script

public class Templates_Test extends Generic.BaseClass {

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
	public void TC_01_verify_to_CreateorBrowse_Template_Defaultviewing() throws Exception {

		TemplatePage pojo = new TemplatePage();
		Reporter.log("Test Scenario 1 :Verifying to Create or Browse Template Default Viewing", true);
		Thread.sleep(8000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My preferences option", true);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office Document and set Default View Option", true);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf Document and set Default View Option", true);
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
		Reporter.log("select a Folder", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(8000);
		Reporter.log("Select Value from Document type Dropdown", true);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(8000);
		Reporter.log("Select Report Name Textbox", true);
		pojo.getSelect_ReportName_Test().sendKeys(pojo.Templates_excelRead(1, 0));
		Reporter.log("Enter value into Report Name field", true);
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(8000);
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Thread.sleep(8000);
		jsclick(pojo.getSave_Template_Button());
		Reporter.log("Click on Save Template button", true);
		Reporter.log("Save Template button clicked successfully", true);
		jsclick(pojo.getTemplate_Description_No_button());
		Thread.sleep(8000);
		Reporter.log("Click on Template Description dialog No button", true);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(6000);
		Reporter.log("Click again on Save Template button", true);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(8000);
		Reporter.log("Click on Template Name Textbox", true);
		pojo.getTemplate_NameTextbox().sendKeys(pojo.Templates_excelRead(4, 0));
		Thread.sleep(8000);
		Reporter.log("Enter value into Template Name field ", true);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(8000);
		Reporter.log("Click on Template Description Textbox", true);
		pojo.getTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(5, 0));
		Thread.sleep(8000);
		Reporter.log("Enter Template Description message", true);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Template Description Yes button", true);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(4000);
		Reporter.log("Verifying Template Created succesfully Message", true);
		jsclick(pojo.getTemplate_Created_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Verifying to CreateorBrowse Template Defaultviewing", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
	}

	@Test(priority = 2)
	public void TC_02_Verify_to_Edit_and_Delete_DefaultTemplate() throws Exception {

		TemplatePage pojo = new TemplatePage();
		Reporter.log("Test Scenario 2: Verifying to  Edit and Delete Default Template", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(8000);
		Reporter.log("Mousehover to Template Tab", true);
		movingclkElement(pojo.getSelect_Created_Template());
		Reporter.log("Select Created Template Page", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		Reporter.log("Created Template page open successfully", true);
		jsclick(pojo.getClick_Edit_Template_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Edit Template Fab Option", true);
		pojo.getEditTemplate_Description_Messagebox().clear();
		Thread.sleep(8000);
		Reporter.log("Click on Edit Template Description Textbox", true);
		pojo.getEditTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(6, 0));
		Thread.sleep(8000);
		Reporter.log("Enter Message under Description Box", true);
		jsclick(pojo.getEditTemplate_Description_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Edit Template Dialog Ok button", true);
		pojo.getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		jsclick(pojo.getEditTemplate_Created_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Template Edited Succesfully Ok button", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(8000);
		Reporter.log("Mousehover to Template Tab", true);
		movingclkElement(pojo.getSelect_Created_Template());
		Thread.sleep(6000);
		Reporter.log("Select Created Template Page", true);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Delete Template Fab Option", true);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Click on Delete Template Dialog Ok button", true);
		Reporter.log("Template Deleted Successfully", true);

	}

	@Test(priority = 3)
	public void TC_03_verify_to_CreateorBrowse_Template_Advancedviewing_Officedoc() throws Exception {

		TemplatePage pojo = new TemplatePage();
		Reporter.log("Test Scenario 3: Verifying to  Create or Browse Template In Advanced Viewing", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getSelect_Office_document_Advancedviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office Document and set Advanced View Option", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
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
		Reporter.log("selecta  Folder", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button of Browse for folder Dialog", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(8000);
		Reporter.log("Select Value from Document Type Dropdown ", true);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(8000);
		Reporter.log("Click on Report Name Textbox", true);
		pojo.getSelect_ReportName_Test().sendKeys(pojo.Templates_excelRead(1, 0));
		Reporter.log("Enter value into Report Name field", true);
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficedoc.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		jsclick(pojo.getSave_Template_Button());
		Reporter.log("Click on Save Template button", true);
		jsclick(pojo.getTemplate_Description_No_button());
		Thread.sleep(8000);
		Reporter.log("Click on Template Description Dialog No button", true);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click again on Save Template button", true);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(8000);
		Reporter.log("Click on Template Name Textbox", true);
		pojo.getTemplate_NameTextbox().sendKeys(pojo.Templates_excelRead(4, 0));
		Thread.sleep(8000);
		Reporter.log("Enter Name under Template Name Textbox", true);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(8000);
		Reporter.log("Click on Template Description Messagebox", true);
		pojo.getTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(5, 0));
		Thread.sleep(8000);
		Reporter.log("Enter Template Description Message Under Description box", true);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Template Description box Ok button", true);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(4000);
		Reporter.log("Verifying Template created successfully Message", true);
		jsclick(pojo.getTemplate_Created_OK_button());
		Reporter.log("Click on Template Created Ok button", true);
		Reporter.log("Verifying to CreateorBrowse Officedoc Template advancedviewing", true);

	}

	@Test(priority = 4)
	public void TC_04_Verify_to_Edit_and_Delete_AdvancedTemplate_Officedoc() throws Exception {

		TemplatePage pojo = new TemplatePage();
		Reporter.log("Test Scenario 4: Verifying to  Edit and Delete Advanced View Officedocument", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(8000);
		Reporter.log("Mousehover to Template Tab", true);
		movingclkElement(pojo.getSelect_Created_Template());
		Thread.sleep(6000);
		Reporter.log("Select Created Template page", true);
		jsclick(pojo.getClick_Edit_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Edit Template Fab button", true);
		pojo.getEditTemplate_Description_Messagebox().clear();
		Thread.sleep(8000);
		Reporter.log("Click on Edit Template Description Messagebox ", true);
		pojo.getEditTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(6, 0));
		Thread.sleep(8000);
		Reporter.log("Enter Message under Edit Template Description Messagebox", true);
		jsclick(pojo.getEditTemplate_Description_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		pojo.getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		jsclick(pojo.getEditTemplate_Created_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Template Edited successfully dialog Ok button", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(8000);
		Reporter.log("Mousehover to Template Tab", true);
		movingclkElement(pojo.getSelect_Created_Template());
		Thread.sleep(6000);
		Reporter.log("Select Created Template page", true);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Delete Template Fab button", true);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Template Deleted Successfully", true);

	}

	@Test(priority = 5)
	public void TC_05_verify_to_Create_Formmapping_PDFTemplate_Advancedviewing() throws Exception {

		TemplatePage pojo = new TemplatePage();
		Reporter.log("Test Scenario 5: Verifying to  Create Form mapping in Advanced viewing", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getPdf_document_Advancedviewing();
		Thread.sleep(8000);
		Reporter.log("Select Pdf Document and set Advanced view Option", true);
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
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(8000);
		Reporter.log("Select value from Document type dropdown", true);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(2000);
		Reporter.log("Click on Report Name Textbox", true);
		pojo.getSelect_ReportName_Test().sendKeys(pojo.Templates_excelRead(1, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		pojo.getMove_To_PlusIcon1();
		pojo.getNew_pdf_Document_Option();
		Thread.sleep(8000);
		Reporter.log("Browse Document Page", true);
		pojo.getEnter_pdf_File_Name();
		Thread.sleep(7000);
		Reporter.log("Enter Pdf file Name", true);
		jsclick(pojo.getpdfViewer());
		Thread.sleep(8000);
		Reporter.log("Click on PdfViewer menu option", true);
		jsclick(pojo.getTextbox());
		Thread.sleep(8000);
		Reporter.log("Click on Textbox", true);
		jsclick(pojo.getAdd_Textbox_Onpage());
		Thread.sleep(8000);
		Reporter.log("Select and Add Textbox on  Page", true);
		jsclick(pojo.getClick_Formmapper());
		Thread.sleep(8000);
		Reporter.log("Click on Form mapping Option", true);
		pojo.getSelect_Formfield();
		Thread.sleep(8000);
		Reporter.log("Select Form field", true);
		jsclick(pojo.getFormOK());
		Thread.sleep(8000);
		Reporter.log("Click on  Ok button", true);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Save Template button", true);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(8000);
		Reporter.log("Click on Template Name Textbox", true);
		pojo.getTemplate_NameTextbox().sendKeys(pojo.Templates_excelRead(4, 0));
		Thread.sleep(8000);
		Reporter.log("Enter value into Template Name field", true);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(8000);
		Reporter.log("Click on  Template Description Messagebox", true);
		pojo.getTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(5, 0));
		Thread.sleep(8000);
		Reporter.log("Enter Description Message into Description field", true);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(4000);
		Reporter.log("Template Created Successfully", true);
		jsclick(pojo.getTemplate_Created_OK_button());
		Reporter.log("Verifying to CreateorBrowse Formmapping Template advancedviewing", true);

	}

	@Test(priority = 6)
	public void TC_06_Verify_to_Edit_and_Delete_Formfield() throws Exception {

		TemplatePage pojo = new TemplatePage();
		Reporter.log("Test Scenario 6: Verifying to  Edit and Delete Form field", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(8000);
		Reporter.log("Click on Template Tab", true);
		movingclkElement(pojo.getSelect_Created_Template());
		Thread.sleep(6000);
		Reporter.log("Select Created Template Document page", true);
		jsclick(pojo.getClick_Edit_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Edit Template Fab button", true);
		pojo.getEditTemplate_Description_Messagebox().clear();
		Thread.sleep(8000);
		Reporter.log("Clik on Edit Template Description Messagebox", true);
		pojo.getEditTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(6, 0));
		Thread.sleep(8000);
		Reporter.log("Enter Description Message into Description field", true);
		jsclick(pojo.getEditTemplate_Description_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		pojo.getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		jsclick(pojo.getEditTemplate_Created_OK_button());
		Thread.sleep(8000);
		Reporter.log("Click on Ok button", true);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(8000);
		Reporter.log("Click on Template Tab", true);
		movingclkElement(pojo.getSelect_Created_Template());
		Thread.sleep(6000);
		Reporter.log("Select Created Template page", true);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(8000);
		Reporter.log("Click on Delete Template Fab button", true);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Formmapping Template Deleted Successfully", true);

	}

	@Test(priority = 7)
	public void TC_07_Set_Defaultview() throws Exception {

		TemplatePage pojo = new TemplatePage();
		Reporter.log("Test Scenario 7: Set Office and Pdf document option in Default view", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(8000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(8000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select Office Documentand set Default View Option", true);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(8000);
		Reporter.log("Select PdfDocument and set Default View Option", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(8000);
		Reporter.log("Click on Apply button", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
