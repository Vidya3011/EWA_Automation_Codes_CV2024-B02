package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.My_Preferences;

public class My_Preferences_QuickFind extends BaseClass {

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
	public void TC_01_Verify_QuickFind_DocIdSearch() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 1 : Verifying Quick Find Doc Id Search ", true);
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
		pojo.getSelect_QuickFind_DocIdSearch();
		Thread.sleep(7000);
		Reporter.log("Select Quick fing and set as Doc Id Search", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		// Create New Document and Copy Document ID.
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(2000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(2000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(2000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(2000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(2000);
		Reporter.log("select a Folder", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button ", true);
		pojo.getSelect_Document_Type_Dropdown();
		Thread.sleep(7000);
		Reporter.log("Select Value from Document type Dropdown", true);
		pojo.getEnter_ReportName();
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse a Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PdfDoc\\FileUploadMorePdfDoc.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		jsclick(pojo.getCreate_button());
		Thread.sleep(3000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getViewDocument_Button());
		Thread.sleep(7000);
		Reporter.log("Click on View button", true);
		Reporter.log("Document Created Successfully ", true);
		jsclick(pojo.getClick_general_option());
		Thread.sleep(7000);
		Reporter.log("Click on General Option", true);
		pojo.getVerify_Doc_Id();
		Thread.sleep(7000);
		Reporter.log("Verified created Document ID In General", true);
		pojo.getEnter_Doc_Id_InSearch();
		Thread.sleep(7000);
		Reporter.log("Enter Document Id in Search textbox", true);
		jsclick(pojo.getClick_general_option());
		Thread.sleep(7000);
		Reporter.log("Click on General Option", true);
		pojo.getVerify_Doc_Id();
		Thread.sleep(7000);
		Reporter.log("Searching and verified newly created Document ID", true);
		Reporter.log("Selected Document Id Document Open successfully", true);
		Reporter.log("Verifying successfully Quick Find Doc Id Search", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify_QuickFind_TextSearch() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 2 : Verifying QuickFind TextSearch ", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_QuickFind_TextSearch();
		Thread.sleep(7000);
		Reporter.log("Select Quick find and set as Text Search", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		pojo.getEnter_Text_InSearch();
		Thread.sleep(9000);
		Reporter.log("Enter Text in Serach Textbox", true);
		Reporter.log("Verifying successfully Quick Find Text search", true);

	}

	@Test(priority = 3)
	public void TC_03_Verify_QuickFind_IndexSearch() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 3: Verifying QuickFind IndexSearch ", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getSelect_QuickFind_IndexSearch();
		Thread.sleep(7000);
		Reporter.log("Select Quick find and set as Index Search", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		pojo.getEnter_IndexValue_InSearch();
		Thread.sleep(7000);
		Reporter.log("Enter Index name in Search Textbox", true);
		Reporter.log("Verifying successfully Quick Find Index search", true);

	}

	@Test(priority = 4)
	public void TC_04_Verify_QuickFind_BothSearch() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 4: Verifying Quick Find Both Search ", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_QuickFind_Both();
		Thread.sleep(7000);
		Reporter.log("Select Quick find and set as Both", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		pojo.getEnter_BothValue_InSearch();
		Thread.sleep(7000);
		Reporter.log("Enter Both Value in search Textbox", true);
		Reporter.log("Verifying successfully Quick Find Text and Index search", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
