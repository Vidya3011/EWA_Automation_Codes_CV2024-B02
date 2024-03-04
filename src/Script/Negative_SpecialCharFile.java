package Script;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.SpecialCharFilenames;

public class Negative_SpecialCharFile extends Generic.BaseClass {
	private static final Logger log = LogManager.getLogger(Negative_SpecialCharFile.class);

	// @BeforeClass
	public void LandBrowser() {

		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	// @Test
	public void Login_EWA() throws Exception {
		LogDipakUser();
		log.info("CVS User is logged in successfully...");

	}

	@Test(priority = 1)
	public void Verify_Destination_Folder() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getRefresh_button());
		Thread.sleep(4000);
		jsclick(pojo.getNewDocuments_MenuOption());
		Thread.sleep(4000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		pojo.getFolderSelectMessage();
		Thread.sleep(3000);
		movingDoublecli(pojo.getSelect_Cabinet(), pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		pojo.getFolderSelectMessage();
		Thread.sleep(3000);
		movingDoublecli(pojo.getSelect_Drawer(), pojo.getSelect_Drawer());
		Thread.sleep(4000);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		pojo.getFolderSelectMessage();
		Thread.sleep(3000);
		movingDoublecli(pojo.getSelect_Folder(), pojo.getSelect_Folder());
		Thread.sleep(4000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Reporter.log("Select Folder message verified", true);
		Thread.sleep(4000);
	}

	@Test(priority = 2)
	public void Verify_Asterrisk_Field() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(4000);
		pojo.getReportvaluevalidationerror();
		Thread.sleep(4000);
		log.info("Asterisk filed verified");
	}

	@Test(priority = 3)
	public void Create_Emptypage_Document() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		pojo.getEnter_Report_Name_Text().sendKeys(pojo.Specialchar_excelRead(1, 0));
		Thread.sleep(4000);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(4000);
		pojo.getNavigateDoc();
		log.info("Empty page document Created successfully..");
		Thread.sleep(5000);
		jsclick(pojo.getRefresh_button());
	}
}
