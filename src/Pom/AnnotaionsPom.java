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

public class AnnotaionsPom  extends BaseClass {

	public static WebElement element = null;

	public AnnotaionsPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("(//a[@id='navigationMenuBtn'])[1]"))
	private WebElement RoomContextTab;

	@FindBy(xpath = ("//*[@id=\"1\"]/ins"))
	private WebElement Cabinet;

	@FindBy(xpath = ("//*[@id=\"2\"]/ins"))
	private WebElement Drawer;

	@FindBy(xpath = ("//*[@id=\"78712\"]/a"))
	private WebElement Folder;
	
	@FindBy(xpath = ("//td[text()='AutomationTestingDocumentsPleaseDontTouchThis']"))
	private WebElement OpenDocument;
	
	
	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
	private WebElement OpenDocument1;
	
	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
	private WebElement OpenDocumentSQL;
	
	
	public WebElement getOpenDocumentSQL() {
		return OpenDocumentSQL;
		
	}
	
	
	@FindBy(xpath = ("(//span[@class='icon annotationRoot'])[1]"))
	private WebElement AnnotationTab;
	
	@FindBy(xpath = ("//*[@id=\"30\"]/ins"))
	private WebElement CabinetCSR;

	@FindBy(xpath = ("//*[@id=\"31\"]/ins"))
	private WebElement DrawerCSR;

	@FindBy(xpath = ("//*[@id=\"32\"]/a"))
	private WebElement FolderCSR;
	
	@FindBy(xpath = ("(//a[normalize-space()='My Preferences'])[1]"))
	private WebElement MyPreference ;
	
	
	@FindBy(xpath = ("//*[@id=\"lockenable1\"]"))
	private WebElement Redaction;
	
	@FindBy(xpath = ("//*[@id=\"unlockObject\"]"))
	private WebElement UnLockRedaction;
	
	@FindBy(xpath = ("//*[@id=\"lockdisable6\"]"))
	private WebElement HighLight;
	
	
	@FindBy(xpath = ("//*[@id=\"lockdisable8\"]"))
	private WebElement StickyNote;
	
	
	@FindBy(xpath = ("//*[@id=\"lockdisable7\"]"))
	private WebElement RubberStamp;
	
	@FindBy(xpath = ("(//span[text()='Stamp'])[1]"))
	private WebElement stamp;
	

	@FindBy(xpath = ("//*[@id=\"lockdisable1\"]"))
	private WebElement Line;
	

	@FindBy(xpath = ("//*[@id=\"lockdisable2\"]"))
	private WebElement Rectangle;
	
	@FindBy(xpath = ("//*[@id=\"lockdisable3\"]"))
	private WebElement ellipse;
	
	@FindBy(xpath = ("//*[@id=\"lockdisable4\"]"))
	private WebElement polygon;
	
	@FindBy(xpath = ("//*[@id=\"lockdisable5\"]"))
	private WebElement freeHand;
	
	@FindBy(xpath = ("//*[@id=\"signatureAdd\"]"))
	private WebElement Singature;
	
	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement Page;
	
	@FindBy(xpath = ("(//img[@class='imgP'])[2]"))
	private WebElement StampPage;
	
	@FindBy(xpath = ("//*[@id=\"objectName\"]"))
	private WebElement RedName;
	
	@FindBy(xpath = ("//*[@id=\"fabButton\"]"))
	private WebElement fabbtn;
	
	
	@FindBy(xpath = ("//*[@id=\"dlgInput_Input\"]"))
	private WebElement RedactionPassword;
	
	
	@FindBy(xpath = ("//*[@id=\"objectConfirmPassword\"]"))
	private WebElement RedactionCnfrmPassword;
	
	@FindBy(xpath = ("//*[@id=\"dlgInput_Apply\"]"))
	private WebElement RedactionOKBTN;
	
	
	@FindBy(xpath = ("//*[@id=\"dlgInput_Input\"]"))
	private WebElement unRedactionPassword;
	
	@FindBy(xpath = ("//*[@id=\"dlgInput_Apply\"]"))
	private WebElement unRedactionPwdOKBTN;
	
	
	@FindBy(xpath = ("//*[@id=\"contentTextArea\"]"))
	private WebElement stickyNoteTextbOX;
	
	@FindBy(xpath = ("//*[@id=\"saveRedactionPwdBtn\"]"))
	private WebElement stickyNoteTextbOXokBTN;
	
	
	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/canvas"))
	private WebElement showstickynote;
	
	@FindBy(xpath = ("(//li[normalize-space()='RubberStamp'])[1]"))
	private WebElement RubberStampDropdown;
	
	
	
	
	
	@FindBy(xpath = ("(//select[@class='dropdown-button'])[1]"))
	private WebElement selectDropdownRubberstamp;
	
	
	
	@FindBy(xpath = ("(//select[@class='dropdown-button'])[1]"))
	private WebElement selectbyInd;
	
	
	@FindBy(xpath = ("(//span[@class='text'][normalize-space()='Stamp'])[1]"))
	private WebElement Stampannota;
	
    @FindBy(xpath = ("(//input[@id='uploadBitMapPicture'])[1]"))
			private WebElement openfileStamp;
	
     @FindBy(xpath = ("(//button[@id='dlgInput_Apply'])[1]"))
			private WebElement openfileStampOKBTN;
     
     @FindBy(xpath = ("(//div[@class='gutter gutter-vertical'])[1]"))
		private WebElement ReleseForAnnotation;
     
     
     @FindBy(xpath = ("//div[@id='saveAddedPages']//span[1]"))
		private WebElement SaveTab;
     
     @FindBy(xpath = ("(//button[@id='messageButtonOK42'])[1]"))
		private WebElement SaveTabOKBTN;
  
     @FindBy(xpath =("//*[@id=\"toolbarId\"]/div[2]"))
     private WebElement rectanglerelease;
     
     
     @FindBy(xpath =("//*[@id=\"cvDocumentClose\"]/span"))
     private WebElement PageCloseIcon;
     
     
     
     public WebElement getPageCloseIcon() {
		return PageCloseIcon;
    	 
     }
     
     public static String readFromRoomCntxt(int rw, int cl) throws IOException {
 		File f = new File("./data/TestData.xlsx");
 		FileInputStream fis = new FileInputStream(f);
 		Workbook wb = new XSSFWorkbook(fis);
 		Sheet mySht = wb.getSheet("RoomContext");
 		Row row = mySht.getRow(rw);
 		Cell cell = row.getCell(cl);
 		String name = cell.getStringCellValue();
 		return name;
 	}
  
 	@FindBy(xpath = "//*[@id=\"editproperties_79407\"]")
 	private WebElement Update_Button;

 	public WebElement getUpdateDutch_Button() {
 		return Update_Button;
 	}
 	
 	@FindBy(linkText = "ReportName")
	private WebElement ReportName;

	public WebElement getReportName() {
		return ReportName;

	}  
 	
 	
 	@FindBy(xpath = "//*[@id=\"rubberBandInteractiveMode_shortcut\"]/span")
	private WebElement ClickOCR;

	public WebElement getClickOCR() throws Exception {
		return ClickOCR;
	}
     
     @FindBy(xpath = "//*[@id=\"imageViewerDiv\"]/div[2]/canvas")
 	private WebElement setOCR;

 	public WebElement getSet_OCR_ToDocument() throws Exception {

 		Actions action = new Actions(driver);
 		WebElement element = setOCR;
 		action.dragAndDropBy(element, -300, -20).build().perform();
 		jsclick(setOCR);
 		return element;

 	}

 	public WebElement getSet_OCR_ToDocumentPDF() throws Exception {

 		Actions action = new Actions(driver);
 		WebElement element = setOCR;
 		action.dragAndDropBy(element, -150, -20).build().perform();
 		jsclick(setOCR);
 		return element;

 	}
     
     
     
     
