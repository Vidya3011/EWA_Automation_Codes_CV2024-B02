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


public class My_Preferences_Add_signature extends BaseClass {

	private static final Logger log = LogManager.getLogger(My_Preferences_Add_signature.class);
	
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

	@Test(priority = 1)
	public void Verify_Upload_New_Signature() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(BaseClass.Refresh_Button(driver));
		Thread.sleep(8000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getClick_AddSignature();
		Thread.sleep(4000);
		pojo.getClick_AddSignature_Upload();
		Thread.sleep(4000);
		pojo.getClick_AddSignature_Browse();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\UploadSignature.exe");
		Reporter.log(" Signature  is uploaded successfully", true);
		log.info("Signature  is uploaded successfully");
		Thread.sleep(6000);
		pojo.getClick_AddSignature_Save();
		Thread.sleep(6000);
		pojo.getClick_AddSignature_Yes_button();
		Thread.sleep(6000);
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
		Thread.sleep(4000);
		pojo.getEnter_ReportName_Addsignature();
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("Page is uploaded successfully", true);
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());

		Alert alt = driver.switchTo().alert();
		alt.accept();
		pojo.getClick_signature_Menuoption();
		Thread.sleep(6000);
		pojo.getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Reporter.log("New signature added Successfully on the Document", true);
		jsclick(pojo.getCreate_button());
		Thread.sleep(6000);
		jsclick(pojo.getNavigate_button());
		Reporter.log("New Document Created successfully with signature", true);
		log.info("New Document Created successfully with signature");
		jsclick(BaseClass.Refresh_Button(driver));
	}

	
	
	
	
	
}
