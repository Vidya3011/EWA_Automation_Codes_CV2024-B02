package French_Language;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Language;
import Pom.LanguageHindiFrench;

public class French_Language_DocumentVersion extends Generic.BaseClass {

	private static final Logger log = LogManager.getLogger(French_Language_DocumentVersion.class);

	@BeforeClass
	public void LandBrowser() {

		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	@Test
	public void Login_EWA() throws Exception {
		LanguageHindiFrench ln=new LanguageHindiFrench();
		ln.frenchLanguageScript();
		loginCVS();
		
		log.info("CVS User is logged in successfully...");

	}

	// Verify Dutch Language
	// Create Document with annotation in Dutch laguage

	@Test(priority = 1)
	public void CreateandOpen_NewDocument_Dutch_Language() throws Exception {

		Language pojo = new Language();
		/*jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(6000);
		jsclick(pojo.getUsername());
		Thread.sleep(6000);
		jsclick(pojo.getLogout());
		Thread.sleep(4000);
		jsclick(pojo.getDutch_Language());
		Thread.sleep(4000);
		LogDipakUser();*/
		Thread.sleep(6000);
		jsclick(pojo.getNewDocuments_MenuOption());
		Thread.sleep(4000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Cabinet(), pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Drawer(), pojo.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Folder(), pojo.getSelect_Folder());
		Thread.sleep(6000);
		Reporter.log("Folder is selected for Create New Documents", true);
		pojo.getOK_Button_BrowseforFolder().click();
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		pojo.getEnter_Report_Name_Text().sendKeys(pojo.Language_excelRead(0, 4));
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hyphen.exe");
		Thread.sleep(5000);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(6000);
		pojo.getClickOCR().click();
		Thread.sleep(4000);
		pojo.getSet_OCR_ToDocumentPDF();
		Thread.sleep(8000);
		pojo.getReportName().click();
		Thread.sleep(4000);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(4000);
		jsclick(pojo.getNavigate_Button());
		Thread.sleep(6000);
		pojo.getOCRReportnamevalidation_BeforeCreateDOC();
		Thread.sleep(4000);
		jsclick(pojo.getReportNameValueBeforeDoc());
		Thread.sleep(6000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		Reporter.log("New Document Create and open in Dutch language", true);
		Reporter.log("OCR Functionality verified Sucessfully", true);

	}

	@Test(priority = 2)
	public void Verify_OCR_afterCreatingDocument() throws Exception {

		Language pojo = new Language();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Underscore.exe");
		Thread.sleep(8000);
		jsclick(pojo.getOpen_Underscore_page());
		Thread.sleep(8000);
		pojo.getUpdateDutch_Button().click();
		Thread.sleep(4000);
		pojo.getClickOCR().click();
		Thread.sleep(4000);
		pojo.getSet_OCR_ToDocument();
		Thread.sleep(6000);
		pojo.getReportName().click();
		Thread.sleep(4000);
		jsclick(pojo.getDutchSave_UpdateButton());
		Thread.sleep(3000);
		jsclick(pojo.getDutchUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(4000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getDutchProperties_option());
		Thread.sleep(4000);
		jsclick(pojo.getClose_Documentpage());
		Thread.sleep(4000);
		pojo.getOCRReportnamevalidation_AfterCreateDOC();
		Thread.sleep(8000);
		jsclick(pojo.getReportNameValueAfterDoc());
		Reporter.log("After Creating Document OCR Functionality verified Sucessfully", true);

	}

	@Test(priority = 3)
	public void Addsignature_Dutch_Language() throws Exception {

		Language pojo = new Language();
		Thread.sleep(6000);
		jsclick(pojo.getClick_signature_Menuoption());
		Thread.sleep(4000);
		pojo.getinputpassword();
		Thread.sleep(4000);
		pojo.getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Reporter.log("signature added Successfully on the Document", true);
	}

	@Test(priority = 4)
	public void AddRedaction_Dutch_Language() throws Exception {

		Language pojo = new Language();
		Thread.sleep(4000);
		pojo.getMove_to_Annotation_Option_inViewer();
		Thread.sleep(6000);
		pojo.getRedaction_Option();
		Thread.sleep(6000);
		pojo.getSet_Redaction_ToDocument();
		Thread.sleep(6000);
		jsclick(pojo.getSave_button());
		Thread.sleep(4000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		Reporter.log("Redaction added Successfully on the Document", true);
	}

	@Test(priority = 5)
	public void ShowHideThumbnail_Dutch_Language() throws Exception {

		Language pojo = new Language();
		Thread.sleep(4000);
		jsclick(pojo.getshowHideThumbnail());
		Thread.sleep(8000);
		jsclick(pojo.getshowHideThumbnail());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		Reporter.log("Show Hide Thumbnail options verified", true);
	}

	// Create Template in Spanish laguage

	@Test(priority = 6)
	public void verify_to_CreateorBrowse_Template_Defaultviewing() throws Exception {

		Language pojo = new Language();
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
		pojo.getSelect_ReportName_Testvalue();
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
		pojo.getTemplate_NameTextboxvalue();
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(4000);
		pojo.getTemplate_Description_Messageboxvalue();
		Thread.sleep(3000);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(4000);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Created_OK_button());
		Thread.sleep(4000);
		log.info("verify to CreateorBrowse Template Defaultviewing");

	}

	@Test(priority = 7)
	public void Verify_to_Edit_and_Delete_DefaultTemplate() throws Exception {

		Language pojo = new Language();
		pojo.getMoveto_Templates_Option();
		Thread.sleep(3000);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(6000);
		jsclick(pojo.getClick_Edit_Template_Button());
		Thread.sleep(7000);
		pojo.getEditTemplate_Description_Messagebox().clear();
		Thread.sleep(4000);
		pojo.getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(4000);
		jsclick(pojo.getEditTemplate_Description_OK_button());
		Thread.sleep(4000);
		pojo.getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		log.info("verify Template edited successfully");
		jsclick(pojo.getEditTemplate_Created_OK_button());
		Thread.sleep(4000);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(3000);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(8000);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(4000);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Template Deleted Successfully", true);
		log.info("verify Template Deleted Successfully");

	}

	@Test(priority = 8)
	public void verify_to_CreateorBrowse_Template_Advancedviewing_OfficeDoc() throws Exception {

		Language pojo = new Language();
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
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(4000);
		pojo.getSelect_ReportName_Testvalue();
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficeDoc.exe");
		Reporter.log("file is uploaded successfully and Verify Browse Templates Advancedviewing", true);
		log.info("verify to CreateorBrowse Template Advancedviewing");
		Thread.sleep(8000);
		jsclick(pojo.getSave_Template_Button());
		Reporter.log("Save Template button clicked successfully", true);
		jsclick(pojo.getTemplate_Description_No_button());
		Thread.sleep(3000);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(3000);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(4000);
		pojo.getTemplate_NameTextboxvalue();
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(4000);
		pojo.getTemplate_Description_Messageboxvalue();
		Thread.sleep(3000);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(4000);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Created_OK_button());
		log.info("verify to CreateorBrowse OfficeDoc Template advancedviewing");

	}

	@Test(priority = 9)
	public void Verify_to_Edit_and_Delete_AdvancedTemplate_OfficeDoc() throws Exception {

		Language pojo = new Language();
		pojo.getMoveto_Templates_Option();
		Thread.sleep(3000);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(8000);
		jsclick(pojo.getClick_Edit_Template_Button());
		Thread.sleep(4000);
		pojo.getEditTemplate_Description_Messagebox().clear();
		Thread.sleep(4000);
		pojo.getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(4000);
		jsclick(pojo.getEditTemplate_Description_OK_button());
		Thread.sleep(4000);
		pojo.getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		log.info("verify Template edited successfully");
		jsclick(pojo.getEditTemplate_Created_OK_button());
		Thread.sleep(4000);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(3000);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(8000);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(4000);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Template Deleted Successfully", true);
		log.info("verify Template Deleted Successfully");
	}

	@Test(priority = 10)
	public void verify_to_Create_Formmapping_PDFTemplate_Advancedviewing() throws Exception {

		Language pojo = new Language();
		Thread.sleep(6000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getPdf_document_Advancedviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getTemplates_MenuOption());
		Thread.sleep(3000);
		pojo.getDestination_Folder_Textbox().click();
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Test_Cabinet(), pojo.getTemplate_Test_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Test_Drawer(), pojo.getTemplate_Test_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getTemplate_Folder(), pojo.getTemplate_Folder());
		Thread.sleep(4000);
		Reporter.log("Folder is selected for Templates", true);
		pojo.getOK_Button_BrowseforFolder().click();
		Thread.sleep(6000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_ReportName_Test());
		Thread.sleep(4000);
		pojo.getSelect_ReportName_Testvalue();
		Thread.sleep(6000);
		pojo.getMove_To_PlusIcon();
		pojo.getNew_pdf_Document_Option();
		Thread.sleep(4000);
		pojo.getEnter_pdf_File_Name();
		Thread.sleep(4000);
		jsclick(pojo.getpdfViewer());
		Thread.sleep(4000);
		jsclick(pojo.getTextbox());
		Thread.sleep(4000);
		jsclick(pojo.getAdd_Textbox_Onpage());
		Thread.sleep(4000);
		jsclick(pojo.getClick_Formmapper());
		pojo.getSelect_FormFiled();
		Thread.sleep(3000);
		jsclick(pojo.getFormOK());
		Thread.sleep(4000);
		jsclick(pojo.getSave_Template_Button());
		Thread.sleep(3000);
		jsclick(pojo.getTemplate_NameTextbox());
		Thread.sleep(4000);
		pojo.getTemplate_NameTextboxvalue();
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Description_Messagebox());
		Thread.sleep(4000);
		pojo.getTemplate_Description_Messageboxvalue();
		Thread.sleep(3000);
		jsclick(pojo.getTemplate_Description_OK_button());
		Thread.sleep(4000);
		pojo.getTemplate_Created_Message_Verify();
		Thread.sleep(4000);
		jsclick(pojo.getTemplate_Created_OK_button());
		log.info("verify to CreateorBrowse Formmapping Template advancedviewing");

	}

