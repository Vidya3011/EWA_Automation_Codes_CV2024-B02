package Computhink.Pom;

//Dipak Automation Coading

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Document_Version extends Computhink.Generic.BaseClass {

	public static WebElement element = null;

	public Document_Version() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle\"]")
	private WebElement Cancel_Button_BrowseforFolder;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	@FindBy(xpath = (".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_subFolder;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
	private WebElement Select_Document;

	@FindBy(xpath = "//*[@id=\"version\"]/div/div[1]/span")
	private WebElement Version_Option;

	@FindBy(xpath = "//*[@id=\"fabButton\"]")
	private WebElement Fab;

	@FindBy(xpath = "//*[@id=\"uploadFabButton\"]")
	private WebElement FloatingButton;

	@FindBy(xpath = "//*[@id=\"uploadFabButton\"]")
	private WebElement UploadFab;
	
	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"saveFabButton\"]")
	private WebElement SaveFab;

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement SaveOkButton;
	
	@FindBy(xpath = "//*[@id=\"versionRow_1.0\"]/td[1]/input")
	private WebElement CheckFirst_Version;
	
	@FindBy(xpath = "//*[@id=\"versionRow_1.0\"]/td[2]")
	private WebElement Verify_Version1;
	
	public void getVerify_FirstVersion() {
		
		jsclick(CheckFirst_Version);
		Reporter.log("Select First Version", true);
		String expectedtext = "1.0";
		String actualtext = Verify_Version1.getText();
		Assert.assertEquals(actualtext, expectedtext);
		Reporter.log( Verify_Version1.getText() + " this V/R should show", true);
	}
	
	@FindBy(xpath = "//*[@id=\"versionRow_2.0\"]/td[1]/input")
	private WebElement Checksecond_Version;
	
	@FindBy(xpath = "//*[@id=\"versionRow_2.0\"]/td[2]")
	private WebElement Verify_Version2;
	
	@FindBy(xpath = "//*[@id=\"versionRow_2.0\"]/td[5]")
	private WebElement Verify_commentversion2;
	
public void getVerify_secondVersion() {
		
		jsclick(Checksecond_Version);
		Reporter.log("Select second Version", true);
		String expectedtext = "2.0";
		String actualtext = Verify_Version2.getText();
		Assert.assertEquals(actualtext, expectedtext);
		Reporter.log(Verify_Version2.getText() + " this V/R should show", true);
		String expectedtext1 = "Pages Updated";
		String actualtext1 = Verify_commentversion2.getText();
		Assert.assertEquals(actualtext1, expectedtext1);
		Reporter.log( Verify_commentversion2.getText() + " this Comment should show", true);
	}

public void getVerify_secondVersionupdateComment() {
	
	jsclick(Checksecond_Version);
	Reporter.log("Select second Version", true);
	String expectedtext = "2.0";
	String actualtext = Verify_Version2.getText();
	Assert.assertEquals(actualtext, expectedtext);
	String expectedtext1 = "Document has been Updated Successfully";
	String actualtext1 = Verify_commentversion2.getText();
	Assert.assertEquals(actualtext1, expectedtext1);
	Reporter.log(Verify_commentversion2.getText() + " this Updated Comment should show", true);
}

public void getVerify_ThirdVersion() {
	
	jsclick(Checksecond_Version);
	Reporter.log("Select second Version", true);
	String expectedtext = "2.0";
	String actualtext = Verify_Version2.getText();
	Assert.assertEquals(actualtext, expectedtext);
	String expectedtext1 = "Document has been Updated Successfully";
	String actualtext1 = Verify_commentversion2.getText();
	Assert.assertEquals(actualtext1, expectedtext1);
	Reporter.log(Verify_commentversion2.getText() + " this Updated Comment should show", true);
}
	
	

	@FindBy(xpath = "//td[normalize-space()='Pages Updated']")
	private WebElement Click_Message;

	@FindBy(xpath = "(//a[normalize-space()='Comments'])[1]")
	private WebElement Comments_Option;

	@FindBy(xpath = "//*[@id=\"vesioncomments\"]")
	private WebElement Comments_Box;

	@FindBy(xpath = "//*[@id=\"VersionCommentOk\"]")
	private WebElement Save_Comments;

	@FindBy(xpath = "//div[@class='class2']//input[@type='checkbox']")
	private WebElement Select_ThumbnailPage;

	@FindBy(xpath = "//*[@id=\"deleteFabButton\"]")
	private WebElement Delete_FabButton;

	@FindBy(xpath = "//*[@id=\"deleteMessageOk19\"]")
	private WebElement Delete_Yes;

	@FindBy(xpath = "//*[@id=\"messageButtonOKDEl\"]")
	private WebElement Delete_Ok;

	@FindBy(xpath = "(//a[normalize-space()='Delete all versions'])[1]")
	private WebElement Delete_AllVersions;

	@FindBy(xpath = "(//button[@id='deleteVersionMessageOk'])[1]")
	private WebElement Delete_VersionmessageOk;

	@FindBy(xpath = "//*[@id=\"fullScreenFabButton\"]")
	private WebElement FullScreen_Fabbutton;

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement CloseDoc;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]")
	private WebElement CheckDoc;

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;

	@FindBy(xpath = "//*[@id=\"pasteid\"]")
	private WebElement Paste_ID;

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	@FindBy(xpath = "//*[@id=\"delDocument\"]")
	private WebElement deletedoc;

	@FindBy(xpath = "//*[@id=\"deleteMessageOk\"]")
	private WebElement deleteOK;

	@FindBy(xpath = "//*[@id=\"createDocument\"]")
	private WebElement Click_New_Document;

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	// Select from Destination folder Location

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder1;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"docTypeList\"]")
	private WebElement Click_Document_Type_Dropdown;

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportName;

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
	private WebElement Browse_Option;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Create_button;

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement ViewDocument_Button;

	@FindBy(xpath = "//*[@id=\"btnSignatureAdd\"]/span[1]")
	private WebElement Click_signature_Menuoption;

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement Add_Signature_Onpage;

	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;

	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement Save_button;

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement DocumentSave_Ok_button;

	@FindBy(xpath = "//*[@id=\"versionRow_1.0\"]")
	private WebElement Set_active_version;

	@FindBy(xpath = "(//a[normalize-space()='Set active version'])[1]")
	private WebElement Set_active_version_button;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[2]")
	private WebElement Load_Metadata;

	@FindBy(xpath = "//tbody//span[contains(text(),'Versions')]")
	private WebElement Click_Metadata_Version_Option;

	@FindBy(xpath = "(//a[normalize-space()='Update'])[1]")
	private WebElement Update_Button;

	@FindBy(xpath = "//input[@id='Val_21']")
	private WebElement Update_ReportName;

	@FindBy(xpath = "(//a[normalize-space()='Save'])[1]")
	private WebElement Save_UpdateButton;

	@FindBy(xpath = "//*[@id=\"CommentsMessageModelOk\"]")
	private WebElement Update_Ok_button;

	@FindBy(xpath = "//*[@id=\"recentMenuBtn\"]")
	private WebElement MoveTo_Menu_Recent;

	@FindBy(xpath = "//*[@id=\"recentFolders\"]/tbody/tr[1]/td")
	private WebElement Recent_Folder;

	public void get_CopyandPaste_Document() throws InterruptedException {

		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(Copy_ID);
		Thread.sleep(2000);
		element = MoveTo_Menu_Documents;
		Actions action1 = new Actions(driver);
		action1.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(Paste_ID);

	}

	public void getVerify_Delete_Document() throws InterruptedException {

		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(deletedoc);
		Thread.sleep(6000);
		jsclick(deleteOK);

	}

	public void getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
	}

	public void getEnter_ReportName() throws Exception {
		jsclick(Enter_ReportName);
		Enter_ReportName.sendKeys(DocumentVersion_excelRead(2, 0));

	}

	public WebElement getMove_To_PlusIcon() {
		WebElement ele = Move_To_PlusIcon;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return ele;
	}

	public WebElement getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	public void getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Signature_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();

	}

	public void getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys(DocumentVersion_excelRead(3, 0));
		jsclick(verifypassok);

	}

	public void getMoveTo_Menu_Recent() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Recent).perform();

	}

	public void Create_Document_Verify_Version() throws Exception {

		Reporter.log("Test Scenario 1 : Create New Document and Verifying Document Versions ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is already logged");
		}
		try {
			jsclick(Cancel_Button_BrowseforFolder);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Folder navigation dialog not open
		}
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
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
		Reporter.log("Select Document type dropdown", true);
		getEnter_ReportName();
		Thread.sleep(2000);
		Reporter.log("Enter value into Report Name field", true);
		movingElement(getMove_To_PlusIcon());
		getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
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
		Reporter.log("PDF Page is uploaded successfully", true);
		movingclkElement(Create_button);
		Thread.sleep(6000);
		Reporter.log("Click on Create button", true);
		jsclick(ViewDocument_Button);
		Thread.sleep(10000);
		Reporter.log("Click on View document option", true);
		Reporter.log("PDF is created successfully", true);
		jsclick(Version_Option);
		Thread.sleep(4000);
		Reporter.log("Click on Version Option", true);
		getVerify_FirstVersion();
		Reporter.log("Verified Current Document Version Successfully");
		
	}

	public void Add_Page_with_Comment() throws Exception {

		Reporter.log("Test Scenario 2 : Upload and Save New page and Verifying Version with new Comments ", true);
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		jsclick(Version_Option);
		Thread.sleep(4000);
		Reporter.log("Click on Version Option", true);
		jsclick(Fab);
		Thread.sleep(6000);
		movingclkElement(FloatingButton);
		Thread.sleep(6000);
		Reporter.log("Click on Floating button", true);
		jsclick(UploadFab);
		Thread.sleep(2000);
		Reporter.log("Click on Upload Fab button", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(6000);
		jsclick(SaveFab);
		Thread.sleep(6000);
		Reporter.log("Click on Save Fab button", true);
		jsclick(SaveOkButton);
		Thread.sleep(6000);
		Reporter.log("Click on Save button", true);
		jsclick(Version_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Version Option", true);
		getVerify_secondVersion();
		Thread.sleep(6000);
		Reporter.log("Message Verified", true);
		jsclick(Click_Message);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Comments_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Comment Option", true);
		jsclick(Comments_Box);
		Reporter.log("Click on Comment Textbox", true);
		Comments_Box.clear();
		Comments_Box.sendKeys(DocumentVersion_excelRead(1, 0));
		Thread.sleep(6000);
		Reporter.log("Enter Comment into Comment field", true);
		jsclick(Save_Comments);
		Thread.sleep(6000);
		Reporter.log("Click on Save button", true);
		getVerify_secondVersionupdateComment();
		
		Reporter.log("Document Version Update with Comments and verified", true);
	}

	public void Delete_Page() throws Exception {

		Reporter.log("Test Scenario 3 : Delete Page and Verifying Version ", true);
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		jsclick(Select_ThumbnailPage);
		Thread.sleep(6000);
		Reporter.log("Check Thumbnail page", true);
		jsclick(Delete_FabButton);
		Thread.sleep(6000);
		Reporter.log("Click on Delete Fab button", true);
		jsclick(Delete_Yes);
		Thread.sleep(6000);
		Reporter.log("Click on Yes button", true);
		jsclick(Delete_Ok);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(SaveFab);
		Thread.sleep(6000);
		Reporter.log("Click on Save Fab button", true);
		jsclick(SaveOkButton);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		movingclkElement(Version_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Version Option", true);
		
		
		Reporter.log("Document Page delete and Verified versions", true);
	}

	public void Delete_All_version_with_Fullscreen() throws Exception {

		Reporter.log("Test Scenario 4 : Verifying Delete All versions and Full Screen Option ", true);
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		jsclick(Delete_AllVersions);
		Thread.sleep(6000);
		Reporter.log("Click on All Version", true);
		jsclick(Delete_VersionmessageOk);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Version_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Version Option", true);
		jsclick(FullScreen_Fabbutton);
		Thread.sleep(6000);
		Reporter.log("Click on Full Screen Fab button", true);
		jsclick(CloseDoc);
		Thread.sleep(6000);
		Reporter.log("Click on the Close button", true);
		Reporter.log("Verified Delete All versions and Full screen Document from Floating button", true);
	}

	public void Add_Annotations() throws Exception {

		Reporter.log("Test Scenario 5 : Verifying set Active version ", true);
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("click on Refresh button ", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		jsclick(Select_Document);
		Thread.sleep(6000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("open document from Document List", true);
		movingElement(FloatingButton);
		Thread.sleep(6000);
		Reporter.log("Click on Floating button", true);
		jsclick(UploadFab);
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Thread.sleep(6000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(FloatingButton);
		Reporter.log("Click on Floating button", true);
		jsclick(SaveFab);
		Thread.sleep(6000);
		Reporter.log("Click on Save button", true);
		jsclick(SaveOkButton);
		Thread.sleep(9000);
		Reporter.log("Click on Ok button", true);
		jsclick(Version_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Version Option", true);
		movingclkElement(Click_signature_Menuoption);
		Thread.sleep(6000);
		Reporter.log("Click on signature menu Option", true);
		try {
			getinputpassword();
			Thread.sleep(6000);
			Reporter.log("Enter a Password", true);
		} catch (Exception e) {
			System.out.println("signature is not password protected...");
		}
		getAdd_Signature_Onpage();
		Thread.sleep(6000);
		Reporter.log("New signature added Successfully on  Document", true);
		jsclick(Save_button);
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(DocumentSave_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Version_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Version Option", true);
		Reporter.log("Verifying version Page annotated/modified ", true);
	}

	public void Set_ActiveVersion() throws Exception {

		Reporter.log("Test Scenario 6 : Verifying set Active version ", true);

		try {
			LogDipakUser();
			Thread.sleep(6000);
			getMoveTo_Menu_Recent();
			Thread.sleep(4000);
			Reporter.log("Move to Recent Tab", true);
			jsclick(Recent_Folder);
			Thread.sleep(6000);
			Reporter.log("Click on Recent Folder", true);
			Thread.sleep(6000);
			jsclick(Select_Document);
			Thread.sleep(6000);
			Thread.sleep(6000);
			Reporter.log("Open document from Document List", true);
			jsclick(Version_Option);
			Thread.sleep(6000);
			Reporter.log("Click on Version Option", true);

			try {
				WebDriverWait wait1 = new WebDriverWait(driver, 20);
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alt = driver.switchTo().alert();
				alt.accept();
			} catch (Exception e) {
				System.out.println("Alert is not present...");
			}

		} catch (Exception e) {
			System.out.println("User is already logged");
		}
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		jsclick(Set_active_version);
		Thread.sleep(6000);
		Reporter.log("select version to set active version", true);
		jsclick(Set_active_version_button);
		Reporter.log("Click on Set active Version button", true);
		Thread.sleep(6000);
		jsclick(Version_Option);
		Thread.sleep(9000);
		Reporter.log("Click on Version Option", true);
		Reporter.log("Active version set and verified successfully", true);
		
	}

	public void Update_Doc_Properties() throws Exception {

		Reporter.log("Test Scenario 7 : Update document properties ", true);
		if(Nobutton.isDisplayed()==true) {
			movingclkElement(Nobutton);
		}else {
			// Saving dialog not present
		}
		jsclick(Update_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Update button", true);
		Update_ReportName.clear();
		Reporter.log("Clear Report Name value from Reportname field", true);
		Update_ReportName.sendKeys(DocumentVersion_excelRead(4, 0));
		Thread.sleep(6000);
		Reporter.log("Update Report Name value ", true);
		jsclick(Save_UpdateButton);
		Thread.sleep(6000);
		Reporter.log("Click on Update Save button", true);
		jsclick(Update_Ok_button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(CloseDoc);
		Thread.sleep(6000);
		Reporter.log("Click on Close button", true);
		Reporter.log("verified and updated Document properties", true);
		Refresh_Button();
		Reporter.log("Click on Refresh button", true);
		Thread.sleep(6000);
	}
}
