package Pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Generic.BaseClass;

public class AdvancedViewer  extends BaseClass {

	
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

	public WebElement getSelect_Office_document_Advancedviewing() {
		Select sel = new Select(Select_Office_document_Advancedviewing);
		sel.selectByVisibleText("Advanced viewing");
		return Select_Office_document_Advancedviewing;
	}
	
	
	
	
	
	
	
	
	
	@FindBy(id = "defaultPdfDocViewListNo")
	private WebElement Select_PDF_document_Advancedviewing;
	
	public WebElement getSelect_PDF_document_Advancedviewing() {
		Select sel = new Select(Select_PDF_document_Advancedviewing);
		sel.selectByVisibleText("Advanced viewing");
		return Select_PDF_document_Advancedviewing;
	}
	
	
	public WebElement getSelect_PDF_document_Defviewing() {
		Select sel = new Select(Select_PDF_document_Advancedviewing);
		sel.selectByVisibleText("Default viewing");
		return Select_PDF_document_Advancedviewing;
	}
	
	@FindBy(xpath = "//a[@id='createDocument']")
	private WebElement Click_New_Document;

	@FindBy(xpath = "//input[@id='createDocuemtnLocation']")
	private WebElement Destination_Folder_Textbox;
	
	@FindBy(xpath = ("//*[@id=\"1\"]/ins"))
	private WebElement Cabinet;
	
	@FindBy(xpath = ("//*[@id=\"2\"]/ins"))
	private WebElement Drawer;
	
	
	@FindBy(xpath = ("//*[@id=\"1002\"]/a"))
	private WebElement Folder;
	
	@FindBy(xpath = "//*[@id=\"3\"]/a")
	private WebElement CaseSensitiveRoomFolder;
	
	
	
	public WebElement getCaseSensitiveRoomFolder() {
	
		return CaseSensitiveRoomFolder;
	}
	
	
	@FindBy(xpath="//*[@id=\"sendToDocuSign\"]/span")
	private WebElement DocuSign;
	
	
	@FindBy(xpath="/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[2]/ins")
	private WebElement FirstCabinet;
	
	@FindBy(xpath="/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[2]/ul/li/ins")
	private WebElement FirstDrawer;
	
	@FindBy(xpath="/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[2]/ul/li/ul/li[1]/a")
	private WebElement FirstFolder;
	
	@FindBy(xpath="//*[@id=\"documentListTable\"]//tr[1]/td[3]")//change tr number to select 2 or 4 docs tr[5]
    private WebElement FirstDocument;

	public WebElement getFirstCabinet() {
		return FirstCabinet;
	}

	public WebElement getFirstDrawer() {
		return FirstDrawer;
	}

	public WebElement getFirstFolder() {
		return FirstFolder;
	}

	public WebElement getFirstDocument() {
		return FirstDocument;
	}
	
	@FindBy(xpath="//*[@id=\"createDocument\"]")
    private static WebElement NewDocument;

	public WebElement getNewDocument() {
		return NewDocument;
	}
	
	
	@FindBy(xpath = "//*[@id=\"376\"]/a")
	private WebElement SQLRoomFolder;
	
	
	
	public WebElement getSQLRoomFolder() {
	
		return SQLRoomFolder;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@FindBy(xpath = "//button[@id='navigatorTreeOk']")
	private WebElement OK_Button_BrowseforFolder;
	
	@FindBy(id = "docTypeList")
	private WebElement Click_Document_Type_Dropdown;
	
	public WebElement getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;
	}
	
	@FindBy(xpath= "//*[@id=\"docTypeIndicesTable\"]/tbody/tr/td[2]")
	private WebElement DocumentCVRep;
	
	public WebElement getDocumentCVRep() {
		return DocumentCVRep;
		
	}
	
	
	
	@FindBy(id = "indices_33")
	private WebElement Enter_ReportName;
	
	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;
	
	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
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
	
	
	//*[@id="pdfViewerDiv_textLayer_0"]
	
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
  

  @FindBy(xpath = ("//*[@id=\"djvuViewerDiv_main_content\"]/div[1]/table/tbody/tr[1]/td[1]"))
	private WebElement ExcelSheetFirstRow; 
  

  @FindBy(xpath = ("//*[@id=\"djvuViewerDiv_main_content\"]/div[1]/table/tbody/tr[4]/td[2]"))
	private WebElement ExcelSheetFourthRow;
  
  
  @FindBy(xpath = ("//*[@id=\"pdfViewerDiv_annotation_ink\"]"))
	private WebElement DrawLinkAnnotation; 
  

//*[@id="addExcelFileMobile"]
  @FindBy(xpath = ("//*[@id=\"addExcelFileMobile\"]"))
 	private WebElement ExcelSheet;
  
  
  @FindBy(xpath = ("//*[@id=\"AutomationTestingPDFDOc.pdf\"]/div/img"))
		private WebElement PDFDocumentPage;  
  

  @FindBy(xpath = ("//*[@id=\"fabButton\"]"))
	private WebElement FAbBTN;  

  @FindBy(xpath = ("/html/body/div[19]/div/div[3]/button"))
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


  @FindBy(xpath = ("//*[@id=\"deleteMessageOk19\"]"))
 	private WebElement DeleteDialogYes;  

  
  
  @FindBy(xpath = ("//*[@id=\"docCreatorSpan1\"]"))
	private WebElement SelectUSer;  

 
  @FindBy(xpath = ("//*[@id=\"messageButtonOK\"]"))
 	private WebElement DocSignOKBTN; 
  
  
  @FindBy(xpath = ("/html/body/div[49]/div/div[4]/input"))
 	private WebElement EmailTextBox;  
  
  
  
