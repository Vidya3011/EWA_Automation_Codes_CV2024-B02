package Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pom.TemplatePage;

//Dipak Automation script

public class Templates_Test extends Generic.BaseClass {

/* @BeforeClass
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
	public void TC_01_verify_to_CreateorBrowse_Template_Defaultviewing() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.verify_to_CreateorBrowse_Template_Defaultviewing();
	}

	@Test(priority = 2)
	public void TC_02_Verify_to_Edit_and_Delete_DefaultTemplate() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.Verify_to_Edit_and_Delete_DefaultTemplate();
	}

	@Test(priority = 3)
	public void TC_03_verify_to_CreateorBrowse_Template_Advancedviewing_Officedoc() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.verify_CreateorBrowse_Template_Advancedviewing_Officedoc();
	}

	@Test(priority = 4)
	public void TC_04_Verify_to_Edit_and_Delete_AdvancedTemplate_Officedoc() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.Verify_to_Edit_and_Delete_AdvancedTemplate_Officedoc();
	}

	@Test(priority = 5)
	public void TC_05_verify_to_Create_Formmapping_PDFTemplate_Advancedviewing() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.verify_to_Create_Formmapping_PDFTemplate_Advancedviewing();
	}

	@Test(priority = 6)
	public void TC_06_Verify_to_Edit_and_Delete_Formfield() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.Verify_to_Edit_and_Delete_Formfield();
	}

	@Test(priority = 7)
	public void TC_07_Set_Defaultview() throws Exception {

		TemplatePage pojo = new TemplatePage();
		pojo.Set_Defaultview();
	}
}
