package Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.My_Preferences;

public class My_Preferences_Load_more_count extends BaseClass {

	/*@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("edge");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}*/

	@Test(priority = 1)
	public void TC_01_Verify_Load_MoreCount_On_Search() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Load_MoreCount_On_Search();

	}

	@Test(priority = 2)
	public void TC_02_Verify_Load_MoreCount_On_Folder() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Load_MoreCount_On_Folder();

	}

	@Test(priority = 3)
	public void TC_03_Verify_Maximum_Load_MoreCountOn_Search() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Maximum_Load_MoreCountOn_Search();
	}

	@Test(priority = 4)
	public void TC_04_Verify_Maximum_Load_MoreCount_On_Folder() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Maximum_Load_MoreCount_On_Folder();
	}

}
