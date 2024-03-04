package Pom;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Document_Version extends Generic.BaseClass {

	public static WebElement element = null;

	public Document_Version() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"homeMenuBtn\"]/img")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
	}

	@FindBy(xpath = "(//ins[@class='jstree-icon'])[25]")
	private WebElement Cabinet_Plus_button;

	public WebElement getCabinet_Plus_button() {
		return Cabinet_Plus_button;
	}

	@FindBy(xpath = "(//ins[@class='jstree-icon'])[27]")
	private WebElement Drawer_Plus_button;

	public WebElement getDrawer_Plus_button() {
		return Drawer_Plus_button;
	}

	@FindBy(xpath = ("//a[text()='Test apk']"))
	private WebElement Folder;

	public WebElement get_Folder() {
		return Folder;
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

	@FindBy(xpath = "(//i[@id='fabButton'])[1]")
	private WebElement FloatingButton;

	public WebElement getFloatingButton() {
		return FloatingButton;
	}

	@FindBy(xpath = "(//i[@id='uploadFabButton'])[1]")
	private WebElement UploadFab;

	public WebElement getUploadFab() {
		return UploadFab;
	}

	@FindBy(xpath = "//i[@id='saveFabButton']")
	private WebElement SaveFab;

	public WebElement getSaveFab() {
		return SaveFab;
	}

	@FindBy(xpath = "(//button[@id='messageButtonOK42'])[1]")
	private WebElement SaveOkButton;

	public WebElement getSaveOkButton() {
		return SaveOkButton;
	}

	@FindBy(xpath = "//td[normalize-space()='Pages Updated']")
	private WebElement Verify_Message;

	public WebElement getVerify_Message() {
		WebElement Message = Verify_Message;
		System.out.println(Message.getText());
		return Message;
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

	@FindBy(xpath = "//textarea[@id='vesioncomments']")
	private WebElement Comments_Box;

	public WebElement getComments_Box() {
		return Comments_Box;
	}

	// Document version datadriven

	public String DocumentVersion_excelRead(int rowNo, int cellNo) throws Exception {

		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("DocumentVersion");
		XSSFRow row = s.getRow(rowNo);
		XSSFCell cll = row.getCell(cellNo);
		String cellType = cll.getStringCellValue();
		return cellType;
	}

	@FindBy(xpath = "(//button[@id='VersionCommentOk'])[1]")
	private WebElement Save_Comments;

	public WebElement getSave_Comments() {
		return Save_Comments;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[58]/div[64]/div[7]/div[4]/div[1]/div[1]/input[1]")
	private WebElement Select_ThumbnailPage;

	public WebElement getSelect_ThumbnailPage() {
		return Select_ThumbnailPage;
	}

	@FindBy(xpath = "(//i[@id='deleteFabButton'])[1]")
	private WebElement Delete_FabButton;

	public WebElement getDelete_FabButton() {
		return Delete_FabButton;
	}

	@FindBy(xpath = "(//button[@id='deleteMessageOk19'])[1]")
	private WebElement Delete_Yes;

	public WebElement getDelete_Yes() {
		return Delete_Yes;
	}

	@FindBy(xpath = "(//button[@id='messageButtonOKDEl'])[1]")
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

	@FindBy(xpath = "(//i[@id='fullScreenFabButton'])[1]")
	private WebElement FullScreen_Fabbutton;

	public WebElement getFullScreen_Fabbutton() {
		return FullScreen_Fabbutton;
	}

	@FindBy(xpath = "(//span[@title='Document Close'])[1]")
	private WebElement CloseDoc;

	public WebElement getCloseDoc() {
		return CloseDoc;
	}
	
	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]")
	private WebElement CheckDoc;

	public WebElement getCheckDoc() {
		return CheckDoc;
	}
	
	@FindBy(id = "copyId")
	private WebElement Copy_ID;
	@FindBy(id = "pasteid")
	private WebElement Paste_ID;
	@FindBy(xpath = "//a[@id='documentListSubMenu']")
	private WebElement MoveTo_Menu_Documents;

	public WebElement get_CopyandPaste_Document() throws InterruptedException {
		
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
		return Paste_ID;
	}

	@FindBy(id = "delDocument")
	private WebElement deletedoc;
	@FindBy(id = "deleteMessageOk")
	private WebElement deleteOK;

	public WebElement getVerify_Delete_Document() throws InterruptedException {
		
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(deletedoc);
		Thread.sleep(6000);
		jsclick(deleteOK);
		return deleteOK;
	}
}
