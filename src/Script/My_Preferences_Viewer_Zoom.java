package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pom.My_Preferences;

//Dipak Automation script
public class My_Preferences_Viewer_Zoom extends Generic.BaseClass {

	@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}

	@Test(priority = 1)
	public void TC_01_Verify_Viewer_Zoom_Fit_To_Width() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 1 : Verifying Viewer Zoom Fit To Width ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_Dropdown_Fit_To_Width();
		Thread.sleep(7000);
		Reporter.log("Select Viewer zoom and set as Fit To Width", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click Apply button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click Search Tab", true);
		pojo.getEnter_Document_Name();
		Thread.sleep(7000);
		Reporter.log("Enter value into Document Name field", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.getSelect_Document();
		Reporter.log("Select and Open document ", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("Verifying Viewer Zoom Fit To Width successfully", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify_Viewer_Zoom_Fit_To_Height() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 2 : Verifying Viewer Zoom Fit To Height ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_Dropdown_Fit_To_Height();
		Thread.sleep(7000);
		Reporter.log("Select Viwer zoom and set as Fit To Height", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab", true);
		pojo.getEnter_Document_Name();
		Thread.sleep(7000);
		Reporter.log("Enter value into Document Name field", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find Buttton", true);
		pojo.getSelect_Document();
		Reporter.log("Select and Open Document ", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("Verifying Viewer Zoom Fit To Height successfully", true);

	}

	@Test(priority = 3)
	public void TC_03_Verify_Viewer_Zoom_Fit_Entire_Image() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 3 : Verifying Viewer Zoom Fit Entire Image ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_Dropdown_Fit_Entire_Image();
		Thread.sleep(7000);
		Reporter.log("Select Viwer Zoom and set as Fit Entire Image", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Option", true);
		pojo.getEnter_Document_Name();
		Thread.sleep(7000);
		Reporter.log("Enter value into Document Name field", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.getSelect_Document();
		Reporter.log("Select and Open Document ", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("Verifying Viewer Zoom Fit To Entire Image successfully", true);

	}

	@Test(priority = 4)
	public void TC_04_Verify_Viewer_Zoom_Actual_Size() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 4 : Verifying Viewer Zoom Actual Size ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon ", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_Dropdown_Actual_Size();
		Thread.sleep(7000);
		Reporter.log("Select  Viwer Zoom and set as Actual size", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab ", true);
		pojo.getEnter_Document_Name();
		Thread.sleep(7000);
		Reporter.log("Enter value into Document Name field", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.getSelect_Document();
		Reporter.log("Select and Open Document ", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("Verifying Viewer Zoom Actual Size successfully", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