		  @FindBy(xpath = ("/html/body/div[49]/div/div[5]/button[1]"))
	private WebElement EmailTextBoxOKBTN;  

  public void CreateDocumentAndShowThumbnail() throws Exception {
	  Thread.sleep(3000);
Reporter.log("Expand the cabinet");
	  jsclick(FirstCabinet);
	  Reporter.log("Expand the drawer");
	  Thread.sleep(2000);
	  jsclick(FirstDrawer);
	  Reporter.log("Select the folder");
	  Thread.sleep(2000);
	  jsclick(FirstFolder);
	  Thread.sleep(3000);
	//  jsclick(FirstDocument);
	  Reporter.log("Click on new document");
	  Thread.sleep(3000);
		jsclick(Click_New_Document);
		Thread.sleep(2000);
	//	jsclick(Destination_Folder_Textbox);
		
		
			Thread.sleep(5000);
		
		//jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		Reporter.log("User select document type as CVReports");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.click(DocumentCVRep).sendKeys("Thumbnail Word Document").build().perform();
		Reporter.log("Enter document name");
		Thread.sleep(5000);
		 WebElement CreateBTN= driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		 jsclick(CreateBTN);
		 Reporter.log("Click on create document");
		 Thread.sleep(10000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
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
	  Reporter.log("It will hide the thumbnail page, workinf fine...");
	  jsclick(ShowThumbnail);
	 
	  
  }
  
  
  public void DocuSignCreateDoc() throws Exception {
	  Thread.sleep(3000);
	  Reporter.log("User expand the cabinet");
	  jsclick(FirstCabinet);
	  Thread.sleep(2000);
	  Reporter.log("User expand the drawer");
	  jsclick(FirstDrawer);
	  Thread.sleep(5000);
	  jsclick(FirstFolder);
	  Reporter.log("User click on the folder");
	  Thread.sleep(3000);
	//  jsclick(FirstDocument);
	  Thread.sleep(3000);
		jsclick(Click_New_Document);
		Reporter.log("User click on new document tab");
		
		Thread.sleep(2000);
	//	jsclick(Destination_Folder_Textbox);
		
		
			Thread.sleep(5000);
		
		//jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		Reporter.log("User select a document type named as CVReports");
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.click(DocumentCVRep).sendKeys("Docu sign Document").build().perform();
		Reporter.log("User enter the document name");
		Thread.sleep(5000);
		 WebElement CreateBTN= driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		 jsclick(CreateBTN);
		 Reporter.log("User click on create button");
		 Thread.sleep(10000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		 jsclick(viewOption);
		 Reporter.log("User click on view button");
		movingElement(Move_To_PlusIcon);
		Thread.sleep(2000);
		Reporter.log("Mouse hover on browse icon");
		jsclick(WordDocument);
		Reporter.log("Select a word document from the dropdown");
		EnterFileNAmePDF.sendKeys(readFromExAdvancedView(3, 1));
		Thread.sleep(8000);
		Reporter.log("User enter a file name");
		jsclick(EnterFileNameOKBTN);
		Reporter.log("Click enter file name dialog OK BUTTON");
		Thread.sleep(3000);
		 try {
				WebDriverWait wait1 = new WebDriverWait(driver, 20);
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alt = driver.switchTo().alert();
				alt.accept();
				}
				catch(Exception e) {
					System.out.println("Alert not present");
				}
		
		
		 Thread.sleep(8000);
		 Reporter.log("User click on save button");
		    jsclick(SaveTab);
		    Thread.sleep(8000);
		    VisiblityOf(SaveTabOKBTN);
		    Reporter.log("User click on save dialog OK button");
		    jsclick(SaveTabOKBTN);
	    Thread.sleep(3000);
		jsclick(DocuSign);
		Reporter.log("Click on viewer menu docusign tool icon");
		Thread.sleep(4000);
	   jsclick(EmailTextBox);
	   Reporter.log("User enter valid mail in text box");
	   EmailTextBox.sendKeys(readFromExMail(2, 0));
	   Thread.sleep(3000);
		jsclick(EmailTextBoxOKBTN);
		Reporter.log("Click on docusign dialog OK button");
		Thread.sleep(4000);
		jsclick(DocSignOKBTN);
		Reporter.log("User click on 'Document sent for signing successsfully' message dialog OK button");
		Thread.sleep(3000);
		Reporter.log("User click on refresh button");
		jsclick(Refresh_Button(driver));
		
  }
		
  public void CreateDocumentAnd_SaveFromDocument_Fabbtn() throws Exception {
	  Thread.sleep(7000);
	Actions act=new Actions(driver);
	Reporter.log("User create document and save document by using floating button Save icon");
	act.click(WordDocPage).sendKeys(readFromExAdvancedView(2, 1)).sendKeys(Keys.ENTER).sendKeys(readFromExAdvancedView(0, 0)).build().perform();
	 Thread.sleep(8000);
	 Reporter.log("USer enter file name and click on Floating button Save icon");
	    jsclick(FAbBTN);
	    Thread.sleep(3000);
	    Reporter.log("User click on Save icon");
	    VisiblityOf(FabSaveBTN);
	    jsclick(FabSaveBTN);
	    Thread.sleep(7000);
	    Reporter.log("Document saved successfull...");
	    jsclick(SaveTabOKBTN);
	   }
  
  public void CreateDocumentAnd_Upload_NewDocument_From_FabBrowseOption() throws Exception {
   
	  Thread.sleep(4000);
	 // jsclick(FAbBTN);
    /*Thread.sleep(3000);
    ElementToBeClickable(UploadeFabBTN);
    jsclick(UploadeFabBTN);*/
    Actions act=new Actions(driver);
    Reporter.log("User add file by using floating button Browse icon");
    act.moveToElement(UploadeFabBTN).click().build().perform();
  //  Thread.sleep(3000);
    Reporter.log("Mousehover on floating button");
    Thread.sleep(10000);
    Reporter.log("Click browse icon");
    Reporter.log("User add file by using AutoIT script");
	Runtime.getRuntime().exec(
			"D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Flower or Curly bracket .exe");
	Thread.sleep(8000);
	try {
  alertIsPresent();
  acceptAlert();
	}
	catch(Exception e) {
		System.out.println("Alert is not present");
	}
	Thread.sleep(3000);
	//  jsclick(FAbBTN);
	    Thread.sleep(3000);
	    VisiblityOf(FabSaveBTN);
	    jsclick(FabSaveBTN);
	    Reporter.log("User click on floating button save icon...");
	    Thread.sleep(7000);
	    Reporter.log("Document updated successfull");
	    jsclick(SaveTabOKBTN);
  }
  
  public void CreateDocumentAnd_ViewFullScreen() throws Exception {
	    jsclick(FAbBTN);
	    Reporter.log("User mouse hover on floating button");
	    Thread.sleep(3000);
	    Reporter.log("User click on full screen view icon");
	    jsclick(viewFullScrnBTN);
	    Thread.sleep(7000);
	    Reporter.log("It shows the document full screen view");
	    jsclick(viewFullScrnBTN);
	    Thread.sleep(3000);
  }
  public void CreateDocumentAnd_DeleteFabBTN_option() throws Exception {
	    jsclick(FAbBTN);
	    Reporter.log("Mouse hover on floating button");
	    Thread.sleep(3000);
	    Reporter.log("Select thumbnail page check box");
	    jsclick(SecondPageCheckBox);
	    Thread.sleep(3000);
	    Reporter.log("Mousehover on floating button");
        jsclick(FabDeleteBTN);
        Thread.sleep(5000);
        Reporter.log("Click floating button delete icon");
        jsclick(DeleteDialogYes);
        Thread.sleep(3000);
        Reporter.log("Delete confirm dialog Yes button");
        ElementToBeClickable(DeleteOKBTN);
        jsclick(DeleteOKBTN);
        Thread.sleep(3000);
        Reporter.log("USer click on floating button save icon");
        jsclick(Refresh_Button(driver));
        Thread.sleep(5000);
        jsclick(SaveChange);
        Thread.sleep(3000);
        
  }
  
  @FindBy(xpath="//*[@id=\"messageButtonNo27\"]")
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
		 WebElement CreateBTN= driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		 jsclick(CreateBTN);
		 Thread.sleep(10000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		 jsclick(viewOption);
		movingElement(Move_To_PlusIcon);
		Thread.sleep(2000);
		
		jsclick(WordDocument);
		EnterFileNAmePDF.sendKeys(readFromExAdvancedView(3, 1));
		Thread.sleep(8000);
		
		jsclick(EnterFileNameOKBTN);
		Thread.sleep(3000);
		 
			
		Actions act=new Actions(driver);
		act.click(WordDocPage).sendKeys(readFromExAdvancedView(2, 1)).sendKeys(Keys.ENTER).sendKeys(readFromExAdvancedView(0, 0)).build().perform();
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
			Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Flower or Curly bracket .exe");
			Thread.sleep(10000);
			jsclick(CreateTableopt);
			Thread.sleep(5000);
		jsclick(TableDialogOKBTN);	
		 Thread.sleep(5000);
		/* jsclick(LinkOpt);
		LinkAddress.sendKeys("https://github.com/Vidya3011/CV_Automation.git");
		Thread.sleep(3000);
		jsclick(TableDialogOKBTN);	*/
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
  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  public static String readFromExAdvancedView(int rw,int cl) throws IOException{
		File f= new File("./data/TestData.xlsx");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new XSSFWorkbook(fis);
		Sheet mySht = wb.getSheet("AdvancedView");
		Row row = mySht.getRow(rw);
		Cell cell = row.getCell(cl);
		String name = cell.getStringCellValue();
		return name;
		}
	
  
	
	public void AdvancedViewerOption() throws Exception{
		Reporter.log("Test Scenario 1: Verify Advanced viewing functionality");
		jsclick(Setting_Icon);
		Reporter.log("User click on the setting icon");
		jsclick(My_Preferencesetting);
		Reporter.log("User click on the my preference option");
		getSelect_Office_document_Advancedviewing();
		Reporter.log("User changes the office document into advanced viewing");
		Thread.sleep(3000);
		getSelect_PDF_document_Advancedviewing();
		Reporter.log("User changes the PDF document into advanced viewing");
		Thread.sleep(6000);
		jsclick(Apply_button);
		Reporter.log("User clicked apply button");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
public void CaseSensitiveRoomAdvancedViewWordDocument() throws Exception {
		
		jsclick(Click_New_Document);
		Thread.sleep(2000);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(3000);
		 jsclick(Cabinet);
			Thread.sleep(3000);
			 jsclick(Drawer);
			Thread.sleep(5000);
			jsclick(CaseSensitiveRoomFolder);
			Thread.sleep(5000);
		
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);
		/*jsclick(DocumentCVRep);
		
		DocumentCVRep.sendKeys("CaseSenstiveWordDocument");*/
		Actions act=new Actions(driver);
		act.click(DocumentCVRep).sendKeys("CaseSenstiveWordDocument").build().perform();
		Thread.sleep(5000);
		
		movingElement(Move_To_PlusIcon);
		Thread.sleep(5000);
		
		jsclick(WordDocument);
		EnterFileNAmePDF.sendKeys(readFromExAdvancedView(3, 1));
		Thread.sleep(5000);
		ElementToBeClickable(EnterFileNameOKBTN);
		jsclick(EnterFileNameOKBTN);
		Thread.sleep(8000);
		 WebElement CreateBTN= driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		 jsclick(CreateBTN);
		 Thread.sleep(10000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		 jsclick(viewOption);
		 Thread.sleep(15000);
	//	Actions act=new Actions(driver);
		ElementToBeClickable(WordDocPage);
		act.click(WordDocPage).sendKeys(readFromExAdvancedView(2, 1)).sendKeys(Keys.ENTER).sendKeys(readFromExAdvancedView(0, 0)).build().perform();
		 Thread.sleep(10000);
		    jsclick(SaveTab);
		    Thread.sleep(8000);
		    VisiblityOf(SaveTabOKBTN);
		    jsclick(SaveTabOKBTN);
		    Thread.sleep(10000);
		jsclick(WordDocImageOpt);
		 Thread.sleep(2000);
		 movingclkElement(UploadFromCmpOpt);
		 Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Flower or Curly bracket .exe");
			Thread.sleep(10000);
			jsclick(CreateTableopt);
			Thread.sleep(5000);
		jsclick(TableDialogOKBTN);	
		 Thread.sleep(5000);
		/* jsclick(LinkOpt);
		LinkAddress.sendKeys("https://github.com/Vidya3011/CV_Automation.git");
		Thread.sleep(3000);
		jsclick(TableDialogOKBTN);	*/
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
	 
	    
	public void CreateDocumentAdvancedViewWordDocument() throws Exception {
		Reporter.log("Scenario 2: Create new word document ");
		jsclick(Click_New_Document);
		Reporter.log("User click on the new document option");
		Thread.sleep(2000);
		jsclick(Destination_Folder_Textbox);
		Reporter.log("User click on the Destination folder text box");
		Thread.sleep(3000);
		 jsclick(Cabinet);
		 Reporter.log("User expand the cabinet");
			Thread.sleep(3000);
			 jsclick(Drawer);
			 Reporter.log("User expand drawer");
			Thread.sleep(5000);
			jsclick(Folder);
			 Reporter.log("User select the folder");
			Thread.sleep(5000);
			
		jsclick(OK_Button_BrowseforFolder);
		 Reporter.log("User selected the folder successfully...");
		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		 Reporter.log("User click on the document type dropdown and select the document type successfully.");
		Thread.sleep(3000);
		movingclkElement(Enter_ReportName);
		 Reporter.log("User enter the report name");
		sendvalue(Enter_ReportName, readFromExAdvancedView(3, 1));
		Thread.sleep(5000);
		
		movingElement(Move_To_PlusIcon);
		 Reporter.log("User mouse hover on the browse icon");
		Thread.sleep(5000);
		
		jsclick(WordDocument);
		 Reporter.log("User select the word new document");
		EnterFileNAmePDF.sendKeys(readFromExAdvancedView(3, 1));
		Thread.sleep(5000);
		 Reporter.log("User enter the file name");
		ElementToBeClickable(EnterFileNameOKBTN);
		jsclick(EnterFileNameOKBTN);
		 Reporter.log("click on the enter file name OK button");
		Thread.sleep(8000);
		 WebElement CreateBTN= driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		 jsclick(CreateBTN);
		 Reporter.log("User click on the create button");
		 Thread.sleep(10000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		 jsclick(viewOption);
		 Reporter.log("User click on the view option");
		 Thread.sleep(15000);
		Actions act=new Actions(driver);
		ElementToBeClickable(WordDocPage);
		act.click(WordDocPage).sendKeys(readFromExAdvancedView(2, 1)).sendKeys(Keys.ENTER).sendKeys(readFromExAdvancedView(0, 0)).build().perform();
		 Reporter.log("Enter the data in the created sheet");
		Thread.sleep(10000);
		    jsclick(SaveTab);
		    Reporter.log("click on the save button");
		    Thread.sleep(8000);
		    VisiblityOf(SaveTabOKBTN);
		    jsclick(SaveTabOKBTN);
		    Reporter.log("click on save successfull dialog ok button");
		    Thread.sleep(10000);
		jsclick(WordDocImageOpt);
		 Reporter.log("click on image option");
		 Thread.sleep(2000);
		 movingclkElement(UploadFromCmpOpt);
		 Reporter.log("select the upload from computer option");
		 Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Flower or Curly bracket .exe");
			Thread.sleep(10000);
			 Reporter.log("Using Auto IT successfully added the image from folder");
			jsclick(CreateTableopt);
			 Reporter.log("Click on table option");
			Thread.sleep(5000);
		jsclick(TableDialogOKBTN);
		 Reporter.log("Added the two table box into the page, successfully");
		 Thread.sleep(5000);
		/* jsclick(LinkOpt);
		LinkAddress.sendKeys("https://github.com/Vidya3011/CV_Automation.git");
		Thread.sleep(3000);
		jsclick(TableDialogOKBTN);	*/
		Thread.sleep(3000);
		act.click(WordDocPage).sendKeys(readFromExAdvancedView(1, 1)).build().perform();
		 Reporter.log("given the data inside the table");
		 Thread.sleep(5000);
		    jsclick(SaveTab);
		    Reporter.log("Click on the save button");
		    Thread.sleep(3000);
		    VisiblityOf(SaveTabOKBTN);
		    jsclick(SaveTabOKBTN);
		    Reporter.log("The data which are added has been updated successfully...");
		    Thread.sleep(8000);
		    jsclick(CloseIcon);
		    Reporter.log("user click on the close icon");
		    Thread.sleep(3000);
		    VisiblityOf(ReopenTheDocument);
		    Reporter.log("User reopen the saved word document...");
		    jsclick(ReopenTheDocument);
		    Thread.sleep(10000);
		    Reporter.log("All saved datas are visible on the page there is no issues...");
		    jsclick(Refresh_Button(driver));
	}
	 
	public void AdvancedViewPDFDocumentCaseSensitive() throws Exception {
		
		jsclick(Click_New_Document);
		Thread.sleep(2000);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(3000);
		 jsclick(Cabinet);
			Thread.sleep(3000);
			 jsclick(Drawer);
			Thread.sleep(5000);
			jsclick(CaseSensitiveRoomFolder);
			Thread.sleep(5000);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.click(DocumentCVRep).sendKeys("CaseSenstiveWordDocument").build().perform();
		
		Thread.sleep(5000);
		movingElement(Move_To_PlusIcon);
		Thread.sleep(4000);
		jsclick(NewPDfDoc);
		Thread.sleep(4000);
		EnterFileNAmePDF.sendKeys(readFromExAdvancedView(2, 1));
		Thread.sleep(6000);
		
		jsclick(EnterFileNameOKBTN);
		Thread.sleep(5000);
		//jsclick(PDFDocumentPage);
		 WebElement CreateBTN= driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		 jsclick(CreateBTN);
		 Thread.sleep(15000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		 jsclick(viewOption);
		Thread.sleep(8000);
		jsclick(AdvancedTool);
		Thread.sleep(4000);
		//Actions act=new Actions(driver);
		//act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys("ContentverseAutomationTestingTeam").sendKeys(Keys.ENTER).sendKeys("Nisha").build().perform();
	/*	act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys(readFromExAdvancedView(1, 0)).build().perform();
		    Thread.sleep(8000);
		
		 Thread.sleep(15000);*/
		    act.click(AddComment).moveToElement(Page).click().build().perform();
		    Thread.sleep(5000);
		    jsclick(SaveTab);
		    Thread.sleep(7000);
		    VisiblityOf(SaveTabOKBTN);
		    jsclick(SaveTabOKBTN);
		    Thread.sleep(8000);
		   /* jsclick(CloseIcon);
		    Thread.sleep(3000);
		    VisiblityOf(ReopenTheDocument);
		    jsclick(ReopenTheDocument);
		   
		    Thread.sleep(8000);*/
		    ElementToBeClickable(AdvancedToolTextIcon);
		    act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys(readFromExAdvancedView(0, 1)).sendKeys(Keys.ENTER).sendKeys(readFromExAdvancedView(1, 1)).build().perform();
		    //act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys("ContentverseAutomationTestingTeamPDFDocument").build().perform();
			Thread.sleep(8000);
			 act.click(AddComment).moveToElement(Page).click().build().perform();
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
		    Thread.sleep(4000);
	}
		  
	
	public void AdvancedViewExcelDocumenttCaseSensitive() throws Exception {
		
		jsclick(Click_New_Document);
		Thread.sleep(2000);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(3000);
		 jsclick(Cabinet);
			Thread.sleep(3000);
			 jsclick(Drawer);
			Thread.sleep(5000);
			jsclick(CaseSensitiveRoomFolder);
			Thread.sleep(5000);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.click(DocumentCVRep).sendKeys("CaseSenstiveWordDocument").build().perform();
		
		Thread.sleep(5000);
		WebElement CreateBTN= driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		 jsclick(CreateBTN);
		 Thread.sleep(10000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		 jsclick(viewOption);
		 Thread.sleep(10000);
		movingElement(Move_To_PlusIcon);
		Thread.sleep(2000);
		jsclick(ExcelSheet);
		Thread.sleep(3000);
		EnterFileNAmePDF.sendKeys(readFromExAdvancedView(4, 1));
		Thread.sleep(4000);
		
		jsclick(EnterFileNameOKBTN);
		//Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.click(ExcelSheetFirstRow).sendKeys(readFromExAdvancedView(2, 0)).build().perform();
		Thread.sleep(3000);
		act.click(ExcelSheetFourthRow).sendKeys(readFromExAdvancedView(3, 0)).build().perform();
		Thread.sleep(5000);
	    jsclick(SaveTab);
	    Thread.sleep(7000);
	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Thread.sleep(8000);
	    jsclick(CloseIcon);
	    Thread.sleep(3000);
	    VisiblityOf(ReopenTheDocument);
	    jsclick(ReopenTheDocument);
	    Thread.sleep(8000);
	    jsclick(Refresh_Button(driver));
	    Thread.sleep(3000);
	}

public void AdvancedViewPDFDocument() throws Exception {
	Reporter.log("Scenario 3: Create new PDF document ");
	jsclick(Click_New_Document);
	Reporter.log("User click on the new document option");
	Thread.sleep(2000);
	jsclick(Destination_Folder_Textbox);
	Reporter.log("User click on the Destination folder text box");
	Thread.sleep(3000);
	 jsclick(Cabinet);
	 Reporter.log("User expand the cabinet");
		Thread.sleep(3000);
		 jsclick(Drawer);
		 Reporter.log("User expand drawer");
		Thread.sleep(5000);
		jsclick(Folder);
		 Reporter.log("User select the folder");
		Thread.sleep(5000);
		
	jsclick(OK_Button_BrowseforFolder);
	 Reporter.log("User selected the folder successfully...");
	Thread.sleep(3000);
	getSelect_Document_Type_Dropdown();
	 Reporter.log("User click on the document type dropdown and select the document type successfully.");
	Thread.sleep(3000);
	movingclkElement(Enter_ReportName);
	 Reporter.log("User enter the report name");
	sendvalue(Enter_ReportName, readFromExAdvancedView(2, 1));
	Thread.sleep(5000);
	
	movingElement(Move_To_PlusIcon);
	Reporter.log("Mouse hover on the browse icon");
	Thread.sleep(4000);
	jsclick(NewPDfDoc);
	Reporter.log("Add new pdf document");
	Thread.sleep(4000);
	EnterFileNAmePDF.sendKeys(readFromExAdvancedView(2, 1));
	Thread.sleep(6000);
	
	jsclick(EnterFileNameOKBTN);
	 Reporter.log("User click on the file name ok button");
	Thread.sleep(5000);
	//jsclick(PDFDocumentPage);
	 WebElement CreateBTN= driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
	 jsclick(CreateBTN);
	 Reporter.log("User click on the create button");
	 Thread.sleep(15000);
	WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
	 jsclick(viewOption); Reporter.log("click on the view option");
	Thread.sleep(8000);
	jsclick(AdvancedTool);
	Reporter.log("Click on advanced tool");
	Thread.sleep(4000);
	Actions act=new Actions(driver);
	//act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys("ContentverseAutomationTestingTeam").sendKeys(Keys.ENTER).sendKeys("Nisha").build().perform();
	act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys(readFromExAdvancedView(1, 0)).build().perform();
	    Thread.sleep(8000);
	    Reporter.log("Click on the advanced tool free text icon, enter the data");
	
	 Thread.sleep(15000);
	    act.click(AddComment).moveToElement(Page).click().build().perform();
	    Reporter.log("Click on the comment icon, add the comment");
	    Thread.sleep(5000);
	    jsclick(SaveTab);
	    Thread.sleep(7000);
	    VisiblityOf(SaveTabOKBTN);
	    Reporter.log("Click on save icon");
	    jsclick(SaveTabOKBTN);
	    Reporter.log("document saved successfully");
	    Thread.sleep(8000);
	   /* jsclick(CloseIcon);
	    Thread.sleep(3000);
	    VisiblityOf(ReopenTheDocument);
	    jsclick(ReopenTheDocument);
	   
	    Thread.sleep(8000);*/
	    ElementToBeClickable(AdvancedToolTextIcon);
	    act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys(readFromExAdvancedView(0, 1)).sendKeys(Keys.ENTER).sendKeys(readFromExAdvancedView(1, 1)).build().perform();
	    //act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys("ContentverseAutomationTestingTeamPDFDocument").build().perform();
		Thread.sleep(8000);
		 act.click(AddComment).moveToElement(Page).click().build().perform();
	    Thread.sleep(5000);
	    jsclick(SaveTab);
	    Thread.sleep(3000);
	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Thread.sleep(8000);
	    jsclick(CloseIcon);
	    Reporter.log("Click on the close icon");
	    Thread.sleep(3000);
	    VisiblityOf(ReopenTheDocument);
	    Reporter.log("Reopen the document again");
	    jsclick(ReopenTheDocument);
	    Thread.sleep(10000);
	  
	    jsclick(Refresh_Button(driver));
	    Reporter.log("  All saved datas are visible on the page there is no data loss...");
	    Thread.sleep(4000);
}
	

public void AdvancedViewExcelDocumentt() throws Exception {
	
	Reporter.log("Scenario 4: Create new Excel document ");
	jsclick(Click_New_Document);
	Reporter.log("User click on the new document option");
	Thread.sleep(2000);
	jsclick(Destination_Folder_Textbox);
	Reporter.log("User click on the Destination folder text box");
	Thread.sleep(3000);
	 jsclick(Cabinet);
	 Reporter.log("User expand the cabinet");
		Thread.sleep(3000);
		 jsclick(Drawer);
		 Reporter.log("User expand drawer");
		Thread.sleep(5000);
		jsclick(Folder);
		 Reporter.log("User select the folder");
		Thread.sleep(5000);
		
	jsclick(OK_Button_BrowseforFolder);
	 Reporter.log("User selected the folder successfully...");
	Thread.sleep(3000);
	getSelect_Document_Type_Dropdown();
	 Reporter.log("User click on the document type dropdown and select the document type successfully.");
	Thread.sleep(3000);
	movingclkElement(Enter_ReportName);
	 Reporter.log("User enter the report name");
	sendvalue(Enter_ReportName, readFromExAdvancedView(4, 1));
	Thread.sleep(5000);
	
	
	WebElement CreateBTN= driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
	 jsclick(CreateBTN);
	 Reporter.log("Click on the create button");
	 Thread.sleep(10000);
	WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
	 jsclick(viewOption);
	 Reporter.log("Click on view option");
	 Thread.sleep(10000);
	movingElement(Move_To_PlusIcon);
	 Reporter.log("Move to browse icon");
	Thread.sleep(2000);
	jsclick(ExcelSheet);
	Reporter.log("Select new excel spread sheet");
	Thread.sleep(3000);
	EnterFileNAmePDF.sendKeys(readFromExAdvancedView(4, 1));
	 Reporter.log("Enter the file name");
	Thread.sleep(4000);
	
	jsclick(EnterFileNameOKBTN);
	 Reporter.log("Click file name OK button");
	Actions act=new Actions(driver);
	Thread.sleep(3000);
	act.click(ExcelSheetFirstRow).sendKeys(readFromExAdvancedView(2, 0)).build().perform();
	Thread.sleep(3000);
	Reporter.log("Enter data in the first row");
	act.click(ExcelSheetFourthRow).sendKeys(readFromExAdvancedView(3, 0)).build().perform();
	 Reporter.log("Enter data in the second row");
	Thread.sleep(5000);
    jsclick(SaveTab);
    Reporter.log("Click on the save button");
    Thread.sleep(7000);
    VisiblityOf(SaveTabOKBTN);
    jsclick(SaveTabOKBTN); 
    Reporter.log("Click on save successfull dialog box ok button");
    Thread.sleep(8000);
    jsclick(CloseIcon);
    Reporter.log("Click on close icon");
    Thread.sleep(3000);
    VisiblityOf(ReopenTheDocument);
    jsclick(ReopenTheDocument);
    Reporter.log("Reopen the document again");
    Thread.sleep(8000);
    Reporter.log("The document shows all saved data there is no data loss...");
    jsclick(Refresh_Button(driver));
    Thread.sleep(3000);
}

public void AdvancedViewPDFDocument_WithSpcialCharacterFileName() throws Exception {
	
	jsclick(Click_New_Document);
	Reporter.log("User click on new document tab");
	Thread.sleep(2000);
	jsclick(Destination_Folder_Textbox);
	Reporter.log("User click on destination folder text box");
	Thread.sleep(3000);
	 jsclick(Cabinet);
	 Reporter.log("User expand the cabinet");
		Thread.sleep(3000);
		 jsclick(Drawer);
		 Reporter.log("User expand the drawer");
		Thread.sleep(5000);
		selectElement(Folder);
		Reporter.log("User click select the folder");
		Thread.sleep(5000);
		Reporter.log("User click on Browse folder OK button");
	jsclick(OK_Button_BrowseforFolder);
	Thread.sleep(3000);
	Reporter.log("User select a document type as CVReports");
	getSelect_Document_Type_Dropdown();
	Thread.sleep(3000);
	movingclkElement(Enter_ReportName);
	Reporter.log("User enter document name");
	sendvalue(Enter_ReportName, "!@PDF document Negative Script");
	Thread.sleep(5000);
	movingElement(Move_To_PlusIcon);
	Reporter.log("Mouse hover on browse icon");
	Thread.sleep(4000);
	jsclick(NewPDfDoc);
	Reporter.log("User select new pdfdocument from dropdown");
	Thread.sleep(4000);
	jsclick(EnterFileNameOKBTN);
	Reporter.log("User click on file name dialog OK button");
	Thread.sleep(5000);
	Reporter.log("It will show please enter file name warning message, warning message displayed successfull...Negative scenario passed");
	SoftAssertEqalValidation(FileMessage, "Please enter file name ");
	Thread.sleep(3000);
	System.out.println("Validation message:"+FileMessage.getText());
	jsclick(InvalidDilogOKBTN);
	Reporter.log("User click on invalid dialog OK button");
	Thread.sleep(4000);
	EnterFileNAmePDF.sendKeys("<?Pdf Document");
	Thread.sleep(6000);
	
	jsclick(EnterFileNameOKBTN);
	Thread.sleep(3000);
	//jsclick(PDFDocumentPage);
	Thread.sleep(3000);
	/*WebElement viewOption = driver.findElement(By.xpath("(//button[normalize-space()='View'])[1]"));
	 jsclick(viewOption);
	 Thread.sleep(7000);
	 jsclick(Refresh_Button(driver));*/
     jsclick(NavigateBTN);
     Thread.sleep(18000);
     jsclick(NavigateDocOpen);
	
}


public void CreateDocumentAdvancedViewWordDocument_SQL() throws Exception {
	
	jsclick(Click_New_Document);
	Thread.sleep(2000);
	jsclick(Destination_Folder_Textbox);
	Thread.sleep(3000);
	 jsclick(Cabinet);
		Thread.sleep(3000);
		 jsclick(Drawer);
		Thread.sleep(5000);
		jsclick(SQLRoomFolder);
		Thread.sleep(5000);
	
	jsclick(OK_Button_BrowseforFolder);
	Thread.sleep(3000);
	getSelect_Document_Type_Dropdown();
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.click(DocumentCVRep).sendKeys("New word document").build().perform();
	Thread.sleep(5000);
	
	movingElement(Move_To_PlusIcon);
	Thread.sleep(5000);
	
	jsclick(WordDocument);
	EnterFileNAmePDF.sendKeys(readFromExAdvancedView(3, 1));
	Thread.sleep(5000);
	ElementToBeClickable(EnterFileNameOKBTN);
	jsclick(EnterFileNameOKBTN);
	Thread.sleep(8000);
	 WebElement CreateBTN= driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
	 jsclick(CreateBTN);
	 Thread.sleep(10000);
	WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
	 jsclick(viewOption);
	 Thread.sleep(15000);
	//Actions act=new Actions(driver);
	ElementToBeClickable(WordDocPage);
	act.click(WordDocPage).sendKeys(readFromExAdvancedView(2, 1)).sendKeys(Keys.ENTER).sendKeys(readFromExAdvancedView(0, 0)).build().perform();
	 Thread.sleep(10000);
	    jsclick(SaveTab);
	    Thread.sleep(8000);
	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Thread.sleep(10000);
	jsclick(WordDocImageOpt);
	 Thread.sleep(2000);
	 movingclkElement(UploadFromCmpOpt);
	 Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Flower or Curly bracket .exe");
		Thread.sleep(15000);
		jsclick(CreateTableopt);
		Thread.sleep(5000);
	jsclick(TableDialogOKBTN);	
	 Thread.sleep(5000);
	/* jsclick(LinkOpt);
	LinkAddress.sendKeys("https://github.com/Vidya3011/CV_Automation.git");
	Thread.sleep(3000);
	jsclick(TableDialogOKBTN);	*/
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
 
public void AdvancedViewPDFDocument_SQL() throws Exception {
	
	jsclick(Click_New_Document);
	Thread.sleep(2000);
	jsclick(Destination_Folder_Textbox);
	Thread.sleep(2000);
	Thread.sleep(3000);
	WebElement AutomationCab = driver.findElement(By.xpath("//*[@id=\"144\"]/ins"));
	jsclick(AutomationCab);
	Thread.sleep(2000);
	WebElement AutomationDrawer = driver.findElement(By.xpath("//*[@id=\"145\"]/ins"));
	jsclick(AutomationDrawer);
	Thread.sleep(2000);
	WebElement AutomationFolder = driver.findElement(By.xpath("//*[@id=\"434\"]/a"));
	jsclick(AutomationFolder);
	Thread.sleep(2000);

	jsclick(OK_Button_BrowseforFolder);
	Thread.sleep(3000);
	getSelect_Document_Type_Dropdown();
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.click(DocumentCVRep).sendKeys("New pdf document").build().perform();
	
	Thread.sleep(3000);
	movingElement(Move_To_PlusIcon);
	Thread.sleep(4000);
	jsclick(NewPDfDoc);
	Thread.sleep(3000);
	EnterFileNAmePDF.sendKeys(readFromExAdvancedView(2, 1));
	Thread.sleep(4000);
	
	jsclick(EnterFileNameOKBTN);
	Thread.sleep(3000);
	//jsclick(PDFDocumentPage);
	 WebElement CreateBTN= driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
	 jsclick(CreateBTN);
	 Thread.sleep(4000);
	WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
	 jsclick(viewOption);
	 try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
			}
			catch(Exception e) {
				System.out.println("Alert not present");
			}
	//Thread.sleep(8000);
	/*jsclick(AdvancedTool);
	Thread.sleep(4000);
	//Actions act=new Actions(driver);
	//act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys("ContentverseAutomationTestingTeam").sendKeys(Keys.ENTER).sendKeys("Nisha").build().perform();
	act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys(readFromExAdvancedView(1, 0)).build().perform();
	    Thread.sleep(8000);
	
	 Thread.sleep(15000);
	    act.click(AddComment).moveToElement(Page).click().build().perform();
	    Thread.sleep(5000);
	    jsclick(SaveTab);
	    Thread.sleep(7000);
	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Thread.sleep(8000);*/
	   /* jsclick(CloseIcon);
	    Thread.sleep(3000);
	    VisiblityOf(ReopenTheDocument);
	    jsclick(ReopenTheDocument);
	   
	    Thread.sleep(8000);*/
	  /*  ElementToBeClickable(AdvancedToolTextIcon);
	    act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys(readFromExAdvancedView(0, 1)).sendKeys(Keys.ENTER).sendKeys(readFromExAdvancedView(1, 1)).build().perform();
	    //act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys("ContentverseAutomationTestingTeamPDFDocument").build().perform();
		Thread.sleep(8000);
		 act.click(AddComment).moveToElement(Page).click().build().perform();
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
	    Thread.sleep(4000);*/
}
	  

public void AdvancedViewExcelDocumentt_SQL() throws Exception {
	
	jsclick(Click_New_Document);
	Thread.sleep(2000);
	jsclick(Destination_Folder_Textbox);
	Thread.sleep(3000);
	 jsclick(Cabinet);
		Thread.sleep(3000);
		 jsclick(Drawer);
		Thread.sleep(5000);
		jsclick(SQLRoomFolder);
		Thread.sleep(5000);
	jsclick(OK_Button_BrowseforFolder);
	Thread.sleep(3000);
	getSelect_Document_Type_Dropdown();
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.click(DocumentCVRep).sendKeys("New excel document").build().perform();
	
	Thread.sleep(5000);
	WebElement CreateBTN= driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
	 jsclick(CreateBTN);
	 Thread.sleep(10000);
	WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
	 jsclick(viewOption);
	 Thread.sleep(10000);
	movingElement(Move_To_PlusIcon);
	Thread.sleep(2000);
	jsclick(ExcelSheet);
	Thread.sleep(3000);
	EnterFileNAmePDF.sendKeys(readFromExAdvancedView(4, 1));
	Thread.sleep(4000);
	
	jsclick(EnterFileNameOKBTN);
	//Actions act=new Actions(driver);
	Thread.sleep(3000);
	act.click(ExcelSheetFirstRow).sendKeys(readFromExAdvancedView(2, 0)).build().perform();
	Thread.sleep(3000);
	act.click(ExcelSheetFourthRow).sendKeys(readFromExAdvancedView(3, 0)).build().perform();
	Thread.sleep(5000);
    jsclick(SaveTab);
    Thread.sleep(7000);
    VisiblityOf(SaveTabOKBTN);
    jsclick(SaveTabOKBTN);
    Thread.sleep(8000);
    jsclick(CloseIcon);
    Thread.sleep(3000);
    VisiblityOf(ReopenTheDocument);
    jsclick(ReopenTheDocument);
    Thread.sleep(8000);
    jsclick(Refresh_Button(driver));
    Thread.sleep(3000);
}













}