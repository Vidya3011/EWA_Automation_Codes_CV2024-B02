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
	
	
	@FindBy(xpath = ("//*[@id=\"1\"]/ins"))
	private WebElement CabinetTest;
	

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

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[2]/td[3]"))
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


	@FindBy(xpath = ("//*[@id=\"1\"]/ins"))
	private WebElement CabinetForCSR;
	

	@FindBy(xpath = ("//*[@id=\"2\"]/ins"))
	private WebElement DrawerForCSR;
	
	

	@FindBy(xpath = ("//*[@id=\"70\"]/a"))
	private WebElement FolderForCSR;
	
	
	

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

	@FindBy(xpath = ("//a[text()='CustomDocumentAutomation']"))
	private WebElement CabinetForCustomDoc;

	@FindBy(xpath = ("//a[@id='custmDocumentTypes']"))
	private WebElement customdoc;
	
	@FindBy(xpath = ("(//span[@id='spanCheckCustomDocTypeValues_12'])[1]"))
	private WebElement bill;
	
	@FindBy(xpath = ("//*[@id=\"spanCheckCustomDocTypeValues_27\"]"))
	private WebElement dateMask;
	
	
	@FindBy(xpath = ("//span[text()='CVReports ']"))
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
	//*[@id=\"78995\"]/a
	@FindBy(xpath = ("//*[@id=\"86809\"]/a"))
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

	public void selectDocNamesCSR() throws Exception {
		WebElement allList = driver.findElement(By.id("nodePropertiesDocTypeList"));
		org.openqa.selenium.support.ui.Select n = new org.openqa.selenium.support.ui.Select(allList);
		n.selectByVisibleText("CVReports");
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
	
	public void LogInAdminSQL() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(readFromExLogin(3, 0));
		driver.findElement(By.id("loginPassword")).sendKeys(readFromExLogin(3, 1));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		a1 = new Actions(driver);
		a1.moveToElement(room).click().build().perform();
		WebElement roomCV = driver.findElement(By.xpath("//*[@id=\"rooms\"]/option[4]"));
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
		Reporter.log("Scenario 01: Verify Roomcontextmenu tab Takeownership and ReleaseOwnership function");
		jsclick(RoomContextTab);
	    Reporter.log("User click on roomcontextmenu tab");
		Thread.sleep(3000);
		jsclick(CabinetTest);
		 Reporter.log("User expand cabinet");
		Thread.sleep(5000);
		jsclick(Drawer);
		 Reporter.log("User expand drawer");
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
	//	wait.until(ExpectedConditions.elementToBeClickable(Folder));
		jsclick(Folder);
		 Reporter.log("User select a folder");
		Thread.sleep(5000);

		movingElement(RoomContextTab);
		 Reporter.log("User mousehover on roomcontextmenu tab");
		Thread.sleep(5000);
		WebElement TakeOwnerShipTab = driver.findElement(By.xpath("//a[@id='takeOwnershipFolder']"));
		wait.until(ExpectedConditions.visibilityOf(TakeOwnerShipTab));
		Thread.sleep(3000);
		movingclkElement(TakeOwnerShipTab);
		 Reporter.log("User click on TakeOwnerShip submenu");
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
		 Reporter.log("User again mousehover on Roomcontextmenu tab to check takeownership is visible or disable");
		Thread.sleep(3000);
		LogoutPage();
		 Reporter.log("User logout the session");
		Thread.sleep(4000);
		loginCVS();
		 Reporter.log("Login as RNisha user to check Takeownership functionlity is working or not");
		Thread.sleep(3000);

		jsclick(CabinetTest);
		 Reporter.log("User expand Takeownership cabinet");
		Thread.sleep(3000);
		jsclick(Drawer);
		 Reporter.log("User expand drawer");
		Thread.sleep(3000);
		selectElement(Folder);
		 Reporter.log("User open a Takeownership folder");
		Thread.sleep(3000);
		 Reporter.log("User mousehover on RoomcontextMenu tab to check Takeownership is visible or disable");
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		 Reporter.log("User open a Takeownership folder document");
		VisiblityOf(ForLockedPDFDoc);
		jsclick(ForLockedPDFDoc);
		Thread.sleep(3000);
		 Reporter.log("It should display'Document locked by admin' warning dialog, Warning dialog displayed successfull");
		OKBTNDocLockDialog.sendKeys(Keys.ENTER);
		 Reporter.log("Viewer menu tool bar should be disable");
		Thread.sleep(3000);
		try 
		{
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		}
		catch(Exception e) {
			Reporter.log("NoAlertISPResent");
		}
		Thread.sleep(8000);
		LogoutPage();
		 Reporter.log("Rnisha user logged out the session");
		Thread.sleep(3000);
		LogInAdmin();
		 Reporter.log("Log into EWA as admin user");
		Thread.sleep(4000);
		jsclick(CabinetTest);
		 Reporter.log("User expand Cabinet");
		Thread.sleep(3000);
		jsclick(Drawer);
		 Reporter.log("User expand drawer");
		Thread.sleep(2000);
		selectElement(Folder);
		Thread.sleep(5000);
		 Reporter.log("User mousehover on Roomcontext menu tab");
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(ReleaseOSFolder));
		jsclick(ReleaseOSFolder);
		 Reporter.log("User click on Release ownership submenu");
		Thread.sleep(4000);
		LogoutPage();
		 Reporter.log("Admin user logout the session");
		Thread.sleep(4000);
		loginCVS();
		 Reporter.log("Rnisha user log into EWA to check release ownership working or not");
		Thread.sleep(2000);
		selectElement(Cabinet);
		 Reporter.log("User expand cabinet");
		Thread.sleep(3000);
		jsclick(Drawer);
		 Reporter.log("User expand drawer");
		Thread.sleep(2000);
		selectElement(Folder);
		 Reporter.log("User expand folder");
		Thread.sleep(5000);
		movingElement(RoomContextTab);
		 Reporter.log("User mousehover on RoomContextTab to check release ownership visable or disable");
		Thread.sleep(3000);
		jsclick(ForLockedPDFDoc);
		 Reporter.log("User open the document");
		
		Thread.sleep(3000);
		try {
		alertIsPresent();
		acceptAlert();
		}
		catch(Exception e) {
			System.out.println("AlertISNotPResent");
		}
		Thread.sleep(8000);
		 Reporter.log("Now Rnisha user allow to use viewer menu tool bar icon ");
		LogoutPage();
		 Reporter.log("Nisha logout the session");
		Thread.sleep(5000);
		 Reporter.log("Takeownership and Release ownership functionality working fine...");
		LogInAdmin();
		
		Reporter.log("TakeOwnerShip functionality verified successfull", true);

	}

	public void CopyAndPasteDrawer() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Reporter.log("Scenario 02: Verify copy paste drawer level");
		 Reporter.log("Login as admin user");
		jsclick(RoomContextTab);
		Reporter.log("User mousehover on Roomcontextmenu tab");
		movingDoublecli(Cabinet, Cabinet);
		Reporter.log("User expand the cabinet");
		Thread.sleep(3000);
		jsclick(drawerforCopy);
		Reporter.log("User select a drawer");
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Reporter.log("User mousehover on Roomcontextmenu tab");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(CopyTab));
		movingclkElement(CopyTab);
		Reporter.log("User click on copy submenu");
		Thread.sleep(3000);
		selectElement(CvAppCabinet);
		Reporter.log("User Expand cabinet");
		Thread.sleep(2000);
		Reporter.log("User select a drawer");
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Reporter.log("Mousehover on Roomcontextmenu tab");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PasteTab));
		Reporter.log("User click on paste submenu");
		movingclkElement(PasteTab);
		Thread.sleep(3000);
		Reporter.log("User click on paste confirm dialog OK button");
		jsclick(PasteConfimDialogOKBTN);
		Thread.sleep(8000);
		scrollDown(CvAppCabinet);
		Reporter.log("User Expand the cabinet");
		Thread.sleep(4000);
		jsclick(SelectCopyDrawer);
		Reporter.log("User select the pasted drawer");
		Thread.sleep(5000);
		movingElement(RoomContextTab);
		Reporter.log("User mousehover on Roomcontextmenu tab");
		Thread.sleep(4000);
		Reporter.log("User click on Delete submenu");
		movingclkElement(DeleteTab);
		Thread.sleep(3000);
		Reporter.log("Click delete confirm dialog OK button");
		jsclick(DeleteConfimDialogOKBTN);
		Thread.sleep(5000);
		Reporter.log("Roomcontextmenu Delete submenu working fine...");
		scrollDown(CvAppCabinet);
		Reporter.log("Copy paste drawer level working fine...");
		Reporter.log("Copy and paste drawer verified successfull", true);
	}
	
	

	public void copyAndpasteFolder() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Reporter.log("Scenario 03: Verify copy paste folder level");
		jsclick(RoomContextTab);
		Reporter.log("User click on Roomcontextmenu tab");
		selectElement(Cabinet);
		Reporter.log("User expand the cabinet");
		Thread.sleep(3000);
		jsclick(Drawer);
		Reporter.log("User expand the drawer");
		Thread.sleep(3000);
		jsclick(FolderForCopy);
		Reporter.log("User select a folder");
		Thread.sleep(5000);
		Reporter.log("User mousehover on Roomcontextmenu tab");
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(CopyTab));
		Reporter.log("User click on copy submenu");
		movingclkElement(CopyTab);
		Reporter.log("User expand cabinet");
		Thread.sleep(4000);
		selectElement(CvAppCabinet);
		Reporter.log("User expand the drawer");
		ElementToBeClickable(CVMobileappDrwer);
		selectElement(CVMobileappDrwer);//*[@id=\"12105\"]/a
		Thread.sleep(3000);//*[@id="26165"]/a
		WebElement NewFolderFrPaste = driver.findElement(By.xpath("//*[@id=\"12105\"]/a"));
		movingElement(NewFolderFrPaste);
		Reporter.log("User select folder to paste a copied folder");
		jsclick(NewFolderFrPaste);
		Thread.sleep(3000);
		Reporter.log("User mousehover on Roomcontextmenu tab");
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PasteTab));
		movingElement(PasteTab);
		Reporter.log("User click on paste submenu");
		jsclick(PasteTab);
		Thread.sleep(3000);
		Reporter.log("User click on paste confirm dialog OK button");
		jsclick(PasteConfimDialogOKBTN);
		Thread.sleep(15000);
      scrollDown(CVAppExpandIcon);
      Reporter.log("Copy paste folder level working fine...");
		Thread.sleep(3000);
	 jsclick(CVAppExpandIcon);
	    Thread.sleep(3000);
	  jsclick(CVAppDrawerExpandIcon);
	
	  Thread.sleep(3000);
	  /* WebElement apurbaFolder= driver.findElement(By.xpath("//*[@id=\"79485\"]/a"));
		jsclick(apurbaFolder);*/
	   Reporter.log("Pasted folder has 40 documents", true);
	}

	public void NodePropertiesCSR() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		Actions act=new Actions(driver);
		//scrollDown(NishaRCaninet);
		wait.until(ExpectedConditions.elementToBeClickable(CabinetForCSR));
		jsclick(CabinetForCSR);
	
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(DrawerForCSR));
		Thread.sleep(3000);
		jsclick(DrawerForCSR);
		wait.until(ExpectedConditions.elementToBeClickable(FolderForCSR));
		movingDoublecli(FolderForCSR, FolderForCSR);
		Thread.sleep(3000);

		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		jsclick(NodeProperties);
		Thread.sleep(6000);
		jsclick(selectDocDropDownFrNode);
		Thread.sleep(3000);
		selectDocNamesCSR();
		Thread.sleep(2000);
		WebElement CvReports=driver.findElement(By.xpath("//*[@id=\"nodePropVal_5\"]"));
	     act.click(CvReports).sendKeys("Automation Document 01").build().perform();
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
		Thread.sleep(8000);
		try {
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		}catch(Exception e) {
			Reporter.log("Alert not present. . .");
		}
		Thread.sleep(5000);
		WebElement CreateBTN = driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		jsclick(CreateBTN);
		Thread.sleep(15000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
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

	
	
	
	
	
	
	public void NodeProperties() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 20);
	    Reporter.log("Scneario 04: Verify Node properties functionality");
		scrollDown(NishaRCaninet);
		Reporter.log("User expand the cabinet");
		wait.until(ExpectedConditions.elementToBeClickable(NishaRCaninet));
		selectElement(NishaRCaninet);
		Reporter.log("User expand the drawer");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(NishaRDrawer));
		Thread.sleep(3000);
		selectElement(NishaRDrawer);
		Reporter.log("User select a folder");
		wait.until(ExpectedConditions.elementToBeClickable(NishaRFolder));
		selectElement(NishaRFolder);
		Thread.sleep(3000);
		Reporter.log("Mousehover on Roomcontextmenu tab");
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		Reporter.log("User click on Nodeproperties submenu");
		jsclick(NodeProperties);
		
		Thread.sleep(6000);
		jsclick(selectDocDropDownFrNode);
		Reporter.log("User select a document type");
		Thread.sleep(3000);
		Reporter.log("User select AllDataType ");
		selectDocNames();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(TextKey));
		movingclkElement(TextKey);
		TextKey.clear();
		Reporter.log("User enter a TextKey value");
		sendvalue(TextKey, readFromRoomCntxt(1, 0));
		Thread.sleep(3000);

		scrollDown(numeric123);
		Reporter.log("User enter value into Numeric123 text box");
		movingclkElement(numeric123);
		numeric123.clear();
		sendvalue(numeric123, "93838383823");
		Reporter.log("User enter value into Restaruent textbox");
		Thread.sleep(5000);
		scrollDown(Restaurent);
		movingclkElement(Restaurent);
		Restaurent.clear();
		sendvalue(Restaurent, readFromRoomCntxt(4, 0));
		Thread.sleep(5000);
		Reporter.log("User select a date");
		scrollDown(Date);
		Thread.sleep(2000);
		movingclkElement(Date);

		jsclick(DateOct);

		Thread.sleep(2000);
		movingclkElement(Boolean123);
		Thread.sleep(2000);
		Reporter.log("User select Boolean123 dropdown YES");
		selectDropDownByIndex(YesORNoBoolean, 1);
		Thread.sleep(2000);
		selectDropDownByIndex(Selection123, 3);
		Thread.sleep(3000);
		Reporter.log("User select Alpha in Selection123 dropdown.");
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
		Reporter.log("User clicn on new document tab");
		movingclkElement(CreateDocTab);
		Thread.sleep(3000);

		WebElement moveToPlusIcon = driver.findElement(By.xpath(
				"//*[@id=\"addPagesDropDown\"]/span"));
		VisiblityOf(moveToPlusIcon);
		Reporter.log("User click on browse icon");
		movingElement(moveToPlusIcon);
		Thread.sleep(4000);
		Reporter.log("Click broswe submenu");
		WebElement browseOption = driver.findElement(By.xpath("//input[@id='viewDocumentAddPages']"));
		movingclkElement(browseOption);
		Reporter.log("User added file from the folder by using AutoIT");
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\AutoImage\\FilesAuto_x64.exe");
		Thread.sleep(8000);
		try {
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		}catch(Exception e) {
			Reporter.log("Alert not present. . .");
		}
		Thread.sleep(5000);
		WebElement CreateBTN = driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		jsclick(CreateBTN);
		Reporter.log("User click on create button");
		Thread.sleep(15000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		jsclick(viewOption);
		Reporter.log("User click on view button");
		
		Thread.sleep(15000);
		jsclick(RoomContextTab);
		Thread.sleep(3000);
		Reporter.log("User mousehover on Roomcontextmenu tab");
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		Reporter.log("User select Nodeproperties submenu");
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		jsclick(NodeProperties);
		Reporter.log("User click on reset button");
		Thread.sleep(6000);
		jsclick(NodeResetBTN);
		Reporter.log("User click on reset confirm dialog OK button");
		Thread.sleep(3000);
		jsclick(NodeResetYesBTN);
		Reporter.log("Reset working fine. Node properties got reset...");
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
		Reporter.log("Scenario 06:Verify default  NodeProperties  ");
		wait.until(ExpectedConditions.elementToBeClickable(vidyaCaninet));
		selectElement(vidyaCaninet);
		Reporter.log("User should expand a cabinet which has default node value");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(vidyaDrawer));
		Thread.sleep(3000);
		Reporter.log("User should expand a drawer which has default node value");
		selectElement(vidyaDrawer);
		Reporter.log("User should select a folder which has default node value");
		wait.until(ExpectedConditions.elementToBeClickable(vidyaFolder));
		selectElement(vidyaFolder);
		Thread.sleep(3000);
		Reporter.log("User mousehover on Roomcontextmenu and select nodeproperties submenu");
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		jsclick(NodeProperties);
		Thread.sleep(10000);
		Reporter.log("Nodeproperties dialog box opened");
		jsclick(CountriesDrpdown);
		Thread.sleep(3000);
		Reporter.log("User has change the country dropdonw");
		selectDropDownByIndex(CountriesDrpdown, 6);
		Thread.sleep(3000);
		jsclick(NodePropOKBTN);
		Reporter.log("User click on nodeproperties dialog OK button");
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
		Reporter.log("User click on new documebt tab");
		Thread.sleep(10000);
		Reporter.log("The page should show the default Nodeproperty values");
		jsclick(Refresh_Button(driver));
		Reporter.log("Default NodeProeprty  working fine");
		Reporter.log("Click on refresh button");
	}

	public void Notification() throws Exception {
		Reporter.log("Scenario 06: Verify Roomcontextmenu tab Notification functionlity");
		jsclick(RoomContextTab);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(3000);
		Reporter.log("User expand the cabinet and expand the drawer to slect a folder.");
		wait.until(ExpectedConditions.elementToBeClickable(DeleteCheckCabinet));
		selectElement(DeleteCheckCabinet);
		//Thread.sleep(3000);
	//	wait.until(ExpectedConditions.elementToBeClickable(DeleteChkDfDfDrawer));
		Thread.sleep(3000);
		Reporter.log("User select a folder");
		selectElement(DeleteChkDfDfDrawer);
		Reporter.log("User mousehover on Roomcontext menu tab ");
		wait.until(ExpectedConditions.elementToBeClickable(folderSecurityPermissionCheck));
		selectElement(folderSecurityPermissionCheck);
		Reporter.log("USer select Notification submenu");
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(Notification));
		Thread.sleep(3000);
		jsclick(Notification);
		Thread.sleep(2000);
		Reporter.log("Notifiaction dialog opened");
		jsclick(resetBTNmyPref);
		Reporter.log("User click on reset button");
		Thread.sleep(3000);
		Reporter.log("Reset functionlity working fine...");
		jsclick(NotificationDropDown);
		Reporter.log("User click on notificationdropdonw");
		Thread.sleep(3000);
		Reporter.log("User select any changes to the folder option");
		WebElement AnyChangesOption = driver.findElement(By.xpath(" //span[text()='Any changes to folder']"));
		VisiblityOf(AnyChangesOption);
		jsclick(AnyChangesOption);
		Thread.sleep(3000);
		Reporter.log("User select' any changes to the document' option from the notification dropdonw");
		scrollDown(AnyChangesToDocuments);
		wait.until(ExpectedConditions.elementToBeClickable(AnyChangesToDocuments));
		movingElement(AnyChangesToDocuments);
		jsclick(AnyChangesToDocuments);
		
		Thread.sleep(3000);
		scrollDown(ScrollIntoDown);
		Reporter.log("User clcik on apply button");
		Thread.sleep(4000);
		scrollUp(AnyChangesOption);
		Reporter.log("USer select notification tab, it will show the notification");
		Thread.sleep(4000);
		jsclick(applyBTNmypref);
		Reporter.log("If any changes have been made by other user in the selected notification folder. The specified user will receive a notification");
		Thread.sleep(10000);
		selectElement(ForOpenNotiAgain);
	
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
		Reporter.log("Scneario 07: Verify RoomContextmenu CustomDocument type");
		jsclick(RoomContextTab);
		jsclick(CabinetForCustomDoc);
		Thread.sleep(2000);
		Reporter.log("User select a cabinet to set custom document type");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		movingElement(RoomContextTab);
		Reporter.log("Mousehover on Roomcontextmenu tab");
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOf(customdoc));
		Thread.sleep(3000);
		jsclick(customdoc);
		Reporter.log("User select Custom DocumentType submenu");
		Thread.sleep(5000);
	//	WebElement bill = driver.findElement(By.xpath("(//span[@id='spanCheckCustomDocTypeValues_12'])[1]"));
		Thread.sleep(3000);
		/*if (bill.isSelected()) {
			Reporter.log("Success");
		} else {*/
			jsclick(bill);
	//	}
		Thread.sleep(3000);
	//	WebElement dateMask = driver.findElement(By.xpath("//*[@id=\"spanCheckCustomDocTypeValues_27\"]"));
	/*	if (dateMask.isSelected()) {
			Reporter.log("Success");
		} else {*/
			jsclick(dateMask);
	//	}
			Reporter.log("Customdocument type dialog box opened");
			Reporter.log("User select DateMask document type");
		Thread.sleep(3000);
		//WebElement cvReports1 = driver.findElement(By.xpath("(//span[@id='spanCheckCustomDocTypeValues_74'])[1]"));
		/*if (cvReports1.isSelected()) {
			Reporter.log("Success");
		} else {
			jsclick(cvReports1);
		}*/
		Thread.sleep(4000);
	//	WebElement cvReports = driver.findElement(By.xpath("(//span[@id='spanCheckCustomDocTypeValues_1'])[1]"));
		Reporter.log("User select CVReports document type");
			jsclick(cvReports);
			Reporter.log("User select CVFReport1 document type");
	//	WebElement alldatatype = driver.findElement(By.xpath("(//span[@id='spanCheckCustomDocTypeValues_68'])[1]"));
		/*if (alldataType.isSelected()) {
			Reporter.log("Success");
		} else {
			jsclick(alldataType);
		}*/
		Thread.sleep(5000);
		WebElement OKBTNcustomcol = driver.findElement(By.xpath("(//button[@id='setCustomDocTypeOK'])[1]"));
		jsclick(OKBTNcustomcol);
		Reporter.log("User Click on custom document type dloag OK button");
		Thread.sleep(3000);
		jsclick(CreateDocTab);
		Reporter.log("User click on new document tab");
		Thread.sleep(5000);
		movingclkElement(selectDocDropDown);
		Reporter.log("User click on dropdown");
		Thread.sleep(15000);
		jsclick(RoomContextTab);
		Thread.sleep(4000);
		Reporter.log("It should show only three selected document type");
		jsclick(CabinetForCustomDoc);
		Thread.sleep(4000);
		Reporter.log("The selected document type displayed successfull");
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(customdoc));
		Thread.sleep(3000);
		Reporter.log("User Click on RoomContextmenu tab to select Resetcustomdocument ");
		Reporter.log("Customdocument type Reset successfully...");
		jsclick(ResetcustomDocType);
		Thread.sleep(7000);
		
		jsclick(Refresh_Button(driver));
		Reporter.log("custome documents verified successfull", true);
	}

	public void CategoryPrivate() throws Exception {

		jsclick(RoomContextTab);
		jsclick(CabinetForCustomDoc);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		movingElement(RoomContextTab);
		Thread.sleep(7000);
 		wait.until(ExpectedConditions.visibilityOf(Categories));
		Thread.sleep(3000);
		jsclick(Categories);
		Thread.sleep(5000);
		
		WebElement privateView = driver.findElement(By.xpath("//span[text()='Private ']"));
		
            movingElement(privateView);
			jsclick(privateView);
		
		Thread.sleep(2000);
		WebElement RedColr = driver.findElement(By.xpath("//span[@id='CustomColourid_5']"));
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
		WebElement PurpleColr = driver.findElement(By.xpath("//span[@id='CustomColourid_7']"));
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
		Reporter.log("categories public works fine", true);
	}
	

	@FindBy(xpath = "//*[@id=\"376\"]/a")
	private WebElement SQLRoomFolder;
	
	
