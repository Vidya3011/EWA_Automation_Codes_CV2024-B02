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
public class My_preferences_Pdf_documents extends Generic.BaseClass {

	private static final Logger log = LogManager.getLogger(My_preferences_Pdf_documents.class);

	// @BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	// @Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		log.info("CVS URL started Successfully...");

	}

	@Test(priority = 1)
	public void Verify_Browse_Pdf_documents_Advancedviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getPdf_document_Advancedviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
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
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Reporter.log("PDF Page is uploaded successfully", true);
		log.info("PDF Page is uploaded successfully");

	}

	@Test(priority = 2)
	public void Verify_Create_New_pdf_document_Advancedviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(8000);
		pojo.getMove_To_PlusIcon();
		pojo.getNew_pdf_Document_Option();
		Thread.sleep(4000);
		pojo.getEnter_pdf_File_Name();
		Thread.sleep(4000);
		jsclick(pojo.getOpen_pdf_page());
		Thread.sleep(4000);
		jsclick(pojo.getCreate_button());
		Thread.sleep(4000);
		jsclick(pojo.getNavigate_button());
		Thread.sleep(4000);
		Reporter.log("Advanced Viewing New PDF Document Created", true);
		log.info("Advanced Viewing New PDF Document Created");
	}

	@Test(priority = 3)
	public void Verify_Browse_PDF_documents_Defaultviewing() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
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
		Thread.sleep(6000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Reporter.log("PDF Page is uploaded successfully", true);
		Thread.sleep(6000);
		jsclick(pojo.getCreate_button());
		Thread.sleep(4000);
		jsclick(pojo.getNavigate_button());
		Thread.sleep(4000);
		Reporter.log("Advanced Viewing New Document Created", true);
		log.info("Advanced Viewing New Document Created");
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
	}
}
