package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.Document_References;

public class Document_ReferencesView extends BaseClass {

	@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully", true);
	}

	@Test(priority = 1)
	public void TC_01_Verify_CopyandPasteReferences_OnDocuments() throws Exception {

		Document_References Doc = new Document_References();

		Reporter.log("Test Scenario 1 : Verifying Copy and Paste References On documents ", true);

		jsclick(Doc.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Doc.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Doc.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Doc.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("Expand a Folder", true);
		jsclick(Doc.getCheck_Document1());
		Thread.sleep(7000);
		Reporter.log("Check document Thumbnail", true);
		Doc.getMoveTo_Menu_Documents();
		Thread.sleep(7000);
		Reporter.log("Mousehover on documents Tab", true);
		Doc.getVerify_CopyandPasteReferences_Document();
		Reporter.log("Copy and Paste References document", true);
		Thread.sleep(7000);
		jsclick(Doc.getSelect_Document());
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("Verified copy and paste References document", true);
		jsclick(Doc.getClick_References());
		Thread.sleep(7000);
		Reporter.log("Click on References Option", true);
		jsclick(Doc.getOpen_ReferenceDOC());
		Thread.sleep(10000);
		Reporter.log("Copy and Paste References verified successfully", true);
		jsclick(Doc.getRefreshbutton());
		Reporter.log("Click on Refresh button", true);
		Thread.sleep(7000);
	}

	@Test(priority = 2)
	public void TC_02_Verify_and_Delete_References_Documents() throws Exception {

		Document_References Doc = new Document_References();
		Reporter.log("Test Scenario 2 : Verifying and Delete References Documents ", true);
		Doc.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Mousehover on Recent Tab", true);
		jsclick(Doc.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		Thread.sleep(7000);
		jsclick(Doc.getSelect_Document());
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("Verified Copy and Paste References Document", true);
		jsclick(Doc.getClick_References());
		Thread.sleep(7000);
		Reporter.log("Click on References", true);
		jsclick(Doc.getDeleteReferenceDoc());
		Thread.sleep(7000);
		Reporter.log("Delete added References document", true);
		jsclick(Doc.getReferencedocCancelbutton());
		Reporter.log("Click on  Cancel button", true);
		Reporter.log("Deleted added References document successfully", true);
		Thread.sleep(7000);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
