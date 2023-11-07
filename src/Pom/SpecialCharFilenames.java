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

public class SpecialCharFilenames extends Generic.BaseClass {



	public SpecialCharFilenames() {
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

	@FindBy(xpath = ("(//a[text()='CVApp Test'])[1]"))
	private WebElement Select_Cabinet;

	public WebElement getSelect_Cabinet() {
		return Select_Cabinet;
	}

	@FindBy(xpath = ("//a[text()='CVMobile App 2022']"))
	private WebElement Select_Drawer;

	public WebElement getSelect_Drawer() {
		return Select_Drawer;
	}

	@FindBy(xpath = ("//a[text()='Test apk']"))
	private WebElement Select_Folder;

	public WebElement getSelect_Folder() {
		return Select_Folder;
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
	private WebElement Enter_Report_Name_Text;

	public WebElement getEnter_Report_Name_Text() {
		return Enter_Report_Name_Text;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[2]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]")
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

	@FindBy(xpath = "//button[@id='createDocumentSubmit']")
	private WebElement Create_Button;

	public WebElement getCreate_Button() {
		return Create_Button;

	}

	@FindBy(xpath = "//button[@id='viewCreatedDocument']")
	private WebElement View_Button;

	public WebElement getView_Button() {
		return View_Button;

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

	@FindBy(xpath = "//img[@id='createDocumentDocTypeRefresh']")
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

	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[3]")
	private WebElement Update_Button;

	public WebElement getUpdate_Button() {
		return Update_Button;
	}

	@FindBy(xpath = "//input[@id='Val_33']")
	private WebElement Update_ReportName;

	public WebElement getUpdate_ReportName() {
		return Update_ReportName;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[2]")
	private WebElement Save_UpdateButton;

	public WebElement getSave_UpdateButton() {
		return Save_UpdateButton;
	}

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement Update_Ok_button;

	public WebElement getUpdate_Ok_button() {
		return Update_Ok_button;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[4]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]")
	private WebElement Properties_option;

	public WebElement getProperties_option() {
		return Properties_option;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[12]/div[1]/img[1]")
	private WebElement Open_RoundBrackets_page;

	public WebElement getOpen_RoundBrackets_page() {
		return Open_RoundBrackets_page;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[13]/div[1]/img[1]")
	private WebElement Open_Accent_page;

	public WebElement getOpen_Accent_page() {
		return Open_Accent_page;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[14]/div[1]/img[1]")
	private WebElement Open_Ampersant_page;

	public WebElement getOpen_Ampersant_page() {
		return Open_Accent_page;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[15]/div[1]/img[1]")
	private WebElement Open_Underscore_page;

	public WebElement getOpen_Underscore_page() {
		return Open_Underscore_page;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[16]/div[1]/img[1]")
	private WebElement Open_Flowerbracket_Page;

	public WebElement getOpen_Flowerbracket_Page() {
		return Open_Underscore_page;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[17]/div[1]/img[1]")
	private WebElement Open_Squarebracket_page;

	public WebElement getOpen_Squarebracket_page() {
		return Open_Underscore_page;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[18]/div[1]/img[1]")
	private WebElement Open_SemiColon_page;

	public WebElement getOpen_SemiColon_page() {
		return Open_SemiColon_page;
	}

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
	
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[2]/div[1]/img[1]")
	private WebElement Open_Tile_page;

	public WebElement getOpen_Tile_page() {
		return Open_Tile_page;
	}
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[3]/div[1]/img[1]")
	private WebElement Open_Attherate_page;

	public WebElement getOpen_Attherate_page() {
		return Open_Attherate_page;
	}
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[4]/div[1]/img[1]")
	private WebElement Open_Hash_page;

	public WebElement getOpen_Hash_page() {
		return Open_Hash_page;
	}
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[5]/div[1]/img[1]")
	private WebElement Open_Dollar_page;

	public WebElement getOpen_Dollar_page() {
		return Open_Dollar_page;
	}
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[6]/div[1]/img[1]")
	private WebElement Open_Plus_page;

	public WebElement getOpen_Plus_page() {
		return Open_Plus_page;
	}
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[7]/div[1]/img[1]")
	private WebElement Open_Caret_page;

	public WebElement getOpen_Caret_page() {
		return Open_Caret_page;
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[8]/div[1]/img[1]")
	private WebElement Open_Equals_page;

	public WebElement getOpen_Equals_page() {
		return Open_Equals_page;
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[9]/div[1]/img[1]")
	private WebElement Open_SingleQuote_page;

	public WebElement getOpen_SingleQuote_page() {
		return Open_SingleQuote_page;
	}
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[10]/div[1]/img[1]")
	private WebElement Open_Comma_page;

	public WebElement getOpen_Comma_page() {
		return Open_Comma_page;
	}
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[11]/div[1]/img[1]")
	private WebElement Open_Exclamatory_page;

	public WebElement getOpen_Exclamatory_page() {
		return Open_Exclamatory_page;
	}
}