	@Test(priority = 11)
	public void Verify_to_Edit_and_Delete_FormFiled() throws Exception {

		Language pojo = new Language();
		pojo.getMoveto_Templates_Option();
		Thread.sleep(3000);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(8000);
		jsclick(pojo.getClick_Edit_Template_Button());
		Thread.sleep(4000);
		pojo.getEditTemplate_Description_Messagebox().clear();
		Thread.sleep(4000);
		pojo.getEditTemplate_Description_Messageboxvalue();
		Thread.sleep(4000);
		jsclick(pojo.getEditTemplate_Description_OK_button());
		Thread.sleep(4000);
		pojo.getEditTemplate_Created_Message_Verify();
		Reporter.log("Template edited successfully", true);
		log.info("verify Template edited successfully");
		jsclick(pojo.getEditTemplate_Created_OK_button());
		Thread.sleep(4000);
		pojo.getMoveto_Templates_Option();
		Thread.sleep(3000);
		jsclick(pojo.getSelect_Created_Template());
		Thread.sleep(8000);
		jsclick(pojo.getDelete_Template_Button());
		Thread.sleep(4000);
		jsclick(pojo.getDelete_Template_OK_Button());
		Reporter.log("Formmapping Template Deleted Successfully", true);
		log.info("verified Formmapping Template Deleted Successfully");
	}

