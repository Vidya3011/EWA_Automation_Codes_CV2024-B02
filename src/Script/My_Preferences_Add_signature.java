package Script;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.My_Preferences;

public class My_Preferences_Add_signature extends BaseClass {

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
		log.info("CVS User is logged in successfully...");

	}

	// @Test(priority = 1)
	public void Verify_Upload_New_Signature() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(6000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(6000);
		pojo.getClick_AddSignature();
		Thread.sleep(2000);
		pojo.getsettingpass();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getClick_AddSignature_Upload()));
		movingclkElement(pojo.getClick_AddSignature_Upload());
		pojo.getclickProtectpassword();
		Thread.sleep(4000);
		pojo.getClick_AddSignature_Browse().click();
		Thread.sleep(6000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\UploadSignature.exe");
		Reporter.log(" Signature  is uploaded successfully", true);
		log.info("Signature  is uploaded successfully");
		Thread.sleep(6000);

		pojo.getEnterpassword();
		Thread.sleep(4000);
		pojo.getSignature_Upload_OkButton();
		Thread.sleep(6000);
		Reporter.log("New signature Upload Successfully", true);
		log.info("New signature Upload Successfully");
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
		Thread.sleep(3000);
		pojo.getEnter_ReportName_Addsignature();
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("Page is uploaded successfully", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		pojo.getClick_signature_Menuoption();
		Thread.sleep(2000);
		pojo.getinputpassword();
		Thread.sleep(4000);
		pojo.getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Reporter.log("New signature added Successfully on the Document", true);
		jsclick(pojo.getCreate_button());
		Thread.sleep(6000);
		jsclick(pojo.getNavigate_button());
		Reporter.log("New Document Created successfully with signature", true);
		log.info("New Document Created successfully with signature");
		jsclick(pojo.getRefreshbutton());
	}

	@Test(priority = 2)
	public void Verify_Type_New_Signature() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getClick_AddSignature();
		Thread.sleep(2000);
		pojo.getsettingpass();
		Thread.sleep(2000);
		jsclick(pojo.getsignType());
		Thread.sleep(4000);
		pojo.getclickProtectpassword();
		Thread.sleep(6000);
		pojo.getsignatureFont();
		Thread.sleep(4000);
		pojo.getsignInput();
		Thread.sleep(4000);
		pojo.getsignatureFontOption2();
		Thread.sleep(4000);
		pojo.getsignInput();
		Thread.sleep(4000);
		pojo.getsavesigntype();
		Thread.sleep(4000);
		pojo.getEnterpassword();
		Thread.sleep(4000);
		pojo.getSignature_Upload_OkButton();
		Thread.sleep(6000);
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
		pojo.getEnter_ReportName_Addsignature();
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Reporter.log("Page is uploaded successfully", true);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		pojo.getClick_signature_Menuoption();
		Thread.sleep(2000);
		pojo.getinputpassword();
		Thread.sleep(4000);
		pojo.getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Reporter.log("New signature type added Successfully on the Document", true);
		jsclick(pojo.getCreate_button());
		Thread.sleep(5000);
		jsclick(pojo.getNavigate_button());
		Reporter.log("New Document Created successfully with signature type ", true);
		log.info("New Document Created successfully with signature type");
		Thread.sleep(5000);
		jsclick(pojo.getRefreshbutton());
	}
}
