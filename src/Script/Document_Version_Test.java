package Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.Document_Version;

public class Document_Version_Test extends BaseClass {

	/*@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("edge");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully", true);

	}*/

	@Test(priority = 1)
	public void TC_01_Create_Document_and_Verify_Document_Versions() throws Exception {

		Document_Version pojo = new Document_Version();
		pojo.Create_Document_Verify_Version();
	}

	@Test(priority = 2)
	public void TC_02_Upload_and_Save_New_page_and_Verify_Version_with_New_Comments() throws Exception {

		Document_Version pojo = new Document_Version();
		pojo.Add_Page_with_Comment();
	}

	@Test(priority = 3)
	public void TC_03_Delete_Page_and_Verify_Version() throws Exception {

		Document_Version pojo = new Document_Version();
		pojo.Delete_Page();
	}

	@Test(priority = 4)
	public void TC_04_Verify_Delete_All_versions_and_FullScreen_Option() throws Exception {

		Document_Version pojo = new Document_Version();
		pojo.Delete_All_version_with_Fullscreen();
	}

	@Test(priority = 5)
	public void TC_05_Add_Annotation() throws Exception {

		Document_Version pojo = new Document_Version();
		pojo.Add_Annotations();
	}

	@Test(priority = 6)
	public void TC_06_Set_active_version() throws Exception {

		Document_Version pojo = new Document_Version();
		pojo.Set_ActiveVersion();
	}

	@Test(priority = 7)
	public void TC_07_Update_Document_Properties() throws Exception {

		Document_Version pojo = new Document_Version();
		pojo.Update_Doc_Properties();
	}
}
