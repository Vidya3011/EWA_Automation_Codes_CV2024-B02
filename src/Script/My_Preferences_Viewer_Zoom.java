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
public class My_Preferences_Viewer_Zoom extends Generic.BaseClass {

	private static final Logger log = LogManager.getLogger(My_Preferences_Viewer_Zoom.class);
	
	//@BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	//@Test

	public void Login_EWA() throws Exception {
		loginCVS();
		log.info("CVS User is logged in successfully...");

	}

	@Test(priority = 1)
	public void Verify_Viewer_Zoom_Fit_To_Width() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(BaseClass.Refresh_Button(driver));
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Dropdown_Fit_To_Width();
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
		Reporter.log("Verify Viewer Zoom Fit To Width successfully", true);
		log.info("Verify Viewer Zoom Fit To Width successfully");
	}

	@Test(priority = 2)
	public void Verify_Viewer_Zoom_Fit_To_Height() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(5000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Dropdown_Fit_To_Height();
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(4000);
		pojo.getEnter_Document_Name();
		Thread.sleep(4000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(5000);
		pojo.getSelect_Document();
		Reporter.log("Verify Viewer Zoom Fit To Height successfully", true);
		log.info("Verify Viewer Zoom Fit To Height successfully");

	}

	@Test(priority = 3)
	public void Verify_Viewer_Zoom_Fit_Entire_Image() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(5000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Dropdown_Fit_Entire_Image();
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
		Reporter.log("Verify Viewer Zoom Fit To Entire Image successfully", true);
		log.info("Verify Viewer Zoom Fit To Entire Image successfully");

	}

	@Test(priority = 4)
	public void Verify_Viewer_Zoom_Actual_Size() throws Exception {

		My_Preferences pojo = new My_Preferences();
		Thread.sleep(5000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Dropdown_Actual_Size();
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(4000);
		pojo.getEnter_Document_Name();
		Thread.sleep(4000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(5000);
		pojo.getSelect_Document();
		WebDriverWait wait = new WebDriverWait(driver,10);
		Reporter.log("Verify Viewer Zoom Actual Size successfully", true);
		log.info("Verify Viewer Zoom Actual Size successfully");
		jsclick(BaseClass.Refresh_Button(driver));

	}

}


