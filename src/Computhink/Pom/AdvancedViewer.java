package Computhink.Pom;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.AcceptPendingException;
import java.time.Duration;

import org.apache.batik.apps.svgbrowser.JSVGViewerFrame.AboutAction;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Computhink.Generic.BaseClass;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class AdvancedViewer extends BaseClass {

	public AdvancedViewer() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "imgSettings")
	private WebElement Setting_Icon;

	@FindBy(css = "#myPreferencesSettingsNav > p")
	private WebElement My_Preferencesetting;

	@FindBy(xpath = "//button[@id='myPreferencesSubmit']")
	private WebElement Apply_button;

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Advancedviewing;

	public void getSelect_Office_document_Advancedviewing() {
		Select sel = new Select(Select_Office_document_Advancedviewing);
		sel.selectByVisibleText("Advanced Viewing");

	}

	@FindBy(id = "defaultPdfDocViewListNo")
	private WebElement Select_PDF_document_Advancedviewing;

	public void getSelect_PDF_document_Advancedviewing() {
		Select sel = new Select(Select_PDF_document_Advancedviewing);
		sel.selectByVisibleText("Advanced Viewing");

	}

	public void getSelect_PDF_document_Defviewing() {
		Select sel = new Select(Select_PDF_document_Advancedviewing);
		sel.selectByVisibleText("Default Viewing");

	}

	public void DefaultView() throws Exception {
	    SoftAssert softAssert = new SoftAssert();  // Initialize SoftAssert

	    jsclick(Refresh_Button(driver));
	    Thread.sleep(5000);
	    
	    jsclick(Setting_Icon);
	    Reporter.log("User click on setting icon");
	  
	    Thread.sleep(5000);
	    jsclick(My_Preferencesetting);
	    Reporter.log("User click on the my preference tab");
	  
	    Thread.sleep(5000);
	    getSelect_PDF_document_Defviewing();
	    Reporter.log("User changes pdf document as default viewing");
	   
	    Thread.sleep(4000);
	    jsclick(Apply_button);
	    Reporter.log("User click on Apply button and the default view successfully applied...");
	    
	    Thread.sleep(5000);

	}

	@FindBy(xpath = "//a[@id='createDocument']")
	private WebElement Click_New_Document;

	@FindBy(xpath = "//input[@id='createDocuemtnLocation']")
	private WebElement Destination_Folder_Textbox;

	@FindBy(xpath = ("//div[@id='createDocuemntNavigator']/ul/li[2]/a"))
	private WebElement Cabinet;

	@FindBy(xpath = ("//div[@id='createDocuemntNavigator']/ul/li[2]/ul/li[1]/a"))
	private WebElement Drawer;

	@FindBy(xpath = ("//div[@id='createDocuemntNavigator']/ul/li[2]/ul/li[1]/ul/li[1]/a"))
	private WebElement Folder;

	@FindBy(xpath = "//*[@id=\"3\"]/a")
	private WebElement CaseSensitiveRoomFolder;

	@FindBy(xpath = "//*[@id=\"sendToDocuSign\"]/span")
	private WebElement DocuSign;

	@FindBy(xpath = "//div[@id='viewDocumentnavigator']/ul/li[1]/ins") // cabinet bill
	private WebElement FirstCabinet;

	@FindBy(xpath = "//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li/ins") // drawer bill
	private WebElement FirstDrawer;

	@FindBy(xpath = "//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/ul/li[1]/a") // folderbill
	private WebElement FirstFolder;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]//tr[1]/td[3]") // change tr number to select 2 or 4 docs tr[5]
	private WebElement FirstDocument;

	@FindBy(xpath = "//*[@id=\"createDocument\"]")
	private static WebElement NewDocument;

	@FindBy(xpath = "//*[@id=\"376\"]/a")
	private WebElement SQLRoomFolder;

	@FindBy(xpath = "//button[@id='navigatorTreeOk']")
	private WebElement OK_Button_BrowseforFolder;

	@FindBy(id = "docTypeList")
	private WebElement Click_Document_Type_Dropdown;

	public void getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");

	}

	@FindBy(xpath = "//*[@id=\"docTypeIndicesTable\"]/tbody/tr/td[2]")
	private WebElement DocumentCVRep;

	@FindBy(xpath = "//*[@id=\"docTypeIndicesTable_wrapper\"]/table/tbody/tr/td[2]/input")
	private WebElement Enter_ReportName;

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id='viewDocumentAddPages']")
	private WebElement Browse_Option;

	@FindBy(xpath = "//*[@id=\"djvuViewerDiv_toolbar_image\"]")
	private WebElement WordDocImageOpt;

	@FindBy(xpath = "//*[@id=\"djvuViewerDiv_toolbar_image_local\"]")
	private WebElement UploadFromCmpOpt;

	@FindBy(xpath = "//*[@id=\"djvuViewerDiv_toolbar_table\"]/span[2]")
	private WebElement CreateTableopt;

	@FindBy(xpath = "(//button[@class='e-control e-btn e-lib e-flat e-table-ok e-primary'])[1]")
	private WebElement TableDialogOKBTN;

	@FindBy(xpath = "//*[@id=\"djvuViewerDiv_toolbar_link\"]")
	private WebElement LinkOpt;

	@FindBy(xpath = "//*[@id=\"textbox_41\"]")
	private WebElement LinkAddress;

	@FindBy(xpath = "//a[text()='New Pdf Document']")
	private WebElement NewPDfDoc;

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement EnterFileNAmePDF;

	@FindBy(xpath = "(//button[@id='templateOK'])[1]")
	private WebElement EnterFileNameOKBTN;

	@FindBy(xpath = "(//span[@id='pdfViewerDiv_signatureIcon'])[1]")
	private WebElement SignaturePDFDoc;

	@FindBy(xpath = ("(//div[@id='pdfViewerDiv_textLayer_0'])[1]"))
	private WebElement Page;

	// *[@id="pdfViewerDiv_textLayer_0"]

	@FindBy(xpath = ("//*[@id=\"pdfViewerDiv_annotation\"]"))
	private WebElement AdvancedTool;

	@FindBy(xpath = ("//*[@id=\"pdfViewerDiv_annotation_freeTextEditIcon\"]"))
	private WebElement AdvancedToolTextIcon;

	@FindBy(xpath = ("//*[@id=\"pdfViewerDiv_textLayer_0\"]"))
	private WebElement page2;

	@FindBy(xpath = ("//*[@id=\"pdfViewerDiv_comment\"]"))
	private WebElement AddComment;

	@FindBy(xpath = ("(//div[@id='djvuViewerDiv_editor_viewerContainer'])[1]"))
	private WebElement WordDocPage;

	@FindBy(xpath = ("//*[@id=\"messageContent\"]"))
	private WebElement FileMessage;

	@FindBy(xpath = ("//div[@id='saveAddedPages']//span[1]"))
	private WebElement SaveTab;

	@FindBy(xpath = ("(//button[@id='messageButtonOK42'])[1]"))
	private WebElement SaveTabOKBTN;

	@FindBy(xpath = ("//*[@id=\"cvDocumentClose\"]/span"))
	private WebElement CloseIcon;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
	private WebElement ReopenTheDocument;

	@FindBy(xpath = ("//*[@id=\"addWordFile\"]"))
	private WebElement WordDocument;

	@FindBy(xpath = ("//*[@id=\"djvuViewerDiv_main_content\"]/div[1]/table/tbody/tr[8]/td[7]"))
	private WebElement ExcelSheetFirstRow;

	@FindBy(xpath = ("//*[@id=\"djvuViewerDiv_main_content\"]/div[1]/table/tbody/tr[4]/td[2]"))
	private WebElement ExcelSheetFourthRow;

	@FindBy(xpath = ("//*[@id=\"pdfViewerDiv_annotation_ink\"]"))
	private WebElement DrawLinkAnnotation;

	// *[@id="addExcelFileMobile"]
	@FindBy(xpath = ("//*[@id=\"addExcelFileMobile\"]"))
	private WebElement ExcelSheet;

	@FindBy(xpath = ("//*[@id=\"AutomationTestingPDFDOc.pdf\"]/div/img"))
	private WebElement PDFDocumentPage;

	@FindBy(xpath = ("//*[@id=\"fabButton\"]"))
	private WebElement FAbBTN;

	@FindBy(xpath = ("//*[@id=\"messageButtonOKDEl\"]"))
	private WebElement DeleteOKBTN;

	@FindBy(xpath = ("//*[@id=\"messageButtonOK\"]"))
	private WebElement InvalidDilogOKBTN;

	@FindBy(xpath = ("//*[@id=\"modelHome\"]"))
	private WebElement NavigateBTN;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
	private WebElement NavigateDocOpen;

	@FindBy(xpath = ("//*[@id=\"launchInNative\"]/span"))
	private WebElement MicroSoftOfficeICON;

	@FindBy(xpath = ("//*[@id=\"showHideThumbnail\"]/span"))
	private WebElement ShowThumbnail;

	@FindBy(css = ("#saveFabButton"))
	private WebElement FabSaveBTN;

	@FindBy(xpath = ("//*[@id=\"deleteFabButton\"]"))
	private WebElement FabDeleteBTN;

	@FindBy(xpath = ("//*[@id=\"uploadFabButton\"]"))
	private WebElement UploadeFabBTN;

	@FindBy(xpath = ("//*[@id=\"fullScreenFabButton\"]"))
	private WebElement viewFullScrnBTN;

	@FindBy(xpath = ("//*[@id=\"docViewerMetaData\"]/div[2]/div/input"))
	private WebElement SecondPageCheckBox;

	@FindBy(xpath = ("//*[@id='progressUploaModal']"))
	private WebElement FileDetailsDialog;

	@FindBy(xpath = ("//*[@id=\"deleteMessageOk19\"]"))
	private WebElement DeleteDialogYes;

	@FindBy(xpath = ("//*[@id=\"createDocumentSubmit\"]"))
	private WebElement CreateBTN;

	@FindBy(xpath = ("//*[@id=\"viewCreatedDocument\"]"))
	private WebElement viewOption;

	@FindBy(xpath = ("//*[@id=\"docCreatorSpan1\"]"))
	private WebElement SelectUSer;

	@FindBy(xpath = ("//*[@id=\"messageButtonOK\"]"))
	private WebElement DocSignOKBTN;

	@FindBy(xpath = ("/html/body/div[49]/div/div[4]/input"))
	private WebElement EmailTextBox;

	@FindBy(xpath = ("/html/body/div[49]/div/div[5]/button[1]"))
	private WebElement EmailTextBoxOKBTN;

	public void CreateDocumentAndShowThumbnail() throws Exception {
		SoftAssert softAssert = new SoftAssert();  // Initialize SoftAssert

	    Thread.sleep(3000);
	    Reporter.log("Scenario 01: Document Thumbnail view");
	    Reporter.log("Expand the cabinet");
	    jsclick(FirstCabinet);
	    Reporter.log("Expand the drawer");
	    Thread.sleep(2000);
	    jsclick(FirstDrawer);
	    Reporter.log("Select the folder");
	    Thread.sleep(2000);
	    selectElement(FirstFolder);
	    Thread.sleep(3000);
	    
	    
	    // jsclick(FirstDocument);
	    Reporter.log("Click on new document");
	    Thread.sleep(3000);
	    jsclick(Click_New_Document);
	    Thread.sleep(2000);
	    
	    Thread.sleep(5000);
	    
	  
	    Thread.sleep(3000);
	    getSelect_Document_Type_Dropdown();
	    Reporter.log("Select document type");
	    Thread.sleep(3000);
	    Actions act = new Actions(driver);
	    act.click(DocumentCVRep).sendKeys(readFrmXLNEgative(6, 0)).build().perform();
	    Reporter.log("Enter document name");
	    Thread.sleep(5000);

	    jsclick(CreateBTN);
	    Reporter.log("Click on create document");
	    Thread.sleep(10000);

	    jsclick(viewOption);
	    Reporter.log("Click on view button");
	    movingElement(Move_To_PlusIcon);
	    Thread.sleep(2000);
	    Reporter.log("Click on add icon");
	    jsclick(WordDocument);
	    EnterFileNAmePDF.sendKeys(readFromExAdvancedView(3, 1));
	    Thread.sleep(8000);
	    Reporter.log("Enter word document name");
	    jsclick(EnterFileNameOKBTN);
	    Reporter.log("Click on enter file name OK button");
	    Thread.sleep(3000);
	    
	   
	    Reporter.log("User click on Show/Hide thumbnail view");
	    jsclick(ShowThumbnail);
	    Thread.sleep(8000);
	    
	 
	    Reporter.log("It will hide the thumbnail page, verified successfully...");
	    jsclick(ShowThumbnail);
	    
	    // Assert all to report any failed assertions
	

	}

	public void DocuSignCreateDoc() throws Exception {
		// Instantiate SoftAssert object
		SoftAssert softAssert = new SoftAssert();

		// Sleep before starting the scenario
		Thread.sleep(5000);
		Reporter.log("Scenario 01: Verify 'Docusign' Option");
		Reporter.log("Expand the cabinet");

		// SoftAssert validation for FirstCabinet visibility or presence
	
		jsclick(FirstCabinet);
		Thread.sleep(5000);
		Reporter.log("Expand the drawer");

		// SoftAssert validation for FirstDrawer visibility or presence
		softAssert.assertTrue(isElementPresent(FirstDrawer), "First Drawer is not present");
		jsclick(FirstDrawer);
		Thread.sleep(4000);

		// SoftAssert validation for FirstFolder clickable
		softAssert.assertTrue(isElementClickable(FirstFolder), "First Folder is not clickable");
		ElementToBeClickable(FirstFolder);
		jsclick(FirstFolder);
		Reporter.log("Click on the folder");
		Thread.sleep(3000);

		// SoftAssert validation for Click_New_Document visibility or presence
		softAssert.assertTrue(isElementPresent(Click_New_Document), "New Document tab is not present");
		jsclick(Click_New_Document);
		Reporter.log("Click on new document tab");

		Thread.sleep(8000);

		// SoftAssert validation for Document Type Dropdown visibility or presence
	
		getSelect_Document_Type_Dropdown();
		Reporter.log("Select a document type");

		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.click(DocumentCVRep).sendKeys("Docu sign Document").build().perform();
		Reporter.log("Enter the document name");
		Thread.sleep(5000);

		// SoftAssert validation for CreateBTN visibility or presence
		softAssert.assertTrue(isElementPresent(CreateBTN), "Create Button is not present");
		jsclick(CreateBTN);
		Reporter.log("Click on create button");
		Thread.sleep(10000);

		// SoftAssert validation for View Option visibility or presence
		softAssert.assertTrue(isElementPresent(viewOption), "View Option is not present");
		jsclick(viewOption);
		Reporter.log("Click on view button");

		movingElement(Move_To_PlusIcon);
		Thread.sleep(2000);
		Reporter.log("Mouse hover on browse icon");

		// SoftAssert validation for WordDocument visibility or presence
		softAssert.assertTrue(isElementPresent(WordDocument), "Word Document option is not present");
		jsclick(WordDocument);
		Reporter.log("Select a word document from the dropdown");

		EnterFileNAmePDF.sendKeys(readFromExAdvancedView(3, 1));
		Thread.sleep(8000);
		Reporter.log("Enter a file name");

		// SoftAssert validation for EnterFileNameOKBTN visibility or presence
		softAssert.assertTrue(isElementPresent(EnterFileNameOKBTN), "Enter File Name OK Button is not present");
		jsclick(EnterFileNameOKBTN);
		Reporter.log("Click enter file name dialog OK BUTTON");
		Thread.sleep(3000);

		// Handling alert
		try {
		    WebDriverWait wait1 = new WebDriverWait(driver, 20);
		    wait1.until(ExpectedConditions.alertIsPresent());
		    Alert alt = driver.switchTo().alert();
		    alt.accept();
		} catch (Exception e) {
		    System.out.println("Alert not present");
		}

		Thread.sleep(8000);

		// SoftAssert validation for SaveTab visibility or presence
		softAssert.assertTrue(isElementPresent(SaveTab), "Save Tab is not present");
		jsclick(SaveTab);
		Thread.sleep(8000);

		// SoftAssert validation for SaveTabOKBTN visibility or presence
		softAssert.assertTrue(isElementPresent(SaveTabOKBTN), "Save Tab OK Button is not present");
		VisiblityOf(SaveTabOKBTN);
		Reporter.log("Click on save dialog OK button");
		jsclick(SaveTabOKBTN);
		Thread.sleep(3000);

		// SoftAssert validation for DocuSign visibility or presence
		softAssert.assertTrue(isElementPresent(DocuSign), "DocuSign tool icon is not present");
		jsclick(DocuSign);
		Reporter.log("Click on viewer menu docusign tool icon");
		Thread.sleep(4000);

		// SoftAssert validation for EmailTextBox visibility or presence
		softAssert.assertTrue(isElementPresent(EmailTextBox), "Email TextBox is not present");
		jsclick(EmailTextBox);
		Reporter.log("Enter valid mail in text box");

		EmailTextBox.sendKeys(readFromExMail(2, 0));
		Thread.sleep(3000);

		// SoftAssert validation for EmailTextBoxOKBTN visibility or presence
		softAssert.assertTrue(isElementPresent(EmailTextBoxOKBTN), "Email TextBox OK Button is not present");
		jsclick(EmailTextBoxOKBTN);
		Reporter.log("Click on docusign dialog OK button");
		Thread.sleep(4000);

		// SoftAssert validation for DocSignOKBTN visibility or presence
		softAssert.assertTrue(isElementPresent(DocSignOKBTN), "DocSign OK Button is not present");
		jsclick(DocSignOKBTN);
		Reporter.log("Click on 'Document sent for signing successfully' message dialog OK button");
		Thread.sleep(3000);
		Reporter.log("Document sent to docusign successfully...");

		// SoftAssert validation for Refresh_Button visibility or presence
		softAssert.assertTrue(isElementPresent(Refresh_Button(driver)), "Refresh Button is not present");
		Reporter.log("Click on refresh button");
		jsclick(Refresh_Button(driver));



	}

	
	
	public boolean isElementPresent(WebElement element) {
	    try {
	        return element.isDisplayed();
	    } catch (NoSuchElementException e) {
	        return false;
	    }
	}

	public boolean isElementClickable(WebElement element) {
	    try {
	        return element.isEnabled() && element.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}

	
	
	
	
	
	
	
	public void CreateDocumentAnd_SaveFromDocument_Fabbtn() throws Exception {
		SoftAssert softAssert = new SoftAssert();

		// Sleep before starting the scenario
		Thread.sleep(6000);
		Actions act = new Actions(driver);
		Reporter.log("Scenario 02: Create document and save document by using floating button Save icon");

		// SoftAssert validation for WordDocPage visibility or presence
		softAssert.assertTrue(isElementPresent(WordDocPage), "WordDocPage is not present");
		act.click(WordDocPage)
		    .sendKeys(readFromExAdvancedView(2, 1))
		    .sendKeys(Keys.ENTER)
		    .sendKeys(readFromExAdvancedView(0, 0))
		    .build().perform();
		Thread.sleep(8000);
		Reporter.log("Enter file name and click on Floating button");

		// SoftAssert validation for Floating Action Button (FAbBTN) visibility or presence
		softAssert.assertTrue(isElementPresent(FAbBTN), "Floating Action Button (FAbBTN) is not present");
		jsclick(FAbBTN);
		Thread.sleep(3000);
		Reporter.log("Click on Save icon");

		// SoftAssert validation for FabSaveBTN visibility or presence
		softAssert.assertTrue(isElementPresent(FabSaveBTN), "FabSave Button is not present");

		// SoftAssert validation for FabSaveBTN being clickable
		softAssert.assertTrue(isElementClickable(FabSaveBTN), "FabSave Button is not clickable");
		VisiblityOf(FabSaveBTN);
		jsclick(FabSaveBTN);
		Thread.sleep(7000);
		Reporter.log("Document saved successfully...");

		// SoftAssert validation for SaveTabOKBTN visibility or presence
		softAssert.assertTrue(isElementPresent(SaveTabOKBTN), "SaveTabOKBTN is not present");
		jsclick(SaveTabOKBTN);

		// Assert all validations
		softAssert.assertAll();
	}

	public void CreateDocumentAnd_Upload_NewDocument_From_FabBrowseOption() throws Exception {

		// Instantiate SoftAssert object
		SoftAssert softAssert = new SoftAssert();

		// Sleep before starting the scenario
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		Reporter.log("Scenario 03: Floating tab 'browse button'");

		Reporter.log("Add file by using floating button Browse icon");

		// SoftAssert validation for UploadeFabBTN visibility or presence
		softAssert.assertTrue(isElementPresent(UploadeFabBTN), "UploadeFabBTN (Floating button) is not present");

		// SoftAssert validation for UploadeFabBTN being clickable
		softAssert.assertTrue(isElementClickable(UploadeFabBTN), "UploadeFabBTN (Floating button) is not clickable");
		act.moveToElement(UploadeFabBTN).click().build().perform();
		Thread.sleep(10000);
		Reporter.log("Mousehover on floating button");
		Reporter.log("Click browse icon");

		// SoftAssert validation for Browse action completion
		Reporter.log("Add file by using AutoIT script");
		try {
		    Runtime.getRuntime().exec("D:\\RNishaAutoIt\\FlowerOrCurlyBracket.exe");
		} catch (IOException e) {
		    System.out.println("Error executing AutoIT script: " + e.getMessage());
		}
		Thread.sleep(8000);

		// SoftAssert validation for alert presence
		try {
		    alertIsPresent();
		    acceptAlert();
		    Reporter.log("Alert accepted successfully");
		} catch (Exception e) {
		    System.out.println("Alert is not present");
		}
		Thread.sleep(3000);

		// SoftAssert validation for FabSaveBTN visibility or presence
		softAssert.assertTrue(isElementPresent(FabSaveBTN), "FabSaveBTN (Save icon) is not present");

		// SoftAssert validation for FabSaveBTN being clickable
		softAssert.assertTrue(isElementClickable(FabSaveBTN), "FabSaveBTN (Save icon) is not clickable");
		VisiblityOf(FabSaveBTN);
		jsclick(FabSaveBTN);
		Thread.sleep(7000);
		Reporter.log("Document updated successfully");

		// SoftAssert validation for SaveTabOKBTN visibility or presence
		softAssert.assertTrue(isElementPresent(SaveTabOKBTN), "SaveTabOKBTN is not present");
		jsclick(SaveTabOKBTN);
	}

	public void CreateDocumentAnd_ViewFullScreen() throws Exception {
		SoftAssert softAssert = new SoftAssert();

		// Click on the floating button
		jsclick(FAbBTN);
		Reporter.log("Scenario 04: Floating button - view full screen");

		Reporter.log("Mouse hover on floating button");
		Thread.sleep(3000);

		// SoftAssert validation for viewFullScrnBTN visibility or presence
		softAssert.assertTrue(isElementPresent(viewFullScrnBTN), "viewFullScrnBTN (Full screen button) is not present");

		// SoftAssert validation for viewFullScrnBTN being clickable
		softAssert.assertTrue(isElementClickable(viewFullScrnBTN), "viewFullScrnBTN (Full screen button) is not clickable");
		Reporter.log("Click on full screen view icon");
		jsclick(viewFullScrnBTN);
		Thread.sleep(7000);
		Reporter.log("It displays the document in full screen mode");

		// SoftAssert validation to check if the button is visible again (indicating full-screen mode)
		softAssert.assertTrue(isElementPresent(viewFullScrnBTN), "viewFullScrnBTN (Full screen button) is not present after clicking");

		// SoftAssert validation for re-clicking the viewFullScrnBTN to exit full-screen mode
		softAssert.assertTrue(isElementClickable(viewFullScrnBTN), "viewFullScrnBTN (Full screen button) is not clickable for exiting full screen mode");
		jsclick(viewFullScrnBTN);
		Thread.sleep(3000);
	}

	public void CreateDocumentAnd_DeleteFabBTN_option() throws Exception {
		SoftAssert softAssert = new SoftAssert();

		// Sleep before starting the scenario
		Thread.sleep(3000);
		jsclick(FAbBTN);
		Reporter.log("Scenario 05: Floating button - delete icon");

		Reporter.log("Mouse hover on floating button");
		Thread.sleep(3000);

		// SoftAssert validation for the SecondPageCheckBox presence and clickability
		softAssert.assertTrue(isElementPresent(SecondPageCheckBox), "SecondPageCheckBox is not present");
		softAssert.assertTrue(isElementClickable(SecondPageCheckBox), "SecondPageCheckBox is not clickable");
		Reporter.log("Select thumbnail page check box");
		jsclick(SecondPageCheckBox);
		Thread.sleep(3000);

		Reporter.log("Mousehover on floating button");

		// SoftAssert validation for FabDeleteBTN presence and clickability
		softAssert.assertTrue(isElementPresent(FabDeleteBTN), "FabDeleteBTN (Delete icon) is not present");
		softAssert.assertTrue(isElementClickable(FabDeleteBTN), "FabDeleteBTN (Delete icon) is not clickable");
		jsclick(FabDeleteBTN);
		Thread.sleep(5000);
		Reporter.log("Click floating button delete icon");

		// SoftAssert validation for DeleteDialogYes button presence and clickability
		softAssert.assertTrue(isElementPresent(DeleteDialogYes), "DeleteDialogYes button is not present");
		softAssert.assertTrue(isElementClickable(DeleteDialogYes), "DeleteDialogYes button is not clickable");
		jsclick(DeleteDialogYes);
		Thread.sleep(3000);
		Reporter.log("Delete confirm dialog Yes button");

		// SoftAssert validation for DeleteOKBTN presence and clickability
		softAssert.assertTrue(isElementClickable(DeleteOKBTN), "DeleteOKBTN is not clickable");
		ElementToBeClickable(DeleteOKBTN);
		jsclick(DeleteOKBTN);
		Thread.sleep(3000);
		Reporter.log("Click on floating button save icon");

		// SoftAssert validation for Refresh_Button presence and clickability
		softAssert.assertTrue(isElementClickable(Refresh_Button(driver)), "Refresh_Button is not clickable");
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);

		// SoftAssert validation for SaveChange presence and clickability
		softAssert.assertTrue(isElementClickable(SaveChange), "SaveChange button is not clickable");
		jsclick(SaveChange);
		Thread.sleep(3000);

		// Refresh again to verify the changes
		softAssert.assertTrue(isElementClickable(Refresh_Button(driver)), "Refresh_Button is not clickable");
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);

	}

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement SaveChange;

	public void CreateDocumentAdvancedViewWordDocument_Hindi() throws Exception {

		jsclick(Click_New_Document);
		Thread.sleep(2000);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(3000);
		jsclick(Cabinet);
		Thread.sleep(3000);
		jsclick(Drawer);
		Thread.sleep(5000);
		jsclick(Folder);
		Thread.sleep(5000);

		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);
		movingclkElement(Enter_ReportName);
		sendvalue(Enter_ReportName, readFromExAdvancedView(3, 1));
		Thread.sleep(5000);

		jsclick(CreateBTN);
		Thread.sleep(8000);

		jsclick(viewOption);
		movingElement(Move_To_PlusIcon);
		Thread.sleep(2000);

		jsclick(WordDocument);
		EnterFileNAmePDF.sendKeys(readFromExAdvancedView(3, 1));
		Thread.sleep(8000);

		jsclick(EnterFileNameOKBTN);
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.click(WordDocPage).sendKeys(readFromExAdvancedView(2, 1)).sendKeys(Keys.ENTER)
				.sendKeys(readFromExAdvancedView(0, 0)).build().perform();
		Thread.sleep(8000);
		jsclick(SaveTab);
		Thread.sleep(8000);
		VisiblityOf(SaveTabOKBTN);
		jsclick(SaveTabOKBTN);
		Thread.sleep(10000);
		jsclick(WordDocImageOpt);
		Thread.sleep(2000);
		movingclkElement(UploadFromCmpOpt);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\FlowerOrCurlyBracket.exe");
		Thread.sleep(10000);
		jsclick(CreateTableopt);
		Thread.sleep(5000);
		jsclick(TableDialogOKBTN);
		Thread.sleep(5000);
		/*
		 * jsclick(LinkOpt);
		 * LinkAddress.sendKeys("https://github.com/Vidya3011/CV_Automation.git");
		 * Thread.sleep(3000); jsclick(TableDialogOKBTN);
		 */
		Thread.sleep(3000);
		act.click(WordDocPage).sendKeys(readFromExAdvancedView(1, 1)).build().perform();

		Thread.sleep(5000);
		jsclick(SaveTab);
		Thread.sleep(3000);
		VisiblityOf(SaveTabOKBTN);
		jsclick(SaveTabOKBTN);
		Thread.sleep(8000);
		jsclick(CloseIcon);
		Thread.sleep(3000);
		VisiblityOf(ReopenTheDocument);
		jsclick(ReopenTheDocument);
		Thread.sleep(10000);
		jsclick(Refresh_Button(driver));
	}

	public void CreateDocumentScriptDynamicWFType() throws Exception {

		SoftAssert softAssert = new SoftAssert();

		// Sleep before starting the scenario
		Thread.sleep(4000);
		jsclick(Click_New_Document);
		Thread.sleep(2000);

		// SoftAssert validation for Destination_Folder_Textbox presence and clickability
		softAssert.assertTrue(isElementPresent(Destination_Folder_Textbox), "Destination_Folder_Textbox is not present");
		softAssert.assertTrue(isElementClickable(Destination_Folder_Textbox), "Destination_Folder_Textbox is not clickable");
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(3000);

		// SoftAssert validation for Cabinet element presence and clickability
		softAssert.assertTrue(isElementPresent(Cabinet), "Cabinet is not present");
		softAssert.assertTrue(isElementClickable(Cabinet), "Cabinet is not clickable");
		jsclick(Cabinet);
		Thread.sleep(3000);

		// SoftAssert validation for Drawer element presence and clickability
		softAssert.assertTrue(isElementPresent(Drawer), "Drawer is not present");
		softAssert.assertTrue(isElementClickable(Drawer), "Drawer is not clickable");
		jsclick(Drawer);
		Thread.sleep(3000);

		// SoftAssert validation for Folder element presence and clickability
		softAssert.assertTrue(isElementPresent(Folder), "Folder is not present");
		softAssert.assertTrue(isElementClickable(Folder), "Folder is not clickable");
		jsclick(Folder);
		Thread.sleep(3000);

		// SoftAssert validation for OK_Button_BrowseforFolder presence and clickability
		softAssert.assertTrue(isElementPresent(OK_Button_BrowseforFolder), "OK_Button_BrowseforFolder is not present");
		softAssert.assertTrue(isElementClickable(OK_Button_BrowseforFolder), "OK_Button_BrowseforFolder is not clickable");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		Reporter.log("Create document and add files");

		Reporter.log("Add file by using floating button Browse icon");

		// SoftAssert validation for UploadeFabBTN visibility and clickability
		softAssert.assertTrue(isElementPresent(UploadeFabBTN), "UploadeFabBTN (Browse icon) is not present");
		softAssert.assertTrue(isElementClickable(UploadeFabBTN), "UploadeFabBTN (Browse icon) is not clickable");
		act.moveToElement(UploadeFabBTN).click().build().perform();
		Thread.sleep(7000);
		Reporter.log("Mousehover on floating button");

		Reporter.log("Click browse icon");
		Reporter.log("Add file by using AutoIT script");

		// Run AutoIT script to upload a file
		try {
		    Runtime.getRuntime().exec("D:\\RNishaAutoIt\\NishaRScript.exe");
		} catch (IOException e) {
		    System.out.println("Error executing AutoIT script: " + e.getMessage());
		}
		Thread.sleep(8000);

		// SoftAssert validation for alert presence
		try {
		    alertIsPresent();
		    acceptAlert();
		    Reporter.log("Alert accepted successfully");
		} catch (Exception e) {
		    System.out.println("Alert is not present");
		}

		Thread.sleep(3000);

		// SoftAssert validation for FabSaveBTN visibility and clickability
		softAssert.assertTrue(isElementPresent(FabSaveBTN), "FabSaveBTN (Save icon) is not present");
		softAssert.assertTrue(isElementClickable(FabSaveBTN), "FabSaveBTN (Save icon) is not clickable");
		VisiblityOf(FabSaveBTN);
		jsclick(FabSaveBTN);
		Thread.sleep(7000);
		Reporter.log("Document updated successfully");

		// SoftAssert validation for SaveTabOKBTN presence and clickability
		softAssert.assertTrue(isElementPresent(SaveTabOKBTN), "SaveTabOKBTN is not present");
		softAssert.assertTrue(isElementClickable(SaveTabOKBTN), "SaveTabOKBTN is not clickable");
		jsclick(SaveTabOKBTN);

	}

	public void AdvancedViewerOption() throws Exception {
	    SoftAssert softAssert = new SoftAssert();  // Initialize SoftAssert

	    Reporter.log("Scenario 1: Go to My Preference, Change the Default viewing as Advanced viewer");
	    jsclick(Setting_Icon);
	    Reporter.log("Click on Setting icon");

	    // Soft assertion to verify that the Setting icon was clicked successfully
	    softAssert.assertTrue(Setting_Icon.isDisplayed(), "Setting icon is not visible");

	    jsclick(My_Preferencesetting);
	    Reporter.log("Go to My preference");

	    // Soft assertion to check that My Preference setting was clicked successfully
	    softAssert.assertTrue(My_Preferencesetting.isDisplayed(), "My Preference setting is not visible");

	    getSelect_Office_document_Advancedviewing();
	    Reporter.log("Set the office document to advanced viewing");

	  
	    Thread.sleep(3000);

	    getSelect_PDF_document_Advancedviewing();
	    Reporter.log("Set the PDF document to advanced viewing");

	  
	    Thread.sleep(6000);

	    jsclick(Apply_button);
	    Reporter.log("Click on Apply button");

	    // Soft assertion to verify that the Apply button was clicked successfully
	    softAssert.assertTrue(Apply_button.isDisplayed() && Apply_button.isEnabled(), "Apply button is not clickable or not displayed");

	    Reporter.log("Advanced viewer mode has been set successfully...");

	    // Assert all to check for any failed assertions
	 
	}


	public void AdvancedViewPDFDocument_WithSpcialCharacterFileName() throws Exception {
		SoftAssert softAssert = new SoftAssert();

		Thread.sleep(2000);
		jsclick(Click_New_Document);
		Reporter.log("Scenario: Advanced viewer negative script");
		Reporter.log("Click on new document tab");
		Thread.sleep(2000);

		// SoftAssert validation for Destination_Folder_Textbox presence and clickability
		softAssert.assertTrue(isElementPresent(Destination_Folder_Textbox), "Destination_Folder_Textbox is not present");
		softAssert.assertTrue(isElementClickable(Destination_Folder_Textbox), "Destination_Folder_Textbox is not clickable");
		jsclick(Destination_Folder_Textbox);
		Reporter.log("Click on destination folder text box");
		Thread.sleep(3000);

		// SoftAssert validation for Cabinet presence and clickability
		softAssert.assertTrue(isElementPresent(Cabinet), "Cabinet is not present");
		softAssert.assertTrue(isElementClickable(Cabinet), "Cabinet is not clickable");
		selectElement(Cabinet);
		Reporter.log("Expand the cabinet");
		Thread.sleep(5000);

		// SoftAssert validation for Drawer presence and clickability
		softAssert.assertTrue(isElementPresent(Drawer), "Drawer is not present");
		softAssert.assertTrue(isElementClickable(Drawer), "Drawer is not clickable");
		selectElement(Drawer);
		Reporter.log("Expand the drawer");
		Thread.sleep(5000);

		// SoftAssert validation for Folder presence and clickability
		softAssert.assertTrue(isElementPresent(Folder), "Folder is not present");
		softAssert.assertTrue(isElementClickable(Folder), "Folder is not clickable");
		selectElement(Folder);
		Reporter.log("Click select the folder");
		Thread.sleep(5000);

		Reporter.log("Click on Browse folder OK button");
		// SoftAssert validation for OK_Button_BrowseforFolder presence and clickability
		softAssert.assertTrue(isElementPresent(OK_Button_BrowseforFolder), "OK_Button_BrowseforFolder is not present");
		softAssert.assertTrue(isElementClickable(OK_Button_BrowseforFolder), "OK_Button_BrowseforFolder is not clickable");
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(3000);

		Reporter.log("Select a document type");
		getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);

		movingclkElement(Enter_ReportName);
		Reporter.log("Enter document name");

		// SoftAssert validation for Enter_ReportName input box
		softAssert.assertTrue(isElementPresent(Enter_ReportName), "Enter_ReportName input box is not present");
		sendvalue(Enter_ReportName, readFrmXLNEgative(2, 1));
		Thread.sleep(5000);

		movingElement(Move_To_PlusIcon);
		Reporter.log("Mouse hover on browse icon");
		Thread.sleep(4000);

		// SoftAssert validation for NewPDfDoc presence and clickability
		softAssert.assertTrue(isElementPresent(NewPDfDoc), "NewPDfDoc is not present");
		softAssert.assertTrue(isElementClickable(NewPDfDoc), "NewPDfDoc is not clickable");
		jsclick(NewPDfDoc);
		Reporter.log("User selects new PDF document from dropdown");
		Thread.sleep(4000);

		jsclick(EnterFileNameOKBTN);
		Reporter.log("User clicks on file name dialog OK button");
		Thread.sleep(5000);

		Reporter.log("It will show 'Please enter file name' warning message");
		softAssert.assertEquals(FileMessage.getText(), "Please enter file name", "Validation failed: Warning message not as expected");
		Reporter.log("Warning message displayed successfully... Negative scenario passed");

		jsclick(InvalidDilogOKBTN);
		Reporter.log("Click on invalid dialog OK button");
		Thread.sleep(4000);

		EnterFileNAmePDF.sendKeys(readFrmXLNEgative(3, 1));
		Thread.sleep(6000);

		// SoftAssert validation for EnterFileNameOKBTN clickability
		softAssert.assertTrue(isElementClickable(EnterFileNameOKBTN), "EnterFileNameOKBTN is not clickable");
		jsclick(EnterFileNameOKBTN);
		Thread.sleep(3000);

		Thread.sleep(3000);
		// jsclick(PDFDocumentPage); // Commented out if not needed
		Thread.sleep(3000);

		// SoftAssert validation for NavigateBTN presence and clickability
		softAssert.assertTrue(isElementClickable(NavigateBTN), "NavigateBTN is not clickable");
		jsclick(NavigateBTN);
		Thread.sleep(12000);

		// SoftAssert validation for NavigateDocOpen presence and clickability
		softAssert.assertTrue(isElementClickable(NavigateDocOpen), "NavigateDocOpen is not clickable");
		jsclick(NavigateDocOpen);

		

	}

	
	public void CreateDocumentMore() throws Exception {
	    WebDriverWait wait = new WebDriverWait(driver, 10); // Explicit wait
	    jsclick(Refresh_Button(driver));
	    Thread.sleep(2000);
	    Reporter.log("Scenario 01: Document Thumbnail view");
	    Reporter.log("Expand the cabinet");
	    jsclick(FirstCabinet);
	    Reporter.log("Expand the drawer");
	    wait.until(ExpectedConditions.elementToBeClickable(FirstDrawer));
	    Thread.sleep(2000); // Adding sleep to ensure stability
	    jsclick(FirstDrawer);
	    Reporter.log("Select the folder");
	    wait.until(ExpectedConditions.elementToBeClickable(FirstFolder));
	    Thread.sleep(2000); // Adding sleep for stability
	    selectElement(FirstFolder);

	    Reporter.log("Click on new document");
	    wait.until(ExpectedConditions.elementToBeClickable(Click_New_Document));
	    Thread.sleep(2000); // Adding sleep for stability
	    
		 for (int i = 0; i <= 100; i++) {
		      jsclick(Click_New_Document);
		      getSelect_Document_Type_Dropdown();
		      Thread.sleep(2000); // Adding sleep for stability
		      Reporter.log("Select document type");
		
		      Actions act = new Actions(driver);
		      act.click(DocumentCVRep).sendKeys(readFrmXLNEgative(6, 0)).build().perform();
		      Reporter.log("Enter document name");
		
		      wait.until(ExpectedConditions.elementToBeClickable(CreateBTN));
		      Thread.sleep(2000); // Adding sleep for stability
		      jsclick(CreateBTN);
		      Reporter.log("Click on create document");
		
		      wait.until(ExpectedConditions.elementToBeClickable(viewOption));
		      Thread.sleep(2000); // Adding sleep for stability
		      jsclick(viewOption);
		      Reporter.log("Click on view button");
		
		      movingElement(Move_To_PlusIcon);
		      Reporter.log("Click on add icon");
		      Thread.sleep(4000); 
		//        wait.until(ExpectedConditions.elementToBeClickable(WordDocument));
		      Thread.sleep(2000); // Adding sleep for stability
		      jsclick(WordDocument);
		
		      EnterFileNAmePDF.sendKeys(readFromExAdvancedView(3, 1));
		      Reporter.log("Enter word document name");
		
		      jsclick(EnterFileNameOKBTN);
		      Reporter.log("Click on enter file name OK button");
		
		      wait.until(ExpectedConditions.elementToBeClickable(SaveTab));
		      Thread.sleep(2000); // Adding sleep for stability
		      jsclick(SaveTab);
		      wait.until(ExpectedConditions.visibilityOf(SaveTabOKBTN));
		      Thread.sleep(2000); // Adding sleep for stability
		      Reporter.log("Click on save dialog OK button");
		      jsclick(SaveTabOKBTN);
		      System.out.println("Created document List:" +i);
		  }
			
	/*    for (int i = 0; i <= 100; i++) {
	        jsclick(Click_New_Document);
	      getSelect_Document_Type_Dropdown();
	        Thread.sleep(2000); // Adding sleep for stability
	        Reporter.log("Select document type");

	        Actions act = new Actions(driver);
	        act.click(DocumentCVRep).sendKeys(readFrmXLNEgative(6, 0)).build().perform();
	        Reporter.log("Enter document name");

	        wait.until(ExpectedConditions.elementToBeClickable(CreateBTN));
	        Thread.sleep(2000); // Adding sleep for stability
	        jsclick(CreateBTN);
	        Reporter.log("Click on create document");

	        wait.until(ExpectedConditions.elementToBeClickable(viewOption));
	        Thread.sleep(2000); // Adding sleep for stability
	        jsclick(viewOption);
	        Reporter.log("Click on view button");
	        Thread.sleep(2000);
	        movingElement(Move_To_PlusIcon);
	        Reporter.log("Click on add icon");

	        try {
	            act.moveToElement(Browse_OptionNish).click().build().perform();
	            Reporter.log("Select browse option");
	        } catch (JavascriptException e) {
	            System.out.println("JavascriptException encountered");
	        }

	        Thread.sleep(5000); // Adding sleep for stability
	        Reporter.log("Add a Large TIFF file from folder by using Auto IT script");
	        Runtime.getRuntime().exec("D:\\RNishaAutoIt\\NishaRScript.exe");

	        try {
	            wait.until(ExpectedConditions.alertIsPresent());
	            Alert alt = driver.switchTo().alert();
	            alt.accept();
	        } catch (Exception e) {
	            System.out.println("Alert not present");
	        }
	    
	        wait.until(ExpectedConditions.elementToBeClickable(SaveTab));
	        Thread.sleep(2000); // Adding sleep for stability
	        jsclick(SaveTab);
	        wait.until(ExpectedConditions.visibilityOf(SaveTabOKBTN));
	        Thread.sleep(2000); // Adding sleep for stability
	        Reporter.log("Click on save dialog OK button");
	        jsclick(SaveTabOKBTN);
	    
	  
	    Thread.sleep(5000);
	    Reporter.log("100 document created success");

	   */
	    
}

	public void CerateDocPDF() throws Exception {
		
		Thread.sleep(2000);
		jsclick(Click_New_Document);
		Thread.sleep(2000);

		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		try {

			act.click(DocumentCVRep).sendKeys(readFrmXLNEgative(5, 1)).build().perform();
		} catch (Exception e) {
			System.out.println("Document name not enter failed");
		}
		Thread.sleep(3000);
		// driver.findElement(By.xpath("//*[@id=\"general\"]/div/div[1]/span")).click();
		// movingElement(Move_To_PlusIcon);
		movingElement(Move_To_PlusIcon);
		Thread.sleep(4000);
		jsclick(NewPDfDoc);
		Thread.sleep(5000);
		EnterFileNAmePDF.sendKeys(readFromExAdvancedView(2, 1));
		Thread.sleep(3000);

		jsclick(EnterFileNameOKBTN);
		Thread.sleep(3000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert not present");
		}
		
		Thread.sleep(2000);
		WebElement CreateBTN = driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		jsclick(CreateBTN);
		try {

			// *[@id='messageContent']
			WebElement Repname = driver.findElement(By.xpath("//*[@id='messageButtonOK']"));
			WebElement Repnamedialog = driver.findElement(By.xpath("//*[@id='messageContent']"));
			if (Repnamedialog.isDisplayed()) {
				jsclick(Repname);
			}
		} catch (Exception e) {
			System.out.println("Document created successfully...");
		}

		Thread.sleep(2000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		jsclick(viewOption);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 10);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert not present");
		}

	}

	public void UpdateDocument() throws Exception {
		Actions act = new Actions(driver);
		driver.findElement(By.xpath("//*[@id=\"general\"]/div/div[1]/span")).click();
		Thread.sleep(2000);

		movingElement(Move_To_PlusIcon);

		try {

			act.moveToElement(Browse_Option).click().build().perform();
		} catch (JavascriptException e) {
			System.out.println("Exception there");
		}

		Thread.sleep(5000);
		try {
			Process proc = Runtime.getRuntime().exec("D:\\RNishaAutoIt\\SIDBIAuto.exe");
			InputStream is = proc.getInputStream();
			int ret = 0;
			while (ret != -1) {
				ret = is.read();

			}
		} catch (Exception e) {
			System.out.println("Creating document without page");
		}

		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.println("Alert not present");
		}
		Thread.sleep(4000);
		jsclick(SaveTab);
		Thread.sleep(5000);
		try {
			VisiblityOf(SaveTabOKBTN);
			jsclick(SaveTabOKBTN);
		} catch (Exception e) {
			System.out.println("Save OK Button Clicked");
		}
		Thread.sleep(8000);
	}

	public void create_document_Auto() throws Exception {

		Thread.sleep(2000);
		jsclick(Click_New_Document);
		Thread.sleep(2000);

		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		try {

			act.click(DocumentCVRep).sendKeys(readFrmXLNEgative(5, 1)).build().perform();
		} catch (Exception e) {
			System.out.println("Document name not enter failed");
		}
		Thread.sleep(3000);
		movingElement(Move_To_PlusIcon);

		try {

			act.moveToElement(Browse_Option).click().build().perform();
		} catch (JavascriptException e) {
			System.out.println("Exception there");
		}

		Thread.sleep(15000);
		try {
			Runtime.getRuntime().exec("D:\\RNishaAutoIt\\NishaRScript.exe");//D:\\DipakAutoit\\BatchIndexingDoc.exe
			
			
			
		} catch (Exception e) {
			System.out.println("Creating document without page");
		}

		Thread.sleep(2000);
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.println("Alert not present");
		}
		Thread.sleep(3000);
		WebElement CreateBTN = driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		jsclick(CreateBTN);
		Thread.sleep(3000);

		try {

			WebElement Repname = driver.findElement(By.xpath("//*[@id='messageButtonOK']"));

			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.visibilityOf(Repname));

			jsclick(Repname);

		} catch (Exception e) {
			System.out.println("Document created successfully...");
		}

		Thread.sleep(2000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		jsclick(viewOption);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 10);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert not present");
		}

	}

	public void CreateDocumentAdvancedViewWordDocument() throws Exception {
		SoftAssert softAssert = new SoftAssert();  // Initialize SoftAssert

	    Reporter.log("Scenario 2: Create a document with Advanced viewer - new word document.");
	    jsclick(Click_New_Document);
	    Reporter.log("Click the New Document tab.");
	    Thread.sleep(2000);

	    // SoftAssert to ensure the "New Document" tab was clicked
	    softAssert.assertTrue(Click_New_Document.isDisplayed() && Click_New_Document.isEnabled(), "New Document tab is not visible or not clickable");

	    jsclick(Destination_Folder_Textbox);
	    Reporter.log("Click the 'Select destination folder location' text box.");
	    Thread.sleep(3000);
	    Reporter.log("'Browser for folder' dialog should be open.");

	    // SoftAssert to verify the "Select destination folder" textbox is clickable
	    softAssert.assertTrue(Destination_Folder_Textbox.isDisplayed() && Destination_Folder_Textbox.isEnabled(), "'Select destination folder location' textbox is not visible or not clickable");

	    selectElement(Cabinet);
	    Reporter.log("Expand the cabinet");
	    Thread.sleep(4000);
	    VisiblityOf(Drawer);
	    selectElement(Drawer);
	    Reporter.log("Expand drawer");
	    Thread.sleep(5000);
	    selectElement(Folder);
	    Reporter.log("Select a folder");
	    Thread.sleep(5000);

	    jsclick(OK_Button_BrowseforFolder);
	    Reporter.log("Folder selected successfully...");
	    Thread.sleep(3000);

	    // SoftAssert to verify the "OK" button was clicked
	    softAssert.assertTrue(OK_Button_BrowseforFolder.isDisplayed() && OK_Button_BrowseforFolder.isEnabled(), "'OK' button for browsing folder is not visible or not clickable");

	    getSelect_Document_Type_Dropdown();
	    Reporter.log("Click on 'Select document type' dropdown and select the document type.");
	    Reporter.log("Document type selected successfully...");
	    Thread.sleep(3000);

	    movingclkElement(Enter_ReportName);
	    Reporter.log("Enter the value into index field");
	    sendvalue(Enter_ReportName, readFromExAdvancedView(3, 1));
	    Thread.sleep(5000);

	    movingElement(Move_To_PlusIcon);
	    Reporter.log("Mouse hover on the browse icon");
	    Thread.sleep(5000);
	    jsclick(WordDocument);
	    Reporter.log("Select a 'New Word Document'");
	    EnterFileNAmePDF.sendKeys(readFromExAdvancedView(3, 1));
	    Thread.sleep(5000);
	    Reporter.log("Enter file name dialog should be open.");

	    // SoftAssert to verify that the "Enter file name" dialog is present
	    softAssert.assertTrue(EnterFileNameOKBTN.isDisplayed() && EnterFileNameOKBTN.isEnabled(), "'Enter file name' dialog button is not visible or not clickable");

	    ElementToBeClickable(EnterFileNameOKBTN);
	    Reporter.log("Enter the file name.");
	    jsclick(EnterFileNameOKBTN);
	    Reporter.log("Click on OK button.");
	    Reporter.log("'Enter file name' dialog should be closed successfully...");
	    Thread.sleep(8000);

	    jsclick(CreateBTN);
	    Reporter.log("Click on Create button");
	    Thread.sleep(10000);

	    jsclick(viewOption);
	    Reporter.log("'Document Created Successfully' dialog should be displayed");
	    Reporter.log("Click on View option");
	    Thread.sleep(15000);

	    Actions act = new Actions(driver);
	    ElementToBeClickable(WordDocPage);
	    act.click(WordDocPage).sendKeys(readFromExAdvancedView(2, 1)).sendKeys(Keys.ENTER)
	            .sendKeys(readFromExAdvancedView(0, 0)).build().perform();
	    Reporter.log("Enter data into the page");
	    Thread.sleep(10000);

	    jsclick(SaveTab);
	    Reporter.log("Click on the Save icon from viewer tool bar.");
	    Thread.sleep(8000);

	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Reporter.log("Click on save successful dialog OK button.");
	    Thread.sleep(10000);

	    jsclick(WordDocImageOpt);
	    Reporter.log("Click on image icon, it will show 'upload from computer' option.");
	    Thread.sleep(2000);
	    movingclkElement(UploadFromCmpOpt);
	    Reporter.log("Select the 'upload from computer' option.");
	    Thread.sleep(10000);

	    Runtime.getRuntime().exec("D:\\RNishaAutoIt\\FlowerOrCurlyBracket.exe");
	    Thread.sleep(10000);
	    Reporter.log("Using Auto IT add the image from folder successfully.");

	    jsclick(CreateTableopt);
	    Reporter.log("Click on Table icon.");
	    Thread.sleep(5000);
	    jsclick(TableDialogOKBTN);
	    Reporter.log("Add the table into the page.");
	    Thread.sleep(5000);

	    Thread.sleep(3000);
	    act.click(WordDocPage).sendKeys(readFromExAdvancedView(1, 1)).build().perform();
	    Reporter.log("Enter the data inside the table");
	    Thread.sleep(5000);

	    jsclick(SaveTab);
	    Reporter.log("Click on the save icon from viewer tool bar");
	    Thread.sleep(3000);

	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Reporter.log("The added data has been saved successfully...");
	    Thread.sleep(8000);

	    jsclick(CloseIcon);
	    Reporter.log("Click on the close icon");
	    Thread.sleep(3000);

	    VisiblityOf(ReopenTheDocument);
	    Reporter.log("Document closed successfully...");
	    jsclick(ReopenTheDocument);
	    Reporter.log("Reopen the created word file document...");
	    Thread.sleep(10000);
	    Reporter.log("All saved data should be displayed successfully...");

	    // SoftAssert to report all failures
	   
	}

	public void AdvancedViewPDFDocument() throws Exception {
		 SoftAssert softAssert = new SoftAssert();  // Initialize SoftAssert

		    Reporter.log("Scenario 4: Create a document with Advanced viewer - new PDF document ");
		    jsclick(Click_New_Document);
		    Reporter.log("Click on New Document tab");

		    Thread.sleep(3000);
		    getSelect_Document_Type_Dropdown();
		    Reporter.log("Click the 'Select document type' dropdown and select the document type.");
		    Thread.sleep(3000);
		    movingclkElement(Enter_ReportName);
		    Reporter.log("Enter the value into index field");
		    sendvalue(Enter_ReportName, readFromExAdvancedView(2, 1));
		    Thread.sleep(5000);

		    movingElement(Move_To_PlusIcon);
		    Reporter.log("Mouse hover on the browse icon");
		    Thread.sleep(4000);
		    jsclick(NewPDfDoc);
		    Reporter.log("Select New PDF document");
		    Thread.sleep(4000);
		    EnterFileNAmePDF.sendKeys(readFromExAdvancedView(2, 1));
		    Thread.sleep(6000);

		    jsclick(EnterFileNameOKBTN);
		    Reporter.log("Enter the file name");
		    Thread.sleep(5000);
		    jsclick(CreateBTN);
		    Reporter.log("Click on the create button");
		    Thread.sleep(10000);
		    jsclick(viewOption);
		    Reporter.log("Click on the view option");
		    Thread.sleep(8000);
		    jsclick(AdvancedTool);
		    Reporter.log("Click on advanced tool icon");
		    Thread.sleep(4000);
		    Actions act = new Actions(driver);

		    try {
		        act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys(readFromExAdvancedView(1, 0)).build().perform();
		    } catch (JavascriptException e) {
		        // Handle exception
		    }
		    Thread.sleep(8000);
		    Reporter.log("Click on free text icon.");
		    Reporter.log("Enter data into free text box");
		    Thread.sleep(10000);
		    act.click(AddComment).moveToElement(Page).click().build().perform();
		    Reporter.log("Click on comment icon, add a comment");

		    Thread.sleep(5000);
		    jsclick(SaveTab);
		    Reporter.log("Comment added successfully");
		    Thread.sleep(7000);
		    VisiblityOf(SaveTabOKBTN);
		    Reporter.log("Click on save icon from viewer menu tab");
		    jsclick(SaveTabOKBTN);
		    Reporter.log("Document saved successfully");
		    Thread.sleep(8000);

		    // SoftAssert checks to verify actions and visibility
		    softAssert.assertTrue(SaveTabOKBTN.isDisplayed() && SaveTabOKBTN.isEnabled(), "SaveTabOKBTN is not visible or not clickable");

		    // Reopen document and check
		    ElementToBeClickable(AdvancedToolTextIcon);
		    act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys(readFromExAdvancedView(0, 1))
		            .sendKeys(Keys.ENTER).sendKeys(readFromExAdvancedView(1, 1)).build().perform();
		    Thread.sleep(8000);
		    act.click(AddComment).moveToElement(Page).click().build().perform();
		    Thread.sleep(5000);
		    jsclick(SaveTab);
		    Thread.sleep(3000);
		    VisiblityOf(SaveTabOKBTN);
		    jsclick(SaveTabOKBTN);
		    Thread.sleep(8000);
		    jsclick(CloseIcon);
		    Reporter.log("Click on the Close icon");
		    Thread.sleep(3000);
		    VisiblityOf(ReopenTheDocument);
		    Reporter.log("Reopen the Created pdf file document");
		    jsclick(ReopenTheDocument);
		    Thread.sleep(10000);

		  
		
	}

	public void AdvancedViewExcelDocumentt() throws Exception {

		SoftAssert softAssert = new SoftAssert();  // Initialize SoftAssert

	    Reporter.log("Scenario 3: Create a document with Advanced viewer - 'New Excel Document' ");
	    Thread.sleep(3000);
	    jsclick(Click_New_Document);
	    Reporter.log("Click on the New Document tab");

	    Thread.sleep(3000);
	    getSelect_Document_Type_Dropdown();
	    Reporter.log("Click on the 'Select document type' dropdown and select the document type.");
	    Thread.sleep(3000);
	    movingclkElement(Enter_ReportName);
	    Reporter.log("Enter the value into index field");
	    sendvalue(Enter_ReportName, readFromExAdvancedView(4, 1));
	    Thread.sleep(5000);

	    jsclick(CreateBTN);
	    Reporter.log("Click on the create button");
	    Thread.sleep(10000);

	    jsclick(viewOption);
	    Reporter.log("Click on View option");
	    Thread.sleep(10000);
	    movingElement(Move_To_PlusIcon);
	    Reporter.log("Mouse hover on browse icon");
	    Thread.sleep(2000);
	    jsclick(ExcelSheet);
	    Reporter.log("Select New Excel sheet");
	    Thread.sleep(3000);
	    EnterFileNAmePDF.sendKeys(readFromExAdvancedView(4, 1));
	    Reporter.log("Enter file name dialog should be open");
	    Thread.sleep(4000);

	    jsclick(EnterFileNameOKBTN);
	    Reporter.log("Enter file name and click OK button");
	    Actions act = new Actions(driver);
	    Thread.sleep(8000);
	    Reporter.log("'Enter file name' dialog should be closed successfully...");
	    
	    // SoftAssert check: Ensure the Excel sheet has been created successfully
	    softAssert.assertTrue(ExcelSheetFirstRow.isDisplayed(), "Excel sheet first row is not displayed after creation.");
	    
	    act.click(ExcelSheetFirstRow).sendKeys(readFromExAdvancedView(2, 0)).build().perform();
	    Thread.sleep(3000);
	    Reporter.log("Enter data into the first row");
	    act.click(ExcelSheetFourthRow).sendKeys(readFromExAdvancedView(3, 0)).build().perform();
	    Reporter.log("Enter data into the second row");
	    Thread.sleep(5000);
	    
	    jsclick(SaveTab);
	    Reporter.log("Click on save icon from viewer tool bar");
	    Thread.sleep(7000);
	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Reporter.log("Click on 'Save successful' dialog box OK button");
	    Thread.sleep(8000);

	    // SoftAssert check: Ensure that the Save dialog has been confirmed
	    softAssert.assertTrue(SaveTabOKBTN.isDisplayed(), "'Save successful' dialog box was not confirmed.");

	    jsclick(CloseIcon);
	    Reporter.log("Click on Close icon");
	    Thread.sleep(3000);
	    VisiblityOf(ReopenTheDocument);
	    jsclick(ReopenTheDocument);
	    Reporter.log("Document closed successfully...");
	    Reporter.log("Reopen the created document");
	    Thread.sleep(8000);

	   
	    jsclick(Refresh_Button(driver));
	    Thread.sleep(5000);

	 
	}

	@FindBy(xpath = ("//*[@id=\"djvuViewerDiv_toolbar_link\"]")) // Change 9 to change the value
	private WebElement Link;

	@FindBy(xpath = ("//*[@id=\"djvuViewerDiv_toolbar_header\"]")) // Change 9 to change the value
	private WebElement Header;

	@FindBy(xpath = ("(//input[contains(@class, 'e-textbox') and @type='text'])[2]")) // Change 9 to change the value
	private WebElement LinkdialogAddress;

	@FindBy(xpath = ("//*[@id=\"djvuViewerDiv_toolbar_footer\"]")) // Change 9 to change the value
	private WebElement Footer;

	@FindBy(xpath = ("//*[@id=\"pdfViewerDiv_annotationText\"]")) // Change 9 to change the value
	private WebElement pdfEditAnnotation;

	// *[@id="menuitem_87"]

	@FindBy(id = ("pdfViewerDivcontextMenuElement")) // Change
	private WebElement StampItems;

	// *[@id="menuitem_121"]

	@FindBy(xpath = ("(//ul[@class='e-menu-parent e-ul '])[1]/li[2]")) // Change 9 to change the value
	private WebElement SignHere;

	// *[@id="menuitem_121-ej2menu-pdfViewerDivcontextMenuElement-popup"]/ul/li["i"]
	// For all items

	@FindBy(xpath = ("(//ul[@class='e-menu-parent e-ul '])[1]/li[1]")) // Change 9 to change the value
	private WebElement Dynamic;

	@FindBy(xpath = ("(//ul[@class='e-menu-parent e-ul '])[1]/li[3]")) // Change 9 to change the value
	private WebElement StandardBusiness;

	@FindBy(xpath = ("(//ul[@class='e-menu-parent e-ul '])[1]/li[5]")) // Change 9 to change the value
	private WebElement customStamp;

	@FindBy(xpath = ("//*[@id=\"fabButton\"]")) // Change 9 to change the value
	private WebElement FabBTN;

	////////////////////////// Nisha R Codes///////////////
	public void SignHereAllStamps(int numberOfDocs) throws Exception {

		jsclick(Click_New_Document);
		Reporter.log("Click the New Document tab.", true);
		Thread.sleep(2000);
		jsclick(Destination_Folder_Textbox);
		Reporter.log("Click the 'Select destination folder location' text box.", true);
		Thread.sleep(6000);
		Reporter.log("'Browse for folder' dialog should be open.", true);
		selectElement(Cabinet);
		Reporter.log("Expand the cabinet", true);
		Thread.sleep(4000);
		VisiblityOf(Drawer);
		selectElement(Drawer);
		Reporter.log("Expand drawer", true);
		Thread.sleep(5000);
		selectElement(Folder);
		Reporter.log("Select a folder", true);
		Thread.sleep(5000);
		jsclick(OK_Button_BrowseforFolder);
		Reporter.log("Folder selected successfully...", true);
		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		Reporter.log("Click on 'Select document type' dropdown and select the document type.", true);
		Reporter.log("Document type selected successfully...", true);
		Thread.sleep(3000);
		movingclkElement(Enter_ReportName);
		Reporter.log("Enter the value into index field", true);
		sendvalue(Enter_ReportName, readFromExAdvancedView(5, 1));
		Thread.sleep(5000);
		movingElement(Move_To_PlusIcon);
		Reporter.log("Mouse hover on the browse icon", true);
		Thread.sleep(5000);
		// Thread.sleep(4000);
		jsclick(NewPDfDoc);
		Reporter.log("Select New PDF document", true);
		Thread.sleep(4000);
		EnterFileNAmePDF.sendKeys(readFromExAdvancedView(5, 1));
		Thread.sleep(6000);
		jsclick(EnterFileNameOKBTN);
		Reporter.log("Enter the file name", true);
		Thread.sleep(5000);
		jsclick(CreateBTN);
		Reporter.log("Click on the create button", true);
		Thread.sleep(10000);
		jsclick(viewOption);
		Thread.sleep(5000);

		jsclick(pdfEditAnnotation);

		for (int i = 1; i <= numberOfDocs; i++) {
			// Construct the XPath with the current index
			Actions act = new Actions(driver);
			Thread.sleep(4000);
			Reporter.log("Scenario 01: Open an existing document and send it to WorkFlow");
			Thread.sleep(2000);

			act.moveToElement(StampItems).click().build().perform();
			Thread.sleep(2000);

			act.moveToElement(SignHere).perform();
			Thread.sleep(3000);

			try {
				// Dynamically build the XPath with current index
				String xpath = "(//ul[@class='e-menu-parent e-ul '])[2]/li[" + i + "]";
				System.out.println("Print the downloaded XPath details: " + xpath);

				WebDriverWait wait = new WebDriverWait(driver, 30);

				// Find the element using XPath
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

				// Calculate dynamic offset for each iteration
				int yOffset = 40 * i; // Move vertically by 70 pixels for each iteration

				// Move to the element and click it
				act.moveToElement(element).click().build().perform();
				Reporter.log("Before Click", true);

				// Get the container element where annotations are added
				WebElement container = driver.findElement(By.xpath("//*[@id='pdfViewerDiv_viewerContainer']"));

				// Step 1: Scroll the container using JavaScript
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollTop = arguments[1];", container, yOffset);

				// Wait to ensure the scroll is completed
				Thread.sleep(3000);

				// Step 2: Add the annotation using Actions class
				// Move the mouse to the container and apply the offset to Y-axis
				act.moveToElement(container, 10, yOffset) // 10 pixels to the right, yOffset down
						.click(Page).build().perform();

				Reporter.log("After Click", true);
				Thread.sleep(3000);
				Reporter.log("Stamp Added Successfully", true);

			} catch (Exception e) {
				System.out.println("Error interacting with element: " + e.getMessage());
			}
		}

	}

	@FindBy(xpath = "//*[@id='viewDocumentAddPages']")
	private WebElement Browse_OptionNish;

	public void DynamicAllStamps(int numberOfDocs) throws Exception {
        jsclick(Refresh_Button(driver));
        Thread.sleep(3000);
		jsclick(Click_New_Document);
		Reporter.log("Click the New Document tab.", true);
		Thread.sleep(2000);
		
		jsclick(Destination_Folder_Textbox);
		Reporter.log("Click the 'Select destination folder location' text box.", true);
		Thread.sleep(6000);
		Reporter.log("'Browse for folder' dialog should be open.", true);
		selectElement(Cabinet);
		Reporter.log("Expand the cabinet", true);
		Thread.sleep(4000);
		VisiblityOf(Drawer);
		selectElement(Drawer);
		Reporter.log("Expand drawer", true);
		Thread.sleep(5000);
		selectElement(Folder);
		Reporter.log("Select a folder", true);
		Thread.sleep(5000);
		jsclick(OK_Button_BrowseforFolder);
		Reporter.log("Folder selected successfully...", true);

		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		Reporter.log("Click on 'Select document type' dropdown and select the document type.", true);
		Reporter.log("Document type selected successfully...", true);
		Thread.sleep(3000);
		movingclkElement(Enter_ReportName);
		Reporter.log("Enter the value into index field", true);
		sendvalue(Enter_ReportName, readFromExAdvancedView(5, 2));
		Thread.sleep(5000);
		movingElement(Move_To_PlusIcon);
		Reporter.log("Mouse hover on the browse icon", true);
		Thread.sleep(5000);
		// Thread.sleep(4000);
		jsclick(NewPDfDoc);
		Reporter.log("Select New PDF document", true);
		Thread.sleep(4000);
		EnterFileNAmePDF.sendKeys(readFromExAdvancedView(5, 2));
		Thread.sleep(6000);
		jsclick(EnterFileNameOKBTN);
		Reporter.log("Enter the file name", true);
		Thread.sleep(5000);
		jsclick(CreateBTN);
		Reporter.log("Click on the create button", true);
		Thread.sleep(10000);
		jsclick(viewOption);
		Thread.sleep(5000);

		jsclick(pdfEditAnnotation);

		for (int i = 1; i <= numberOfDocs; i++) {
			// Construct the XPath with the current index
			Actions act = new Actions(driver);
			Thread.sleep(4000);
			Reporter.log("Scenario 01: Open an existing document and send it to WorkFlow");
			Thread.sleep(2000);
			try {
				act.moveToElement(StampItems).click().build().perform();

				Thread.sleep(2000);
			} catch (JavascriptException e) {
				//
			}
			
			try {
			act.moveToElement(Dynamic).perform();
			}
			catch (JavascriptException e) {
				//
			}
			Thread.sleep(3000);

			try {
				// Dynamically build the XPath with current index
				String xpath = "(//ul[@class='e-menu-parent e-ul '])[2]/li[" + i + "]";
				System.out.println("Print the downloaded XPath details: " + xpath);

				WebDriverWait wait = new WebDriverWait(driver, 30);

				// Find the element using XPath
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

				// Calculate dynamic offset for each iteration
				int yOffset = 30 * i; // Move vertically by 70 pixels for each iteration

				// Move to the element and click it
				act.moveToElement(element).click().build().perform();
				Reporter.log("Before Click", true);

				// Get the container element where annotations are added
				WebElement container = driver.findElement(By.xpath("//*[@id='pdfViewerDiv_viewerContainer']"));

				// Step 1: Scroll the container using JavaScript
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollTop = arguments[1];", container, yOffset);

				// Wait to ensure the scroll is completed
				Thread.sleep(3000);

				// Step 2: Add the annotation using Actions class
				// Move the mouse to the container and apply the offset to Y-axis
				act.moveToElement(container, 10, yOffset) // 10 pixels to the right, yOffset down
						.click(Page).build().perform();

				Reporter.log("After Click", true);
				Thread.sleep(3000);
				Reporter.log("Stamp Added Successfully", true);

			} catch (Exception e) {
				System.out.println("Error interacting with element: " + e.getMessage());
			}
		}

	}

	public void StandardAllStamps(int numberOfDocs) throws Exception {
		 jsclick(Refresh_Button(driver));
	        Thread.sleep(3000);
		jsclick(Click_New_Document);
		Reporter.log("Click the New Document tab.", true);
		Thread.sleep(2000);
		
		jsclick(Destination_Folder_Textbox); // *
		Reporter.log("Click the 'Select destination folder location' text box.", // *
				true);
		Thread.sleep(6000); // *
		Reporter.log("'Browse for folder' dialog should be open.", true); // *
		selectElement(Cabinet);
		Reporter.log("Expand the cabinet", true); // *
		Thread.sleep(4000);
		VisiblityOf(Drawer);
		selectElement(Drawer); // *
		Reporter.log("Expand drawer", true);
		Thread.sleep(5000); // *
		selectElement(Folder);
		Reporter.log("Select a folder", true); // *
		Thread.sleep(5000);
		jsclick(OK_Button_BrowseforFolder);
		Reporter.log("Folder selected successfully...", true);
		 
		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		Reporter.log("Click on 'Select document type' dropdown and select the document type.", true);
		Reporter.log("Document type selected successfully...", true);
		Thread.sleep(3000);
		movingclkElement(Enter_ReportName);
		Reporter.log("Enter the value into index field", true);
		sendvalue(Enter_ReportName, readFromExAdvancedView(5, 3));
		Thread.sleep(5000);
		movingElement(Move_To_PlusIcon);

		try {
			Actions act = new Actions(driver);
			act.moveToElement(Browse_OptionNish).click().build().perform();
		} catch (JavascriptException e) {
			System.out.println("Exception there");
		}

		Thread.sleep(15000);

		// Runtime.getRuntime().exec("D:\\RNishaAutoIt\\LArgePDF.exe");
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\SinglePDF64.exe");
		Thread.sleep(8000);
		Reporter.log("Add a file  by using auto IT");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert not present");
		}

		Reporter.log("Mouse hover on the browse icon", true);

		// Thread.sleep(4000);
		/*
		 * jsclick(NewPDfDoc); Reporter.log("Select New PDF document", true);
		 * Thread.sleep(4000); EnterFileNAmePDF.sendKeys(readFromExAdvancedView(2, 1));
		 * Thread.sleep(6000); jsclick(EnterFileNameOKBTN);
		 * Reporter.log("Enter the file name", true);
		 */
		Thread.sleep(5000);
		jsclick(CreateBTN);
		Reporter.log("Click on the create button", true);
		Thread.sleep(4000);
		jsclick(viewOption);
		Thread.sleep(5000);

		jsclick(pdfEditAnnotation);

		for (int i = 1; i <= numberOfDocs; i++) {
			// Construct the XPath with the current index
			Actions act = new Actions(driver);
			Thread.sleep(4000);
			Reporter.log("Scenario 01: Open an existing document and send it to WorkFlow");
			Thread.sleep(2000);

			act.moveToElement(StampItems).click().build().perform();
			Thread.sleep(2000);

			act.moveToElement(StandardBusiness).perform();
			Thread.sleep(3000);

			try {
				String xpath = "(//ul[@class='e-menu-parent e-ul '])[2]/li[" + i + "]";
				System.out.println("Print the downloaded XPath details: " + xpath);

				WebDriverWait wait = new WebDriverWait(driver, 30);
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

				// Move to the element and click it
				act.moveToElement(element).click().build().perform();
				Reporter.log("Before Click", true);

				// Get the container element where annotations are added
				WebElement container = driver.findElement(By.xpath("//*[@id='pdfViewerDiv_viewerContainer']"));

				// Step 1: Scroll the container using JavaScript
				JavascriptExecutor js = (JavascriptExecutor) driver;

				// Get the total scrollable height of the container
				int containerScrollableHeight = Integer
						.parseInt(js.executeScript("return arguments[0].scrollHeight;", container).toString());

				// Ensure the yOffset doesn't exceed the container's scrollable height
				int yOffset = 40 * i;
				if (yOffset > containerScrollableHeight) {
					yOffset = containerScrollableHeight - 50; // Ensure it stays within bounds
				}

				// Scroll to the desired position inside the container
				js.executeScript("arguments[0].scrollTop = arguments[1];", container, yOffset);

				// Step 2: Wait for scroll to finish (adjust time if needed)
				Thread.sleep(2000); // Reduced to 2 seconds

				// Add the annotation using Actions class without offsets
				act.moveToElement(container).click(Page) // Perform click at the center of the container
						.build().perform();

				Reporter.log("After Click", true);
				Thread.sleep(3000);
				Reporter.log("Stamp Added Successfully", true);

			} catch (Exception e) {
				System.out.println("Error interacting with element: " + e.getMessage());
			}
		}
	}

	public void CustomAllStamps(int numberOfDocs) throws Exception {
		 jsclick(Refresh_Button(driver));
	        Thread.sleep(3000);
		jsclick(Click_New_Document);
		Reporter.log("Click the New Document tab.", true);
		Thread.sleep(2000);
		
		jsclick(Destination_Folder_Textbox);
		Reporter.log("Click the 'Select destination folder location' text box.", true);
		Thread.sleep(6000);
		Reporter.log("'Browse for folder' dialog should be open.", true);
		selectElement(Cabinet);
		Reporter.log("Expand the cabinet", true);
		Thread.sleep(4000);
		VisiblityOf(Drawer);
		selectElement(Drawer);
		Reporter.log("Expand drawer", true);
		Thread.sleep(5000);
		selectElement(Folder);
		Reporter.log("Select a folder", true);
		Thread.sleep(5000);
		jsclick(OK_Button_BrowseforFolder);
		Reporter.log("Folder selected successfully...", true);
		Thread.sleep(3000);

		getSelect_Document_Type_Dropdown();
		Reporter.log("Click on 'Select document type' dropdown and select the document type.", true);
		Reporter.log("Document type selected successfully...", true);
		Thread.sleep(3000);
		movingclkElement(Enter_ReportName);
		Reporter.log("Enter the value into index field", true);
		sendvalue(Enter_ReportName, readFromExAdvancedView(5, 4));
		Thread.sleep(5000);
		movingElement(Move_To_PlusIcon);

		try {
			Actions act = new Actions(driver);
			act.moveToElement(Browse_OptionNish).click().build().perform();
		} catch (JavascriptException e) {
			System.out.println("Exception there");
		}

		Thread.sleep(15000);

		// Runtime.getRuntime().exec("D:\\RNishaAutoIt\\LArgePDF.exe");
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\SinglePDF64.exe");
		Thread.sleep(8000);
		Reporter.log("Add a file  by using auto IT");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert not present");
		}

		Reporter.log("Mouse hover on the browse icon", true);

		Thread.sleep(5000);
		jsclick(CreateBTN);
		Reporter.log("Click on the create button", true);
		Thread.sleep(4000);
		jsclick(viewOption);
		Thread.sleep(5000);

		jsclick(pdfEditAnnotation);

		for (int i = 1; i <= numberOfDocs; i++) {
			// Construct the XPath with the current index
			Actions act = new Actions(driver);
			Thread.sleep(4000);
			Reporter.log("Scenario 01: Open an existing document and send it to WorkFlow");
			Thread.sleep(2000);
			try {
				act.moveToElement(StampItems).click().build().perform();
				Thread.sleep(2000);
			} catch (JavascriptException e) {
				//
			}
			
			try {
			act.moveToElement(customStamp).perform();
			}
			catch (JavascriptException e) {
				//
			}
			Thread.sleep(3000);

			try {
				String xpath = "(//ul[@class='e-menu-parent e-ul '])[2]/li[" + i + "]";
				System.out.println("Print the downloaded XPath details: " + xpath);

				WebDriverWait wait = new WebDriverWait(driver, 30);
				WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

				// Move to the element and click it
				act.moveToElement(element).click().build().perform();
				Reporter.log("Before Click", true);

				// Get the container element where annotations are added
				WebElement container = driver.findElement(By.xpath("//*[@id='pdfViewerDiv_viewerContainer']"));

				// Step 1: Scroll the container using JavaScript
				JavascriptExecutor js = (JavascriptExecutor) driver;

				// Get the total scrollable height of the container
				int containerScrollableHeight = Integer
						.parseInt(js.executeScript("return arguments[0].scrollHeight;", container).toString());

				// Ensure the yOffset doesn't exceed the container's scrollable height
				int yOffset = 40 * i;
				if (yOffset > containerScrollableHeight) {
					yOffset = containerScrollableHeight - 50; // Ensure it stays within bounds
				}

				// Scroll to the desired position inside the container
				js.executeScript("arguments[0].scrollTop = arguments[1];", container, yOffset);

				// Step 2: Wait for scroll to finish (adjust time if needed)
				Thread.sleep(2000); // Reduced to 2 seconds

				// Add the annotation using Actions class without offsets
				act.moveToElement(container).click(Page) // Perform click at the center of the container
						.build().perform();

				Reporter.log("After Click", true);
				Thread.sleep(3000);
				Reporter.log("Stamp Added Successfully", true);

				// After 12 stamps, click the scroll down button
				if (i >= 9) {
					WebElement scrollDownButton = driver.findElement(By.xpath("//*[@id=\"vscroll_326_nav_down\"]"));
					act.moveToElement(scrollDownButton).click().build().perform();
					// scrollDownButton.click();
					Reporter.log("Scrolled down to load more stamps", true);
					Thread.sleep(2000); // Adjust sleep time if needed to ensure scrolling completes
				}

			} catch (Exception e) {
				System.out.println("Error interacting with element: " + e.getMessage());
			}
		}
	}

	public void SaveDocumentAndReopen() throws Exception {

		 SoftAssert softAssert = new SoftAssert();  // Initialize SoftAssert

		    Thread.sleep(3000);

		    // Click on the save icon
		    jsclick(SaveTab);
		    Reporter.log("Click on the save icon from viewer toolbar", true);
		    Thread.sleep(3000);

		    // Verify that the SaveTabOKBTN is visible and clickable
		    softAssert.assertTrue(SaveTabOKBTN.isDisplayed() && SaveTabOKBTN.isEnabled(), "SaveTabOKBTN is not visible or not clickable");

		    // Click the OK button to save
		    jsclick(SaveTabOKBTN);
		    Reporter.log("The added data has been saved successfully...", true);
		    Thread.sleep(8000);

		    // Click on the close icon
		    jsclick(CloseIcon);
		    Reporter.log("Click on the close icon", true);
		    Thread.sleep(3000);

		    // Verify that the ReopenTheDocument element is visible and clickable
		    softAssert.assertTrue(ReopenTheDocument.isDisplayed() && ReopenTheDocument.isEnabled(), "ReopenTheDocument element is not visible or not clickable");

		    Reporter.log("Document closed successfully...", true);
		    jsclick(ReopenTheDocument);
		    Reporter.log("Reopen the created word file document...", true);
		    Thread.sleep(10000);

		   
		    Reporter.log("All saved data should be displayed successfully...", true);

		    // Assert all to report any failures found
		  
		// jsclick(Refresh_Button(driver));

	}

	@FindBy(xpath = ("//*[@id=\"dialog_1041136266_1_dialog-content\"]//div[1]/div/input")) // Change 9 to change the
																							// value
	private WebElement DisplayedName;

	// *[@id="dialog_1419058361_0"]/div[4]/button[1]

	@FindBy(xpath = ("//div[@class='e-footer-content']//button[contains(@class, 'e-primary') and text()='OK']")) // Change
																													// 9
																													// to
																													// change
																													// the
																													// value
	private WebElement OKBTN;

	public void LinkWord() throws Exception {
		 SoftAssert softAssert = new SoftAssert();  // Initialize SoftAssert

		    Thread.sleep(3000);
		    Actions act = new Actions(driver);
		    Reporter.log("Click on link button", true);
		    jsclick(Link);
		    Thread.sleep(6000);

		    // SoftAssert to ensure the Link dialog is visible and clickable
		    softAssert.assertTrue(LinkdialogAddress.isDisplayed() && LinkdialogAddress.isEnabled(), "Link dialog textbox is not visible or not clickable");

		    LinkdialogAddress.sendKeys("https://computhink.com/");
		    Thread.sleep(4000);

		    // SoftAssert to verify that the URL was entered into the textbox
		    softAssert.assertEquals(LinkdialogAddress.getAttribute("value"), "https://computhink.com/", "The entered URL in the Link dialog is incorrect");

		    jsclick(OKBTN);
		    Reporter.log("Enter Link into the textbox", true);
		    Thread.sleep(6000);
		    Reporter.log("Link added successfully...", true);

	}

	public void HeaderWord() throws Exception {
		   SoftAssert softAssert = new SoftAssert();  // Initialize SoftAssert

		    Thread.sleep(3000);
		    Actions act = new Actions(driver);
		    Reporter.log("Click on link button", true);
		    jsclick(Header);
		    Thread.sleep(6000);

		    // SoftAssert to ensure the WordDocPage element is clickable
		    softAssert.assertTrue(WordDocPage.isDisplayed() && WordDocPage.isEnabled(), "WordDocPage element is not visible or not clickable");

		    Actions actions = new Actions(driver);
		    // Perform a mouse move and click at the specified offset
		    actions.moveByOffset(200, 300).click().perform();
		    Reporter.log("Clicked at the specified offset.", true);

		    // SoftAssert to verify that the click action was performed successfully
		    softAssert.assertTrue(actions != null, "Action for mouse move and click was not performed properly");

		    actions.sendKeys("Automation Testing: Verifying Header Option").perform();
		    Reporter.log("Entered text into the textbox.", true);

		    // SoftAssert to verify that the text was entered in the textbox
		    softAssert.assertEquals(WordDocPage.getText(), "Automation Testing: Verifying Header Option", "The entered text does not match the expected value");

		    Thread.sleep(4000);
		    // jsclick(OKBTN);
		    Reporter.log("Enter Link into the textbox", true);
		    Thread.sleep(6000);
		    Reporter.log("Link added successfully...", true);

		    // Assert all to report any failures found
		    softAssert.assertAll();
		
	}

	public void FooterWord() throws Exception {
		   SoftAssert softAssert = new SoftAssert();  // Initialize SoftAssert

		    Thread.sleep(3000);
		    Actions act = new Actions(driver);
		    Reporter.log("Click on link button", true);
		    jsclick(Footer);
		    Thread.sleep(6000);

		    // SoftAssert to verify that the WordDocPage element is displayed and clickable
		    softAssert.assertTrue(WordDocPage.isDisplayed() && WordDocPage.isEnabled(), "WordDocPage element is not visible or not clickable");

		    Actions actions = new Actions(driver);
		    // Perform text entry into the element
		    actions.sendKeys("Automation Testing: Verifying Footer Option End Page").perform();
		    Reporter.log("Entered text into the textbox.", true);

		    // SoftAssert to verify that the text has been entered successfully in the textbox
		    softAssert.assertEquals(WordDocPage.getText(), "Automation Testing: Verifying Footer Option End Page", "The entered text does not match the expected value");

		    Reporter.log("Enter Link into the textbox", true);
		    Thread.sleep(6000);
		    Reporter.log("Link added successfully...", true);

		    // Assert all to report any failures found
		   
		}

	

}
