package Pom;

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

public class SpecialCharFilenames extends Generic.BaseClass {

	public static WebElement element = null;

	public SpecialCharFilenames() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = ("//*[@id=\"createDocument\"]"))
	private WebElement NewDocuments_MenuOption;

	public WebElement getNewDocuments_MenuOption() {
		return NewDocuments_MenuOption;
	}

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	public WebElement getDestination_Folder_Textbox() {
		return Destination_Folder_Textbox;
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

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_Report_Name_Text;

	public WebElement getEnter_Report_Name_Text() {
		return Enter_Report_Name_Text;
	}

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	public WebElement getMove_To_PlusIcon() {
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

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Create_Button;

	public WebElement getCreate_Button() {
		return Create_Button;

	}

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement View_Button;

	public WebElement getView_Button() {
		return View_Button;

	}

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement Save_button;

	public WebElement getSave_button() {
		return Save_button;
	}

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement DocumentSave_Ok_button;

	public WebElement getDocumentSave_Ok_button() {
		return DocumentSave_Ok_button;

	}

	@FindBy(xpath = "//*[@id=\"homeMenuBtn\"]")
	private WebElement Refreshbutton;

	public WebElement getRefresh_button() {
		return Refreshbutton;

	}

	// Special characters datadriven

	public String Specialchar_excelRead(int rowNo, int cellNo) throws Exception {

		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet s = wb.getSheet("SpecialCharFiles");
			XSSFRow row = s.getRow(rowNo);
			XSSFCell cll = row.getCell(cellNo);
			String cellType = cll.getStringCellValue();
			return cellType;
		}
	}

	@FindBy(xpath = "(//a[normalize-space()='Update'])[1]")
	private WebElement Update_Button;

	public WebElement getUpdate_Button() {
		return Update_Button;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[58]/div[64]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
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

	@FindBy(xpath = "//*[@id=\"properties\"]/div/div[1]")
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

	@FindBy(xpath = "//*[@id=\"fileInfoButton\"]/span")
	private WebElement Click_FileInfo_Option;

	public void getClick_FileInfo_Option() {
		Click_FileInfo_Option.click();

	}

	@FindBy(xpath = "//*[@id=\"fileNameLabel\"]")
	private WebElement Click_FileInfo_OkButton_withFileName;
	@FindBy(xpath = "//*[@id=\"fileRenameOK\"]")
	private WebElement RemarkOk;

	public void getClick_FileInfo_OkButton_withFileName() {
		WebElement Filename = Click_FileInfo_OkButton_withFileName;
		Reporter.log("File name is:" + Filename.getText() + "this message should show", true);
		WebElement ele = RemarkOk;
		ele.click();

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

	public void getFolderSelectMessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please select a folder to create document";
		String actualtext = FolderSelectMessage.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(FolderSelectMessage.getText() + "this validation message should show", true);
		jsclick(CommentOK);

	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Reportvaluevalidationerror;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement CommentOKbutton;

	public void getReportvaluevalidationerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "ReportName*  	field is required";
		String actualtext = Reportvaluevalidationerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(Reportvaluevalidationerror.getText() + "this validation message should show", true);
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
		Reporter.log(NavigateDoc.getText() + "this message should show", true);
		jsclick(NavigateButton);

	}
}
