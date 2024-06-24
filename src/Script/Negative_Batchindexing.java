package Script;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.BatchIndexing;

public class Negative_Batchindexing extends Generic.BaseClass {

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
	public void TC_01_Verify_Emptyname_Indexing_folder() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		Reporter.log("Test Scenario 1 : Verifying Empty name Indexing folder", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on Batch Indexing Icon", true);
		jsclick(pojo.getAdd());
		Thread.sleep(7000);
		Reporter.log("Click on Add Icon on Batch Indexing dialog", true);
		jsclick(pojo.getAddFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Add Folder Option", true);
		jsclick(pojo.getOkbuttonFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Folder dialog Ok button", true);
		pojo.getFoldernamevalidation();
		Thread.sleep(7000);
		Reporter.log("Verified Folder Name Validation", true);
		jsclick(pojo.getCancelbutton());
		Reporter.log("Empty name Indexing folder not Created verified");
	}

	@Test(priority = 2)
	public void TC_02_Verify_Without_adding_ShareandRevoke_Permission() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		Reporter.log("Test Scenario 2 :Verifying Without adding  Share and Revoke Permission ", true);
		Thread.sleep(7000);
		jsclick(pojo.getclickFolderDropdown());
		Thread.sleep(7000);
		Reporter.log("Click on Folder Dropdown", true);
		jsclick(pojo.getSelectFolder());
		Thread.sleep(7000);
		Reporter.log("Select a Folder", true);
		jsclick(pojo.getAdd());
		Thread.sleep(7000);
		Reporter.log("Click on  Add button Batch Indexing dialog", true);
		jsclick(pojo.getsharePermission());
		Thread.sleep(7000);
		Reporter.log("Click on Share Permission button", true);
		Actions actor = new Actions(driver);
		actor.moveToElement(pojo.getAlluser()).click(pojo.getAlluser()).build().perform();
		Thread.sleep(7000);
		Reporter.log("Click and Select All Users ", true);
		jsclick(pojo.getSelectcheckbox());
		jsclick(pojo.getSelectcheckbox());
		Thread.sleep(7000);
		Reporter.log("Unselect all Users again", true);
		pojo.getassign().click();
		Thread.sleep(7000);
		Reporter.log("Click on  Assign button", true);
		pojo.getUservalidation();
		Thread.sleep(7000);
		Reporter.log("Verified Validation Message", true);
		jsclick(pojo.getCloseButton());
		Thread.sleep(7000);
		Reporter.log("Click on  Batch Indexing dialog Close button", true);
		Reporter.log("Without adding  showing validation verified");
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
