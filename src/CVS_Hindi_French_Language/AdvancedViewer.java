package CVS_Hindi_French_Language;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
	
	@FindBy(xpath = "//button[@id='navigatorTreeOk']")
	private WebElement OK_Button_BrowseforFolder;
	
	@FindBy(id = "docTypeList")
	private WebElement Click_Document_Type_Dropdown;
	
	public WebElement getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;
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
	
	
	@FindBy(xpath = "//*[@id=\"templateOK\"]")
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
	
	
	@FindBy(xpath = ("//*[@id=\"djvuViewerDiv_editor_pageContainer\"]"))
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
  


  
  @FindBy(xpath = ("//*[@id=\"messageButtonOK\"]"))
	private WebElement InvalidDilogOKBTN;  
  
  @FindBy(xpath = ("//*[@id=\"modelHome\"]"))
	private WebElement NavigateBTN;

  
  @FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
	private WebElement NavigateDocOpen;  
  
  
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
		jsclick(Setting_Icon);
		jsclick(My_Preferencesetting);
		getSelect_Office_document_Advancedviewing();
		Thread.sleep(3000);
		getSelect_PDF_document_Advancedviewing();
		Thread.sleep(6000);
		jsclick(Apply_button);
	}
	
	public void CreateDocumentAdvancedViewWordDocument() throws Exception {
		
		jsclick(Click_New_Document);
		Thread.sleep(2000);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(3000);
		 jsclick(Cabinet);
			Thread.sleep(3000);
			 jsclick(Drawer);
			Thread.sleep(5000);
			movingDoublecli(Folder, Folder);
			Thread.sleep(5000);
		
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(3000);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);
		movingclkElement(Enter_ReportName);
		sendvalue(Enter_ReportName, readFromExAdvancedView(3, 1));
		Thread.sleep(5000);
		 WebElement CreateBTN= driver.findElement(By.xpath("(//button[normalize-space()='Create'])[1]"));
		 jsclick(CreateBTN);
		 Thread.sleep(10000);
		WebElement viewOption = driver.findElement(By.xpath("(//button[normalize-space()='View'])[1]"));
		 jsclick(viewOption);
		movingElement(Move_To_PlusIcon);
		Thread.sleep(2000);
		
		jsclick(WordDocument);
		EnterFileNAmePDF.sendKeys(readFromExAdvancedView(3, 1));
		Thread.sleep(4000);
		
		jsclick(EnterFileNameOKBTN);
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
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
	 
	     
public void AdvancedViewPDFDocument() throws Exception {
	
	jsclick(Click_New_Document);
	Thread.sleep(2000);
	jsclick(Destination_Folder_Textbox);
	Thread.sleep(3000);
	 jsclick(Cabinet);
		Thread.sleep(3000);
		 jsclick(Drawer);
		Thread.sleep(5000);
		movingDoublecli(Folder, Folder);
		Thread.sleep(5000);
	jsclick(OK_Button_BrowseforFolder);
	Thread.sleep(3000);
	getSelect_Document_Type_Dropdown();
	Thread.sleep(3000);
	movingclkElement(Enter_ReportName);
	sendvalue(Enter_ReportName, "PDFAdvancedView");
	Thread.sleep(5000);
	movingElement(Move_To_PlusIcon);
	Thread.sleep(4000);
	jsclick(NewPDfDoc);
	Thread.sleep(4000);
	EnterFileNAmePDF.sendKeys(readFromExAdvancedView(2, 1));
	Thread.sleep(6000);
	
	jsclick(EnterFileNameOKBTN);
	Thread.sleep(3000);
	//jsclick(PDFDocumentPage);
	Thread.sleep(3000);
	jsclick(AdvancedTool);
	Actions act=new Actions(driver);
	//act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys("ContentverseAutomationTestingTeam").sendKeys(Keys.ENTER).sendKeys("Nisha").build().perform();
	act.click(AdvancedToolTextIcon).moveToElement(Page).click().sendKeys(readFromExAdvancedView(1, 0)).build().perform();
	    Thread.sleep(8000);
	 WebElement CreateBTN= driver.findElement(By.xpath("(//button[normalize-space()='Create'])[1]"));
	 jsclick(CreateBTN);
	 Thread.sleep(15000);
	WebElement viewOption = driver.findElement(By.xpath("(//button[normalize-space()='View'])[1]"));
	 jsclick(viewOption);
	 Thread.sleep(15000);
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
	
public void AdvancedViewExcelDocumentt() throws Exception {
	
	jsclick(Click_New_Document);
	Thread.sleep(2000);
	jsclick(Destination_Folder_Textbox);
	Thread.sleep(3000);
	 jsclick(Cabinet);
		Thread.sleep(3000);
		 jsclick(Drawer);
		Thread.sleep(5000);
		movingDoublecli(Folder, Folder);
		Thread.sleep(5000);
	jsclick(OK_Button_BrowseforFolder);
	Thread.sleep(3000);
	getSelect_Document_Type_Dropdown();
	Thread.sleep(3000);
	movingclkElement(Enter_ReportName);
	sendvalue(Enter_ReportName, readFromExAdvancedView(4, 1));
	Thread.sleep(3000);
	WebElement CreateBTN= driver.findElement(By.xpath("(//button[normalize-space()='Create'])[1]"));
	 jsclick(CreateBTN);
	 Thread.sleep(10000);
	WebElement viewOption = driver.findElement(By.xpath("(//button[normalize-space()='View'])[1]"));
	 jsclick(viewOption);
	 Thread.sleep(10000);
	movingElement(Move_To_PlusIcon);
	Thread.sleep(2000);
	jsclick(ExcelSheet);
	Thread.sleep(3000);
	EnterFileNAmePDF.sendKeys(readFromExAdvancedView(4, 1));
	Thread.sleep(4000);
	
	jsclick(EnterFileNameOKBTN);
	Actions act=new Actions(driver);
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

public void AdvancedViewPDFDocument_WithSpcialCharacterFileName() throws Exception {
	
	jsclick(Click_New_Document);
	Thread.sleep(2000);
	jsclick(Destination_Folder_Textbox);
	Thread.sleep(3000);
	 jsclick(Cabinet);
		Thread.sleep(3000);
		 jsclick(Drawer);
		Thread.sleep(5000);
		movingDoublecli(Folder, Folder);
		Thread.sleep(5000);
	jsclick(OK_Button_BrowseforFolder);
	Thread.sleep(3000);
	getSelect_Document_Type_Dropdown();
	Thread.sleep(3000);
	movingclkElement(Enter_ReportName);
	sendvalue(Enter_ReportName, "!@PDF document Negative Script");
	Thread.sleep(5000);
	movingElement(Move_To_PlusIcon);
	Thread.sleep(4000);
	jsclick(NewPDfDoc);
	Thread.sleep(4000);
	jsclick(EnterFileNameOKBTN);
	Thread.sleep(5000);
	SoftAssertEqalValidation(FileMessage, "Please enter file name ");
	Thread.sleep(3000);
	System.out.println("Validation message:"+FileMessage.getText());
	jsclick(InvalidDilogOKBTN);
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






}