public void RedactionAnnotationCSR() throws Exception {
	
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		jsclick(RoomContextTab);
		jsclick(CabinetCSR);
		Thread.sleep(3000);
		movingDoublecli(DrawerCSR, DrawerCSR);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(FolderCSR));
		movingDoublecli(FolderCSR, FolderCSR);
		Thread.sleep(8000);
        jsclick(OpenDocument); 
		Thread.sleep(2000);
		try {
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		}
		catch(Exception e) {
			System.out.println("Alert is not present");
		}
		Thread.sleep(8000);
		movingElement(AnnotationTab);
	   VisiblityOf(Redaction);
		
		Thread.sleep(2000);
	//	WebElement fabbtn = driver.findElement(By.xpath("//*[@id=\"fabButton\"]"));
	    Actions act=new Actions(driver);
		act.click(Redaction).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
	    Thread.sleep(3000);
		sendvalue(RedName, readFromRoomCntxt(1, 2));
		Thread.sleep(2000);
	    sendvalue(RedactionPassword, readFromRoomCntxt(2, 2));
	    Thread.sleep(3000);
	    sendvalue(RedactionCnfrmPassword,  readFromRoomCntxt(2, 2));
	    Thread.sleep(3000);
	    jsclick(RedactionOKBTN);
	    Thread.sleep(8000);
	   
	    movingElement(AnnotationTab);
	    Thread.sleep(3000);
	    VisiblityOf(UnLockRedaction);
	    jsclick(UnLockRedaction);
	   Thread.sleep(3000); 
	    sendvalue(unRedactionPassword,readFromRoomCntxt(2, 2));
	    Thread.sleep(3000);
	    jsclick(unRedactionPwdOKBTN);
	    Thread.sleep(6000);
	    act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
	    Thread.sleep(10000);
	    jsclick(SaveTab);
	    Thread.sleep(3000);
	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Thread.sleep(8000);
	    
	   }
	 
     
     
     
	public void RedactionAnnotationSQL() throws Exception {
		Language pojo = new Language();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		jsclick(RoomContextTab);
		Thread.sleep(4000);
		Thread.sleep(3000);
		WebElement AutomationCab = driver.findElement(By.xpath("//*[@id=\"144\"]/ins"));
		jsclick(AutomationCab);
		Thread.sleep(4000);
		WebElement AutomationDrawer = driver.findElement(By.xpath("//*[@id=\"145\"]/ins"));
		jsclick(AutomationDrawer);
		Thread.sleep(4000);
		WebElement AutomationFolder = driver.findElement(By.xpath("//*[@id=\"146\"]/a"));
		jsclick(AutomationFolder);
		
		
		Thread.sleep(6000);
		
		jsclick(pojo.getNewDocuments_MenuOption());
		Thread.sleep(4000);
//		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		pojo.getEnter_Report_Name_Text_SQL().sendKeys("Default viewing annotation");
		Thread.sleep(4000);
	
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Percentage .exe");
		Thread.sleep(5000);
	
		try {
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		}
		catch(Exception e) {
			System.out.println("Alert is not present");
		}
		
		
		Thread.sleep(8000);
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hyphen.exe");
		Thread.sleep(9000);
		Thread.sleep(4000);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(4000);
		jsclick(pojo.getNavigate_Button_view());
		Thread.sleep(9000);
		movingElement(AnnotationTab);
		
	   VisiblityOf(Redaction);
		
		Thread.sleep(2000);
	//	WebElement fabbtn = driver.findElement(By.xpath("//*[@id=\"fabButton\"]"));
	    Actions act=new Actions(driver);
		act.click(Redaction).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
	    Thread.sleep(3000);
		sendvalue(RedName, readFromRoomCntxt(1, 2));
		Thread.sleep(2000);
	    sendvalue(RedactionPassword, readFromRoomCntxt(2, 2));
	    Thread.sleep(3000);
	    sendvalue(RedactionCnfrmPassword,  readFromRoomCntxt(2, 2));
	    Thread.sleep(3000);
	    jsclick(RedactionOKBTN);
	    Thread.sleep(8000);
	   
	    movingElement(AnnotationTab);
	    Thread.sleep(3000);
	    VisiblityOf(UnLockRedaction);
	    jsclick(UnLockRedaction);
	   Thread.sleep(3000); 
	    sendvalue(unRedactionPassword,readFromRoomCntxt(2, 2));
	    Thread.sleep(3000);
	    jsclick(unRedactionPwdOKBTN);
	    Thread.sleep(6000);
	    act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
	    Thread.sleep(10000);
	    jsclick(SaveTab);
	    Thread.sleep(3000);
	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Thread.sleep(8000);
	    
	   }
