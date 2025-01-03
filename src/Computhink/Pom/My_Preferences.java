package Computhink.Pom;

//Dipak Automation Coading

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Computhink.Generic.BaseClass;

public class My_Preferences extends BaseClass {

	public static WebElement element = null;
	private static final boolean False = false;

	public My_Preferences() {
		PageFactory.initElements(driver, this);

	}

// Craete doc Script 

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet2;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer2;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder2;

	// Search Document
	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	@FindBy(xpath = (".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_subFolder;

	// Select from Destination folder Location

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder1;

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	@FindBy(xpath = "//li[@id='adminPreferencesSettingsNav']/p")
	private WebElement AdminPreference;

	@FindBy(xpath = "//input[@id='downloadfiletype']")
	private WebElement Downloadpath;

	@FindBy(xpath = "//*[@id='adminPreferencesSubmit']")
	private WebElement AdminApply_button;

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	@FindBy(xpath = "//*[@id=\"defaultViewListNo\"]")
	private WebElement Click_Dropdown_DefaultViewing;

	@FindBy(xpath = "//*[@id=\"defaultViewListNo\"]")
	private WebElement Select_Dropdown_Convert_To_PDF;

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement Click_Search_Option;

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement closedoc;

	@FindBy(xpath = "//*[@id=\"indexPhrase1\"]")
	private WebElement Enter_Document_Name;

	@FindBy(xpath = "//*[@id=\"advFindBtnLabel\"]")
	private WebElement Find_Button;

	@FindBy(xpath = "//td[contains(text(),'My_Pereferences_Test_Doc')]")
	private WebElement Select_Document;

	@FindBy(xpath = "//*[@id=\"defaultOfficeDocViewListNo\"]")
	private WebElement Select_Office_document_Defaultviewing;

	@FindBy(xpath = "//*[@id=\"defaultOfficeDocViewListNo\"]")
	private WebElement Select_Office_document_Advancedviewing;

	@FindBy(xpath = "//*[@id=\"pageNumber\"]")
	private WebElement Search_Page_Number;

	@FindBy(xpath = "//*[@id=\"defaultViewListNo\"]")
	private WebElement Select_Dropdown_Native_Format;

	@FindBy(xpath = "//*[@id=\"viewerZoomId\"]")
	private WebElement Select_Dropdown_Fit_To_Width;

	@FindBy(xpath = "//*[@id=\"viewerZoomId\"]")
	private WebElement Select_Dropdown_Fit_To_Height;

	@FindBy(xpath = "//*[@id=\"viewerZoomId\"]")
	private WebElement Select_Dropdown_Fit_Entire_Image;

	@FindBy(xpath = "//*[@id=\"viewerZoomId\"]")
	private WebElement Select_Dropdown_Actual_Size;

	@FindBy(xpath = "//*[@id=\"createDocument\"]")
	private WebElement Click_New_Document;

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle\"]")
	private WebElement Cancel_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"docTypeList\"]")
	private WebElement Click_Document_Type_Dropdown;

	// for SQL Room
	@FindBy(xpath = "//*[@id=\"docTypeList\"]")
	private WebElement Click_Document_Type_Dropdown1;

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportName;

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
	private WebElement Browse_Option;

	@FindBy(xpath = ("//*[@id=\"addWordFile\"]"))
	private WebElement New_Word_Document_Option;

	@FindBy(xpath = "//*[@id=\"addExcelFile\"]")
	private WebElement New_Excel_Spreadsheet_Option;

	@FindBy(xpath = "//a[text()='New Pdf Document']")
	private WebElement New_pdf_Document_Option;

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_Word_File_Name;

	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement TemplateOK;

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_Excel_File_Name;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Create_button;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement AlertOK_button;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_button;

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Advancedviewing;

	@FindBy(xpath = "//*[@id=\"defaultPdfDocViewListNo\"]")
	private WebElement Pdf_document_Defaultviewing;

	@FindBy(xpath = "//*[@id=\"availableCustomStampList\"]")
	private WebElement Added_CustomStamp;

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_pdf_File_Name;

	@FindBy(xpath = "//*[@id=\"Word document automation.docx\"]/div/img")
	private WebElement Open_Word_page;

	@FindBy(xpath = "//*[@id=\"Excel document automation.xlsx\"]/div/img")
	private WebElement Open_Excel_page;

	@FindBy(xpath = "//*[@id=\"PDF document automation.pdf\"]/div/img")
	private WebElement Open_pdf_page;

	@FindBy(xpath = "//*[@id=\"dateformatid\"]")
	private WebElement Select_DateDropdown;

	@FindBy(xpath = "//*[@id=\"pdfWithOverlayOption\"]")
	private WebElement Select_PDF_with_Overlay_Disable;

	@FindBy(xpath = "//*[@id=\"pdfWithOverlayOption\"]")
	private WebElement Select_PDF_with_Overlay_Enable;

	@FindBy(xpath = "//*[@id=\"menuDropDownButton\"]/span")
	private WebElement Move_to_ViewMenu_Option_inViewer;

	@FindBy(xpath = "//*[@id=\"pdfOverlayOption\"]")
	private WebElement Verify_PDF_with_Overlay_option;

	@FindBy(xpath = "//*[@id=\"pdfOverlayOption\"]")
	private WebElement Click_PDF_with_Overlay_option;

	@FindBy(xpath = "//button[@id='messageButtonNo27']")
	private WebElement No_option;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document;

	@FindBy(xpath = "//*[@id=\"quickFindListNo\"]")
	private WebElement Select_QuickFind_DocIdSearch;

	@FindBy(xpath = "//span[normalize-space()='General']")
	private WebElement Click_general_option;

	@FindBy(xpath = "//*[@id=\"generalRow_Id\"]/td[2]")
	private WebElement Copy_Doc_Id;

	@FindBy(xpath = "//*[@id=\"quickFindListNo\"]")
	private WebElement Select_QuickFind_IndexSearch;

	@FindBy(xpath = "//*[@id=\"quickFindListNo\"]")
	private WebElement Select_QuickFind_TextSearch;

	@FindBy(xpath = "//*[@id=\"quickFindListNo\"]")
	private WebElement Select_QuickFind_Both;

