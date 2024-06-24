package Script;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import Pom.SpecialCharFilenames;

//Dipak Automation script
public class Special_Char_FileNames extends Generic.BaseClass {

	@BeforeClass
	public void  Launch_Browser() throws Exception {

		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test
	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}

	@Test(priority = 1)
	public void TC_01_Upload_and_verify_Allowing_Percentage_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();

		Reporter.log("Test Scenario 1 : Upload and Verifying Allowing Percentage Characterfile", true);
		jsclick(pojo.getRefresh_button());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getNewDocuments_MenuOption());
		Thread.sleep(7000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(7000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(7000);
		Reporter.log("Folder is selected for Create New Documents", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(7000);
		Reporter.log("Select value from Document Type dropdown Option", true);
		pojo.getEnter_Report_Name_Text().sendKeys(pojo.Specialchar_excelRead(1, 0));
		Reporter.log("Enter Value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(3000);
		Reporter.log("Browse Document Page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Percentage .exe");
		Thread.sleep(7000);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getView_Button());
		Thread.sleep(7000);
		Reporter.log("Click on View button", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Percentage Characterfile", true);

	}

	@Test(priority = 2)
	public void TC_02_Upload_and_verify_Allowing_Tile_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(10000);
		Reporter.log("Test Scenario 2 : Upload and Verifying Allowing Tile Characterfile", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(2, 0));
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(3000);
		Reporter.log("Browse Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Tile.exe");
		Thread.sleep(12000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Tile_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on  Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Tile Characterfile", true);

	}

	@Test(priority = 3)
	public void TC_03_Upload_and_verify_Allowing_Atrate_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 3  Upload and Verifying Allowing Atrate Characterfile", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(3, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\At the rate .exe");
		Thread.sleep(12000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Attherate_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Atrate Characterfile", true);
		Thread.sleep(7000);

	}

	@Test(priority = 4)
	public void TC_04_Upload_and_verify_Allowing_Hash_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 4 :Upload and Verifying Allowing Hash Characterfile ", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(4, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hash .exe");
		Thread.sleep(12000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Hash_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Hash Characterfile", true);

	}

	@Test(priority = 5)
	public void TC_05_Upload_and_verify_Allowing_Dollar_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 5 :Upload and Verifying Allowing Dollar Characterfile", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(5, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Dollar.exe");
		Thread.sleep(12000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Dollar_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Dollar Characterfile", true);

	}

	@Test(priority = 6)
	public void TC_06_Upload_and_verify_Allowing_Plus_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 6 :Upload and Verifying Allowing Plus Characterfile", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(6, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Plus.exe");
		Thread.sleep(12000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Plus_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Plus Characterfile", true);
		Thread.sleep(7000);

	}

	@Test(priority = 7)
	public void TC_07_pload_and_verify_Allowing_Caret_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 7 : Upload and Verifying Allowing Caret Characterfile", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(7, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Caret.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Caret_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Caret Characterfile", true);

	}

	@Test(priority = 8)
	public void TC_08_Upload_and_verify_Allowing_Equals_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 8 :Upload and Verifying Allowing Equals Characterfile ", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(8, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Equals.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Equals_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Equals Characterfile", true);

	}

	@Test(priority = 9)
	public void TC_09_Upload_and_verify_Allowing_SingleQuote_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 9 :Upload and Verifying Allowing SingleQuote Characterfile ", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(9, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Single Quote .exe");
		Thread.sleep(14000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_SingleQuote_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing SingleQuote Characterfile", true);

	}

	@Test(priority = 10)
	public void TC_10_Upload_and_verify_Allowing_Comma_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 10 :Upload and Verifying Allowing Comma Characterfile", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(10, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Comma.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Comma_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Comma Characterfile", true);

	}

	@Test(priority = 11)
	public void TC_11_Upload_and_verify_Allowing_Exclamatory_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 11 :Upload and Verifying Allowing Exclamatory Characterfile ", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(11, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Exclamatory.exe");
		Thread.sleep(20000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Exclamatory_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Exclamatory Characterfile", true);

	}

	@Test(priority = 12)
	public void TC_12_Upload_and_verify_Allowing_Hyphen_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 12 :Upload and Verifying Allowing Hyphen Characterfile ", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(12, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hyphen.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Hyphen_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Hyphen Characterfile", true);

	}

	@Test(priority = 13)
	public void TC_13_Upload_and_verify_Allowing_RoundBrackets_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 13 :Upload and Verifying Allowing RoundBrackets Characterfile", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(13, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Round Brackets.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_RoundBrackets_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing RoundBrackets Characterfile", true);

	}

	@Test(priority = 14)
	public void TC_14_Upload_and_verify_Allowing_Accent_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 14 : Upload and Verifying Allowing Accent Characterfile", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(14, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Accent.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Accent_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Accent Characterfile", true);

	}

	@Test(priority = 15)
	public void TC_15_Upload_and_verify_Allowing_Ampersant_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 15 :Upload and Verifying Allowing Ampersant Characterfile ", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(15, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Ampersant.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Ampersant_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		Thread.sleep(7000);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Ampersant Characterfile", true);

	}

	@Test(priority = 16)
	public void TC_16_Upload_and_verify_Allowing_Underscore_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 16 :Upload and Verifying Allowing Underscore Characterfile", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(16, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Underscore.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Underscore_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Underscore Characterfile", true);

	}

	@Test(priority = 17)
	public void TC_17_Upload_and_verify_Allowing_Flowerbracket_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 17 : Upload and Verifying Allowing Flowerbracket Characterfile", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(17, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec(
				"D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Flower or Curly bracket .exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Flowerbracket_Page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Flowerbracket Characterfile", true);

	}

	@Test(priority = 18)
	public void TC_18_Upload_and_verify_Allowing_Squarebracket_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 18 : Upload and Verifying Allowing Squarebracket Characterfile ", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(18, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Square bracket.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_Squarebracket_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Squarebracket Characterfile", true);

	}

	@Test(priority = 19)
	public void TC_19_Upload_and_verify_Allowing_SemiColon_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Thread.sleep(7000);
		Reporter.log("Test Scenario 19 :Upload and Verifying Allowing SemiColon Characterfile ", true);
		jsclick(pojo.getUpdate_Button());
		Thread.sleep(10000);
		Reporter.log("Click on Update button", true);
		pojo.getUpdate_ReportName().clear();
		Reporter.log("Clear Report Name", true);
		pojo.getUpdate_ReportName().sendKeys(pojo.Specialchar_excelRead(19, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Semi Colon.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(pojo.getOpen_SemiColon_page());
		Thread.sleep(7000);
		Reporter.log("Select Uploaded Page", true);
		pojo.getClick_FileInfo_Option();
		Thread.sleep(7000);
		Reporter.log("Click on File Info Menu option", true);
		pojo.getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(7000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(7000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getSave_UpdateButton());
		Thread.sleep(7000);
		Reporter.log("Click on Update Save button", true);
		jsclick(pojo.getUpdate_Ok_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getProperties_option());
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Semicolon Characterfile", true);
		Thread.sleep(7000);
		driver.close();
		Reporter.log("Close the Application", true);
	}
}
