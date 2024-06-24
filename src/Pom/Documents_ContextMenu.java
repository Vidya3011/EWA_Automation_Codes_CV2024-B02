package Pom;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
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

import Generic.BaseClass;

public class Documents_ContextMenu extends BaseClass {
	// Dipak Automation Pom
	public static WebElement element = null;
	private static final boolean False = false;

	public Documents_ContextMenu() {
		PageFactory.initElements(driver, this);

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

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]/label/span")
	private WebElement Select_Document;

	public WebElement getSelect_Document() {
		return Select_Document;
	}

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	public WebElement MoveTo_Menu_Documents() {
		return MoveTo_Menu_Documents;
	}

	public void getMoveTo_Menu_Documents() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Documents).build().perform();

	}

	// Take and Release Ownership

	@FindBy(xpath = "//*[@id=\"takeOwnership\"]")
	private WebElement Select_Option_TakeOwnership;

	public void getSelect_Option_TakeOwnership() {
		element = Select_Option_TakeOwnership;
		WebElement ele1 = Select_Option_TakeOwnership;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Click_Username;

	public WebElement getClick_Username() {
		return Click_Username;
	}

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Click_LogoutOption;

	public WebElement getClick_LogoutOption() {
		return Click_LogoutOption;
	}

	//
	public void login_New_User() throws Exception {

		driver.findElement(LoginUsername).sendKeys(DocumentsContext_excelRead(1, 0));
		Reporter.log("Enter valid New username into username field", true);
		driver.findElement(Password).sendKeys(DocumentsContext_excelRead(1, 1));
		Reporter.log("Enter valid new user password into password field", true);
		WebElement room = driver.findElement(Room);
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		Reporter.log("Select a Room", true);
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(Captch_Image);
			WebElement enterCaptch = driver.findElement(Enter_Captch_textbox);
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(Login_button).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(2000);
		try {
			WebElement sessionmsg = driver.findElement(session_message);
			WebElement sessionmsgYes = driver.findElement(session_message_Yes);
			Reporter.log(sessionmsg.getText() +  "this message is displayed", true);
			Thread.sleep(2000);
			sessionmsgYes.click();
			Thread.sleep(2000);
			Reporter.log("Click on the Yes button", true);

		} catch (Exception e1) {
			// Session message is not displayed
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	// 10. Datadriven Security

	public static String DocumentsContext_excelRead(int rowNo, int cellNo) throws Exception {
		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet s = wb.getSheet("DocumentsContext");
			XSSFRow row = s.getRow(rowNo);
			XSSFCell cll = row.getCell(cellNo);
			String cellType = cll.getStringCellValue();
			return cellType;
		}

	}

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document;

	public WebElement getOpen_Document() {
		return Open_Document;
	}

	@FindBy(xpath = "//*[@id=\"docOwnerName\"]")
	private WebElement Docownername;
	@FindBy(xpath = "//*[@id=\"detailsBlock\"]/p[2]/span")
	private WebElement openviewonly;
	@FindBy(xpath = "//*[@id=\"ownershipMessageModelOk\"]")
	private WebElement ownershipmessageok;

	public void getVerify_Ownership_Message() throws InterruptedException {
		WebElement Message1 = Docownername;
		Reporter.log("Take Ownership Message " + Message1.getText() + " this message should show", true);
		WebElement Message2 = openviewonly;
		Reporter.log("Take Ownership Message " + Message2.getText() + " this message should show", true);
		jsclick(ownershipmessageok);

	}

	@FindBy(xpath = "//*[@id=\"releaseOwnership\"]")
	private WebElement Select_Option_ReleaseOwnership;

	public void getSelect_Option_ReleaseOwnership() {
		WebElement ele1 = Select_Option_ReleaseOwnership;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(xpath = "//*[@id=\"refreshDocuments\"]")
	private WebElement Select_Option_Refresh;

	public void getSelect_Option_Refresh() {
		WebElement ele1 = Select_Option_Refresh;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(xpath = "//*[@id=\"documentSetcolour\"]")
	private WebElement Select_Option_Catagories_andSet_Colors;
	@FindBy(xpath = "//*[@id=\"CustomColourid_5\"]")
	private WebElement Select_Colors;

	public void getSelect_Option_Catagories_andSet_Colors() throws InterruptedException {
		Thread.sleep(2000);
		jsclick(Select_Option_Catagories_andSet_Colors);
		Thread.sleep(4000);
		jsclick(Select_Colors);

	}

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;
	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Paste_ID;

	public void getVerify_CopyandPaste_Document() throws InterruptedException {
		jsclick(Copy_ID);
		Thread.sleep(4000);
		Reporter.log("Click on the Copy Option", true);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		Reporter.log("Move to the Menu Documents Tab", true);
		jsclick(Paste_ID);
		Reporter.log("Click on the Paste Option", true);
	}

	@FindBy(xpath = "//*[@id=\"cutid\"]")
	private WebElement Cut_ID;

	public void getVerify_CutandPaste_Document() throws InterruptedException {

		jsclick(Cut_ID);
		Thread.sleep(8000);
		Reporter.log("Click on the Cut Option", true);
		jsclick(Select_subFolder);
		Thread.sleep(6000);
		Reporter.log("Select Subfolder", true);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		Reporter.log("Move to the Mennu Documents", true);
		jsclick(Paste_ID);
		Reporter.log("Click on the Paste ID", true);
	}

	@FindBy(xpath = "//*[@id=\"delDocument\"]")
	private WebElement deletedoc;
	@FindBy(xpath = "//*[@id=\"deleteMessageOk\"]")
	private WebElement deleteOK;

	public void getVerify_Delete_Document() throws InterruptedException {
		
		Reporter.log("Check the Document ", true);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		Reporter.log("Move to the menu Document Tab", true);
		jsclick(deletedoc);
		Thread.sleep(6000);
		Reporter.log("Click on the Delete Document", true);
		jsclick(deleteOK);
		Reporter.log("Click on the Ok Button and document deleted successfully", true);
	}

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]/label/span")
	private WebElement checkdoc;
	@FindBy(xpath = "//*[@id=\"documentcreatefav\"]")
	private WebElement createFavorite;
	@FindBy(xpath = "//*[@id=\"createFavText\"]")
	private WebElement createFavoriteText;
	@FindBy(xpath = "//*[@id=\"createFavModelOk\"]")
	private WebElement createFavoriteOK;

	public void getVerify_CreateFavorites_Document() throws Exception {

		Thread.sleep(8000);
		jsclick(checkdoc);
		Thread.sleep(4000);
		Reporter.log("Check the Document", true);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Reporter.log("Move to the Document page", true);
		jsclick(createFavorite);
		Thread.sleep(4000);
		Reporter.log("Click on the create Favorite Option", true);
		createFavoriteText.clear();
		Thread.sleep(4000);
		Reporter.log("Enter the Favorite document name", true);
		createFavoriteText.sendKeys(DocumentsContext_excelRead(1, 2));
		Thread.sleep(6000);
		jsclick(createFavoriteOK);
		Reporter.log("Click on the Ok Button", true);
	}

	@FindBy(xpath = "//*[@id=\"bookmarkid\"]/img")
	private WebElement bookmark;
	@FindBy(xpath = "//*[@id=\"loadAllfavrites\"]")
	private WebElement loadfav;
	@FindBy(xpath = "//*[@id=\"searchFav\"]")
	private WebElement Searchfav;
	@FindBy(xpath = "//*[@id=\"createfavshowAllModelTabel\"]/tbody/tr[1]/td[1]")
	private WebElement doc;

	public void getOpen_CreateFavorites_Document() throws Exception {
		Thread.sleep(6000);
		Actions action = new Actions(driver);
		action.moveToElement(bookmark).perform();
		Thread.sleep(4000);
		jsclick(loadfav);
		Thread.sleep(8000);
		jsclick(Searchfav);
		Thread.sleep(8000);
		Reporter.log("Search Favorite document", true);
		Searchfav.sendKeys(DocumentsContext_excelRead(1, 2));
		Thread.sleep(8000);
		jsclick(doc);

	}

	@FindBy(xpath = "//*[@id=\"sendtoworkflow\"]")
	private WebElement Workflow;
	@FindBy(css = "#assignedWfTable .odd:nth-child(13) > td")
	private WebElement AutoWorkflow;
	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement customdoc;
	@FindBy(xpath = "//*[@id=\"ownershipMessageModelOk\"]")
	private WebElement ownershipok;

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement closedoc;

	public WebElement getclosedoc() {
		return closedoc;
	}

	public void getCreate_SendToWorkflow_Document() throws Exception {

		jsclick(Workflow);
		Thread.sleep(4000);
		Reporter.log("Click on the Send To Workflow Option", true);
		jsclick(AutoWorkflow);
		Thread.sleep(8000);
		Reporter.log("Select Workflow", true);
		jsclick(customdoc);
		Thread.sleep(6000);
		Reporter.log("Select document", true);
		WebElement Message1 = Docownername;
		Reporter.log("Take Ownership Message " + Message1.getText() + " this message should show", true);
		Thread.sleep(4000);
		WebElement Message2 = openviewonly;
		Reporter.log("Take Ownership Message " + Message2.getText() + " this message should show", true);
		Thread.sleep(4000);
		jsclick(ownershipok);
		Reporter.log("Document in Ownership", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(4000);
		jsclick(closedoc);
		Reporter.log("Close the Document", true);
	}

	@FindBy(xpath = "//*[@id=\"btnSignatureAdd\"]/span[1]")
	private WebElement Click_signature_Menuoption;

	public void getClick_signature_Menuoption() throws Exception {
		Click_signature_Menuoption.click();
	}

	@FindBy(xpath = "//*[@id=\\\"imageViewerDiv\\\"]/div[2]/canvas")
	private WebElement Add_Signature_Onpage;

	public void getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Signature_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();

	}

	@FindBy(xpath = "//*[@id=\"notificationSettings\"]")
	private WebElement notification;
	@FindBy(xpath = "//*[@id=\"contentverseRef\"]")
	private WebElement contref;
	@FindBy(xpath = "//*[@id=\"documentHistory\"]")
	private WebElement dochistory;
	@FindBy(css = "//*[@id=\"dropdownNotifylist\"]")
	private WebElement notifylist;
	@FindBy(xpath = "//*[@id=\"spanCheckNotifications_1\"]")
	private WebElement checknotification;
	@FindBy(xpath = "//*[@id=\"notifySaveBtn\"]")
	private WebElement savenotify;
	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement customdocname;
	@FindBy(xpath = "//*[@id=\"general\"]/div/div[1]/span")
	private WebElement general;

	public void getCreate_Notification_Document() throws Exception {

		jsclick(notification);
		Thread.sleep(130000);
		Reporter.log("Click on the Notification Option", true);
		jsclick(contref);
		Thread.sleep(4000);
		Reporter.log("set references notifications", true);
		jsclick(dochistory);
		Thread.sleep(4000);
		jsclick(notifylist);
		Thread.sleep(4000);
		jsclick(checknotification);
		jsclick(savenotify);
		Thread.sleep(4000);
		jsclick(Select_Folder);
		Thread.sleep(4000);
		jsclick(customdocname);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(4000);
		jsclick(general);
		Thread.sleep(8000);
		Reporter.log("Click on the General Option", true);
	}

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement saveaddpage;
	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement okbutton;

	public void getSave_Signature_Document() throws Exception {
		jsclick(saveaddpage);
		Thread.sleep(8000);
		jsclick(okbutton);

	}

	@FindBy(xpath = "//*[@id=\"documentSendTo\"]")
	private WebElement sendTo;
	@FindBy(xpath = "//*[@id=\"sendToMail\"]")
	private WebElement sendToMail;
	@FindBy(xpath = "//*[@id=\"convertToPdfChk\"]")
	private WebElement converttopdf;
	@FindBy(xpath = "//*[@id=\"retainPdfColorExport1\"]")
	private WebElement colorexport;
	@FindBy(xpath = "//*[@id=\"convertToPdfQuality\"]")
	private WebElement pdfquality;
	@FindBy(xpath = "//*[@id=\"certifiedCoverPage\"]")
	private WebElement coverpage;
	@FindBy(xpath = "//*[@id=\"compressToZip\"]")
	private WebElement compresszip;
	@FindBy(xpath = "//*[@id=\"sendToPassword\"]")
	private WebElement sendtopassword;
	@FindBy(xpath = "//*[@id=\"zipPasswordInputpdf\"]")
	private WebElement zippassinput;
	@FindBy(xpath = "//*[@id=\"runAnnotations\"]")
	private WebElement Runannotation;
	@FindBy(xpath = "//*[@id=\"toEmial\"]")
	private WebElement toemail;
	@FindBy(xpath = "//*[@id=\"subjectid\"]")
	private WebElement subid;
	@FindBy(xpath = "//*[@id=\"saveSendToDocument\"]")
	private WebElement savesendto;
	@FindBy(xpath = "(//*[@id=\"messageButtonOK\"]")
	private WebElement sentmailOK;
	@FindBy(xpath = ("(//button[@class='modalDialogButtons'])[1]"))
	private WebElement EmailsuccessMessageDialogboxOK;

	public void getSentTo_Mail_asCopy() throws Exception {

		jsclick(sendTo);
		Thread.sleep(2000);
		Reporter.log("Click on the Sent To Option", true);
		jsclick(sendToMail);
		Thread.sleep(3000);
		Reporter.log("Click on the Send To then Mail Option", true);
		jsclick(converttopdf);
		Thread.sleep(3000);
		Reporter.log("Select Convert to pdf Radio button", true);
		jsclick(colorexport);
		Thread.sleep(2000);
		Reporter.log("Set Export ", true);
		jsclick(pdfquality);
		Reporter.log("selct Pdf Quality", true);
		Thread.sleep(2000);
		Select sel = new Select(pdfquality);
		sel.selectByVisibleText("Best Quality");
		Thread.sleep(2000);
		Reporter.log("set Best Quality dropdown Option", true);
		jsclick(coverpage);
		Thread.sleep(2000);
		Reporter.log("Check Cover page", true);
		jsclick(compresszip);
		Thread.sleep(2000);
		Reporter.log("Check Compress zip", true);
		jsclick(sendtopassword);
		Thread.sleep(2000);
		Reporter.log("click on the Send to password Textbox", true);
		jsclick(zippassinput);
		Thread.sleep(2000);
		zippassinput.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(2000);
		Reporter.log("Enter password for mail document", true);
		jsclick(Runannotation);
		Thread.sleep(2000);
		Reporter.log("Check the Annotation checkbox", true);
		jsclick(toemail);
		Thread.sleep(2000);
		Reporter.log("Click on the To Email Textbox", true);
		toemail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(2000);
		jsclick(subid);
		Thread.sleep(2000);
		subid.sendKeys(DocumentsContext_excelRead(1, 4));
		Thread.sleep(4000);
		Reporter.log("enter the Subject", true);
		jsclick(savesendto);
		Thread.sleep(3000);
		Reporter.log("Click on the Ok Button", true);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);
		Reporter.log("Mail sent successfully and click on the Ok Button", true);
	}

	@FindBy(xpath = "//*[@id=\"sendDocAsReference\"]")
	private WebElement Referencemail;

	public void getSentTo_Mail_asReference() throws Exception {

		jsclick(sendTo);
		Thread.sleep(3000);
		Reporter.log("Click on the Send To Option", true);
		jsclick(sendToMail);
		Thread.sleep(3000);
		Reporter.log("Click on the Mail Option", true);
		jsclick(Referencemail);
		Thread.sleep(3000);
		Reporter.log("select Reference Email Radio button", true);
		Select sel = new Select(pdfquality);
		sel.selectByVisibleText("Best Quality");
		Reporter.log("Select and set pdf quality Best Quality", true);
		jsclick(toemail);
		Thread.sleep(3000);
		toemail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(3000);
		Reporter.log("enter the To Email id", true);
		jsclick(subid);
		Thread.sleep(3000);
		subid.sendKeys(DocumentsContext_excelRead(1, 4));
		Thread.sleep(4000);
		Reporter.log("Enter the Mail subject", true);
		jsclick(savesendto);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);

	}

	@FindBy(xpath = "//*[@id=\"sendToPrint\"]")
	private WebElement sendtoPrint;
	@FindBy(xpath = "//*[@id=\"certifiedCoverPagePrint\"]")
	private WebElement pageprint;
	@FindBy(xpath = "//*[@id=\"includeRouteSummaryPrint\"]")
	private WebElement summaryprint;
	@FindBy(xpath = "//*[@id=\"unlockRedactionsWithPrint\"]")
	private WebElement withunlockredaction;
	@FindBy(xpath = "//*[@id=\"unlockRedactionsPwdPrint\"]")
	private WebElement pwdunlockredaction;
	@FindBy(xpath = "//*[@id=\"printDocumentOnView\"]")
	private WebElement printview;

	public void getSentTo_Print() throws Exception {
		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		Reporter.log("Check the Document", true);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Reporter.log("Move to the menu Documents Tab", true);
		jsclick(sendTo);
		Thread.sleep(3000);
		Reporter.log("Click on the Send To Option", true);
		jsclick(sendtoPrint);
		Thread.sleep(4000);
		Reporter.log("Click on the Print Option", true);
		jsclick(pageprint);
		Thread.sleep(4000);
		jsclick(summaryprint);
		Thread.sleep(4000);
		jsclick(withunlockredaction);
		Thread.sleep(4000);
		jsclick(pwdunlockredaction);
		pwdunlockredaction.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(4000);
		jsclick(printview);
		Reporter.log("Set Parameter and Printview then click on the Ok Button", true);
	}

	@FindBy(xpath = "//*[@id=\"sendToExport\"]")
	private WebElement sendexport;
	@FindBy(xpath = "//*[@id=\"retainFormatChkExport\"]")
	private WebElement retainchkexport;
	@FindBy(xpath = "//*[@id=\"includeRouteSummary\"]")
	private WebElement Routesummary;
	@FindBy(xpath = "//*[@id=\"zipPasswordInput\"]")
	private WebElement Zippassword;
	@FindBy(xpath = "//*[@id=\"convertToPdfChkExport\"]")
	private WebElement convertpdfexport;
	@FindBy(xpath = "//*[@id=\"exportAnnotations\"]")
	private WebElement exportannotation;
	@FindBy(xpath = "//*[@id=\"unlockRedactionsWithExport\"]")
	private WebElement exportwith;
	@FindBy(xpath = "//*[@id=\"unlockRedactionsPwdExport\"]")
	private WebElement exportPwd;
	@FindBy(xpath = "//*[@id=\"zipPasswordInput\"]")
	private WebElement Zippasswordinput;
	@FindBy(xpath = "//*[@id=\"pdfPasswordInput\"]")
	private WebElement Pdfpasswordinput;

	public void getSentTo_Export() throws Exception {
		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		Reporter.log("Check the document", true);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Reporter.log("Move to the Menu Document tab", true);
		jsclick(sendTo);
		Thread.sleep(3000);
		Reporter.log("Move to the Documents tab", true);
		jsclick(sendexport);
		Thread.sleep(3000);
		Reporter.log("Click on the Send To Export Option", true);
		jsclick(retainchkexport);
		jsclick(Routesummary);
		Thread.sleep(4000);
		jsclick(Zippassword);
		Thread.sleep(4000);
		Zippassword.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(4000);
		Reporter.log("enter Zip password", true);
		jsclick(savesendto);
		Thread.sleep(19000);
		Reporter.log("Click on the Ok Button", true);
		jsclick(checkdoc);
		Thread.sleep(3000);
		Reporter.log("Check the document", true);
		element = MoveTo_Menu_Documents;
		Actions action2 = new Actions(driver);
		action2.moveToElement(element).perform();
		Reporter.log("Move to the Documents Tab", true);
		jsclick(sendTo);
		Thread.sleep(3000);
		Reporter.log("Click on the Send To Option", true);
		jsclick(sendexport);
		Thread.sleep(3000);
		Reporter.log("Click on the Export Option", true);
		jsclick(convertpdfexport);
		jsclick(exportannotation);
		jsclick(exportwith);
		jsclick(exportPwd);
		Thread.sleep(3000);
		exportPwd.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(3000);
		Reporter.log("Export document with entering password", true);
		jsclick(Zippasswordinput);
		Thread.sleep(3000);
		Zippasswordinput.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(Pdfpasswordinput);
		Thread.sleep(3000);
		Pdfpasswordinput.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(savesendto);
		Thread.sleep(6000);
		Reporter.log("Click on the Ok Button", true);
	}

	@FindBy(xpath = "//*[@id=\"sendToSecureMail\"]")
	private WebElement SecureMail;
	@FindBy(xpath = "//*[@id=\"recepientEmailId\"]")
	private WebElement recpmail;
	@FindBy(xpath = "//*[@id=\"confirmEmailIdSecure\"]")
	private WebElement Confirmemail;
	@FindBy(xpath = "//*[@id=\"modifyPermissionCheckbox\"]")
	private WebElement modifychk;
	@FindBy(xpath = "//*[@id=\"navigatorTreeOk32\"]")
	private WebElement navigateOK;
	@FindBy(xpath = "//*[@id=\"recipientMailIdSecond\"]")
	private WebElement recpmailsec;
	@FindBy(xpath = "//*[@id=\"confirmEmailIdSecureSecond\"]")
	private WebElement confirmemailsec;
	@FindBy(xpath = "//*[@id=\"navigatorTreeOk33\"]")
	private WebElement navigateOK2;

	public void getSentTo_SecureLink() throws Exception {
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Reporter.log("Move to the Documents Tab", true);
		jsclick(sendTo);
		Thread.sleep(3000);
		Reporter.log("Click on the Send To Option", true);
		jsclick(SecureMail);
		Thread.sleep(4000);
		Reporter.log("Click on the Secure Mail Option", true);
		jsclick(recpmail);
		Thread.sleep(3000);
		Reporter.log("Enter Recepient mail ID", true);
		recpmail.sendKeys(DocumentsContext_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(Confirmemail);
		Thread.sleep(3000);
		Confirmemail.sendKeys(DocumentsContext_excelRead(1, 4));
		Reporter.log("enter the Confirm mail ID", true);
		Thread.sleep(3000);
		jsclick(modifychk);
		Reporter.log("check the Modify check ", true);
		jsclick(navigateOK);
		Thread.sleep(3000);
		Reporter.log("Click on the Ok Button", true);
		recpmailsec.sendKeys(DocumentsContext_excelRead(1, 3));
		jsclick(confirmemailsec);
		Thread.sleep(3000);
		Reporter.log("Enter again Confirmation Mail Id", true);
		confirmemailsec.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);
		Reporter.log("click on the Ok Button", true);
	}

	@FindBy(xpath = "//*[@id=\"generateDocumentLink\"]")
	private WebElement generatedoc;
	@FindBy(xpath = "//*[@id=\"documentLinkOk\"]")
	private WebElement doclinkok;
	@FindBy(xpath = "//*[@id=\"messageContentLink\"]")
	private WebElement CopyDoclink;

	public void getSentTo_GenerateDocumentLink() throws Exception {
		Thread.sleep(3000);
		jsclick(checkdoc);
		Reporter.log("Check the Document", true);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Reporter.log("Move to the Documents Tab", true);
		jsclick(sendTo);
		Thread.sleep(3000);
		Reporter.log("Click on the Send To Option", true);
		jsclick(generatedoc);
		Thread.sleep(4000);
		Reporter.log("Click on the Generate document link Option", true);
		Reporter.log("Generated Document link is " + CopyDoclink.getText(), true);
		Thread.sleep(6000);
		jsclick(doclinkok);
		Reporter.log("Click on the Ok Button", true);
	}

	public void login_Verify_Workflow_User() throws Exception {
		driver.findElement(LoginUsername).sendKeys(DocumentsContext_excelRead(2, 0));
		Reporter.log("Enter valid workflow assign username into username field", true);
		driver.findElement(Password).sendKeys(DocumentsContext_excelRead(1, 1));
		Reporter.log("Enter valid workflow assign user password into password field", true);
		WebElement room = driver.findElement(Room);
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		Reporter.log("Select a room", true);
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(Captch_Image);
			WebElement enterCaptch = driver.findElement(Enter_Captch_textbox);
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(Login_button).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(2000);
		try {
			WebElement sessionmsg = driver.findElement(session_message);
			WebElement sessionmsgYes = driver.findElement(session_message_Yes);
			Reporter.log(sessionmsg.getText() +  "this message is displayed", true);
			Thread.sleep(2000);
			sessionmsgYes.click();
			Thread.sleep(2000);
			Reporter.log("Click on the Yes button", true);

		} catch (Exception e1) {
			// Session message is not displayed
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	@FindBy(xpath = "//*[@id=\"accept\"]")
	private WebElement accept;
	@FindBy(xpath = "//*[@id=\"wfactionOk\"]")
	private WebElement action;
	@FindBy(xpath = "//*[@id=\"wfactionOk\"]")
	private WebElement messageOK;
	@FindBy(xpath = "//*[@id=\"wfcomments\"]")
	private WebElement WFComment;
	@FindBy(xpath = "//*[@id=\"wfactionOk\"]")
	private WebElement actionOK;

	public void getVerifyWF() throws Exception {

		Thread.sleep(6000);
		jsclick(accept);
		Reporter.log("Click on the Accept Option", true);
		Thread.sleep(6000);
		jsclick(action);
		Thread.sleep(6000);
		jsclick(messageOK);
		Thread.sleep(6000);
		jsclick(WFComment);
		Thread.sleep(6000);
		WFComment.sendKeys(DocumentsContext_excelRead(2, 4));
		Thread.sleep(6000);
		jsclick(actionOK);
		Reporter.log("Enter the Comment and Accept the Workflow", true);
	}

	@FindBy(xpath = "//*[@id=\"myTaskMenu\"]")
	private WebElement MoveTo_ToDoList_Option;

	public WebElement MoveTo_ToDoList_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_ToDoList_Option).perform();
		return MoveTo_ToDoList_Option;
	}

	@FindBy(xpath = "//*[@id=\"todoAll\"]")
	private WebElement Select_All_Item;

	public WebElement getSelect_All_Item() {
		return Select_All_Item;
	}

	@FindBy(xpath = "//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]")
	private WebElement Open_ToDoDocument;

	public WebElement getOpen_ToDoDocument() {
		return Open_ToDoDocument;
	}

	@FindBy(xpath = "//*[@id=\"homeMenuBtn\"]")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
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

	@FindBy(xpath = "//*[@id=\"defaultPdfDocViewListNo\"]")
	private WebElement Pdf_document_Defaultviewing;

	public void getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		drop.selectByVisibleText("Default viewing");

	}

	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;
	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;

	public void getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys("DocumentsContext_excelRead(3, 1)");
		jsclick(verifypassok);

	}

	public void getVerify_SendTo_Blankemailid() throws Exception {

		jsclick(sendTo);
		Thread.sleep(3000);
		Reporter.log("Click on the Send To Option", true);
		jsclick(sendToMail);
		Thread.sleep(3000);
		Reporter.log("Click on the Mail Option ", true);
		jsclick(Referencemail);
		Thread.sleep(3000);
		Select sel = new Select(pdfquality);
		sel.selectByIndex(2);
		Thread.sleep(3000);
		jsclick(savesendto);

	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement messageContent;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement messageok;

	public void getmessagevalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Email id should not  be Blank.";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(messageContent.getText() + " this validation message should show", true);
		jsclick(messageok);

	}

	public void getVerify_SendTo_InvalidEmail() throws Exception {
		Thread.sleep(4000);
		toemail.sendKeys(DocumentsContext_excelRead(3, 4));
		Thread.sleep(3000);
		jsclick(subid);
		subid.clear();
		Thread.sleep(3000);
		subid.sendKeys(DocumentsContext_excelRead(1, 4));
		Thread.sleep(4000);
		jsclick(savesendto);

	}

	public void getmessagevalidationInvalid() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter a valid 'To E-mail id'";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(messageContent.getText() + " this validation message should show", true);
		jsclick(messageok);

	}

	@FindBy(xpath = "//*[@id=\"ccEmail\"]")
	private WebElement CCEmailID;

	public void getVerify_SendTo_InvalidCCEmail() throws Exception {
		Thread.sleep(4000);
		toemail.clear();
		Thread.sleep(3000);
		toemail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(3000);
		Reporter.log("enter the TO Email ID", true);
		CCEmailID.sendKeys(DocumentsContext_excelRead(3, 4));
		Thread.sleep(3000);
		Reporter.log("enter the CC Email ID", true);
		jsclick(subid);
		subid.clear();
		Reporter.log("Enter the Mail subject", true);
		Thread.sleep(3000);
		subid.sendKeys(DocumentsContext_excelRead(1, 4));
		Thread.sleep(4000);
		jsclick(savesendto);
		Reporter.log("click on the OK Button", true);
	}

	public void getmessagevalidationCCEmailInvalid() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter a valid 'Cc E-mail id'";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(messageContent.getText() + " this validation message should show", true);
		jsclick(messageok);

	}

	@FindBy(xpath = "//*[@id=\"cancelSendToDocument\"]")
	private WebElement DialogCancel;

	public WebElement getDialogCancel() throws Exception {
		return DialogCancel;
	}

	public void getSentTo_PrintValidation() throws Exception {

		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendtoPrint);
		Thread.sleep(4000);

	}

	@FindBy(xpath = "//*[@id=\"cancelPrintBtn\"]")
	private WebElement PrintDialogCancel;

	public WebElement getPrintDialogCancel() throws Exception {
		return PrintDialogCancel;
	}

	public void getSentTo_ExportCancel() throws Exception {

		Thread.sleep(6000);
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendexport);
		Thread.sleep(3000);

	}

	public void get_SecureLinkblankmail_Validation() throws Exception {

		Thread.sleep(6000);
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(SecureMail);
		Thread.sleep(4000);
		jsclick(navigateOK);
		Thread.sleep(3000);

	}

	public void getmessagevalidationBlankmail() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter recipient email id";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(messageContent.getText() + " this validation message should show", true);
		jsclick(messageok);

	}

	public void getenter_SecureLinkRecipientaddress() throws Exception {

		Thread.sleep(3000);
		jsclick(recpmail);
		Thread.sleep(3000);
		recpmail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);

	}

	public void getmessagevalidationConfirmmail() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter confirmation email id";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(messageContent.getText() + " this validation message should show", true);
		jsclick(messageok);

	}

	public void getClearRecipientmail() throws Exception {

		Thread.sleep(4000);
		jsclick(recpmail);
		Thread.sleep(3000);
		recpmail.clear();
		Thread.sleep(3000);

	}

	public void getVerifyMismatch_SecureLink_Confirmmail() throws Exception {

		jsclick(Confirmemail);
		Thread.sleep(3000);
		Confirmemail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);

	}

	public void getenter_validemailmessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter a valid  E-mail id";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(messageContent.getText() + " this validation message should show", true);
		jsclick(messageok);

	}

	public void get_Mismatch_validation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Email id Mismatch ";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(messageContent.getText() + " this validation message should show", true);
		jsclick(messageok);

	}

	public void get_Confirmmail_Invalid() throws Exception {

		Thread.sleep(3000);
		jsclick(recpmail);
		Thread.sleep(3000);
		recpmail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(3000);
		jsclick(Confirmemail);
		Thread.sleep(3000);
		Confirmemail.sendKeys(DocumentsContext_excelRead(3, 4));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);

	}

	public void get_EnterConfirmmail() throws Exception {

		Thread.sleep(3000);
		jsclick(Confirmemail);
		Thread.sleep(3000);
		Confirmemail.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);

	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk33\"]")
	private WebElement SecureOK;

	public WebElement getSecureOK() throws Exception {
		return SecureOK;
	}

	public void getRecepientEmail_SecureLink() throws Exception {

		Thread.sleep(3000);
		recpmailsec.sendKeys(DocumentsContext_excelRead(1, 3));
		jsclick(confirmemailsec);
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);

	}

	public void getRecepietConfirmEmail_SecureLink() throws Exception {

		Thread.sleep(3000);
		recpmailsec.clear();
		jsclick(confirmemailsec);
		Thread.sleep(3000);
		confirmemailsec.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);

	}

	public void getRecepietConfirmEmailInvalid_SecureLink() throws Exception {

		Thread.sleep(3000);
		recpmailsec.sendKeys(DocumentsContext_excelRead(1, 3));
		jsclick(confirmemailsec);
		Thread.sleep(3000);
		confirmemailsec.clear();
		Thread.sleep(3000);
		confirmemailsec.sendKeys(DocumentsContext_excelRead(3, 4));
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);

	}

	public void getenterConfirmRecepietEmail_SecureLink() throws Exception {

		confirmemailsec.clear();
		Thread.sleep(3000);
		confirmemailsec.sendKeys(DocumentsContext_excelRead(1, 3));
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);

	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle33\"]")
	private WebElement SecureDialogCancel;

	public WebElement getSecureDialogCancel() throws Exception {
		return SecureDialogCancel;
	}

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement SecureMessageOK;

	public WebElement getSecureMessageOK() throws Exception {
		return SecureMessageOK;
	}

	@FindBy(xpath = "//*[@id=\"wfactionCancel\"]")
	private WebElement wfactionCancel;

	public WebElement getwfactionCancel() throws Exception {
		return wfactionCancel;
	}

	@FindBy(xpath = "//*[@id=\"wfactionTaskDescription\"]")
	private WebElement Workflowtask;
	@FindBy(xpath = "//div[@class='jconfirm-buttons']//button[@type='button'][normalize-space()='Cancel']")
	private WebElement CancelWorkflowtask;
	@FindBy(xpath = "//*[@id=\"wfactionOk\"]")
	private WebElement wfaction;

	public void getVerifyAccept() throws Exception {

		Thread.sleep(3000);
		jsclick(accept);
		Reporter.log("Click on the Accept Option", true);
		Thread.sleep(3000);
		jsclick(Workflowtask);
		Thread.sleep(3000);
		Reporter.log("Click on the Workflow Task Button", true);
		jsclick(CancelWorkflowtask);
		Thread.sleep(3000);
		Reporter.log("Click on the Workflow task Cancel Button", true);
		jsclick(wfaction);
		Reporter.log("Click on the Workflow action", true);
	}

	public void get_comment_Validation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter the comments.";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(messageContent.getText() + " this validation message should show", true);
		jsclick(messageok);

	}

	@FindBy(xpath = "//*[@id=\"reject\"]")
	private WebElement Reject;

	public void getVerifyReject() throws Exception {

		Thread.sleep(3000);
		jsclick(Reject);
		Thread.sleep(3000);
		Reporter.log("Click on the Reject Option", true);
		jsclick(Workflowtask);
		Thread.sleep(3000);
		Reporter.log("Click on the Workflwo Task", true);
		jsclick(CancelWorkflowtask);
		Reporter.log("Click on the Cancel Workflow task Button", true);
		Thread.sleep(3000);
		jsclick(wfaction);
		Reporter.log("Click on the Workflow action", true);
	}

	@FindBy(xpath = "//*[@id=\"endwf\"]")
	private WebElement EndWorkflow;

	public void getVerifyEndWorkflow() throws Exception {

		Thread.sleep(3000);
		jsclick(EndWorkflow);
		Thread.sleep(3000);
		Reporter.log("Click on the End Workflow Option", true);
		jsclick(Workflowtask);
		Thread.sleep(3000);
		Reporter.log("click on the Workflow Task Button", true);
		jsclick(CancelWorkflowtask);
		Thread.sleep(3000);
		Reporter.log("click on the Cancel Workflow task Button", true);
		jsclick(wfaction);
		Reporter.log("click on the Workflow action", true);
	}

	@FindBy(xpath = "//*[@id=\"summary1\"]")
	private WebElement Summary;

	public void getverifySummary() throws Exception {

		Thread.sleep(3000);
		jsclick(Summary);

	}

	@FindBy(xpath = "//*[@id=\"commentswf\"]")
	private WebElement Comment;

	public void getverifyComment() throws Exception {

		Thread.sleep(3000);
		jsclick(Comment);
		Thread.sleep(3000);
		Reporter.log("Click on the Comment box", true);
		jsclick(Workflowtask);
		Thread.sleep(3000);
		Reporter.log("Click on theWorkflow Task Button", true);
		jsclick(CancelWorkflowtask);
		Thread.sleep(3000);
		Reporter.log("Click on the Workflow task Cancel Button", true);
		jsclick(wfaction);
		Reporter.log("Click on the Workflow action", true);
	}

	@FindBy(xpath = "//button[@class='btn btn-danger summaryActionClass btn-default']")
	private WebElement SummaryCancel;

	public WebElement getSummaryCancel() throws Exception {
		return SummaryCancel;
	}

	// Offlline document

	@FindBy(xpath = "//input[@class='thumbnailOptionSelected']")
	private WebElement SelectCheckbox;

	public WebElement getSelectCheckbox() {
		return SelectCheckbox;
	}

	@FindBy(xpath = ".//div[@id='toolbarId']/div[8]/div[1]/span[1]")
	private WebElement pageofflinemenu;

	public WebElement getpageofflinemenu() {
		return pageofflinemenu;
	}

	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement clickokbutton;

	public WebElement getclickokbutton() {
		return clickokbutton;
	}

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Username;

	public WebElement getUsername() {
		return Username;
	}

	@FindBy(xpath = "//a[@id='syncDocuments']")
	private WebElement offlinedoc;

	public WebElement getofflinedoc() {
		return offlinedoc;
	}

	@FindBy(className = "document-sync")
	private WebElement checkofflinedoc;

	public WebElement getcheckofflinedoc() {
		return checkofflinedoc;
	}

	@FindBy(xpath = "//*[@id=\"releasesyncbtn\"]")
	private WebElement ReleaseDoc;

	public WebElement getReleaseDoc() {
		return ReleaseDoc;
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
	
	static By LoginUsername = By.xpath("//*[@id=\"userName\"]");
	static By Password = By.xpath("//*[@id=\"loginPassword\"]");
	static By Room = By.xpath("//*[@id=\"rooms\"]");
	static By Captch_Image = By.xpath("//*[@id=\"image\"]");
	static By Enter_Captch_textbox = By.xpath("//*[@id=\"captchaInput\"]");
	static By Login_button = By.xpath("//*[@id=\"submitid\"]");
	static By session_message = By.xpath("//*[@id=\"cvModelLoginValidationMessage\"]");
	static By session_message_Yes = By.xpath("//*[@id=\"cvModelLoginValidationOk\"]");
	static By session_message_No = By.xpath("//*[@id=\"cvModelLoginValidationCancel\"]");
}