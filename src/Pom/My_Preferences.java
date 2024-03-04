package Pom;

//Dipak Automation Pom
import java.io.File;
import java.io.FileInputStream;
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

public class My_Preferences extends BaseClass {

	public static WebElement element = null;
	private static final boolean False = false;

	public My_Preferences() {
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

	public WebElement getSelect_Dropdown_Convert_To_PDF() {
		Select sel = new Select(Select_Dropdown_Convert_To_PDF);
		sel.selectByVisibleText("Convert To PDF");
		return Select_Dropdown_Convert_To_PDF;
	}

	@FindBy(xpath = "//a[@id='advSearchMenuBtn']")
	private WebElement Click_Search_Option;

	public WebElement getClick_Search_Option() {
		return Click_Search_Option;
	}

	@FindBy(id = "indexPhrase1")
	private WebElement Enter_Document_Name;

	public WebElement getEnter_Document_Name() throws Exception {
		Enter_Document_Name.click();
		Enter_Document_Name.sendKeys(MyPreferences_excelRead(0, 1));
		return Enter_Document_Name;
	}

	@FindBy(id = "advFindBtnLabel")
	private WebElement Find_Button;

	public WebElement getFind_Button() {
		return Find_Button;
	}

	@FindBy(xpath = "//td[contains(text(),'My_Pereferences_Test_Doc')]")
	private WebElement Select_Document;

	public WebElement getSelect_Document() {
		Select_Document.click();
		return Select_Document;
	}

	@FindBy(id = "pageNumber")
	private WebElement Search_Page_Number;

	public WebElement getSearch_Page_Number() throws InterruptedException {
		Search_Page_Number.click();
		Thread.sleep(4000);
		Search_Page_Number.clear();
		Search_Page_Number.sendKeys("8");
		Thread.sleep(4000);
		Search_Page_Number.sendKeys(Keys.ENTER);
		return Search_Page_Number;
	}

	@FindBy(id = "defaultViewListNo")
	private WebElement Select_Dropdown_Native_Format;

	public WebElement getSelect_Dropdown_Native_Format() {
		Select sel = new Select(Select_Dropdown_Native_Format);
		sel.selectByVisibleText("Native Format");
		return Select_Dropdown_Native_Format;

	}

	@FindBy(xpath = "//select[@id='viewerZoomId']")
	private WebElement Select_Dropdown_Fit_To_Width;

	public WebElement getSelect_Dropdown_Fit_To_Width() {
		Select sel = new Select(Select_Dropdown_Fit_To_Width);
		sel.selectByVisibleText("Fit To Width");
		return Select_Dropdown_Fit_To_Width;

	}

	@FindBy(xpath = "//select[@id='viewerZoomId']")
	private WebElement Select_Dropdown_Fit_To_Height;

	public WebElement getSelect_Dropdown_Fit_To_Height() {
		Select sel = new Select(Select_Dropdown_Fit_To_Height);
		sel.selectByVisibleText("Fit To Height");
		return Select_Dropdown_Fit_To_Height;
	}

	@FindBy(xpath = "//select[@id='viewerZoomId']")
	private WebElement Select_Dropdown_Fit_Entire_Image;

	public WebElement getSelect_Dropdown_Fit_Entire_Image() {
		Select sel = new Select(Select_Dropdown_Fit_Entire_Image);
		sel.selectByVisibleText("Fit Entire Image");
		return Select_Dropdown_Fit_Entire_Image;

	}

	@FindBy(xpath = "//select[@id='viewerZoomId']")
	private WebElement Select_Dropdown_Actual_Size;

	public WebElement getSelect_Dropdown_Actual_Size() {
		Select sel = new Select(Select_Dropdown_Actual_Size);
		sel.selectByVisibleText("Actual Size");
		return Select_Dropdown_Actual_Size;

	}

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Defaultviewing;

	public WebElement getSelect_Office_document_Defaultviewing() {
		Select sel = new Select(Select_Office_document_Defaultviewing);
		sel.selectByVisibleText("Default viewing");
		return Select_Office_document_Defaultviewing;

	}

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Advancedviewing;

	public WebElement getSelect_Office_document_Advancedviewing() {
		Select sel = new Select(Select_Office_document_Advancedviewing);
		sel.selectByVisibleText("Advanced viewing");
		return Select_Office_document_Advancedviewing;
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

	@FindBy(xpath = ("(//a[text()='CVApp Test'])[1]"))
	private WebElement Cabinet;

	public WebElement getCabinet() {
		return Cabinet;
	}

	@FindBy(xpath = ("//a[text()='CVMobile App 2022']"))
	private WebElement Drawer;

	public WebElement getDrawer() {
		return Drawer;
	}

	@FindBy(xpath = ("//a[text()='Test apk']"))
	private WebElement Folder;

	public WebElement getFolder() {
		return Folder;
	}

	@FindBy(xpath = "//button[@id='navigatorTreeOk']")
	private WebElement OK_Button_BrowseforFolder;

	public WebElement getOK_Button_BrowseforFolder() {
		return OK_Button_BrowseforFolder;
	}

	@FindBy(id = "docTypeList")
	private WebElement Click_Document_Type_Dropdown;

	public WebElement getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;
	}

	@FindBy(id = "indices_33")
	private WebElement Enter_ReportName;

	public WebElement getEnter_ReportName() throws Exception {
		WebElement ele = Enter_ReportName;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(1, 1));
		return Enter_ReportName;
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

	public WebElement getNew_Word_Document_Option() {
		WebElement ele1 = New_Word_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return ele1;

	}

	@FindBy(id = "newTemplateFileName")
	private WebElement Enter_Word_File_Name;
	@FindBy(id = "templateOK")
	private WebElement TemplateOK;

	public WebElement getEnter_Word_File_Name() throws Exception {
		WebElement ele = Enter_Word_File_Name;
		ele.sendKeys(MyPreferences_excelRead(2, 1));
		TemplateOK.click();
		return ele;
	}

	// New Excel Spreadsheet

	@FindBy(linkText = "New Excel Spreadsheet")
	private WebElement New_Excel_Spreadsheet_Option;

	public WebElement getNew_Excel_Spreadsheet_Option() {
		WebElement ele1 = New_Excel_Spreadsheet_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return ele1;
	}

	@FindBy(id = "newTemplateFileName")
	private WebElement Enter_Excel_File_Name;

	public WebElement getEnter_Excel_File_Name() throws Exception {
		WebElement ele1 = Enter_Excel_File_Name;
		ele1.sendKeys(MyPreferences_excelRead(3, 1));
		TemplateOK.click();
		return ele1;
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

	public WebElement getPdf_document_Advancedviewing() {
		Select drop = new Select(Pdf_document_Advancedviewing);
		drop.selectByVisibleText("Advanced viewing");
		return Pdf_document_Advancedviewing;
	}

	@FindBy(linkText = "New Pdf Document")
	private WebElement New_pdf_Document_Option;

	public WebElement getNew_pdf_Document_Option() {
		WebElement ele1 = New_pdf_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return New_pdf_Document_Option;
	}

	@FindBy(id = "newTemplateFileName")
	private WebElement Enter_pdf_File_Name;

	public WebElement getEnter_pdf_File_Name() throws Exception {
		WebElement ele1 = Enter_pdf_File_Name;
		ele1.sendKeys(MyPreferences_excelRead(5, 1));
		driver.findElement(By.id("templateOK")).click();
		return Enter_pdf_File_Name;
	}

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Defaultviewing;

	public WebElement getPdf_document_Defaultviewing() throws Exception {
		Select sel = new Select(Pdf_document_Defaultviewing);
		sel.selectByVisibleText("Default viewing");
		return Pdf_document_Defaultviewing;
	}

	// Datadriven My preference

	public static String MyPreferences_excelRead(int rowNo, int cellNo) throws Exception {
		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("MyPreferences");
		XSSFRow row = s.getRow(rowNo);
		XSSFCell cll = row.getCell(cellNo);
		String cellType = cll.getStringCellValue();
		return cellType;
	}

	@FindBy(id = "indices_33")
	private WebElement Enter_ReportNameDefaultview;

	public WebElement getEnter_ReportNameDefaultview() throws Exception {
		WebElement ele = Enter_ReportNameDefaultview;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(4, 1));
		return Enter_ReportNameDefaultview;
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

	public WebElement getYYYY_MM_DD_DateFormat() throws Exception {
		Select sel = new Select(YYYY_MM_DD_DateFormat);
		sel.selectByVisibleText("YYYY-MM-DD");
		return YYYY_MM_DD_DateFormat;
	}

	@FindBy(xpath = "//select[@id='dateformatid']")
	private WebElement DD_MM_YYYY_DateFormat;

	public WebElement getDD_MM_YYYY_DateFormat() throws Exception {
		Select sel = new Select(DD_MM_YYYY_DateFormat);
		sel.selectByVisibleText("DD-MM-YYYY");
		return DD_MM_YYYY_DateFormat;
	}

	@FindBy(xpath = "//select[@id='dateformatid']")
	private WebElement MM_DD_YYYY_DateFormat;

	public WebElement getMM_DD_YYYY_DateFormat() throws Exception {
		Select sel = new Select(MM_DD_YYYY_DateFormat);
		sel.selectByVisibleText("MM-DD-YYYY");
		return MM_DD_YYYY_DateFormat;
	}

	@FindBy(xpath = "//select[@id='dateformatid']")
	private WebElement Default_DateFormat;

	public WebElement getDefault_DateFormat() throws Exception {
		Select sel = new Select(Default_DateFormat);
		sel.selectByVisibleText("Default");
		return Default_DateFormat;
	}

	public WebElement Verify_YYYY_MM_DD_Date(WebDriver driver) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String currentDate = sdf.format(d);
		System.out.println("Current CREATED ON Date Format is :" + currentDate);
		return element;
	}

	public WebElement Verify_DD_MM_YYYY_Date(WebDriver driver) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String currentDate = sdf.format(d);
		System.out.println("Current CREATED ON Date is :" + currentDate);
		return element;
	}

