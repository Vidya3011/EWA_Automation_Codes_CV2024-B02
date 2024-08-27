package Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.BatchIndexing;

public class Negative_Batchindexing extends Generic.BaseClass {

	/*
	 * @BeforeClass
	 * 
	 * public void Launch_Browser() throws Exception { loadBrowser("edge");
	 * launchUrl(); Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test
	 * 
	 * public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully.", true); }
	 */

	@Test(priority = 1)
	public void TC_01_Verify_Emptyname_Indexing_folder() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		pojo.Empty_Name_Folder();

	}

	@Test(priority = 2)
	public void TC_02_Verify_Without_adding_ShareandRevoke_Permission() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		pojo.Without_BatchIndex_permissions();

	}
}
