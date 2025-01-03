package Computhink.Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.BatchIndexing;

public class BatchIndexing_Test extends Computhink.Generic.BaseClass {

<<<<<<< HEAD
	/*
	 * @BeforeClass
	 * 
	 * public void Launch_Browser() throws Exception { loadBrowser("edge");
	 * launchUrl(); Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test
	 * 
	 * public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully", true); }
	 */
=======
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

>>>>>>> origin/Dipak-Pandurang-Gawali
	@Test(priority = 1)
	public void TC_01_Verify_Create_Folder_and_Create_Indexing_Document_with_show_Thumbnails() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		pojo.Create_Folder_and_Indexing_Document_with_Thumbnail();

	}

	@Test(priority = 2)
	public void TC_02_Verify_Create_As_Single_Document() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		pojo.Create_Single_Document();

	}

	@Test(priority = 3)
<<<<<<< HEAD
	public void TC_03_Verify_Delete_Indexing_Document() throws Exception {
=======
	public void TC_03_Verify_Create_As_Multiple_Document() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		pojo.Create_multiple_Document();

	}

	@Test(priority = 4)
	public void TC_04_Verify_Delete_Indexing_Document() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		BatchIndexing pojo = new BatchIndexing();
		pojo.Delete_Indexing_Document();

	}

<<<<<<< HEAD
	@Test(priority = 4)
	public void TC_04_Verify_Setting_Delete_on_Index_on_Document() throws Exception {
=======
	@Test(priority = 5)
	public void TC_05_Verify_Setting_Delete_on_Index_on_Document() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		BatchIndexing pojo = new BatchIndexing();
		pojo.Delete_Indexing_Document_From_Setting();

	}

<<<<<<< HEAD
	@Test(priority = 5)
	public void TC_05_Verify_Give_Assign_Share_Permission_To_User() throws Exception {
=======
	@Test(priority = 6)
	public void TC_06_Verify_Give_Assign_Share_Permission_To_User() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		BatchIndexing pojo = new BatchIndexing();
		pojo.Assign_Share_Permission_toUser();

	}

<<<<<<< HEAD
	@Test(priority = 6)
	public void TC_06_Verify_Assign_Share_Permission_Respective_User() throws Exception {
=======
	@Test(priority = 7)
	public void TC_07_Verify_Assign_Share_Permission_Respective_User() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		BatchIndexing pojo = new BatchIndexing();
		pojo.Check_Assign_Share_Permission();

	}

<<<<<<< HEAD
	@Test(priority = 7)
	public void TC_07_Verify_Revoke_Share_Permission_Of_User() throws Exception {
=======
	@Test(priority = 8)
	public void TC_08_Verify_Revoke_Share_Permission_Of_User() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		BatchIndexing pojo = new BatchIndexing();
		pojo.Revoke_Share_Permission();

	}
}