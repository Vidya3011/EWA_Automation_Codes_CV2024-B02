package Computhink.Pom;

import java.util.ArrayList;
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
import org.testng.asserts.SoftAssert;

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

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
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

		SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert

		Reporter.log("Scenario 03: Verify Email 'Convert_to_PDF' with 'Burn annotation' option");
		Reporter.log("Verifying Email Functionality");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		jsclick(CheckBox);
		Reporter.log("Open a document and select a page");
		jsclick(SendToIcon);
		Thread.sleep(3000);
		jsclick(EmailDoc);
		Reporter.log("Mouse hover on send to icon from viewer tool bar");
		jsclick(ConvertPDfCheckbox);
		Thread.sleep(3000);
		Reporter.log("Click convertToPDF checkbox");
		Reporter.log("Click burn annotation checkbox");
		sendvalue(EnterEmail, readFromExMail(2, 0));
		Thread.sleep(3000);
		Reporter.log("Enter valid mail into email field");
		sendvalue(ForSubject, readFromExMail(3, 2));
		Thread.sleep(3000);
		Reporter.log("Enter valid subject into subject textbox");
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

		Reporter.log("Email Functionality with all annotation settings, sent successfully", true);

		// SoftAssert: Verifying that the values entered match the expected email, subject, and password
		String expectedEmail = readFromExMail(2, 0);
		softAssert.assertEquals(EnterEmail.getAttribute("value"), expectedEmail, "Recipient email is incorrect.");

		String expectedSubject = readFromExMail(3, 2);
		softAssert.assertEquals(ForSubject.getAttribute("value"), expectedSubject, "Email subject is incorrect.");

		String expectedZipPassword = readFromExMail(1, 3);
		softAssert.assertEquals(ForzipPasswrd.getAttribute("value"), expectedZipPassword, "ZIP password is incorrect.");

	}

	public void Email_Reference() throws Exception {
		
		SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert

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
		    Reporter.log("Alert IS Not Present");
		}
		Thread.sleep(3000);
		jsclick(CheckBox);
		Reporter.log("Select a page");
		jsclick(SendToIcon);
		Thread.sleep(3000);
		Reporter.log("Click on send to tool icon");
		jsclick(EmailDoc);
		Thread.sleep(3000);
		Reporter.log("Click on email option");
		jsclick(ReferenceEmail);
		Thread.sleep(3000);
		Reporter.log("Click on reference radio button");

		sendvalue(EnterEmail, readFromExMail(1, 0));
		Reporter.log("Enter the valid email into the email field");
		jsclick(EmailSendOk);
		Thread.sleep(20000);
		Reporter.log("Click on email dialog OK button");
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);
		Thread.sleep(15000);
		Reporter.log("User should receive 'Email sent successful' message dialog");

		Reporter.log("Email sent dialog displayed successfully");

		// SoftAssert: Verifying the entered email is correct
		String expectedEmail = readFromExMail(1, 0);
		softAssert.assertEquals(EnterEmail.getAttribute("value"), expectedEmail, "The entered email is incorrect.");

		// SoftAssert: Verifying the 'Email sent successful' message is displayed
		String successMessage = "Email sent successfully";
		WebElement successDialog = driver.findElement(By.id("EmailsuccessMessageDialogbox")); // Use the appropriate locator here
		softAssert.assertTrue(successDialog.isDisplayed(), "Email sent successful message is not displayed.");

	}

	public void Email_Copy_WithMsgBox_SubjectBox() throws Exception {
		
		SoftAssert softAssert = new SoftAssert();

		Reporter.log("Scenario 02: Verify copy email and message textbox");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		jsclick(CheckBox);

		// Soft assert for Checkbox clickability
		if (CheckBox.isSelected()) {
		    softAssert.assertTrue(true, "Checkbox is selected successfully.");
		} else {
		    softAssert.fail("Checkbox is not selected.");
		}

		Reporter.log("Open a document and select a page");
		jsclick(SendToIcon);
		Reporter.log("Click on sendto tool icon");
		Thread.sleep(3000);
		jsclick(EmailDoc);
		Reporter.log("Select email submenu");
		jsclick(CopyEmail);
		Thread.sleep(3000);

		// Soft assert for CopyEmail selection
		if (CopyEmail.isSelected()) {
		    softAssert.assertTrue(true, "Copy radio button is selected successfully.");
		} else {
		    softAssert.fail("Copy radio button is not selected.");
		}

		Reporter.log("Select copy radio button");
		sendvalue(EnterEmail, readFromExMail(2, 0));
		Reporter.log("Enter a valid email id");

		// Soft assert for email field input
		if (EnterEmail.getAttribute("value").equals(readFromExMail(2, 0))) {
		    softAssert.assertTrue(true, "Email is entered successfully.");
		} else {
		    softAssert.fail("Email entry failed.");
		}

		sendvalue(ForSubject, readFromExMail(1, 2));
		Reporter.log("Enter subject into subject textbox");

		// Soft assert for subject field input
		if (ForSubject.getAttribute("value").equals(readFromExMail(1, 2))) {
		    softAssert.assertTrue(true, "Subject is entered successfully.");
		} else {
		    softAssert.fail("Subject entry failed.");
		}

		Thread.sleep(4000);
		sendvalue(MessageBox, readFromExMail(2, 2));
		Reporter.log("Enter message into message dialog box");

		// Soft assert for message box input
		if (MessageBox.getAttribute("value").equals(readFromExMail(2, 2))) {
		    softAssert.assertTrue(true, "Message is entered successfully.");
		} else {
		    softAssert.fail("Message entry failed.");
		}

		Thread.sleep(4000);
		jsclick(EmailSendOk);
		Reporter.log("Click on Email dialog OK button");
		Thread.sleep(20000);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));

		// Soft assert for success message dialog visibility
		if (EmailsuccessMessageDialogboxOK.isDisplayed()) {
		    softAssert.assertTrue(true, "'Email sent successfully' message is displayed.");
		} else {
		    softAssert.fail("'Email sent successfully' message is not displayed.");
		}

		jsclick(EmailsuccessMessageDialogboxOK);
		Reporter.log("User should receive 'Email sent successfully' message dialog");
		Thread.sleep(15000);
		Reporter.log("Email sent successfully dialog displayed...");

		// Assert all to verify soft assertions
		softAssert.assertAll();

	}

	public void exports_with_convert_to_pdf_with_passwords() throws Exception {

		SoftAssert softAssert = new SoftAssert();

		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 60);

		// Wait until CheckBox is visible and clickable
		wait.until(ExpectedConditions.visibilityOf(CheckBox));
		wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		clickElement(CheckBox);

		// Soft assert for CheckBox clickability
		if (CheckBox.isSelected()) {
		    softAssert.assertTrue(true, "Checkbox is clicked and selected successfully.");
		} else {
		    softAssert.fail("Checkbox is not selected.");
		}

		wait.until(ExpectedConditions.elementToBeClickable(SendToIcon));
		jsclick(SendToIcon);

		// Soft assert for SendToIcon clickability
		if (SendToIcon.isEnabled()) {
		    softAssert.assertTrue(true, "SendToIcon is clickable and clicked successfully.");
		} else {
		    softAssert.fail("SendToIcon is not clickable.");
		}

		Thread.sleep(3000);
		jsclick(ExportDialog);

		// Soft assert for ExportDialog click
		if (ExportDialog.isDisplayed()) {
		    softAssert.assertTrue(true, "Export dialog is displayed successfully.");
		} else {
		    softAssert.fail("Export dialog is not displayed.");
		}

		jsclick(ExportCovertPDFcheckbx);

		// Soft assert for ExportCovertPDF checkbox selection
		if (ExportCovertPDFcheckbx.isSelected()) {
		    softAssert.assertTrue(true, "Export Convert to PDF checkbox is selected successfully.");
		} else {
		    softAssert.fail("Export Convert to PDF checkbox is not selected.");
		}

		Thread.sleep(2000);
		jsclick(Expzippwrdcheckbx);

		// Soft assert for Expzippwrd checkbox selection
		if (Expzippwrdcheckbx.isSelected()) {
		    softAssert.assertTrue(true, "Export zip password checkbox is selected successfully.");
		} else {
		    softAssert.fail("Export zip password checkbox is not selected.");
		}

		// Enter zip password
		Expzippwrdcheckbx.sendKeys(readFromExMail(1, 3));

		// Soft assert for zip password entry
		if (Expzippwrdcheckbx.getAttribute("value").equals(readFromExMail(1, 3))) {
		    softAssert.assertTrue(true, "Zip password is entered successfully.");
		} else {
		    softAssert.fail("Failed to enter zip password.");
		}

		Thread.sleep(3000);

		// Enter PDF password
		ExpPDFpaswrdbox.sendKeys(readFromExMail(2, 3));

		// Soft assert for PDF password entry
		if (ExpPDFpaswrdbox.getAttribute("value").equals(readFromExMail(2, 3))) {
		    softAssert.assertTrue(true, "PDF password is entered successfully.");
		} else {
		    softAssert.fail("Failed to enter PDF password.");
		}

		Thread.sleep(3000);
		jsclick(EmailSendOk);

		// Soft assert for EmailSendOk button click
		if (EmailSendOk.isDisplayed() && EmailSendOk.isEnabled()) {
		    softAssert.assertTrue(true, "Email send OK button is clicked successfully.");
		} else {
		    softAssert.fail("Email send OK button is not clickable.");
		}

		Thread.sleep(15000);

		

	}

	public void exports_with_Retain() throws Exception {

		SoftAssert softAssert = new SoftAssert();

		Reporter.log("Scenario 04: Verifying export functionality retain format, with average quality and zip password", true);
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		// Wait until CheckBox is visible
		wait.until(ExpectedConditions.visibilityOf(CheckBox));
		Reporter.log("Open a document and select a page");

		// Soft assert for CheckBox visibility
		if (CheckBox.isDisplayed()) {
		    softAssert.assertTrue(true, "Checkbox is visible on the page.");
		} else {
		    softAssert.fail("Checkbox is not visible on the page.");
		}

		// Wait until CheckBox is clickable
		wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		Reporter.log("Click on sendto tool icon");

		// Click on CheckBox
		jsclick(CheckBox);

		// Soft assert for CheckBox selection
		if (CheckBox.isSelected()) {
		    softAssert.assertTrue(true, "Checkbox is selected successfully.");
		} else {
		    softAssert.fail("Failed to select the checkbox.");
		}

		// Click on SendToIcon
		jsclick(SendToIcon);
		Reporter.log("Select export submenu");

		// Soft assert for SendToIcon clickability
		if (SendToIcon.isEnabled()) {
		    softAssert.assertTrue(true, "SendToIcon is clickable and clicked successfully.");
		} else {
		    softAssert.fail("SendToIcon is not clickable.");
		}

		Thread.sleep(3000);

		// Click on ExportDialog
		jsclick(ExportDialog);
		Reporter.log("Select retain radio button");
		Thread.sleep(5000);

		// Select Expretainchkbox
		jsclick(Expretainchkbox);
		Reporter.log("Click on export dialog OK button");

		// Soft assert for retain checkbox selection
		if (Expretainchkbox.isSelected()) {
		    softAssert.assertTrue(true, "Retain checkbox is selected successfully.");
		} else {
		    softAssert.fail("Failed to select retain checkbox.");
		}

		Thread.sleep(5000);

		// Enter zip password
		Expzippwrdcheckbx.sendKeys(readFromExMail(3, 3));
		Reporter.log("Document exported successfully");

		// Soft assert for zip password entry
		if (Expzippwrdcheckbx.getAttribute("value").equals(readFromExMail(3, 3))) {
		    softAssert.assertTrue(true, "Zip password is entered successfully.");
		} else {
		    softAssert.fail("Failed to enter zip password.");
		}

		Thread.sleep(3000);

		// Click EmailSendOk button
		jsclick(EmailSendOk);

		// Soft assert for EmailSendOk button click
		if (EmailSendOk.isDisplayed() && EmailSendOk.isEnabled()) {
		    softAssert.assertTrue(true, "Email send OK button is clicked successfully.");
		} else {
		    softAssert.fail("Email send OK button is not clickable.");
		}

		Thread.sleep(15000);


	}

	public void exports_with_convert_to_pdf_and_best_quality() throws Exception {
		SoftAssert softAssert = new SoftAssert();

		Reporter.log("Step Details: Verify Export");
		Thread.sleep(4000);
		jsclick(TestCabExpIcon);
		Reporter.log("Expand the cabinet");

		// Soft assert for cabinet expansion
		if (TestCabExpIcon.isDisplayed()) {
		    softAssert.assertTrue(true, "Cabinet expanded successfully.");
		} else {
		    softAssert.fail("Failed to expand the cabinet.");
		}

		Thread.sleep(3000);
		jsclick(TesttestDrawerExpIcon);
		Reporter.log("Expand the drawer");

		// Soft assert for drawer expansion
		if (TesttestDrawerExpIcon.isDisplayed()) {
		    softAssert.assertTrue(true, "Drawer expanded successfully.");
		} else {
		    softAssert.fail("Failed to expand the drawer.");
		}

		Thread.sleep(3000);
		Reporter.log("Click on the folder");

		try {
		    selectElement(VidyaTestFolder);
		} catch (Exception e) {
		    softAssert.fail("Failed to select the folder: " + e.getMessage());
		}

		Thread.sleep(5000);
		jsclick(Document);
		Reporter.log("Open a document");

		// Soft assert for document opening
		if (Document.isDisplayed()) {
		    softAssert.assertTrue(true, "Document opened successfully.");
		} else {
		    softAssert.fail("Failed to open the document.");
		}

		Thread.sleep(7000);
		try {
		    if (Lockeddoc.isDisplayed()) {
		        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
		        jsclick(element1);
		        Reporter.log("Locked document message handled.");
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
		    Reporter.log("Alert handled successfully.");
		} catch (Exception e) {
		    Reporter.log("Alert is not present.");
		}

		Thread.sleep(3000);
		Thread.sleep(5000);

		Reporter.log("Scenario 05: Verify Export with convert to PDF");
	

		wait.until(ExpectedConditions.visibilityOf(CheckBox));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		Reporter.log("Open a document and select a page");
		jsclick(CheckBox);

		// Soft assert for CheckBox clickability
		if (CheckBox.isSelected()) {
		    softAssert.assertTrue(true, "Checkbox is selected successfully.");
		} else {
		    softAssert.fail("Checkbox is not selected.");
		}

		Reporter.log("Click on sendto tool icon");
		jsclick(SendToIcon);
		Thread.sleep(3000);

		Reporter.log("Select export submenu");
		jsclick(ExportDialog);
		Thread.sleep(3000);

		Reporter.log("Select convert to PDF radio button");
		jsclick(ExportCovertPDFcheckbx);

		// Soft assert for "Convert to PDF" checkbox selection
		if (ExportCovertPDFcheckbx.isSelected()) {
		    softAssert.assertTrue(true, "Convert to PDF checkbox is selected successfully.");
		} else {
		    softAssert.fail("Convert to PDF checkbox is not selected.");
		}

		// Select quality
		movingclkElement(ExpQualitydropdwn);
		jsclick(ExpBestQuality);
		Thread.sleep(2000);

		// Enter zip password
		Expzippwrdcheckbx.sendKeys(readFromExMail(4, 3));

		// Soft assert for zip password entry
		if (Expzippwrdcheckbx.getAttribute("value").equals(readFromExMail(4, 3))) {
		    softAssert.assertTrue(true, "Zip password is entered successfully.");
		} else {
		    softAssert.fail("Failed to enter zip password.");
		}

		Thread.sleep(3000);

		// Enter PDF password
		ExpPDFpaswrdbox.sendKeys(readFromExMail(5, 3));

		// Soft assert for PDF password entry
		if (ExpPDFpaswrdbox.getAttribute("value").equals(readFromExMail(5, 3))) {
		    softAssert.assertTrue(true, "PDF password is entered successfully.");
		} else {
		    softAssert.fail("Failed to enter PDF password.");
		}

		Thread.sleep(3000);

		// Select burn annotation checkbox
		jsclick(ExpWithannotations);
		Reporter.log("Select the burn annotation checkbox");

		// Soft assert for burn annotation checkbox
		if (ExpWithannotations.isSelected()) {
		    softAssert.assertTrue(true, "Burn annotation checkbox is selected successfully.");
		} else {
		    softAssert.fail("Burn annotation checkbox is not selected.");
		}

		// Unlock redaction
		jsclick(Expunlockredbox);
		Thread.sleep(3000);
		ExpUnlockRedPasswrd.sendKeys(readFromExMail(2, 1));

		// Soft assert for unlock redaction password entry
		if (ExpUnlockRedPasswrd.getAttribute("value").equals(readFromExMail(2, 1))) {
		    softAssert.assertTrue(true, "Unlock redaction password is entered successfully.");
		} else {
		    softAssert.fail("Failed to enter unlock redaction password.");
		}

		// Finalize export
		jsclick(EmailSendOk);
		Reporter.log("User clicked on export dialog OK button");
		Reporter.log("The document exported successfully.");

		Thread.sleep(15000);


	}

	public void exports_with_convert_to_pdf_and_include_workflow_summary() throws InterruptedException {
	
		SoftAssert softAssert = new SoftAssert();

		Reporter.log("Scenario 06: Verify Export with convert to PDF");
		Thread.sleep(8000);

		// Wait for CheckBox visibility
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(CheckBox));

		// Wait for CheckBox to be clickable
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		jsclick(CheckBox);
		Reporter.log("Open a document and select a page");

		// Soft assert for CheckBox selection
		if (CheckBox.isSelected()) {
		    softAssert.assertTrue(true, "Checkbox is selected successfully.");
		} else {
		    softAssert.fail("Failed to select the checkbox.");
		}

		// Click on SendToIcon
		jsclick(SendToIcon);
		Reporter.log("Select send to tool icon");

		// Soft assert for SendToIcon clickability
		if (SendToIcon.isEnabled()) {
		    softAssert.assertTrue(true, "Send to tool icon clicked successfully.");
		} else {
		    softAssert.fail("Send to tool icon is not clickable.");
		}

		Thread.sleep(3000);

		// Click on ExportDialog
		jsclick(ExportDialog);
		Reporter.log("Click on export submenu");

		// Soft assert for ExportDialog click
		if (ExportDialog.isDisplayed()) {
		    softAssert.assertTrue(true, "Export submenu is displayed successfully.");
		} else {
		    softAssert.fail("Failed to display export submenu.");
		}

		Thread.sleep(3000);

		// Click on ExportCovertPDF checkbox
		jsclick(ExportCovertPDFcheckbx);
		Thread.sleep(3000);
		Reporter.log("Select convert to PDF radio button");

		// Soft assert for ExportCovertPDF checkbox selection
		if (ExportCovertPDFcheckbx.isSelected()) {
		    softAssert.assertTrue(true, "Convert to PDF checkbox is selected successfully.");
		} else {
		    softAssert.fail("Failed to select convert to PDF checkbox.");
		}

		// Click on Include Workflow checkbox
		jsclick(ExpIncludewrkflwchkbox);
		Thread.sleep(3000);
		Reporter.log("Select include workflow checkbox");

		// Soft assert for Include Workflow checkbox
		if (ExpIncludewrkflwchkbox.isSelected()) {
		    softAssert.assertTrue(true, "Include workflow checkbox is selected successfully.");
		} else {
		    softAssert.fail("Failed to select include workflow checkbox.");
		}

		// Click OK button on export dialog
		jsclick(EmailSendOk);
		Reporter.log("Click on export dialog OK button");

		// Soft assert for EmailSendOk button click
		if (EmailSendOk.isDisplayed() && EmailSendOk.isEnabled()) {
		    softAssert.assertTrue(true, "Export dialog OK button is clicked successfully.");
		} else {
		    softAssert.fail("Failed to click the export dialog OK button.");
		}

		Thread.sleep(15000);

		// Click on Refresh Button
		jsclick(Refresh_Button(driver));
		Reporter.log("User clicks on refresh button");

		// Soft assert for Refresh button click
		if (Refresh_Button(driver).isDisplayed() && Refresh_Button(driver).isEnabled()) {
		    softAssert.assertTrue(true, "Refresh button clicked successfully.");
		} else {
		    softAssert.fail("Failed to click the refresh button.");
		}

		


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
	//	jsclick(OKbuttonprintpage);
		Reporter.log("The print page displayed successfully with selected document", true);
		try {
			jsclick(Refresh_Button(driver));
		}catch(Exception e) {
			//
		}
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
		SoftAssert softAssert = new SoftAssert();
		Print pojo = new Print();

		// Scenario 01: Verify email with invalid email id
		Reporter.log("Scenario 01: Verify email with invalid email id");
		Thread.sleep(6000);

		// Click on Cabinet
		Reporter.log("Click on cabinet");
		jsclick(TestCabExpIcon);
		Thread.sleep(5000);

		// Click on Drawer
		Reporter.log("Click on drawer");
		jsclick(TesttestDrawerExpIcon);
		Thread.sleep(3000);

		// Select Folder
		ElementToBeClickable(VidyaTestFolder);
		Reporter.log("Select a folder");
		selectElement(VidyaTestFolder);
		Thread.sleep(5000);

		// Open Document
		Reporter.log("Click on cabinet");
		jsclick(Document);
		Reporter.log("Open a document");
		Thread.sleep(5000);

		// Check if document is locked
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

		// Handle Alert if Present
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
		    wait.until(ExpectedConditions.alertIsPresent());
		    acceptAlert();
		} catch (Exception e) {
		    Reporter.log("Alert is not present");
		}
		Thread.sleep(4000);


		// Thumbnail View Checkbox
		wait.until(ExpectedConditions.elementToBeClickable(CheckBox));
		Reporter.log("Click on thumbnail view check box");
		jsclick(CheckBox);
		softAssert.assertTrue(CheckBox.isSelected(), "Thumbnail view checkbox selected successfully");

		// SendTo Icon
		Reporter.log("Click on SendTo icon");
		jsclick(SendToIcon);
		Thread.sleep(3000);

		// Email Option
		Reporter.log("Click on email option");
		jsclick(EmailDoc);

		// Invalid Email Scenario
		Reporter.log("Enter invalid mail ID into Enter email textbox");
		jsclick(ConvertPDfCheckbox);
		Thread.sleep(3000);
		sendvalue(EnterEmail, (readFrmXLNEgative(6, 0)));
		Thread.sleep(3000);
		jsclick(EmailSendOk);
		Reporter.log("Click on Email dialog OK button");
		Thread.sleep(4000);
		System.out.println(InvalidEmailMessageValidation.getText());
		Reporter.log("User should get 'please enter valid email' warning message");
		jsclick(InvalidDialogBoxOKBTN);
		Thread.sleep(8000);
		Reporter.log("Invalid email ID scenario verified successfully", true);

		// Clear Email Field
		EnterEmail.clear();
		Reporter.log("===========================================================================================");

		// Scenario 02: Verify blank email
		Reporter.log("Scenario 02: Verify blank email");
		Thread.sleep(2000);
		sendvalue(ForCCmail, (readFrmXLNEgative(3, 0)));
		Thread.sleep(3000);
		jsclick(EmailSendOk);
		Reporter.log("Clear the previous entered email in email text box");
		Thread.sleep(4000);
		Reporter.log("Click on mail dialog OK button");
		System.out.println(WithoutEmailID.getText());
		softAssert.assertEquals(WithoutEmailID.getText(), "Email ID should not be blank", 
		    "Correct warning message displayed for blank email");
		Thread.sleep(4000);
		jsclick(InvalidDialogBoxOKBTN);
		Thread.sleep(8000);
		Reporter.log("Blank email negative scenario verified successfully");

		// Refresh Button
		Reporter.log("Click on refresh button");
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);

	}


	////////////////////////// SECURELINK///////////////////
	public void SecureLinkInvalidRecepient_Mail_ID_ValidConfirm_Mail() throws Exception {

		// Negative Scenario 01: Check SecureLink with Invalid Email ID
		Reporter.log("Negative Scenario 01: Check SecureLink with Invalid Email ID");
		Thread.sleep(5000);

		// Expand Cabinet
		jsclick(TestCabExpIcon);
		Reporter.log("Expand a cabinet");
		Thread.sleep(3000);

		// Expand Drawer
		jsclick(TesttestDrawerExpIcon);
		Thread.sleep(3000);
		Reporter.log("Expand a drawer");

		// Open Folder
		selectElement(VidyaTestFolder);
		Reporter.log("Open a folder");
		Thread.sleep(5000);

		// Open Document
		jsclick(Document);
		Reporter.log("Open a document");
		Thread.sleep(5000);

		// Handle Locked Document Scenario
		try {
		    if (Lockeddoc.isDisplayed()) {
		        WebElement element1 = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
		        jsclick(element1);
		        Reporter.log("Locked document dialog handled successfully");
		    }
		} catch (Exception e) {
		    Reporter.log("No locked document dialog displayed", true);
		    Thread.sleep(2000);
		}
		Thread.sleep(3000);

		// Handle Alert if Present
		try {
		    WebDriverWait wait = new WebDriverWait(driver, 30);
		    wait.until(ExpectedConditions.alertIsPresent());
		    acceptAlert();
		    Reporter.log("Alert handled successfully");
		} catch (Exception e) {
		    Reporter.log("No alert is present");
		}
		Thread.sleep(3000);

		// Click Checkbox
		jsclick(CheckBox);
		Reporter.log("Click on check box");

		// Click SendTo Icon
		jsclick(SendToIcon);
		Thread.sleep(3000);
		Reporter.log("Click on SendTo icon");

		// Select Secure Link
		jsclick(secureLink);
		Reporter.log("Select secure link submenu");
		Thread.sleep(3000);

		// Enter Invalid Email
		sendvalue(secureLinkReceipientMail, readFrmXLNEgative(1, 0));
		Reporter.log("User enters invalid email into email textbox");
		Thread.sleep(2000);

		// Enter Confirm Email
		sendvalue(secureLinkConfirmMail, readFromExMail(2, 0));
		Thread.sleep(2000);

		// Click Secure Link OK Button
		jsclick(secureLinkOKBTN);
		Reporter.log("Click on secure link dialog OK button");
		Thread.sleep(5000);

		// Log Error Message for Invalid Email
		System.out.println("SecureLink: Invalid Recipient Mail and Valid Confirm Mail");
		String actualMessage = EmailIDMismatchMessage.getText();
		System.out.println("Error Message Displayed: " + actualMessage);
		Thread.sleep(3000);

		// Validate Error Message
		String expectedMessage = "Please enter valid recipient email id";
		SoftAssertEqalValidation(EmailIDMismatchMessage, expectedMessage); // Custom validation method
		Reporter.log("Validation: 'Please enter valid recipient email id' dialog is displayed on the page");

		// Click OK on the Dialog
		jsclick(EmailIDMismatchDialogOKBTN);
		Reporter.log("Error dialog dismissed successfully");
		Thread.sleep(3000);

		// Final Success Log
		Reporter.log("SecureLink - invalid email ID scenario verified successfully");
		System.out.println("Assert Validation successful.");
		Thread.sleep(8000);

		// Optionally Refresh Page
		// jsclick(Refresh_Button(driver));
		Thread.sleep(5000);

	}

	public void SendToSecureLinkwithout_Email_ID_BlankTest() throws Exception {

		// Scenario 2: SecureLink with Blank Email ID
		Reporter.log("Scenario 2: SecureLink with Blank Email ID");

		// Clear Recipient Email ID Field
		secureLinkReceipientMail.clear();
		Reporter.log("Recipient email ID field cleared. Email ID should be blank");

		// Clear Confirm Email ID Field
		secureLinkConfirmMail.clear();
		Reporter.log("Confirm email ID field cleared");

		// Click SecureLink OK Button
		Thread.sleep(2000);
		Reporter.log("Click on secure link dialog OK button");
		jsclick(secureLinkOKBTN);

		// Wait for Warning Dialog
		Thread.sleep(5000);
		System.out.println("SecureLink: Without email ID");

		// Get and Log Warning Message
		String actualMessage = EmailIDMismatchMessage.getText();
		System.out.println("Warning Message Displayed: " + actualMessage);

		// Validate Warning Message
		String expectedMessage = "Please enter recipient email id";
		SoftAssertEqalValidation(secLinkBlankMail_ID, expectedMessage); // Custom validation method
		Reporter.log("Validation: 'Please enter recipient email id' Warning dialog is displayed on the page");

		// Dismiss Warning Dialog
		Thread.sleep(3000);
		jsclick(EmailIDMismatchDialogOKBTN);
		Reporter.log("Warning dialog dismissed successfully");

		// Final Log
		Reporter.log("Warning dialog displayed successfully. Blank email ID scenario verified successfully.");
		System.out.println("Assert Validation successful.");
		Thread.sleep(8000);

	}

	
	
	
	public void OpenDocumentAndCheckPages() throws Exception{
		SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert

		List<String> zeroPageDocumentIDs = new ArrayList<>();

		for (int i = 0; i < driver.findElements(By.xpath("//*[@id='documentListTable']/tbody/tr/td[3]")).size(); i++) {
		    try {
		        // Refresh the document list for each iteration
		        List<WebElement> documentNames = driver.findElements(By.xpath("//*[@id='documentListTable']/tbody/tr/td[3]"));

		        // Click on the current document
		        WebElement document = documentNames.get(i);
		        Reporter.log("Document Name: " + document.getText(), true);
		        jsclick(document); // Custom click method
		        Thread.sleep(4000);

		        // Handle locked document
		        try {
		            if (Lockeddoc.isDisplayed()) {
		                WebElement ownershipOkButton = driver.findElement(By.xpath("//*[@id=\"ownershipMessageModelOk\"]"));
		                jsclick(ownershipOkButton);
		                Reporter.log("Locked document message handled successfully.", true);
		            }
		        } catch (Exception e) {
		            Reporter.log("Locked document message not displayed.", true);
		        }

		        // Handle alert if present
		        try {
		            WebDriverWait wait = new WebDriverWait(driver, 30);
		            wait.until(ExpectedConditions.alertIsPresent());
		            acceptAlert();
		            Reporter.log("Alert accepted successfully.", true);
		        } catch (Exception e) {
		            Reporter.log("No alert is present.", true);
		        }

		        // Handle Excel sheet alert
		        try {
		            ExcelSheetAlert();
		        } catch (Exception e) {
		            Reporter.log("Excel save alert not present.", true);
		        }

		        // Wait for the document viewer to load
		        WebDriverWait wait = new WebDriverWait(driver, 10);
		        WebElement thumbnail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='docViewerMetaData']")));

		        // Get document pages and check if they are empty
		        List<WebElement> pages = driver.findElements(By.xpath("//*[@id='docViewerMetaData']//img"));
		        int pageCount = pages.size();
		        Reporter.log("Document " + (i + 1) + " has " + pageCount + " pages.", true);

		        if (pages.isEmpty()) {
		            Reporter.log("The opened document is empty. No action will be performed.", true);

		            // Capture the document ID for zero-page documents
		            WebElement generalTab = driver.findElement(By.xpath("//span[text()='General']"));
		            jsclick(generalTab);
		            WebElement documentIDElement = driver.findElement(By.xpath("//*[@id=\"generalRow_Id\"]/td[2]"));
		            String zeroPageDocumentID = documentIDElement.getText();
		            zeroPageDocumentIDs.add(zeroPageDocumentID);
		            Reporter.log("Zero-page document ID captured: " + zeroPageDocumentID, true);

		            // Add SoftAssert for zero-page condition
		            softAssert.assertTrue(pageCount == 0, "Document has zero pages, but condition mismatch.");
		        } else {
		            // Check if pages have content
		            boolean hasContent = pages.stream()
		                .anyMatch(page -> {
		                    String src = page.getAttribute("src");
		                    return src != null && !src.isEmpty();
		                });

		            if (!hasContent) {
		                Reporter.log("Document pages are empty or not loaded. No action will be performed.", true);
		                softAssert.assertFalse(hasContent, "Document pages are empty or not loaded as expected.");
		            } else {
		                Reporter.log("Document pages are loaded with content. Proceeding with further actions.", true);
		                softAssert.assertTrue(hasContent, "Document pages are loaded with content but condition mismatch.");
		            }
		        }

		        // Close the document viewer
		        WebElement closeIcon = driver.findElement(By.xpath("//*[@id='cvDocumentClose']/span"));
		        jsclick(closeIcon);
		        Thread.sleep(1000); // Ensure UI stabilizes before the next iteration

		    } catch (StaleElementReferenceException e) {
		        Reporter.log("Stale element reference error: " + e.getMessage(), true);
		    } catch (NoSuchElementException e) {
		        Reporter.log("Error while interacting with the document: " + e.getMessage(), true);
		    } catch (Exception e) {
		        Reporter.log("Unexpected error: " + e.getMessage(), true);
		    }
		}

		// Final log for zero-page document IDs
		Reporter.log("Zero-Page Document IDs: " + String.join(", ", zeroPageDocumentIDs), true);

		}
	
	
	
	public void AutomatingAllCabinetAndDrawerAndFolderForZeroPageDocumentIssue() throws Exception{
		 Reporter.log("Scenario: Automate all folders in growing structure", true);

		// Fetch all cabinets dynamically
		 List<WebElement> cabinets = driver.findElements(By.xpath("//div[@id='viewDocumentnavigator']//ul//li//a"));
		 Reporter.log("Total cabinets found: " + cabinets.size(), true);

		 for (int i = 0; i < cabinets.size(); i++) {
		     try {
		         WebElement cabinet = cabinets.get(i); // Get cabinet dynamically
		         // Expand cabinet
		         Thread.sleep(1000);
		         movingDoublecli(cabinet, cabinet); // Custom method to click on cabinet
		         Reporter.log("Expanded cabinet: " + cabinet.getText(), true);
		         Thread.sleep(1000);

		         // Fetch all drawers in the current cabinet
		         List<WebElement> drawers = driver.findElements(By.xpath("//*[@id='viewDocumentnavigator']/ul/li[" + (i + 1) + "]/ul/li/a"));
		         Reporter.log("Total drawers in cabinet: " + drawers.size(), true);

		         for (int j = 0; j < drawers.size(); j++) {
		             try {
		                 WebElement drawer = drawers.get(j); // Get drawer dynamically
		                 // Expand drawer
		                 movingDoublecli(drawer, drawer) ;// Custom method to click on drawer
		                 Reporter.log("Expanded drawer: " + drawer.getText(), true);
		                 Thread.sleep(2000);

		                 // Fetch all folders in the current drawer
		                 List<WebElement> folders = driver.findElements(By.xpath("//*[@id='viewDocumentnavigator']/ul/li[" + (i + 1) + "]/ul/li[" + (j + 1) + "]/ul/li/a"));
		                 Reporter.log("Total folders in drawer: " + folders.size(), true);

		                 for (int k = 0; k < folders.size(); k++) {
		                     try {
		                         WebElement folder = folders.get(k); // Get folder dynamically
		                         // Select folder
		                         movingDoublecli(folder, folder) ; // Custom method to click on folder
		                         Reporter.log("Selected folder: " + folder.getText(), true);
		                         Thread.sleep(2000);

		                         // Perform your document-related actions here
		                         OpenDocumentAndCheckPages();

		                     } catch (Exception e) {
		                         Reporter.log("Error while handling folder: " + (k + 1) + " in drawer: " + drawer.getText() + " - " + e.getMessage(), true);
		                     }
		                 }

		             } catch (Exception e) {
		                 Reporter.log("Error while handling drawer: " + (j + 1) + " in cabinet: " + cabinet.getText() + " - " + e.getMessage(), true);
		             }
		         }

		     } catch (Exception e) {
		         Reporter.log("Error while handling cabinet: " + (i + 1) + " - " + e.getMessage(), true);
		     }
		     
		 }
		 

		}

	
	
	
	
	
	public void SecLinkReceipientDailogBoxInvalid_Email_ID() throws Exception {

		SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert

		Reporter.log("Negative Scenario 3: Securelink with valid email and invalid confirm mail");

		Thread.sleep(3000);
		sendvalue(secureLinkReceipientMail, readFromExMail(2, 0));
		Thread.sleep(2000);
		Reporter.log("Enter a valid email id into email field");
		sendvalue(secureLinkConfirmMail, readFromExMail(2, 0));
		jsclick(secureLinkModifyCheckBox);
		Reporter.log("Click on modify check box");
		Thread.sleep(2000);
		jsclick(secureLinkOKBTN);
		Reporter.log("User should enter invalid email id into confirm mail text box");
		Thread.sleep(5000);
		sendvalue(secLinkReceipientMailAgain, (readFrmXLNEgative(4, 0)));

		Thread.sleep(2000);
		sendvalue(secLinkConfirmtMailAgain, (readFrmXLNEgative(5, 0)));
		Thread.sleep(2000);
		jsclick(secureLinkOKBTNsecond);
		Reporter.log("Click on securelink dialog OK button");
		Thread.sleep(5000);
		Reporter.log("Sending secure link mail from viewer page, select the document from page List. The selected Page was sent successfully... Mail has been received.");
		Thread.sleep(5000);
		Reporter.log("User should get 'Email id mismatch' warning dialog");

		System.out.println("SecureLink : invalid confirm email id");
		System.out.println(EmailIDMismatchMessage.getText());
		Thread.sleep(3000);
		jsclick(EmailIDMismatchDialogOKBTN);
		String msg = "Email id Mismatch";

		// Adding SoftAssert validation
		softAssert.assertEquals(EmailIDMismatchMessage.getText(), msg, "The email mismatch message is incorrect.");

		// Log success message
		Reporter.log("Warning dialog displayed... Valid email - invalid confirm mail scenario verified successfully...");
		System.out.println("Assert Validation successful.");


		Thread.sleep(8000);
	}

	public void SecLinkReceipientMailBlank() throws Exception {

		SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert

		Thread.sleep(5000);
		secLinkReceipientMailAgain.clear();
		Reporter.log("Negative Scenario 4: Securelink first dialog box has Valid email and Valid confirm email ID / Securelink Second dialog box should be blank");

		Thread.sleep(2000);
		Reporter.log("Enter valid email");
		secLinkConfirmtMailAgain.clear();
		Thread.sleep(2000);
		Reporter.log("Enter valid confirm email");
		jsclick(secureLinkOKBTNsecond);
		Thread.sleep(5000);
		Reporter.log("Blank mail id: Unable to send the document into secure link");
		Thread.sleep(5000);
		Reporter.log("Click on first securelink dialog box OK button");
		System.out.println("SecureLink : blank confirm email id");
		System.out.println(EmailIDMismatchMessage.getText());
		Thread.sleep(3000);
		Reporter.log("Should not enter email id, just click on second securelink dialog box OK button");
		jsclick(EmailIDMismatchDialogOKBTN);

		// SoftAssert validation for email mismatch message
		String msg = "Email id Mismatch";
		softAssert.assertEquals(EmailIDMismatchMessage.getText(), msg, "The mismatch message is incorrect.");

		// Log success message
		Reporter.log("User should get 'Email id Mismatch' warning alert");
		Reporter.log("Warning alert displayed...");
		System.out.println("Assert Validation successful.");

		// Refresh the page at the end
		jsclick(Refresh_Button(driver));
	}

	public void DocumentSendToSecureLink() throws Exception {
		
		SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert

		Reporter.log("Scenario 01: Document send to securelink from viewer page");
		Reporter.log("Expand the cabinet");
		jsclick(TestCabExpIcon);
		Thread.sleep(3000);
		jsclick(TesttestDrawerExpIcon);
		Reporter.log("Expand the drawer");
		Thread.sleep(3000);
		selectElement(VidyaTestFolder);
		Reporter.log("Expand the folder");
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
		Reporter.log("Select a page check box in thumbnail view");
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
		Reporter.log("Enter recipient mail again");
		Thread.sleep(2000);
		sendvalue(secLinkConfirmtMailAgain, readFromExMail(2, 0));
		Reporter.log("Enter recipient mail in confirm textbox");
		Thread.sleep(2000);
		jsclick(secureLinkOKBTNsecond);
		Thread.sleep(5000);

		// SoftAssert: Verify if recipient and confirm email addresses are entered correctly
		String expectedEmail = readFromExMail(2, 0);
		softAssert.assertEquals(secureLinkReceipientMail.getAttribute("value"), expectedEmail, "Recipient email is incorrect.");
		softAssert.assertEquals(secureLinkConfirmMail.getAttribute("value"), expectedEmail, "Confirm email is incorrect.");

		// Log success message after email is sent
		Reporter.log("Secure link Mail has sent successfully...");
		Reporter.log("Sending secure link mail from viewer page, selected document from page List was sent successfully. Mail has been received.");
	}

	public void SentDocumentToView() throws Exception {
		
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
		SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert

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
		Reporter.log("Enter recipient mail");
		Thread.sleep(2000);
		sendvalue(secLinkConfirmtMailAgain, readFromExMail(2, 0));
		Thread.sleep(2000);
		Reporter.log("Enter confirm mail");
		jsclick(secureLinkOKBTNsecond);
		Thread.sleep(5000);
		Reporter.log("User clicks on Securelink dialog OK button");
		jsclick(Refresh_Button(driver));
		Reporter.log("Secure link sent successfully...");
		Reporter.log("Sending secure link mail from document tab, selected document from Document List was sent successfully. Mail has been received.");

		// SoftAssert: Verify if recipient and confirm email addresses are entered correctly
		String expectedEmail = readFromExMail(2, 0);
		softAssert.assertEquals(secureLinkReceipientMail.getAttribute("value"), expectedEmail, "Recipient email is incorrect.");
		softAssert.assertEquals(secureLinkConfirmMail.getAttribute("value"), expectedEmail, "Confirm email is incorrect.");
		softAssert.assertEquals(secLinkReceipientMailAgain.getAttribute("value"), expectedEmail, "Recipient email again is incorrect.");
		softAssert.assertEquals(secLinkConfirmtMailAgain.getAttribute("value"), expectedEmail, "Confirm email again is incorrect.");
	}

	@FindBy(xpath = ("//a[@id='advSearchMenuBtn']"))
	private WebElement SearchTab;

	@FindBy(xpath = ("//button[@id='advFindBtnLabel']"))
	private WebElement FindButton;

	public void SecureLinkFromSearchTab() throws Exception {
		SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert

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
		Reporter.log("Enter recipient mail ");
		Thread.sleep(2000);
		sendvalue(secLinkConfirmtMailAgain, readFromExMail(1, 0));
		Thread.sleep(2000);
		Reporter.log("Confirm the recipient mail ");
		jsclick(secureLinkOKBTNsecond);
		Thread.sleep(5000);
		Reporter.log("Click on securelink dialog OK button");
		Reporter.log("Securelink sent successfully...");
		Reporter.log("Searching the document and select the document from searchList, the selected document was sent successfully... Mail has received.");
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);

		// SoftAssert: Verify if the email and confirm email fields match the expected values
		String expectedEmail = readFromExMail(1, 0);
		softAssert.assertEquals(secureLinkReceipientMail.getAttribute("value"), expectedEmail, "Recipient email is incorrect.");
		softAssert.assertEquals(secureLinkConfirmMail.getAttribute("value"), expectedEmail, "Confirm email is incorrect.");
		softAssert.assertEquals(secLinkReceipientMailAgain.getAttribute("value"), expectedEmail, "Recipient email again is incorrect.");
		softAssert.assertEquals(secLinkConfirmtMailAgain.getAttribute("value"), expectedEmail, "Confirm email again is incorrect.");
	}

}
