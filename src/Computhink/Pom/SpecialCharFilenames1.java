package Computhink.Pom;

//Dipak Automation script
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
import org.testng.asserts.SoftAssert;

public class SpecialCharFilenames1 extends Computhink.Generic.BaseClass {

	public static WebElement element = null;

	public SpecialCharFilenames1() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = ("//a[@id='createDocument']"))
	private WebElement NewDocuments_MenuOption;

	public WebElement getNewDocuments_MenuOption() {
		return NewDocuments_MenuOption;
	}

	@FindBy(xpath = ("//input[@id='createDocuemtnLocation']"))
	private WebElement Destination_Folder_Textbox;

	public WebElement getDestination_Folder_Textbox() {
		return Destination_Folder_Textbox;
	}

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[4]/a"))
	private WebElement Select_Cabinet;

	public WebElement getSelect_Cabinet() {
		return Select_Cabinet;
	}

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[4]/ul/li[1]/a"))
	private WebElement Select_Drawer;

	public WebElement getSelect_Drawer() {
		return Select_Drawer;
	}

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[4]/ul/li[1]/ul/li[1]/a"))
	private WebElement Select_Folder;

	public WebElement getSelect_Folder() {
		return Select_Folder;
	}

	@FindBy(xpath = ("//div[@id='createDocuemntNavigator']/ul/li[2]/a"))
	private WebElement Select_CabinetDest;

	public WebElement getSelect_CabinetDest() {
		return Select_CabinetDest;
	}

	@FindBy(xpath = ("//div[@id='createDocuemntNavigator']/ul/li[2]/ul/li/a"))
	private WebElement Select_DrawerDest;

	public WebElement getSelect_DrawerDest() {
		return Select_DrawerDest;
	}

	@FindBy(xpath = ("//div[@id='createDocuemntNavigator']/ul/li[2]/ul/li/ul/li/a"))
	private WebElement Select_FolderDest;

	public WebElement getSelect_FolderDest() {
		return Select_FolderDest;
	}

	@FindBy(xpath = "//*[@id=\"78608\"]/a")
	private WebElement NewDrawerFolder;

	public WebElement getNewDrawerFolder() {
		return NewDrawerFolder;
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

	@FindBy(xpath = "//*[@id=\"docTypeIndicesTable_wrapper\"]/table/tbody/tr/td[2]/input")
	private WebElement Enter_Report_Name_Text;

	public WebElement getEnter_Report_Name_Text() {
		return Enter_Report_Name_Text;
	}

	@FindBy(xpath = "//div[@id='addPagesDropDown']//span[1]")
	private WebElement Move_To_PlusIcon;

	public WebElement getMove_To_PlusIcon() {
		WebElement ele = Move_To_PlusIcon;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return ele;
	}

	@FindBy(xpath = "//*[@id=\"addDocdropdwn\"]/div[1]/div[1]")
	private WebElement Browse_Option;

	public WebElement getBrowse_Option() {
		return Browse_Option;
	}

	@FindBy(xpath = "//button[@id='createDocumentSubmit']")
	private WebElement Create_Button;

	public WebElement getCreate_Button() {
		return Create_Button;

	}

	@FindBy(xpath = "//*[@id=\"docTypeIndicesTable\"]/tbody/tr/td[2]")
	private WebElement DocumentCVRep;

	public WebElement getDocumentCVRep() {
		return DocumentCVRep;

	}

	@FindBy(xpath = "//button[@id='viewCreatedDocument']")
	private WebElement View_Button;

	public WebElement getView_Button() {
		return View_Button;

	}

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIconNish;

	@FindBy(xpath = "//*[@id='viewDocumentAddPages']")
	private WebElement Browse_OptionNish;

	public WebElement getMove_To_PlusIconNish() {
		return Move_To_PlusIconNish;

	}

	public WebElement getBrowse_OptionNish() {
		return Browse_OptionNish;

	}

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_Button;

	public WebElement getNavigate_Button() {
		return Navigate_Button;

	}

	@FindBy(xpath = "//*[@id=\"createDocuemntNavigator\"]/ul/li[1]/ins")
	private WebElement AutomationCab;

	public WebElement getAutomationCab() {
		return AutomationCab;

	}

	@FindBy(xpath = "//*[@id=\"createDocuemntNavigator\"]/ul/li[1]/ul/li/ins")
	private WebElement AutomationDrawer;

	public WebElement getAutomationDrawer() {
		return AutomationDrawer;

	}

	@FindBy(xpath = "//*[@id=\"createDocuemntNavigator\"]/ul/li[1]/ul/li/ul/li[3]/a")
	private WebElement AutomationFolder;

	public WebElement getAutomationFolder() {
		return AutomationFolder;

	}

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Verify_File_upload_error_Message;

	public WebElement getVerify_File_upload_error_Message() {
		WebElement error = Verify_File_upload_error_Message;
		System.out.println(error.getText());
		return error;
	}

	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement Message_Ok_button;

	public WebElement getMessage_Ok_button() {
		return Message_Ok_button;
	}

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement Save_button;

	public WebElement getSave_button() {
		return Save_button;
	}

	@FindBy(id = "messageButtonOK42")
	private WebElement DocumentSave_Ok_button;

	public WebElement getDocumentSave_Ok_button() {
		return DocumentSave_Ok_button;

	}

	@FindBy(xpath = "//img[@src='images/newRe.png']")
	private WebElement Refresh_button;

	public WebElement getRefresh_button() {
		return Refresh_button;

	}

	// Special characters datadriven

	public String Specialchar_excelRead(int rowNo, int cellNo) throws Exception {

		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("SpecialCharFiles");
		XSSFRow row = s.getRow(rowNo);
		XSSFCell cll = row.getCell(cellNo);
		String cellType = cll.getStringCellValue();
		return cellType;
	}

	@FindBy(xpath = "(//a[normalize-space()='Update'])[1]")
	private WebElement Update_Button;

	public WebElement getUpdate_Button() {
		return Update_Button;
	}

	@FindBy(xpath = "//input[@id='Val_33']")
	private WebElement Update_ReportName;

	public WebElement getUpdate_ReportName() {
		return Update_ReportName;
	}

	@FindBy(xpath = "(//a[normalize-space()='Save'])[1]")
	private WebElement Save_UpdateButton;

	public WebElement getSave_UpdateButton() {
		return Save_UpdateButton;
	}

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement Update_Ok_button;

	public WebElement getUpdate_Ok_button() {
		return Update_Ok_button;
	}

	@FindBy(xpath = "//div[@class='elementHeader']//span[contains(text(),'Properties')]")
	private WebElement Properties_option;

	public WebElement getProperties_option() {
		return Properties_option;
	}

	@FindBy(xpath = "//*[@id=\"Round Brackets__.docx\"]/div/img")
	private WebElement Open_RoundBrackets_page;

	public WebElement getOpen_RoundBrackets_page() {
		return Open_RoundBrackets_page;
	}

	@FindBy(xpath = "//*[@id=\"Accent _.pdf\"]/div/img")
	private WebElement Open_Accent_page;

	public WebElement getOpen_Accent_page() {
		return Open_Accent_page;
	}

	@FindBy(xpath = "//*[@id=\"Ampersant &.djvu\"]/div/img")
	private WebElement Open_Ampersant_page;

	public WebElement getOpen_Ampersant_page() {
		return Open_Ampersant_page;
	}

	@FindBy(xpath = "//*[@id=\"Underscore _.pdf\"]/div/img")
	private WebElement Open_Underscore_page;

	public WebElement getOpen_Underscore_page() {
		return Open_Underscore_page;
	}

	@FindBy(xpath = "//*[@id=\"Flower or Curly bracket __.JPG\"]/div/img")
	private WebElement Open_Flowerbracket_Page;

	public WebElement getOpen_Flowerbracket_Page() {
		return Open_Flowerbracket_Page;
	}

	@FindBy(xpath = "//*[@id=\"Square Bracket __.tiff\"]/div/img")
	private WebElement Open_Squarebracket_page;

	public WebElement getOpen_Squarebracket_page() {
		return Open_Squarebracket_page;
	}

	@FindBy(xpath = "//*[@id=\"Semi Colon _.tif\"]/div/img")
	private WebElement Open_SemiColon_page;

	public WebElement getOpen_SemiColon_page() {
		return Open_SemiColon_page;
	}

	@FindBy(xpath = "//div[@id='fileInfoButton']//span[contains(@class,'fileinformationBtn')]")
	private WebElement Click_FileInfo_Option;

	public WebElement getClick_FileInfo_Option() {

		return Click_FileInfo_Option;
	}

	public WebElement getClick_FileInfo_Option1() {

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
		// ele.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return Click_FileInfo_OkButton_withFileName;

	}

	@FindBy(xpath = "//*[@id=\"Tile_.TIF\"]/div/img")
	private WebElement Open_Tile_page;

	public WebElement getOpen_Tile_page() {
		return Open_Tile_page;
	}

	@FindBy(xpath = "//*[@id=\"At the rate _.xls\"]/div/img")
	private WebElement Open_Attherate_page;

	public WebElement getOpen_Attherate_page() {
		return Open_Attherate_page;
	}

	@FindBy(xpath = "//*[@id=\"Hash _.TIF\"]/div/img")
	private WebElement Open_Hash_page;

	public WebElement getOpen_Hash_page() {
		return Open_Hash_page;
	}

	@FindBy(xpath = "//*[@id=\"Dollar _.jpg\"]/div/img")
	private WebElement Open_Dollar_page;

	public WebElement getOpen_Dollar_page() {
		return Open_Dollar_page;
	}

	@FindBy(xpath = "//*[@id=\"Plus _.TIF\"]/div/img")
	private WebElement Open_Plus_page;

	public WebElement getOpen_Plus_page() {
		return Open_Plus_page;
	}

	@FindBy(xpath = "//*[@id=\"Caret _.TIF\"]/div/img")
	private WebElement Open_Caret_page;

	public WebElement getOpen_Caret_page() {
		return Open_Caret_page;
	}

	@FindBy(xpath = "//*[@id=\"Equal to _.TIF\"]/div/img")
	private WebElement Open_Equals_page;

	public WebElement getOpen_Equals_page() {
		return Open_Equals_page;
	}

	@FindBy(xpath = "//*[@id=\"Single Quote _.png\"]/div/img")
	private WebElement Open_SingleQuote_page;

	public WebElement getOpen_SingleQuote_page() {
		return Open_SingleQuote_page;
	}

	@FindBy(xpath = "//*[@id=\"Comm_.DOCX\"]/div/img")
	private WebElement Open_Comma_page;

	public WebElement getOpen_Comma_page() {
		return Open_Comma_page;
	}

	@FindBy(xpath = "//*[@id=\"Exclamatory _.csv\"]/div/img")
	private WebElement Open_Exclamatory_page;

	public WebElement getOpen_Exclamatory_page() {
		return Open_Exclamatory_page;
	}

	@FindBy(xpath = "//*[@id=\"Hyphen -.tif\"]/div/img")
	private WebElement Open_Hyphen_page;

	public WebElement getOpen_Hyphen_page() {
		return Open_Hyphen_page;

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
	private WebElement Reportvaluevalidationerror;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement CommentOKbutton;

	public WebElement getReportvaluevalidationerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "ReportName*  	field is required";
		String actualtext = Reportvaluevalidationerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println(Reportvaluevalidationerror.getText());
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
}
