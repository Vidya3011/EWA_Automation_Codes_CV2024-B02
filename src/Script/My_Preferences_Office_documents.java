package Script;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.Logout;
import Pom.My_Preferences;

//Dipak Automation script
public class My_Preferences_Office_documents extends Generic.BaseClass {

	private static final Logger log = LogManager.getLogger(My_Preferences_Office_documents.class);

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
	public void Verify_Browse_Office_documents_Advancedviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Office_document_Advancedviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(4000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(4000);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		pojo.getSelect_Document_Type_Dropdown();
		Thread.sleep(4000);
		pojo.getEnter_ReportName();
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficedoc.exe");
		Thread.sleep(6000);
		Reporter.log("Browse document and Page is uploaded successfully", true);
		log.info("Browse document and Page is uploaded successfully");

	}

	@Test(priority = 2)
	public void Verify_NewWordDocuments_Office_documents_Advancedviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(6000);
		pojo.getMove_To_PlusIcon();
		pojo.getNew_Word_Document_Option();
		Thread.sleep(4000);
		pojo.getEnter_Word_File_Name();
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Word_page());
		Thread.sleep(4000);
		Reporter.log("Advanced Viewing New Word Document Created", true);
		log.info("Advanced Viewing New Word Document Created");
	}

	@Test(priority = 3)
	public void Verify_NewExcelSpreadsheet_Office_documents_Advancedviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.getMove_To_PlusIcon();
		pojo.getNew_Excel_Spreadsheet_Option();
		Thread.sleep(4000);
		pojo.getEnter_Excel_File_Name();
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Excel_page());
		Thread.sleep(6000);
		jsclick(pojo.getCreate_button());
		jsclick(pojo.getNavigate_button());
		Reporter.log("Advanced Viewing New Excel Document Created", true);
		log.info("Advanced Viewing New Excel Document Created");

	}

	@Test(priority = 4)
	public void Verify_Browse_Office_documents_Defaultviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(4000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(4000);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		pojo.getSelect_Document_Type_Dropdown();
		Thread.sleep(4000);
		pojo.getEnter_ReportNameDefaultview();
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("Office document Defaultviewing Page is uploaded successfully", true);
		log.info("Office document Defaultviewing Page is uploaded successfully");
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		jsclick(pojo.getCreate_button());
		Thread.sleep(6000);
		jsclick(pojo.getNavigate_button());
		Thread.sleep(4000);
		Reporter.log("New Office Document Created successfully", true);
		log.info("New Office Document Created successfully");
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
	}
}