public void RedactionAnnotation() throws Exception {
	
	Reporter.log("Scenario 2:Open the document and Add redaction annotation on the page");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		jsclick(RoomContextTab);
		Reporter.log("User click on room context menu tab");
		jsclick(Cabinet);
		Reporter.log("User click on the cabinet");
		Thread.sleep(3000);
		selectElement(Drawer);
		Reporter.log("User click on the drawer");
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(Folder));
       selectElement(Folder);
       Reporter.log("User open the folder");
		Thread.sleep(8000);
        jsclick(OpenDocument); 
        Reporter.log("User open a document from the folder");
		Thread.sleep(2000);
		try {
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		}
		catch(Exception e) {
			System.out.println("Alert is not present");
		}
		Thread.sleep(8000);
		movingElement(AnnotationTab);
		
		Reporter.log("User mouse hover on the annotation icon");
	   VisiblityOf(Redaction);
	   Reporter.log("User click on Redaction button");
		Thread.sleep(2000);
	//	WebElement fabbtn = driver.findElement(By.xpath("//*[@id=\"fabButton\"]"));
	    Actions act=new Actions(driver);
		act.click(Redaction).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
	    Thread.sleep(3000);
	    Reporter.log("User create redaction to the page");
		sendvalue(RedName, readFromRoomCntxt(1, 2));
		 Reporter.log("User enter the name(label) for the redaction");
		Thread.sleep(2000);
	    sendvalue(RedactionPassword, readFromRoomCntxt(2, 2));
	    Reporter.log("User enter a password to the lock redaction dialog box");
	    Thread.sleep(3000);
	    sendvalue(RedactionCnfrmPassword,  readFromRoomCntxt(2, 2));
	    Reporter.log("User confirm a password to the lock redaction dialog box");
	    Thread.sleep(3000);
	    jsclick(RedactionOKBTN);
	    Reporter.log("User click redaction dialog OK button");
	    Thread.sleep(8000);
	   
	    movingElement(AnnotationTab);
	    Reporter.log("User mouse hover on annotation tool icon,  redaction created successfully...");
	    Thread.sleep(3000);
	    VisiblityOf(UnLockRedaction);
	    Reporter.log("User click on unlock redaction button in the annotation submenu");
	    jsclick(UnLockRedaction);
	   Thread.sleep(3000); 
	    sendvalue(unRedactionPassword,readFromRoomCntxt(2, 2));
	    Reporter.log("User click redaction dialog OK button");
	    Thread.sleep(3000);
	    jsclick(unRedactionPwdOKBTN);
	    Reporter.log("User enter a valid password into the unlock redaction dialog box");
	    Thread.sleep(6000);
	    Reporter.log("The redaction got unlocked successfully...");
	    act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
	    Reporter.log("User delete the redaction, the redaction got deleted successfully...");
	    Thread.sleep(10000);
	    jsclick(SaveTab);
	    Reporter.log("Create redation and unlock redaction, delete redaction verified successfull...");
	    Thread.sleep(3000);
	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Thread.sleep(8000);
	    
	   }
	public void HighLighFunction() throws Exception {
		Reporter.log("Scenario 03: verify Highlight annotation tool");
		
		movingElement(AnnotationTab);
		  Reporter.log("User click on annotation icon");
		   VisiblityOf(HighLight);
		   Reporter.log("User click on highlight tool button");
			Thread.sleep(3000);
			 Actions act=new Actions(driver);
			 ElementToBeClickable(HighLight);
				act.click(HighLight).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
				Thread.sleep(8000);
				  Reporter.log("User highlight a portion of the page");
			    jsclick(SaveTab);
			    Thread.sleep(3000);
			    Reporter.log("User click on save icon");
			    VisiblityOf(SaveTabOKBTN);
			    Reporter.log("The document page updated successfully...");
			    jsclick(SaveTabOKBTN);
			    Thread.sleep(8000);
			}
	public void StickyNoteAnnotation() throws Exception {
		Reporter.log("Scenario 04: verify sticky note annotation tool");
		  Reporter.log("User mouse hover on annotation icon");
		movingElement(AnnotationTab);
		   VisiblityOf(StickyNote);
		   Reporter.log("User click on Sticky Note tool button");
		   Thread.sleep(3000);
		   Actions act=new Actions(driver);
	     act.click(StickyNote).moveToElement(Page).click().build().perform();
	     Reporter.log("User click on the page to add sticky note");
	     Thread.sleep(5000);
	     sendvalue(stickyNoteTextbOX, "automationNishaR");
	     Reporter.log("Sticky note tool dialog opened, user place comments on the sticky note tool dialog box");
	     
	     Thread.sleep(5000);
	     jsclick(stickyNoteTextbOXokBTN);
	     Reporter.log("User click on the sticky note tool dialog box OK button");
	     Thread.sleep(10000);
	  //  movingclkElement(showstickynote);
	 //  act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
	     ElementToBeClickable(SaveTab);
	        jsclick(SaveTab);
	        Reporter.log("User click on save button");
		    Thread.sleep(3000);
		    VisiblityOf(SaveTabOKBTN);
		    Reporter.log("The document page has been updated successfully...");
		    jsclick(SaveTabOKBTN);
		    Thread.sleep(10000);
	}
	
	public void RubberStampAnnotation() throws Exception {
		Reporter.log("Scenario 05: verify RubberStamp annotation tool");
		movingElement(AnnotationTab);
		Reporter.log("User mouse hover on annotation icon");
		   VisiblityOf(RubberStamp);
		   Reporter.log("User click on the Rubber Stamp tool button");
		   Actions act=new Actions(driver);
		   ElementToBeClickable(RubberStamp);
		   Reporter.log("User drag the Rubber stamp on the page");
			act.click(RubberStamp).clickAndHold(Page).moveToElement(rectanglerelease).release().build().perform();
		    Thread.sleep(3000);
		  /*  movingclkElement(RubberStampDropdown);
	      //  jsclick(RubberStampDropdown);
	         Select sel=new Select(selectbyInd);
	        sel.selectByValue("Assigned");*/
	        Thread.sleep(5000);
	        jsclick(stickyNoteTextbOXokBTN);
	        Reporter.log("User choose Rubber stamp from the dropdown list and click on annotation properties dialog OK button");
	      //  act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
	        ElementToBeClickable(SaveTab);
	        jsclick(SaveTab);
		    Thread.sleep(3000);
		    Reporter.log("User click on save button");
		    VisiblityOf(SaveTabOKBTN);
		    Reporter.log("The document page has been updated successfull..");
		    jsclick(SaveTabOKBTN);
		    Thread.sleep(10000);
	    }
	
	public void StampAnnotation() throws Exception {
		Reporter.log("Scenario 06: verify Stamp annotation tool");
		Thread.sleep(4000);
		Reporter.log("User switch to the second page");
		jsclick(StampPage);
		Reporter.log("User mouse hover on annotation tool icon");
		Thread.sleep(8000);
		Reporter.log("Click on Stamp annotation tool button");
		movingElement(AnnotationTab);
		   VisiblityOf(Stampannota);
		   Thread.sleep(3000);
		   Actions act=new Actions(driver);
		   act.click(Stampannota).clickAndHold(Page).moveToElement(rectanglerelease).release().build().perform();
		    Thread.sleep(5000);
		    Reporter.log("Drag on the page, it will open the add picture dialog box");
		movingclkElement(openfileStamp);
		Thread.sleep(10000);
		Reporter.log("Click on choose file");
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Flower or Curly bracket .exe");
		// Runtime.getRuntime().exec("C:\\AutoImage\\NishaDoc.exe");
	  Thread.sleep(15000);
	  Reporter.log("User added the image from folder by using Auto IT");
	    jsclick(openfileStampOKBTN);
	    Thread.sleep(5000);
	    Reporter.log("Click on add picture dialog OK button");
	     ElementToBeClickable(SaveTab);
		   jsclick(SaveTab);
		   Reporter.log("User click on save button");
		    Thread.sleep(3000);
		    VisiblityOf(SaveTabOKBTN);
		    Reporter.log("The document page has been updated successfull...");
		    jsclick(SaveTabOKBTN);
		    Thread.sleep(10000);
	}
	
	public void PolygonAnnotation() throws Exception {
		Reporter.log("Scenario 07: verify polygon annotation tool");
		//jsclick(polygon);
		//Thread.sleep(8000);
		movingElement(AnnotationTab);
		Reporter.log("User mouse hover on annotation tool icon");
		   VisiblityOf(polygon);
		   Thread.sleep(5000);
		   Reporter.log("User click on polygon tool button");
		   Actions act=new Actions(driver);
		   act.click(polygon).clickAndHold(Page).moveToElement(rectanglerelease).click(Page).build().perform();
		   Reporter.log("User draw the polygon on the page.The polygon annotation added successfull");
		   
	}
