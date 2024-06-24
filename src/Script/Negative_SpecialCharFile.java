package Script;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.SpecialCharFilenames;

public class Negative_SpecialCharFile extends Generic.BaseClass {

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
	public void TC_01_Verify_Destination_Folder() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();

		Reporter.log("Test Scenario 1 : Verifying Destination Folder ", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefresh_button());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getNewDocuments_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(7000);
		Reporter.log("Click on Destination Folder Textbox", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getFolderSelectMessage();
		Thread.sleep(7000);
		Reporter.log("Verifying Validation Message", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getFolderSelectMessage();
		Thread.sleep(7000);
		Reporter.log("Verifying Validation message", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("select a Folder", true);
		pojo.getFolderSelectMessage();
		Thread.sleep(7000);
		Reporter.log("Verifying Validation message", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(7000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Reporter.log("Select Folder message verified", true);
		Thread.sleep(7000);
	}

	@Test(priority = 2)
	public void TC_02_Verify_Asterrisk_Field() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();

		Reporter.log("Test Scenario 2 : Verifying Asterrisk Field ", true);
		Thread.sleep(7000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(7000);
		Reporter.log("Select value from Document type dropdown", true);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Create button", true);
		pojo.getReportvaluevalidationerror();
		Thread.sleep(7000);
		Reporter.log("Verifi validation message", true);
		Reporter.log("Asterisk field verified", true);
	}

	@Test(priority = 3)
	public void TC_03_Create_Emptypage_Document() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();

		Reporter.log("Test Scenario 3 : Create Empty page Document ", true);
		Thread.sleep(7000);
		pojo.getEnter_Report_Name_Text().sendKeys(pojo.Specialchar_excelRead(1, 0));
		Thread.sleep(7000);
		Reporter.log("Enter value into Report Name field", true);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Create button", true);
		pojo.getNavigateDoc();
		Reporter.log("Click on Navigate button", true);
		Reporter.log("Empty page document Created successfully", true);
		Thread.sleep(7000);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
