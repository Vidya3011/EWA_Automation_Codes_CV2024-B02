package Computhink.Pom;

//Dipak Automation Coading

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SpecialCharFilenames extends Computhink.Generic.BaseClass {

	public static WebElement element = null;

	public SpecialCharFilenames() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle\"]")
	private WebElement Cancel_Button_BrowseforFolder;

	@FindBy(xpath = ("//*[@id=\"createDocument\"]"))
	private WebElement NewDocuments_MenuOption;

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	// Select from Destination folder Location

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder1;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"docTypeList\"]")
	private WebElement Click_Document_Type_Dropdown;

	@FindBy(xpath = "//*[@serialno=\"2\"]/div/img")
	private WebElement Open_Tile_page;

	@FindBy(xpath = "//*[@serialno=\"3\"]/div/img")
	private WebElement Open_Attherate_page;

	@FindBy(xpath = "//*[@serialno=\"4\"]/div/img")
	private WebElement Open_Hash_page;

	@FindBy(xpath = "//*[@serialno=\"5\"]/div/img")
	private WebElement Open_Dollar_page;

	@FindBy(xpath = "//*[@serialno=\"6\"]/div/img")
	private WebElement Open_Plus_page;

	@FindBy(xpath = "//*[@serialno=\"7\"]/div/img")
	private WebElement Open_Caret_page;

	@FindBy(xpath = "//*[@serialno=\"8\"]/div/img")
	private WebElement Open_Equals_page;

	@FindBy(xpath = "//*[@serialno=\"9\"]/div/img")
	private WebElement Open_SingleQuote_page;

	@FindBy(xpath = "//*[@serialno=\"10\"]/div/img")
	private WebElement Open_Comma_page;

	@FindBy(xpath = "//*[@serialno=\"11\"]/div/img")
	private WebElement Open_Exclamatory_page;

	@FindBy(xpath = "//*[@serialno=\"12\"]/div/img")
	private WebElement Open_Hyphen_page;

	@FindBy(xpath = "//*[@id=\"commentMessage\"]")
	private WebElement FolderSelectMessage;

	@FindBy(xpath = "//*[@id=\"CommentsMessageModelOk\"]")
	private WebElement CommentOK;

	@FindBy(xpath = "//*[@id=\"createDocumentMessage\"]")
	private WebElement NavigateDoc;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement NavigateButton;

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Reportvaluevalidationerror;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement CommentOKbutton;

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_Report_Name_Text;

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
	private WebElement Browse_Option;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Create_Button;

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement View_Button;

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement Save_button;

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement DocumentSave_Ok_button;

	@FindBy(xpath = "(//a[normalize-space()='Update'])[1]")
	private WebElement Update_Button;

	@FindBy(xpath = "//*[@id=\"Val_33\"]")
	private WebElement Update_ReportName;

	@FindBy(xpath = "(//a[normalize-space()='Save'])[1]")
	private WebElement Save_UpdateButton;

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement Update_Ok_button;

	@FindBy(xpath = "//*[@id=\"properties\"]/div/div[1]")
	private WebElement Properties_option;

	@FindBy(xpath = "//*[@serialno=\"13\"]/div/img")
	private WebElement Open_RoundBrackets_page;

	@FindBy(xpath = "//*[@serialno=\"14\"]/div/img")
	private WebElement Open_Accent_page;

	@FindBy(xpath = "//*[@serialno=\"15\"]/div/img")
	private WebElement Open_Ampersant_page;

	@FindBy(xpath = "//*[@serialno=\"16\"]/div/img")
	private WebElement Open_Underscore_page;

	@FindBy(xpath = "//*[@serialno=\"17\"]/div/img")
	private WebElement Open_Flowerbracket_Page;

	@FindBy(xpath = "//*[@serialno=\"18\"]/div/img")
	private WebElement Open_Squarebracket_page;

	@FindBy(xpath = "//*[@serialno=\"19\"]/div/img")
	private WebElement Open_SemiColon_page;

	@FindBy(xpath = "//*[@id=\"fileInfoButton\"]/span")
	private WebElement Click_FileInfo_Option;

	@FindBy(xpath = "//*[@id=\"fileNameLabel\"]")
	private WebElement Click_FileInfo_OkButton_withFileName;

	@FindBy(xpath = "//*[@id=\"fileRenameOK\"]")
	private WebElement RemarkOk;

	public void getClick_FileInfo_Option() {
		jsclick(Click_FileInfo_Option);
	}

	public WebElement getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;
	}

	public WebElement getMove_To_PlusIcon() {
		WebElement ele = Move_To_PlusIcon;
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		return ele;
	}

	public WebElement getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	public void getClick_FileInfo_OkButton_withFileName() {
		WebElement Filename = Click_FileInfo_OkButton_withFileName;
		Reporter.log("File name is:" + Filename.getText() + "this message should show", true);
		WebElement ele = RemarkOk;
		ele.click();
	}

	public void getFolderSelectMessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please select a folder to create document";
		String actualtext = FolderSelectMessage.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(FolderSelectMessage.getText() + "this validation message should show", true);
		jsclick(CommentOK);
	}

	public void getReportvaluevalidationerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "ReportName*  	field is required";
		String actualtext = Reportvaluevalidationerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(Reportvaluevalidationerror.getText() + "this validation message should show", true);
		jsclick(CommentOKbutton);
	}

	public void getNavigateDoc() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Document created successfully";
		String actualtext = NavigateDoc.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(NavigateDoc.getText() + "this message should show", true);
		jsclick(NavigateButton);
	}

	public void Upload_and_verify_Allowing_Percentage_Characterfile() throws Exception {

		Reporter.log("Test Scenario 1 : Upload and Verifying Allowing Percentage Characterfile", true);
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
			Refresh_Button();
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(NewDocuments_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("Folder is selected for Create New Documents", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(getSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select value from Document Type dropdown Option", true);
		Enter_Report_Name_Text.sendKeys(Specialchar_excelRead(1, 0));
		Reporter.log("Enter Value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(3000);
		Reporter.log("Browse Document Page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Percentage .exe");
		Thread.sleep(6000);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("By using AutoIT add file from external folder", true);
		movingclkElement(Create_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(View_Button);
		Thread.sleep(6000);
		Reporter.log("Click on View button", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Percentage Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Tile_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 2 : Upload and Verifying Allowing Tile Characterfile", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(2, 0));
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(getMove_To_PlusIcon()));
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(3000);
		Reporter.log("Browse Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Tile.exe");
		Thread.sleep(12000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Tile_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on  Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Tile Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Atrate_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 3  Upload and Verifying Allowing Atrate Characterfile", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(3, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\At the rate .exe");
		Thread.sleep(12000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Attherate_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Atrate Characterfile", true);
		Thread.sleep(6000);

	}

	public void Upload_and_verify_Allowing_Hash_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 4 :Upload and Verifying Allowing Hash Characterfile ", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(4, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hash .exe");
		Thread.sleep(12000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Hash_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Hash Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Dollar_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 5 :Upload and Verifying Allowing Dollar Characterfile", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(5, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Dollar.exe");
		Thread.sleep(12000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Dollar_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Dollar Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Plus_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 6 :Upload and Verifying Allowing Plus Characterfile", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(6, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Plus.exe");
		Thread.sleep(12000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Plus_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Plus Characterfile", true);
		Thread.sleep(6000);

	}

	public void Upload_and_verify_Allowing_Caret_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 7 : Upload and Verifying Allowing Caret Characterfile", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(7, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Caret.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Caret_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Caret Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Equals_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 8 :Upload and Verifying Allowing Equals Characterfile ", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(8, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Equals.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Equals_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Equals Characterfile", true);

	}

	public void Upload_and_verify_Allowing_SingleQuote_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 9 :Upload and Verifying Allowing SingleQuote Characterfile ", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(9, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Single Quote .exe");
		Thread.sleep(14000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_SingleQuote_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing SingleQuote Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Comma_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 10 :Upload and Verifying Allowing Comma Characterfile", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(10, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Comma.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Comma_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Comma Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Exclamatory_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 11 :Upload and Verifying Allowing Exclamatory Characterfile ", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(11, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Exclamatory.exe");
		Thread.sleep(20000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Exclamatory_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Exclamatory Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Hyphen_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 12 :Upload and Verifying Allowing Hyphen Characterfile ", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(12, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hyphen.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Hyphen_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Hyphen Characterfile", true);

	}

	public void Upload_and_verify_Allowing_RoundBrackets_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 13 :Upload and Verifying Allowing RoundBrackets Characterfile", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(13, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Round Brackets.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_RoundBrackets_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing RoundBrackets Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Accent_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 14 : Upload and Verifying Allowing Accent Characterfile", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(14, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Accent.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Accent_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Accent Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Ampersant_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 15 :Upload and Verifying Allowing Ampersant Characterfile ", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(15, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Ampersant.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Ampersant_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		Thread.sleep(6000);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Ampersant Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Underscore_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 16 :Upload and Verifying Allowing Underscore Characterfile", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(16, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(3000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Underscore.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Underscore_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Underscore Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Flowerbracket_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 17 : Upload and Verifying Allowing Flowerbracket Characterfile", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(17, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime().exec(
				"D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Flower or Curly bracket .exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Flowerbracket_Page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Flowerbracket Characterfile", true);

	}

	public void Upload_and_verify_Allowing_Squarebracket_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 18 : Upload and Verifying Allowing Squarebracket Characterfile ", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(18, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Square bracket.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_Squarebracket_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Squarebracket Characterfile", true);

	}

	public void Upload_and_verify_Allowing_SemiColon_Characterfile() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Reporter.log("Test Scenario 19 :Upload and Verifying Allowing SemiColon Characterfile ", true);
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name", true);
		Update_ReportName.sendKeys(Specialchar_excelRead(19, 0));
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		getMove_To_PlusIcon();
		getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse Document page", true);
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Semi Colon.exe");
		Thread.sleep(15000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Open_SemiColon_page);
		Thread.sleep(6000);
		Reporter.log("Select Uploaded Page", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Menu option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Verifying File Name and Click on  Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Properties_option);
		Reporter.log("Click on Properties Option from Document Viewer menu", true);
		Reporter.log("Upload and Verifying Allowing Semicolon Characterfile", true);
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	public void Verify_Destination_Folder() throws Exception {

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Reporter.log("Test Scenario 1 : Verifying Destination Folder ", true);
		Thread.sleep(8000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(NewDocuments_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder Textbox", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getFolderSelectMessage();
		Thread.sleep(6000);
		Reporter.log("Verifying Validation Message", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getFolderSelectMessage();
		Thread.sleep(6000);
		Reporter.log("Verifying Validation message", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		getFolderSelectMessage();
		Thread.sleep(6000);
		Reporter.log("Verifying Validation message", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("Folder is selected for Templates", true);
		jsclick(OK_Button_BrowseforFolder);
		Reporter.log("Select Folder message verified", true);
		Thread.sleep(6000);
	}

	public void Verify_Asterrisk_Field() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying Asterrisk Field ", true);
		Thread.sleep(6000);
		jsclick(getSelect_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select value from Document type dropdown", true);
		jsclick(Create_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		getReportvaluevalidationerror();
		Thread.sleep(6000);
		Reporter.log("Verifi validation message", true);
		Reporter.log("Asterisk field verified", true);
	}

	public void Create_Emptypage_Document() throws Exception {

		Reporter.log("Test Scenario 3 : Create Empty page Document ", true);
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Enter_Report_Name_Text.sendKeys(Specialchar_excelRead(1, 0));
		Thread.sleep(6000);
		Reporter.log("Enter value into Report Name field", true);
		jsclick(Create_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		getNavigateDoc();
		Reporter.log("Click on Navigate button", true);
		Reporter.log("Empty page document Created successfully", true);
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

}