public void LineAnnotation() throws Exception {
	Reporter.log("Scenario 08: verify Line annotation tool");
		Thread.sleep(4000);
		Reporter.log("User mouse hover on annotation tool icon");
		movingElement(AnnotationTab);
		Reporter.log("User click on the line tool button");
		   VisiblityOf(Line);
		   Thread.sleep(3000);
		//   WebElement rele = driver.findElement(By.xpath("(//div[@class='gutter gutter-vertical'])[1]"));
		   Actions act=new Actions(driver);
		   act.click(Line).clickAndHold(Page).moveToElement(ReleseForAnnotation).release().build().perform();
		   Reporter.log("User draw the line on the page");
		   Thread.sleep(8000);
		   jsclick(SaveTab);
		   Reporter.log("User click on the save button");
		    Thread.sleep(3000);
		    VisiblityOf(SaveTabOKBTN);
		    Reporter.log("The document page has been updated successfull");
		    jsclick(SaveTabOKBTN);
		    Thread.sleep(8000);
	}

public void rectangleAnnotation() throws Exception {
	Reporter.log("Scenario 09: verify Rectangle annotation tool");
	movingElement(AnnotationTab);
	Reporter.log("User mouse hover on annotation tool icon");
	   VisiblityOf(Rectangle);
	   Thread.sleep(10000);
	   Reporter.log("User click on the rectangle tool button");
	  WebElement rectanglerelease = driver.findElement(By.xpath("//*[@id=\"toolbarId\"]/div[2]"));
	   Actions act=new Actions(driver);
	   act.click(Rectangle).clickAndHold(Page).moveToElement(PageCloseIcon).release().build().perform();
	    Thread.sleep(8000);
	    Reporter.log("User drew the rectangle on the page");
	 //  act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
	    jsclick(SaveTab);
	    Thread.sleep(3000);
	    Reporter.log("User click on save button");
	    VisiblityOf(SaveTabOKBTN);
	    Reporter.log("The document page has been updated successfull");
	    jsclick(SaveTabOKBTN);
	    Thread.sleep(15000);
}


