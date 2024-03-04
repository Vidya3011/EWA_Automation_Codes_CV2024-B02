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

public class My_Preferences_Defaultviewing extends Generic.BaseClass {

	private static final Logger log = LogManager.getLogger(My_Preferences_Defaultviewing.class);

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
	public void Verify_Defaultviewing_Convert_To_PDF() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(6000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getClick_Dropdown_DefaultViewing();
		Thread.sleep(0);
		pojo.getSelect_Dropdown_Convert_To_PDF();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(4000);
		pojo.getEnter_Document_Name();
		Thread.sleep(4000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(12000);
		pojo.getSelect_Document();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(8000);
		pojo.getSearch_Page_Number();
		Reporter.log(" Defaultviewing Convert To PDF Format verified successfully", true);
		log.info("Defaultviewing Convert To PDF Format verified successfully");

	}

	@Test(priority = 2)
	public void Verify_Defaultviewing_Native_Format() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(5000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(5000);
		pojo.getClick_Dropdown_DefaultViewing();
		Thread.sleep(4000);
		pojo.getSelect_Dropdown_Native_Format();
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
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(6000);
		Reporter.log("Defaultviewing Native Format verified successfully", true);
		log.info("Defaultviewing Native Format verified successfully");
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
	}
}