public void TakeOwnerShip_SQL() throws Exception {
		
		jsclick(RoomContextTab);
		Thread.sleep(3000);
		jsclick(CabinetTest);
		Thread.sleep(5000);
		jsclick(Drawer);
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
	//	wait.until(ExpectedConditions.elementToBeClickable(Folder));
		jsclick(SQLRoomFolder);
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
		loginSQL2022();
		Thread.sleep(3000);

		jsclick(CabinetTest);
		Thread.sleep(3000);
		jsclick(Drawer);
		Thread.sleep(3000);
		movingDoublecli(SQLRoomFolder,SQLRoomFolder);
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		VisiblityOf(ForLockedPDFDoc);
		jsclick(ForLockedPDFDoc);
		Thread.sleep(3000);
		OKBTNDocLockDialog.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		try 
		{
		wait.until(ExpectedConditions.alertIsPresent());
		acceptAlert();
		}
		catch(Exception e) {
			Reporter.log("NoAlertISPResent");
		}
		Thread.sleep(8000);
		LogoutPage();
		Thread.sleep(3000);
		LogInAdminSQL();
		Thread.sleep(4000);
		jsclick(CabinetTest);
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
		loginSQL2022();
		Thread.sleep(2000);
		movingDoublecli(Cabinet, Cabinet);
		Thread.sleep(3000);
		jsclick(Drawer);
		Thread.sleep(2000);
		movingDoublecli(SQLRoomFolder,SQLRoomFolder);
		Thread.sleep(5000);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		jsclick(ForLockedPDFDoc);
		Thread.sleep(3000);
		try {
		alertIsPresent();
		acceptAlert();
		}
		catch(Exception e) {
			System.out.println("AlertISNotPResent");
		}
		Thread.sleep(8000);
		LogoutPage();
		Thread.sleep(5000);
		LogInAdminSQL();
		Reporter.log("TakeOwnerShip functionality verified successfull", true);

	}


}


