package Pom;

//Dipak Automation Pom
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class TemplatePage extends Generic.BaseClass {

	public static WebElement element = null;

	public TemplatePage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "documentTemplates")
	private WebElement Templates_MenuOption;

	public WebElement getTemplates_MenuOption() {
		return Templates_MenuOption;
	}

	@FindBy(xpath = "//input[@id='createDocuemtnLocation']")
	private WebElement Destination_Folder_Textbox;

	public WebElement getDestination_Folder_Textbox() {
		return Destination_Folder_Textbox;
	}

	@FindBy(xpath = ("(//a[text()='CVApp Test'])[1]"))
	private WebElement Template_Test_Cabinet;

	public WebElement getTemplate_Test_Cabinet() {
		return Template_Test_Cabinet;
	}

	@FindBy(xpath = ("//a[text()='CVMobile App 2022']"))
	private WebElement Template_Test_Drawer;

	public WebElement getTemplate_Test_Drawer() {
		return Template_Test_Drawer;
	}

	@FindBy(xpath = ("//a[text()='Test apk']"))
	private WebElement Template_Folder;

	public WebElement getTemplate_Folder() {
		return Template_Folder;
	}

	@FindBy(id = "navigatorTreeCancle")
	private WebElement Cancel_Button_BrowseforFolder;

	public WebElement getCancel_Button_BrowseforFolder() {
		return Cancel_Button_BrowseforFolder;
	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
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

	@FindBy(id = "retainBtn")
	private WebElement Select_Retain_Checkbox;

	public WebElement getSelect_Retain_Checkbox() {
		return Select_Retain_Checkbox;
	}

	@FindBy(xpath = "//*[@id=\"createTemplateBtn\"]")
	private WebElement Save_Template_Button;

	public WebElement getSave_Template_Button() {
		return Save_Template_Button;
	}

	@FindBy(id = "CommentsMessageModelOk40")
	private WebElement Modify_Permission_OK_Button;

	public WebElement getModify_Permission_OK_Button() {
		return Modify_Permission_OK_Button;
	}

	@FindBy(id = "messageButtonOK")
	private WebElement PageCreation_Alert_OK_Button;

	public WebElement getPageCreation_Alert_OK_Button() {
		return PageCreation_Alert_OK_Button;
	}

	@FindBy(id = "createDocumentClear")
	private WebElement Clear_Button;

	public WebElement getClear_Button() {
		return Clear_Button;
	}

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement Select_Folder_Alert_OK_Button;

	public WebElement getSelect_Folder_Alert_OK_Button() {
		return Select_Folder_Alert_OK_Button;
	}

	@FindBy(xpath = "(//span[contains(@class,'addFileIcon')])[2]")
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

	@FindBy(css = "#createDocuemntNavigator #\\33 5 > .jstree-icon")
	private WebElement Cabinet_Plus_button;

	public WebElement getCabinet_Plus_button() {
		return Cabinet_Plus_button;
	}

	@FindBy(css = "#\\31 037 > .jstree-icon")
	private WebElement Drawer_Plus_button;

	public WebElement getDrawer_Plus_button() {
		return Drawer_Plus_button;
	}

	@FindBy(id = "createTemplateCancel")
	private WebElement Template_Description_No_button;

	public WebElement getTemplate_Description_No_button() {
		return Template_Description_No_button;
	}

	@FindBy(id = "templateName")
	private WebElement Template_NameTextbox;

	public WebElement getTemplate_NameTextbox() {
		return Template_NameTextbox;
	}

	@FindBy(id = "templateDescription")
	private WebElement Template_Description_Messagebox;

	public WebElement getTemplate_Description_Messagebox() {
		return Template_Description_Messagebox;
	}

	@FindBy(xpath = "//*[@id=\"createTemplateOk\"]")
	private WebElement Template_Description_OK_button;

	public WebElement getTemplate_Description_OK_button() {
		return Template_Description_OK_button;
	}

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Template_Created_Message_Verify;

	public WebElement getTemplate_Created_Message_Verify() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Template Created Successfully!";
		String actualtext = Template_Created_Message_Verify.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return Template_Created_Message_Verify;
	}

	@FindBy(id = "messageButtonOK")
	private WebElement Template_Created_OK_button;

	public WebElement getTemplate_Created_OK_button() {
		return Template_Created_OK_button;
	}

	@FindBy(xpath = "//a[@id='documentTemplates']")
	private WebElement Moveto_Templates_Option;

	public WebElement getMoveto_Templates_Option() {
		WebElement ele = Moveto_Templates_Option;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return ele;
	}

	@FindBy(id = "indices_33")
	private WebElement Select_ReportName_Test;

	public WebElement getSelect_ReportName_Test() {
		return Select_ReportName_Test;
	}

	@FindBy(id = "indices_33")
	private WebElement Enter_Report_Name_Test;

	public WebElement getEnter_Report_Name_Test() {
		return Enter_Report_Name_Test;
	}

	@FindBy(id = "Template_Automation1")
	private WebElement Select_Created_Template;

	public WebElement getSelect_Created_Template() {
		return Select_Created_Template;
	}

	@FindBy(id = "createDocumentSubmit")
	private WebElement Created_button;

	public WebElement getCreated_button() {
		return Created_button;
	}

	@FindBy(id = "modelHome")
	private WebElement Navigate_button;

	public WebElement getNavigate_button() {
		return Navigate_button;
	}

	@FindBy(id = "editTemplate1")
	private WebElement Click_Edit_Template_Button;

	public WebElement getClick_Edit_Template_Button() {
		return Click_Edit_Template_Button;
	}

	@FindBy(id = "editTemplateDescription")
	private WebElement EditTemplate_Description_Messagebox;

	public WebElement getEditTemplate_Description_Messagebox() {
		return EditTemplate_Description_Messagebox;
	}

	@FindBy(id = "editTemplateOk")
	private WebElement EditTemplate_Description_OK_button;

	public WebElement getEditTemplate_Description_OK_button() {
		return EditTemplate_Description_OK_button;
	}

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement EditTemplate_Created_Message_Verify;

	public WebElement getEditTemplate_Created_Message_Verify() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Template Edited Successfully!";
		String actualtext = EditTemplate_Created_Message_Verify.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return EditTemplate_Created_Message_Verify;
	}

	@FindBy(id = "messageButtonOK")
	private WebElement EditTemplate_Created_OK_button;

	public WebElement getEditTemplate_Created_OK_button() {
		return EditTemplate_Created_OK_button;
	}

	@FindBy(id = "delTemp")
	private WebElement Delete_Template_Button;

	public WebElement getDelete_Template_Button() {
		return Delete_Template_Button;
	}

	@FindBy(id = "deleteTemplateOk")
	private WebElement Delete_Template_OK_Button;

	public WebElement getDelete_Template_OK_Button() {
		return Delete_Template_OK_Button;
	}

	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement Select_Home_Templatedoc;

	public WebElement getSelect_Home_Templatedoc() {
		return Select_Home_Templatedoc;
	}

	@FindBy(xpath = "//button[@id='editTemplateCancel']")
	private WebElement EditTemplate_Description_No_button;

	public WebElement getEditTemplate_Description_No_button() {
		return EditTemplate_Description_No_button;
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
		ele.sendKeys(Templates_excelRead(2, 0));
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
		ele1.sendKeys(Templates_excelRead(3, 0));
		TemplateOK.click();
		return ele1;
	}

	// Special characters datadriven

	public String Templates_excelRead(int rowNo, int cellNo) throws Exception {

		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("Templates");
		XSSFRow row = s.getRow(rowNo);
		XSSFCell cll = row.getCell(cellNo);
		String cellType = cll.getStringCellValue();
		return cellType;
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
	@FindBy(id = "templateOK")
	private WebElement TempOK;

	public WebElement getEnter_pdf_File_Name() throws Exception {
		WebElement ele1 = Enter_pdf_File_Name;
		ele1.sendKeys(Templates_excelRead(7, 0));
		Thread.sleep(3000);
		TempOK.click();
		return Enter_pdf_File_Name;
	}

	@FindBy(xpath = "//img[@src='images/newRe.png']")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
	}

	@FindBy(xpath = "//span[@id='pdfViewerDiv_formdesignerIcon']")
	private WebElement pdfViewer;

	public WebElement getpdfViewer() {
		return pdfViewer;
	}

	@FindBy(xpath = "//span[@id='pdfViewerDiv_formdesigner_textboxIcon']")
	private WebElement Textbox;

	public WebElement getTextbox() {
		return Textbox;
	}

	@FindBy(css = "#pdfViewerDiv_textLayer_0")
	private WebElement Add_Textbox_Onpage;

	public WebElement getAdd_Textbox_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Textbox_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();
		return Add_Textbox_Onpage;
	}

	@FindBy(xpath = "//*[@id=\"formMapper\"]")
	private WebElement Click_Formmapper;

	public WebElement getClick_Formmapper() throws Exception {
		return Click_Formmapper;
	}

	@FindBy(xpath = "//select[@id='formField1']")
	private WebElement Select_FormFiled;

	public WebElement getSelect_FormFiled() {
		Select sel = new Select(Select_FormFiled);
		sel.selectByVisibleText("Textbox1");
		return Select_FormFiled;
	}

	@FindBy(xpath = "//button[@id='setFormMapping']")
	private WebElement FormOK;

	public WebElement getFormOK() {
		return FormOK;
	}

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Defaultviewing;

	public WebElement getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		drop.selectByVisibleText("Default viewing");
		return Pdf_document_Defaultviewing;
	}

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Verify_DuplicateTemp_Message;

	public WebElement getVerify_DuplicateTemp_Message() {
		WebElement Message = Verify_DuplicateTemp_Message;
		System.out.println(Message.getText());
		return Message;
	}

	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement Okbutton;

	public WebElement getOkbutton() {
		return Okbutton;
	}

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	public WebElement getNobutton() {
		return Nobutton;
	}

	@FindBy(xpath = "//*[@id=\"commentMessage\"]")
	private WebElement FolderSelectMessage;
	@FindBy(xpath = "//*[@id=\"CommentsMessageModelOk\"]")
	private WebElement CommentOK;

	public WebElement getFolderSelectMessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please select a folder to create document";
		String actualtext = FolderSelectMessage.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(FolderSelectMessage.getText());
		jsclick(CommentOK);
		return FolderSelectMessage;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement addpagesMessage;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement CommentOKbutton;

	public WebElement getFolder_ErrorMessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please add pages to the template before creating!";
		String actualtext = addpagesMessage.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println(addpagesMessage.getText());
		jsclick(CommentOKbutton);
		return addpagesMessage;
	}

	@FindBy(xpath = "//*[@id=\"saveTemplate\"]")
	private WebElement savetemp;

	public WebElement getsavetemp() {
		return savetemp;
	}

	@FindBy(xpath = "//*[@id=\"createDocumentClear\"]")
	private WebElement ClearButton;

	public WebElement getClearButton() {
		return ClearButton;
	}

	@FindBy(xpath = "//*[@id=\"templateErr\"]")
	private WebElement validationerror;

	public WebElement getvalidationerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "*Template name should be specified.";
		String actualtext = validationerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println(validationerror.getText());
		return validationerror;
	}

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Createdoc;

	public WebElement getCreatedoc() {
		return Createdoc;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Reportvaluevalidationerror;

	public WebElement getReportvaluevalidationerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "ReportName*  	field is required";
		String actualtext = Reportvaluevalidationerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println(Reportvaluevalidationerror.getText());
		jsclick(CommentOKbutton);
		return Reportvaluevalidationerror;
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

	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement OKButton;

	public WebElement getOKButton() {
		return OKButton;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Filenamevalidation;

	public WebElement getFilenamevalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter file name ";
		String actualtext = Filenamevalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println(Filenamevalidation.getText());
		jsclick(CommentOKbutton);
		return Reportvaluevalidationerror;
	}

	@FindBy(xpath = "//*[@id=\"createDocumentMessage\"]")
	private WebElement NavigateDoc;
	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement NavigateButton;

	public WebElement getNavigateDoc() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Document created successfully";
		String actualtext = NavigateDoc.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println(NavigateDoc.getText());
		jsclick(NavigateButton);
		return Reportvaluevalidationerror;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Formmappingvalidation;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement FormOKbutton;

	public WebElement getFormmappingvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please add form fields before mapping.";
		String actualtext = Formmappingvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(Formmappingvalidation.getText());
		jsclick(FormOKbutton);
		return FolderSelectMessage;
	}

}