package Pom;

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

	@FindBy(xpath = ("//*[@id=\"1\"]/a"))
	private WebElement Cabinet;

	@FindBy(xpath = ("//*[@id=\"2\"]/a"))
	private WebElement Drawer;

	@FindBy(xpath = ("//*[@id=\"78712\"]/a"))
	private WebElement Folder;
	
	@FindBy(xpath = ("//td[text()='AutomationTestingDocumentsPleaseDontTouchThis']"))
	private WebElement OpenDocument;
	
	@FindBy(xpath = ("(//span[@class='icon annotationRoot'])[1]"))
	private WebElement AnnotationTab;
	
	
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
  
    
	public void RedactionAnnotation() throws Exception {
	
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		jsclick(RoomContextTab);
		movingDoublecli(Cabinet, Cabinet);
		Thread.sleep(3000);
		movingDoublecli(Drawer, Drawer);
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(Folder));
		movingDoublecli(Folder, Folder);
		Thread.sleep(8000);
        jsclick(OpenDocument); 
		Thread.sleep(2000);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
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
	
	public void HighLighFunction() throws Exception {
		movingElement(AnnotationTab);
		   VisiblityOf(HighLight);
			
			Thread.sleep(3000);
			 Actions act=new Actions(driver);
			 ElementToBeClickable(HighLight);
				act.click(HighLight).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
				Thread.sleep(8000);
		
			    jsclick(SaveTab);
			    Thread.sleep(3000);
			    VisiblityOf(SaveTabOKBTN);
			    jsclick(SaveTabOKBTN);
			    Thread.sleep(8000);
			}
	public void StickyNoteAnnotation() throws Exception {
		movingElement(AnnotationTab);
		   VisiblityOf(StickyNote);
		   Thread.sleep(3000);
		   Actions act=new Actions(driver);
	     act.click(StickyNote).moveToElement(Page).click().build().perform();
	     Thread.sleep(5000);
	     sendvalue(stickyNoteTextbOX, "automationNishaR");
	     Thread.sleep(5000);
	     jsclick(stickyNoteTextbOXokBTN);
	     Thread.sleep(10000);
	  //  movingclkElement(showstickynote);
	 //  act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
	     ElementToBeClickable(SaveTab);
	        jsclick(SaveTab);
		    Thread.sleep(3000);
		    VisiblityOf(SaveTabOKBTN);
		    jsclick(SaveTabOKBTN);
		    Thread.sleep(10000);
	}
	
	public void RubberStampAnnotation() throws Exception {
		
		movingElement(AnnotationTab);
		   VisiblityOf(RubberStamp);
		   Actions act=new Actions(driver);
		   ElementToBeClickable(RubberStamp);
			act.click(RubberStamp).clickAndHold(Page).moveToElement(rectanglerelease).release().build().perform();
		    Thread.sleep(3000);
		    movingclkElement(RubberStampDropdown);
	      //  jsclick(RubberStampDropdown);
	         Select sel=new Select(selectbyInd);
	        sel.selectByValue("Assigned");
	        Thread.sleep(5000);
	        jsclick(stickyNoteTextbOXokBTN);
	        
	      //  act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
	        ElementToBeClickable(SaveTab);
	        jsclick(SaveTab);
		    Thread.sleep(3000);
		    VisiblityOf(SaveTabOKBTN);
		    jsclick(SaveTabOKBTN);
		    Thread.sleep(10000);
	    }
	
	public void StampAnnotation() throws Exception {
		jsclick(StampPage);
		Thread.sleep(8000);
		movingElement(AnnotationTab);
		   VisiblityOf(Stampannota);
		   Thread.sleep(3000);
		   Actions act=new Actions(driver);
		   act.click(Stampannota).clickAndHold(Page).moveToElement(rectanglerelease).release().build().perform();
		    Thread.sleep(5000);
		movingclkElement(openfileStamp);
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Hash .exe");
		// Runtime.getRuntime().exec("C:\\AutoImage\\NishaDoc.exe");
	  Thread.sleep(8000);
	    jsclick(openfileStampOKBTN);
	     ElementToBeClickable(SaveTab);
		   jsclick(SaveTab);
		    Thread.sleep(3000);
		    VisiblityOf(SaveTabOKBTN);
		    jsclick(SaveTabOKBTN);
		    Thread.sleep(10000);
	}
	
	public void PolygonAnnotation() throws Exception {
		//jsclick(polygon);
		//Thread.sleep(8000);
		movingElement(AnnotationTab);
		   VisiblityOf(polygon);
		   Thread.sleep(3000);
		   Actions act=new Actions(driver);
		   act.click(polygon).clickAndHold(Page).moveToElement(rectanglerelease).click(Page).build().perform();
		
		   
	}
public void LineAnnotation() throws Exception {
		
		movingElement(AnnotationTab);
		   VisiblityOf(Line);
		   Thread.sleep(3000);
		//   WebElement rele = driver.findElement(By.xpath("(//div[@class='gutter gutter-vertical'])[1]"));
		   Actions act=new Actions(driver);
		   act.click(Line).clickAndHold(Page).moveToElement(ReleseForAnnotation).release().build().perform();
		Thread.sleep(8000);
		   jsclick(SaveTab);
		    Thread.sleep(3000);
		    VisiblityOf(SaveTabOKBTN);
		    jsclick(SaveTabOKBTN);
		    Thread.sleep(8000);
	}

public void rectangleAnnotation() throws Exception {
	
	movingElement(AnnotationTab);
	   VisiblityOf(Rectangle);
	   Thread.sleep(10000);
	  WebElement rectanglerelease = driver.findElement(By.xpath("//*[@id=\"toolbarId\"]/div[2]"));
	   Actions act=new Actions(driver);
	   act.click(Rectangle).clickAndHold(Page).moveToElement(PageCloseIcon).release().build().perform();
	    Thread.sleep(8000);
	 //  act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
	    jsclick(SaveTab);
	    Thread.sleep(3000);
	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Thread.sleep(15000);
}


public void ellipseAnnotation() throws Exception {
	
	movingElement(AnnotationTab);
	   VisiblityOf(ellipse);
	   Thread.sleep(3000);
	//   WebElement rele = driver.findElement(By.xpath("(//div[@class='gutter gutter-vertical'])[1]"));
	   Actions act=new Actions(driver);
	   act.click(ellipse).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
	    Thread.sleep(8000);
	 //   act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
	//  Thread.sleep(8000);
	    jsclick(SaveTab);
	    Thread.sleep(3000);
	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Thread.sleep(15000);
}
	
public void signatureAnnotation() throws Exception {
	
	movingElement(AnnotationTab);
	   VisiblityOf(Singature);
	   Thread.sleep(3000);
	   Actions act=new Actions(driver);
	   ElementToBeClickable(Singature);
	   act.click(Singature).click(Page).release().build().perform();
	    Thread.sleep(8000);
	    jsclick(SaveTab);
	    Thread.sleep(3000);
	    VisiblityOf(SaveTabOKBTN);
	    jsclick(SaveTabOKBTN);
	    Thread.sleep(10000);
	 
}
public void closeAndReopenThePage() throws Exception {
	
	jsclick(PageCloseIcon);
	VisiblityOf(OpenDocument);
	jsclick(OpenDocument);
	WebDriverWait wait = new WebDriverWait(driver, 20);
	try {
	if(wait.until(ExpectedConditions.alertIsPresent()) != null) {
		alertIsPresent();
		acceptAlert();
	}
	}catch(Exception e) {
		Reporter.log("NoAlertFound");
	}
	Thread.sleep(6000);
	jsclick(StampPage);
	Thread.sleep(8000);
}


}
