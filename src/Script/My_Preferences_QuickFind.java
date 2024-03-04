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

public class My_Preferences_QuickFind extends BaseClass {

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

	@Test(priority = 1)
	public void Verify_QuickFind_DocIdSearch() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_QuickFind_DocIdSearch();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		pojo.getEnter_Doc_Id_InSearch();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(6000);
		jsclick(pojo.getClick_general_option());
		Thread.sleep(6000);
		pojo.getVerify_Doc_Id();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Reporter.log("Verify successfully Quick Find Doc Id Search", true);
		log.info("Verify successfully Quick Find Doc Id Search");
	}

	@Test(priority = 2)
	public void Verify_QuickFind_TextSearch() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_QuickFind_TextSearch();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		pojo.getEnter_Text_InSearch();
		Thread.sleep(9000);
		Reporter.log("Verify successfully Quick Find Text search", true);
		log.info("Verify successfully Quick Find Text search");

	}

	@Test(priority = 3)
	public void Verify_QuickFind_IndexSearch() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_QuickFind_IndexSearch();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		pojo.getEnter_IndexValue_InSearch();
		Thread.sleep(8000);
		Reporter.log("Verify successfully Quick Find Index search", true);
		log.info("Verify successfully Quick Find Index search");
	}

	@Test(priority = 4)
	public void Verify_QuickFind_BothSearch() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_QuickFind_Both();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		pojo.getEnter_BothValue_InSearch();
		Thread.sleep(8000);
		jsclick(pojo.getRefreshbutton());
		Reporter.log("Verify successfully Quick Find Text and Index search", true);
		log.info("Verify successfully Quick Find Text and Index search");
		Thread.sleep(5000);
	}
}