	@Test(priority = 12)
	public void Set_Defaultview() throws Exception {

		Language pojo = new Language();
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
	}

	// Verify Load more in Search and Folder in Spanish laguage

	@Test(priority = 13)
	public void Verify_Load_MoreCount_On_Search() throws Exception {

		Language pojo = new Language();

		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(6000);
		pojo.getEnter_Loadmorecount();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(4000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(5000);
		pojo.getVerify_Loadmorecount_Searchresult();
		Thread.sleep(5000);
		jsclick(pojo.getLoadmorebutton());
		Thread.sleep(4000);
		pojo.getVerify_Loadmorecount_Searchresult();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		Reporter.log("Minumum number of Load More count on Search Verified successfully", true);
		log.info("Minumum number of Load More count on Search Verified successfully");
	}

	@Test(priority = 14)
	public void Verify_Load_MoreCount_On_Folder() throws Exception {

		Language pojo = new Language();
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(4000);
		pojo.getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(4000);
		jsclick(pojo.getLoadmorebutton());
		Thread.sleep(4000);
		pojo.getVerify_Loadmorecount_Document_Folder();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		Reporter.log("Minumum number of Load More count on Folder Verified successfully", true);
		log.info("Minumum number of Load More count on Folder Verified successfully");

	}

	// Verify Custom Columns in Spanish Language

	// Custom columns for Room

	@Test(priority = 15)
	public void Open_Custom_List_Dialog_And_Verify_Title_Roomcolumn() throws InterruptedException {

		Language pojo = new Language();
		Thread.sleep(5000);
		movingDoublecli(pojo.getSelect_Cabinet(), pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Drawer(), pojo.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Folder(), pojo.getSelect_Folder());
		Thread.sleep(4000);
		pojo.getMoveTo_Menu_RoomName();
		Thread.sleep(3000);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(4000);
		pojo.gettitelvalidation();
		Reporter.log("Custom List title validate", true);
		log.info("Custom List dialog Title verified");
	}

	@Test(priority = 16)
	public void Verify_The_Text_of_Custom_List_Dialog_Roomcolumn() throws InterruptedException {

		Language pojo = new Language();
		Thread.sleep(5000);
		pojo.getextvalidation();
		Reporter.log("Custom List Dialog Text verified", true);
		log.info("Custom List dialog Text verified");
	}

	@Test(priority = 17)
	public void Set_And_Verify_Custom_Columns_NodeLevel() throws Exception {

		Language pojo = new Language();
		Thread.sleep(6000);
		pojo.getSearchBoxIndices1();
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Indices01());
		Thread.sleep(4000);
		pojo.getSearchBoxIndices2();
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Indices02());
		Thread.sleep(4000);
		pojo.getSearchBoxIndices3();
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Indices03());
		Thread.sleep(4000);
		pojo.Ok_Button_CustomList(driver);
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.Verify_CompactView_checkbox(driver);
		Thread.sleep(6000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		movingDoublecli(pojo.getSelect_Cabinet(), pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Drawer(), pojo.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Folder(), pojo.getSelect_Folder());
		Thread.sleep(5000);
		pojo.Verify_Indicess_Value(driver);
		Thread.sleep(5000);
		Reporter.log("Custom Columns is set Node Level successfully", true);
		log.info("Custom Columns is set Node Level successfully");

	}

	@Test(priority = 18)
	public void Verify_Default_Custom_Columns() throws InterruptedException {

		Language pojo = new Language();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
		movingDoublecli(pojo.getSelect_Cabinet(), pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Drawer(), pojo.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Folder(), pojo.getSelect_Folder());
		Thread.sleep(5000);
		pojo.getMoveTo_Menu_RoomName();
		Thread.sleep(3000);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(4000);
		pojo.getMoveTo_Menu_RoomName();
		Thread.sleep(4000);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(4000);
		pojo.getDefault_Button_CustomList();
		Thread.sleep(4000);
		pojo.Ok_Button_CustomList(driver);
		Reporter.log("Set and Verify Default Custom columns successfully", true);
		log.info("Set and Verify Default Custom columns successfully");
	}

	@Test(priority = 19)
	public void Verify_Cancel_Button_of_CustomList() throws InterruptedException {

		Language pojo = new Language();
		pojo.getMoveTo_Menu_RoomName();
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(4000);
		pojo.getCancel_Button_CustomList();
		Reporter.log("Cancle button is clicked", true);
		log.info("Cancle button is clicked successfully");
	}

	@Test(priority = 20)
	public void Verify_Custom_Columns_RoomLevel() throws InterruptedException {

		Language pojo = new Language();
		pojo.getMoveTo_Menu_RoomName();
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(4000);
		jsclick(pojo.getClick_DropdownOption());
		pojo.Select_DropdownValue(driver);
		Thread.sleep(4000);
		jsclick(pojo.getSet_RoomLevel_Indices());
		Thread.sleep(4000);
		pojo.Ok_Button_CustomList(driver);
		Reporter.log("Indices is Selected Successfully for RoomLevel", true);
		log.info("Indices is Selected Successfully for RoomLevel");

	}

	@Test(priority = 21)
	public void Verify_Reset_Columns_Functionality() throws InterruptedException {

		Language pojo = new Language();
		pojo.getMoveTo_Menu_RoomName();
		jsclick(pojo.getReset_Column_option());
		Thread.sleep(4000);
		jsclick(pojo.getResetColumn_popup_OK_button());
		Reporter.log("Custom columns Reset Successfully", true);
		log.info("Custom columns Reset Successfully");

	}

	// Custom columns for Search

	@Test(priority = 22)
	public void Open_Custom_List_Dialog_And_Verify_Title_Searchcolumn() throws InterruptedException {

		Language pojo = new Language();
		pojo.MoveTo_Search_Option();
		Thread.sleep(4000);
		jsclick(pojo.getSearch_Custom_Columns_option());
		Thread.sleep(5000);
		pojo.getSearch_titelvalidation();
		Reporter.log("Search Custom List title validate", true);
		log.info("Search Custom List title validate");
	}

	@Test(priority = 23)
	public void Verify_The_Text_of_Custom_List_Dialog_Searchcolumn() throws InterruptedException {

		Language pojo = new Language();
		Thread.sleep(5000);
		pojo.getSearch_textvalidation();
		Reporter.log("Search Custom List Dialog Text verified", true);
		log.info("Search Custom List Dialog Text verified");
	}

	@Test(priority = 24)
	public void Verify_Set_Custom_Columns_for_Search() throws Exception {

		Language pojo = new Language();
		Thread.sleep(8000);
		pojo.getSearchBoxIndices4();
		Thread.sleep(3000);
		jsclick(pojo.getSearch_Select_Indices01());
		Thread.sleep(4000);
		pojo.getSearchBoxIndices5();
		Thread.sleep(3000);
		jsclick(pojo.getSearch_Select_Indices02());
		Thread.sleep(4000);
		pojo.getSearchBoxIndices6();
		Thread.sleep(3000);
		jsclick(pojo.getSearch_Select_Indices03());
		Thread.sleep(4000);
		jsclick(pojo.getSearch_Ok_Button_CustomList());
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(5000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(4000);
		jsclick(pojo.getDocument_Location(driver));
		Thread.sleep(4000);
		jsclick(pojo.getCabinetPlus(driver));
		Thread.sleep(4000);
		jsclick(pojo.getDrawerPlus(driver));
		Thread.sleep(4000);
		jsclick(pojo.getFolder1(driver));
		Thread.sleep(4000);
		jsclick(pojo.getOk_button(driver));
		Thread.sleep(8000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(6000);
		pojo.Search_Verify_Indicess_Value4(driver);
		Thread.sleep(3000);
		pojo.Search_Verify_Indicess_Value5(driver);
		Thread.sleep(3000);
		pojo.Search_Verify_Indicess_Value6(driver);
		Thread.sleep(6000);
		Reporter.log("Custom column is set successfully for Search Functionality", true);
		log.info("Custom column is set successfully for Search Functionality");
	}

	@Test(priority = 25)
	public void Verify_Reset_Columns_for_Search() throws InterruptedException {

		Language pojo = new Language();
		pojo.MoveTo_Search_Option();
		Thread.sleep(4000);
		jsclick(pojo.getClick_ResetColumn());
		Thread.sleep(4000);
		jsclick(pojo.getOk_Button_ResetColumn());
		Thread.sleep(4000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(6000);
		Reporter.log("Reset Custom Columns Successfully for Search", true);
		log.info("Reset Custom Columns Successfully for Search");

	}

	// Custom column for ToDolist

	@Test(priority = 26)
	public void Open_Custom_List_Dialog_And_Verify_Title_ToDoList() throws InterruptedException {

		Language pojo = new Language();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(4000);
		jsclick(pojo.getToDoList_Custom_Columns_option());
		Thread.sleep(5000);
		pojo.ToDoList_titelvalidation(driver);
		Reporter.log("ToDoList Custom List title validate", true);
		log.info("ToDoList Custom List title validate");
	}

	@Test(priority = 27)
	public void Verify_The_Text_of_Custom_List_Dialog_ToDoList() throws Exception {

		Language pojo = new Language();
		Thread.sleep(5000);
		pojo.ToDoList_textvalidation(driver);
		Thread.sleep(9000);
		Reporter.log("Custom List Dialog Text verified", true);
		log.info("Custom List Dialog Text verified");
	}

	@Test(priority = 28)
	public void Verify_Set_Custom_Columns_for_ToDoList() throws Exception {

		Language pojo = new Language();

		jsclick(pojo.getToDoList_Select_Indices01());
		Thread.sleep(4000);
		Language.ToDoList_Ok_Button_CustomList(driver);
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Cabinet(), pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Drawer(), pojo.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Folder(), pojo.getSelect_Folder());
		Thread.sleep(5000);
		jsclick(pojo.getSelectDoc(driver));
		Thread.sleep(4000);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(4000);
		jsclick(pojo.getsendWorkflow(driver));
		Thread.sleep(3000);
		jsclick(pojo.getWFAssign(driver));
		Thread.sleep(5000);
		pojo.getSelectDoc(driver);
		Thread.sleep(8000);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(4000);
		pojo.getVerify_CopyandPaste_Document();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(4000);
		jsclick(pojo.getSelect_All_Item());
		Thread.sleep(6000);
		pojo.ToDoList_Verify_Indicess_Value(driver);
		Reporter.log("Custom column is set successfully for ToDoList Functionality", true);
		log.info("Custom column is set successfully for ToDoList Functionality");
	}

	@Test(priority = 29)
	public void Reset_Custom_Columns_for_ToDoList() throws InterruptedException {
		Language pojo = new Language();
		Thread.sleep(4000);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(4000);
		jsclick(pojo.getTo_Do_Resetcolumn_Option());
		Thread.sleep(4000);
		jsclick(pojo.getToDoList_Reset_Column_OK_Button());
		Reporter.log("ToDoList Custom column Reset Successfully", true);
		log.info("ToDoList Custom column Reset Successfully");
		jsclick(pojo.getRefreshbutton());
	}

	// Document Context Menu

	@Test(priority = 30)
	public void Verify_Refresh_Option() throws Exception {

		Language pojo = new Language();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(5000);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(6000);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		pojo.getSelect_Option_Refresh();
		Thread.sleep(6000);
		log.info("Refresh Functionality verified Successfully on Documents");
	}

	@Test(priority = 31)
	public void Verify_Categories_Option() throws Exception {

		Language pojo = new Language();
		jsclick(pojo.getSelect_Document());
		Thread.sleep(3000);
		pojo.getMoveTo_Menu_Documents();
		pojo.getSelect_Option_Catagories_andSet_Colors();
		log.info("Categories on Documents Functionality verified Successfully");

	}

	@Test(priority = 32)
	public void Verify_copy_and_paste_Option() throws Exception {

		Language pojo = new Language();
		Thread.sleep(6000);
		pojo.getMoveTo_Menu_Documents();
		pojo.getVerify_CopyandPaste_Document();
		Thread.sleep(8000);
		log.info("copy and paste Documents Functionality verified Successfully");
	}

	@Test(priority = 33)
	public void Verify_cut_and_paste_Option() throws Exception {

		Language pojo = new Language();
		jsclick(pojo.getSelect_Document());
		Thread.sleep(6000);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		pojo.getVerify_CutandPaste_Document();
		Thread.sleep(6000);
		log.info("cut and paste Document Functionality verified Successfully");
	}

	@Test(priority = 34)
	public void Verify_Delete_Option() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_Delete_Document();
		Thread.sleep(8000);
		log.info("Document Delete Functionality verified Successfully");
	}

	@Test(priority = 35)
	public void Verify_CreateFavorites_Document() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_CreateFavorites_Document();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		pojo.getOpen_CreateFavorites_Document();
		log.info("CreateFavorites Document Functionality verified Successfully");
	}

	@Test(priority = 36)
	public void Verify_Notification_on_Document() throws Exception {

		Language pojo = new Language();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(6000);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(6000);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(4000);
		pojo.getVerify_CopyandPaste_Document();
		Thread.sleep(8000);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(6000);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(6000);
		pojo.getCreate_Notification_Document();
		Thread.sleep(9000);
		jsclick(pojo.getClick_signature_Menuoption());
		Thread.sleep(4000);
		pojo.getinputpassword();
		Thread.sleep(4000);
		pojo.getAdd_Signature_Onpage();
		Thread.sleep(6000);
		pojo.getSave_Signature_Document();
		Thread.sleep(4000);
		jsclick(pojo.getClose_Document());
		log.info("Notification_on_Document Functionality verified Successfully");

	}

	@Test(priority = 37)
	public void Verify_SendTo_Mail() throws Exception {

		Language pojo = new Language();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(3000);
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(6000);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(3000);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(4000);
		pojo.getSentTo_Mail_asReference();
		Thread.sleep(3000);
		log.info("SendTo Mail asReference Functionality verified Successfully");
		jsclick(pojo.getSelect_Document());
		Thread.sleep(3000);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(3000);
		pojo.getSentTo_Mail_asCopy();
		Thread.sleep(4000);
		log.info("SendTo Mail asCopy Functionality verified Successfully");
	}

	@Test(priority = 38)
	public void Verify_SendTo_Print() throws Exception {

		Language pojo = new Language();
		pojo.getSentTo_Print();
		log.info("SendTo Print Functionality verified Successfully");

	}

	@Test(priority = 39)
	public void Verify_SendTo_Export() throws Exception {

		Language pojo = new Language();
		pojo.getSentTo_Export();
		log.info("SendTo Export Functionality verified Successfully");

	}

	@Test(priority = 40)
	public void Verify_SendTo_GenerateDocumentLink() throws Exception {

		Language pojo = new Language();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(3000);
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(4000);
		pojo.getSentTo_GenerateDocumentLink();
		Thread.sleep(3000);
		jsclick(pojo.getRefreshbutton());
		log.info("SendTo GenerateDocumentLink Functionality verified Successfully");
	}

	@Test(priority = 41)
	public void Verify_SendTo_SecureLink() throws Exception {
		Language pojo = new Language();
		Thread.sleep(6000);
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(6000);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(3000);
		pojo.getSentTo_SecureLink();
		Thread.sleep(3000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		log.info("SendTo SecureLink Functionality verified Successfully");
	}
}
