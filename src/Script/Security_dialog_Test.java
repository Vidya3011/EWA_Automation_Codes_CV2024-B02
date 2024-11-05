package Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Document_References;
import Pom.Security;

public class Security_dialog_Test extends Generic.BaseClass {

	@BeforeClass
	public void Launch_Browser() throws Exception {

		loadBrowser("edge");
		launch47Url();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test
	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);
	}

	@Test(priority = 1)
	public void TC_01_Give_All_permission_To_Cabinet() throws Exception {

		Security sec = new Security();
		sec.All_permission_To_Cabinet();
	}

	@Test(priority = 2)
	public void TC_02_Verify_All_permission_for_Cabinet() throws Exception {

		Security sec = new Security();
		sec.Verify_Permission_CabinetLevel();
	}

	@Test(priority = 3)
	public void TC_03_Remove_All_permission_for_Cabinet() throws Exception {

		Security sec = new Security();
		sec.Remove_All_permission_Cabinet();
	}

	@Test(priority = 4)
	public void TC_04_Set_Delete_permission_Denied_for_Folder() throws Exception {

		Security sec = new Security();
		sec.Set_Delete_Denied_onFolder();
	}

	@Test(priority = 5)
	public void TC_05_Verify_Delete_permission_Denied_for_Folder() throws Exception {

		Security sec = new Security();
		sec.Verify_Delete_permission_Denied_Folder();
	}

	@Test(priority = 6)
	public void TC_06_Remove_Delete_permission_Denied_for_Drawer() throws Exception {

		Security sec = new Security();
		sec.Remove_Delete_Denied_Folder();
	}

	@Test(priority = 7)
	public void TC_07_Share_permission_Denied_for_Folder() throws Exception {

		Security sec = new Security();
		sec.Share_permission_Denied_Folder();
	}

	@Test(priority = 8)
	public void TC_08_Verify_Modify_Permissions_Denied_on_subFolder() throws Exception {

		Security sec = new Security();
		sec.Modify_Denied_Subfolder();
	}

	@Test(priority = 9)
	public void TC_09_Give_Different_permission_To_Group_for_AllNodes() throws Exception {

		Security sec = new Security();
		sec.Diffrenet_permissions_Group();
	}

	@Test(priority = 10)
	public void TC_10_Verify_Respective_permission_To_Group_for_AllNodes() throws Exception {

		Security sec = new Security();
		sec.Verify_Respective_Group_permission();
	}

}
