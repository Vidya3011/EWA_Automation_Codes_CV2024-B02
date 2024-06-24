package Pom;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Document_Version extends Generic.BaseClass {

	public static WebElement element = null;

	public Document_Version() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"homeMenuBtn\"]")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
	}

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

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
	private WebElement Select_Document;

	public WebElement getSelect_Document() {
		return Select_Document;
	}

	@FindBy(xpath = "//*[@id=\"version\"]/div/div[1]/span")
	private WebElement Version_Option;

	public WebElement getVersion_Option() {
		return Version_Option;
	}

	@FindBy(xpath = "//*[@id=\"fabButton\"]")
	private WebElement Fab;

	public WebElement getFab() {
		return Fab;
	}

	@FindBy(xpath = "//*[@id=\"uploadFabButton\"]")
	private WebElement FloatingButton;

	public WebElement getFloatingButton() {
		return FloatingButton;
	}

	@FindBy(xpath = "//*[@id=\"uploadFabButton\"]")
	private WebElement UploadFab;

	public WebElement getUploadFab() {
		return UploadFab;
	}

	@FindBy(xpath = "//*[@id=\"saveFabButton\"]")
	private WebElement SaveFab;

	public WebElement getSaveFab() {
		return SaveFab;
	}

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement SaveOkButton;

	public WebElement getSaveOkButton() {
		return SaveOkButton;
	}

	@FindBy(xpath = "//*[@id=\"versionRow_1.0\"]")
	private WebElement Verify_Message;

	public void getVerify_Message() {
		WebElement Message = Verify_Message;
		Reporter.log(Message.getText() + " this message should show", true);

	}

	@FindBy(xpath = "//td[normalize-space()='Pages Updated']")
	private WebElement Click_Message;

	public WebElement getClick_Message() {
		return Click_Message;
	}

	@FindBy(xpath = "(//a[normalize-space()='Comments'])[1]")
	private WebElement Comments_Option;

	public WebElement getComments_Option() {
		return Comments_Option;
	}

	@FindBy(xpath = "//*[@id=\"vesioncomments\"]")
	private WebElement Comments_Box;

	public WebElement getComments_Box() {
		return Comments_Box;
	}

	// Document version datadriven

	public String DocumentVersion_excelRead(int rowNo, int cellNo) throws Exception {

		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet s = wb.getSheet("DocumentVersion");
			XSSFRow row = s.getRow(rowNo);
			XSSFCell cll = row.getCell(cellNo);
			String cellType = cll.getStringCellValue();
			return cellType;
		}
	}

	@FindBy(xpath = "//*[@id=\"VersionCommentOk\"]")
	private WebElement Save_Comments;

	public WebElement getSave_Comments() {
		return Save_Comments;
	}

	@FindBy(xpath = "//body[1]/div[58]/div[65]/div[7]/div[4]/div[1]/div[1]/input[1]")
	private WebElement Select_ThumbnailPage;

	public WebElement getSelect_ThumbnailPage() {
		return Select_ThumbnailPage;
	}

	@FindBy(xpath = "//*[@id=\"deleteFabButton\"]")
	private WebElement Delete_FabButton;

	public WebElement getDelete_FabButton() {
		return Delete_FabButton;
	}

	@FindBy(xpath = "//*[@id=\"deleteMessageOk19\"]")
	private WebElement Delete_Yes;

	public WebElement getDelete_Yes() {
		return Delete_Yes;
	}

	@FindBy(xpath = "//*[@id=\"messageButtonOKDEl\"]")
	private WebElement Delete_Ok;

	public WebElement getDelete_Ok() {
		return Delete_Ok;
	}

	@FindBy(xpath = "(//a[normalize-space()='Delete all versions'])[1]")
	private WebElement Delete_AllVersions;

	public WebElement getDelete_AllVersions() {
		return Delete_AllVersions;
	}

	@FindBy(xpath = "(//button[@id='deleteVersionMessageOk'])[1]")
	private WebElement Delete_VersionmessageOk;

	public WebElement getyDelete_VersionmessageOk() {
		return Delete_VersionmessageOk;
	}

	@FindBy(xpath = "//*[@id=\"fullScreenFabButton\"]")
	private WebElement FullScreen_Fabbutton;

	public WebElement getFullScreen_Fabbutton() {
		return FullScreen_Fabbutton;
	}

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement CloseDoc;

	public WebElement getCloseDoc() {
		return CloseDoc;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]")
	private WebElement CheckDoc;

	public WebElement getCheckDoc() {
		return CheckDoc;
	}

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;
	@FindBy(xpath = "//*[@id=\"pasteid\"]")
	private WebElement Paste_ID;
	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	public void get_CopyandPaste_Document() throws InterruptedException {

		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(Copy_ID);
		Thread.sleep(2000);
		element = MoveTo_Menu_Documents;
		Actions action1 = new Actions(driver);
		action1.moveToElement(element).perform();
		Thread.sleep(3000);
		jsclick(Paste_ID);

	}

	@FindBy(xpath = "//*[@id=\"delDocument\"]")
	private WebElement deletedoc;
	@FindBy(xpath = "//*[@id=\"deleteMessageOk\"]")
	private WebElement deleteOK;

	public void getVerify_Delete_Document() throws InterruptedException {

		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(deletedoc);
		Thread.sleep(6000);
		jsclick(deleteOK);

	}

	@FindBy(xpath = "//*[@id=\"createDocument\"]")
	private WebElement Click_New_Document;

	public WebElement getClick_New_Document() {
		return Click_New_Document;
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

	public void getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
	}

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportName;

	public void getEnter_ReportName() throws Exception {
		Enter_ReportName.click();
		Enter_ReportName.sendKeys(DocumentVersion_excelRead(2, 0));

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
	private WebElement Create_button;

	public WebElement getCreate_button() {
		return Create_button;
	}

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement ViewDocument_Button;

	public WebElement getViewDocument_Button() {
		return ViewDocument_Button;
	}

	@FindBy(xpath = "//*[@id=\"btnSignatureAdd\"]/span[1]")
	private WebElement Click_signature_Menuoption;

	public void getClick_signature_Menuoption() throws Exception {
		jsclick(Click_signature_Menuoption);

	}

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement Add_Signature_Onpage;

	public void getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Signature_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();

	}

	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;
	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;

	public void getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys(DocumentVersion_excelRead(3, 0));
		jsclick(verifypassok);

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

	@FindBy(xpath = "//*[@id=\"versionRow_1.0\"]")
	private WebElement Set_active_version;

	public WebElement getSet_active_version() {
		return Set_active_version;

	}

	@FindBy(xpath = "(//a[normalize-space()='Set active version'])[1]")
	private WebElement Set_active_version_button;

	public WebElement getSet_active_version_button() {
		return Set_active_version_button;

	}

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[2]")
	private WebElement Load_Metadata;

	public WebElement getLoad_Metadata() {
		return Load_Metadata;

	}

	@FindBy(xpath = "//tbody//span[contains(text(),'Versions')]")
	private WebElement Click_Metadata_Version_Option;

	public WebElement getClick_Metadata_Version_Option() {
		return Click_Metadata_Version_Option;

	}

	@FindBy(xpath = "(//a[normalize-space()='Update'])[1]")
	private WebElement Update_Button;

	public WebElement getUpdate_Button() {
		return Update_Button;
	}

	@FindBy(xpath = "//body[1]/div[58]/div[65]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Update_ReportName;

	public WebElement getUpdate_ReportName() {
		return Update_ReportName;
	}

	@FindBy(xpath = "(//a[normalize-space()='Save'])[1]")
	private WebElement Save_UpdateButton;

	public WebElement getSave_UpdateButton() {
		return Save_UpdateButton;
	}

	@FindBy(xpath = "//*[@id=\"CommentsMessageModelOk\"]")
	private WebElement Update_Ok_button;

	public WebElement getUpdate_Ok_button() {
		return Update_Ok_button;
	}

	@FindBy(xpath = "//*[@id=\"recentMenuBtn\"]")
	private WebElement MoveTo_Menu_Recent;

	public void getMoveTo_Menu_Recent() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Recent).perform();

	}

	@FindBy(xpath = "//*[@id=\"recentFolders\"]/tbody/tr[1]/td")
	private WebElement Recent_Folder;

	public WebElement get_clickRecent_Folder() {
		return Recent_Folder;
	}
}
