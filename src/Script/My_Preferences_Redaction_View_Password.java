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

public class My_Preferences_Redaction_View_Password extends BaseClass {

	private static final Logger log = LogManager.getLogger(My_Preferences_Redaction_View_Password.class);

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
	public void Verify_Redaction_View_Password() throws Exception {

		My_Preferences pojo = new My_Preferences();
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
		pojo.getEnter_ReportName_RedactionPassword();
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Reporter.log("Page is uploaded successfully", true);
		Thread.sleep(6000);
		pojo.getMove_to_Annotation_Option_inViewer();
		Thread.sleep(6000);
		pojo.getRedaction_Option();
		Thread.sleep(6000);
		pojo.getSet_Redaction_ToDocument();
		Thread.sleep(6000);
		jsclick(pojo.getCreate_button());
		Thread.sleep(6000);
		jsclick(pojo.getNavigate_button());
		Thread.sleep(6000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getEnter_RedactionPassword_MyPreferences();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(8000);
		jsclick(pojo.getOpen_Document());
		Thread.sleep(9000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		Reporter.log("Reaction View Password Functionality Verified Successfulluy", true);
		log.info("Reaction View Password Functionality Verified Successfulluy");

	}

	@Test(priority = 2)
	public void Verify_Reset_My_Preferences() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getReset_Button();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Reporter.log("Reset Successfully", true);
		log.info("Reset Successfully");
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
	}
}
