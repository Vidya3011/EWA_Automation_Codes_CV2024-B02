
package Script;

import java.io.IOException;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pom.Logout;
import Pom.TemplatePage;

//Dipak Automation script
public class Templates_Test extends Generic.BaseClass {
	private static final Logger log = LogManager.getLogger(Templates_Test.class);

	@BeforeClass
	public void LandBrowser() {

		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	@Test
	public void Login_EWA() throws Exception {
		loginCVS();
		log.info("CVS User is logged in successfully...");

	}

	@Test(priority = 01)
	public void verify_to_CreateorBrowse_Template_advancedviewing() throws Exception {

		TemplatePage pojo = new TemplatePage();
		jsclick(Generic.BaseClass.Refresh_Button(driver));
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
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(4000);
		pojo.getSelect_ReportName_Test().sendKeys(pojo.Templates_excelRead(1, 0));

		// 1. Verify_Create_NewWorddocumentTempaltes_Advancedviewing
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		Thread.sleep(5000);
		pojo.getNew_Word_Document_Option();
		Thread.sleep(4000);
		pojo.getEnter_Word_File_Name();
		Thread.sleep(4000);
		Reporter.log("New Word document Templates created succesfully with advancedviewing", true);
		log.info("New Word document Templates created succesfully with advancedviewing");

		// 2. Verify_Create_NewExcelSpreadsheet_documentTemplates_Advancedviewing
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getNew_Excel_Spreadsheet_Option();
		Thread.sleep(4000);
		pojo.getEnter_Excel_File_Name();
		jsclick(pojo.getOpenExcel_Document());
		Thread.sleep(4000);
		Reporter.log("New Excel document Templates created succesfully with advancedviewing", true);
		log.info("New Excel document Templates created succesfully with advancedviewing");

		// 3. verify_to_CreateorBrowse_Officedoc_Template_advancedviewing

		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		try {

			Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficedoc.exe");

		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("file is uploaded successfully and Verify Browse Templates advancedviewing", true);
		Thread.sleep(3000);
		jsclick(pojo.getOpenpdf_Document());
		Thread.sleep(3000);
		jsclick(pojo.getSelect_Retain_Checkbox());
		Thread.sleep(3000);
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
		log.info("verify to CreateorBrowse Officedoc Template advancedviewing");
	}

	@Test(priority = 2)
	public void verify_to_CreateorBrowse_Template_Defaultviewing() throws Exception {

		TemplatePage pojo = new TemplatePage();
		jsclick(Generic.BaseClass.Refresh_Button(driver));
		Thread.sleep(6000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(6000);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Retain_Checkbox());
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		try {

			Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");

		} catch (IOException e) {
			e.printStackTrace();
		}
		Reporter.log("file is uploaded successfully for Defaultviewing", true);
		jsclick(pojo.getOpenDefaultView_Document());
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		jsclick(pojo.getCreated_button());
		Thread.sleep(4000);
		Reporter.log("Templates Document created successfully", true);
		jsclick(pojo.getNavigate_button());
		Thread.sleep(4000);
		log.info("verify to CreateorBrowse Template Defaultviewing");
	}

	@Test(priority = 3)
	public void Verify_to_Edit_and_Delete_Template() throws Exception {

		TemplatePage pojo = new TemplatePage();
		jsclick(pojo.getSelect_Home_Templatedoc());
		Thread.sleep(4000);
		jsclick(pojo.getClick_Edit_Template_Button());
		Thread.sleep(4000);
		pojo.getEditTemplate_Description_Messagebox().clear();
		Thread.sleep(4000);
		pojo.getEditTemplate_Description_Messagebox().sendKeys(pojo.Templates_excelRead(6, 0));
		Thread.sleep(4000);
		jsclick(pojo.getEditTemplate_Description_OK_button());
		Thread.sleep(4000);
		pojo.getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		log.info("verify Template edited successfully");
		jsclick(pojo.getEditTemplate_Created_OK_button());
		Thread.sleep(4000);
		jsclick(pojo.getEditTemplate_Description_No_button());
		Thread.sleep(4000);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(4000);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Template Deleted Successfully", true);
		log.info("verify Template Deleted Successfully");

	}

	
}