	@FindBy(xpath = "//table[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportName_RedactionPassword;

	@FindBy(xpath = "//input[@id='search-text']")
	private WebElement Enter_BothValue_InSearch;

	@FindBy(xpath = "//input[@id='search-text']")
	private WebElement Enter_Text_InSearch;

	@FindBy(xpath = "//input[@id='search-text']")
	private WebElement Enter_Doc_Id_InSearch;

	@FindBy(xpath = "//input[@id='search-text']")
	private WebElement Enter_IndexValue_InSearch;

	@FindBy(xpath = "//*[@id=\"menuDropDownButton\"]/span")
	private WebElement Move_to_Annotation_Option_inViewer;

	@FindBy(xpath = "//*[@id=\"lockenable1\"]")
	private WebElement Redaction_Option;


	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas")) 

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))

	private WebElement Page;

	@FindBy(xpath = ("//div[@id='pdfViewerDiv_textLayer_0']"))
	private WebElement container;

	@FindBy(xpath = ("//*[@id=\"fabButton\"]"))
	private WebElement fabbtn;

	@FindBy(xpath = "//*[@id=\"objectName\"]")
	private WebElement objectname;

	@FindBy(xpath = "//*[@id=\"dlgInput_Input\"]")
	private WebElement input;

	@FindBy(xpath = "//*[@id=\"objectConfirmPassword\"]")
	private WebElement confirmpassword;

	@FindBy(xpath = "//*[@id=\"dlgInput_Apply\"]")
	private WebElement Apply;

	@FindBy(id = "redactionPwd")
	private WebElement Enter_RedactionPassword_MyPreferences;

	@FindBy(xpath = "//button[@id='resetmyPreferences']")
	private WebElement Reset_Button;

	@FindBy(xpath = "//*[@id=\"fileInfoButton\"]/span")
	private WebElement Click_FileInfo_Option;

	@FindBy(xpath = "//*[@id=\"fileNameLabel\"]")
	private WebElement Click_FileInfo_OkButton_withFileName;

	@FindBy(xpath = "//*[@id=\"fileRenameOK\"]")
	private WebElement RemarkOk;

	@FindBy(xpath = "//*[@id=\"defaultDownLoadAllFiles\"]")
	private WebElement Verify_DownloadAllFiles_checkbox;

	@FindBy(xpath = "//*[@id=\"pageDownload_shortcut\"]/span")
	private WebElement Download_File;

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement Download_File_OK_button;

	@FindBy(xpath = "//*[@id=\"enableDashboard\"]")
	private WebElement Verify_EnableDashboard_checkbox;

	@FindBy(xpath = "//div[@class='e-list-icon e-icons viewDocumentFromDashboard']")
	private WebElement Click_SwitchTo_DefaultView_Option;

	@FindBy(xpath = "//*[@id=\"enableDashboard\"]")
	private WebElement Verify_EnableDashboard_checkbox_Unchecked;

	// Add signature

	@FindBy(xpath = "//*[@id=\"addSignature\"]")
	private WebElement Click_AddSignature;

	@FindBy(xpath = "//*[@id=\"uploadSelected\"]")
	private WebElement Click_AddSignature_Upload;

	@FindBy(xpath = "//*[@id=\"uploadSignature\"]")
	private WebElement Click_AddSignature_Browse;

	@FindBy(xpath = "//*[@id=\"saveUploadedSignature\"]")
	private WebElement Click_AddSignature_Save;

	@FindBy(xpath = "//button[@id='uploadSignatureOk']")
	private WebElement Click_AddSignature_Yes_button;

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Signature_Upload_OkButton;

	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement okbutton;

	@FindBy(xpath = "//*[@id=\"btnSignatureAdd\"]/span[1]")
	private WebElement Click_signature_Menuoption;

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement Add_Signature_Onpage;

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement canvas;

	@FindBy(xpath = ("//*[@id=\"pdfViewerDiv_textLayer_0"))
	private WebElement AddstampOnPage;

	@FindBy(xpath = "//table[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportName_Addsignature;

	@FindBy(xpath = "//*[@id=\"typeSelected\"]")
	private WebElement signType;

	@FindBy(xpath = "//select[@id='signatureFonts']")
	private WebElement signatureFont;

	@FindBy(xpath = "//*[@id=\"signInput\"]")
	private WebElement signInput;

	@FindBy(xpath = "//option[. = 'Reenie Beanie']")
	private WebElement signatureFontOption2;

	@FindBy(xpath = "//button[@id='saveTypedSignature']")
	private WebElement savesign;

	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement signOK;

	@FindBy(xpath = "//input[@id='loadmorecount']")
	private WebElement Enter_Loadmorecount;

	@FindBy(xpath = "//*[@id=\"totalSearchCount\"]")
	private WebElement Verify_Loadmorecount_Searchresult;

	@FindBy(xpath = "//*[@id=\"docCount\"]")
	private WebElement Verify_Loadmorecount_Document_Folder;

	@FindBy(xpath = "//*[@id=\"cvModel50Ok\"]")
	private WebElement Max_Loadmorecount_OK_button;

	@FindBy(xpath = "//*[@id=\"commentMessage50\"]")
	private WebElement Max_Loadmorecount_message;

	@FindBy(xpath = "//*[@id=\"prefstableDiv\"]/ul/li[2]")
	private WebElement Select_Themes_Option;

	@FindBy(xpath = "//*[@id=\"fontsense\"]")
	private WebElement Select_Themes_Setting;

	@FindBy(xpath = "//option[. = 'Calibri']")
	private WebElement calibri;

	@FindBy(xpath = "//*[@id=\"#8bc53d\"]")
	private WebElement button;

	@FindBy(xpath = "//*[@id=\"large\"]")
	private WebElement large;

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Username;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Logout;

	@FindBy(xpath = "//*[@id=\"allAnnDropDownSpan\"]")
	private WebElement allannotation;

	@FindBy(xpath = "(//span[text()='Redaction'])[1]")
	private WebElement Redaction;

	@FindBy(xpath = "//*[contains(text(),'Highlight')]")
	private WebElement Highlight;

	@FindBy(xpath = "//*[contains(text(),'Sticky Note')]")
	private WebElement Sticky_Note;

	@FindBy(xpath = "//*[contains(text(),'Rubber Stamp')]")
	private WebElement Rubber_Stamp;

	@FindBy(xpath = "//table[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportName_Annotation;

	@FindBy(xpath = "//span[@class='icon icon-sm redactionBtnIcon']")
	private static WebElement Redaction_Annotation;

	@FindBy(xpath = "//span[@class='icon icon-sm hiliteBtnIcon']")
	private static WebElement Highlight_Annotation;

	@FindBy(xpath = "//span[@class='icon icon-sm stickyNoteBtnIcon']")
	private static WebElement Sticky_Notes_Annotation;

	@FindBy(xpath = "//*[@id=\"protectPassword\"]")
	private WebElement Protectpassword;

	@FindBy(xpath = "//*[@id=\"signaturePassword\"]")
	private WebElement Enterpassword1;

	@FindBy(xpath = "//*[@id=\"signaturePasswordConfirm\"]")
	private WebElement Enterpassword2;

	@FindBy(xpath = "//*[@id=\"proceedToSaveSignature\"]")
	private WebElement Okbutton;

	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;

	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;

	@FindBy(xpath = "//*[@id=\"signInputPassword\"]")
	private WebElement settingpassword;

	@FindBy(xpath = "//*[@id=\"verifySignaturePassword\"]")
	private WebElement settingpassok;

	@FindBy(xpath = "//*[@id=\"loadMoreDocList\"]/button")
	private WebElement Loadmorebutton;

	@FindBy(xpath = "//*[@id=\"mismatchMsg\"]")
	private WebElement error;

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement ViewDocument_Button;

	@FindBy(xpath = "//input[@class='thumbnailOptionSelected']")
	private WebElement SelectCheckbox;



	@FindBy(xpath = "//img[@class='imgP']")
	private WebElement AllPages;


	@FindBy(xpath = "//span[contains(@class,'pageMenu')]")
	private WebElement Click_Pagemenu;

	@FindBy(xpath = "//*[@id=\"copyDoc\"]")
	private WebElement Copypage;

	@FindBy(xpath = "//*[@id=\"pastDoc\"]")
	private WebElement Pastepage;



	@FindBy(xpath = "//*[@id=\"pageCount\"]")
	private WebElement Pagecount;


	@FindBy(xpath = "//*[@id=\"messageButtonCreate_as_NewOnPaste\"]")
	private WebElement createNewpage;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement Clickokbutton;

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement Save_button;

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement DocumentSave_Ok_button;

	@FindBy(xpath = "//*[@id=\"splitDocumentAnchor\"]")
	private WebElement Splitpage;

	@FindBy(xpath = "//*[@id=\"startRange\"]")
	private WebElement StartRange;

	@FindBy(xpath = "//*[@id=\"endRange\"]")
	private WebElement EndRange;

	@FindBy(xpath = "//*[@id=\"splitDocument\"]")
	private WebElement SplitOK;

	@FindBy(xpath = "//div[@id='00pagespdf_1_1_2.PDF']//input[@type='checkbox']")
	private WebElement SelectAllCheckbox;

	@FindBy(xpath = "//*[@id=\"annotationObjectBtn\"]")
	private WebElement Mergepage;

	@FindBy(xpath = "//span[@title='Document Close']")
	private WebElement Close_Document;

	@FindBy(xpath = "//*[@id=\"recentMenuBtn\"]")
	private WebElement MoveTo_Menu_Recent;

	@FindBy(xpath = "//*[@id=\"recentFolders\"]/tbody/tr[1]/td")
	private WebElement Recent_Folder;

	@FindBy(css = ".e-toast-content")
	private WebElement Toastmessage;



	@FindBy(xpath = "//*[@id=\"generalRow_Id\"]/td[2]")
	private WebElement GeneralTabDociID;


	@FindBy(xpath = "//*[@id=\"addCustomStamps\"]")
	private WebElement Register_Custom_Stamp;

	@FindBy(xpath = "//*[@id=\"addStampModel1\"]/div[1]/h2")
	private WebElement Register_Custom_Stamp_DialogTitle;

	@FindBy(xpath = "//*[@id=\"addStampModel1\"]/div[2]/div[1]/div[1]")
	private WebElement Stamp_Name;

	@FindBy(xpath = "//*[@id=\"uploadStamp\"]")
	private WebElement Stamp_fileChosen;

	@FindBy(xpath = "//*[@id=\"closeTemplateModel\"]")
	private WebElement RegisterStamp_CloseButton;

	@FindBy(xpath = "//*[@id=\"cancelStamp\"]")
	private WebElement RegisterStamp_CancelButton;

	@FindBy(xpath = "//*[@id=\"addStamp\"]")
	private WebElement RegisterStamp_AddButton;

	@FindBy(xpath = "//*[@id=\"deleteSelectedStamp\"]")
	private WebElement Delete_CustomStamp;

	@FindBy(xpath = "//*[@id=\"customStampName\"]")
	private WebElement RegisterStamp_Textbox;

	@FindBy(xpath = "//*[@id=\"menuDropDownButton\"]")
	private WebElement AnnotationMenu;

	@FindBy(xpath = "//*[@id=\"lockdisableStamp\"]")
	private WebElement Stamp;

	@FindBy(xpath = "//*[@serialno=\"2\"]/div/img")
	private WebElement Open_Second_page;

	@FindBy(xpath = "//span[contains(.,'Automation Custom Stamp')]")
	private WebElement Select_Added_Stamp;

	@FindBy(xpath = "(//ul[@class='e-menu-parent e-ul '])[2]/li[4]") // change it custom stamp postion accrodingly
																		// change final li calue
	private WebElement Select_Added_Stamp_adv;

	@FindBy(xpath = "//*[@id=\"pdfViewerDiv_annotation\"]")
	private WebElement EditAnnotation;

	@FindBy(xpath = "//span/div/ul/li/span")
	private WebElement AddStamp;

	@FindBy(xpath = ("(//ul[@class='e-menu-parent e-ul '])[1]/li[5]"))
	private WebElement AddCustomStamp;

	public WebElement getClick_Dropdown_DefaultViewing() {
		Click_Dropdown_DefaultViewing.click();
		return Click_Dropdown_DefaultViewing;
	}

	public void getSelect_Dropdown_Convert_To_PDF() {
		Select sel = new Select(Select_Dropdown_Convert_To_PDF);
		sel.selectByVisibleText("Convert To PDF");
	}

	public void getEnter_Document_Name() throws Exception {
		Enter_Document_Name.click();
		Enter_Document_Name.sendKeys(MyPreferences_excelRead(18, 0));
	}

	public void getSelect_Document() {
		Select_Document.click();
	}

	public void getSearch_Page_Number() throws InterruptedException, IOException {
		Search_Page_Number.click();
		Thread.sleep(4000);
		Search_Page_Number.clear();
		Search_Page_Number.sendKeys(CountexcelRead(1, 5));
		Thread.sleep(4000);
		Search_Page_Number.sendKeys(Keys.ENTER);

	}

	public void getSelect_Dropdown_Native_Format() {
		Select sel = new Select(Select_Dropdown_Native_Format);
		sel.selectByVisibleText("Native Format");
	}

	public void getSelect_Dropdown_Fit_To_Width() {
		Select sel = new Select(Select_Dropdown_Fit_To_Width);
		sel.selectByVisibleText("Fit To Width");
	}

	public void getSelect_Dropdown_Fit_To_Height() {
		Select sel = new Select(Select_Dropdown_Fit_To_Height);
		sel.selectByVisibleText("Fit To Height");
	}

	public void getSelect_Dropdown_Fit_Entire_Image() {
		Select sel = new Select(Select_Dropdown_Fit_Entire_Image);
		sel.selectByVisibleText("Fit Entire Image");
	}

	public void getSelect_Dropdown_Actual_Size() {
		Select sel = new Select(Select_Dropdown_Actual_Size);
		sel.selectByVisibleText("Actual Size");
	}

	public void getSelect_Office_document_Defaultviewing() {
		Select sel = new Select(Select_Office_document_Defaultviewing);

		sel.selectByVisibleText("Default viewing");

		// sel.selectByVisibleText("Default viewing");
		sel.selectByIndex(0);

	}

	public void getSelect_Office_document_Advancedviewing() {
		Select sel = new Select(Select_Office_document_Advancedviewing);

		sel.selectByVisibleText("Advanced viewing");

		// sel.selectByVisibleText("Advanced viewing");
		sel.selectByIndex(1);

	}

	public WebElement getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;
	}

	public WebElement getSelect_Document_Type_Dropdown1() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByIndex(1);
		return Click_Document_Type_Dropdown1;
	}

	public void Select_Added_CustomStamp_AdminPreferences() throws Exception {
		Select sel = new Select(Added_CustomStamp);
		sel.selectByVisibleText("Automation Custom Stamp");
	}

	public void getEnter_ReportName() throws Exception {
		WebElement ele = Enter_ReportName;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(1, 0));
	}

	public WebElement getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	SoftAssert softAssert = new SoftAssert();

	// New Word Document

	public void getNew_Word_Document_Option() {
		WebElement ele1 = New_Word_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
	}

	public void getEnter_Word_File_Name() throws Exception {
		WebElement ele = Enter_Word_File_Name;
		ele.sendKeys(MyPreferences_excelRead(2, 0));
		TemplateOK.click();

	}

	// New Excel Spreadsheet

	public void getNew_Excel_Spreadsheet_Option() {
		WebElement ele1 = New_Excel_Spreadsheet_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
	}

	public void getEnter_Excel_File_Name() throws Exception {
		WebElement ele1 = Enter_Excel_File_Name;
		ele1.sendKeys(MyPreferences_excelRead(3, 0));
		TemplateOK.click();
	}

	public void getPdf_document_Advancedviewing() {
		Select drop = new Select(Pdf_document_Advancedviewing);

		drop.selectByVisibleText("Advanced viewing");

		// drop.selectByVisibleText("Advanced viewing");
		drop.selectByIndex(1);


	}

	public void getNew_pdf_Document_Option() {
		WebElement ele1 = New_pdf_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
	}

	public void getEnter_pdf_File_Name() throws Exception {
		WebElement ele1 = Enter_pdf_File_Name;
		ele1.sendKeys(MyPreferences_excelRead(5, 0));
		driver.findElement(By.id("templateOK")).click();
	}

	public void getEnter_pdf_File_Name2page() throws Exception {
		WebElement ele1 = Enter_pdf_File_Name;
		ele1.sendKeys(MyPreferences_excelRead(1, 0));
		driver.findElement(By.id("templateOK")).click();
	}

	public void getPdf_document_Defaultviewing() throws Exception {
		Select sel = new Select(Pdf_document_Defaultviewing);

		sel.selectByVisibleText("Default viewing");

		// sel.selectByVisibleText("Default viewing");
		sel.selectByIndex(0);

	}

	public void getEnter_ReportNameDefaultview() throws Exception {
		WebElement ele = Enter_ReportName;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(4, 0));
	}

	// My preference Date Format

	public void getYYYY_MM_DD_DateFormat() throws Exception {
		Select sel = new Select(Select_DateDropdown);
		sel.selectByVisibleText("YYYY-MM-DD");
	}

	public void getDD_MM_YYYY_DateFormat() throws Exception {
		Select sel = new Select(Select_DateDropdown);
		sel.selectByVisibleText("DD-MM-YYYY");
	}

	public void getMM_DD_YYYY_DateFormat() throws Exception {
		Select sel = new Select(Select_DateDropdown);
		sel.selectByVisibleText("MM-DD-YYYY");
	}

	public void getDefault_DateFormat() throws Exception {
		Select sel = new Select(Select_DateDropdown);
		sel.selectByVisibleText("Default");
	}

	public void Verify_YYYY_MM_DD_Date() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String currentDate = sdf.format(d);
		Reporter.log("Current CREATED ON Date Format is :" + currentDate);
	}

	public void Verify_DD_MM_YYYY_Date() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String currentDate = sdf.format(d);
		Reporter.log("Current CREATED ON Date is :" + currentDate);
	}

	public void Verify_MM_DD_YYYY_Date() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String currentDate = sdf.format(d);
		Reporter.log("Current CREATED ON Date is :" + currentDate);
	}

	public void Verify_Default_Date() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String currentDateTime = sdf.format(d);
		Reporter.log("Current CREATED ON Date is :" + currentDateTime);
	}

	// PDF with Overlay

	public void getSelect_PDF_with_Overlay_Disable() throws Exception {
		Select sel = new Select(Select_PDF_with_Overlay_Disable);
		sel.selectByVisibleText("Disable");
	}

	public void getEnter_ReportNamePDFwithOverlay() throws Exception {
		WebElement ele = Enter_ReportName;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(7, 0));

	}

	public void getMove_to_ViewMenu_Option_inViewer() throws Exception {
		WebElement ele = Move_to_ViewMenu_Option_inViewer;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
	}

	public void getVerify_PDF_with_Overlay_option() throws Exception {
		Boolean ele = Verify_PDF_with_Overlay_option.isDisplayed();
		if (ele) {
			Reporter.log(" PDF with Overlay is Enable");
		} else {
			Reporter.log(" PDF with Overlay is Disable");
		}
	}

	public void getSelect_PDF_with_Overlay_Enable() throws Exception {
		Select sel = new Select(Select_PDF_with_Overlay_Enable);
		sel.selectByVisibleText("Enable");

	}

	public void getSelect_QuickFind_DocIdSearch() throws Exception {
		Select sel = new Select(Select_QuickFind_DocIdSearch);
		sel.selectByVisibleText("Doc Id Search");

	}

	public void getSelect_QuickFind_TextSearch() throws Exception {
		Select sel = new Select(Select_QuickFind_TextSearch);
		sel.selectByVisibleText("Text search");
	}

	public void getSelect_QuickFind_IndexSearch() throws Exception {
		Select sel = new Select(Select_QuickFind_IndexSearch);
		sel.selectByVisibleText("Index search");
	}

	public void getSelect_QuickFind_Both() throws Exception {
		Select sel = new Select(Select_QuickFind_Both);
		sel.selectByVisibleText("Both");
	}

	public void getVerify_Doc_Id() throws Exception {
		Reporter.log(Copy_Doc_Id.getText() + " this document ID number is showing", true);

	}

	public void getEnter_Doc_Id_InSearch() {
		Enter_Doc_Id_InSearch.clear();
		Enter_Doc_Id_InSearch.sendKeys(Copy_Doc_Id.getText());
		Enter_Doc_Id_InSearch.sendKeys(Keys.ENTER);

	}

	public void getEnter_Text_InSearch() throws Exception {
		WebElement ele = Enter_Text_InSearch;
		ele.click();
		ele.clear();
		Thread.sleep(4000);
		ele.sendKeys(MyPreferences_excelRead(9, 0));
		Thread.sleep(4000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(4000);

	}

	public void ViewExpandNodes() throws Exception {

		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
	}

	public void getEnter_IndexValue_InSearch() throws Exception {
		WebElement ele = Enter_IndexValue_InSearch;
		ele.clear();
		Thread.sleep(4000);
		ele.sendKeys(MyPreferences_excelRead(10, 0));
		Thread.sleep(4000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(4000);

	}

	public void getEnter_BothValue_InSearch() throws Exception {
		WebElement ele = Enter_BothValue_InSearch;
		ele.clear();
		Thread.sleep(4000);
		ele.sendKeys(MyPreferences_excelRead(10, 0));
		Thread.sleep(4000);
		ele.sendKeys(Keys.ENTER);
	}

	public void getEnter_ReportName_RedactionPassword() throws Exception {
		WebElement ele = Enter_ReportName_RedactionPassword;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(12, 0));
	}

	public void getMove_to_Annotation_Option_inViewer() throws Exception {
		WebElement ele = Move_to_Annotation_Option_inViewer;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

	}

	public void getRedaction_Option() throws Exception {
		WebElement ele1 = Redaction_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
	}

	public void getSet_Redaction_ToDocument() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Page;
		action.dragAndDropBy(element, 400, 150).build().perform();
		jsclick(Page);
		Thread.sleep(3000);
		objectname.sendKeys(MyPreferences_excelRead(13, 0));
		Thread.sleep(3000);
		jsclick(input);
		Thread.sleep(5000);
		input.sendKeys(MyPreferences_excelRead(13, 0));
		Thread.sleep(5000);
		jsclick(confirmpassword);
		Thread.sleep(5000);
		confirmpassword.sendKeys(MyPreferences_excelRead(13, 0));
		Thread.sleep(3000);
		jsclick(Apply);

	}

	public void getEnter_RedactionPassword_MyPreferences() throws Exception {
		WebElement ele = Enter_RedactionPassword_MyPreferences;
		ele.clear();
		ele.sendKeys(MyPreferences_excelRead(13, 0));

	}

	public void getReset_Button() throws Exception {
		jsclick(Reset_Button);

	}

	// File Information
	public void getClick_FileInfo_Option() {
		jsclick(Click_FileInfo_Option);
	}

	public void getClick_FileInfo_OkButton_withFileName() {
		WebElement Filename = Click_FileInfo_OkButton_withFileName;
		Reporter.log(Filename.getText() + " this name should show", true);
		WebElement ele = RemarkOk;
		ele.click();
	}