	public WebElement Verify_MM_DD_YYYY_Date(WebDriver driver) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String currentDate = sdf.format(d);
		System.out.println("Current CREATED ON Date is :" + currentDate);
		return element;
	}

	public WebElement Verify_Default_Date(WebDriver driver) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentDateTime = sdf.format(d);
		System.out.println("Current CREATED ON Date is :" + currentDateTime);
		return element;
	}

	// PDF with Overlay

	@FindBy(xpath = "//select[@id='pdfWithOverlayOption']")
	private WebElement Select_PDF_with_Overlay_Disable;

	public WebElement getSelect_PDF_with_Overlay_Disable() throws Exception {
		Select sel = new Select(Select_PDF_with_Overlay_Disable);
		sel.selectByVisibleText("Disable");
		return Select_PDF_with_Overlay_Disable;
	}

	@FindBy(id = "indices_33")
	private WebElement Enter_ReportNamePDFwithOverlay;

	public WebElement getEnter_ReportNamePDFwithOverlay() throws Exception {
		WebElement ele = Enter_ReportNamePDFwithOverlay;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(7, 1));
		return Enter_ReportNamePDFwithOverlay;
	}

	@FindBy(xpath = "//div[@id='showView']//span[1]")
	private WebElement Move_to_ViewMenu_Option_inViewer;

	public WebElement getMove_to_ViewMenu_Option_inViewer() throws Exception {
		WebElement ele = Move_to_ViewMenu_Option_inViewer;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return Move_to_ViewMenu_Option_inViewer;
	}

	@FindBy(css = "#pdfOverlayOption > .text")
	private WebElement Verify_PDF_with_Overlay_option;

	public WebElement getVerify_PDF_with_Overlay_option() throws Exception {
		Boolean ele = Verify_PDF_with_Overlay_option.isDisplayed();
		if (ele) {
			System.out.println(" PDF with Overlay is Enable");
		} else {
			System.out.println(" PDF with Overlay is Disable");
		}
		return Verify_PDF_with_Overlay_option;
	}

	@FindBy(xpath = "//select[@id='pdfWithOverlayOption']")
	private WebElement Select_PDF_with_Overlay_Enable;

	public WebElement getSelect_PDF_with_Overlay_Enable() throws Exception {
		Select sel = new Select(Select_PDF_with_Overlay_Enable);
		sel.selectByVisibleText("Enable");
		return Select_PDF_with_Overlay_Enable;
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

	@FindBy(css = "tbody:nth-child(2) > .odd:nth-child(1) > td:nth-child(5)")
	private WebElement Open_Document;

	public WebElement getOpen_Document() throws Exception {
		return Open_Document;
	}

	// Quick Find

	@FindBy(xpath = "//select[@id='quickFindListNo']")
	private WebElement Select_QuickFind_DocIdSearch;

	public WebElement getSelect_QuickFind_DocIdSearch() throws Exception {
		Select sel = new Select(Select_QuickFind_DocIdSearch);
		sel.selectByVisibleText("Doc Id Search");
		return Select_QuickFind_DocIdSearch;
	}

	@FindBy(xpath = "//select[@id='quickFindListNo']")
	private WebElement Select_QuickFind_TextSearch;

	public WebElement getSelect_QuickFind_TextSearch() throws Exception {
		Select sel = new Select(Select_QuickFind_TextSearch);
		sel.selectByVisibleText("Text search");
		return Select_QuickFind_TextSearch;
	}

	@FindBy(xpath = "//select[@id='quickFindListNo']")
	private WebElement Select_QuickFind_IndexSearch;

	public WebElement getSelect_QuickFind_IndexSearch() throws Exception {
		Select sel = new Select(Select_QuickFind_IndexSearch);
		sel.selectByVisibleText("Index search");
		return Select_QuickFind_IndexSearch;
	}

	@FindBy(xpath = "//select[@id='quickFindListNo']")
	private WebElement Select_QuickFind_Both;

	public WebElement getSelect_QuickFind_Both() throws Exception {
		Select sel = new Select(Select_QuickFind_Both);
		sel.selectByVisibleText("Both");
		return Select_QuickFind_Both;
	}

	@FindBy(xpath = "//input[@id='search-text']")
	private WebElement Enter_Doc_Id_InSearch;

	public WebElement getEnter_Doc_Id_InSearch() throws Exception {
		WebElement ele = (Enter_Doc_Id_InSearch);
		ele.click();
		Thread.sleep(4000);
		ele.sendKeys("78304");
		Thread.sleep(4000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		return Enter_Doc_Id_InSearch;
	}

	@FindBy(xpath = "//span[normalize-space()='General']")
	private WebElement Click_general_option;

	public WebElement getClick_general_option() throws Exception {
		return Click_general_option;
	}

	@FindBy(xpath = "//td[normalize-space()='78304']")
	private WebElement Verify_Doc_Id;

	public WebElement getVerify_Doc_Id() throws Exception {
		WebElement DocId = Verify_Doc_Id;
		System.out.println("DocId Number is:" + DocId.getText());
		return Verify_Doc_Id;
	}

	@FindBy(xpath = "//input[@id='search-text']")
	private WebElement Enter_Text_InSearch;

	public WebElement getEnter_Text_InSearch() throws Exception {
		WebElement ele = Enter_Text_InSearch;
		ele.click();
		ele.clear();;
		Thread.sleep(4000);
		ele.sendKeys(MyPreferences_excelRead(9, 1));
		Thread.sleep(4000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		return Enter_Text_InSearch;
	}

	@FindBy(xpath = "//input[@id='search-text']")
	private WebElement Enter_IndexValue_InSearch;

	public WebElement getEnter_IndexValue_InSearch() throws Exception {
		WebElement ele = Enter_IndexValue_InSearch;
		ele.click();
		ele.clear();
		Thread.sleep(4000);
		ele.sendKeys(MyPreferences_excelRead(10, 1));
		Thread.sleep(4000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		return Enter_IndexValue_InSearch;
	}

	@FindBy(xpath = "//input[@id='search-text']")
	private WebElement Enter_BothValue_InSearch;

	public WebElement getEnter_BothValue_InSearch() throws Exception {
		WebElement ele = Enter_BothValue_InSearch;
		ele.click();
		ele.clear();
		Thread.sleep(4000);
		ele.sendKeys(MyPreferences_excelRead(10, 1));
		Thread.sleep(4000);
		ele.sendKeys(Keys.ENTER);
		return Enter_BothValue_InSearch;
	}

	// Redaction View Password

	@FindBy(id = "indices_33")
	private WebElement Enter_ReportName_RedactionPassword;

	public WebElement getEnter_ReportName_RedactionPassword() throws Exception {
		WebElement ele = Enter_ReportName_RedactionPassword;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(12, 1));
		return Enter_ReportName_RedactionPassword;
	}

	@FindBy(css = ".annotationRoot")
	private WebElement Move_to_Annotation_Option_inViewer;

	public WebElement getMove_to_Annotation_Option_inViewer() throws Exception {
		WebElement ele = Move_to_Annotation_Option_inViewer;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return Move_to_Annotation_Option_inViewer;
	}

	@FindBy(css = "#lockenable1 > .text")
	private WebElement Redaction_Option;

	public WebElement getRedaction_Option() throws Exception {
		WebElement ele1 = Redaction_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return Redaction_Option;
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

	public WebElement getSet_Redaction_ToDocument() throws Exception {
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
		return Set_Redaction_ToDocument;
	}

	@FindBy(id = "redactionPwd")
	private WebElement Enter_RedactionPassword_MyPreferences;

	public WebElement getEnter_RedactionPassword_MyPreferences() throws Exception {
		WebElement ele = Enter_RedactionPassword_MyPreferences;
		ele.clear();
		ele.sendKeys(MyPreferences_excelRead(13, 1));
		return Enter_RedactionPassword_MyPreferences;

	}

	@FindBy(xpath = "//button[@id='resetmyPreferences']")
	private WebElement Reset_Button;

	public WebElement getReset_Button() throws Exception {
		WebElement ele = Reset_Button;
		ele.click();
		return Reset_Button;
	}

	// File Information

	@FindBy(xpath = "//div[@id='fileInfoButton']//span[contains(@class,'fileinformationBtn')]")
	private WebElement Click_FileInfo_Option;

	public WebElement getClick_FileInfo_Option() {
		WebElement ele = Click_FileInfo_Option;
		ele.click();
		return Click_FileInfo_Option;
	}

	@FindBy(xpath = "//span[@id='fileNameLabel']")
	private WebElement Click_FileInfo_OkButton_withFileName;
	@FindBy(xpath = "//button[@id='fileRenameOK']")
	private WebElement RemarkOk;

	public WebElement getClick_FileInfo_OkButton_withFileName() {
		WebElement Filename = Click_FileInfo_OkButton_withFileName;
		System.out.println("File name is:" + Filename.getText());
		WebElement ele = RemarkOk;
		ele.click();
		return Click_FileInfo_OkButton_withFileName;

	}

// Download All files

	@FindBy(xpath = "//input[@id='defaultDownLoadAllFiles']")
	private WebElement Verify_DownloadAllFiles_checkbox;

	public WebElement getVerify_DownloadAllFiles_checkbox() throws Exception {
		if (Verify_DownloadAllFiles_checkbox.isSelected() == False) {
			Verify_DownloadAllFiles_checkbox.click();

		}
		return Verify_DownloadAllFiles_checkbox;
	}

	@FindBy(xpath = "//div[@id='pageDownload_shortcut']//span[contains(@class,'downloadPageIcon icon-content')]")
	private WebElement Download_File;

	public WebElement getDownload_File() throws Exception {
		WebElement ele = Download_File;
		ele.click();
		return Download_File;
	}

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement Download_File_OK_button;

	public WebElement getDownload_File_OK_button() throws Exception {
		WebElement ele = Download_File_OK_button;
		ele.click();
		return Download_File_OK_button;
	}

	// Enable Dashboard

	@FindBy(xpath = "//input[@id='enableDashboard']")
	private WebElement Verify_EnableDashboard_checkbox;

	public WebElement getVerify_EnableDashboard_checkbox() throws Exception {
		if (Verify_EnableDashboard_checkbox.isSelected() == False) {
			Verify_EnableDashboard_checkbox.click();

		}
		return Verify_EnableDashboard_checkbox;
	}

	@FindBy(xpath = "//div[@class='e-list-icon e-icons viewDocumentFromDashboard']")
	private WebElement Click_SwitchTo_DefaultView_Option;

	public WebElement getClick_SwitchTo_DefaultView_Option() throws Exception {
		WebElement ele = Click_SwitchTo_DefaultView_Option;
		ele.click();
		return Click_SwitchTo_DefaultView_Option;
	}

	@FindBy(xpath = "//input[@id='enableDashboard']")
	private WebElement Verify_EnableDashboard_checkbox_Unchecked;

	public WebElement getVerify_EnableDashboard_checkbox_Unchecked() throws Exception {
		if (Verify_EnableDashboard_checkbox_Unchecked.isSelected() == true) {
			Verify_EnableDashboard_checkbox_Unchecked.click();
		}
		return Verify_EnableDashboard_checkbox_Unchecked;
	}

	// Add signature

	@FindBy(xpath = "//button[@id='addSignature']")
	private WebElement Click_AddSignature;

	public WebElement getClick_AddSignature() throws Exception {
		WebElement ele = Click_AddSignature;
		jsclick(ele);
		return Click_AddSignature;
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

	public WebElement getClick_AddSignature_Save() throws Exception {
		WebElement ele = Click_AddSignature_Save;
		jsclick(ele);
		return Click_AddSignature_Save;
	}

	@FindBy(xpath = "//button[@id='uploadSignatureOk']")
	private WebElement Click_AddSignature_Yes_button;

	public WebElement getClick_AddSignature_Yes_button() throws Exception {
		WebElement ele = Click_AddSignature_Yes_button;
		ele.click();
		return Click_AddSignature_Yes_button;
	}

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Signature_Upload_OkButton;
	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement okbutton;

	public WebElement getSignature_Upload_OkButton() throws Exception {
		WebElement sel = Signature_Upload_OkButton;
		System.out.println("The Successfully:" + sel.getText());
		WebElement ok = okbutton;
		ok.click();
		return Signature_Upload_OkButton;
	}

	@FindBy(xpath = "//button[@id='btnSignatureAdd']//span[@class='icon icon-sm signatureIcon']")
	private WebElement Click_signature_Menuoption;

	public WebElement getClick_signature_Menuoption() throws Exception {
		WebElement ele = Click_signature_Menuoption;
		ele.click();
		return Click_signature_Menuoption;
	}

	@FindBy(css = "#imageViewerDiv .lt-imageviewer-eventcanvas")
	private WebElement Add_Signature_Onpage;

	public WebElement getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Signature_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();
		return Add_Signature_Onpage;
	}

	@FindBy(id = "indices_33")
	private WebElement Enter_ReportName_Addsignature;

	public WebElement getEnter_ReportName_Addsignature() throws Exception {
		WebElement ele = Enter_ReportName_Addsignature;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(14, 1));
		return Enter_ReportName_Addsignature;
	}

	@FindBy(id = "typeSelected")
	private WebElement signType;

	public WebElement getsignType() throws Exception {
		return signType;
	}

	@FindBy(xpath = "//select[@id='signatureFonts']")
	private WebElement signatureFont;

	public WebElement getsignatureFont() throws Exception {
		signatureFont.click();
		{
			WebElement dropdown = signatureFont;
			dropdown.findElement(By.xpath("//option[. = 'Parisienne']")).click();
		}
		return signatureFont;
	}

	@FindBy(id = "signInput")
	private WebElement signInput;

	public WebElement getsignInput() throws Exception {
		jsclick(signInput);
		signInput.sendKeys(MyPreferences_excelRead(15, 1));
		return signInput;
	}

	@FindBy(xpath = "//option[. = 'Reenie Beanie']")
	private WebElement signatureFontOption2;

	public WebElement getsignatureFontOption2() throws Exception {
		signatureFont.click();
		{
			WebElement dropdown = signatureFont;
			dropdown.findElement(By.xpath("//option[. = 'Reenie Beanie']")).click();
		}
		return signatureFontOption2;

	}

	@FindBy(id = "saveTypedSignature")
	private WebElement savesign;
	@FindBy(id = "messageButtonOK")
	private WebElement signOK;

	public WebElement getsavesigntype() throws Exception {
		jsclick(savesign);
		Thread.sleep(8000);
		jsclick(signOK);
		return savesign;
	}

	// Load More count

	@FindBy(xpath = "//input[@id='loadmorecount']")
	private WebElement Enter_Loadmorecount;

	public WebElement getEnter_Loadmorecount() throws Exception {
		WebElement ele = Enter_Loadmorecount;
		ele.click();
		ele.clear();
		ele.sendKeys("10");
		return Enter_Loadmorecount;
	}

	@FindBy(xpath = "//span[@id='totalSearchCount']")
	private WebElement Verify_Loadmorecount_Searchresult;

	public WebElement getVerify_Loadmorecount_Searchresult() throws Exception {
		WebElement count = Verify_Loadmorecount_Searchresult;
		System.out.println("The " + count.getText());
		return Verify_Loadmorecount_Searchresult;
	}

	@FindBy(xpath = "//strong[@id='docCount']")
	private WebElement Verify_Loadmorecount_Document_Folder;

	public WebElement getVerify_Loadmorecount_Document_Folder() throws Exception {
		WebElement DocDisplay = Verify_Loadmorecount_Document_Folder;
		System.out.println("Verify and " + DocDisplay.getText());
		return Verify_Loadmorecount_Document_Folder;
	}

	@FindBy(xpath = "//input[@id='loadmorecount']")
	private WebElement Enter_Maximum_Loadmorecount;

	/*public WebElement getEnter_Maximum_Loadmorecount() throws Exception {
		WebElement ele = Enter_Maximum_Loadmorecount;
		ele.click();
		ele.clear();
		ele.sendKeys("150");
		return Enter_Maximum_Loadmorecount;
	}*/
	public WebElement getEnter_Maximum_Loadmorecount() {
		
		return Enter_Maximum_Loadmorecount;
	}
	

	@FindBy(xpath = "//button[@id='cvModel50Ok']")
	private WebElement Max_Loadmorecount_OK_button;

	public WebElement getMax_Loadmorecount_OK_button() throws Exception {
		WebElement ele = Max_Loadmorecount_OK_button;
		ele.click();
		return Max_Loadmorecount_OK_button;
	}

	// My Preferences Themes

	@FindBy(xpath = "//*[@id=\"prefstableDiv\"]/ul/li[2]")
	private WebElement Select_Themes_Option;

	public WebElement getSelect_Themes_Option() throws Exception {
		WebElement ele = Select_Themes_Option;
		ele.click();
		return Select_Themes_Option;
	}

	@FindBy(id = "fontsense")
	private WebElement Select_Themes_Setting;
	@FindBy(xpath = "//option[. = 'Calibri']") 
	private WebElement calibri;
	@FindBy(xpath = "//*[@id=\"#8bc53d\"]")
	private WebElement button;
	@FindBy(xpath = "//*[@id=\"large\"]")
	private WebElement large;

	public WebElement getSelect_Themes_Setting() throws Exception {

		Select sel = new Select(Select_Themes_Setting);
		sel.selectByVisibleText("Calibri");
		jsclick(button);
		Thread.sleep(4000);
		jsclick(large);
		return Select_Themes_Setting;
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

	public WebElement Select_Annotation_Dropdown1(WebDriver driver) {

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
		return Annotation3;
	}

	@FindBy(id = "indices_33")
	private WebElement Enter_ReportName_Annotation;

	public WebElement getEnter_ReportName_Annotation() throws Exception {
		WebElement ele = Enter_ReportName_Annotation;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(16, 1));
		return Enter_ReportName_Annotation;
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
	@FindBy(xpath = "//img[@src='images/newRe.png']")
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
	
	public WebElement getEnterpassword() throws Exception {
		
		Thread.sleep(4000);
		jsclick(Enterpassword1);
		Enterpassword1.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(2000);
		jsclick(Enterpassword2);
		Enterpassword2.sendKeys(MyPreferences_excelRead(13, 1));
		jsclick(Okbutton);
		return Okbutton;
	}
	
	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;
	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;
	
	public WebElement getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys(MyPreferences_excelRead(13, 1));
		jsclick(verifypassok);
		return verifypassok;
	}
	
	@FindBy(xpath = "//*[@id=\"signInputPassword\"]")
	private WebElement settingpassword;
	@FindBy(xpath = "//*[@id=\"verifySignaturePassword\"]")
	private WebElement settingpassok;
	
	public WebElement getsettingpass() throws Exception {
		jsclick(settingpassword);
		settingpassword.sendKeys(MyPreferences_excelRead(13, 1));
		jsclick(settingpassok);
		return settingpassok;
	}
	
	// Load more 
	
	@FindBy(xpath = "//*[@id=\"loadMoreDocList\"]/button")
	private WebElement Loadmorebutton;
	
	public WebElement getLoadmorebutton () throws Exception {
		return Loadmorebutton;
	
}
	// Redaction Negative
	
	public WebElement getvalidate_Redaction_Emptypassword () throws Exception {
		
		Actions action = new Actions(driver);
		WebElement element = Set_Redaction_ToDocument;
		action.dragAndDropBy(element, 400, 150).build().perform();
		jsclick(Set_Redaction_ToDocument);
		Thread.sleep(3000);
		jsclick(Apply);
		return Set_Redaction_ToDocument;
	}
	
	@FindBy(xpath = "//*[@id=\"mismatchMsg\"]")
	private WebElement error;
	
	public WebElement getmessagevalidation1 () {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Password can't be empty !";
		String actualtext = error.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(error.getText());
		return element;
	}

	public WebElement getenter_Password () throws Exception {
		
		objectname.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(3000);
		jsclick(input);
		Thread.sleep(2000);
		input.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(2000);
		jsclick(Apply);
		Thread.sleep(2000);
		return element;
}
	
	public WebElement getmessagevalidate2 () {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Password mismatch !";
		String actualtext = error.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(error.getText());
		return element;
	}
	
	public WebElement getenter_Confirmpassword () throws Exception {
		
		jsclick(confirmpassword);
		Thread.sleep(2000);
		confirmpassword.sendKeys(MyPreferences_excelRead(17, 1));
		Thread.sleep(3000);
		jsclick(Apply);
		return element;
}
	
	public WebElement getenter_validpassword () throws Exception {
		
		input.clear();
		Thread.sleep(2000);
		input.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(2000);
		confirmpassword.clear();
		Thread.sleep(2000);
		confirmpassword.sendKeys(MyPreferences_excelRead(13, 1));
		Thread.sleep(3000);
		jsclick(Apply);
		return element;
}
	public WebElement getEnter_InvalidRedactionPassword_MyPreferences() throws Exception {
		WebElement ele = Enter_RedactionPassword_MyPreferences;
		ele.clear();
		ele.sendKeys(MyPreferences_excelRead(17, 1));
		return Enter_RedactionPassword_MyPreferences;

	}
	
	public WebElement getReset_InvalidRedactionPassword_MyPreferences() throws Exception {
		WebElement ele = Enter_RedactionPassword_MyPreferences;
		ele.clear();
		return element;

	}
}
