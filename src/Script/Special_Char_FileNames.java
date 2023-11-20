package Script;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.Customcolumns;
import Pom.Logout;
import Pom.SpecialCharFilenames;

//Dipak Automation script
public class Special_Char_FileNames extends Generic.BaseClass {
	private static final Logger log = LogManager.getLogger(Special_Char_FileNames.class);

	//@BeforeClass
	public void LandBrowser() {

		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	//@Test
	public void Login_EWA() throws Exception {
		loginCVS();
		log.info("CVS User is logged in successfully...");

	}

	@Test(priority = 1)
	public void Upload_and_verify_Allowing_Percentage_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		//jsclick(Refresh_Button(driver));
		Thread.sleep(4000);
		//jsclick(pojo.getNewDocuments_MenuOption());
		Thread.sleep(4000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Cabinet(), pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Drawer(), pojo.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Folder(), pojo.getSelect_Folder());
		Thread.sleep(4000);
		Reporter.log("Folder is selected for Create New Documents", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		pojo.getEnter_Report_Name_Text().sendKeys(pojo.Specialchar_excelRead(1, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Percentage .exe");
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(4000);
		jsclick(pojo.getView_Button());
		Thread.sleep(4000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(4000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Reporter.log("Upload and verify Allowing Percentage Characterfile", true);
		Thread.sleep(4000);
		log.info("Upload and verify Allowing Percentage Characterfile");
	}

	@Test(priority = 2)
	public void Upload_and_verify_Allowing_Tile_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(2, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Tile.exe");
		jsclick(pojo.getOpen_Tile_page());
		Thread.sleep(4000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Tile Characterfile", true);
		log.info("Upload and verify Allowing Tile Characterfile");
	}

	@Test(priority = 3)
	public void Upload_and_verify_Allowing_Attherate_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(3, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\At the rate .exe");
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Attherate_page());
		Thread.sleep(4000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Attherate Characterfile", true);
		Thread.sleep(4000);
		log.info("Upload and verify Allowing Attherate Characterfile");

	}

	@Test(priority = 4)
	public void Upload_and_verify_Allowing_Hash_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(4, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hash .exe");
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Hash_page());
		Thread.sleep(4000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Hash Characterfile", true);
		Thread.sleep(4000);
		log.info("Upload and verify Allowing Hash Characterfile");

	}

	@Test(priority = 5)
	public void Upload_and_verify_Allowing_Dollar_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(5, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Dollar.exe");
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Dollar_page());
		Thread.sleep(4000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(8000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(8000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Dollar Characterfile", true);
		Thread.sleep(4000);
		log.info("Upload and verify Allowing Dollar Characterfile");

	}

	@Test(priority = 6)
	public void Upload_and_verify_Allowing_Plus_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(6, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Plus.exe");
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Plus_page());
		Thread.sleep(4000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Plus Characterfile", true);
		Thread.sleep(4000);
		log.info("Upload and verify Allowing Plus Characterfile");

	}

	@Test(priority = 7)
	public void Upload_and_verify_Allowing_Caret_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(7, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Caret.exe");
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Caret_page());
		Thread.sleep(4000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Caret Characterfile", true);
		Thread.sleep(4000);
		log.info("Upload and verify Allowing Caret Characterfile");

	}

	@Test(priority = 8)
	public void Upload_and_verify_Allowing_Equals_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(8, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Equals.exe");
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Equals_page());
		Thread.sleep(4000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Equals Characterfile", true);
		Thread.sleep(4000);
		log.info("Upload and verify Allowing Equals Characterfile");

	}

	@Test(priority = 9)
	public void Upload_and_verify_Allowing_SingleQuote_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(9, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Single Quote .exe");
		Thread.sleep(4000);
		jsclick(pojo.getOpen_SingleQuote_page());
		Thread.sleep(4000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing SingleQuote Characterfile", true);
		Thread.sleep(4000);
		log.info("Upload and verify Allowing SingleQuote Characterfile");

	}

	@Test(priority = 10)
	public void Upload_and_verify_Allowing_Comma_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(10, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Comma.exe");
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Comma_page());
		Thread.sleep(4000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Comma Characterfile", true);
		log.info("Upload and verify Allowing Comma Characterfile");
		Thread.sleep(4000);

	}

	@Test(priority = 11)
	public void Upload_and_verify_Allowing_Exclamatory_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(11, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Exclamatory.exe");
		Thread.sleep(4000);
		jsclick(pojo.getOpen_Exclamatory_page());
		Thread.sleep(4000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Exclamatory Characterfile", true);
		log.info("Upload and verify Allowing Exclamatory Characterfile");
		Thread.sleep(4000);

	}

	@Test(priority = 12)
	public void Upload_and_verify_Allowing_Hyphen_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(12, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hyphen.exe");

		Thread.sleep(4000);
		jsclick(pojo.getOpen_Exclamatory_page());
		Thread.sleep(4000);

		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Hyphen Characterfile", true);
		log.info("Upload and verify Allowing Hyphen Characterfile");

	}

	@Test(priority = 13)
	public void Upload_and_verify_Allowing_RoundBrackets_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(13, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Round Brackets.exe");

		Thread.sleep(4000);
		jsclick(pojo.getOpen_RoundBrackets_page());
		Thread.sleep(4000);

		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing RoundBrackets Characterfile", true);
		log.info("Upload and verify Allowing RoundBrackets Characterfile");

	}

	@Test(priority = 14)
	public void Upload_and_verify_Allowing_Accent_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(14, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Accent.exe");

		Thread.sleep(4000);
		jsclick(pojo.getOpen_Accent_page());
		Thread.sleep(4000);

		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Accent Characterfile", true);
		log.info("Upload and verify Allowing Accent Characterfile");
	}

	@Test(priority = 15)
	public void Upload_and_verify_Allowing_Ampersant_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(15, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Ampersant.exe");

		Thread.sleep(4000);
		jsclick(pojo.getOpen_Ampersant_page());
		Thread.sleep(4000);

		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Ampersant Characterfile", true);
		log.info("Upload and verify Allowing Ampersant Characterfile");
	}

	@Test(priority = 16)
	public void Upload_and_verify_Allowing_Underscore_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(16, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Underscore.exe");

		Thread.sleep(4000);
		jsclick(pojo.getOpen_Underscore_page());
		Thread.sleep(4000);

		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Underscore Characterfile", true);
		log.info("Upload and verify Allowing Underscore Characterfile");
	}

	@Test(priority = 17)
	public void Upload_and_verify_Allowing_Flowerbracket_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(17, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec(
				"D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Flower or Curly bracket .exe");

		Thread.sleep(4000);
		jsclick(pojo.getOpen_Flowerbracket_Page());
		Thread.sleep(4000);

		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Flowerbracket Characterfile", true);
		log.info("Upload and verify Allowing Flowerbracket Characterfile");
	}

	@Test(priority = 18)
	public void Upload_and_verify_Allowing_Squarebracket_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(18, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Square bracket.exe");

		Thread.sleep(4000);
		jsclick(pojo.getOpen_Squarebracket_page());
		Thread.sleep(4000);

		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Squarebracket Characterfile", true);
		log.info("Upload and verify Allowing Squarebracket Characterfile");
	}

	@Test(priority = 19)
	public void Upload_and_verify_Allowing_SemiColon_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(4000);
		pojo.getUpdate_ReportName().clear();
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(19, 0));
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Semi Colon.exe");

		Thread.sleep(4000);
		jsclick(pojo.getOpen_SemiColon_page());
		Thread.sleep(4000);

		pojo.getClick_FileInfo_Option();
		Thread.sleep(4000);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(4000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(4000);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(4000);
		jsclick(pojo.getProperties_option());
		Reporter.log("Upload and verify Allowing Semicolon Characterfile", true);
		log.info("Upload and verify Allowing Semicolon Characterfile");
		jsclick(Refresh_Button(driver));
	}

	
}
