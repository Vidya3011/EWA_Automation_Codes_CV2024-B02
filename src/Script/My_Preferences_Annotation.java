package Script;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.My_Preferences;

public class My_Preferences_Annotation extends BaseClass {

	private static final Logger log = LogManager.getLogger(My_Preferences_Annotation.class);

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
	public void Verify_Maximum_Annotation() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getallannotation().click();
		Thread.sleep(4000);
		pojo.Select_Annotation_Dropdown1(driver);
		Thread.sleep(8000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);

	}

	@Test(priority = 2)
	public void Verify_set_Annotation1() throws Exception {

		My_Preferences pojo = new My_Preferences();
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
		pojo.getEnter_ReportName_Annotation();
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
		Thread.sleep(10000);
		pojo.getVerify_AnnotationDropdown1_Option_enable();
		Thread.sleep(5000);
		jsclick(pojo.getCreate_button());
		Thread.sleep(6000);
		jsclick(pojo.getNavigate_button());
		Reporter.log("New Document Created successfully with verifying Annotation", true);
		log.info("New Document Created successfully with verifying Annotation");
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
	}
}
