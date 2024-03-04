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

public class My_Preferences_Download_Allfiles extends BaseClass {

	private static final Logger log = LogManager.getLogger(My_Preferences_Download_Allfiles.class);

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
	public void Verify_Download_All_Files() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getVerify_DownloadAllFiles_checkbox();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(4000);
		pojo.getEnter_Document_Name();
		Thread.sleep(4000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(5000);
		pojo.getSelect_Document();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		pojo.getDownload_File();
		Thread.sleep(5000);
		pojo.getDownload_File_OK_button();
		Reporter.log(" All files should be Downloaded successfully", true);
		log.info("All files should be Downloaded successfully");
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
	}
}
