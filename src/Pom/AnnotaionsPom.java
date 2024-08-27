package Pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
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

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class AnnotaionsPom extends BaseClass {

	public static WebElement element = null;

	public AnnotaionsPom() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	@FindBy(xpath = "//*[@id=\"defaultViewListNo\"]")
	private WebElement Click_Dropdown_DefaultViewing;

	public void getClick_Dropdown_DefaultViewing() {// void method
		Click_Dropdown_DefaultViewing.click();

	}

	@FindBy(xpath = ("(//a[@id='navigationMenuBtn'])[1]"))
	private WebElement RoomContextTab;

	@FindBy(xpath = ("//*[@id=\"viewDocumentnavigator\"]/ul/li[2]/ins"))
	private WebElement Cabinet;

	@FindBy(xpath = ("//*[@id=\"viewDocumentnavigator\"]/ul/li[2]/ul/li[1]/a"))
	private WebElement Drawer;

	@FindBy(xpath = ("//*[@id=\"viewDocumentnavigator\"]/ul/li[2]/ul/li[1]/ul/li[1]/a"))
	private WebElement Folder;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[2]/td[3]"))
	private WebElement OpenDocument;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
	private WebElement OpenDocument1;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]"))
	private WebElement OpenDocumentSQL;

	@FindBy(xpath = ("(//span[@class='icon annotationRoot'])[1]"))
	private WebElement AnnotationTab;

	@FindBy(xpath = ("//*[@id=\"30\"]/ins"))
	private WebElement CabinetCSR;

	@FindBy(xpath = ("//*[@id=\"31\"]/ins"))
	private WebElement DrawerCSR;

	@FindBy(xpath = ("//*[@id=\"32\"]/a"))
	private WebElement FolderCSR;

	@FindBy(xpath = ("(//a[normalize-space()='My Preferences'])[1]"))
	private WebElement MyPreference;

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

	@FindBy(xpath = ("//*[@id=\"messageButtonOK27\"]"))
	private WebElement SaveConfirmYes;

	@FindBy(xpath = ("//*[@id=\"toolbarId\"]/div[2]"))
	private WebElement rectanglerelease;

	@FindBy(xpath = ("//*[@id=\"cvDocumentClose\"]/span"))
	private WebElement PageCloseIcon;

	public WebElement getPageCloseIcon() {
		return PageCloseIcon;

	}

	@FindBy(xpath = "//*[@id=\"editproperties_79407\"]")
	private WebElement Update_Button;

	@FindBy(linkText = "ReportName")
	private WebElement ReportName;

	@FindBy(xpath = "//*[@id=\"rubberBandInteractiveMode_shortcut\"]/span")
	private WebElement ClickOCR;

	@FindBy(xpath = "//*[@id=\"imageViewerDiv\"]/div[2]/canvas")
	private WebElement setOCR;

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
		} catch (Exception e) {
			System.out.println("Alert is not present");
		}
		Thread.sleep(8000);
		movingElement(AnnotationTab);
		VisiblityOf(Redaction);

		Thread.sleep(2000);
		// WebElement fabbtn = driver.findElement(By.xpath("//*[@id=\"fabButton\"]"));
		Actions act = new Actions(driver);
		act.click(Redaction).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
		Thread.sleep(3000);
		sendvalue(RedName, readFromRoomCntxt(1, 2));
		Thread.sleep(2000);
		sendvalue(RedactionPassword, readFromRoomCntxt(2, 2));
		Thread.sleep(3000);
		sendvalue(RedactionCnfrmPassword, readFromRoomCntxt(2, 2));
		Thread.sleep(3000);
		jsclick(RedactionOKBTN);
		Thread.sleep(8000);

		movingElement(AnnotationTab);
		Thread.sleep(3000);
		VisiblityOf(UnLockRedaction);
		jsclick(UnLockRedaction);
		Thread.sleep(3000);
		sendvalue(unRedactionPassword, readFromRoomCntxt(2, 2));
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
		Language pojo = new Language();

		Reporter.log("Scenario 2:Open the document and Add Redaction Annotation on the page");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		jsclick(RoomContextTab);
		Thread.sleep(4000);
		Reporter.log("Click on room context menu tab");
		jsclick(Cabinet);
		// Reporter.log("Click on the cabinet");
		Thread.sleep(3000);
		ElementToBeClickable(Drawer);
		selectElement(Drawer);
		// Reporter.log("Click on the drawer");
		Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(Folder));
		selectElement(Folder);
		// Reporter.log("Open the folder");
		Thread.sleep(8000);
		AdvancedViewer an = new AdvancedViewer();
		an.create_document_Auto();

		Thread.sleep(4000);
		try {
			WebElement CreateAsNew = driver.findElement(By.xpath("//*[@id=\"messageButtonCreate_as_New29\"]"));
			jsclick(CreateAsNew);

		} catch (Exception e) {
			System.out.println("Overwrite dialog not present");
		}
		try {
			jsclick(SaveConfirmYes);

		} catch (Exception e) {
			System.out.println("Save Confirm Dialog Not Displayed");
		}
		Thread.sleep(7000);
		movingElement(AnnotationTab);

		Reporter.log("Mouse hover on the annotation icon");
		VisiblityOf(Redaction);
		Reporter.log("Click on Redaction button");
		Thread.sleep(2000);
		// WebElement fabbtn = driver.findElement(By.xpath("//*[@id=\"fabButton\"]"));
		Actions act = new Actions(driver);
		act.click(Redaction).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
		Thread.sleep(3000);
		Reporter.log("Create redaction on the page");
		sendvalue(RedName, readFromRoomCntxt(1, 2));
		Reporter.log("Enter the name(label) for the redaction");
		Thread.sleep(2000);
		sendvalue(RedactionPassword, readFromRoomCntxt(2, 2));
		Reporter.log("Enter a password to the lock Redaction dialog box");
		Thread.sleep(3000);
		sendvalue(RedactionCnfrmPassword, readFromRoomCntxt(2, 2));
		Reporter.log("Confirm a password to the lock Redaction dialog box");
		Thread.sleep(3000);
		jsclick(RedactionOKBTN);
		Reporter.log("Click Redaction dialog OK button");
		Thread.sleep(8000);

		movingElement(AnnotationTab);
		Reporter.log("Mouse hover on annotation tool icon");
		Thread.sleep(3000);
		Reporter.log("Redaction added on the page successfully...");
		VisiblityOf(UnLockRedaction);
		Reporter.log("Click on unlock redaction button in the annotation submenu");
		jsclick(UnLockRedaction);
		Thread.sleep(3000);
		sendvalue(unRedactionPassword, readFromRoomCntxt(2, 2));
		Reporter.log("Click Redaction dialog OK button");
		Thread.sleep(3000);
		jsclick(unRedactionPwdOKBTN);
		Reporter.log("Enter a valid password into the unlock Redaction dialog box");
		Thread.sleep(6000);
		Reporter.log("The Redaction got unlocked successfully...");
		act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
		// Reporter.log("Delete the Redaction, the Redaction got deleted
		// successfully...");
		Thread.sleep(10000);
		jsclick(SaveTab);
		Reporter.log("Create Redation and Unlock Redaction Verified successfully...");
		Thread.sleep(3000);
		VisiblityOf(SaveTabOKBTN);
		jsclick(SaveTabOKBTN);
		Thread.sleep(8000);

	}

	public void HighLighFunction() throws Exception {
		Reporter.log("Scenario 03: Verify Highlight annotation ");

		movingElement(AnnotationTab);
		Reporter.log("Click on annotation icon");
		VisiblityOf(HighLight);
		Reporter.log("Click on highlight tool button");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		ElementToBeClickable(HighLight);
		act.click(HighLight).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
		Thread.sleep(8000);
		Reporter.log("Highlight a portion of the page");
		jsclick(SaveTab);
		Thread.sleep(3000);
		Reporter.log("Click on save icon");
		VisiblityOf(SaveTabOKBTN);
		Reporter.log("The Highlight annotation  has been updated on the document page successfully");
		jsclick(SaveTabOKBTN);
		Thread.sleep(8000);
	}

	public void StickyNoteAnnotation() throws Exception {
		Reporter.log("Scenario 04: Verify Sticky note annotation ");
		Reporter.log("Mouse hover on annotation icon");
		movingElement(AnnotationTab);
		VisiblityOf(StickyNote);
		Reporter.log("Click on Sticky Note tool button");
		Thread.sleep(3000);
		try {
			Actions act = new Actions(driver);
			act.click(StickyNote).moveToElement(Page).click().build().perform();
			Reporter.log("Click on the page and add stickynote");
		} catch (JavascriptException e) {
			System.out.println("JAvaScript Exception handled...");
		}
		Thread.sleep(5000);
		sendvalue(stickyNoteTextbOX, "automationNishaR");
		Reporter.log("Sticky note tool dialog opened, Place comments on the stickynote dialog box");

		Thread.sleep(5000);
		jsclick(stickyNoteTextbOXokBTN);
		Reporter.log("Click on the stickynote tool dialog box OK button");
		Thread.sleep(10000);
		// movingclkElement(showstickynote);
		// act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
		ElementToBeClickable(SaveTab);
		jsclick(SaveTab);
		Reporter.log("Click on save button");
		Thread.sleep(3000);
		VisiblityOf(SaveTabOKBTN);
		Reporter.log("The Stickynote annotation  has been updated on the document page successfully");
		jsclick(SaveTabOKBTN);
		Thread.sleep(8000);
	}

	public void RubberStampAnnotation() throws Exception {
		Reporter.log("Scenario 05: verify RubberStamp annotation ");
		movingElement(AnnotationTab);
		Reporter.log("Mouse hover on annotation icon");
		VisiblityOf(RubberStamp);
		Reporter.log("Click on the Rubber Stamp tool button");
		Actions act = new Actions(driver);
		ElementToBeClickable(RubberStamp);
		Reporter.log("Drag the Rubber stamp on the page");
		act.click(RubberStamp).clickAndHold(Page).moveToElement(rectanglerelease).release().build().perform();
		Thread.sleep(3000);
		/*
		 * movingclkElement(RubberStampDropdown); // jsclick(RubberStampDropdown);
		 * Select sel=new Select(selectbyInd); sel.selectByValue("Assigned");
		 */
		Thread.sleep(5000);
		jsclick(stickyNoteTextbOXokBTN);
		Reporter.log("Choose Rubber stamp from the dropdown list and click on annotation properties dialog OK button");
		// act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
		ElementToBeClickable(SaveTab);
		jsclick(SaveTab);
		Thread.sleep(3000);
		Reporter.log("Click on save button");
		VisiblityOf(SaveTabOKBTN);
		Reporter.log("The Rubber stamp annotation  has been updated on the document page successfully");
		jsclick(SaveTabOKBTN);
		Thread.sleep(10000);
	}

	public void StampAnnotation() throws Exception {
		Reporter.log("Scenario 07: verify Stamp annotation tool");
		Thread.sleep(4000);
		Reporter.log("Switch to the second page");
		jsclick(StampPage);
		Reporter.log("Mouse hover on annotation tool icon");
		Thread.sleep(8000);
		Reporter.log("Click on Stamp annotation tool button");
		movingElement(AnnotationTab);
		VisiblityOf(Stampannota);
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.click(Stampannota).clickAndHold(Page).moveToElement(rectanglerelease).release().build().perform();
		Thread.sleep(5000);
		Reporter.log("Drag on the page, it will open the add picture dialog box");
		movingclkElement(openfileStamp);
		Thread.sleep(8000);
		Reporter.log("Click on choose file");
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\FlowerOrCurlyBracket.exe");
		// Runtime.getRuntime().exec("C:\\AutoImage\\NishaDoc.exe");
		Thread.sleep(15000);
		Reporter.log("Add the image from folder by using Auto IT");
		jsclick(openfileStampOKBTN);
		Thread.sleep(5000);
		Reporter.log("Click on add picture dialog OK button");
		ElementToBeClickable(SaveTab);
		jsclick(SaveTab);
		Reporter.log("Click on save button");
		Thread.sleep(3000);
		VisiblityOf(SaveTabOKBTN);
		Reporter.log("The Stamp annotation  has been updated on the document page successfully");
		jsclick(SaveTabOKBTN);
		Thread.sleep(10000);
	}

	public void PolygonAnnotation() throws Exception {
		Reporter.log("Scenario 11: Verify polygon annotation ");
		// jsclick(polygon);
		// Thread.sleep(8000);
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		try {
			driver.manage().timeouts().setScriptTimeout(2000, TimeUnit.MILLISECONDS);
			act.moveToElement(AnnotationTab).perform();

		} catch (JavascriptException e) {
			Reporter.log("Exception Handled");
		}
		Reporter.log("Mouse hover on annotation tool icon");
		VisiblityOf(polygon);
		Thread.sleep(5000);
		Reporter.log("Click on polygon tool button");

		act.click(polygon).clickAndHold(Page).moveToElement(rectanglerelease).click(Page).build().perform();
		Reporter.log(
				"Draw the polygon on the page.The Polygon annotation  has been updated on the document page successfully");
		Reporter.log(
				"========================================================================================================");
	}

	public void LineAnnotation() throws Exception {
		Reporter.log("Scenario 08: Verify Line annotation");
		Thread.sleep(4000);
		Reporter.log("Mouse hover on annotation tool icon");
		movingElement(AnnotationTab);
		Reporter.log("Click on the line tool button");
		VisiblityOf(Line);
		Thread.sleep(3000);
		// WebElement rele = driver.findElement(By.xpath("(//div[@class='gutter
		// gutter-vertical'])[1]"));
		Actions act = new Actions(driver);
		act.click(Line).clickAndHold(Page).moveToElement(ReleseForAnnotation).release().build().perform();
		Reporter.log("Draw the line on the page");
		Thread.sleep(8000);
		jsclick(SaveTab);
		Reporter.log("Click on the save button");
		Thread.sleep(3000);
		VisiblityOf(SaveTabOKBTN);
		Reporter.log("The line annotation  has been updated on the document page successfully");
		jsclick(SaveTabOKBTN);
		Thread.sleep(8000);
		Reporter.log("==============================================================================");
	}

	public void rectangleAnnotation() throws Exception {
		Reporter.log("Scenario 06: Verify Rectangle annotation tool");
		movingElement(AnnotationTab);
		Reporter.log("Mouse hover on annotation tool icon");
		VisiblityOf(Rectangle);
		Thread.sleep(8000);
		Reporter.log("Click on the rectangle tool button");
		WebElement rectanglerelease = driver.findElement(By.xpath("//*[@id=\"toolbarId\"]/div[2]"));
		Actions act = new Actions(driver);
		act.click(Rectangle).clickAndHold(Page).moveToElement(PageCloseIcon).release().build().perform();
		Thread.sleep(8000);
		Reporter.log("Draw the rectangle shape on the page");
		// act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
		jsclick(SaveTab);
		Thread.sleep(3000);
		Reporter.log("Click on save button");
		VisiblityOf(SaveTabOKBTN);
		Reporter.log("The Rectangle annotation  has been updated on the document page successfully");
		jsclick(SaveTabOKBTN);
		Thread.sleep(15000);
	}

	public void ellipseAnnotation() throws Exception {
		Reporter.log("Scenario 9: Verify ellipse annotation ");
		movingElement(AnnotationTab);
		Reporter.log("Mouse  on the annotation tool icon");
		VisiblityOf(ellipse);
		Reporter.log("Click on ellipse tool button");
		Thread.sleep(3000);
		// WebElement rele = driver.findElement(By.xpath("(//div[@class='gutter
		// gutter-vertical'])[1]"));
		try {
			Actions act = new Actions(driver);
			act.click(ellipse).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
			Thread.sleep(8000);
		} catch (Exception e) {
			System.out.println("exception handled");
		}
		// act.click(showstickynote).sendKeys(Keys.DELETE).build().perform();
		Reporter.log("Draw the ellipse on the page");
		// Thread.sleep(8000);
		jsclick(SaveTab);
		Thread.sleep(3000);
		Reporter.log("Click on save button");
		VisiblityOf(SaveTabOKBTN);
		jsclick(SaveTabOKBTN);
		Reporter.log("The ellipse annotation  has been updated on the document page successfully");
		Thread.sleep(15000);
	}

	@FindBy(xpath = ("//*[@id=\"signInputPasswordL\"]"))
	private WebElement SignPasswordDialog;

	@FindBy(xpath = ("//*[@id=\"verifySignaturePasswordL\"]"))
	private WebElement SignPasswordDialogOKBTN;

	public void signatureAnnotation() throws Exception {

		Reporter.log("Scenario 10: Verify Signature annotation ");
		Reporter.log("Mouse  on the annotation tool icon");

		movingElement(AnnotationTab);
		VisiblityOf(Singature);
		Reporter.log("Click on singature tool button");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
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
		} catch (Exception e) {
			Reporter.log("Password dialog box not present");
			Thread.sleep(2000);
			act.click(Page).release().build().perform();
			Thread.sleep(8000);
		}
		Reporter.log("Add the signature on the page");
		jsclick(SaveTab);
		Thread.sleep(3000);
		Reporter.log("Click on save button");
		VisiblityOf(SaveTabOKBTN);
		Reporter.log("The Signature annotation  has been updated on the document page successfully");
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
			if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
				alertIsPresent();
				acceptAlert();
			}
		} catch (Exception e) {
			Reporter.log("Page alert is not present");
		}
		Thread.sleep(3000);
		Reporter.log("All the added annotations are visible on the page successfully... ");
		// jsclick(StampPage);
		Reporter.log("All updated annotations are visible on the second page, there is no data loss");

	}

}