public void ellipseAnnotation() throws Exception {
	Reporter.log("Scenario 10: verify ellipse annotation tool");
	movingElement(AnnotationTab);
	 Reporter.log("User mouse  on the annotation tool icon");
	   VisiblityOf(ellipse);
	   Reporter.log("User click on ellipse tool button");
	   Thread.sleep(3000);
	//   WebElement rele = driver.findElement(By.xpath("(//div[@class='gutter gutter-vertical'])[1]"));
	   Actions act=new Actions(driver);
	   act.click(ellipse).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
	    Thread.sleep(8000);
	 //   act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
	    Reporter.log("User drew the ellipse on the page");
	//  Thread.sleep(8000);
	    jsclick(SaveTab);
	    Thread.sleep(3000);
	    Reporter.log("User click on save button");
	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Reporter.log("The document page has been updated successfully");
	    Thread.sleep(15000);
}

@FindBy(xpath = ("//*[@id=\"signInputPasswordL\"]"))
private WebElement SignPasswordDialog;






@FindBy(xpath = ("//*[@id=\"verifySignaturePasswordL\"]"))
private WebElement SignPasswordDialogOKBTN;

public void signatureAnnotation() throws Exception {
	
	 Reporter.log("Scenario 11: verify Signature annotation tool");
	 Reporter.log("User mouse  on the annotation tool icon");


	

	
	movingElement(AnnotationTab);
	   VisiblityOf(Singature);
	   Reporter.log("User click on singature tool button");
	   Thread.sleep(3000);
	   Actions act=new Actions(driver);
	   ElementToBeClickable(Singature);
	   jsclick(Singature);
	   Reporter.log("Single click on the page");
	   Thread.sleep(3000);
	   try {
	   act.click(SignPasswordDialog).sendKeys("nisha").build().perform();
	  Thread.sleep(5000);
	   jsclick(SignPasswordDialogOKBTN);
	   Thread.sleep(2000);
	   act.click(Page).release().build().perform();
	    Thread.sleep(8000);
	   }catch(Exception e) {
		   System.out.println("Password dialog box not present");
		   Thread.sleep(2000);
		   act.click(Page).release().build().perform();
		    Thread.sleep(8000);
	   }
	   Reporter.log("User added the signature on the page");
	    jsclick(SaveTab);
	    Thread.sleep(3000);
	    Reporter.log("User click on save button");
	    VisiblityOf(SaveTabOKBTN);
	    Reporter.log("The document page has been updated successfully...");
	    jsclick(SaveTabOKBTN);
	    Thread.sleep(10000);
	 
}
public void closeAndReopenThePage() throws Exception {
	 Reporter.log("Scenario 12:Close and reopen the document to check whether the annotations are visible or not");
	jsclick(PageCloseIcon);
	   Reporter.log("Click on close icon");
	VisiblityOf(OpenDocument1);
	   Reporter.log("Reopen the document again");
	jsclick(OpenDocument1);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	try {
	if(wait.until(ExpectedConditions.alertIsPresent()) != null) {
		alertIsPresent();
		acceptAlert();
	}
	}catch(Exception e) {
		Reporter.log("NoAlertFound");
	}
	Thread.sleep(3000);
	   Reporter.log("All updated annotations are visible on the first page, there is no data loss");
//	jsclick(StampPage);
	Reporter.log("All updated annotations are visible on the second page, there is no data loss");
	
}





}
