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

public class My_Preferences_PDF_with_Overlay extends BaseClass {

	private static final Logger log = LogManager.getLogger(My_Preferences_Add_signature.class);

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
	public void Verify_PDF_with_Overlay_Disable() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_PDF_with_Overlay_Disable();
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
		pojo.getEnter_ReportNamePDFwithOverlay();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PDFwithOverlay.exe");
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Reporter.log("Pdf with annotation is uploaded successfully", true);
		Thread.sleep(6000);
		pojo.getMove_to_ViewMenu_Option_inViewer();
		Thread.sleep(8000);
		pojo.getVerify_PDF_with_Overlay_option();
		Thread.sleep(6000);
		jsclick(pojo.getCreate_button());
		Thread.sleep(6000);
		jsclick(pojo.getNavigate_button());
		Reporter.log("Verify PDF with Overlay is Disable", true);
		log.info("Verify PDF with Overlay is Disable");

	}

	@Test(priority = 2)
	public void Verify_PDF_with_Overlay_Enable() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(8000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_PDF_with_Overlay_Enable();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Document());
		Thread.sleep(8000);
		pojo.getMove_to_ViewMenu_Option_inViewer();
		Thread.sleep(8000);
		pojo.getVerify_PDF_with_Overlay_option();
		Thread.sleep(6000);
		jsclick(pojo.getClick_PDF_with_Overlay_option());
		Reporter.log("Verify PDF with Overlay is Enable", true);
		log.info("Verify PDF with Overlay is Enable");
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_PDF_with_Overlay_Disable();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
	}
}
