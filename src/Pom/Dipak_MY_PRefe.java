package Pom;

//Dipak Automation Pom
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Generic.BaseClass;

public class Dipak_MY_PRefe extends BaseClass {

	public static WebElement element = null;
	private static final boolean False = false;

	public Dipak_MY_PRefe() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "imgSettings")
	private WebElement Setting_Icon;

	public WebElement getSetting_Icon() {
		return Setting_Icon;
	}

	@FindBy(css = "#myPreferencesSettingsNav > p")
	private WebElement My_Preferencesetting;

	public WebElement getMy_Preferencesetting() {
		return My_Preferencesetting;
	}

	@FindBy(xpath = "//button[@id='myPreferencesSubmit']")
	private WebElement Apply_button;

	public WebElement getApply_button() {
		return Apply_button;
	}

	@FindBy(id = "defaultViewListNo")
	private WebElement Click_Dropdown_DefaultViewing;

	public WebElement getClick_Dropdown_DefaultViewing() {
		Click_Dropdown_DefaultViewing.click();
		return Click_Dropdown_DefaultViewing;
	}

	@FindBy(id = "defaultViewListNo")
	private WebElement Select_Dropdown_Convert_To_PDF;

	public void getSelect_Dropdown_Convert_To_PDF() {
		Select sel = new Select(Select_Dropdown_Convert_To_PDF);
		sel.selectByVisibleText("Convert To PDF");

	}

	@FindBy(xpath = "//a[@id='advSearchMenuBtn']")
	private WebElement Click_Search_Option;

	public WebElement getClick_Search_Option() {
		return Click_Search_Option;
	}

	@FindBy(id = "indexPhrase1")
	private WebElement Enter_Document_Name;

	public void getEnter_Document_Name() throws Exception {
		Enter_Document_Name.click();
		Enter_Document_Name.sendKeys(MyPreferences_excelRead(0, 1));

	}

	@FindBy(id = "advFindBtnLabel")
	private WebElement Find_Button;

	public WebElement getFind_Button() {
		return Find_Button;
	}

	@FindBy(xpath = "//td[contains(text(),'My_Pereferences_Test_Doc')]")
	private WebElement Select_Document;

	public void getSelect_Document() {
		Select_Document.click();

	}

	@FindBy(id = "pageNumber")
	private WebElement Search_Page_Number;

	public void getSearch_Page_Number() throws InterruptedException, IOException {
		Search_Page_Number.click();
		Thread.sleep(4000);
		Search_Page_Number.clear();
		Search_Page_Number.sendKeys(excelRead(7, 1));
		Thread.sleep(4000);
		Search_Page_Number.sendKeys(Keys.ENTER);

	}

	@FindBy(id = "defaultViewListNo")
	private WebElement Select_Dropdown_Native_Format;

	public void getSelect_Dropdown_Native_Format() {
		Select sel = new Select(Select_Dropdown_Native_Format);
		sel.selectByVisibleText("Native Format");

	}

	@FindBy(xpath = "//select[@id='viewerZoomId']")
	private WebElement Select_Dropdown_Fit_To_Width;

	public void getSelect_Dropdown_Fit_To_Width() {
		Select sel = new Select(Select_Dropdown_Fit_To_Width);
		sel.selectByVisibleText("Fit To Width");

	}

	@FindBy(xpath = "//select[@id='viewerZoomId']")
	private WebElement Select_Dropdown_Fit_To_Height;

	public void getSelect_Dropdown_Fit_To_Height() {
		Select sel = new Select(Select_Dropdown_Fit_To_Height);
		sel.selectByVisibleText("Fit To Height");

	}

	@FindBy(xpath = "//select[@id='viewerZoomId']")
	private WebElement Select_Dropdown_Fit_Entire_Image;

	public void getSelect_Dropdown_Fit_Entire_Image() {
		Select sel = new Select(Select_Dropdown_Fit_Entire_Image);
		sel.selectByVisibleText("Fit Entire Image");

	}

	@FindBy(xpath = "//select[@id='viewerZoomId']")
	private WebElement Select_Dropdown_Actual_Size;

	public void getSelect_Dropdown_Actual_Size() {
		Select sel = new Select(Select_Dropdown_Actual_Size);
		sel.selectByVisibleText("Actual Size");

	}

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Defaultviewing;

	public void getSelect_Office_document_Defaultviewing() {
		Select sel = new Select(Select_Office_document_Defaultviewing);
		sel.selectByVisibleText("Default viewing");

	}

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Advancedviewing;

	public void getSelect_Office_document_Advancedviewing() {
		Select sel = new Select(Select_Office_document_Advancedviewing);
		sel.selectByVisibleText("Advanced viewing");

	}

	@FindBy(xpath = "//a[@id='createDocument']")
	private WebElement Click_New_Document;

	public WebElement getClick_New_Document() {
		return Click_New_Document;
	}

	@FindBy(xpath = "//input[@id='createDocuemtnLocation']")
	private WebElement Destination_Folder_Textbox;

	public WebElement getDestination_Folder_Textbox() {
		return Destination_Folder_Textbox;
	}

	// Select From Document Navigator

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	public WebElement getSelect_Cabinet() {
		return Select_Cabinet;
	}

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	public WebElement getSelect_Drawer() {
		return Select_Drawer;
	}

	@FindBy(xpath = "//a[text()='Dipak Automation']")
	private WebElement Select_Folder;

	public WebElement getSelect_Folder() {
		return Select_Folder;
	}

	@FindBy(xpath = "//a[text()='Dipak Automation subfolder']")
	private WebElement Select_subFolder;

	public WebElement getSelect_subFolder() {
		return Select_subFolder;
	}
	// Select from Destination folder Location

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet1;

	public WebElement getSelect_Cabinet1() {
		return Select_Cabinet1;

	}

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer1;

	public WebElement getSelect_Drawer1() {
		return Select_Drawer1;

	}

	@FindBy(xpath = ("//a[text()='Dipak Automation']"))
	private WebElement Select_Folder1;

	public WebElement getSelect_Folder1() {
		return Select_Folder1;

	}

	@FindBy(xpath = "//button[@id='navigatorTreeOk']")
	private WebElement OK_Button_BrowseforFolder;

	public WebElement getOK_Button_BrowseforFolder() {
		return OK_Button_BrowseforFolder;
	}

	@FindBy(id = "docTypeList")
	private WebElement Click_Document_Type_Dropdown;

	public void getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");

	}

	@FindBy(xpath = "/html[1]/body[1]/div[58]/div[64]/div[5]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportName;

	public void getEnter_ReportName() throws Exception {
		WebElement ele = Enter_ReportName;
		ele.click();
		ele.sendKeys("NewDocumentCreate");

	}

	@FindBy(xpath = "//div[@id='addPagesDropDown']//span[1]")
	private WebElement Move_To_PlusIcon;

	public WebElement getMove_To_PlusIcon() {
		WebElement ele = Move_To_PlusIcon;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return ele;
	}

	@FindBy(id = "viewDocumentAddPages")
	private WebElement Browse_Option;

	public WebElement getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	// New Word Document

	@FindBy(linkText = "New Word Document")
	private WebElement New_Word_Document_Option;

	public void getNew_Word_Document_Option() {
		WebElement ele1 = New_Word_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(id = "newTemplateFileName")
	private WebElement Enter_Word_File_Name;
	@FindBy(id = "templateOK")
	private WebElement TemplateOK;

	public void getEnter_Word_File_Name() throws Exception {
		WebElement ele = Enter_Word_File_Name;
		ele.sendKeys(MyPreferences_excelRead(2, 1));
		TemplateOK.click();

	}

	// New Excel Spreadsheet

	@FindBy(linkText = "New Excel Spreadsheet")
	private WebElement New_Excel_Spreadsheet_Option;

	public void getNew_Excel_Spreadsheet_Option() {
		WebElement ele1 = New_Excel_Spreadsheet_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(id = "newTemplateFileName")
	private WebElement Enter_Excel_File_Name;

	public void getEnter_Excel_File_Name() throws Exception {
		WebElement ele1 = Enter_Excel_File_Name;
		ele1.sendKeys(MyPreferences_excelRead(3, 1));
		TemplateOK.click();

	}

	@FindBy(xpath = "//button[@id='createDocumentSubmit']")
	private WebElement Create_button;

	public WebElement getCreate_button() {
		return Create_button;
	}

	@FindBy(id = "modelHome")
	private WebElement Navigate_button;

	public WebElement getNavigate_button() {
		return Navigate_button;
	}

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Advancedviewing;

	public void getPdf_document_Advancedviewing() {
		Select drop = new Select(Pdf_document_Advancedviewing);
		drop.selectByVisibleText("Advanced viewing");

	}

	@FindBy(linkText = "New Pdf Document")
	private WebElement New_pdf_Document_Option;

	public void getNew_pdf_Document_Option() {
		WebElement ele1 = New_pdf_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(id = "newTemplateFileName")
	private WebElement Enter_pdf_File_Name;

	public void getEnter_pdf_File_Name() throws Exception {
		WebElement ele1 = Enter_pdf_File_Name;
		ele1.sendKeys(MyPreferences_excelRead(5, 1));
		driver.findElement(By.id("templateOK")).click();

	}

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Defaultviewing;

	public void getPdf_document_Defaultviewing() throws Exception {
		Select sel = new Select(Pdf_document_Defaultviewing);
		sel.selectByVisibleText("Default viewing");

	}

	// Datadriven My preference

	public static String MyPreferences_excelRead(int rowNo, int cellNo) throws Exception {
		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet s = wb.getSheet("MyPreferences");
			XSSFRow row = s.getRow(rowNo);
			XSSFCell cll = row.getCell(cellNo);
			String cellType = cll.getStringCellValue();
			return cellType;
		}
	}

	@FindBy(xpath = "/html[1]/body[1]/div[58]/div[64]/div[5]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportNameDefaultview;

	public void getEnter_ReportNameDefaultview() throws Exception {
		WebElement ele = Enter_ReportNameDefaultview;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(4, 1));

	}

	@FindBy(xpath = "//*[@id=\"Word document automation.docx\"]/div/img")
	private WebElement Open_Word_page;

	public WebElement getOpen_Word_page() throws Exception {
		return Open_Word_page;
	}

	@FindBy(xpath = "//*[@id=\"Excel document automation.xlsx\"]/div/img")
	private WebElement Open_Excel_page;

	public WebElement getOpen_Excel_page() throws Exception {
		return Open_Excel_page;
	}

	@FindBy(xpath = "//*[@id=\"PDF document automation.pdf\"]/div/img")
	private WebElement Open_pdf_page;

	public WebElement getOpen_pdf_page() throws Exception {
		return Open_pdf_page;
	}

	// My preference Date Format

	@FindBy(xpath = "//select[@id='dateformatid']")
	private WebElement YYYY_MM_DD_DateFormat;

	public void getYYYY_MM_DD_DateFormat() throws Exception {
		Select sel = new Select(YYYY_MM_DD_DateFormat);
		sel.selectByVisibleText("YYYY-MM-DD");

	}

	@FindBy(xpath = "//select[@id='dateformatid']")
	private WebElement DD_MM_YYYY_DateFormat;

	public void getDD_MM_YYYY_DateFormat() throws Exception {
		Select sel = new Select(DD_MM_YYYY_DateFormat);
		sel.selectByVisibleText("DD-MM-YYYY");

	}

	@FindBy(xpath = "//select[@id='dateformatid']")
	private WebElement MM_DD_YYYY_DateFormat;

	public void getMM_DD_YYYY_DateFormat() throws Exception {
		Select sel = new Select(MM_DD_YYYY_DateFormat);
		sel.selectByVisibleText("MM-DD-YYYY");

	}

	@FindBy(xpath = "//select[@id='dateformatid']")
	private WebElement Default_DateFormat;

	public void getDefault_DateFormat() throws Exception {
		Select sel = new Select(Default_DateFormat);
		sel.selectByVisibleText("Default");

	}

	public void Verify_YYYY_MM_DD_Date() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String currentDate = sdf.format(d);
		System.out.println("Current CREATED ON Date Format is :" + currentDate);

	}

	public void Verify_DD_MM_YYYY_Date() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String currentDate = sdf.format(d);
		System.out.println("Current CREATED ON Date is :" + currentDate);

	}

	public void Verify_MM_DD_YYYY_Date() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String currentDate = sdf.format(d);
		System.out.println("Current CREATED ON Date is :" + currentDate);

	}

	public void Verify_Default_Date() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentDateTime = sdf.format(d);
		System.out.println("Current CREATED ON Date is :" + currentDateTime);

	}

	// PDF with Overlay

	@FindBy(xpath = "//select[@id='pdfWithOverlayOption']")
	private WebElement Select_PDF_with_Overlay_Disable;

	public void getSelect_PDF_with_Overlay_Disable() throws Exception {
		Select sel = new Select(Select_PDF_with_Overlay_Disable);
		sel.selectByVisibleText("Disable");

	}

	@FindBy(xpath = "/html[1]/body[1]/div[58]/div[64]/div[5]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportNamePDFwithOverlay;

	public void getEnter_ReportNamePDFwithOverlay() throws Exception {
		WebElement ele = Enter_ReportNamePDFwithOverlay;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(7, 1));

	}

	@FindBy(xpath = "//div[@id='showView']//span[1]")
	private WebElement Move_to_ViewMenu_Option_inViewer;

	public void getMove_to_ViewMenu_Option_inViewer() throws Exception {
		WebElement ele = Move_to_ViewMenu_Option_inViewer;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

	}

	@FindBy(css = "#pdfOverlayOption > .text")
	private WebElement Verify_PDF_with_Overlay_option;

	public void getVerify_PDF_with_Overlay_option() throws Exception {
		Boolean ele = Verify_PDF_with_Overlay_option.isDisplayed();
		if (ele) {
			System.out.println(" PDF with Overlay is Enable");
		} else {
			System.out.println(" PDF with Overlay is Disable");
		}

	}

	@FindBy(xpath = "//select[@id='pdfWithOverlayOption']")
	private WebElement Select_PDF_with_Overlay_Enable;

	public void getSelect_PDF_with_Overlay_Enable() throws Exception {
		Select sel = new Select(Select_PDF_with_Overlay_Enable);
		sel.selectByVisibleText("Enable");

	}

	@FindBy(css = "#pdfOverlayOption > .text")
	private WebElement Click_PDF_with_Overlay_option;

	public WebElement getClick_PDF_with_Overlay_option() throws Exception {
		return Click_PDF_with_Overlay_option;
	}

	@FindBy(xpath = "//button[@id='messageButtonNo27']")
	private WebElement No_option;

	public WebElement getNo_option() throws Exception {
		return No_option;
	}

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document;

	public WebElement getOpen_Document() throws Exception {
		return Open_Document;
	}

	// Quick Find

	@FindBy(xpath = "//select[@id='quickFindListNo']")
	private WebElement Select_QuickFind_DocIdSearch;

	public void getSelect_QuickFind_DocIdSearch() throws Exception {
		Select sel = new Select(Select_QuickFind_DocIdSearch);
		sel.selectByVisibleText("Doc Id Search");

	}

	@FindBy(xpath = "//select[@id='quickFindListNo']")
	private WebElement Select_QuickFind_TextSearch;

	public void getSelect_QuickFind_TextSearch() throws Exception {
		Select sel = new Select(Select_QuickFind_TextSearch);
		sel.selectByVisibleText("Text search");

	}

	@FindBy(xpath = "//select[@id='quickFindListNo']")
	private WebElement Select_QuickFind_IndexSearch;

	public void getSelect_QuickFind_IndexSearch() throws Exception {
		Select sel = new Select(Select_QuickFind_IndexSearch);
		sel.selectByVisibleText("Index search");

	}

	@FindBy(xpath = "//select[@id='quickFindListNo']")
	private WebElement Select_QuickFind_Both;

	public void getSelect_QuickFind_Both() throws Exception {
		Select sel = new Select(Select_QuickFind_Both);
		sel.selectByVisibleText("Both");

	}

	@FindBy(xpath = "//input[@id='search-text']")
	private WebElement Enter_Doc_Id_InSearch;

	public void getEnter_Doc_Id_InSearch() throws Exception {
		WebElement ele = (Enter_Doc_Id_InSearch);
		ele.click();
		Thread.sleep(4000);
		ele.sendKeys(excelRead(8, 1));
		Thread.sleep(4000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(4000);

	}

	@FindBy(xpath = "//span[normalize-space()='General']")
	private WebElement Click_general_option;

	public WebElement getClick_general_option() throws Exception {
		return Click_general_option;
	}

	@FindBy(xpath = "//td[normalize-space()='78304']")
	private WebElement Verify_Doc_Id;

	public void getVerify_Doc_Id() throws Exception {
		WebElement DocId = Verify_Doc_Id;
		System.out.println("DocId Number is:" + DocId.getText());

	}

	@FindBy(xpath = "//input[@id='search-text']")
	private WebElement Enter_Text_InSearch;

	public void getEnter_Text_InSearch() throws Exception {
		WebElement ele = Enter_Text_InSearch;
		ele.click();
		ele.clear();
		Thread.sleep(4000);
		ele.sendKeys(MyPreferences_excelRead(9, 1));
		Thread.sleep(4000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(4000);

	}

	@FindBy(xpath = "//input[@id='search-text']")
	private WebElement Enter_IndexValue_InSearch;

	public void getEnter_IndexValue_InSearch() throws Exception {
		WebElement ele = Enter_IndexValue_InSearch;
		ele.click();
		ele.clear();
		Thread.sleep(4000);
		ele.sendKeys(MyPreferences_excelRead(10, 1));
		Thread.sleep(4000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(4000);

	}

	@FindBy(xpath = "//input[@id='search-text']")
	private WebElement Enter_BothValue_InSearch;

	public void getEnter_BothValue_InSearch() throws Exception {
		WebElement ele = Enter_BothValue_InSearch;
		ele.click();
		ele.clear();
		Thread.sleep(4000);
		ele.sendKeys(MyPreferences_excelRead(10, 1));
		Thread.sleep(4000);
		ele.sendKeys(Keys.ENTER);

	}

	// Redaction View Password

	@FindBy(xpath = "/html[1]/body[1]/div[58]/div[64]/div[5]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportName_RedactionPassword;

	public void getEnter_ReportName_RedactionPassword() throws Exception {
		WebElement ele = Enter_ReportName_RedactionPassword;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(12, 1));

	}

	@FindBy(css = ".annotationRoot")
	private WebElement Move_to_Annotation_Option_inViewer;

	public void getMove_to_Annotation_Option_inViewer() throws Exception {
		WebElement ele = Move_to_Annotation_Option_inViewer;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

	}

	@FindBy(css = "#lockenable1 > .text")
	private WebElement Redaction_Option;

	public void getRedaction_Option() throws Exception {
		WebElement ele1 = Redaction_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(css = "#imageViewerDiv .lt-imageviewer-eventcanvas")
	private WebElement Set_Redaction_ToDocument;
	@FindBy(id = "objectName")
	private WebElement objectname;
	@FindBy(id = "dlgInput_Input")
	private WebElement input;
	@FindBy(id = "objectConfirmPassword")
	private WebElement confirmpassword;
	@FindBy(xpath = "//*[@id=\"dlgInput_Apply\"]")
	private WebElement Apply;

	public void getSet_Redaction_ToDocument() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Set_Redaction_ToDocument;
		action.dragAndDropBy(element, 400, 150).build().perform();
		jsclick(Set_Redaction_ToDocument);
		Thread.sleep(3000);
		objectname.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(3000);
		jsclick(input);
		Thread.sleep(2000);
		input.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(2000);
		jsclick(confirmpassword);
		Thread.sleep(2000);
		confirmpassword.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(3000);
		jsclick(Apply);

	}

	@FindBy(id = "redactionPwd")
	private WebElement Enter_RedactionPassword_MyPreferences;

	public void getEnter_RedactionPassword_MyPreferences() throws Exception {
		WebElement ele = Enter_RedactionPassword_MyPreferences;
		ele.clear();
		ele.sendKeys(MyPreferences_excelRead(13, 1));

	}

	@FindBy(xpath = "//button[@id='resetmyPreferences']")
	private WebElement Reset_Button;

	public void getReset_Button() throws Exception {
		WebElement ele = Reset_Button;
		ele.click();

	}

	// File Information

	@FindBy(xpath = "//div[@id='fileInfoButton']//span[contains(@class,'fileinformationBtn')]")
	private WebElement Click_FileInfo_Option;

	public void getClick_FileInfo_Option() {
		WebElement ele = Click_FileInfo_Option;
		ele.click();

	}

	@FindBy(xpath = "//span[@id='fileNameLabel']")
	private WebElement Click_FileInfo_OkButton_withFileName;
	@FindBy(xpath = "//button[@id='fileRenameOK']")
	private WebElement RemarkOk;

	public void getClick_FileInfo_OkButton_withFileName() {
		WebElement Filename = Click_FileInfo_OkButton_withFileName;
		System.out.println("File name is:" + Filename.getText());
		WebElement ele = RemarkOk;
		ele.click();

	}

// Download All files

	@FindBy(xpath = "//input[@id='defaultDownLoadAllFiles']")
	private WebElement Verify_DownloadAllFiles_checkbox;

	public void getVerify_DownloadAllFiles_checkbox() throws Exception {
		if (Verify_DownloadAllFiles_checkbox.isSelected() == False) {
			Verify_DownloadAllFiles_checkbox.click();

		}

	}

	@FindBy(xpath = "//div[@id='pageDownload_shortcut']//span[contains(@class,'downloadPageIcon icon-content')]")
	private WebElement Download_File;

	public void getDownload_File() throws Exception {
		WebElement ele = Download_File;
		ele.click();

	}

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement Download_File_OK_button;

	public void getDownload_File_OK_button() throws Exception {
		WebElement ele = Download_File_OK_button;
		ele.click();

	}

	// Enable Dashboard

	@FindBy(xpath = "//input[@id='enableDashboard']")
	private WebElement Verify_EnableDashboard_checkbox;

	public void getVerify_EnableDashboard_checkbox() throws Exception {
		if (Verify_EnableDashboard_checkbox.isSelected() == False) {
			Verify_EnableDashboard_checkbox.click();

		}

	}

	@FindBy(xpath = "//div[@class='e-list-icon e-icons viewDocumentFromDashboard']")
	private WebElement Click_SwitchTo_DefaultView_Option;

	public void getClick_SwitchTo_DefaultView_Option() throws Exception {
		WebElement ele = Click_SwitchTo_DefaultView_Option;
		ele.click();

	}

	@FindBy(xpath = "//input[@id='enableDashboard']")
	private WebElement Verify_EnableDashboard_checkbox_Unchecked;

	public void getVerify_EnableDashboard_checkbox_Unchecked() throws Exception {
		if (Verify_EnableDashboard_checkbox_Unchecked.isSelected() == true) {
			Verify_EnableDashboard_checkbox_Unchecked.click();
		}

	}

	// Add signature

	@FindBy(xpath = "//button[@id='addSignature']")
	private WebElement Click_AddSignature;

	public void getClick_AddSignature() throws Exception {
		WebElement ele = Click_AddSignature;
		jsclick(ele);

	}

	@FindBy(xpath = "//*[@id=\"uploadSelected\"]")
	private WebElement Click_AddSignature_Upload;

	public WebElement getClick_AddSignature_Upload() throws Exception {
		WebElement ele = Click_AddSignature_Upload;
		jsclick(ele);
		return Click_AddSignature_Upload;
	}

	@FindBy(xpath = "//button[@id='uploadSignature']")
	private WebElement Click_AddSignature_Browse;

	public WebElement getClick_AddSignature_Browse() throws Exception {
		return Click_AddSignature_Browse;
	}

	@FindBy(xpath = "//*[@id=\"saveUploadedSignature\"]")
	private WebElement Click_AddSignature_Save;

	public void getClick_AddSignature_Save() throws Exception {
		WebElement ele = Click_AddSignature_Save;
		jsclick(ele);

	}

	@FindBy(xpath = "//button[@id='uploadSignatureOk']")
	private WebElement Click_AddSignature_Yes_button;

	public void getClick_AddSignature_Yes_button() throws Exception {
		WebElement ele = Click_AddSignature_Yes_button;
		ele.click();

	}

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Signature_Upload_OkButton;
	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement okbutton;

	public void getSignature_Upload_OkButton() throws Exception {
		WebElement sel = Signature_Upload_OkButton;
		System.out.println("The Successfully:" + sel.getText());
		WebElement ok = okbutton;
		ok.click();

	}

	@FindBy(xpath = "//button[@id='btnSignatureAdd']//span[@class='icon icon-sm signatureIcon']")
	private WebElement Click_signature_Menuoption;

	public void getClick_signature_Menuoption() throws Exception {
		WebElement ele = Click_signature_Menuoption;
		ele.click();

	}

	@FindBy(css = "#imageViewerDiv .lt-imageviewer-eventcanvas")
	private WebElement Add_Signature_Onpage;

	public void getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Signature_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();

	}

	@FindBy(xpath = "/html[1]/body[1]/div[58]/div[64]/div[5]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportName_Addsignature;

	public void getEnter_ReportName_Addsignature() throws Exception {
		WebElement ele = Enter_ReportName_Addsignature;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(14, 1));

	}

	@FindBy(id = "typeSelected")
	private WebElement signType;

	public WebElement getsignType() throws Exception {
		return signType;
	}

	@FindBy(xpath = "//select[@id='signatureFonts']")
	private WebElement signatureFont;

	public void getsignatureFont() throws Exception {
		signatureFont.click();
		{
			WebElement dropdown = signatureFont;
			dropdown.findElement(By.xpath("//option[. = 'Parisienne']")).click();
		}

	}

	@FindBy(id = "signInput")
	private WebElement signInput;

	public void getsignInput() throws Exception {
		jsclick(signInput);
		signInput.sendKeys(MyPreferences_excelRead(15, 1));

	}

	@FindBy(xpath = "//option[. = 'Reenie Beanie']")
	private WebElement signatureFontOption2;

	public void getsignatureFontOption2() throws Exception {
		signatureFont.click();
		{
			WebElement dropdown = signatureFont;
			dropdown.findElement(By.xpath("//option[. = 'Reenie Beanie']")).click();
		}

	}

	@FindBy(id = "saveTypedSignature")
	private WebElement savesign;
	@FindBy(id = "messageButtonOK")
	private WebElement signOK;

	public void getsavesigntype() throws Exception {
		jsclick(savesign);
		Thread.sleep(8000);
		jsclick(signOK);

	}

	// Load More count

	@FindBy(xpath = "//input[@id='loadmorecount']")
	private WebElement Enter_Loadmorecount;

	public WebElement getEnter_Maximum_Loadmorecount1() {
		return Enter_Loadmorecount;
	}

	@FindBy(xpath = "//span[@id='totalSearchCount']")
	private WebElement Verify_Loadmorecount_Searchresult;

	public void getVerify_Loadmorecount_Searchresult() throws Exception {
		WebElement count = Verify_Loadmorecount_Searchresult;
		System.out.println("The " + count.getText());

	}

	@FindBy(xpath = "//strong[@id='docCount']")
	private WebElement Verify_Loadmorecount_Document_Folder;

	public void getVerify_Loadmorecount_Document_Folder() throws Exception {
		WebElement DocDisplay = Verify_Loadmorecount_Document_Folder;
		System.out.println("Verify and " + DocDisplay.getText());

	}

	@FindBy(xpath = "//input[@id='loadmorecount']")
	private WebElement Enter_Maximum_Loadmorecount;

	public void getEnter_Maximum_Loadmorecount() throws Exception {
		WebElement ele = Enter_Maximum_Loadmorecount;
		ele.clear();
		ele.sendKeys(excelRead(5, 1));

	}

	@FindBy(xpath = "//button[@id='cvModel50Ok']")
	private WebElement Max_Loadmorecount_OK_button;

	public void getMax_Loadmorecount_OK_button() throws Exception {
		WebElement ele = Max_Loadmorecount_OK_button;
		ele.click();

	}

	// My Preferences Themes

	@FindBy(xpath = "//*[@id=\"prefstableDiv\"]/ul/li[2]")
	private WebElement Select_Themes_Option;

	public void getSelect_Themes_Option() throws Exception {
		WebElement ele = Select_Themes_Option;
		ele.click();

	}

	@FindBy(id = "fontsense")
	private WebElement Select_Themes_Setting;
	@FindBy(xpath = "//option[. = 'Calibri']")
	private WebElement calibri;
	@FindBy(xpath = "//*[@id=\"#8bc53d\"]")
	private WebElement button;
	@FindBy(xpath = "//*[@id=\"large\"]")
	private WebElement large;

	public void getSelect_Themes_Setting() throws Exception {

		Select sel = new Select(Select_Themes_Setting);
		sel.selectByVisibleText("Calibri");
		jsclick(button);
		Thread.sleep(4000);
		jsclick(large);

	}

	@FindBy(id = "logedinusername")
	private WebElement Username;

	public WebElement getUsername() {
		return Username;
	}

	@FindBy(linkText = "Logout")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}

	@FindBy(id = "allAnnDropDownSpan")
	private WebElement allannotation;

	public WebElement getallannotation() {
		return allannotation;
	}

	// Annotation

	@FindBy(xpath = "(//span[text()='Redaction'])[1]")
	private WebElement Redaction;
	@FindBy(xpath = "//*[contains(text(),'Highlight')]")
	private WebElement Highlight;
	@FindBy(xpath = "//*[contains(text(),'Sticky Note')]")
	private WebElement Sticky_Note;
	@FindBy(xpath = "//*[contains(text(),'Rubber Stamp')]")
	private WebElement Rubber_Stamp;

	public void Select_Annotation_Dropdown1() {

		WebElement Annotation1 = Redaction;
		if (Annotation1.isSelected()) {
			Reporter.log("Annotation selected");
		} else {
			jsclick(Annotation1);
		}

		if (Redaction.isSelected()) {
			Reporter.log("Annotation selected");
		} else {
			jsclick(Redaction);
		}

		WebElement Annotation2 = Highlight;
		if (Annotation2.isSelected()) {
			Reporter.log("Annotation selected");
		} else {
			jsclick(Annotation2);
		}

		WebElement Annotation3 = Sticky_Note;
		if (Annotation3.isSelected()) {
			Reporter.log("Annotation selected");
		} else {
			jsclick(Annotation3);
		}

		WebElement Annotation4 = Rubber_Stamp;
		if (Annotation4.isSelected()) {
			Reporter.log("Annotation selected");
		} else {
			jsclick(Annotation4);
		}

	}

	@FindBy(xpath = "/html[1]/body[1]/div[58]/div[64]/div[5]/div[2]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportName_Annotation;

	public void getEnter_ReportName_Annotation() throws Exception {
		WebElement ele = Enter_ReportName_Annotation;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(16, 1));

	}

	@FindBy(xpath = "//span[@class='icon icon-sm redactionBtnIcon']")
	private static WebElement Redaction_Annotation;
	@FindBy(xpath = "//span[@class='icon icon-sm hiliteBtnIcon']")
	private static WebElement Highlight_Annotation;
	@FindBy(xpath = "//span[@class='icon icon-sm stickyNoteBtnIcon']")
	private static WebElement Sticky_Notes_Annotation;

	public void getVerify_AnnotationDropdown1_Option_enable() throws InterruptedException {

		Boolean Ann1 = Redaction_Annotation.isEnabled();
		if (Ann1) {
			System.out.println("Redaction_Annotation option is Enable");
		} else {
			System.out.println("Redaction_Annotation option is Disable");
		}

		Boolean Ann2 = Highlight_Annotation.isEnabled();
		if (Ann2) {
			System.out.println("Highlight_Annotation option from button is Enable");
		} else {
			System.out.println("Highlight_Annotation option from button is Disable");
		}

		Boolean Ann3 = Sticky_Notes_Annotation.isEnabled();
		if (Ann3) {
			System.out.println("Sticky_Notes_Annotation option from button is Enable");
		} else {
			System.out.println("Sticky_Notes_Annotation option from button is Disable");
		}
	}

	@FindBy(xpath = "//div[@id='homeMenuBtn']")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
	}

	@FindBy(xpath = "//*[@id=\"protectPassword\"]")
	private WebElement Protectpassword;

	public WebElement getclickProtectpassword() throws Exception {
		jsclick(Protectpassword);
		return Protectpassword;
	}

	@FindBy(xpath = "//*[@id=\"signaturePassword\"]")
	private WebElement Enterpassword1;
	@FindBy(xpath = "//*[@id=\"signaturePasswordConfirm\"]")
	private WebElement Enterpassword2;
	@FindBy(xpath = "//*[@id=\"proceedToSaveSignature\"]")
	private WebElement Okbutton;

	public void getEnterpassword() throws Exception {

		Thread.sleep(4000);
		jsclick(Enterpassword1);
		Enterpassword1.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(2000);
		jsclick(Enterpassword2);
		Enterpassword2.sendKeys(MyPreferences_excelRead(13, 1));
		jsclick(Okbutton);

	}

	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;
	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;

	public void getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys(MyPreferences_excelRead(13, 1));
		jsclick(verifypassok);

	}

	@FindBy(xpath = "//*[@id=\"signInputPassword\"]")
	private WebElement settingpassword;
	@FindBy(xpath = "//*[@id=\"verifySignaturePassword\"]")
	private WebElement settingpassok;

	public void getsettingpass() throws Exception {
		jsclick(settingpassword);
		settingpassword.sendKeys(MyPreferences_excelRead(13, 1));
		jsclick(settingpassok);

	}

	// Load more

	@FindBy(xpath = "//*[@id=\"loadMoreDocList\"]/button")
	private WebElement Loadmorebutton;

	public WebElement getLoadmorebutton() throws Exception {
		return Loadmorebutton;

	}
	// Redaction Negative

	public void getvalidate_Redaction_Emptypassword() throws Exception {

		Actions action = new Actions(driver);
		WebElement element = Set_Redaction_ToDocument;
		action.dragAndDropBy(element, 400, 150).build().perform();
		jsclick(Set_Redaction_ToDocument);
		Thread.sleep(3000);
		jsclick(Apply);

	}

	@FindBy(xpath = "//*[@id=\"mismatchMsg\"]")
	private WebElement error;

	public void getmessagevalidation1() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Password can't be empty !";
		String actualtext = error.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(error.getText());

	}

	public void getenter_Password() throws Exception {

		objectname.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(3000);
		jsclick(input);
		Thread.sleep(2000);
		input.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(2000);
		jsclick(Apply);
		Thread.sleep(2000);

	}

	public void getmessagevalidate2() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Password mismatch !";
		String actualtext = error.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(error.getText());

	}

	public void getenter_Confirmpassword() throws Exception {

		jsclick(confirmpassword);
		Thread.sleep(2000);
		confirmpassword.sendKeys(MyPreferences_excelRead(17, 1));
		Thread.sleep(3000);
		jsclick(Apply);

	}

	public void getenter_validpassword() throws Exception {

		input.clear();
		Thread.sleep(2000);
		input.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(2000);
		confirmpassword.clear();
		Thread.sleep(2000);
		confirmpassword.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(3000);
		jsclick(Apply);

	}

	public void getEnter_InvalidRedactionPassword_MyPreferences() throws Exception {
		WebElement ele = Enter_RedactionPassword_MyPreferences;
		ele.clear();
		ele.sendKeys(MyPreferences_excelRead(17, 1));

	}

	public void getReset_InvalidRedactionPassword_MyPreferences() throws Exception {
		WebElement ele = Enter_RedactionPassword_MyPreferences;
		ele.clear();

	}

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement ViewDocument_Button;

	public WebElement getViewDocument_Button() {
		return ViewDocument_Button;
	}

	@FindBy(xpath = "//input[@class='thumbnailOptionSelected']")
	private WebElement SelectCheckbox;

	public WebElement getSelectCheckbox() {
		return SelectCheckbox;
	}

	@FindBy(xpath = "//span[contains(@class,'pageMenu')]")
	private WebElement Click_Pagemenu;

	public WebElement getClick_Pagemenu() {
		return Click_Pagemenu;
	}

	@FindBy(css = "#copyDoc > .text")
	private WebElement Copypage;

	public WebElement getCopypage() {
		return Copypage;
	}

	@FindBy(css = "#pastDoc > .text")
	private WebElement Pastepage;

	public WebElement getPastepage() {
		return Pastepage;
	}

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement Clickokbutton;

	public WebElement getClickokbutton() {
		return Clickokbutton;
	}

	@FindBy(css = "#saveAddedPages > .icon")
	private WebElement Save_button;

	public WebElement getSave_button() {
		return Save_button;
	}

	@FindBy(id = "messageButtonOK42")
	private WebElement DocumentSave_Ok_button;

	public WebElement getDocumentSave_Ok_button() {
		return DocumentSave_Ok_button;

	}

	@FindBy(css = "#splitDocumentAnchor > .text")
	private WebElement Splitpage;

	public WebElement getSplitpage() {
		return Splitpage;
	}

	@FindBy(xpath = "//input[@id='startRange']")
	private WebElement StartRange;
	@FindBy(xpath = "//input[@id='endRange']")
	private WebElement EndRange;
	@FindBy(xpath = "//button[@id='splitDocument']")
	private WebElement SplitOK;

	public void getEnter_SplitPageNumber() throws Exception {

		StartRange.sendKeys(excelRead(9, 1));
		EndRange.sendKeys(excelRead(10, 1));
		jsclick(SplitOK);
	}

	@FindBy(xpath = "//div[@id='00pagespdf_1_1_2.PDF']//input[@type='checkbox']")
	private WebElement SelectAllCheckbox;

	public WebElement getSelectAllCheckbox() {
		return SelectAllCheckbox;
	}

	@FindBy(css = "#annotationObjectBtn > .text")
	private WebElement Mergepage;

	public WebElement getMergepage() {
		return Mergepage;
	}
	
	// Document Create testing data
	
	@FindBy(xpath = ("//*[@id=\"154\"]/a"))
	private WebElement Cabinet;

	public WebElement getCabinet() {
		return Cabinet;
	}

	@FindBy(xpath = ("//*[@id=\"155\"]/a"))
	private WebElement Drawer;

	public WebElement getDrawer() {
		return Drawer;
	}

	@FindBy(xpath = ("//*[@id=\"6345\"]/a"))
	private WebElement DipakSubFolder;

	public WebElement getDipakSubFolder() {
		return DipakSubFolder;
	}
	@FindBy(xpath = "//span[@title='Document Close']")
	private WebElement Close_Document;

	public WebElement getClose_Documentpage() {
		return Close_Document;

	}
	
	
}