// Download All files

	public void getVerify_DownloadAllFiles_checkbox() throws Exception {
		if (Verify_DownloadAllFiles_checkbox.isSelected() == False) {
			Verify_DownloadAllFiles_checkbox.click();
		}
	}

	public void getDownload_File() throws Exception {
		jsclick(Download_File);
	}

	public void getDownload_File_OK_button() throws Exception {
		jsclick(Download_File_OK_button);

	}
	// Enable Dashboard

	public void getVerify_EnableDashboard_checkbox() throws Exception {
		if (Verify_EnableDashboard_checkbox.isSelected() == False) {
			Verify_EnableDashboard_checkbox.click();
		}
	}

	public void getVerify_EnableDashboard_checkbox_Unchecked() throws Exception {
		if (Verify_EnableDashboard_checkbox_Unchecked.isSelected() == true) {
			Verify_EnableDashboard_checkbox_Unchecked.click();
		}

	}
// ADD Signature 

	public void getClick_AddSignature() throws Exception {
		jsclick(Click_AddSignature);

	}

	public void getClick_AddSignature_Upload() throws Exception {
		jsclick(Click_AddSignature_Upload);
	}


	@FindBy(xpath = "//*[@id=\"uploadSignatureOk\"]")

	@FindBy(xpath = "//button[@id='saveUploadedSignature']") 

	private WebElement Overidesignature;

	public void getClick_AddSignature_Save() throws Exception {
		try {
			jsclick(Overidesignature);
		} catch (Exception e) {
			// Uploaded
		}

		jsclick(Click_AddSignature_Save);


	}

	public void getClick_AddSignature_Yes_button() throws Exception {
		jsclick(Click_AddSignature_Yes_button);
	}

	public void getSignature_Upload_OkButton() throws Exception {
		WebElement sel = Signature_Upload_OkButton;
		Reporter.log("The Successfully:" + sel.getText() + " this message should show", true);
		WebElement ok = okbutton;
		ok.click();
	}

	public void getClick_signature_Menuoption() throws Exception {
		jsclick(Click_signature_Menuoption);
	}

	public void getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Signature_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();
	}

	public void getEnter_ReportName_Addsignature() throws Exception {
		WebElement ele = Enter_ReportName_Addsignature;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(18, 0));
	}

	public void getEnter_ReportName_LeadViewRegister_Custom_Stamp() throws Exception {
		WebElement ele = Enter_ReportName_Addsignature;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(20, 0));
	}

	public void getEnter_ReportName_AdvancedViewRegister_Custom_Stamp() throws Exception {
		WebElement ele = Enter_ReportName_Addsignature;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(21, 0));
	}

	public void getsignatureFont() throws Exception {
		movingclkElement(signatureFont);
		{
			WebElement dropdown = signatureFont;
			jsclick(dropdown.findElement(By.xpath("//option[. = 'Parisienne']")));
		}
	}

	public void getsignInput() throws Exception {
		jsclick(signInput);
		signInput.sendKeys(MyPreferences_excelRead(15, 0));
	}

	public void getsignatureFontOption2() throws Exception {
		signatureFont.click();
		{
			WebElement dropdown = signatureFont;
			dropdown.findElement(By.xpath("//option[. = 'Reenie Beanie']")).click();
		}
	}

	public void getsavesigntype() throws Exception {
		jsclick(savesign);
		Thread.sleep(4000);
		jsclick(signOK);
	}

	// verify minimum Load More count

	public void getVerify_Loadmorecount_Searchresult1() throws Exception {

		String expectcount = "Search result : 10";
		String actualcount = Verify_Loadmorecount_Searchresult.getText();
		softAssert.assertEquals(actualcount, expectcount);
		Reporter.log("The " + Verify_Loadmorecount_Searchresult.getText() + " this count is shows on search result",
				true);
	}

	public void getVerify_Loadmorecount_Searchresult2() throws Exception {

		String expectcount = "Search result : 20";
		String actualcount = Verify_Loadmorecount_Searchresult.getText();
		softAssert.assertEquals(actualcount, expectcount);
		Reporter.log("The " + Verify_Loadmorecount_Searchresult.getText() + " this count is shows on search result",
				true);
	}

	public void getVerify_Loadmorecount_Document_Folder1() throws Exception {

		String expectcount = "Showing 10 documents in folder.";
		String actualcount = Verify_Loadmorecount_Document_Folder.getText();
		softAssert.assertEquals(actualcount, expectcount);
		Reporter.log("The " + Verify_Loadmorecount_Document_Folder.getText()
				+ " this count is shows on Folder search result", true);
	}

	public void getVerify_Loadmorecount_Document_Folder2() throws Exception {

		String expectcount = "Showing 20 documents in folder.";
		String actualcount = Verify_Loadmorecount_Document_Folder.getText();
		softAssert.assertEquals(actualcount, expectcount);
		Reporter.log("The " + Verify_Loadmorecount_Document_Folder.getText()
				+ " this count is shows on Folder search result", true);
	}

	// Verify Maximum load more count

	public void getVerify_maxLoadmorecount_Searchresult1() throws Exception {

		String expectcount = "Search result : 60";
		String actualcount = Verify_Loadmorecount_Searchresult.getText();
		softAssert.assertEquals(actualcount, expectcount);
		Reporter.log("The " + Verify_Loadmorecount_Searchresult.getText() + " this count is shows on search result",
				true);
	}

	public void getVerify_maxLoadmorecount_Searchresult2() throws Exception {

		String expectcount = "Search result : 120";
		String actualcount = Verify_Loadmorecount_Searchresult.getText();
		softAssert.assertEquals(actualcount, expectcount);
		Reporter.log("The " + Verify_Loadmorecount_Searchresult.getText() + " this count is shows on search result",
				true);
	}

	public void getVerify_maxLoadmorecount_Document_Folder1() throws Exception {

		String expectcount = "Showing 60 documents in folder.";
		String actualcount = Verify_Loadmorecount_Document_Folder.getText();
		softAssert.assertEquals(actualcount, expectcount);
		Reporter.log("The " + Verify_Loadmorecount_Document_Folder.getText()
				+ " this count is shows on Folder search result", true);
	}

	public void getVerify_maxLoadmorecount_Document_Folder2() throws Exception {

		String expectcount = "Showing 120 documents in folder.";
		String actualcount = Verify_Loadmorecount_Document_Folder.getText();
		softAssert.assertEquals(actualcount, expectcount);
		Reporter.log("The " + Verify_Loadmorecount_Document_Folder.getText()
				+ " this count is shows on Folder search result", true);
	}

	public void getEnter_Maximum_Loadmorecount() throws Exception {
		Enter_Loadmorecount.clear();
		Enter_Loadmorecount.sendKeys(CountexcelRead(2, 4));
	}

	public void getEnter_Minimum_Loadmorecount() throws Exception {
		Enter_Loadmorecount.clear();
		Enter_Loadmorecount.sendKeys(CountexcelRead(1, 4));
	}

	public void getMax_Loadmorecount_OK_button() throws Exception {
		Reporter.log(Max_Loadmorecount_message.getText() + "this message should display", true);
		jsclick(Max_Loadmorecount_OK_button);

	}

	// My Preferences Themes

	public void getSelect_Themes_Option() throws Exception {
		jsclick(Select_Themes_Option);
	}

	public void getSelect_Themes_Setting() throws Exception {

		Select sel = new Select(Select_Themes_Setting);
		sel.selectByVisibleText("Calibri");
		jsclick(button);
		Thread.sleep(4000);
		jsclick(large);
	}

	// Annotation

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

	public void getEnter_ReportName_Annotation() throws Exception {
		WebElement ele = Enter_ReportName_Annotation;
		ele.click();
		ele.sendKeys(MyPreferences_excelRead(16, 0));
	}

	public void getVerify_AnnotationDropdown1_Option_enable() throws InterruptedException {

		Boolean Ann1 = Redaction_Annotation.isEnabled();
		if (Ann1) {
			Reporter.log("Redaction_Annotation option is Enable");
		} else {
			Reporter.log("Redaction_Annotation option is Disable");
		}

		Boolean Ann2 = Highlight_Annotation.isEnabled();
		if (Ann2) {
			Reporter.log("Highlight_Annotation option from button is Enable");
		} else {
			Reporter.log("Highlight_Annotation option from button is Disable");
		}

		Boolean Ann3 = Sticky_Notes_Annotation.isEnabled();
		if (Ann3) {
			Reporter.log("Sticky_Notes_Annotation option from button is Enable");
		} else {
			Reporter.log("Sticky_Notes_Annotation option from button is Disable");
		}
	}

	public void getclickProtectpassword() throws Exception {
		jsclick(Protectpassword);
	}

	public void getEnterpassword() throws Exception {


		Thread.sleep(4000);
		jsclick(Enterpassword1);
		Enterpassword1.sendKeys(MyPreferences_excelRead(13, 0));
		Thread.sleep(5000);

		Thread.sleep(2000);
		jsclick(Enterpassword1);
		Enterpassword1.sendKeys(MyPreferences_excelRead(13, 0));
		Thread.sleep(2000);

		jsclick(Enterpassword2);
		Enterpassword2.sendKeys(MyPreferences_excelRead(13, 0));
		Thread.sleep(1000);
		jsclick(Okbutton);
	}

	public void getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys(MyPreferences_excelRead(13, 0));
		jsclick(verifypassok);

	}

	public void getsettingpass() throws Exception {
		jsclick(settingpassword);
		Thread.sleep(5000);
		settingpassword.sendKeys(MyPreferences_excelRead(13, 0));
		jsclick(settingpassok);

	}

	// Redaction Negative

	public void getvalidate_Redaction_Emptypassword() throws Exception {

		Actions action = new Actions(driver);
		WebElement element = Page;
		action.dragAndDropBy(element, 400, 150).build().perform();
		jsclick(Page);
		Thread.sleep(3000);
		jsclick(Apply);
	}

	public void getmessagevalidation1() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Password can't be empty !";
		String actualtext = error.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(error.getText() + " this validation message should show", true);
	}

	public void getenter_Password() throws Exception {
		objectname.sendKeys(MyPreferences_excelRead(13, 0));
		Thread.sleep(3000);
		jsclick(input);
		Thread.sleep(5000);
		input.sendKeys(MyPreferences_excelRead(13, 0));
		Thread.sleep(5000);
		jsclick(Apply);
		Thread.sleep(5000);
	}

	public void getmessagevalidate2() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Password mismatch !";
		String actualtext = error.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(error.getText() + " this validation message should show", true);
	}

	public void getenter_Confirmpassword() throws Exception {
		jsclick(confirmpassword);
		Thread.sleep(5000);
		confirmpassword.sendKeys(MyPreferences_excelRead(17, 0));
		Thread.sleep(3000);
		jsclick(Apply);
	}

	public void getenter_validpassword() throws Exception {
		input.clear();
		Thread.sleep(5000);
		input.sendKeys(MyPreferences_excelRead(13, 0));
		Thread.sleep(5000);
		confirmpassword.clear();
		Thread.sleep(5000);
		confirmpassword.sendKeys(MyPreferences_excelRead(13, 0));
		Thread.sleep(3000);
		jsclick(Apply);
	}

	public void getEnter_InvalidRedactionPassword_MyPreferences() throws Exception {

		Enter_RedactionPassword_MyPreferences.clear();
		Enter_RedactionPassword_MyPreferences.sendKeys(MyPreferences_excelRead(17, 0));
	}

	public void getReset_InvalidRedactionPassword_MyPreferences() throws Exception {
		Enter_RedactionPassword_MyPreferences.clear();
	}

	public void getPastepage() {
		jsclick(createNewpage);
	}

	public void getEnter_SplitPageNumber() throws Exception {

		StartRange.sendKeys(CountexcelRead(2, 5));
		Thread.sleep(5000);
		EndRange.sendKeys(CountexcelRead(1, 5));
		jsclick(SplitOK);
	}

	public void getMoveTo_Menu_Recent() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Recent).perform();
	}

	public void getToastmessage() {
		Reporter.log(Toastmessage.getText() + " this toast message should show", true);

	}

	// Create 2000 Document Script

	public void Create_2000_Documents() throws Exception {

		Refresh_Button();
		Thread.sleep(6000);
		jsclick(Click_New_Document);
		Thread.sleep(5000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(5000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(Select_Cabinet2);
		Thread.sleep(5000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer2);
		Thread.sleep(3000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder2);
		Thread.sleep(5000);
		Reporter.log("select a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(4000);
		Reporter.log("Click on Ok button ", true);
		getSelect_Document_Type_Dropdown1();
		Thread.sleep(4000);
		Reporter.log("Select Value from Document type dropdown", true);
		getEnter_ReportName();
		Thread.sleep(3000);
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(5000);
		Reporter.log("Browse a Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PdfDoc\\FileUploadUpdate.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		movingclkElement(Create_button);
		Thread.sleep(4000);
		Reporter.log("Click on Create button", true);
		jsclick(ViewDocument_Button);
		Thread.sleep(6000);
		Reporter.log("Click on View button", true);

	}

	// Negative Redaction Password Script

	public void Verify_Redaction_View_Password() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Redaction View Password", true);
		try {
			Thread.sleep(3000);
			jsclick(Navigate_button);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Click navigation
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		jsclick(Click_New_Document);
		Thread.sleep(6000);
		Reporter.log("Click on New Documents Tab", true);
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
		Reporter.log("select a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		Reporter.log("Select value from Document type Dropdown", true);
		getEnter_ReportName_RedactionPassword();
		Reporter.log("Enter a Report Name", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		getMove_to_Annotation_Option_inViewer();
		Thread.sleep(6000);
		Reporter.log("Move to  Annotation Option in Viewer", true);
		getRedaction_Option();
		Thread.sleep(6000);
		Reporter.log("Click on Redaction option", true);
		getvalidate_Redaction_Emptypassword();
		Thread.sleep(6000);
		Reporter.log("Verified Redaction empty password", true);
		getmessagevalidation1();
		Thread.sleep(6000);
		Reporter.log("Verified Validation message", true);
		getenter_Password();
		Thread.sleep(6000);
		Reporter.log("Enter Invalid Password", true);
		getmessagevalidate2();
		Thread.sleep(6000);
		Reporter.log("Verified Validation message", true);
		getenter_Confirmpassword();
		Thread.sleep(6000);
		Reporter.log("Enter Invalid Confirm password", true);
		getmessagevalidate2();
		Thread.sleep(6000);
		Reporter.log("Verified Validation message", true);
		getenter_validpassword();
		Thread.sleep(6000);
		Reporter.log("Enter Valid password", true);
		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_button);
		Thread.sleep(6000);
		Reporter.log("Click on Navigate button", true);
		Reporter.log("Redaction view password validation Verified", true);
	}

	public void Verify_InvalidRedaction_View_Password() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying Invalid Redaction View Password", true);
		try {
			Thread.sleep(3000);
			jsclick(Navigate_button);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Click navigation
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}

		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My preferences option", true);
		getEnter_InvalidRedactionPassword_MyPreferences();
		Thread.sleep(6000);
		Reporter.log("Enter Invalid Redaction password under Textbox", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Open_Document);
		Thread.sleep(6000);
		Reporter.log("Open Redaction added Document", true);
		Reporter.log("Invalid Redaction verified in My preferences.", true);
	}

	public void Verify_ResetInvalidPassword_My_Preferences() throws Exception {

		Reporter.log("Test Scenario 3 : Verifying Reset Invalid Password My Preferences", true);
		try {
			Thread.sleep(3000);
			jsclick(Navigate_button);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Click navigation
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getReset_InvalidRedactionPassword_MyPreferences();
		Thread.sleep(6000);
		Reporter.log("Reset Invalid Password", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Reporter.log("Reset Invalid Reset Password Successfully", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	// Split and Merge Document


	public void Create_PDF_Document() throws Exception {

		Reporter.log("Test Scenario 1: Verifying  Create new Pdf document", true);

	public void Create_Documents_SplitMerge() throws Exception {

		Reporter.log("Test Scenario 1: Verifying  Create new documents for Split & Merge", true);

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		try {
			Thread.sleep(3000);
			jsclick(Navigate_button);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Click navigation
		}
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(4000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(4000);
		Reporter.log("Click on My preferences option", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		Reporter.log("Select Office document and set Default view Option", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		Reporter.log("Select Pdf document and set Default view Option", true);
		movingclkElement(Apply_button);
		Thread.sleep(4000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_New_Document);
		Thread.sleep(5000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(5000);
		Reporter.log("Click on Destination Folder Checkbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(4000);
		Reporter.log("Expand a cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(4000);
		Reporter.log("Expand a drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(4000);
		Reporter.log("select a folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(4000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(4000);
		Reporter.log("Select Document type dropdown value", true);
		getEnter_ReportName();
		Thread.sleep(2000);
		Reporter.log("Enter value into Report name field", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(5000);
		Reporter.log("Browse Document page", true);

		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");

		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadSplitMerge.exe");

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(4000);
		Reporter.log("By using AutoIT add file from external folder", true);
		movingclkElement(Create_button);
		Thread.sleep(4000);
		Reporter.log("Click on Create button", true);
		jsclick(ViewDocument_Button);
		Thread.sleep(9000);
		Reporter.log("Click on View document option", true);

		Reporter.log("PDF is created successfully", true);
	}

	public void Verify_CopyPaste_Viewer() throws Exception {

		Reporter.log("Document is created successfully", true);
	}

	public void Select_PdfPage_SplitAll() throws Exception {

		Reporter.log("Test Scenario 3: Verify selected page is pdf or not and do Split All pages for pdf document",
				true);


		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}

		Reporter.log("Test Scenario 2: Verifying  Copy and Paste from Viewer menu option", true);
		Thread.sleep(4000);
		jsclick(SelectCheckbox);
		Thread.sleep(6000);
		Reporter.log("Select First page Thumbnail", true);
		movingclkElement(Click_Pagemenu);
		Thread.sleep(4000);
		Reporter.log("Click on Page menu option", true);
		jsclick(Copypage);
		Thread.sleep(4000);
		Reporter.log("Click on Copy option", true);
		jsclick(Clickokbutton);
		Thread.sleep(4000);
		Reporter.log("Click on Ok button", true);
		jsclick(Click_Pagemenu);
		Thread.sleep(4000);
		Reporter.log("Click on Page menu option", true);
		jsclick(Pastepage);
		Thread.sleep(4000);
		Reporter.log("Click on Paste option", true);
		jsclick(Clickokbutton);
		Thread.sleep(4000);
		Reporter.log("Click on Ok button", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save menu option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(4000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Copy and paste document Verifying successfully", true);


		// Verify and Print total Number of Pages Present in Document

		Thread.sleep(9000);
		List<WebElement> files = driver.findElements(By.xpath("//input[@class='thumbnailOptionSelected']"));
		int fileCount = files.size();
		Reporter.log("Number of files present: " + fileCount, true);

		// Verify and Select Only pdf file type for Split

		List<WebElement> pages = driver.findElements(By.xpath("//div[@class='ThumbnailHolder']"));

		for (WebElement doc : pages) {

			String href = doc.getAttribute("title");
			if (href.endsWith(".pdf")) {
				// Click the pdf if it ends with .pdf
				doc.click();

				Thread.sleep(3000);

				// String regex = "^[0-9]";

				String pagecounttext = Pagecount.getAttribute("value");
				System.out.println(pagecounttext);
			}
		}

	}

	public void Verify_Split_Merge_Viewer() throws Exception {

		Reporter.log("Test Scenario 3: Verifying  Split and Merge from Viewer menu option", true);

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}



		List<WebElement> elements = driver.findElements(By.xpath("(//img[@class='imgP'])"));

		int size = elements.size();

		// String regex = "^[0-9]";

		String pagecounttext = Pagecount.getAttribute("value");

		System.out.println(pagecounttext);

		// / 9

		// int pagenumbers = Pagecount.size();

		for (WebElement doc : elements) {

			String text = doc.getAttribute("title");

			if (text.endsWith(".PDF")) {

			}

			WebElement Sel = driver.findElement(By.xpath("(//img[@class='imgP'])[1]"));
			Sel.click();
			System.out.println("File extention is found PDF and file is selected");

		}


		jsclick(SelectCheckbox);
		Thread.sleep(4000);
		Reporter.log("Select Frst page Thumbnail", true);
		jsclick(Click_Pagemenu);
		Thread.sleep(4000);
		Reporter.log("Click on Page menu option", true);
		jsclick(Splitpage);
		Thread.sleep(6000);
		Reporter.log("Click on Split option", true);
		getEnter_SplitPageNumber();
		Thread.sleep(4000);
		Reporter.log("Enter value in  From and To page number", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on save menu option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(4000);
		Reporter.log("Click on Ok button", true);
		jsclick(SelectCheckbox);
		Thread.sleep(4000);
		Reporter.log("Select Second page Thumbnail", true);
		jsclick(SelectAllCheckbox);
		Reporter.log("Select Anor Document from Thumbnail", true);
		jsclick(Click_Pagemenu);
		Thread.sleep(4000);
		Reporter.log("Click on Page Menu option", true);
		jsclick(Mergepage);
		Thread.sleep(4000);
		Reporter.log("Click on Merge option", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save menu option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(4000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Split and Merge Documents Verifying successfully", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	// Add signature Script

	public void Verify_Upload_New_Signature() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Upload New Signature", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);


		Reporter.log("Click on Refresh button", true);

		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office document and set as Default view", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf document and set as Default view", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getClick_AddSignature();
		Thread.sleep(6000);
		Reporter.log("Click on Add signature button", true);
		try {
			getsettingpass();
			Thread.sleep(4000);
			Reporter.log("Enter a Password", true);
		} catch (Exception e) {
			System.out.println("signature is not password protected...");
		}
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Click_AddSignature_Upload));
		getClick_AddSignature_Upload();
		Thread.sleep(4000);

		getclickProtectpassword();
		Thread.sleep(6000);
		Reporter.log("Check on Protect password Icon", true);


		Actions act = new Actions(driver);
		act.moveToElement(Click_AddSignature_Browse).click().build().perform();
		Thread.sleep(6000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\UploadSignature.exe");
		Reporter.log("By using AutoIT add file from external folder", true);

		Thread.sleep(6000);
		getClick_AddSignature_Save();
		Thread.sleep(6000);
		Reporter.log("Click on Save button", true);
		getEnterpassword();
		Thread.sleep(6000);
		Reporter.log("Enter a Password", true);
		getSignature_Upload_OkButton();
		Thread.sleep(6000);
		Reporter.log("Click on Upload button", true);

		Thread.sleep(8000);
		getclickProtectpassword();
		Thread.sleep(6000);
		Reporter.log("Check on Protect password Icon", true);
		getClick_AddSignature_Save();
		Thread.sleep(2000);
		jsclick(Signature_Upload_OkButton);
		
		try {
			Reporter.log("Click on Save button", true);
			getEnterpassword();
			Thread.sleep(6000);
			Reporter.log("Enter a Password", true);
			getSignature_Upload_OkButton();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		

		Reporter.log("New signature Upload Successfully", true);
		jsclick(Click_New_Document);
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
		Reporter.log("select a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);
		Reporter.log("Select Document type dropdown", true);
		getEnter_ReportName_Addsignature();
		Thread.sleep(5000);
		Reporter.log("Enter value Report Name field", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("By using AutoIT add file from external folder", true);

		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		getClick_signature_Menuoption();
		Thread.sleep(6000);
		Reporter.log("Click on signature menu Option", true);

		getinputpassword();
		Thread.sleep(6000);
		Reporter.log("Enter a Password", true);

		try {
			getinputpassword();
			Thread.sleep(6000);
			Reporter.log("Enter a Password", true);
		} catch (Exception e) {
			System.out.println("Signature is not password protected");
		}

		getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Reporter.log("New signature added Successfully on  Document", true);
		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_button);
		Reporter.log("New Document Created successfully with signature", true);

	}

	public void Verify_Type_New_Signature() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying New Signature Type ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);


		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office document and set as Default view", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf document and set as Default view", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);

		getClick_AddSignature();
		Thread.sleep(6000);
		Reporter.log("Click on Add Signature button", true);
		try {
			getsettingpass();
			Thread.sleep(6000);
			Reporter.log("Enter a Password", true);
		} catch (Exception e) {
			System.out.println("signature is not password protected...");
		}
		jsclick(signType);
		Thread.sleep(6000);
		Reporter.log("Select sign type", true);
		getclickProtectpassword();
		Thread.sleep(6000);
		Reporter.log("Check Password Protect Icon", true);
		getsignatureFont();
		Thread.sleep(6000);
		Reporter.log("Select signature Font", true);
		getsignInput();
		Thread.sleep(6000);
		Reporter.log("Enter  Signature Name", true);
		getsignatureFontOption2();
		Thread.sleep(6000);
		Reporter.log("Select again New Signature Font", true);
		getsignInput();
		Thread.sleep(6000);
		Reporter.log("Enter signature Name", true);
		getsavesigntype();
		Thread.sleep(6000);
		Reporter.log("Click on Save button", true);
		getEnterpassword();
		Thread.sleep(6000);
		Reporter.log("Enter a Password", true);
		getSignature_Upload_OkButton();
		Thread.sleep(6000);
		Reporter.log("Click on the Upload button", true);
		jsclick(Click_New_Document);
		Thread.sleep(6000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder textbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		Reporter.log("Select document type dropdown", true);
		getEnter_ReportName_Addsignature();
		Thread.sleep(5000);
		Reporter.log("Enter Report name", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		getClick_signature_Menuoption();
		Thread.sleep(6000);
		Reporter.log("Click on Signature menu Option", true);
		getinputpassword();
		Thread.sleep(6000);
		Reporter.log("Enter a Password", true);
		getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Reporter.log("New signature type added Successfully on  Document", true);
		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_button);
		Reporter.log("New Document Created successfully with signature type ", true);
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	// Add and Verify Annotation on Viewer

	public void Verify_Maximum_Annotation() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Maximum Annotation ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		jsclick(allannotation);
		Thread.sleep(6000);
		Reporter.log("Click on Annotation", true);
		Select_Annotation_Dropdown1();
		Thread.sleep(2000);
		Reporter.log("Select Annotation value", true);
		getToastmessage();
		Reporter.log("Verified maximum annotation error message", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		LogoutPage();
		LogDipakUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with User credential ", true);

	}

	public void Verify_set_Annotation() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying set Annotation ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Click_New_Document);
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
		Reporter.log("select a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		Reporter.log("Select Document type Dropdown", true);
		getEnter_ReportName_Annotation();
		Reporter.log("Enter value Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(5000);
		Reporter.log("Browse a Document", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(9000);
		getVerify_AnnotationDropdown1_Option_enable();
		Thread.sleep(6000);
		Reporter.log("Verified Added annotation enable from menu", true);
		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_button);
		Reporter.log("New Document Created successfully with verifying Annotation", true);
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	// Date Format verification Script

	public void Verify_DateFormat_YYYY_MM_DD() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Date Format YYYY_MM_DD ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
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
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getYYYY_MM_DD_DateFormat();
		Thread.sleep(6000);
		Reporter.log("Select Date Format and set as YYYY_MM_DD", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		Verify_YYYY_MM_DD_Date();
		Thread.sleep(6000);
		Reporter.log("Verified showing date format YYYY_MM_DD", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		Verify_YYYY_MM_DD_Date();
		Thread.sleep(6000);
		Reporter.log("Verified DateFormat YYYY-MM-DD on Search and Folder Documents List", true);

	}

	public void Verify_DateFormat_DD_MM_YYYY() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying Date Format DD_MM_YYYY ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on  Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		getDD_MM_YYYY_DateFormat();
		Thread.sleep(6000);
		Reporter.log("Select Date Format and set as DD_MM_YYYY", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		Verify_DD_MM_YYYY_Date();
		Thread.sleep(6000);
		Reporter.log("Verified showing Date format DD_MM_YYYY", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		Verify_DD_MM_YYYY_Date();
		Thread.sleep(6000);
		Reporter.log("Verified DateFormat DD-MM-YYYY on Search and Folder Documents List", true);

	}

	public void Verify_DateFormat_MM_DD_YYYY() throws Exception {

		Reporter.log("Test Scenario 3 : Verifying Date Format MM_DD_YYYY ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getMM_DD_YYYY_DateFormat();
		Thread.sleep(6000);
		Reporter.log("Select Date Format and set as MM_DD_YYYY", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		Verify_MM_DD_YYYY_Date();
		Thread.sleep(6000);
		Reporter.log("Verified showing MM_DD_YYYY Date FormatClic", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		Verify_MM_DD_YYYY_Date();
		Thread.sleep(6000);
		Reporter.log("Verified DateFormat MM-DD-YYYY on Search and Folder Documents List", true);

	}

	public void Verify_DateFormat_Default() throws Exception {

		Reporter.log("Test Scenario 4 : Verifying Date Format Default ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getDefault_DateFormat();
		Thread.sleep(6000);
		Reporter.log("Select Date Format and set as Default", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		Verify_Default_Date();
		Thread.sleep(6000);
		Reporter.log("Verified Default Date Format shwoing successfully", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		getMoveTo_Menu_Recent();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Recent Tab", true);
		jsclick(Recent_Folder);
		Thread.sleep(6000);
		Reporter.log("Click on Recent Folder", true);
		Verify_Default_Date();
		Thread.sleep(6000);
		Reporter.log("Verified DateFormat Default on Search and Folder Documents List", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

// Default View Native / Covert To pdf.

	public void Verify_Defaultviewing_Convert_To_PDF() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Default viewing Convert To PDF", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);

		getClick_Dropdown_DefaultViewing();
		Thread.sleep(6000);
		Reporter.log("Select Default view ", true);

		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office document and set as Default view", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf document and set as Default view", true);

		getSelect_Dropdown_Convert_To_PDF();
		Thread.sleep(6000);
		Reporter.log("Select Convert To Pdf Option", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		getEnter_Document_Name();
		Thread.sleep(6000);
		Reporter.log("Enter Document Name", true);
		jsclick(Find_Button);
		Thread.sleep(12000);
		Reporter.log("Click on Find button", true);
		getSelect_Document();
		Reporter.log("Select and Open Document", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 40);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}

		Thread.sleep(30000);

		Thread.sleep(50000);

		getSearch_Page_Number();
		Thread.sleep(6000);
		Reporter.log("Enter page number", true);
		movingclkElement(closedoc);
		Thread.sleep(6000);
		Reporter.log("Defaultviewing Convert To PDF Format verified successfully", true);

	}

	public void Verify_Defaultviewing_Native_Format() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying Default viewing Native Format ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		getClick_Dropdown_DefaultViewing();
		Thread.sleep(6000);
		Reporter.log("Select Default View", true);
		getSelect_Dropdown_Native_Format();
		Thread.sleep(6000);
		Reporter.log("Select Native Formatio Option", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		getEnter_Document_Name();
		Thread.sleep(6000);
		Reporter.log("Enter Document Name", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		getSelect_Document();
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		movingclkElement(closedoc);
		Thread.sleep(6000);
		Reporter.log("Defaultviewing Native Format verified successfully", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	// File Download

	public void Verify_Download_All_Files() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Download All Files ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}




		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		LogoutPage();
		LoginAdminUser();
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		movingclkElement(AdminPreference);
		Thread.sleep(6000);
		Reporter.log("Click on Admin preferences", true);
		Downloadpath.clear();
		Downloadpath.sendKeys("pdf;tif;tiff;jpg;png;docx;doc");
		Reporter.log("Enter all valid file type for downlod file", true);
		Thread.sleep(6000);
		movingclkElement(AdminApply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		LogoutPage();
		LogDipakUser();
		Thread.sleep(4000);




		Refresh_Button();
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		getVerify_DownloadAllFiles_checkbox();
		Thread.sleep(6000);
		Reporter.log("Check Download all file checkbox", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		getEnter_Document_Name();
		Thread.sleep(6000);
		Reporter.log("Enter Document Name", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		getSelect_Document();
		Reporter.log("Select and Open Document page", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		getDownload_File();
		Thread.sleep(6000);
		Reporter.log("Click on Download Menu Option", true);
		Reporter.log("All files should be Downloaded successfully", true);
		movingclkElement(closedoc);
		Thread.sleep(4000);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);



		// Verify Download Path

		File directory = new File("C:\\Users\\dipak.p\\Downloads");
		boolean downloadinFilePresence = false;
		File[] filesList = null;
		LOOP: while (true) {
			filesList = directory.listFiles();
			for (File file : filesList) {
				downloadinFilePresence = file.getName().contains(".zip");
			}
			if (downloadinFilePresence) {
				for (; downloadinFilePresence;) {
					Thread.sleep(5000);
					continue LOOP;
				}
			} else {
				break;
			}
		}


	}

	// Enable Dashboard

	public void Verify_Enable_Dashboard() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Enable Dashboard Set from My preferences ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
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
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getVerify_EnableDashboard_checkbox();
		Thread.sleep(6000);
		Reporter.log("Check Enable Dashboard Chekbox", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		LogoutPage();
		LogDipakUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with User credential", true);
		movingclkElement(Click_SwitchTo_DefaultView_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Switch to Default view Option", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		getVerify_EnableDashboard_checkbox_Unchecked();
		Thread.sleep(6000);
		Reporter.log("Uncheck Enable Dashboard Checkbox", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Reporter.log("Enable Dashboard Functionality Verified Successfully", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);

	}

	// Load more count on Document List and Search

	public void Verify_Load_MoreCount_On_Search() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Load More Count On Search ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getEnter_Minimum_Loadmorecount();
		Thread.sleep(6000);
		Reporter.log("Enter Load more count value", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		try {
			getMax_Loadmorecount_OK_button();
		} catch (Exception e) {
			System.out.println("Load more Alert not showing");
		}
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		jsclick(Find_Button);
		Thread.sleep(15000);
		Reporter.log("Click on Find button", true);
		getVerify_Loadmorecount_Searchresult1();
		Thread.sleep(6000);
		Reporter.log("Verified Load More on Search Result", true);
		jsclick(Loadmorebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Load More button", true);
		getVerify_Loadmorecount_Searchresult2();
		Thread.sleep(6000);
		Reporter.log("Verified Load More on Search ResultC", true);
		Refresh_Button();
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("Minumum number of Load More count on Search Verified successfully", true);

	}

	public void Verify_Load_MoreCount_On_Folder() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying Load More Count On Folder ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		getVerify_Loadmorecount_Document_Folder1();
		Thread.sleep(6000);
		Reporter.log("Verified Load More Count on Document Flder", true);
		jsclick(Loadmorebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Load More button", true);
		getVerify_Loadmorecount_Document_Folder2();
		Reporter.log("Minumum number of Load More count on Folder Verified successfully", true);

	}

	public void Verify_Maximum_Load_MoreCountOn_Search() throws Exception {

		Reporter.log("Test Scenario 3 : Verifying Maximum Load More Count On Search ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getEnter_Maximum_Loadmorecount();
		Reporter.log("Enter Load More count Value in textbox", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		try {
			getMax_Loadmorecount_OK_button();
		} catch (Exception e) {
			System.out.println("Load more Alert not showing");
		}
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		jsclick(Find_Button);
		Thread.sleep(15000);
		Reporter.log("Click on Find button", true);
		getVerify_maxLoadmorecount_Searchresult1();
		Thread.sleep(6000);
		Reporter.log("Verified Load More count On Serach Result", true);
		jsclick(Loadmorebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Load More button", true);
		getVerify_maxLoadmorecount_Searchresult2();
		Thread.sleep(7000);
		Reporter.log("Verified Load More count On Serach Result", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		Reporter.log("Maximum number of Load More count on Search Verified successfully", true);

	}

	public void Verify_Maximum_Load_MoreCount_On_Folder() throws Exception {

		Reporter.log("Test Scenario 4 : Verifying Maximum Load More Count On Folder  ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		getVerify_maxLoadmorecount_Document_Folder1();
		Thread.sleep(6000);
		Reporter.log("Verified Load More count on Document Folder", true);
		jsclick(Loadmorebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Load More button", true);
		getVerify_maxLoadmorecount_Document_Folder2();
		Thread.sleep(6000);
		Reporter.log("Maximum number of Load More count on Folder Verified successfully", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	// Office document Advanced and Lead view

	public void Verify_Browse_Office_documents_Advancedviewing() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Browse Office Documents Advanced viewing ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Advancedviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office Document and set as Advanced View", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Click_New_Document);
		Thread.sleep(6000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("Expand a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		Reporter.log("Select Document type Dropdown", true);
		getEnter_ReportName();
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficedoc.exe");
		Thread.sleep(6000);
		Reporter.log("By using AutoIT add file from external folder", true);

	}

	public void Verify_NewWordDocuments_Office_documents_Advancedviewing() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying New Word Documents Office documents Advanced viewing ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
			selectElement(Select_Cabinet1);
			Thread.sleep(6000);
			Reporter.log("Expand a Cabinet", true);
			selectElement(Select_Drawer1);
			Thread.sleep(6000);
			Reporter.log("Expand a Drawer", true);
			selectElement(Select_Folder1);
			Thread.sleep(6000);
			Reporter.log("Expand a Folder", true);
			jsclick(OK_Button_BrowseforFolder);
			Thread.sleep(6000);
			Reporter.log("Click on Ok button", true);
			getSelect_Document_Type_Dropdown();
			Thread.sleep(6000);
			Reporter.log("Select Document type Dropdown", true);
			getEnter_ReportName();
			Reporter.log("Enter value into Report Name field", true);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
			movingclkElement(Move_To_PlusIcon);
			getBrowse_Option();
			Reporter.log("Browse Document Page", true);
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficedoc.exe");
			Thread.sleep(6000);
			Reporter.log("By using AutoIT add file from external folder", true);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		movingclkElement(Move_To_PlusIcon);
		Reporter.log("Click on  Plus button", true);
		getNew_Word_Document_Option();
		Thread.sleep(6000);
		Reporter.log("Create New Word document", true);
		getEnter_Word_File_Name();
		Thread.sleep(6000);
		Reporter.log("Enter word Filename", true);
		jsclick(Open_Word_page);
		Thread.sleep(6000);
		Reporter.log("Advanced Viewing New Word Document Created", true);

	}

	public void Verify_NewExcelSpreadsheet_Office_documents_Advancedviewing() throws Exception {

		Reporter.log("Test Scenario 3 : Verifying New Excel Spreadsheet Office documents Advancedviewing", true);
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		movingclkElement(Move_To_PlusIcon);
		Reporter.log("Click on Plus Icon", true);
		getNew_Excel_Spreadsheet_Option();
		Thread.sleep(6000);
		Reporter.log("Create Excel Sheet", true);
		getEnter_Excel_File_Name();
		Thread.sleep(6000);
		Reporter.log("Enter Excel sheet name", true);
		jsclick(Open_Excel_page);
		Thread.sleep(6000);
		Reporter.log("Open Excel page", true);
		try {
			jsclick(AlertOK_button);
		} catch (Exception e) {
			System.out.println("Alert is not showing");
		}
		movingclkElement(Create_button);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_button);
		Reporter.log("Click on  Navigate button", true);
		Reporter.log("Advanced Viewing New Excel Document Created", true);

	}

	public void Verify_Browse_Office_documents_Defaultviewing() throws Exception {

		Reporter.log("Test Scenario 4 : Verifying Browse Office documents Defaultviewing ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office document and set as Default view", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Click_New_Document);
		Thread.sleep(6000);
		Reporter.log("Click on New Document", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("Expand a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(4000);
		Reporter.log("Select document Type dropdown ", true);
		getEnter_ReportNameDefaultview();
		Thread.sleep(5000);
		Reporter.log("Enter Report Name", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_button);
		Thread.sleep(6000);
		Reporter.log("Click on Navigate button", true);
		Reporter.log("Verifying Browse Office documents Defaultviewing", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	// Pdf Document My preference

	public void Verify_Browse_Pdf_documents_Advancedviewing() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Browse Pdf documents Advanced viewing ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getPdf_document_Advancedviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and set as Advanced View", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_New_Document);
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
		Reporter.log("Expand a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		Reporter.log("Select Document type dropdown", true);
		getEnter_ReportName();
		Thread.sleep(6000);
		Reporter.log("Enter a Report Name", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Thread.sleep(6000);
		Reporter.log("By using AutoIT add file from external folder", true);

	}

	public void Verify_Create_New_pdf_document_Advancedviewing() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying Create New pdf document Advancedviewing ", true);

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		movingclkElement(Move_To_PlusIcon);
		Reporter.log("Move to  Plus Icon", true);
		getNew_pdf_Document_Option();
		Thread.sleep(6000);
		Reporter.log("Click on Pdf Document Option", true);
		getEnter_pdf_File_Name();
		Thread.sleep(6000);
		Reporter.log("Enter Pdf file name", true);
		jsclick(Open_pdf_page);
		Thread.sleep(6000);
		Reporter.log("Select and Open pdf page", true);
		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_button);
		Thread.sleep(6000);
		Reporter.log("Click on Navigate button", true);
		Reporter.log("Advanced Viewing New PDF Document Created", true);

	}

	public void Verify_Browse_PDF_documents_Defaultviewing() throws Exception {

		Reporter.log("Test Scenario 3 : Verifying Browse PDF documents Defaultviewing ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and set as Default View", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_New_Document);
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
		Reporter.log("Expand a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		Reporter.log("Select Document Type Dropdown", true);
		getEnter_ReportName();
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
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
		Thread.sleep(6000);
		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_button);
		Thread.sleep(6000);
		Reporter.log("Click on Navigate button", true);
		Reporter.log("Advanced Viewing New Document Created", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	// PDF with Overlay

	public void Verify_PDF_with_Overlay_Disable() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying PDF with Overlay Disable ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
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
		Reporter.log("Click on  Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		getSelect_PDF_with_Overlay_Disable();
		Thread.sleep(6000);
		Reporter.log("Select Pdf With Overlay and set as Disable", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_New_Document);
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
		Reporter.log("Expand a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		Reporter.log("Select a Document Type dropdown", true);
		getEnter_ReportNamePDFwithOverlay();
		Reporter.log("Enter a Report Name", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PDFwithOverlay.exe");
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("By using AutoIT add file from external folder", true);

		Thread.sleep(6000);
		getMove_to_ViewMenu_Option_inViewer();
		Thread.sleep(6000);
		Reporter.log("Mousehover to View Menu Option", true);
		getVerify_PDF_with_Overlay_option();
		Thread.sleep(6000);
		Reporter.log("Verifying PDF with overlay Option", true);

		Thread.sleep(8000);

		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_button);
		Reporter.log("Click on Navigate button", true);
		Reporter.log("Verifying PDF with Overlay is Disable", true);

	}

	public void Verify_PDF_with_Overlay_Enable() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying PDF with Overlay Enable ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_PDF_with_Overlay_Enable();
		Thread.sleep(6000);
		Reporter.log("Verified Pdf With Overlay Enable", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Open_Document);
		Thread.sleep(6000);
		Reporter.log("Select and Open document", true);

		getMove_to_ViewMenu_Option_inViewer();
		Thread.sleep(6000);
		Reporter.log("Mousehover to View menu Option", true);
		getVerify_PDF_with_Overlay_option();
		Thread.sleep(6000);
		Reporter.log("Verifying Pdf with overlay Option", true);
		jsclick(Click_PDF_with_Overlay_option);
		Thread.sleep(6000);
		Reporter.log("Verifying PDF with Overlay is Enable", true);



		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on  My Preferences", true);
		getSelect_PDF_with_Overlay_Disable();
		Thread.sleep(6000);
		Reporter.log("Select Pdf With Overlay and set as Disable", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);

	}

	// Quick find

	public void Verify_QuickFind_DocIdSearch() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Quick Find Doc Id Search ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
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
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_QuickFind_DocIdSearch();
		Thread.sleep(6000);
		Reporter.log("Select Quick fing and set as Doc Id Search", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		// Create New Document and Copy Document ID.
		jsclick(Click_New_Document);
		Thread.sleep(5000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(5000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(5000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(5000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(5000);
		Reporter.log("select a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button ", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		Reporter.log("Select Value from Document type Dropdown", true);
		getEnter_ReportName();
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(5000);
		Reporter.log("Browse a Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PdfDoc\\FileUploadMorePdfDoc.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		movingclkElement(Create_button);
		Thread.sleep(3000);
		Reporter.log("Click on Create button", true);
		jsclick(ViewDocument_Button);
		Thread.sleep(6000);
		Reporter.log("Click on View button", true);
		Reporter.log("Document Created Successfully ", true);
		jsclick(Click_general_option);
		Thread.sleep(6000);
		Reporter.log("Click on General Option", true);
		getVerify_Doc_Id();
		Thread.sleep(6000);
		Reporter.log("Verified created Document ID In General", true);
		getEnter_Doc_Id_InSearch();
		Thread.sleep(6000);
		Reporter.log("Enter Document Id in Search textbox", true);
		jsclick(Click_general_option);
		Thread.sleep(6000);
		Reporter.log("Click on General Option", true);
		getVerify_Doc_Id();
		Thread.sleep(6000);
		Reporter.log("Searching and verified newly created Document ID", true);
		Reporter.log("Selected Document Id Document Open successfully", true);
		Reporter.log("Verifying successfully Quick Find Doc Id Search", true);

	}

	public void Verify_QuickFind_TextSearch() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying QuickFind TextSearch ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_QuickFind_TextSearch();
		Thread.sleep(6000);
		Reporter.log("Select Quick find and set as Text Search", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		getEnter_Text_InSearch();
		Thread.sleep(6000);
		Reporter.log("Enter Text in Serach Textbox", true);
		Reporter.log("Verifying successfully Quick Find Text search", true);

	}

	public void Verify_QuickFind_IndexSearch() throws Exception {

		Reporter.log("Test Scenario 3: Verifying QuickFind IndexSearch ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		getSelect_QuickFind_IndexSearch();
		Thread.sleep(6000);
		Reporter.log("Select Quick find and set as Index Search", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		getEnter_IndexValue_InSearch();
		Thread.sleep(6000);
		Reporter.log("Enter Index name in Search Textbox", true);
		Reporter.log("Verifying successfully Quick Find Index search", true);

	}

	public void Verify_QuickFind_BothSearch() throws Exception {

		Reporter.log("Test Scenario 4: Verifying Quick Find Both Search ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_QuickFind_Both();
		Thread.sleep(6000);
		Reporter.log("Select Quick find and set as Both", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		getEnter_BothValue_InSearch();
		Thread.sleep(6000);
		Reporter.log("Enter Both Value in search Textbox", true);
		Reporter.log("Verifying successfully Quick Find Text and Index search", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	// Redaction My preferences

	public void MyPreferences_Verify_Redaction_View_Password() throws Exception {

		Reporter.log("Test Scenario 1: Verifying Redaction View Password ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			Thread.sleep(3000);
			jsclick(Navigate_button);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Click navigation
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Click_New_Document);
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
		Reporter.log("Expand a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		Reporter.log("Select Document Type ", true);
		getEnter_ReportName_RedactionPassword();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(5000);
		Reporter.log("Browse a Document", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		getMove_to_Annotation_Option_inViewer();
		Thread.sleep(6000);
		Reporter.log("Click on Annotation Menu Option", true);
		getRedaction_Option();
		Thread.sleep(6000);
		Reporter.log("Click on Redaction Option", true);
		getSet_Redaction_ToDocument();
		Thread.sleep(6000);
		Reporter.log("Enter password and set Redaction on Document ", true);
		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_button);
		Thread.sleep(6000);
		Reporter.log("Click on Navigate button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getEnter_RedactionPassword_MyPreferences();
		Thread.sleep(6000);
		Reporter.log("Enter Redaction Password", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Open_Document);
		Thread.sleep(6000);
		Reporter.log("Select and Open Document", true);
		getClick_FileInfo_Option();
		Thread.sleep(6000);
		Reporter.log("Click on File Info Option", true);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Reaction View Password Functionality Verified Successfulluy", true);

	}

	public void Verify_Reset_My_Preferences() throws Exception {

		Reporter.log("Test Scenario 2: Verifying Reset My Preferences ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		try {
			Thread.sleep(3000);
			jsclick(Navigate_button);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Click navigation
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(5000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		getReset_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Reset button", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on  Apply button", true);
		Reporter.log("Reset Successfully", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	// Theme My preferences

	public void Verify_Theme() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying and Set mes ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
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
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Themes_Option();
		Thread.sleep(6000);
		Reporter.log("Click on Theme Option", true);
		getSelect_Themes_Setting();
		Thread.sleep(6000);
		Reporter.log("Select and Apply me setting ", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Reporter.log("Verified and added New mes successfully", true);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	// Viewer Zoom

	public void Verify_Viewer_Zoom_Fit_To_Width() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Viewer Zoom Fit To Width ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office document and set as Default view", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf document and set as Default view", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_New_Document);
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
		Reporter.log("Expand a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		Reporter.log("Select a Document Type dropdown", true);
		getEnter_ReportName();
		Reporter.log("Enter a Report Name", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PDFwithOverlay.exe");
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_button);
		Reporter.log("Click on Navigate button", true);
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Dropdown_Fit_To_Width();
		Thread.sleep(6000);
		Reporter.log("Select Viewer zoom and set as Fit To Width", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click Search Tab", true);
		getEnter_Document_Name();
		Thread.sleep(6000);
		Reporter.log("Enter value into Document Name field", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		getSelect_Document();
		Reporter.log("Select and Open document ", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		Reporter.log("Verifying Viewer Zoom Fit To Width successfully", true);

	}

	public void Verify_Viewer_Zoom_Fit_To_Height() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying Viewer Zoom Fit To Height ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Dropdown_Fit_To_Height();
		Thread.sleep(6000);
		Reporter.log("Select Viwer zoom and set as Fit To Height", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		getEnter_Document_Name();
		Thread.sleep(6000);
		Reporter.log("Enter value into Document Name field", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find Buttton", true);
		getSelect_Document();
		Reporter.log("Select and Open Document ", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		Reporter.log("Verifying Viewer Zoom Fit To Height successfully", true);

	}

	public void Verify_Viewer_Zoom_Fit_Entire_Image() throws Exception {

		Reporter.log("Test Scenario 3 : Verifying Viewer Zoom Fit Entire Image ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Dropdown_Fit_Entire_Image();
		Thread.sleep(6000);
		Reporter.log("Select Viwer Zoom and set as Fit Entire Image", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Option", true);
		getEnter_Document_Name();
		Thread.sleep(6000);
		Reporter.log("Enter value into Document Name field", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		getSelect_Document();
		Reporter.log("Select and Open Document ", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		Reporter.log("Verifying Viewer Zoom Fit To Entire Image successfully", true);

	}

	public void Verify_Viewer_Zoom_Actual_Size() throws Exception {

		Reporter.log("Test Scenario 4 : Verifying Viewer Zoom Actual Size ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon ", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Dropdown_Actual_Size();
		Thread.sleep(6000);
		Reporter.log("Select  Viwer Zoom and set as Actual size", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab ", true);
		getEnter_Document_Name();
		Thread.sleep(6000);
		Reporter.log("Enter value into Document Name field", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Find button", true);
		getSelect_Document();
		Reporter.log("Select and Open Document ", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		Reporter.log("Verifying Viewer Zoom Actual Size successfully", true);
		Refresh_Button();
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
	}

	// My Preferences Register Custom Stamp

	public void getVerify_RergisterCustomStamp_DialogTitle() throws Exception {

		String expectedtext = "Contentverse";
		String actualtext = Register_Custom_Stamp_DialogTitle.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		Reporter.log("The " + Register_Custom_Stamp_DialogTitle.getText() + " this Dialog title should display", true);
	}

	public void getVerify_RergisterCustomStamp_text() throws Exception {

		String expectedtext = "Stamp Name:";
		String actualtext = Stamp_Name.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		Reporter.log("The " + Stamp_Name.getText() + " this text should display", true);

	}

	public void getVerify_existStamp() throws Exception {

		String expectedtext = "Stamp with the name already exists.";
		String actualtext = Toastmessage.getText();
		softAssert.assertEquals(actualtext, expectedtext);
	}

	public void Verify_Register_Custom_Stamp_UI_and_UploadStamp() throws Exception {

		Reporter.log("Test Scenario 1: Verifying Register Custom Stamp UI and Upload Stamp ", true);
		Thread.sleep(4000);
		movingclkElement(Setting_Icon);
		Thread.sleep(4000);
		Reporter.log("Click on Setting Icon ", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(4000);
		Reporter.log("Click on My Preferences", true);
		Actions actions = new Actions(driver);
		actions.moveToElement(Register_Custom_Stamp).perform();
		String tooltipText = Register_Custom_Stamp.getAttribute("title");
		Assert.assertEquals(tooltipText, "Register Custom Stamps");
		Reporter.log("Register Custom Stamp tooltip text Verified", true);
		jsclick(Register_Custom_Stamp);
		Reporter.log("Click on the Register Custom Stamp Button", true);
		Thread.sleep(4000);
		getVerify_RergisterCustomStamp_DialogTitle();
		getVerify_RergisterCustomStamp_text();
		Reporter.log("Register Custom Stamp title and text Verified", true);
		Thread.sleep(4000);
		jsclick(RegisterStamp_CloseButton);
		Reporter.log("Register Custom Stamp dialog closed Verified", true);
		Thread.sleep(4000);
		movingclkElement(Setting_Icon);
		Thread.sleep(4000);
		Reporter.log("Click on Setting Icon ", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(4000);
		Reporter.log("Click on My Preferences", true);
		jsclick(Register_Custom_Stamp);
		Reporter.log("Click on the Register Custom Stamp Button", true);
		Thread.sleep(4000);
		jsclick(RegisterStamp_CancelButton);
		Reporter.log("Register Custom Stamp dialog cancel Verified", true);
		Thread.sleep(4000);
		movingclkElement(Setting_Icon);
		Thread.sleep(4000);
		Reporter.log("Click on Setting Icon ", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(4000);
		Reporter.log("Click on My Preferences", true);
		jsclick(Register_Custom_Stamp);
		Reporter.log("Click on the Register Custom Stamp Button", true);
		Thread.sleep(4000);
		jsclick(RegisterStamp_AddButton);
		Thread.sleep(2000);
		Reporter.log("Click on the Register Custom Stamp dialog Add Button", true);
		getToastmessage();
		Thread.sleep(4000);
		RegisterStamp_Textbox.sendKeys(MyPreferences_excelRead(19, 0));
		Thread.sleep(2000);
		Reporter.log("Enter Register Custom Stamp Name", true);
		jsclick(RegisterStamp_AddButton);
		Reporter.log("Click on the Register Custom Stamp dialog Add Button", true);
		Thread.sleep(2000);
		getToastmessage();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Stamp_fileChosen));
		movingclkElement(Stamp_fileChosen);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\UploadSignature.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		jsclick(RegisterStamp_AddButton);
		Thread.sleep(2000);
		Reporter.log("Click on the Register Custom Stamp dialog Add Button", true);
		try {
			getVerify_existStamp();
			Thread.sleep(2000);
			jsclick(RegisterStamp_CancelButton);
			Reporter.log("Click on the Register Custom Stamp dialog cancel button", true);
		} catch (Exception e) {
			System.out.println("Stamp is Added successfully");
		}
		if (Toastmessage.isDisplayed() == true) {
			getToastmessage();
			Thread.sleep(2000);
		} else {
			System.out.println("Duplicate Name Custom Stamp not available");
		}
		Reporter.log("Register Custom Stamp added succeesfully", true);
	}

	public void Add_Register_Custom_Stamp_LeadViewer() throws Exception {

		Reporter.log("Test Scenario 2: Add Register Custom Stamp in Lead View ", true);
		Thread.sleep(4000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office document and set as Default view", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf document and set as Default view", true);
		movingclkElement(Apply_button);
		Thread.sleep(3000);
		Reporter.log("Click on Apply button", true);
		getToastmessage();
		Thread.sleep(3000);
		jsclick(Click_New_Document);
		Thread.sleep(6000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(Destination_Folder_Textbox);

		Thread.sleep(6000);

		Thread.sleep(8000);

		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);
		Reporter.log("Select Document type dropdown", true);
		getEnter_ReportName_LeadViewRegister_Custom_Stamp();
		Thread.sleep(5000);
		Reporter.log("Enter value Report Name field", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);
		// Add tif file type
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("By using AutoIT add file from external folder", true);

		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		movingElement(AnnotationMenu);
		Thread.sleep(1000);
		movingElement(Stamp);
		Thread.sleep(2000);
		(Select_Added_Stamp).click();
		Actions action = new Actions(driver);
		WebElement element = canvas;
		action.dragAndDropBy(element, 200, 100).build().perform();
		Thread.sleep(6000);
		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(ViewDocument_Button);
		Thread.sleep(6000);
		Reporter.log("Click on View button", true);
		wait1.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);
		// Add pdf page
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		jsclick(Open_Second_page);
		Reporter.log("PDF Page open successfully", true);
		Thread.sleep(6000);
		movingElement(AnnotationMenu);
		Thread.sleep(1000);
		movingElement(Stamp);
		Thread.sleep(2000);
		movingclkElement(Select_Added_Stamp);
		Actions action1 = new Actions(driver);
		WebElement element1 = canvas;
		action1.dragAndDropBy(element1, 200, 100).build().perform();
		Thread.sleep(6000);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Verified and Create PDF and tif file with adding Custom Stamp in Lead view", true);
		movingclkElement(closedoc);
		Reporter.log("Close the document page", true);
	}

	public void Add_Register_Custom_Stamp_AdvancedViewer() throws Exception {

		Reporter.log("Test Scenario 2: Add Register Custom Stamp in Advanced View ", true);
		Refresh_Button();
		Thread.sleep(4000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getPdf_document_Advancedviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and set as Advanced View", true);
		movingclkElement(Apply_button);
		Thread.sleep(3000);
		Reporter.log("Click on Apply button", true);
		getToastmessage();
		Thread.sleep(3000);
		jsclick(Click_New_Document);
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
		Reporter.log("select a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);

		getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);
		Reporter.log("Select Document type dropdown", true);
		getEnter_ReportName_AdvancedViewRegister_Custom_Stamp();
		Thread.sleep(5000);
		Reporter.log("Enter value Report Name field", true);

		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);

		// Add tif file type
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("By using AutoIT add file from external folder", true);

		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);

		movingElement(AnnotationMenu);
		Thread.sleep(1000);
		movingElement(Stamp);
		Thread.sleep(3000);
		movingclkElement(Select_Added_Stamp);
		Actions action = new Actions(driver);
		WebElement element = canvas;
		action.dragAndDropBy(element, 200, 100).build().perform();
		Thread.sleep(6000);

		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(ViewDocument_Button);
		Thread.sleep(6000);
		Reporter.log("Click on View button", true);

		// Add pdf page
		movingclkElement(Move_To_PlusIcon);
		Reporter.log("Move to  Plus Icon", true);
		getNew_pdf_Document_Option();
		Thread.sleep(6000);
		Reporter.log("Click on Pdf Document Option", true);
		getEnter_pdf_File_Name();
		Thread.sleep(6000);
		Reporter.log("Enter Pdf file name", true);
		jsclick(Open_pdf_page);
		Thread.sleep(6000);
		Reporter.log("Select and Open pdf page", true);
		jsclick(EditAnnotation);
		Reporter.log("Click on the Add or Edit annotation button", true);
		Thread.sleep(3000);
		jsclick(AddStamp);
		Reporter.log("Click on the Add Stamp menu option", true);
		Thread.sleep(5000);
		action.moveToElement(AddCustomStamp).perform();
		Thread.sleep(2000);
		Reporter.log("Mousehover on the Add custom Stamp", true);
		Thread.sleep(3000);
		movingclkElement(Select_Added_Stamp_adv);
		Thread.sleep(6000);
		WebElement container = driver.findElement(By.xpath("//*[@id='pdfViewerDiv_viewerContainer']"));
		action.moveToElement(container).click(Page) // Perform click at the center of the container
				.build().perform();
		Reporter.log("Click on comment icon, add a comment");
		Thread.sleep(3000);
		Reporter.log("Stamp Added Successfully", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Verified and Create PDF and tif file with adding Custom Stamp in Lead view", true);
		movingclkElement(closedoc);
		Reporter.log("Close the document page", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office document and set as Default view", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf document and set as Default view", true);
		movingclkElement(Apply_button);
		Thread.sleep(3000);
		Reporter.log("Click on Apply button", true);
		getToastmessage();

	}

	public void Reset_Register_Custom_Stamp() throws Exception {

		Reporter.log("Test Scenario 3: Reset Register Custom Stamp from Admin Preferences", true);
		Thread.sleep(4000);
		LogoutPage();
		LoginAdminUser();
		Thread.sleep(6000);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		movingclkElement(AdminPreference);
		Thread.sleep(6000);
		Reporter.log("Click on Admin preferences", true);
		Select_Added_CustomStamp_AdminPreferences();
		Thread.sleep(4000);
		Reporter.log("Added Custom Stamp Select from dropdown", true);
		movingclkElement(Delete_CustomStamp);
		Thread.sleep(2000);
		getToastmessage();
		Thread.sleep(3000);
		LogoutPage();
		LogDipakUser();
		Thread.sleep(6000);
	}

	// Create Update doc

	public void Create_and_Open_document_Default_View() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Create Open and Update document in Default view", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is already logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		movingclkElement(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf document and set as Default view", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office Document and set as Default View", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		// getToastmessage();
		Thread.sleep(6000);
		jsclick(Click_New_Document);
		Thread.sleep(6000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on Destination Folder Textbox", true);
		ViewExpandNodes();
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(8000);
		Reporter.log("Click on Ok button ", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(6000);
		Reporter.log("Select Value from Document type dropdown", true);
		getEnter_ReportNameDefaultview();
		Thread.sleep(6000);
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(4000);
		Reporter.log("Browse a Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PdfDoc\\FileUploadUpdate.exe");
		Thread.sleep(8000);
		Reporter.log("By using AutoIT add file from external folder", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(ViewDocument_Button);
		Thread.sleep(8000);
		Reporter.log("Click on View button", true);
		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingclkElement(Move_To_PlusIcon);
		Thread.sleep(4000);
		Reporter.log("Browse a Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PdfDoc\\FileUploadUpdate.exe");
		Thread.sleep(8000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(Save_button);
		Thread.sleep(10000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(closedoc);
		Thread.sleep(6000);
		Reporter.log("Close the document page", true);
		Reporter.log("Verified Create Open and Update document in Default view", true);
		Refresh_Button();
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
	}
}
