package Script;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.My_Preferences;

public class My_Preferences_Load_more_count extends BaseClass {

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
	public void TC_01_Verify_Load_MoreCount_On_Search() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 1 : Verifying Load More Count On Search ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getEnter_Maximum_Loadmorecount1().clear();
		Thread.sleep(7000);
		Reporter.log("Clear Load more count", true);
		pojo.getEnter_Maximum_Loadmorecount1().sendKeys(CountexcelRead(2, 4));
		Thread.sleep(7000);
		Reporter.log("Enter Load more count value", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.getVerify_Loadmorecount_Searchresult();
		Thread.sleep(7000);
		Reporter.log("Verified Load More on Search Result", true);
		jsclick(pojo.getLoadmorebutton());
		Thread.sleep(7000);
		Reporter.log("Click on Load More button", true);
		pojo.getVerify_Loadmorecount_Searchresult();
		Thread.sleep(7000);
		Reporter.log("Verified Load More on Search ResultC", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("Minumum number of Load More count on Search Verified successfully", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify_Load_MoreCount_On_Folder() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 2 : Verifying Load More Count On Folder ", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("select a Folder", true);
		pojo.getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(7000);
		Reporter.log("Verified Load More Count on Document Flder", true);
		jsclick(pojo.getLoadmorebutton());
		Thread.sleep(7000);
		Reporter.log("Click on Load More button", true);
		pojo.getVerify_Loadmorecount_Document_Folder();
		Reporter.log("Minumum number of Load More count on Folder Verified successfully", true);

	}

	@Test(priority = 3)
	public void TC_03_Verify_Maximum_Load_MoreCountOn_Search() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 3 : Verifying Maximum Load More Count On Search ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getEnter_Maximum_Loadmorecount1().clear();
		Thread.sleep(7000);
		Reporter.log("Clear Load more count value", true);
		pojo.getEnter_Maximum_Loadmorecount1().sendKeys(CountexcelRead(2, 4));
		Thread.sleep(7000);
		Reporter.log("Enter Load More count Value in textbox", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		pojo.getMax_Loadmorecount_OK_button();
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.getVerify_Loadmorecount_Searchresult();
		Thread.sleep(7000);
		Reporter.log("Verified Load More count On Serach Result", true);
		jsclick(pojo.getLoadmorebutton());
		Thread.sleep(7000);
		Reporter.log("Click on Load More button", true);
		pojo.getVerify_Loadmorecount_Searchresult();
		Thread.sleep(7000);
		Reporter.log("Verified Load More count On Serach Result", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("Maximum number of Load More count on Search Verified successfully", true);

	}

	@Test(priority = 4)
	public void TC_04_Verify_Maximum_Load_MoreCount_On_Folder() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 4 : Verifying Maximum Load More Count On Folder  ", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("select a Folder", true);
		pojo.getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(7000);
		Reporter.log("Verified Load More count on Document Folder", true);
		jsclick(pojo.getLoadmorebutton());
		Thread.sleep(7000);
		Reporter.log("Click on Load More button", true);
		pojo.getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(7000);
		Reporter.log("Maximum number of Load More count on Folder Verified successfully", true);
		driver.close();
		Reporter.log("Close the browser", true);
	}

}
