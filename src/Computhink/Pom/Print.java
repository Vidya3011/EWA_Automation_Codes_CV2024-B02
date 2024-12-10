package Computhink.Pom;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class Print extends Computhink.Generic.BaseClass {

	public Print() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//a[@id='recentMenuBtn']"))
	private WebElement RecentTab;

	@FindBy(xpath = ("//table[@id='recentFolders']/tbody/tr[1]/td[1]"))
	private WebElement RecentFolder;

	@FindBy(xpath = ("//td[text()='test doc']"))
	private WebElement RecentDocument;

	@FindBy(xpath = ("//div[@id='viewDocumentMail']"))
	private WebElement EmailDoc;

	@FindBy(xpath = ("(//input[@id='toEmial'])[1]"))
	private WebElement EnterEmail;

	@FindBy(xpath = ("(//input[@id='convertToPdfChk'])[1]"))
	private WebElement ConvertPDfCheckbox;

	@FindBy(xpath = ("(//textarea[@id='messageId'])[1]"))
	private WebElement MessageBox;

	@FindBy(xpath = ("(//button[@class='modalDialogButtons'])[1]"))
	private WebElement EmailsuccessMessageDialogboxOK;

	@FindBy(xpath = ("(//input[@id='sendDocAsCopy'])[1]"))
	private WebElement CopyEmail;

	@FindBy(xpath = ("(//input[@id='sendDocAsReference'])[1]"))
	private WebElement ReferenceEmail;

	@FindBy(xpath = ("(//button[@id='saveSendToDocument'])[1]")) // *[@id='saveSendToDocument']
	private WebElement EmailSendOk;
	// (//input[@id='zipPasswordInputpdf'])[1]
	@FindBy(xpath = ("//*[@id=\"ccEmail\"]"))
	private WebElement ForCCmail;

	@FindBy(xpath = ("(//input[@id='subjectid'])[1]"))
	private WebElement ForSubject;

	@FindBy(xpath = ("(//input[@id='retainPdfColorExport1'])[1]"))
	private WebElement ForRetainEmail;

	@FindBy(xpath = ("(//input[@id='sendToPassword'])[1]"))
	private WebElement ForemailPasswrd;

	@FindBy(xpath = ("(//input[@id='zipPasswordInputpdf'])[1]"))
	private WebElement ForzipPasswrd;

	@FindBy(xpath = ("//div[@id='viewDocumentExport']//a[contains(text(),'Export...')]"))
	private WebElement ExportDialog;

	@FindBy(xpath = ("(//input[@id='convertToPdfChkExport'])[1]"))
	private WebElement ExportCovertPDFcheckbx;

	@FindBy(xpath = ("(//input[@id='zipPasswordInput'])[1]"))
	private WebElement Expzippwrdcheckbx;

	//// input[@id='includeRouteSummary']

	@FindBy(xpath = ("(//input[@id='pdfPasswordInput'])[1]"))
	private WebElement ExpPDFpaswrdbox;

	@FindBy(xpath = ("(//input[@id='unlockRedactionsWithExport'])[1]"))
	private WebElement Expunlockredbox;

	@FindBy(xpath = ("(//input[@id='retainFormatChkExport'])[1]"))
	private WebElement Expretainchkbox;

	@FindBy(xpath = ("//input[@id='includeRouteSummary']"))
	private WebElement ExpIncludewrkflwchkbox;

	// input[@id='exportAnnotations'](//input[@id='unlockRedactionsPwdExport'])[1]//select[@id='convertToPdfExportQuality']

	@FindBy(xpath = ("//input[@id='exportAnnotations']"))
	private WebElement ExpWithannotations;

	@FindBy(xpath = ("(//input[@id='unlockRedactionsPwdExport'])[1]"))
	private WebElement ExpUnlockRedPasswrd;

	@FindBy(xpath = ("//select[@id='convertToPdfExportQuality']"))
	private WebElement ExpQualitydropdwn;

	@FindBy(xpath = ("//*[@id=\"messageContent\"]"))
	private WebElement WithoutEmailID;

	@FindBy(xpath = ("//option[@id='exportAverageQuality']"))
	private WebElement ExpAverageQuality;

	@FindBy(xpath = ("//option[@id='exportBestQuality']"))
	private WebElement ExpBestQuality;

	@FindBy(xpath = ("//*[@id=\"messageButtonOK\"]"))
	private WebElement InvalidDialogBoxOKBTN;

	@FindBy(xpath = ("//*[@id=\"messageContent\"]"))
	private WebElement InvalidEmailMessageValidation;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/a"))
	private WebElement Cabinet;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li/a"))
	private WebElement Drawer;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li/ul/li[1]/a"))
	private WebElement Folder;

	//

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[4]/td[3]"))
	private WebElement Document;
	
	

	@FindBy(xpath = ("//a[@id='createDocument']"))
	private WebElement NewDocumentID;

	// @FindBy(xpath=("//*[@id='viewDocumentTypeList']"))
	// private WebElement DocTypeList;

	@FindBy(xpath = ("//span[@class='c0193']"))
	private WebElement SelectDropdown;

	@FindBy(xpath = ("(//input[@id='blackoutPrint'])[1]"))
	private WebElement BlackoutCheckbox;

	@FindBy(xpath = ("//div[@id='viewDocumentPrint']"))
	private WebElement DocPrint;

	@FindBy(xpath = ("(//input[@id='includeRouteSummaryPrint'])[1]"))
	private WebElement forincludewrkflowcheckbx;

	@FindBy(xpath = ("(//input[@class='thumbnailOptionSelected'])[1]"))
	private WebElement CheckBox;

	@FindBy(xpath = ("//*[@id=\"toolbarId\"]/div[6]"))
	private WebElement SendToIcon;

	@FindBy(xpath = ("(//input[@id='unlockRedactionsWithPrint'])[1]"))
	private WebElement UnlockRedaction;

	@FindBy(xpath = ("(//input[@id='unlockRedactionsPwdPrint'])[1]"))
	private WebElement UnlockRedactionPasswrd;

	@FindBy(xpath = ("(//button[@id='messageButtonOKFD'])[1]"))
	private WebElement PrintokButton;

	@FindBy(xpath = ("//button[@id='cancelPrintBtn']"))
	private WebElement Cancelb;

	@FindBy(xpath = ("(//button[@id='printDocumentOnView'])[1] "))
	private WebElement OKbuttonprintpage;

	@FindBy(xpath = ("(//input[@id='certifiedCoverPagePrint'])[1]"))
	private WebElement CertifiedPageCheckbox;

	@FindBy(xpath = ("//*[@id=\"recepientEmailId\"]"))
	private WebElement secureLinkReceipientMail;

	@FindBy(xpath = ("//*[@id=\"confirmEmailIdSecure\"]"))
	private WebElement secureLinkConfirmMail;

	@FindBy(xpath = ("//*[@id=\"modifyPermissionCheckbox\"]"))
	private WebElement secureLinkModifyCheckBox;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeOk32\"]"))
	private WebElement secureLinkOKBTN;

	@FindBy(id = ("recipientMailIdSecond"))
	private WebElement secLinkReceipientMailAgain;

	@FindBy(xpath = ("//*[@id=\"confirmEmailIdSecureSecond\"]"))
	private WebElement secLinkConfirmtMailAgain;

	@FindBy(xpath = ("//*[@id=\"messageContent\"]"))
	private WebElement secLinkBlankMail_ID;

	@FindBy(xpath = ("//*[@id=\"messageButtonOK\"]"))
	private WebElement EmailIDMismatchDialogOKBTN;

	@FindBy(xpath = ("//*[@id=\"messageContent\"]"))
	private WebElement EmailIDMismatchMessage;

	@FindBy(xpath = ("//*[@id=\"confirmEmailIdSecureSecond\"]"))
	private WebElement secLinkConfirmMailAgain;

	@FindBy(xpath = ("//*[@id=\"userName\"]"))
	private WebElement secLinkUserName;

	@FindBy(xpath = ("//*[@id=\"password\"]"))
	private WebElement secLinkUserPwrd;

	@FindBy(xpath = ("//*[@id=\"submitid\"]"))
	private WebElement secLinkLogin;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeOk33\"]"))
	private WebElement secureLinkOKBTNsecond;

	@FindBy(xpath = ("//*[@id=\"documentSendToLi\"]"))
	private WebElement secureLinkFromDocTab;

	// *[@id="sendToSecureMail"]
	@FindBy(xpath = ("//*[@id=\"sendToSecureMail\"]"))
	private WebElement sendToDocTab;

	@FindBy(xpath = ("//*[@id=\"sendToSecureMailView\"]"))
	private WebElement secureLink;

	@FindBy(xpath = ("//*[@id=\"viewDocumentnavigator\"]/ul/li[1]/ins"))
	private WebElement TestCabExpIcon;

	@FindBy(xpath = ("//*[@id=\"30\"]/ins"))
	private WebElement CaseRoomNishRCab;

	@FindBy(xpath = ("//*[@id=\"31\"]/ins"))
	private WebElement CAseRoomNishDrawerIcon;

	@FindBy(xpath = ("//*[@id=\"32\"]/a/ins"))
	private WebElement CAseRoomNishRExpIcon;

	@FindBy(xpath = ("//button[@id='ownershipMessageModelOk']"))
	private WebElement Lockeddoc;

	@FindBy(xpath = ("//*[@id=\"viewDocumentnavigator\"]/ul/li[1]/ul/li/ins"))
	private WebElement TesttestDrawerExpIcon;

	@FindBy(xpath = ("//*[@id=\"viewDocumentnavigator\"]/ul/li[1]/ul/li/ul/li[1]/a"))
	private WebElement VidyaTestFolder;

	@FindBy(xpath = "//*[@id=\"376\"]/a")
	private WebElement SQLRoomFolder;

	//////// PRINT FUNCTIONLITY/////////////////////////

	public void Email_ConvertPDF_With_Annotation() throws Exception {

		Reporter.log("Scenario 03:Verify Email 'Convert_to_PDF' with 'Burn annotation' option");
		Reporter.log("Verifying Email Functionality");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		jsclick(CheckBox);
		Reporter.log("Open a document and select a page");
		jsclick(SendToIcon);
		Thread.sleep(3000);
		jsclick(EmailDoc);
		Reporter.log("Mousehover on send to icon from viewer tool bar");
		jsclick(ConvertPDfCheckbox);
		Thread.sleep(3000);
		Reporter.log("Click convertToPDF checkbox");
		Reporter.log("Click burn annotation checkbox");
		sendvalue(EnterEmail, readFromExMail(2, 0));
		Thread.sleep(3000);
		Reporter.log("Enter valid mail into email field");
		sendvalue(ForSubject, readFromExMail(3, 2));
		Thread.sleep(3000);
		Reporter.log("Enter valid confirm mail into confirm mail textbox");
		jsclick(ForRetainEmail);
		Thread.sleep(3000);
		jsclick(ForemailPasswrd);
		Thread.sleep(3000);
		movingElement(ForzipPasswrd);
		sendvalue(ForzipPasswrd, readFromExMail(1, 3));
		jsclick(EmailSendOk);
		Reporter.log("Click email dialog OK button");
		Reporter.log("Email dialog with burn annotation verified successfully...");
		Thread.sleep(20000);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);
		Thread.sleep(15000);

		Reporter.log("Email Functionality with all annotation settings,sent successfull", true);
	}

	public void Email_Reference() throws Exception {
		
		Reporter.log("Scenario 01: Verify reference Email");
		Thread.sleep(4000);
		jsclick(TestCabExpIcon);
		Reporter.log("Expand the cabinet");
		Thread.sleep(3000);
		jsclick(TesttestDrawerExpIcon);
		Reporter.log("Expand the drawer");
		Thread.sleep(3000);
		Reporter.log("Click on the folder");
		selectElement(VidyaTestFolder);
		Thread.sleep(5000);
		jsclick(Document);
		Reporter.log("Open a document");
		Thread.sleep(7000);
		try {
			if (Lockeddoc.isDisplayed()) {

				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
				jsclick(element1);
			}
		} catch (Exception e) {
			Reporter.log("Locked message displayed", true);
			Thread.sleep(2000);
		}

		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("AlertISNotPresent");
		}
		Thread.sleep(3000);
		jsclick(CheckBox);
		Reporter.log("Select a page");
		jsclick(SendToIcon);
		Thread.sleep(3000);
		Reporter.log("Click on sendto tool icon");
		jsclick(EmailDoc);
		Thread.sleep(3000);
		Reporter.log("Click on email option");
		jsclick(ReferenceEmail);
		Thread.sleep(3000);
		Reporter.log("Click on reference radio button");
		sendvalue(EnterEmail, readFromExMail(1, 0));
		Reporter.log("Enter the valid email to email field");
		jsclick(EmailSendOk);
		Thread.sleep(20000);
		Reporter.log("Click on email dialog OK button");
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);
		Thread.sleep(15000);
		Reporter.log("User should receive 'Email sent successfull' message dialog");

		Reporter.log("Email sent dialog displayed successfull");

	}

	public void Email_Copy_WithMsgBox_SubjectBox() throws Exception {
		Print pojo = new Print();
		Reporter.log("Scenario 02:Verify copy email and message textbox");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		jsclick(CheckBox);
		Reporter.log("Open a document and select a page");
		jsclick(SendToIcon);
		Reporter.log("Click on sendto tool icon");
		Thread.sleep(3000);
		jsclick(EmailDoc);
		Reporter.log("Select email submenu");
		jsclick(CopyEmail);
		Thread.sleep(3000);
		Reporter.log("Select copy radio button");
		sendvalue(EnterEmail, readFromExMail(2, 0));
		Reporter.log("Enter a valid email id");
		sendvalue(ForSubject, readFromExMail(1, 2));
		Reporter.log("Enter suject into subject textbox");
		Thread.sleep(4000);
		sendvalue(MessageBox, readFromExMail(2, 2));
		Reporter.log("Enter message into message dialog box");
		Thread.sleep(4000);
		jsclick(EmailSendOk);
		Reporter.log("Click on Email dialog OK button");
		Thread.sleep(20000);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);
		Reporter.log("User should receive 'Email sent successfull' message dialog");
		Thread.sleep(15000);
		Reporter.log("Email sent successfully dialog displayed...");

	}

	public void exports_with_convert_to_pdf_with_passwords() throws Exception {

		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(CheckBox));
		wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		clickElement(CheckBox);
		wait.until(ExpectedConditions.elementToBeClickable(SendToIcon));
		jsclick(SendToIcon);
		Thread.sleep(3000);
		jsclick(ExportDialog);
		jsclick(ExportCovertPDFcheckbx);
		Thread.sleep(2000);
		jsclick(Expzippwrdcheckbx);
		Expzippwrdcheckbx.sendKeys(readFromExMail(1, 3));
		Thread.sleep(3000);
		ExpPDFpaswrdbox.sendKeys(readFromExMail(2, 3));
		Thread.sleep(3000);
		jsclick(EmailSendOk);
		Thread.sleep(15000);

	}

	public void exports_with_Retain() throws Exception {

		Reporter.log("Scenario 04:verifying export functionality retain format,with average quality and zip password",
				true);
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(CheckBox));
		Reporter.log("Open a document and select a page");
		wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		Reporter.log("Click on sendto tool icon");
		jsclick(CheckBox);
		Reporter.log("Select export submenu");
		jsclick(SendToIcon);
		Thread.sleep(3000);
		Reporter.log("Select retain radio button");
		jsclick(ExportDialog);
		Thread.sleep(5000);
		jsclick(Expretainchkbox);
		Reporter.log("Click on export dialog OK button");
		Thread.sleep(5000);
		Expzippwrdcheckbx.sendKeys(readFromExMail(3, 3));
		Reporter.log("Document exported successfull");
		Thread.sleep(3000);
		jsclick(EmailSendOk);

		Thread.sleep(15000);

	}

	public void exports_with_convert_to_pdf_and_best_quality() throws Exception {
		Reporter.log("Step Details: Verify Export");
		Thread.sleep(4000);
		jsclick(TestCabExpIcon);
		Reporter.log("Expand the cabinet");
		Thread.sleep(3000);
		jsclick(TesttestDrawerExpIcon);
		Reporter.log("Expand the drawer");
		Thread.sleep(3000);
		Reporter.log("Click on the folder");
		try {
			selectElement(VidyaTestFolder);
		} catch (Exception e) {
			//
		}
		Thread.sleep(5000);
		jsclick(Document);
		Reporter.log("Open a document");
		Thread.sleep(7000);
		try {
			if (Lockeddoc.isDisplayed()) {

				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
				jsclick(element1);
			}
		} catch (Exception e) {
			Reporter.log("Locked message displayed", true);
			Thread.sleep(2000);
		}

		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("AlertISNotPresent");
		}
		Thread.sleep(3000);

		Thread.sleep(5000);

		Reporter.log("Scenario 05:Verify Export with convert to PDF");
		Thread.sleep(15000);

		wait.until(ExpectedConditions.visibilityOf(CheckBox));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		Reporter.log("Open a document and select a page");
		jsclick(CheckBox);
		Reporter.log("Click on sendto tool icon");
		jsclick(SendToIcon);
		Thread.sleep(3000);
		Reporter.log("Select export submenu");
		jsclick(ExportDialog);
		Thread.sleep(3000);
		Reporter.log("Select convert to pdf radio button");
		jsclick(ExportCovertPDFcheckbx);
		movingclkElement(ExpQualitydropdwn);
		jsclick(ExpBestQuality);
		Thread.sleep(2000);
		Expzippwrdcheckbx.sendKeys(readFromExMail(4, 3));
		Thread.sleep(3000);
		ExpPDFpaswrdbox.sendKeys(readFromExMail(5, 3));
		Thread.sleep(3000);
		jsclick(ExpWithannotations);
		Reporter.log("Select the burn annotation check box");
		jsclick(Expunlockredbox);
		Thread.sleep(3000);
		ExpUnlockRedPasswrd.sendKeys(readFromExMail(2, 1));
		jsclick(EmailSendOk);
		Reporter.log("User click on export dialog OK button");
		Reporter.log("The document exported  succcessfully");

		Thread.sleep(15000);

	}

	public void exports_with_convert_to_pdf_and_include_workflow_summary() throws InterruptedException {
		Print pojo = new Print();
		Reporter.log("Scenario 06:Verify Export with convert to PDF");
		Thread.sleep(8000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(CheckBox));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		jsclick(CheckBox);
		Reporter.log("Open a document and select a page");
		jsclick(SendToIcon);
		Reporter.log("Select send to tool icon");
		Thread.sleep(3000);
		jsclick(ExportDialog);
		Reporter.log("Click on export submenu");
		Thread.sleep(3000);
		jsclick(ExportCovertPDFcheckbx);
		Thread.sleep(3000);
		Reporter.log("Select convert to pdf radio button");
		jsclick(ExpIncludewrkflwchkbox);
		Thread.sleep(3000);
		jsclick(EmailSendOk);
		Reporter.log("Click on export dialog OK button");

		Thread.sleep(15000);
		jsclick(Refresh_Button(driver));
		Reporter.log("User click on refresh button");

	}

	public void PrintWithcertifiedCoverPageUnlockRedaction() throws Exception {
		Print pojo = new Print();
		Thread.sleep(3000);
		selectElement(Cabinet);
		Thread.sleep(3000);
		selectElement(Drawer);
		Thread.sleep(3000);
		selectElement(Folder);
		Thread.sleep(5000);

		clickElement(Document);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		jsclick(CheckBox);
		Thread.sleep(3000);

		jsclick(SendToIcon);
		Thread.sleep(3000);
		jsclick(DocPrint);
		Thread.sleep(3000);
		jsclick(CertifiedPageCheckbox);
		jsclick(BlackoutCheckbox);
		Thread.sleep(3000);
		jsclick(forincludewrkflowcheckbx);
		Thread.sleep(3000);
		jsclick(UnlockRedaction);

		sendvalue(UnlockRedaction, readFromExMail(2, 3));
		Thread.sleep(2000);
		jsclick(OKbuttonprintpage);
		Reporter.log("The print page displayed successfully with selected document", true);
		// Thread.sleep(15000);

	}

	private boolean isDocumentEmpty(WebDriver driver) {
		// Assuming the locator for the page elements
		try {
			WebElement pageElement = driver.findElement(By.xpath("//*[@id=\"docViewerMetaData\"]"));
			return pageElement == null || !pageElement.isDisplayed();
		} catch (NoSuchElementException e) {
			return true; // If no pages are found, the document is considered empty
		}
	}

	public void Email_ConvertPDF_WithAll_Annotations_Invalid() throws Exception {
		Print pojo = new Print();
		Reporter.log("Scneario 01: Verify email with invalid email id");
		Thread.sleep(6000);

		Reporter.log("Click on cabinet");
		jsclick(TestCabExpIcon);
		Thread.sleep(5000);
		Reporter.log("Click on drawer");
		jsclick(TesttestDrawerExpIcon);
		Thread.sleep(3000);
		ElementToBeClickable(VidyaTestFolder);
		Reporter.log("Select a folder");
		selectElement(VidyaTestFolder);
		Thread.sleep(5000);
		Reporter.log("Click on cabinet");
		jsclick(Document);
		Reporter.log("Open a document");
		Thread.sleep(5000);
		try {
			if (Lockeddoc.isDisplayed()) {

				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
				jsclick(element1);
			}
		} catch (Exception e) {
			Reporter.log("Locked message displayed", true);
			Thread.sleep(2000);
		}

		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("AlertISNotPresent");
		}
		Thread.sleep(4000);

		// Check if the document has a page
		/*
		 * if (isDocumentEmpty(driver)) { Reporter.
		 * log("The document does not have any pages. Skipping the email sending process."
		 * ,true); return; // Skip the rest of the test }
		 */

		wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		Reporter.log("Click on thumbnail view check box");
		jsclick(CheckBox);

		Reporter.log("Click on SendTo icon");
		jsclick(SendToIcon);
		Thread.sleep(3000);
		Reporter.log("Click on email option");
		jsclick(EmailDoc);
		Reporter.log("Enter invalid mail id into Enter email textbox ");
		jsclick(ConvertPDfCheckbox);
		Thread.sleep(3000);
		sendvalue(EnterEmail, (readFrmXLNEgative(6, 0)));
		Thread.sleep(3000);
		// sendvalue(pojo.getSubject(), "Nisha.Ammu@123Mail23com");

		jsclick(EmailSendOk);
		Reporter.log("Click on Email dialog OK button");
		Thread.sleep(4000);
		System.out.println(InvalidEmailMessageValidation.getText());
		Reporter.log(
				"User should get 'please enter valid email' warning message, warning dialog displayed successfull");
		Thread.sleep(4000);
		jsclick(InvalidDialogBoxOKBTN);

		Thread.sleep(8000);
		Reporter.log("Email Functionality with Invalid alphanumeric mail id scenario verified successfully...", true);
		EnterEmail.clear();
		Reporter.log("===========================================================================================");
		Reporter.log("Scenario 02: verify blank email");
		Thread.sleep(2000);
		sendvalue(ForCCmail, (readFrmXLNEgative(3, 0)));
		Thread.sleep(3000);
		jsclick(EmailSendOk);
		Reporter.log("Clear the previous entered mail in email text box");
		Thread.sleep(4000);
		Reporter.log("Click on mail dialog OK button");
		System.out.println(WithoutEmailID.getText());
		Thread.sleep(4000);
		jsclick(InvalidDialogBoxOKBTN);
		Thread.sleep(8000);
		Reporter.log("Click on email option");
		// pojo.getEnterEmail().clear();
		Thread.sleep(2000);
		ForCCmail.clear();
		Thread.sleep(3000);
		Reporter.log(
				"User should get 'email id should not be blank' warning message, Warning dialog displayed successfull");
		jsclick(EmailSendOk);
		Thread.sleep(4000);
		Reporter.log("Click on warning dialog OK button");
		System.out.println(WithoutEmailID.getText());
		Thread.sleep(4000);
		Reporter.log("Blank email negative scenario verified successfully...");
		jsclick(InvalidDialogBoxOKBTN);

		Thread.sleep(8000);
		Reporter.log("Click on refresh button");
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
	}

	////////////////////////// SECURELINK///////////////////
	public void SecureLinkInvalidRecepient_Mail_ID_ValidConfirm_Mail() throws Exception {

		Thread.sleep(5000);
		// jsclick(Refresh_Button(driver));
		Reporter.log("Negative Scenario 01: Check Securelink with Invalid Email ID ");
		jsclick(TestCabExpIcon);
		Reporter.log("Expand a cabinet");
		Thread.sleep(3000);
		jsclick(TesttestDrawerExpIcon);
		Thread.sleep(3000);
		Reporter.log("Expand a drawer");
		selectElement(VidyaTestFolder);
		Reporter.log("Open a folder");
		Thread.sleep(5000);
		Reporter.log("Open a document");
		jsclick(Document);
		Thread.sleep(5000);
		try {
			if (Lockeddoc.isDisplayed()) {

				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
				jsclick(element1);
			}
		} catch (Exception e) {
			Reporter.log("Locked message displayed", true);
			Thread.sleep(2000);
		}

		Thread.sleep(3000);
		try {

			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("No Alert is present");
		}
		Thread.sleep(3000);
		jsclick(CheckBox);
		Reporter.log("Click on check box");
		jsclick(SendToIcon);
		Thread.sleep(3000);
		Reporter.log("Click on sendto icon");
		jsclick(secureLink);
		Reporter.log("Select secure link submenu");
		Thread.sleep(3000);
		sendvalue(secureLinkReceipientMail, (readFrmXLNEgative(1, 0)));
		Thread.sleep(2000);
		Reporter.log("User should enter invalid email into email textbox");
		sendvalue(secureLinkConfirmMail, readFromExMail(2, 0));
		// jsclick(pojo.getsecureLinkModifyCheckBox());
		Thread.sleep(2000);
		Reporter.log("Click on securelink dialog OK button");
		jsclick(secureLinkOKBTN);
		Thread.sleep(5000);
		System.out.println("SecureLink : Invalid Receipient mail and valid confirm mail");
		System.out.println(EmailIDMismatchMessage.getText());
		Thread.sleep(3000);
		jsclick(EmailIDMismatchDialogOKBTN);
		Reporter.log("It should displayed 'Please enter valid recipient email id' dialog on the page  ");
		String msg = "Please enter valid recipient email id";
		SoftAssertEqalValidation(EmailIDMismatchMessage, msg);
		System.out.println("Assert Validation successfull.");
		Reporter.log("Secure link - invalid email id scenario verified successfully");
		Thread.sleep(8000);
	//	jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
	}

	public void SendToSecureLinkwithout_Email_ID_BlankTest() throws Exception {

		Thread.sleep(3000);
		Reporter.log("Scenario 2: Securelink with blank email ID");
		secureLinkReceipientMail.clear();
		Reporter.log("Email id should be blank");
		secureLinkConfirmMail.clear();
		// jsclick(pojo.getsecureLinkModifyCheckBox());
		Thread.sleep(2000);
		Reporter.log("Click on securelink dialog OK button");
		jsclick(secureLinkOKBTN);
		Thread.sleep(5000);
		System.out.println("SecureLink : without email id");
		System.out.println(EmailIDMismatchMessage.getText());
		Thread.sleep(3000);
		jsclick(EmailIDMismatchDialogOKBTN);
		Reporter.log("User should get 'Please enter recipient email id' Warning dialog box");
		String msg = "Please enter recipient email id";
		SoftAssertEqalValidation(secLinkBlankMail_ID, msg);
		Reporter.log("Warning dialog displayed successfull,Blank mail Scenario verified successfully");
		System.out.println("Assert Validation successfull.");
		Thread.sleep(8000);
	}

	
	
	
	public void OpenDocumentAndCheckPages() throws Exception{
		   Reporter.log("Scenario 01: Document send to SecureLink from viewer page", true);
	        
	        // Expanding the cabinet
	        Reporter.log("Expand the cabinet", true);
	        jsclick(TestCabExpIcon);  // Custom method to click an element
	        Thread.sleep(3000);
	        
	        // Expanding the drawer
	        jsclick(TesttestDrawerExpIcon);  // Custom method to click an element
	        Reporter.log("Expand the drawer", true);
	        Thread.sleep(3000);
	        
	        // Expanding the folder
	        selectElement(VidyaTestFolder);  // Custom method to select an element
	        Reporter.log("Expand the folder", true);
	        Thread.sleep(5000);
	        
	        // Opening the document
	        Reporter.log("Open the document", true);
	        
	        // Waiting for the document list to appear
	        List<WebElement> DocumentNames = driver.findElements(By.xpath("//*[@id='documentListTable']/tbody/tr/td[3]"));

	        Thread.sleep(5000); // Allow time for page to load

	        for (int i = 0; i < DocumentNames.size(); i++) {
	            try {
	                System.out.println("First open one document and check whether it has document or not, then close and open another document and verify whether it has content.");

	                // Click on the current document in the list
	                WebElement document = DocumentNames.get(i);
	                jsclick(document); // Click on the document
	                
	                Thread.sleep(5000);

	                // Wait for the document viewer to load and for the thumbnails to be visible
	                WebDriverWait wait = new WebDriverWait(driver, 10);
	                WebElement thumbnail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='docViewerMetaData']")));

	                // Re-locate the document pages after the page has been updated
	                List<WebElement> pages = driver.findElements(By.xpath("//div[@id='docViewerMetaData']//img"));

	                // Check if the document has content
	                if (pages.isEmpty()) {
	                    System.out.println("Do not perform action: the opened document is empty.");
	                } else {
	                    boolean documentHasContent = false;
	                    for (WebElement page : pages) {
	                        // Check if the image has a valid 'src' attribute (indicating the document is loaded)
	                        String srcAttribute = page.getAttribute("src");
	                        if (srcAttribute != null && !srcAttribute.isEmpty()) {
	                            System.out.println("Perform action: image is loaded. src=" + srcAttribute);
	                            documentHasContent = true;
	                            break;  // Stop checking after finding one valid image
	                        }
	                    }

	                    if (!documentHasContent) {
	                        System.out.println("Do not perform action: image is empty or not loaded.");
	                    }
	                }
                    Thread.sleep(4000);
	                // Close the document viewer after checking
	              

	            } catch (StaleElementReferenceException e) {
	                System.out.println("Stale element reference error occurred: " + e.getMessage());
	                // Re-locate the element and retry the action
	                DocumentNames = driver.findElements(By.xpath("//*[@id='documentListTable']/tbody/tr/td[3]"));
	                // Retry clicking the document
	                Thread.sleep(3000);
	                WebElement document = DocumentNames.get(i);
	               jsclick(document);
	            } catch (NoSuchElementException e) {
	                System.out.println("An error occurred while interacting with the document: " + e.getMessage());
	            } catch (Exception e) {
	                System.out.println("Unexpected error: " + e.getMessage());
	            }
	        }
	        Thread.sleep(4000);
            // Close the document viewer after checking
            WebElement closeIcon = driver.findElement(By.xpath("//*[@id='cvDocumentClose']/span"));
            jsclick(closeIcon); 
	      
	        
	}
	
	
	
	
	
	
	
	
	
	
	public void SecLinkReceipientDailogBoxInvalid_Email_ID() throws Exception {

		Reporter.log("Negative Scenario 3: Securelink with valid email and invalid confirm mail ");

		Thread.sleep(3000);
		sendvalue(secureLinkReceipientMail, readFromExMail(2, 0));
		Thread.sleep(2000);
		Reporter.log("Enter a valid email id into email field");
		sendvalue(secureLinkConfirmMail, readFromExMail(2, 0));
		jsclick(secureLinkModifyCheckBox);
		Reporter.log("Click on modify check box");
		Thread.sleep(2000);
		jsclick(secureLinkOKBTN);
		Reporter.log("User should enter invalid email id into cofirm mail text box");
		Thread.sleep(5000);
		sendvalue(secLinkReceipientMailAgain, (readFrmXLNEgative(4, 0)));

		Thread.sleep(2000);
		sendvalue(secLinkConfirmtMailAgain, (readFrmXLNEgative(5, 0)));
		Thread.sleep(2000);
		jsclick(secureLinkOKBTNsecond);
		Reporter.log("Click on securelink dialog OK button");
		Thread.sleep(5000);
		Reporter.log(
				"Sending secure link mail from viewer page,select the document from page List the Selected Page was sent Successfully...Mail has received.");
		Thread.sleep(5000);
		Reporter.log("USer should get 'Email id mismatch' warning dialog");
		System.out.println("SecureLink : invalid confirm email id");
		System.out.println(EmailIDMismatchMessage.getText());
		Thread.sleep(3000);
		jsclick(EmailIDMismatchDialogOKBTN);
		String msg = "Email id Mismatch";
		SoftAssertEqalValidation(secLinkBlankMail_ID, msg);
		Reporter.log(
				" Warning dialog displayed...Valid email - invalid confirm mail scenario verified successfully...");
		System.out.println("Assert Validation successfull.");
		Thread.sleep(8000);
	}

	public void SecLinkReceipientMailBlank() throws Exception {

		Thread.sleep(5000);
		secLinkReceipientMailAgain.clear();
		Reporter.log(
				"Negative Scenario 4:Securelink first dialog box has Valid email and Valid confirm email ID/ Securelink  Second dialog box should be blank ");

		Thread.sleep(2000);
		Reporter.log("Enter valid email");
		secLinkConfirmtMailAgain.clear();
		Thread.sleep(2000);
		Reporter.log("Enter valid confirm email");
		jsclick(secureLinkOKBTNsecond);
		Thread.sleep(5000);
		Reporter.log("Blank mail id:Unable to send the document into secure link");
		Thread.sleep(5000);
		Reporter.log("Click on first securelink dialog box OK button");
		System.out.println("SecureLink : blank confirm email id");
		System.out.println(EmailIDMismatchMessage.getText());
		Thread.sleep(3000);
		Reporter.log("Should not enter email id,just click on second securelink dilaog box OK button");
		jsclick(EmailIDMismatchDialogOKBTN);
		String msg = "Email id Mismatch";
		Reporter.log("User should get'Email id Mismatch' warning alert");
		SoftAssertEqalValidation(secLinkBlankMail_ID, msg);
		Reporter.log(" Warning alert displayed...");
		System.out.println("Assert Validation successfull.");
		jsclick(Refresh_Button(driver));
	}

	public void DocumentSendToSecureLink() throws Exception {
		Print pojo = new Print();
		Reporter.log("Scenario 01: Document send to securelink from viewer page");
		Reporter.log("Exapnd the cabinet");
		jsclick(TestCabExpIcon);
		Thread.sleep(3000);
		jsclick(TesttestDrawerExpIcon);
		Reporter.log("Exapnd the drawer");
		Thread.sleep(3000);
		selectElement(VidyaTestFolder);
		Reporter.log("Exapnd the folder");
		Thread.sleep(5000);
		Reporter.log("Open the document");
		jsclick(Document);
		Thread.sleep(5000);
		try {
			if (Lockeddoc.isDisplayed()) {

				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
				jsclick(element1);
			}
		} catch (Exception e) {
			Reporter.log("Locked message displayed", true);
			Thread.sleep(2000);
		}

		Thread.sleep(3000);
		try {

			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("No Alert is present");
		}
		Thread.sleep(3000);
		jsclick(CheckBox);
		Reporter.log("Select a page check box in thubmnail view");
		jsclick(SendToIcon);
		Reporter.log("Click on sendTo tool button");
		Thread.sleep(3000);
		jsclick(secureLink);
		Reporter.log("Select secure link option");
		Thread.sleep(3000);
		sendvalue(secureLinkReceipientMail, readFromExMail(2, 0));
		Reporter.log("Enter the valid mail into securelink email textbox");
		Thread.sleep(2000);
		sendvalue(secureLinkConfirmMail, readFromExMail(2, 0));
		Reporter.log("Enter the valid mail into securelink confirm textbox");
		jsclick(secureLinkModifyCheckBox);
		Thread.sleep(2000);
		Reporter.log("Click the modify check box");
		jsclick(secureLinkOKBTN);
		Reporter.log("Click on securelink dialog ok button");
		Thread.sleep(5000);
		sendvalue(secLinkReceipientMailAgain, readFromExMail(2, 0));
		Reporter.log("Enter receipient mail again");
		Thread.sleep(2000);
		sendvalue(secLinkConfirmtMailAgain, readFromExMail(2, 0));
		Reporter.log("Enter receipient mail in confirm textbox");
		Thread.sleep(2000);
		jsclick(secureLinkOKBTNsecond);
		Thread.sleep(5000);
		Reporter.log("Secure link Mail has sent successfully...");
		Reporter.log(
				"Sending secure link mail from viewer page,select the document from page List the Selected Page was sent Successfully...Mail has received.");
	}

	public void SentDocumentToView() throws Exception {
		Print pojo = new Print();
		driver.get(
				"http://10.4.10.21:8080/CVWeb/secureLinkLogin?serverName=TestServer_2024B264bit&roomName=CV2024B2_64bitDB&documentId=19871");
		Thread.sleep(3000);
		Reporter.log("Open securelink mail ", true);
		secLinkUserName.sendKeys("nisha.rahamah@computhink.in");
		Thread.sleep(3000);
		Reporter.log("Enter user email", true);
		secLinkUserPwrd.sendKeys("72d2371fc8");
		Thread.sleep(3000);
		Reporter.log("Enter valid password", true);
		jsclick(secLinkLogin);
		Thread.sleep(15000);
		Reporter.log("Click on login button", true);
		try {
			if (Lockeddoc.isDisplayed()) {
				WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
				jsclick(element1);
			}
			Reporter.log("Open securelink mail ", true);

		} catch (Exception e) {
			Reporter.log("Locked message displayed", true);
			Thread.sleep(2000);
		}

		Thread.sleep(4000);
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.println("NoAlertPresent");
		}
		Reporter.log("Securelink file verified successfully...", true);
	}

	public void SecureLinkFromDocumentList() throws Exception {
		Reporter.log("Scenario 02: Document send to securelink from Document page");
		Print pojo = new Print();
		movingElement(RecentTab);
		Reporter.log("Click on recent folder tab");
		Thread.sleep(3000);
		ElementToBeClickable(RecentFolder);
		Reporter.log("Open the recent folder");
		jsclick(RecentFolder);

		Thread.sleep(5000);
		Reporter.log("Click on document page check box");
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"documentListTable\"]/tbody/tr[7]/td[1]"));
		checkbox.click();
		WebElement doc = driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[1]/ul/li[5]"));
		movingElement(doc);
		Reporter.log("Mouse hover on document tab");
		jsclick(secureLinkFromDocTab);
		Thread.sleep(3000);
		jsclick(sendToDocTab);
		Reporter.log("Click sendto submenu securelink option");
		Thread.sleep(3000);
		ElementToBeClickable(secureLinkReceipientMail);
		sendvalue(secureLinkReceipientMail, readFromExMail(2, 0));
		Reporter.log("Enter the valid email id");
		Thread.sleep(2000);
		sendvalue(secureLinkConfirmMail, readFromExMail(2, 0));
		Reporter.log("Enter the mail id in confirm mail textbox");
		jsclick(secureLinkModifyCheckBox);
		Thread.sleep(2000);
		Reporter.log("Click on modify check box");
		jsclick(secureLinkOKBTN);
		Thread.sleep(5000);
		Reporter.log("Click on securelink dialog OK button");
		sendvalue(secLinkReceipientMailAgain, readFromExMail(2, 0));
		Reporter.log("Enter receipient mail ");
		Thread.sleep(2000);
		sendvalue(secLinkConfirmtMailAgain, readFromExMail(2, 0));
		Thread.sleep(2000);
		Reporter.log("Enter confirm  mail ");
		jsclick(secureLinkOKBTNsecond);
		Thread.sleep(5000);
		Reporter.log("User click on Securelink dialog OK button");
		jsclick(Refresh_Button(driver));
		Reporter.log("Secure link sent successfully...");
		Reporter.log(
				"Sending secure link mail from document tab,select the document from Document List the Selected document was sent Successfully...Mail has received.");
	}

	@FindBy(xpath = ("//a[@id='advSearchMenuBtn']"))
	private WebElement SearchTab;

	@FindBy(xpath = ("//button[@id='advFindBtnLabel']"))
	private WebElement FindButton;

	public void SecureLinkFromSearchTab() throws Exception {
		SearchFunction sr = new SearchFunction();
		Reporter.log("Scenario 03: Document send to securelink from Search list page");
		Thread.sleep(6000);
		Reporter.log("Click on search tab");
		jsclick(SearchTab);
		Thread.sleep(5000);
		Reporter.log("Click on find button");
		jsclick(FindButton);
		Thread.sleep(10000);
		WebElement checkbox = driver.findElement(By.xpath("(//span[@class='checkmark'])[4]"));
		jsclick(checkbox);
		Reporter.log("Click on document page check box");
		WebElement doc = driver.findElement(By.xpath("//*[@id=\"pageheader\"]/div[1]/ul/li[5]"));
		movingElement(doc);
		Reporter.log("Mouse hover on document tab");

		jsclick(secureLinkFromDocTab);
		Reporter.log("Click on sendto submenu");
		jsclick(sendToDocTab);
		Thread.sleep(3000);
		Reporter.log("Click on securelink option");
		sendvalue(secureLinkReceipientMail, readFromExMail(1, 0));
		Thread.sleep(2000);
		Reporter.log("Enter valid email");
		sendvalue(secureLinkConfirmMail, readFromExMail(1, 0));
		jsclick(secureLinkModifyCheckBox);
		Reporter.log("Enter valid email id on confirm mail text box");
		Thread.sleep(2000);
		jsclick(secureLinkOKBTN);
		Reporter.log("Click on secure link ok button");
		Thread.sleep(5000);
		sendvalue(secLinkReceipientMailAgain, readFromExMail(1, 0));
		Reporter.log("Enter receipient mail ");
		Thread.sleep(2000);
		sendvalue(secLinkConfirmtMailAgain, readFromExMail(1, 0));
		Thread.sleep(2000);
		Reporter.log("Confirm the receipient mail ");
		jsclick(secureLinkOKBTNsecond);
		Thread.sleep(5000);
		Reporter.log("Click on securelink dialog OK button");
		Reporter.log("Securelink sent successfully...");
		Reporter.log(
				"Searching the document and select the document from searchList the selected document was Sent Successfully...Mail has received.");
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
	}

}
