package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.Document_Version;

public class Document_Version_Test extends BaseClass {

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
	public void TC_01_Create_Document_and_Verify_Document_Versions() throws Exception {

		Document_Version pojo = new Document_Version();

		Reporter.log("Test Scenario 1 : Create New Document and Verifying Document Versions ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(7000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(7000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(7000);
		Reporter.log("select a Folder", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);
		Reporter.log("Select Document type dropdown", true);
		pojo.getEnter_ReportName();
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("PDF Page is uploaded successfully", true);
		jsclick(pojo.getCreate_button());
		Thread.sleep(3000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getViewDocument_Button());
		Thread.sleep(3000);
		Reporter.log("Click on View document option", true);
		Reporter.log("PDF is created successfully", true);
		Reporter.log("Verified Current Document Version Successfully");
	}

	@Test(priority = 2)
	public void TC_02_Upload_and_Save_New_page_and_Verify_Version_with_New_Comments() throws Exception {

		Document_Version pojo = new Document_Version();

		Reporter.log("Test Scenario 2 : Upload and Save New page and Verifying Version with new Comments ", true);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(4000);
		Reporter.log("Click on Version Option", true);
		jsclick(pojo.getFab());
		Thread.sleep(3000);
		movingclkElement(pojo.getFloatingButton());
		Thread.sleep(7000);
		Reporter.log("Click on Floating button", true);
		jsclick(pojo.getUploadFab());
		Thread.sleep(2000);
		Reporter.log("Click on Upload Fab button", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Tile.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(7000);
		jsclick(pojo.getSaveFab());
		Thread.sleep(7000);
		Reporter.log("Click on Save Fab button", true);
		jsclick(pojo.getSaveOkButton());
		Thread.sleep(7000);
		Reporter.log("Click on Save button", true);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Version Option", true);
		pojo.getVerify_Message();
		Thread.sleep(7000);
		Reporter.log("Message Verified", true);
		jsclick(pojo.getClick_Message());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getComments_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Comment Option", true);
		jsclick(pojo.getComments_Box());
		Reporter.log("Click on Comment Textbox", true);
		pojo.getComments_Box().clear();
		pojo.getComments_Box().sendKeys(pojo.DocumentVersion_excelRead(1, 0));
		Thread.sleep(7000);
		Reporter.log("Enter Comment into Comment field", true);
		jsclick(pojo.getSave_Comments());
		Thread.sleep(7000);
		jsclick(pojo.getSelect_ThumbnailPage());
		Thread.sleep(7000);
		Reporter.log("Click on Save button", true);
		Reporter.log("Document Version Update with Comments", true);

	}

	@Test(priority = 3)
	public void TC_03_Delete_Page_and_Verify_Version() throws Exception {

		Document_Version pojo = new Document_Version();

		Reporter.log("Test Scenario 3 : Delete Page and Verifying Version ", true);

		Reporter.log("Check Thumbnail page", true);
		jsclick(pojo.getDelete_FabButton());
		Thread.sleep(7000);
		Reporter.log("Click on Delete Fab button", true);
		jsclick(pojo.getDelete_Yes());
		Thread.sleep(7000);
		Reporter.log("Click on Yes button", true);
		jsclick(pojo.getDelete_Ok());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSaveFab());
		Thread.sleep(7000);
		Reporter.log("Click on Save Fab button", true);
		jsclick(pojo.getSaveOkButton());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Version Option", true);
		Reporter.log("Document Page delete and Verified versions", true);
	}

	@Test(priority = 4)
	public void TC_04_Verify_Delete_All_versions_and_FullScreen_Option() throws Exception {

		Document_Version pojo = new Document_Version();

		Reporter.log("Test Scenario 4 : Verifying Delete All versions and Full Screen Option ", true);
		jsclick(pojo.getDelete_AllVersions());
		Thread.sleep(7000);
		Reporter.log("Click on All Version", true);
		jsclick(pojo.getyDelete_VersionmessageOk());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Version Option", true);
		jsclick(pojo.getFullScreen_Fabbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Full Screen Fab button", true);
		jsclick(pojo.getCloseDoc());
		Thread.sleep(7000);
		Reporter.log("Click on the Close button", true);
		Reporter.log("Verified Delete All versions and Full screen Document from Floating button", true);
	}

	@Test(priority = 5)
	public void TC_05_Add_Annotation() throws Exception {

		Document_Version pojo = new Document_Version();

		Reporter.log("Test Scenario 5 : Verifying set Active version ", true);

		jsclick(pojo.getRefreshbutton());
		Reporter.log("click on Refresh button ", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder());
		Thread.sleep(7000);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(7000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("open document from Document List", true);
		jsclick(pojo.getFloatingButton());
		Thread.sleep(7000);
		Reporter.log("Click on Floating button", true);
		movingclkElement(pojo.getUploadFab());
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Thread.sleep(7000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getFloatingButton());
		Reporter.log("Click on Floating button", true);
		jsclick(pojo.getSaveFab());
		Thread.sleep(7000);
		Reporter.log("Click on Save button", true);
		jsclick(pojo.getSaveOkButton());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Version Option", true);
		pojo.getClick_signature_Menuoption();
		Thread.sleep(7000);
		Reporter.log("Click on signature menu Option", true);
		try {
		pojo.getinputpassword();
		Thread.sleep(7000);
		Reporter.log("Enter a Password", true);
		} catch (Exception e) {
			System.out.println("signature is not password protected...");
		}
		pojo.getAdd_Signature_Onpage();
		Thread.sleep(7000);
		Reporter.log("New signature added Successfully on  Document", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Version Option", true);
		Reporter.log("Verifying version Page annotated/modified ", true);
	}

	@Test(priority = 6)
	public void TC_06_Set_active_version() throws Exception {

		Document_Version pojo = new Document_Version();

		Reporter.log("Test Scenario 6 : Verifying set Active version ", true);
		jsclick(pojo.getRefreshbutton());
		Reporter.log("click on  Refresh button ", true);
		Thread.sleep(7000);
		pojo.getMoveTo_Menu_Recent();
		Thread.sleep(7000);
		Reporter.log("Move to Recent Tab", true);
		jsclick(pojo.get_clickRecent_Folder());
		Thread.sleep(7000);
		Reporter.log("Click on Recent Folder", true);
		Thread.sleep(7000);
		jsclick(pojo.getSelect_Document());
		Thread.sleep(7000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		Reporter.log("Open document from Document List", true);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Version Option", true);
		jsclick(pojo.getSet_active_version());
		Thread.sleep(7000);
		Reporter.log("select version to set active version", true);
		jsclick(pojo.getSet_active_version_button());
		Reporter.log("Click on Set active Version button", true);
		Thread.sleep(7000);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Version Option", true);
		Reporter.log("Active version set and verified successfully", true);
		Thread.sleep(7000);
	}

	@Test(priority = 7)
	public void TC_07_Update_Document_Properties() throws Exception {

		Document_Version pojo = new Document_Version();

		Reporter.log("Test Scenario 7 : Update document properties ", true);

		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name value from Reportname field", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.DocumentVersion_excelRead(4, 0));
		Thread.sleep(7000);
		Reporter.log("Update Report Name value ", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getCloseDoc());
		Thread.sleep(7000);
		Reporter.log("Click on Close button", true);
		Reporter.log("verified and updated Document properties", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
