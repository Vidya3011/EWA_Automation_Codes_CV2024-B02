package Script;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.Logout;
import Pom.My_Preferences;

public class My_Preferences_Load_more_count extends BaseClass {

	private static final Logger log = LogManager.getLogger(My_Preferences_Add_signature.class);

	 @BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	 @Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		log.info("CVS URL started Successfully...");

	}

	//@Test(priority = 1)
	public void Verify_Load_MoreCount_On_Search() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(6000);
		pojo.getEnter_Loadmorecount();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(4000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(5000);
		pojo.getVerify_Loadmorecount_Searchresult();
		Thread.sleep(5000);
		jsclick(pojo.getLoadmorebutton());
		Thread.sleep(4000);
		pojo.getVerify_Loadmorecount_Searchresult();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		Reporter.log("Minumum number of Load More count on Search Verified successfully", true);
		log.info("Minumum number of Load More count on Search Verified successfully");
	}

	//@Test(priority = 2)
	public void Verify_Load_MoreCount_On_Folder() throws Exception {

		My_Preferences pojo = new My_Preferences();
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(4000);
		pojo.getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(4000);
		jsclick(pojo.getLoadmorebutton());
		Thread.sleep(4000);
		pojo.getVerify_Loadmorecount_Document_Folder();
		Reporter.log("Minumum number of Load More count on Folder Verified successfully", true);
		log.info("Minumum number of Load More count on Folder Verified successfully");

	}

	@Test(priority = 3)
	public void Verify_Maximum_Load_MoreCountOn_Search() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getEnter_Maximum_Loadmorecount().clear();
		pojo.getEnter_Maximum_Loadmorecount().sendKeys(excelRead(5,0));
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		pojo.getMax_Loadmorecount_OK_button();
		Thread.sleep(4000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(4000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(5000);
		pojo.getVerify_Loadmorecount_Searchresult();
		Thread.sleep(5000);
		jsclick(pojo.getLoadmorebutton());
		Thread.sleep(4000);
		pojo.getVerify_Loadmorecount_Searchresult();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		Reporter.log("Maximum number of Load More count on Search Verified successfully", true);
		log.info("Maximum number of Load More count on Search Verified successfully");
	}

	//@Test(priority = 4)
	public void Verify_Maximum_Load_MoreCount_On_Folder() throws Exception {

		My_Preferences pojo = new My_Preferences();
		movingDoublecli(pojo.getCabinet(), pojo.getCabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getDrawer(), pojo.getDrawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getFolder(), pojo.getFolder());
		Thread.sleep(4000);
		pojo.getVerify_Loadmorecount_Document_Folder();
		Thread.sleep(4000);
		jsclick(pojo.getLoadmorebutton());
		Thread.sleep(4000);
		pojo.getVerify_Loadmorecount_Document_Folder();
		Reporter.log("Maximum number of Load More count on Folder Verified successfully", true);
		log.info("Maximum number of Load More count on Folder Verified successfully");
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
	}

}
