package Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.TemplatePage;

public class Negative_Templates extends Generic.BaseClass {

	/*@BeforeClass
	public void Launch_Browser() throws Exception {

		loadBrowser("edge");
		launchUrl();
		Reporter.log("CVS URL started Successfull", true);
	}

	@Test
	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}*/

	@Test(priority = 1)
	public void TC_01_Login_Template_permissionassign_User_and_verify_message_Select_Folder_ToCreateDoc()
			throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.Login_Template_permissionassign_User_and_verify_message_Select_Folder_ToCreateDoc();
	}

	@Test(priority = 2)
	public void TC_02_verify_message_addPages_Using_SaveandClearButton() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.verify_message_addPages_Using_SaveandClearButton();
	}

	@Test(priority = 3)
	public void TC_03_Verify_TextboxName_and_Templatename_validation() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.Verify_TextboxName_and_Templatename_validation();
	}

	@Test(priority = 4)
	public void TC_04_Verify_validation_Duplicate_Template_Created() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.Verify_validation_Duplicate_Template_Created();
	}

	@Test(priority = 5)
	public void TC_05_verify_to_CreateorBrowse_Template_Advancedviewing_Officedoc() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.verify_to_CreateorBrowse_Template_Advancedviewing_Officedoc();
	}

	@Test(priority = 6)
	public void TC_06_verify_Validation_Formmapping_PDFTemplate_Advancedviewing() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.verify_Validation_Formmapping_PDFTemplate_Advancedviewing();
	}

	@Test(priority = 7)
	public void TC_07_Set_Defaultview() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.Set_Defaultview();
	}
}
