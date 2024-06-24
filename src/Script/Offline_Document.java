package Script;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.Documents_ContextMenu;

public class Offline_Document extends BaseClass {

	@BeforeClass
	public void  Launch_Browser() throws Exception {
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
	public void TC_01_Create_OfflineDocument() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 1:Create Offline Document", true);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on the Refresh button", true);
		selectElement(Doc.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a cabinet", true);
		selectElement(Doc.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a drawer", true);
		selectElement(Doc.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("select a folder", true);
		jsclick(Doc.getOpen_Document());
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("Document open Successfully", true);
		jsclick(Doc.getSelectCheckbox());
		Thread.sleep(6000);
		Reporter.log("Select Document checkbox from Thumbnail", true);
		jsclick(Doc.getpageofflinemenu());
		Thread.sleep(7000);
		Reporter.log("Click on Offline page menu option", true);
		jsclick(Doc.getclickokbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Document offline message ok button", true);
		Reporter.log("Document Created successfully", true);
	}

	@Test(priority = 2)
	public void TC_02_Sync_New_Document_onOffline_Doc() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 2:Sync New Document on Offline Doc", true);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Doc.getUsername());
		Thread.sleep(7000);
		Reporter.log("Click on Username", true);
		jsclick(Doc.getofflinedoc());
		Thread.sleep(7000);
		Reporter.log("Click on Offline Document option", true);
		jsclick(Doc.getcheckofflinedoc());
		Thread.sleep(7000);
		Reporter.log("Document showing Succesfully under Offline page", true);
		Reporter.log("New document sync successfully", true);
	}

	@Test(priority = 3)
	public void TC_03_Open_Offline_Doc() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 3:Open Offline Doc", true);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		Doc.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(Doc.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Doc.getOpen_Document());
		Thread.sleep(3000);
		Reporter.log("Document page open succesfully", true);
		jsclick(Doc.getclickokbutton());
		Thread.sleep(9000);
		Reporter.log("Document Is in Offline message showing succesfully open document in View only mode", true);

	}

	@Test(priority = 4)
	public void TC_04_Release_Offline_Doc() throws Exception {

		Documents_ContextMenu Doc = new Documents_ContextMenu();

		Reporter.log("Test Scenario 4: Release Offline Doc", true);
		jsclick(Doc.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Doc.getUsername());
		Thread.sleep(7000);
		Reporter.log("Click on Username", true);
		jsclick(Doc.getofflinedoc());
		Thread.sleep(7000);
		Reporter.log("Click on Offline Document option", true);
		jsclick(Doc.getcheckofflinedoc());
		Thread.sleep(7000);
		Reporter.log("Select Offline Document page", true);
		jsclick(Doc.getReleaseDoc());
		Thread.sleep(7000);
		Reporter.log("Click on Release option and Document Release succesfully", true);
		Doc.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(Doc.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		jsclick(Doc.getOpen_Document());
		Thread.sleep(3000);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("Document open Successfully", true);
		Reporter.log("Document Release successfully", true);
		driver.close();
		Reporter.log("Close the Application", true);

	}
}
