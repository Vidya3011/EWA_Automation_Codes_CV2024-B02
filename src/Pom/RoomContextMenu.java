package Pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.bcel.generic.Select;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseClass;

public class RoomContextMenu extends BaseClass {

	

	public RoomContextMenu() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("(//a[@id='navigationMenuBtn'])[1]"))
	private WebElement RoomContextTab;

	@FindBy(xpath = ("(//li[@id='1'])[1]"))
	private WebElement Cabinet;

	@FindBy(xpath = ("//*[@id=\"2\"]/ins"))
	private WebElement Drawer;

	@FindBy(xpath = ("//*[@id=\"23927\"]/a"))
	private WebElement Folder;
	
	
	
	@FindBy(xpath = ("//*[@id=\"1002\"]/a"))
	private WebElement FolderVidya;
	
	
	
	public WebElement getCabinet() {
		return Cabinet;
	}

	

	public WebElement getDrawer() {
		return Drawer;
	}

	

	public WebElement getFolderVidya() {
		return FolderVidya;
	}

	

	@FindBy(xpath = ("//a[@id='takeOwnershipFolder']"))
	private WebElement TakeOwner;

	@FindBy(xpath = ("(//td[normalize-space()='Pdf Yes'])[1]"))
	private WebElement ForLockedPDFDoc;

	@FindBy(xpath = ("(//button[@class='modalDialogButtons'])[17]"))
	private WebElement OKBTNDocLockDialog;

	@FindBy(xpath = ("//a[@id='releaseOwnershipFolder']"))
	private WebElement ReleaseOSFolder;

	@FindBy(xpath = ("//*[@id=\"78362\"]/a"))
	private WebElement drawerforCopy;

	@FindBy(xpath = ("(//a[text()='CVApp Test'])[1]"))
	private WebElement CvAppCabinet;

	@FindBy(xpath = ("//a[text()='CVMobile App 2022']"))
	private WebElement CVMobileappDrwer;

	@FindBy(xpath = ("//a[@id='copyNodeAnchor']"))
	private WebElement CopyTab;

	@FindBy(xpath = ("(//li[@id='pasteNodeLi'])[2]"))
	private WebElement PasteTab;

	@FindBy(xpath = ("(//a[text()='New Drawer'])[3]"))
	private WebElement SelectCopyDrawer;

	@FindBy(xpath = ("(//li[@id='deleteNodeLi'])[2]"))
	private WebElement DeleteTab;

	@FindBy(xpath = ("(//button[@id='takeOwnerShipAnyway25'])[1]"))
	private WebElement TakeOwnerShipYESorNoDialogBoxOKBTN;

	@FindBy(id = ("pasteMessageOk1"))
	private WebElement PasteConfimDialogOKBTN;

	@FindBy(xpath = ("//button[@id='deleteMessageOk1']"))
	private WebElement DeleteConfimDialogOKBTN;

	@FindBy(xpath = ("//a[@id='nodeProperties']"))
	private WebElement NodeProperties;

	@FindBy(xpath = ("(//input[@id='nodePropVal_340'])[1]"))
	private WebElement TextKey;

	@FindBy(xpath = ("(//button[@id='navigatorTreeReset31'])[1]"))
	private WebElement NodeResetBTN;

	@FindBy(xpath = ("(//button[@id='resetMessageOk34'])[1]"))
	private WebElement NodeResetYesBTN;

	@FindBy(xpath = ("(//input[@id='nodePropVal_341'])[1]"))
	private WebElement numeric123;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeOk31\"]"))
	private WebElement NodePropOKBTN;

	@FindBy(xpath = ("(//a[normalize-space()='3'])[1]"))
	private WebElement DateOct;

	@FindBy(xpath = ("(//select[@id='nodePropVal_343'])[1]"))
	private WebElement Boolean123;

	@FindBy(id = ("nodePropVal_343"))
	private WebElement YesORNoBoolean;

	@FindBy(xpath = ("(//input[@id='nodePropVal_342'])[1]"))
	private WebElement Date;

	@FindBy(xpath = ("(//input[@id='nodePropVal_37'])[1]"))
	private WebElement Restaurent;

	@FindBy(xpath = ("(//input[@id='nodePropVal_33'])[1]"))
	private WebElement Reportname;

	@FindBy(xpath = ("(//a[@id='createDocument'])[1]"))
	private WebElement CreateDocTab;

	@FindBy(xpath = ("//*[@id=\"2870\"]/a"))
	private WebElement FolderForCopy;

	@FindBy(xpath = ("(//select[@id='docTypeList'])[1]"))
	private WebElement selectDocDropDown;

	@FindBy(xpath = ("(//select[@id='nodePropertiesDocTypeList'])[1]"))
	private WebElement selectDocDropDownFrNode;

	@FindBy(xpath = ("(//a[@id='setNotificationsAnchor'])[1]"))
	private WebElement Notification;

	@FindBy(xpath = ("(//span[@id='spanNotifylist'])[1]"))
	private WebElement NotificationDropDown;

	@FindBy(xpath = ("(//button[@id='notifySaveBtn'])[1]"))
	private WebElement applyBTNmypref;

	@FindBy(xpath = ("(//button[@id='reset'])[1]"))
	private WebElement resetBTNmyPref;

	@FindBy(xpath = ("//*[@id=\"10733\"]/a"))
	private WebElement CabinetForCustomDoc;

	@FindBy(xpath = ("//a[@id='custmDocumentTypes']"))
	private WebElement customdoc;
	
	@FindBy(xpath = ("(//span[@id='spanCheckCustomDocTypeValues_12'])[1]"))
	private WebElement bill;
	
	@FindBy(xpath = ("//*[@id=\"spanCheckCustomDocTypeValues_27\"]"))
	private WebElement dateMask;
	
	
	@FindBy(xpath = ("(//span[@id='spanCheckCustomDocTypeValues_74'])[1]"))
	private WebElement cvReports;
	
	@FindBy(xpath = ("(//span[@id='spanCheckCustomDocTypeValues_1'])[1]"))
	private WebElement cvReports1;
	
	@FindBy(xpath = ("(//span[@id='spanCheckCustomDocTypeValues_68'])[1]"))
	private WebElement alldataType;
	
	

	@FindBy(id = ("nodePropVal_344"))
	private WebElement Selection123;

	@FindBy(xpath = ("//a[@id='resetDocumentTypes']"))
	private WebElement ResetcustomDocType;

	@FindBy(xpath = ("//a[@id='navigatesetColour']"))
	private WebElement Categories;

	@FindBy(xpath = ("//*[@id=\"78992\"]/a"))
	private WebElement NishaRCaninet;

	@FindBy(xpath = ("//*[@id=\"78994\"]/a"))
	private WebElement NishaRDrawer;

	@FindBy(xpath = ("//*[@id=\"78995\"]/a"))
	private WebElement NishaRFolder;

	@FindBy(xpath = ("//*[@id=\"2432\"]/a"))
	private WebElement vidyaCaninet;

	@FindBy(xpath = ("//*[@id=\"2433\"]/a"))
	private WebElement vidyaDrawer;

	@FindBy(xpath = ("//*[@id=\"2434\"]/a"))
	private WebElement vidyaFolder;

	@FindBy(id = ("nodePropVal_74"))
	private WebElement CountriesDrpdown;
	
	@FindBy(xpath = ("//*[@id=\"10760\"]/a"))
	private WebElement DeleteCheckCabinet;
	
	@FindBy(xpath = ("//*[@id=\"10761\"]/a"))
	private WebElement DeleteChkDfDfDrawer;

	@FindBy(xpath = ("//*[@id=\"11166\"]/a"))
	private WebElement folderSecurityPermissionCheck;
	
	@FindBy(xpath =("//td[contains(text(),'Security permission check - Delete check\\dfdfd\\Sec')]"))
    private WebElement ForOpenNotiAgain;
	
	@FindBy(xpath =("//*[@id=\"12103\"]/ins"))
    private WebElement CVAppExpandIcon;
	
	@FindBy(xpath =("//*[@id=\"12104\"]/ins"))
    private WebElement CVAppDrawerExpandIcon;
	
	@FindBy(xpath =("//*[@id=\"12105\"]/ins"))
    private WebElement CVAppFolderExpandIcon;
	
	
	@FindBy(xpath =("//span[text()='Any changes to Document(s)']"))
    private WebElement AnyChangesToDocuments;
	
	@FindBy(xpath =("//div[@id='notificationsModal']//li[26]"))
    private WebElement ScrollIntoDown;
	
	
	public void selectDocNames() throws Exception {
		WebElement allList = driver.findElement(By.id("nodePropertiesDocTypeList"));
		org.openqa.selenium.support.ui.Select n = new org.openqa.selenium.support.ui.Select(allList);
		n.selectByValue("68");

		
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

	public void LogInAdmin() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(readFromExLogin(3, 0));
		driver.findElement(By.id("loginPassword")).sendKeys(readFromExLogin(3, 1));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		a1 = new Actions(driver);
		a1.moveToElement(room).click().build().perform();
		WebElement roomCV = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
		roomCV.click();
		WebElement LoginBTN = driver.findElement(By.id("submitid"));
		jsclick(LoginBTN);
		Thread.sleep(3000);
		try {
			WebElement sessiomsg = driver.findElement(By.cssSelector("#cvModelLoginValidationMessage"));
			WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
			if (sessiomsg.isDisplayed()) {
				jsclick(sessiomsgOK);
			}
		} catch (NoSuchElementException e) {
			Reporter.log("Login without msg");
		}

	}

	public void TakeOwnerShip() throws Exception {
		
		jsclick(RoomContextTab);
		movingDoublecli(Cabinet, Cabinet);
		Thread.sleep(5000);
		jsclick(Drawer);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Folder));
		movingDoublecli(Folder, Folder);
		Thread.sleep(5000);

		movingElement(RoomContextTab);
		Thread.sleep(5000);
		WebElement TakeOwnerShipTab = driver.findElement(By.xpath("//a[@id='takeOwnershipFolder']"));
		wait.until(ExpectedConditions.visibilityOf(TakeOwnerShipTab));
		Thread.sleep(3000);
		movingclkElement(TakeOwnerShipTab);
		Thread.sleep(6000);
		try {
			WebElement BTN = driver.findElement(By.xpath("(//button[@id='takeOwnerShipAnyway25'])[1]"));
			if (BTN.isDisplayed()) {
				jsclick(BTN);
			}
		} catch (Exception e) {
			Reporter.log("The document OwnerShip Taken Successfully");
		}

		Thread.sleep(8000);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		LogoutPage();
		Thread.sleep(4000);
		loginCVS();
		Thread.sleep(3000);

		movingDoublecli(Cabinet, Cabinet);
		Thread.sleep(3000);
		jsclick(Drawer);
		Thread.sleep(3000);
		movingDoublecli(Folder, Folder);
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		jsclick(ForLockedPDFDoc);
		Thread.sleep(3000);
		OKBTNDocLockDialog.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		Thread.sleep(8000);
		LogoutPage();
		Thread.sleep(3000);
		LogInAdmin();
		Thread.sleep(4000);
		movingDoublecli(Cabinet, Cabinet);
		Thread.sleep(3000);
		jsclick(Drawer);
		Thread.sleep(2000);
		movingDoublecli(Folder, Folder);
		Thread.sleep(5000);
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(ReleaseOSFolder));
		jsclick(ReleaseOSFolder);
		Thread.sleep(4000);
		LogoutPage();
		Thread.sleep(4000);
		loginCVS();
		Thread.sleep(2000);
		movingDoublecli(Cabinet, Cabinet);
		Thread.sleep(3000);
		jsclick(Drawer);
		Thread.sleep(2000);
		movingDoublecli(Folder, Folder);
		Thread.sleep(5000);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		jsclick(ForLockedPDFDoc);
		Thread.sleep(3000);
		alertIsPresent();
		acceptAlert();
		Thread.sleep(8000);
		LogoutPage();
		Thread.sleep(5000);
		LogInAdmin();
		Reporter.log("TakeOwnerShip functionality verified successfull", true);

	}

	public void CopyAndPasteDrawer() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		jsclick(RoomContextTab);
		movingDoublecli(Cabinet, Cabinet);
		Thread.sleep(3000);
		jsclick(drawerforCopy);
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(CopyTab));
		movingclkElement(CopyTab);
		Thread.sleep(3000);
		movingDoublecli(CvAppCabinet, CvAppCabinet);
		Thread.sleep(2000);

		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PasteTab));
		movingclkElement(PasteTab);
		Thread.sleep(3000);
		jsclick(PasteConfimDialogOKBTN);
		Thread.sleep(8000);
		scrollDown(CvAppCabinet);
		Thread.sleep(4000);
		jsclick(SelectCopyDrawer);
		Thread.sleep(5000);
		movingElement(RoomContextTab);
		Thread.sleep(4000);
		movingclkElement(DeleteTab);
		Thread.sleep(3000);
		jsclick(DeleteConfimDialogOKBTN);
		Thread.sleep(5000);
		scrollDown(CvAppCabinet);
		Reporter.log("Copy and paste drawer verified successfull", true);
	}

	public void copyAndpasteFolder() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		jsclick(RoomContextTab);
		movingDoublecli(Cabinet, Cabinet);
		Thread.sleep(3000);
		jsclick(Drawer);
		Thread.sleep(3000);
		jsclick(FolderForCopy);
		Thread.sleep(5000);
		
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(CopyTab));
		movingclkElement(CopyTab);
		Thread.sleep(4000);
		movingDoublecli(CvAppCabinet, CvAppCabinet);
		ElementToBeClickable(CVMobileappDrwer);
		movingDoublecli(CVMobileappDrwer, CVMobileappDrwer);//*[@id=\"12105\"]/a
		Thread.sleep(3000);//*[@id="26165"]/a
		WebElement NewFolderFrPaste = driver.findElement(By.xpath("//*[@id=\"12105\"]/a"));
		movingElement(NewFolderFrPaste);
		jsclick(NewFolderFrPaste);
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PasteTab));
		movingElement(PasteTab);
		jsclick(PasteTab);
		Thread.sleep(3000);
		jsclick(PasteConfimDialogOKBTN);
		Thread.sleep(15000);
      scrollDown(CVAppExpandIcon);
		Thread.sleep(3000);
	 jsclick(CVAppExpandIcon);
	    Thread.sleep(3000);
	  jsclick(CVAppDrawerExpandIcon);
	
	  Thread.sleep(3000);
	  /* WebElement apurbaFolder= driver.findElement(By.xpath("//*[@id=\"79485\"]/a"));
		jsclick(apurbaFolder);*/
	   Reporter.log("copy and paste folder with 40 documents pasted successfull", true);
	}

	public void NodeProperties() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		scrollDown(NishaRCaninet);
		wait.until(ExpectedConditions.elementToBeClickable(NishaRCaninet));
		movingDoublecli(NishaRCaninet, NishaRCaninet);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(NishaRDrawer));
		Thread.sleep(3000);
		movingDoublecli(NishaRDrawer, NishaRDrawer);
		wait.until(ExpectedConditions.elementToBeClickable(NishaRFolder));
		movingDoublecli(NishaRFolder, NishaRFolder);
		Thread.sleep(3000);

		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		jsclick(NodeProperties);
		Thread.sleep(6000);
		jsclick(selectDocDropDownFrNode);
		Thread.sleep(3000);
		selectDocNames();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(TextKey));
		movingclkElement(TextKey);
		TextKey.clear();
		sendvalue(TextKey, readFromRoomCntxt(1, 0));
		Thread.sleep(3000);

		scrollDown(numeric123);
		movingclkElement(numeric123);
		numeric123.clear();
		sendvalue(numeric123, "93838383823");
		Thread.sleep(5000);
		scrollDown(Restaurent);
		movingclkElement(Restaurent);
		Restaurent.clear();
		sendvalue(Restaurent, readFromRoomCntxt(4, 0));
		Thread.sleep(5000);
		scrollDown(Date);
		Thread.sleep(2000);
		movingclkElement(Date);

		jsclick(DateOct);

		Thread.sleep(2000);
		movingclkElement(Boolean123);
		Thread.sleep(2000);
		selectDropDownByIndex(YesORNoBoolean, 1);
		Thread.sleep(2000);
		selectDropDownByIndex(Selection123, 3);
		Thread.sleep(3000);
		jsclick(NodePropOKBTN);
		try {
			WebElement updatePopup = driver.findElement(By.id("confirmMessageOk35"));
			if (updatePopup.isDisplayed()) {
				updatePopup.click();
			}
		} catch (Exception e) {
			Reporter.log("Node Properties Updated Successfully...");
		}

		Thread.sleep(3000);
		movingclkElement(CreateDocTab);
		Thread.sleep(3000);

		WebElement moveToPlusIcon = driver.findElement(By.xpath(
				"//*[@id=\"addPagesDropDown\"]/span"));
		VisiblityOf(moveToPlusIcon);
		movingElement(moveToPlusIcon);
		Thread.sleep(4000);
		WebElement browseOption = driver.findElement(By.xpath("//input[@id='viewDocumentAddPages']"));
		movingclkElement(browseOption);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\AutoImage\\FilesAuto_x64.exe");
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		Thread.sleep(5000);
		WebElement CreateBTN = driver.findElement(By.xpath("(//button[normalize-space()='Create'])[1]"));
		jsclick(CreateBTN);
		Thread.sleep(15000);
		WebElement viewOption = driver.findElement(By.xpath("(//button[normalize-space()='View'])[1]"));
		jsclick(viewOption);
		Thread.sleep(15000);
		jsclick(RoomContextTab);
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		jsclick(NodeProperties);
		Thread.sleep(6000);
		jsclick(NodeResetBTN);
		Thread.sleep(3000);
		jsclick(NodeResetYesBTN);
		Thread.sleep(8000);
		jsclick(NodePropOKBTN);
		Thread.sleep(3000);
		try {
			WebElement updatePopup = driver.findElement(By.id("confirmMessageOk35"));
			if (updatePopup.isDisplayed()) {
				updatePopup.click();
			}
		} catch (Exception e) {
			Reporter.log("Node Properties Updated Successfully...");
		}

		Thread.sleep(3000);
		movingclkElement(CreateDocTab);
		Thread.sleep(8000);
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		Reporter.log("node properties verified successfully", true);
	}

	public void NodePropertiesDefault() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		jsclick(RoomContextTab);
		wait.until(ExpectedConditions.elementToBeClickable(vidyaCaninet));
		movingDoublecli(vidyaCaninet, vidyaCaninet);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(vidyaDrawer));
		Thread.sleep(3000);
		movingDoublecli(vidyaDrawer, vidyaDrawer);
		wait.until(ExpectedConditions.elementToBeClickable(vidyaFolder));
		movingDoublecli(vidyaFolder, vidyaFolder);
		Thread.sleep(3000);

		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		jsclick(NodeProperties);
		Thread.sleep(10000);

		jsclick(CountriesDrpdown);
		Thread.sleep(3000);
		selectDropDownByIndex(CountriesDrpdown, 6);
		Thread.sleep(3000);
		jsclick(NodePropOKBTN);
		try {
			WebElement updatePopup = driver.findElement(By.id("confirmMessageOk35"));
			if (updatePopup.isDisplayed()) {
				updatePopup.click();
			}
		} catch (Exception e) {
			Reporter.log("Node Properties Updated Successfully...");
		}
		Thread.sleep(5000);
		movingclkElement(CreateDocTab);

		Thread.sleep(10000);
		jsclick(Refresh_Button(driver));
	}

	public void Notification() throws Exception {
		jsclick(RoomContextTab);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(DeleteCheckCabinet));
		movingDoublecli(DeleteCheckCabinet, DeleteCheckCabinet);
		//Thread.sleep(3000);
	//	wait.until(ExpectedConditions.elementToBeClickable(DeleteChkDfDfDrawer));
		Thread.sleep(3000);
		movingDoublecli(DeleteChkDfDfDrawer, DeleteChkDfDfDrawer);
		wait.until(ExpectedConditions.elementToBeClickable(folderSecurityPermissionCheck));
		movingDoublecli(folderSecurityPermissionCheck, folderSecurityPermissionCheck);
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(Notification));
		Thread.sleep(3000);
		jsclick(Notification);
		Thread.sleep(2000);
		jsclick(resetBTNmyPref);
		Thread.sleep(3000);
		jsclick(NotificationDropDown);
		Thread.sleep(3000);

		WebElement AnyChangesOption = driver.findElement(By.xpath(" //span[text()='Any changes to folder']"));
		VisiblityOf(AnyChangesOption);
		jsclick(AnyChangesOption);
		Thread.sleep(3000);
		scrollDown(AnyChangesToDocuments);
		wait.until(ExpectedConditions.elementToBeClickable(AnyChangesToDocuments));
		movingElement(AnyChangesToDocuments);
		jsclick(AnyChangesToDocuments);
		Thread.sleep(3000);
		scrollDown(ScrollIntoDown);
		Thread.sleep(4000);
		scrollUp(AnyChangesOption);
		Thread.sleep(4000);
		jsclick(applyBTNmypref);
		Thread.sleep(10000);
		movingDoublecli(ForOpenNotiAgain, ForOpenNotiAgain);
		// jsclick(Notification);
		Thread.sleep(3000);
		jsclick(NotificationDropDown);
		Thread.sleep(3000);
		try {
			WebElement FolderDocoption = driver
					.findElement(By.xpath("//span[text()='Folder / Document /  Sub Folder is created']"));
			if (FolderDocoption.isDisplayed()) {
				jsclick(resetBTNmyPref);
				Thread.sleep(2000);
				jsclick(FolderDocoption);
				jsclick(applyBTNmypref);
				Thread.sleep(10000);
			}
		} catch (Exception e) {
			Reporter.log("Folder/document/subfolder changes notified");
		}
		Thread.sleep(3000);
		movingElement(RoomContextTab);

		wait.until(ExpectedConditions.visibilityOf(Notification));
		Thread.sleep(3000);
		jsclick(Notification);
		Thread.sleep(2000);
		// Thread.sleep(4000);

		jsclick(resetBTNmyPref);
		Thread.sleep(2000);
		jsclick(NotificationDropDown);
		Thread.sleep(2000);
		WebElement CustomeClNoti = driver.findElement(By.xpath("//span[@id='spanCheckNotifications_36']"));
		if (CustomeClNoti.isSelected()) {
			Reporter.log("Its already selected");
		} else {
			jsclick(CustomeClNoti);
		}
		Thread.sleep(2000);
		jsclick(applyBTNmypref);
		Thread.sleep(8000);

		Reporter.log("Notification verified successfull", true);
	}

	public void CustomDocTypes() throws Exception {

		jsclick(RoomContextTab);
		jsclick(CabinetForCustomDoc);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(customdoc));
		Thread.sleep(3000);
		jsclick(customdoc);
		Thread.sleep(5000);
	//	WebElement bill = driver.findElement(By.xpath("(//span[@id='spanCheckCustomDocTypeValues_12'])[1]"));
		Thread.sleep(3000);
		if (bill.isSelected()) {
			Reporter.log("Success");
		} else {
			jsclick(bill);
		}
		Thread.sleep(3000);
	//	WebElement dateMask = driver.findElement(By.xpath("//*[@id=\"spanCheckCustomDocTypeValues_27\"]"));
		if (dateMask.isSelected()) {
			Reporter.log("Success");
		} else {
			jsclick(dateMask);
		}
		Thread.sleep(3000);
		//WebElement cvReports1 = driver.findElement(By.xpath("(//span[@id='spanCheckCustomDocTypeValues_74'])[1]"));
		if (cvReports1.isSelected()) {
			Reporter.log("Success");
		} else {
			jsclick(cvReports1);
		}
		Thread.sleep(4000);
	//	WebElement cvReports = driver.findElement(By.xpath("(//span[@id='spanCheckCustomDocTypeValues_1'])[1]"));
		if (cvReports.isSelected()) {
			Reporter.log("Success");
		} else {
			jsclick(cvReports);
		}
	//	WebElement alldatatype = driver.findElement(By.xpath("(//span[@id='spanCheckCustomDocTypeValues_68'])[1]"));
		if (alldataType.isSelected()) {
			Reporter.log("Success");
		} else {
			jsclick(alldataType);
		}
		Thread.sleep(5000);
		WebElement OKBTNcustomcol = driver.findElement(By.xpath("(//button[@id='setCustomDocTypeOK'])[1]"));
		jsclick(OKBTNcustomcol);
		Thread.sleep(3000);
		jsclick(CreateDocTab);
		Thread.sleep(5000);
		movingclkElement(selectDocDropDown);
		Thread.sleep(8000);
		jsclick(RoomContextTab);
		Thread.sleep(4000);
		jsclick(CabinetForCustomDoc);
		Thread.sleep(4000);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(customdoc));
		Thread.sleep(3000);
		jsclick(ResetcustomDocType);
		Thread.sleep(4000);
		movingDoublecli(CabinetForCustomDoc, CabinetForCustomDoc);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(customdoc));
		Thread.sleep(3000);
		jsclick(customdoc);
		Thread.sleep(5000);
		WebElement cancelBTNCd = driver.findElement(By.id("setCustomDocTypeCancel"));
		jsclick(cancelBTNCd);
		jsclick(Refresh_Button(driver));
		Reporter.log("custome documents verified successfull", true);
	}

	public void CategoryPrivate() throws Exception {

		jsclick(RoomContextTab);
		jsclick(CabinetForCustomDoc);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
 		wait.until(ExpectedConditions.visibilityOf(Categories));
		Thread.sleep(3000);
		jsclick(Categories);
		Thread.sleep(5000);
		
		WebElement privateView = driver.findElement(By.xpath("//span[text()='Private ']"));
		
            movingElement(privateView);
			jsclick(privateView);
		
		Thread.sleep(2000);
		WebElement RedColr = driver.findElement(By.xpath("//span[@id='CustomColourid_9']"));
		movingElement(RedColr);
		jsclick(RedColr);
		Thread.sleep(3000);
		WebElement OKBTNColor = driver.findElement(By.xpath("(//button[@id='customColourModelOk'])[1]"));
		jsclick(OKBTNColor);
		Thread.sleep(2000);
		jsclick(Refresh_Button(driver));
		Thread.sleep(8000);
		LogoutPage();
		loginCVS();
		Reporter.log("Categories Private lever working fine", true);
	}

	public void CategoryPublic() throws Exception {

		movingDoublecli(Cabinet, Cabinet);
		// jsclick(Cabinet);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Thread.sleep(3000);
		jsclick(Categories);

		Thread.sleep(5000);
		WebElement publicView = driver.findElement(By.xpath("//span[text()='Public  ']"));
	
        movingElement(publicView);
       
		wait.until(ExpectedConditions.elementToBeClickable(publicView));
		jsclick(publicView);
		Thread.sleep(3000);
		WebElement PurpleColr = driver.findElement(By.xpath("//span[@id='CustomColourid_5']"));
		movingElement(PurpleColr);
		jsclick(PurpleColr);
		Thread.sleep(3000);
		WebElement OKBTNColor = driver.findElement(By.xpath("(//button[@id='customColourModelOk'])[1]"));
		jsclick(OKBTNColor);
		Thread.sleep(3000);
		LogoutPage();
		Thread.sleep(2000);
		LogInAdmin();
		Thread.sleep(3000);
	//	movingclkElement(Cabinet);
		Thread.sleep(8000);
		Reporter.log("categories public sorks fine", true);
	}

}


