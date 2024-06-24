package Script;

import java.time.Duration;

//Dipak Automation script

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pom.BatchIndexing;

public class BatchIndexing_Test extends Generic.BaseClass {

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
	public void TC_01_Verify_Create_Folder_and_Create_Indexing_Document_with_show_Thumbnails() throws Exception {

		BatchIndexing pojo = new BatchIndexing();

		Reporter.log(
				"Test Scenario 1 :Verifying Create new folder and create Indexing document with show Thumbnails option ",
				true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on Batch Indexing Icon", true);
		jsclick(pojo.getAdd());
		Thread.sleep(7000);
		Reporter.log("Click on Add Icon", true);
		jsclick(pojo.getAddFolder());
		Reporter.log("Click on Add Folder", true);
		pojo.getFolderText().sendKeys(pojo.BatchIndexing_excelRead(1, 2));
		Thread.sleep(7000);
		Reporter.log("Click on Folder Textbox", true);
		pojo.getFolderDescription().sendKeys(pojo.BatchIndexing_excelRead(1, 3));
		Thread.sleep(7000);
		Reporter.log("Enter Description text into folder description field", true);
		jsclick(pojo.getcheck1());
		Reporter.log("Check a Checkbox", true);
		jsclick(pojo.getOkbuttonFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);

		try {
			WebElement Message = pojo.getFolderOK();
			Message.click();
			Thread.sleep(7000);
			Reporter.log("Verifying folder already exist and click on Ok button", true);
			jsclick(pojo.getCancelbutton());
			Reporter.log("Click on cancel button", true);
			Thread.sleep(7000);
		} catch (Exception e) {
			// message is not displayed
		}
		movingclkElement(pojo.getclickFolderDropdown());
		Thread.sleep(7000);
		Reporter.log("Click on Folder dropdown", true);
		movingclkElement(pojo.getSelectFolder());
		Thread.sleep(7000);
		Reporter.log("Select a created folder", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getChooseFile()));
		jsclick(pojo.getChooseFile());
		Thread.sleep(7000);
		Reporter.log("Click on Choose file button and upload document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\BatchIndexingDoc.exe");
		Thread.sleep(7000);
		Reporter.log("By using AutoIT add file from external folder", true);
		movingclkElement(pojo.getclickFolderDropdown());
		Thread.sleep(7000);
		Reporter.log("Click on Folder dropdown", true);
		movingclkElement(pojo.getSelectFolder());
		Thread.sleep(7000);
		Reporter.log("Select a created folder", true);
		movingclkElement(pojo.getAdd());
		Thread.sleep(7000);
		Reporter.log("Click on add Icon", true);
		movingclkElement(pojo.getshowThumbnailoption());
		Thread.sleep(7000);
		Reporter.log("Click on Show Thumbnail option", true);
		jsclick(pojo.getClickShowThumbnails());
		Thread.sleep(7000);
		Reporter.log("Check Show Thumbnail Icon", true);
		jsclick(pojo.getSelectDoc1());
		Thread.sleep(7000);
		Reporter.log("Select a first page Thumbnail", true);
		pojo.getVerifyFolderDescription();
		Thread.sleep(7000);
		Reporter.log("Verified folder description", true);
		jsclick(pojo.getIndexbutton());
		Reporter.log("Click on Index button", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(7000);
		Reporter.log("Click on destination folder Textbox", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("Select a folder for create new documents", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(7000);
		Reporter.log("Select a document type dropdown", true);
		pojo.getEnter_Report_Name_Text().sendKeys(pojo.BatchIndexing_excelRead(1, 2));
		Thread.sleep(7000);
		Reporter.log("Enter value into Report name field", true);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(7000);
		Reporter.log("Click on create button", true);
		jsclick(pojo.getView_Button());
		Thread.sleep(7000);
		Reporter.log("Click on View button", true);
		Reporter.log("Verifying Create folder and create Indexing document with show Thumbnails option successfully",
				true);
	}

	@Test(priority = 2)
	public void TC_02_Verify_Create_As_Single_Document() throws Exception {

		BatchIndexing pojo = new BatchIndexing();

		Reporter.log("Scenario 02: Verifying create As Single document", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on Batch Indexing Icon", true);
		movingclkElement(pojo.getclickFolderDropdown());
		Thread.sleep(7000);
		Reporter.log("Click on Folder dropdown", true);
		movingclkElement(pojo.getSelectFolder());
		Thread.sleep(7000);
		Reporter.log("Select a created folder", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getChooseFile()));
		jsclick(pojo.getChooseFile());
		Thread.sleep(7000);
		Reporter.log("Click on Choose file button and upload document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\BatchIndexingDoc.exe");
		Thread.sleep(7000);
		Reporter.log("By using AutoIT add file from external folder", true);
		movingclkElement(pojo.getclickFolderDropdown());
		Thread.sleep(7000);
		Reporter.log("Click on folder dropdown", true);
		movingclkElement(pojo.getSelectFolder());
		Thread.sleep(7000);
		Reporter.log("Select folder from dropdown", true);
		jsclick(pojo.getSelectDoc1());
		Thread.sleep(7000);
		Reporter.log("Select a first page Thumbnail", true);
		pojo.getVerifyFolderDescription();
		Thread.sleep(7000);
		Reporter.log("Verified folder description", true);
		jsclick(pojo.getSingleDoc());
		Thread.sleep(7000);
		Reporter.log("Check single document checkbox", true);
		jsclick(pojo.getIndexbutton());
		Reporter.log("Click on Index button", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(7000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(7000);
		Reporter.log("Click on destination folder Textbox", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("Select a folder for create new documents", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(7000);
		Reporter.log("Select a document type dropdown", true);
		pojo.getEnter_Report_Name_Text().sendKeys(pojo.BatchIndexing_excelRead(1, 2));
		Thread.sleep(7000);
		Reporter.log("Enter value into Report Name field ", true);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(7000);
		Reporter.log("Click on create button", true);
		jsclick(pojo.getView_Button());
		Thread.sleep(7000);
		Reporter.log("Click on View button", true);
		Reporter.log("Verifying create As Single document successfully", true);
	}

	@Test(priority = 3)
	public void TC_03_Verify_Delete_Indexing_Document() throws Exception {

		BatchIndexing pojo = new BatchIndexing();

		Reporter.log("Test Scenario 3: Verifying delete Indexing document ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on Batch Indexing Icon", true);
		movingclkElement(pojo.getclickFolderDropdown());
		Thread.sleep(7000);
		Reporter.log("Click on Folder dropdown", true);
		movingclkElement(pojo.getSelectFolder());
		Thread.sleep(7000);
		Reporter.log("Selct a folder", true);
		jsclick(pojo.getSelectDoc1());
		Thread.sleep(7000);
		Reporter.log("Check first page Thumbnail", true);
		movingclkElement(pojo.getAdd());
		Thread.sleep(7000);
		Reporter.log("Click on Add Icon", true);
		jsclick(pojo.getDeleteDoc());
		Reporter.log("Click on delete document option", true);
		Reporter.log("Verifying selected Indexing document deleted successfully", true);
	}

	@Test(priority = 4)
	public void TC_04_Verify_Setting_Delete_on_Index_on_Document() throws Exception {

		BatchIndexing pojo = new BatchIndexing();

		Reporter.log("Test Scenario 4 : Verifying Setting delete on Index on document ", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on batch Indexing Icon", true);
		movingclkElement(pojo.getclickFolderDropdown());
		Thread.sleep(7000);
		Reporter.log("Click on folder dropdown", true);
		movingclkElement(pojo.getSelectFolder());
		Thread.sleep(7000);
		Reporter.log("Select a folder", true);
		movingclkElement(pojo.getAdd());
		Thread.sleep(7000);
		Reporter.log("Click on Add Icon", true);
		jsclick(pojo.getsettingoption());
		Thread.sleep(7000);
		Reporter.log("Click on setting option", true);
		pojo.getDeletesource_Option();
		Thread.sleep(7000);
		Reporter.log("Check Delete Source Icon", true);
		pojo.getallowDeleteOnIndex_Option();
		Thread.sleep(7000);
		Reporter.log("Check allow delete on Index", true);
		jsclick(pojo.getrepostSettingsModalOk());
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSingleDoc());
		Reporter.log("Click on Single document checkbox", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getChooseFile()));
		jsclick(pojo.getChooseFile());
		Thread.sleep(7000);
		Reporter.log("Click on choose file button", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\BatchIndexingDoc.exe");
		Thread.sleep(6000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getSelectDoc1());
		Thread.sleep(6000);
		Reporter.log("Check Uploaded document", true);
		jsclick(pojo.getIndexbutton());
		Reporter.log("Click on Index button", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(7000);
		Reporter.log("Click on destination folder textbox", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("Expand a folder", true);
		Reporter.log("Select folder for create new documents", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(7000);
		Reporter.log("Select documment Type", true);
		pojo.getEnter_Report_Name_Text().sendKeys(pojo.BatchIndexing_excelRead(1, 2));
		Thread.sleep(7000);
		Reporter.log("Enter value into Report Name field", true);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(7000);
		Reporter.log("Click on create button", true);
		jsclick(pojo.getView_Button());
		Thread.sleep(7000);
		Reporter.log("Click on View button", true);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on Batch Indexing Icon", true);
		jsclick(pojo.getCloseButton());
		Reporter.log("Click on Close button", true);
		Reporter.log("Verified Setting delete on Index on document", true);

	}

	@Test(priority = 5)
	public void TC_05_Verify_Give_Assign_Share_Permission_To_User() throws Exception {

		BatchIndexing pojo = new BatchIndexing();

		Reporter.log("Test Scenario 5 : Verifying give assign share permission to User ", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on batch Indexing Icon", true);
		movingclkElement(pojo.getclickFolderDropdown());
		Thread.sleep(7000);
		Reporter.log("Click on folder dropdown", true);
		movingclkElement(pojo.getSelectFolder());
		Thread.sleep(7000);
		Reporter.log("Select a folder", true);
		movingclkElement(pojo.getAdd());
		Thread.sleep(7000);
		Reporter.log("Click on Add Icon", true);
		jsclick(pojo.getsharePermission());
		Thread.sleep(7000);
		Reporter.log("Click on sharepPermission button", true);
		jsclick(pojo.getRevoke());
		Thread.sleep(7000);
		Reporter.log("Click on Revoke button", true);
		try {
			pojo.getRevokeuservalidation();
			Reporter.log("Verified selected folder is Not shared to any ", true);
			Thread.sleep(7000);
		} catch (Exception e) {
			// message is not displayed
		}
		movingclkElement(pojo.getAlluser());
		Thread.sleep(7000);
		Reporter.log("Click on select To assign permission textbox", true);
		movingclkElement(pojo.getSelectrAssignUser());
		Thread.sleep(7000);
		Reporter.log("Check assign user from dropdown list", true);
		jsclick(pojo.getassign());
		Thread.sleep(7000);
		Reporter.log("Click on assign button", true);
		jsclick(pojo.getCloseButton());
		Reporter.log("Click on Close button", true);
		Reporter.log("Give assign share permission to user", true);
	}

	// @Test(priority = 6)
	public void TC_06_Verify_Assign_Share_Permission_Respective_User() throws Exception {

		BatchIndexing pojo = new BatchIndexing();

		Reporter.log("Test Scenario 6 : Verifying assign share permission to Respective user", true);
		jsclick(pojo.getUsername());
		Thread.sleep(7000);
		Reporter.log("Click on username", true);
		jsclick(pojo.getLogout());
		Thread.sleep(7000);
		Reporter.log("Click on Logout option", true);
		pojo.login_Assign_User();
		Thread.sleep(7000);
		Reporter.log("Login with assign user ", true);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on batch Indexing Icon", true);
		movingclkElement(pojo.getclickFolderDropdown());
		Thread.sleep(7000);
		Reporter.log("Click on folder dropdown", true);
		movingclkElement(pojo.getSelectFolder());
		Thread.sleep(7000);
		Reporter.log("Select a folder", true);
		jsclick(pojo.getCloseButton());
		Thread.sleep(7000);
		Reporter.log("Click on close button", true);
		Reporter.log("Verified assign share permission on Index on Document", true);
	}

	@Test(priority = 7)
	public void TC_07_Verify_Revoke_Share_Permission_Of_User() throws Exception {

		BatchIndexing pojo = new BatchIndexing();

		Reporter.log("Test Scenario 7 : Verifying Revoke share permission of user ", true);
		jsclick(pojo.getUsername());
		Thread.sleep(7000);
		Reporter.log("Click on username", true);
		jsclick(pojo.getLogout());
		Thread.sleep(7000);
		Reporter.log("Click on Logout option", true);
		LogDipakUser();
		Thread.sleep(7000);
		Reporter.log("Login with user", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on batchIndexing Icon", true);
		movingclkElement(pojo.getclickFolderDropdown());
		Thread.sleep(7000);
		Reporter.log("Click on folder dropdown", true);
		movingclkElement(pojo.getSelectFolder());
		Thread.sleep(7000);
		Reporter.log("Select a folder", true);
		movingclkElement(pojo.getAdd());
		Thread.sleep(7000);
		Reporter.log("Click on add Icon", true);
		movingclkElement(pojo.getsharePermission());
		Thread.sleep(7000);
		Reporter.log("Click on share permission", true);
		jsclick(pojo.getRevoke());
		Thread.sleep(7000);
		Reporter.log("Click on Revoke button", true);
		jsclick(pojo.getCloseButton());
		Thread.sleep(7000);
		Reporter.log("Click on close button", true);
		Reporter.log("Verified Revoke share permission on Index on document", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}