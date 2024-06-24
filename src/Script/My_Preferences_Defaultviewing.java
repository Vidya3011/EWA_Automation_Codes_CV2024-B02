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

public class My_Preferences_Defaultviewing extends Generic.BaseClass {

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
	public void TC_01_Verify_Defaultviewing_Convert_To_PDF() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 1 : Verifying Default viewing Convert To PDF", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getClick_Dropdown_DefaultViewing();
		Thread.sleep(6000);
		Reporter.log("Select Default view ", true);
		pojo.getSelect_Dropdown_Convert_To_PDF();
		Thread.sleep(7000);
		Reporter.log("Select Convert To Pdf Option", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab", true);
		pojo.getEnter_Document_Name();
		Thread.sleep(7000);
		Reporter.log("Enter Document Name", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(12000);
		Reporter.log("Click on Find button", true);
		pojo.getSelect_Document();
		Reporter.log("Select and Open Document", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		pojo.getSearch_Page_Number();
		Reporter.log("Enter page number", true);
		Reporter.log("Defaultviewing Convert To PDF Format verified successfully", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify_Defaultviewing_Native_Format() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 2 : Verifying Default viewing Native Format ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getClick_Dropdown_DefaultViewing();
		Thread.sleep(7000);
		Reporter.log("Select Default View", true);
		pojo.getSelect_Dropdown_Native_Format();
		Thread.sleep(7000);
		Reporter.log("Select Native Formatio Option", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab", true);
		pojo.getEnter_Document_Name();
		Thread.sleep(7000);
		Reporter.log("Enter Document Name", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.getSelect_Document();
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("Defaultviewing Native Format verified successfully", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
