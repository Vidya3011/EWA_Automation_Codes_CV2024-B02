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

	@FindBy(xpath = ("(//a[text()='CVApp Test'])[1]"))
	private WebElement Cabinet;

	public WebElement getCabinet() {
		return Cabinet;
	}

	@FindBy(xpath = ("//a[text()='CVMobile App 2022']"))
	private WebElement Drawer;

	public WebElement getDrawer() {
		return Drawer;
	}

	@FindBy(xpath = ("//a[text()='Test apk']"))
	private WebElement Folder;

	public WebElement getFolder() {
		return Folder;
	}
	
	@FindBy(xpath = ("//*[@id=\"78895\"]/a"))
	private WebElement DocEmailFolder;

	public WebElement getDocEmailFolder() {
		return DocEmailFolder;
	}
	@FindBy(xpath = ("//*[@id=\"selectall\"]"))
	private WebElement SelectAlldoc;

	public WebElement getSelectAlldoc() {
		return SelectAlldoc;
	}
	
	
	

	@FindBy(xpath = ("//tbody/tr[1]/td[1]/label[1]/span[1]"))
	private WebElement Select_Document;

	public WebElement getSelect_Document() {
		return Select_Document;
	}

	@FindBy(xpath = "//a[@id='documentListSubMenu']")
	private WebElement MoveTo_Menu_Documents;

	public WebElement getMoveTo_Menu_Documents() {
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		return MoveTo_Menu_Documents;
	}

	// Take and Release Ownership

	@FindBy(id = "takeOwnership")
	private WebElement Select_Option_TakeOwnership;

	public WebElement getSelect_Option_TakeOwnership() {
		element = Select_Option_TakeOwnership;
		WebElement ele1 = Select_Option_TakeOwnership;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return Select_Option_TakeOwnership;
	}

	@FindBy(id = "logedinusername")
	private WebElement Click_Username;

	public WebElement getClick_Username() {
		return Click_Username;
	}

	@FindBy(linkText = "Logout")
	private WebElement Click_LogoutOption;

	public WebElement getClick_LogoutOption() {
		return Click_LogoutOption;
	}

	//
	public void login_New_User() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(DocumentsContext_excelRead(9, 0));
		driver.findElement(By.id("loginPassword")).sendKeys(DocumentsContext_excelRead(1, 1));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		a1 = new Actions(driver);
		a1.moveToElement(room).click().build().perform();
		WebElement ro = driver.findElement(By.xpath("//option[text()= 'CVWin19Server.Win2019_TestRoom']"));
		ro.click();
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Login button clicked successfully", true);
		try {
			WebElement sessionmsgYes = driver.findElement(By.xpath(" //button[@id='cvModelLoginValidationOk']"));
			sessionmsgYes.click();
			Thread.sleep(6000);
		} catch (Exception e) {
			// Session message is not displayed
		}
	}

	// 10. Datadriven Security

	public static String DocumentsContext_excelRead(int rowNo, int cellNo) throws Exception {
		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("DocumentsContext");
		XSSFRow row = s.getRow(rowNo);
		XSSFCell cll = row.getCell(cellNo);
		String cellType = cll.getStringCellValue();
		return cellType;

	}

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document;

	public WebElement getOpen_Document() {
		return Open_Document;
	}

	@FindBy(xpath = "//span[@id='docOwnerName']")
	private WebElement Docownername;
	@FindBy(xpath = "//span[contains(text(),'Open in view only mode?')]")
	private WebElement openviewonly;
	@FindBy(id = "ownershipMessageModelOk")
	private WebElement ownershipmessageok;

	public WebElement getVerify_Ownership_Message() throws InterruptedException {
		WebElement Message1 = Docownername;
		System.out.println("Take Ownership Message " + Message1.getText());
		WebElement Message2 = openviewonly;
		System.out.println("Take Ownership Message " + Message2.getText());
		jsclick(ownershipmessageok);
		return Docownername;
	}

	@FindBy(id = "releaseOwnership")
	private WebElement Select_Option_ReleaseOwnership;

	public WebElement getSelect_Option_ReleaseOwnership() {
		WebElement ele1 = Select_Option_ReleaseOwnership;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return Select_Option_ReleaseOwnership;
	}

	@FindBy(id = "refreshDocuments")
	private WebElement Select_Option_Refresh;

	public WebElement getSelect_Option_Refresh() {
		WebElement ele1 = Select_Option_Refresh;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return Select_Option_Refresh;
	}

	@FindBy(id = "documentSetcolour")
	private WebElement Select_Option_Catagories_andSet_Colors;
	@FindBy(id = "CustomColourid_5")
	private WebElement Select_Colors;

	public WebElement getSelect_Option_Catagories_andSet_Colors() throws InterruptedException {
		Thread.sleep(2000);
		jsclick(Select_Option_Catagories_andSet_Colors);
		Thread.sleep(4000);
		jsclick(Select_Colors);
		return Select_Option_Catagories_andSet_Colors;
	}

	@FindBy(id = "copyId")
	private WebElement Copy_ID;
	@FindBy(id = "pasteid")
	private WebElement Paste_ID;

	public WebElement getVerify_CopyandPaste_Document() throws InterruptedException {
		jsclick(Copy_ID);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		jsclick(Paste_ID);
		return Paste_ID;
	}

	@FindBy(id = "cutid")
	private WebElement Cut_ID;
	@FindBy(linkText = "subfolder")
	private WebElement subfolder;

	public WebElement getVerify_CutandPaste_Document() throws InterruptedException {

		jsclick(Cut_ID);
		Thread.sleep(6000);
		jsclick(subfolder);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(Paste_ID);
		return Paste_ID;
	}

	@FindBy(css = ".odd .checkmark")
	private WebElement check;
	@FindBy(id = "delDocument")
	private WebElement deletedoc;
	@FindBy(id = "deleteMessageOk")
	private WebElement deleteOK;

	public WebElement getVerify_Delete_Document() throws InterruptedException {
		jsclick(check);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(deletedoc);
		Thread.sleep(6000);
		jsclick(deleteOK);
		return deleteOK;
	}

	@FindBy(css = ".odd:nth-child(1) .checkmark")
	private WebElement checkdoc;
	@FindBy(id = "documentcreatefav")
	private WebElement createFavorite;
	@FindBy(id = "createFavText")
	private WebElement createFavoriteText;
	@FindBy(id = "createFavModelOk")
	private WebElement createFavoriteOK;

	public WebElement getVerify_CreateFavorites_Document() throws Exception {

		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(createFavorite);
		Thread.sleep(4000);
		createFavoriteText.clear();
		Thread.sleep(4000);
		createFavoriteText.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(6000);
		jsclick(createFavoriteOK);
		return createFavoriteOK;
	}

	@FindBy(css = "#bookmarkid > img")
	private WebElement bookmark;
	@FindBy(id = "loadAllfavrites")
	private WebElement loadfav;
	@FindBy(id = "searchFav")
	private WebElement Searchfav;
	@FindBy(css = "#createfavshowAllModelTabel td:nth-child(1)")
	private WebElement doc;

	public WebElement getOpen_CreateFavorites_Document() throws Exception {
		Thread.sleep(6000);
		element = bookmark;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(4000);
		jsclick(loadfav);
		Thread.sleep(8000);
		jsclick(Searchfav);
		Thread.sleep(8000);
		Searchfav.sendKeys(DocumentsContext_excelRead(2, 1));
		Thread.sleep(8000);
		jsclick(doc);
		return doc;
	}

	@FindBy(id = "sendtoworkflow")
	private WebElement Workflow;
	@FindBy(css = "#assignedWfTable .odd:nth-child(13) > td")
	private WebElement AutoWorkflow;
	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement customdoc;
	@FindBy(id = "ownershipMessageModelOk")
	private WebElement ownershipok;
	@FindBy(css = "#cvDocumentClose > .icon")
	private WebElement closedoc;

	public WebElement getCreate_SendToWorkflow_Document() throws Exception {

		jsclick(Workflow);
		Thread.sleep(4000);
		jsclick(AutoWorkflow);
		Thread.sleep(4000);
		jsclick(customdoc);
		Thread.sleep(6000);
		WebElement Message1 = Docownername;
		System.out.println("Take Ownership Message " + Message1.getText());
		Thread.sleep(4000);
		WebElement Message2 = openviewonly;
		System.out.println("Take Ownership Message " + Message2.getText());
		Thread.sleep(4000);
		jsclick(ownershipok);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(4000);
		jsclick(closedoc);
		return closedoc;

	}

	@FindBy(xpath = "//button[@id='btnSignatureAdd']//span[@class='icon icon-sm signatureIcon']")
	private WebElement Click_signature_Menuoption;

	public WebElement getClick_signature_Menuoption() throws Exception {
		WebElement ele = Click_signature_Menuoption;
		ele.click();
		return ele;
	}

	@FindBy(css = "#imageViewerDiv .lt-imageviewer-eventcanvas")
	private WebElement Add_Signature_Onpage;

	public WebElement getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Signature_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();
		return Add_Signature_Onpage;
	}

	@FindBy(id = "notificationSettings")
	private WebElement notification;
	@FindBy(id = "contentverseRef")
	private WebElement contref;
	@FindBy(id = "documentHistory")
	private WebElement dochistory;
	@FindBy(css = "#dropdownNotifylist a")
	private WebElement notifylist;
	@FindBy(id = "spanCheckNotifications_1")
	private WebElement checknotification;
	@FindBy(id = "notifySaveBtn")
	private WebElement savenotify;
	@FindBy(linkText = "Test apk")
	private WebElement Testapk;
	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement customdocname;
	@FindBy(xpath = "//*[@id=\"general\"]/div/div[1]/span")
	private WebElement general;

	public WebElement getCreate_Notification_Document() throws Exception {
		Thread.sleep(6000);
		jsclick(notification);
		Thread.sleep(6000);
		jsclick(contref);
		jsclick(dochistory);
		Thread.sleep(6000);
		jsclick(notifylist);
		Thread.sleep(6000);
		jsclick(checknotification);
		jsclick(savenotify);
		Thread.sleep(6000);
		jsclick(Testapk);
		Thread.sleep(7000);
		jsclick(customdocname);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(4000);
		jsclick(general);
		Thread.sleep(8000);
		return general;

	}

	@FindBy(css = "#saveAddedPages > .icon")
	private WebElement saveaddpage;
	@FindBy(id = "messageButtonOK42")
	private WebElement okbutton;

	public WebElement getSave_Signature_Document() throws Exception {
		jsclick(saveaddpage);
		Thread.sleep(8000);
		jsclick(okbutton);
		return okbutton;
	}

	public WebElement getClose_Document() throws Exception {
		element = closedoc;
		return element;
	}

	@FindBy(id = "documentSendTo")
	private WebElement sendTo;
	@FindBy(id = "sendToMail")
	private WebElement sendToMail;
	@FindBy(id = "convertToPdfChk")
	private WebElement converttopdf;
	@FindBy(id = "retainPdfColorExport1")
	private WebElement colorexport;
	@FindBy(id = "convertToPdfQuality")
	private WebElement pdfquality;
	@FindBy(id = "certifiedCoverPage")
	private WebElement coverpage;
	@FindBy(id = "compressToZip")
	private WebElement compresszip;
	@FindBy(id = "sendToPassword")
	private WebElement sendtopassword;
	@FindBy(id = "zipPasswordInputpdf")
	private WebElement zippassinput;
	@FindBy(id = "runAnnotations")
	private WebElement Runannotation;
	@FindBy(id = "toEmial")
	private WebElement toemail;
	@FindBy(id = "subjectid")
	private WebElement subid;
	@FindBy(id = "saveSendToDocument")
	private WebElement savesendto;
	@FindBy(xpath = "(//button[@id='messageButtonOK'])[1]")
	private WebElement sentmailOK;
	@FindBy(xpath = ("(//button[@class='modalDialogButtons'])[1]"))
	private WebElement EmailsuccessMessageDialogboxOK;

	public WebElement getSentTo_Mail_asCopy() throws Exception {

		jsclick(sendTo);
		Thread.sleep(2000);
		jsclick(sendToMail);
		Thread.sleep(3000);
		jsclick(converttopdf);
		Thread.sleep(3000);
		jsclick(colorexport);
		Thread.sleep(2000);
		jsclick(pdfquality);
		Thread.sleep(2000);
		Select sel = new Select(pdfquality);
		sel.selectByVisibleText("Best Quality");
		Thread.sleep(2000);
		jsclick(coverpage);
		Thread.sleep(2000);
		jsclick(compresszip);
		Thread.sleep(2000);
		jsclick(sendtopassword);
		Thread.sleep(2000);
		jsclick(zippassinput);
		Thread.sleep(2000);
		zippassinput.sendKeys(DocumentsContext_excelRead(3, 1));
		Thread.sleep(2000);
		jsclick(Runannotation);
		Thread.sleep(2000);
		jsclick(toemail);
		Thread.sleep(2000);
		toemail.sendKeys(DocumentsContext_excelRead(4, 1));
		Thread.sleep(2000);
		jsclick(subid);
		Thread.sleep(2000);
		subid.sendKeys(DocumentsContext_excelRead(5, 1));
		Thread.sleep(4000);
		jsclick(savesendto);
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);
		return sendTo;

	}

	@FindBy(id = "sendDocAsReference")
	private WebElement Referencemail;

	public WebElement getSentTo_Mail_asReference() throws Exception {

		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendToMail);
		Thread.sleep(3000);
		jsclick(Referencemail);
		Thread.sleep(3000);
		Select sel = new Select(pdfquality);
	//	sel.selectByVisibleText("Best Quality");
		jsclick(toemail);
		Thread.sleep(3000);
		toemail.sendKeys(DocumentsContext_excelRead(4, 1));
		Thread.sleep(3000);
		jsclick(subid);
		Thread.sleep(3000);
		subid.sendKeys(DocumentsContext_excelRead(5, 1));
		Thread.sleep(4000);
		jsclick(savesendto);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);
		return Referencemail;
	}

	@FindBy(id = "sendToPrint")
	private WebElement sendtoPrint;
	@FindBy(id = "certifiedCoverPagePrint")
	private WebElement pageprint;
	@FindBy(id = "includeRouteSummaryPrint")
	private WebElement summaryprint;
	@FindBy(id = "unlockRedactionsWithPrint")
	private WebElement withunlockredaction;
	@FindBy(id = "unlockRedactionsPwdPrint")
	private WebElement pwdunlockredaction;
	@FindBy(id = "printDocumentOnView")
	private WebElement printview;

	public WebElement getSentTo_Print() throws Exception {
		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendtoPrint);
		Thread.sleep(4000);
		jsclick(pageprint);
		Thread.sleep(4000);
		jsclick(summaryprint);
		Thread.sleep(4000);
		jsclick(withunlockredaction);
		Thread.sleep(4000);
		jsclick(pwdunlockredaction);
		pwdunlockredaction.sendKeys(DocumentsContext_excelRead(3, 1));
		Thread.sleep(4000);
		jsclick(printview);
		return printview;
	}
	public WebElement SentTo_Print_Folder() throws Exception {
		Reporter.log("Scneario 02: A folder containing ten documents will be printed");
		Documents_ContextMenu Doc = new Documents_ContextMenu();
		
		jsclick(Doc.getRefreshbutton());
		Reporter.log("User click on refresh icon");
		Thread.sleep(3000);
		selectElement(Cabinet);
		Reporter.log("User expand the cabinet");
		Thread.sleep(4000);
		selectElement(Drawer);
		Reporter.log("User expand the drawer");
		Thread.sleep(4000);
		Reporter.log("User Open the folder, document is listed on the document page");
		selectElement(DocEmailFolder);
		Thread.sleep(6000);
		Reporter.log("User click the Select all check box");
		jsclick(Doc.getSelectAlldoc());
		Thread.sleep(9000);
		Reporter.log("User mouse hover on the document tab");
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Documents).perform();
		Reporter.log("User mouse hover on the send to submenu");
		jsclick(sendTo);
		Thread.sleep(3000);
		Reporter.log("User select print from the send to dropdown");
		jsclick(sendtoPrint);
		Thread.sleep(4000);
		jsclick(pageprint);
		Thread.sleep(4000);
		jsclick(summaryprint);
		Thread.sleep(4000);
		jsclick(withunlockredaction);
		Thread.sleep(4000);
		jsclick(pwdunlockredaction);
		pwdunlockredaction.sendKeys(DocumentsContext_excelRead(3, 1));
		Thread.sleep(4000);
		jsclick(printview);
		Reporter.log("In print tray it shows the document pages successfully");
		Thread.sleep(5000);
		return printview;
	}

	
	
	
	@FindBy(id = "sendToExport")
	private WebElement sendexport;
	@FindBy(id = "retainFormatChkExport")
	private WebElement retainchkexport;
	@FindBy(id = "includeRouteSummary")
	private WebElement Routesummary;
	@FindBy(id = "zipPasswordInput")
	private WebElement Zippassword;
	@FindBy(id = "convertToPdfChkExport")
	private WebElement convertpdfexport;
	@FindBy(id = "exportAnnotations")
	private WebElement exportannotation;
	@FindBy(id = "unlockRedactionsWithExport")
	private WebElement exportwith;
	@FindBy(id = "unlockRedactionsPwdExport")
	private WebElement exportPwd;
	@FindBy(id = "zipPasswordInput")
	private WebElement Zippasswordinput;
	@FindBy(id = "pdfPasswordInput")
	private WebElement Pdfpasswordinput;

	public WebElement getSentTo_Export() throws Exception {
		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendexport);
		Thread.sleep(3000);
		jsclick(retainchkexport);
		jsclick(Routesummary);
		jsclick(Zippassword);
		Thread.sleep(3000);
		Zippassword.sendKeys(DocumentsContext_excelRead(3, 1));
		Thread.sleep(3000);
		jsclick(savesendto);
		Thread.sleep(19000);
		jsclick(checkdoc);
		Thread.sleep(3000);
		element = MoveTo_Menu_Documents;
		Actions action2 = new Actions(driver);
		action2.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendexport);
		Thread.sleep(3000);
		jsclick(convertpdfexport);
		jsclick(exportannotation);
		jsclick(exportwith);
		jsclick(exportPwd);
		Thread.sleep(3000);
		exportPwd.sendKeys(DocumentsContext_excelRead(3, 1));
		Thread.sleep(3000);
		jsclick(Zippasswordinput);
		Thread.sleep(3000);
		Zippasswordinput.sendKeys(DocumentsContext_excelRead(3, 1));
		Thread.sleep(3000);
		jsclick(Pdfpasswordinput);
		Thread.sleep(3000);
		Pdfpasswordinput.sendKeys(DocumentsContext_excelRead(3, 1));
		Thread.sleep(3000);
		jsclick(savesendto);
		Thread.sleep(6000);
		return element;
	}
	
	
	public WebElement getSentTo_Export_Folder() throws Exception {
		Thread.sleep(6000);
		Reporter.log("Scneario 04: A folder containing ten documents will be exported");
		Documents_ContextMenu Doc = new Documents_ContextMenu();
		jsclick(Doc.getRefreshbutton());
		Reporter.log("User click on refresh icon");
		Thread.sleep(3000);
		selectElement(Cabinet);
		Reporter.log("User expand the cabinet");
		Thread.sleep(4000);
		selectElement(Drawer);
		Reporter.log("User expand the drawer ");
		Thread.sleep(4000);
		selectElement(DocEmailFolder);
		Reporter.log("User Open the folder, document is listed on the document page");
		Thread.sleep(6000);
		jsclick(Doc.getSelectAlldoc());
		Thread.sleep(9000);
		Reporter.log("User click the Select all check box");
		
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Documents).perform();
		jsclick(sendTo);
		Reporter.log("User mouse hover on the document tab");
		Thread.sleep(3000);
		jsclick(sendexport);
		Reporter.log("User mouse hover on the sendto submenu");
		Thread.sleep(3000);
		jsclick(retainchkexport);
		
		jsclick(Routesummary);
		jsclick(Zippassword);
		Thread.sleep(3000);
		Zippassword.sendKeys(DocumentsContext_excelRead(3, 1));
		Thread.sleep(3000);
		jsclick(savesendto);
		
		Thread.sleep(19000);
		jsclick(checkdoc);
		Thread.sleep(3000);
		
		Actions action2 = new Actions(driver);
		action2.moveToElement(MoveTo_Menu_Documents).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendexport);
		Thread.sleep(3000);
		jsclick(convertpdfexport);
		Reporter.log("User select export from the send to dropdown");
		jsclick(exportannotation);
		jsclick(exportwith);
		jsclick(exportPwd);
		Reporter.log("The export dialog box opened, user click on the retain radio button.");
		Thread.sleep(3000);
		exportPwd.sendKeys(DocumentsContext_excelRead(3, 1));
		Thread.sleep(3000);
		jsclick(Zippasswordinput);
		Thread.sleep(3000);
		Zippasswordinput.sendKeys(DocumentsContext_excelRead(3, 1));
		Thread.sleep(3000);
		jsclick(Pdfpasswordinput);
		Thread.sleep(3000);
		Pdfpasswordinput.sendKeys(DocumentsContext_excelRead(3, 1));
		Reporter.log("The folder  has been exported successfully");
		Thread.sleep(3000);
		jsclick(savesendto);
		Thread.sleep(6000);
		return element;
	}


	@FindBy(id = "sendToSecureMail")
	private WebElement SecureMail;
	@FindBy(id = "recepientEmailId")
	private WebElement recpmail;
	@FindBy(id = "confirmEmailIdSecure")
	private WebElement Confirmemail;
	@FindBy(id = "modifyPermissionCheckbox")
	private WebElement modifychk;
	@FindBy(id = "navigatorTreeOk32")
	private WebElement navigateOK;
	@FindBy(id = "recipientMailIdSecond")
	private WebElement recpmailsec;
	@FindBy(id = "confirmEmailIdSecureSecond")
	private WebElement confirmemailsec;
	@FindBy(id = "navigatorTreeOk33")
	private WebElement navigateOK2;

	public WebElement getSentTo_SecureLink() throws Exception {
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(SecureMail);
		Thread.sleep(4000);
		jsclick(recpmail);
		Thread.sleep(3000);
		recpmail.sendKeys(DocumentsContext_excelRead(4, 1));
		Thread.sleep(3000);
		jsclick(Confirmemail);
		Thread.sleep(3000);
		Confirmemail.sendKeys(DocumentsContext_excelRead(4, 1));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);
		recpmailsec.sendKeys(DocumentsContext_excelRead(4, 1));
		jsclick(confirmemailsec);
		Thread.sleep(3000);
		confirmemailsec.sendKeys(DocumentsContext_excelRead(4, 1));
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);
		return SecureMail;
	}

	@FindBy(id = "generateDocumentLink")
	private WebElement generatedoc;
	@FindBy(id = "documentLinkOk")
	private WebElement doclinkok;

	public WebElement getSentTo_GenerateDocumentLink() throws Exception {
		Thread.sleep(3000);
		//jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(generatedoc);
		Thread.sleep(4000);
		jsclick(doclinkok);
		Thread.sleep(6000);
		return doclinkok;
	}

	public void login_Verify_Workflow_User() throws Exception {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(DocumentsContext_excelRead(7, 0));
		driver.findElement(By.id("loginPassword")).sendKeys(DocumentsContext_excelRead(7, 1));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		a1 = new Actions(driver);
		a1.moveToElement(room).click().build().perform();
		WebElement ro = driver.findElement(By.xpath("//option[text()= 'CVWin19Server.Win2019_TestRoom']"));
		ro.click();
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Login button clicked successfully", true);
		try {
			WebElement sessionmsgYes = driver.findElement(By.xpath(" //button[@id='cvModelLoginValidationOk']"));
			sessionmsgYes.click();
			Thread.sleep(6000);
		} catch (Exception e) {
			// Session message is not displayed
		}
	}

	@FindBy(id = "accept")
	private WebElement accept;
	@FindBy(id = "wfactionOk")
	private WebElement action;
	@FindBy(id = "messageButtonOK")
	private WebElement messageOK;
	@FindBy(id = "wfcomments")
	private WebElement WFComment;
	@FindBy(id = "wfactionOk")
	private WebElement actionOK;

	public WebElement getVerifyWF() throws Exception {

		Thread.sleep(6000);
		jsclick(accept);
		Thread.sleep(6000);
		jsclick(action);
		Thread.sleep(6000);
		jsclick(messageOK);
		Thread.sleep(6000);
		jsclick(WFComment);
		Thread.sleep(6000);
		WFComment.sendKeys(DocumentsContext_excelRead(8, 1));
		Thread.sleep(6000);
		jsclick(actionOK);
		return actionOK;

	}

	@FindBy(xpath = "//a[@id='myTaskMenu']")
	private WebElement MoveTo_ToDoList_Option;

	public WebElement MoveTo_ToDoList_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_ToDoList_Option).perform();
		return MoveTo_ToDoList_Option;
	}

	@FindBy(id = "todoAll")
	private WebElement Select_All_Item;

	public WebElement getSelect_All_Item() {
		return Select_All_Item;
	}

	@FindBy(xpath = "//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]")
	private WebElement Open_ToDoDocument;

	public WebElement getOpen_ToDoDocument() {
		return Open_ToDoDocument;
	}

	@FindBy(xpath = "//img[@src='images/newRe.png']")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
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

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Defaultviewing;

	public WebElement getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		drop.selectByVisibleText("Default viewing");
		return Pdf_document_Defaultviewing;
	}

	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;
	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;

	public WebElement getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys("vw");
		jsclick(verifypassok);
		return verifypassok;
	}

	public WebElement getVerify_SendTo_Blankemailid() throws Exception {

		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendToMail);
		Thread.sleep(3000);
		jsclick(Referencemail);
		Thread.sleep(3000);
		Select sel = new Select(pdfquality);
		sel.selectByVisibleText("Best Quality");
		Thread.sleep(3000);
		jsclick(savesendto);
		return savesendto;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement messageContent;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement messageok;

	public WebElement getmessagevalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Email id should not  be Blank.";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(messageContent.getText());
		jsclick(messageok);
		return messageok;
	}

	public WebElement getVerify_SendTo_InvalidEmail() throws Exception {
		Thread.sleep(3000);
		toemail.sendKeys(DocumentsContext_excelRead(9, 1));
		Thread.sleep(3000);
		jsclick(subid);
		subid.clear();
		Thread.sleep(3000);
		subid.sendKeys(DocumentsContext_excelRead(5, 1));
		Thread.sleep(4000);
		jsclick(savesendto);
		return savesendto;
	}

	public WebElement getmessagevalidationInvalid() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter a valid 'To E-mail id'";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(messageContent.getText());
		jsclick(messageok);
		return messageok;
	}

	@FindBy(xpath = "//*[@id=\"ccEmail\"]")
	private WebElement CCEmailID;

	public WebElement getVerify_SendTo_InvalidCCEmail() throws Exception {
		toemail.clear();
		Thread.sleep(3000);
		toemail.sendKeys(DocumentsContext_excelRead(4, 1));
		Thread.sleep(3000);
		CCEmailID.sendKeys(DocumentsContext_excelRead(9, 1));
		Thread.sleep(3000);
		jsclick(subid);
		subid.clear();
		Thread.sleep(3000);
		subid.sendKeys(DocumentsContext_excelRead(5, 1));
		Thread.sleep(4000);
		jsclick(savesendto);
		return savesendto;
	}

	public WebElement getmessagevalidationCCEmailInvalid() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter a valid 'Cc E-mail id'";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(messageContent.getText());
		jsclick(messageok);
		return messageok;
	}

	@FindBy(xpath = "//*[@id=\"cancelSendToDocument\"]")
	private WebElement DialogCancel;

	public WebElement getDialogCancel() throws Exception {
		return DialogCancel;
	}

	public WebElement getSentTo_PrintValidation() throws Exception {

		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendtoPrint);
		Thread.sleep(4000);
		return sendtoPrint;
	}

	@FindBy(xpath = "//*[@id=\"cancelPrintBtn\"]")
	private WebElement PrintDialogCancel;

	public WebElement getPrintDialogCancel() throws Exception {
		return PrintDialogCancel;
	}

	public WebElement getSentTo_ExportCancel() throws Exception {

		Thread.sleep(6000);
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendexport);
		Thread.sleep(3000);
		return element;
	}

	public WebElement get_SecureLinkblankmail_Validation() throws Exception {

		Thread.sleep(6000);
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(SecureMail);
		Thread.sleep(4000);
		jsclick(navigateOK);
		Thread.sleep(3000);
		return element;
	}

	public WebElement getmessagevalidationBlankmail() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter recipient email id";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(messageContent.getText());
		jsclick(messageok);
		return messageok;
	}

	public WebElement getenter_SecureLinkRecipientaddress() throws Exception {

		Thread.sleep(3000);
		jsclick(recpmail);
		Thread.sleep(3000);
		recpmail.sendKeys(DocumentsContext_excelRead(4, 1));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);
		return element;
	}

	public WebElement getmessagevalidationConfirmmail() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter confirmation email id";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(messageContent.getText());
		jsclick(messageok);
		return messageok;
	}

	public WebElement getClearRecipientmail() throws Exception {

		Thread.sleep(4000);
		jsclick(recpmail);
		Thread.sleep(3000);
		recpmail.clear();
		Thread.sleep(3000);
		return element;
	}

	public WebElement getVerifyMismatch_SecureLink_Confirmmail() throws Exception {

		jsclick(Confirmemail);
		Thread.sleep(3000);
		Confirmemail.sendKeys(DocumentsContext_excelRead(4, 1));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);
		return element;

	}

	public WebElement getenter_validemailmessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter a valid  E-mail id";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(messageContent.getText());
		jsclick(messageok);
		return messageok;
	}

	public WebElement get_Mismatch_validation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Email id Mismatch ";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(messageContent.getText());
		jsclick(messageok);
		return messageok;
	}

	public WebElement get_Confirmmail_Invalid() throws Exception {

		Thread.sleep(3000);
		jsclick(recpmail);
		Thread.sleep(3000);
		recpmail.sendKeys(DocumentsContext_excelRead(4, 1));
		Thread.sleep(3000);
		jsclick(Confirmemail);
		Thread.sleep(3000);
		Confirmemail.sendKeys(DocumentsContext_excelRead(9, 1));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);
		return element;
	}

	public WebElement get_EnterConfirmmail() throws Exception {

		Thread.sleep(3000);
		jsclick(Confirmemail);
		Thread.sleep(3000);
		Confirmemail.sendKeys(DocumentsContext_excelRead(4, 1));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);
		return element;
	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk33\"]")
	private WebElement SecureOK;

	public WebElement getSecureOK() throws Exception {
		return SecureOK;
	}

	public WebElement getRecepientEmail_SecureLink() throws Exception {

		Thread.sleep(3000);
		recpmailsec.sendKeys(DocumentsContext_excelRead(4, 1));
		jsclick(confirmemailsec);
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);
		return element;
	}

	public WebElement getRecepietConfirmEmail_SecureLink() throws Exception {

		Thread.sleep(3000);
		recpmailsec.clear();
		jsclick(confirmemailsec);
		Thread.sleep(3000);
		confirmemailsec.sendKeys(DocumentsContext_excelRead(4, 1));
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);
		return element;
	}

	public WebElement getRecepietConfirmEmailInvalid_SecureLink() throws Exception {

		Thread.sleep(3000);
		recpmailsec.sendKeys(DocumentsContext_excelRead(4, 1));
		jsclick(confirmemailsec);
		Thread.sleep(3000);
		confirmemailsec.clear();
		Thread.sleep(3000);
		confirmemailsec.sendKeys(DocumentsContext_excelRead(9, 1));
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);
		return element;
	}

	public WebElement getenterConfirmRecepietEmail_SecureLink() throws Exception {

		confirmemailsec.clear();
		Thread.sleep(3000);
		confirmemailsec.sendKeys(DocumentsContext_excelRead(4, 1));
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);
		return element;
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

	public WebElement getVerifyAccept() throws Exception {

		Thread.sleep(3000);
		jsclick(accept);
		Thread.sleep(3000);
		jsclick(Workflowtask);
		Thread.sleep(3000);
		jsclick(CancelWorkflowtask);
		Thread.sleep(3000);
		jsclick(wfaction);
		return element;

	}

	public WebElement get_comment_Validation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter the comments.";
		String actualtext = messageContent.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(messageContent.getText());
		jsclick(messageok);
		return messageok;
	}

	@FindBy(xpath = "//*[@id=\"reject\"]")
	private WebElement Reject;

	public WebElement getVerifyReject() throws Exception {

		Thread.sleep(3000);
		jsclick(Reject);
		Thread.sleep(3000);
		jsclick(Workflowtask);
		Thread.sleep(3000);
		jsclick(CancelWorkflowtask);
		Thread.sleep(3000);
		jsclick(wfaction);
		return element;
	}

	@FindBy(xpath = "//*[@id=\"endwf\"]")
	private WebElement EndWorkflow;

	public WebElement getVerifyEndWorkflow() throws Exception {

		Thread.sleep(3000);
		jsclick(EndWorkflow);
		Thread.sleep(3000);
		jsclick(Workflowtask);
		Thread.sleep(3000);
		jsclick(CancelWorkflowtask);
		Thread.sleep(3000);
		jsclick(wfaction);
		return element;

	}

	@FindBy(xpath = "//*[@id=\"summary1\"]")
	private WebElement Summary;

	public WebElement getverifySummary() throws Exception {

		Thread.sleep(3000);
		jsclick(Summary);
		return element;

	}

	@FindBy(xpath = "//*[@id=\"commentswf\"]")
	private WebElement Comment;

	public WebElement getverifyComment() throws Exception {

		Thread.sleep(3000);
		jsclick(Comment);
		Thread.sleep(3000);
		jsclick(Workflowtask);
		Thread.sleep(3000);
		jsclick(CancelWorkflowtask);
		Thread.sleep(3000);
		jsclick(wfaction);
		return element;

	}
	
	@FindBy(xpath = "//button[@class='btn btn-danger summaryActionClass btn-default']")
	private WebElement SummaryCancel; 

	public WebElement getSummaryCancel() throws Exception {
		return SummaryCancel;
	}
}