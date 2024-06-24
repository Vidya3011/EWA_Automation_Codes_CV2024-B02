package Pom;

//Dipak Automation Pom
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class TemplatePage extends Generic.BaseClass {

	public static WebElement element = null;

	public TemplatePage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"documentTemplates\"]")
	private WebElement Templates_MenuOption;

	public WebElement getTemplates_MenuOption() {
		return Templates_MenuOption;
	}

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	public WebElement getDestination_Folder_Textbox() {
		return Destination_Folder_Textbox;
	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle\"]")
	private WebElement Cancel_Button_BrowseforFolder;

	public WebElement getCancel_Button_BrowseforFolder() {
		return Cancel_Button_BrowseforFolder;
	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	public WebElement getOK_Button_BrowseforFolder() {
		return OK_Button_BrowseforFolder;
	}

	@FindBy(xpath = "//*[@id=\"docTypeList\"]")
	private WebElement Click_Document_Type_Dropdown;

	public WebElement getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;

	}

	@FindBy(xpath = "//*[@id=\"createTemplateBtn\"]")
	private WebElement Save_Template_Button;

	public WebElement getSave_Template_Button() {
		return Save_Template_Button;
	}

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	public WebElement getMove_To_PlusIcon() {
		return Move_To_PlusIcon;
	}

	public WebElement getMove_To_PlusIcon1() {
		WebElement ele = Move_To_PlusIcon;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return ele;
	}

	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
	private WebElement Browse_Option;

	public WebElement getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	@FindBy(xpath = "//*[@id=\"createTemplateCancel\"]")
	private WebElement Template_Description_No_button;

	public WebElement getTemplate_Description_No_button() {
		return Template_Description_No_button;
	}

	@FindBy(xpath = "//*[@id=\"templateName\"]")
	private WebElement Template_NameTextbox;

	public WebElement getTemplate_NameTextbox() {
		return Template_NameTextbox;
	}

	@FindBy(xpath = "//*[@id=\"templateDescription\"]")
	private WebElement Template_Description_Messagebox;

	public WebElement getTemplate_Description_Messagebox() {
		return Template_Description_Messagebox;
	}

	@FindBy(xpath = "//*[@id=\"createTemplateOk\"]")
	private WebElement Template_Description_OK_button;

	public WebElement getTemplate_Description_OK_button() {
		return Template_Description_OK_button;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Template_Created_Message_Verify;

	public void getTemplate_Created_Message_Verify() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Template Created Successfully!";
		String actualtext = Template_Created_Message_Verify.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement Template_Created_OK_button;

	public WebElement getTemplate_Created_OK_button() {
		return Template_Created_OK_button;
	}

	@FindBy(xpath = "//*[@id=\"documentTemplates\"]")
	private WebElement Moveto_Templates_Option;

	public void getMoveto_Templates_Option() {
		WebElement ele = Moveto_Templates_Option;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

	}

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Select_ReportName_Test;

	public WebElement getSelect_ReportName_Test() {
		return Select_ReportName_Test;
	}

	@FindBy(id = "Template_Automation1")
	private WebElement Select_Created_Template;

	public WebElement getSelect_Created_Template() {
		return Select_Created_Template;
	}

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Created_button;

	public WebElement getCreated_button() {
		return Created_button;
	}

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_button;

	public WebElement getNavigate_button() {
		return Navigate_button;
	}

	@FindBy(xpath = "//*[@id=\"editTemplate1\"]")
	private WebElement Click_Edit_Template_Button;

	public WebElement getClick_Edit_Template_Button() {
		return Click_Edit_Template_Button;
	}

	@FindBy(xpath = "//*[@id=\"editTemplateDescription\"]")
	private WebElement EditTemplate_Description_Messagebox;

	public WebElement getEditTemplate_Description_Messagebox() {
		return EditTemplate_Description_Messagebox;
	}

	@FindBy(xpath = "//*[@id=\"editTemplateOk\"]")
	private WebElement EditTemplate_Description_OK_button;

	public WebElement getEditTemplate_Description_OK_button() {
		return EditTemplate_Description_OK_button;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement EditTemplate_Created_Message_Verify;

	public void getEditTemplate_Created_Message_Verify() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Template Edited Successfully!";
		String actualtext = EditTemplate_Created_Message_Verify.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement EditTemplate_Created_OK_button;

	public WebElement getEditTemplate_Created_OK_button() {
		return EditTemplate_Created_OK_button;
	}

	@FindBy(xpath = "//*[@id=\"delTemp\"]")
	private WebElement Delete_Template_Button;

	public WebElement getDelete_Template_Button() {
		return Delete_Template_Button;
	}

	@FindBy(xpath = "//*[@id=\"deleteTemplateOk\"]")
	private WebElement Delete_Template_OK_Button;

	public WebElement getDelete_Template_OK_Button() {
		return Delete_Template_OK_Button;
	}

	@FindBy(xpath = "//*[@id=\"editTemplateCancel\"]")
	private WebElement EditTemplate_Description_No_button;

	public WebElement getEditTemplate_Description_No_button() {
		return EditTemplate_Description_No_button;
	}

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	public WebElement getSetting_Icon() {
		return Setting_Icon;
	}

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

	public WebElement getMy_Preferencesetting() {
		return My_Preferencesetting;
	}

	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	public WebElement getApply_button() {
		return Apply_button;
	}

	@FindBy(xpath = "//*[@id=\"defaultOfficeDocViewListNo\"]")
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

	// New Word Document

	@FindBy(xpath = ("//*[@id=\"addWordFile\"]"))
	private WebElement New_Word_Document_Option;

	public void getNew_Word_Document_Option() {
		WebElement ele1 = New_Word_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_Word_File_Name;
	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement TemplateOK;

	public void getEnter_Word_File_Name() throws Exception {
		WebElement ele = Enter_Word_File_Name;
		ele.sendKeys(Templates_excelRead(2, 0));
		TemplateOK.click();

	}

	// New Excel Spreadsheet

	@FindBy(xpath = "//*[@id=\"addExcelFile\"]")
	private WebElement New_Excel_Spreadsheet_Option;

	public void getNew_Excel_Spreadsheet_Option() {
		WebElement ele1 = New_Excel_Spreadsheet_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_Excel_File_Name;

	public void getEnter_Excel_File_Name() throws Exception {
		WebElement ele1 = Enter_Excel_File_Name;
		ele1.sendKeys(Templates_excelRead(3, 0));
		TemplateOK.click();

	}

	// Special characters datadriven

	public String Templates_excelRead(int rowNo, int cellNo) throws Exception {

		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet s = wb.getSheet("Templates");
			XSSFRow row = s.getRow(rowNo);
			XSSFCell cll = row.getCell(cellNo);
			String cellType = cll.getStringCellValue();
			return cellType;
		}
	}

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Advancedviewing;

	public void getPdf_document_Advancedviewing() {
		Select drop = new Select(Pdf_document_Advancedviewing);
		drop.selectByVisibleText("Advanced viewing");

	}

	@FindBy(xpath = "//*[@id=\"addPdfFile\"]")
	private WebElement New_pdf_Document_Option;

	public void getNew_pdf_Document_Option() {
		WebElement ele1 = New_pdf_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_pdf_File_Name;
	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement TempOK;

	public void getEnter_pdf_File_Name() throws Exception {
		WebElement ele1 = Enter_pdf_File_Name;
		ele1.sendKeys(Templates_excelRead(7, 0));
		Thread.sleep(3000);
		TempOK.click();

	}

	@FindBy(xpath = "//*[@id=\"homeMenuBtn\"]")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
	}

	@FindBy(xpath = "//span[@id='pdfViewerDiv_formdesignerIcon']")
	private WebElement pdfViewer;

	public WebElement getpdfViewer() {
		return pdfViewer;
	}

	@FindBy(xpath = "//*[@id=\"pdfViewerDiv_formdesigner_textbox\"]")
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
	private WebElement Select_Formfield;

	public void getSelect_Formfield() {
		Select sel = new Select(Select_Formfield);
		sel.selectByVisibleText("Textbox1");

	}

	@FindBy(xpath = "//button[@id='setFormMapping']")
	private WebElement FormOK;

	public WebElement getFormOK() {
		return FormOK;
	}

	@FindBy(xpath = "//*[@id=\"defaultPdfDocViewListNo\"]")
	private WebElement Pdf_document_Defaultviewing;

	public void getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		drop.selectByVisibleText("Default viewing");

	}

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Verify_DuplicateTemp_Message;

	public void getVerify_DuplicateTemp_Message() {
		WebElement Message = Verify_DuplicateTemp_Message;
		Reporter.log(Message.getText() + " this popup message should show", true);

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

	public void getFolderSelectMessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please select a folder to create document";
		String actualtext = FolderSelectMessage.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(FolderSelectMessage.getText() + " this validation message should show", true);
		jsclick(CommentOK);

	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement addpagesMessage;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement CommentOKbutton;

	public void getFolder_ErrorMessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please add pages to the template before creating!";
		String actualtext = addpagesMessage.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(addpagesMessage.getText() + " this validation message should show", true);
		jsclick(CommentOKbutton);

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

	public void getvalidationerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "*Template name should be specified.";
		String actualtext = validationerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(validationerror.getText() + " this validation message should show", true);

	}

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Createdoc;

	public WebElement getCreatedoc() {
		return Createdoc;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Reportvaluevalidationerror;

	public void getReportvaluevalidationerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "ReportName*  	field is required";
		String actualtext = Reportvaluevalidationerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(Reportvaluevalidationerror.getText() + " this validation message should show", true);
		jsclick(CommentOKbutton);

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

	public void getFilenamevalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter file name ";
		String actualtext = Filenamevalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(Filenamevalidation.getText() + " this validation message should show", true);
		jsclick(CommentOKbutton);

	}

	@FindBy(xpath = "//*[@id=\"createDocumentMessage\"]")
	private WebElement NavigateDoc;
	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement NavigateButton;

	public void getNavigateDoc() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Document created successfully";
		String actualtext = NavigateDoc.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(NavigateDoc.getText() + " this message should show", true);
		jsclick(NavigateButton);

	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Formmappingvalidation;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement FormOKbutton;

	public void getFormmappingvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please add form fields before mapping.";
		String actualtext = Formmappingvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(Formmappingvalidation.getText() + " this validation message should show", true);
		jsclick(FormOKbutton);

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

	@FindBy(xpath = (".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	public WebElement getSelect_Folder() {
		return Select_Folder;

	}

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
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

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder1;

	public WebElement getSelect_Folder1() {
		return Select_Folder1;

	}

	@FindBy(xpath = "//*[@id=\"templateDocumentPermissions\"]/a")
	private WebElement Select_Document_Template;

	public WebElement getSelect_Document_Template() {
		return Select_Document_Template;
	}

	@FindBy(xpath = "//*[@id=\"templatePrefs\"]/div[2]/div[3]/div/div/div")
	private WebElement Select_Userlist;

	public WebElement getSelect_Userlist() {
		return Select_Userlist;
	}

	@FindBy(css = ".e-selectall-parent .e-frame")
	private WebElement Select_AllUser;

	public WebElement getSelect_AllUser() {
		return Select_AllUser;
	}

	public void Select_AllUser() {
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			boolean isReady = wait1.until(ExpectedConditions.and(ExpectedConditions.visibilityOf(Select_AllUser),
					ExpectedConditions.elementToBeClickable(Select_AllUser)));

			if (isReady) {
				Reporter.log("Checkbox is visible and clickable", true);

				if (Select_AllUser.isSelected()) {
					Reporter.log("Checkbox is already selected", true);
				} else {
					Select_AllUser.click();
					Reporter.log("Checkbox was not selected, and has now been clicked", true);
				}
			}
		} catch (Exception e) {
			Reporter.log("not working", true);
		}

	}

	@FindBy(xpath = "//*[@id=\"templatePermissionApply\"]")
	private WebElement TemplateApply;

	public WebElement getTemplateApply() {
		return TemplateApply;
	}

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Username;

	public WebElement getUsername() {
		return Username;
	}

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}
}