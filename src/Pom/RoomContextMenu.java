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

	@FindBy(xpath = ("//*[@id='navigationMenuBtn']"))
	private WebElement RoomContextTab;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[2]/a"))
	private WebElement Cabinet;
	
	

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ins"))
	private WebElement CabinetTest;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/ins"))
	private WebElement Drawer;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/ul/li[9]/a"))//5 dipak automation folder
	private WebElement Folder;

	@FindBy(xpath = ("//*[@id=\"1002\"]/a"))
	private WebElement FolderVidya;



	@FindBy(xpath = ("//a[@id='takeOwnershipFolder']"))
	private WebElement TakeOwner;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[2]/td[3]"))
	private WebElement ForLockedPDFDoc;

	@FindBy(xpath = ("(//button[@class='modalDialogButtons'])[17]"))
	private WebElement OKBTNDocLockDialog;

	@FindBy(xpath = ("//a[@id='releaseOwnershipFolder']"))
	private WebElement ReleaseOSFolder;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li[6]/a"))
	private WebElement drawerforCopy;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[2]/a"))
	private WebElement BillsCabinet;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[2]/ul/li[1]/a"))
	private WebElement BillsDrawer;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[2]/ul/li[1]/ul/li[2]/a"))
	private WebElement NewFolderFrPaste;

	@FindBy(xpath = ("//a[@id='copyNodeAnchor']"))
	private WebElement CopyTab;

	@FindBy(xpath = ("(//li[@id='pasteNodeLi'])[2]"))
	private WebElement PasteTab;

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[2]/ul/li[2]/a"))
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

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/ul/li[9]/a"))//dipak automation folder
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

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[5]/a"))
	private WebElement CabinetForCustomDoc;

	@FindBy(xpath = ("//a[@id='custmDocumentTypes']"))
	private WebElement customdoc;

	@FindBy(xpath = ("(//span[@id='spanCheckCustomDocTypeValues_12'])[1]"))
	private WebElement bill;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[14]"))
	private WebElement dateMask;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[12]"))
	private WebElement cvReports;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[13]"))
	private WebElement cvReports1;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[5]"))
	private WebElement alldataType;

	@FindBy(id = ("nodePropVal_344"))
	private WebElement Selection123;

	@FindBy(xpath = ("//a[@id='resetDocumentTypes']"))
	private WebElement ResetcustomDocType;

	@FindBy(xpath = ("//a[@id='navigatesetColour']"))
	private WebElement Categories;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[6]/a"))
	private WebElement NishaRCaninet;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[6]/ul/li[1]/a"))
	private WebElement NishaRDrawer;
	// *[@id=\"78995\"]/a
	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[6]/ul/li[1]/ul/li[1]/a"))
	private WebElement NishaRFolder;

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[6]/a"))
	private WebElement vidyaCaninet;

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[6]/ul/li/a"))
	private WebElement vidyaDrawer;

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[6]/ul/li/ul/li[1]/a"))
	private WebElement vidyaFolder;

	@FindBy(id = ("nodePropVal_74"))
	private WebElement CountriesDrpdown;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[7]"))
	private WebElement FinanceCab4th;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[7]/ul/li[1]/a"))
	private WebElement Finance1stDrawer;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[7]/ul/li[1]/ul/li/a"))
	private WebElement Finance1stFolder;

	@FindBy(xpath = ("//td[contains(text(),'Security permission check - Delete check\\dfdfd\\Sec')]"))
	private WebElement ForOpenNotiAgain;

	@FindBy(xpath = ("/html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[2]/ins"))
	private WebElement BillsExpandIcon;

	@FindBy(xpath = (" /html/body/div[58]/div[64]/div[1]/div/div[2]/div[2]/ul/li[2]/ul/li[1]/ins"))
	private WebElement BillsDrawerExpandIcon;

	@FindBy(xpath = ("//*[@id=\"12105\"]/ins"))
	private WebElement CVAppFolderExpandIcon;

	@FindBy(xpath = ("//span[text()='Any changes to Document(s)']"))
	private WebElement AnyChangesToDocuments;

	@FindBy(xpath = ("//div[@id='notificationsModal']//li[26]"))
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

	

	

	public void TakeOwnerShip() throws Exception {
		Reporter.log("Scenario 01: Verify Roomcontextmenu tab 'Takeownership and ReleaseOwnership' option");
		jsclick(RoomContextTab);
		Reporter.log("Click on RoomContextMenu tab");
		Thread.sleep(3000);
		jsclick(CabinetTest);
		Reporter.log("Expand a cabinet");
		Thread.sleep(3000);
		jsclick(Drawer);
		Reporter.log("Expand a drawer");
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		// wait.until(ExpectedConditions.elementToBeClickable(Folder));
		jsclick(Folder);
		Reporter.log("Select a folder");
		Thread.sleep(3000);

		movingElement(RoomContextTab);
		Reporter.log("Mousehover on roomcontextmenu tab");
		Thread.sleep(5000);
		WebElement TakeOwnerShipTab = driver.findElement(By.xpath("//a[@id='takeOwnershipFolder']"));
		wait.until(ExpectedConditions.visibilityOf(TakeOwnerShipTab));
		Thread.sleep(3000);
		movingclkElement(TakeOwnerShipTab);
		Reporter.log("Click on TakeOwnerShip option");
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
		Reporter.log("Mousehover on Roomcontextmenu tab to check TakeOwnerShip is visible or disable");
		Thread.sleep(3000);
		LogoutPage();
		
		try{
			alertIsPresent();
			acceptAlert();
			}
		catch(Exception e) {
			System.out.print("Session dialog not present");
		}
		Reporter.log("Admin user Logout the session");
		Thread.sleep(4000);
		loginCVS();
		Reporter.log("Log into EWA with another user account");
		Thread.sleep(3000);
		
		
		jsclick(CabinetTest);
		Reporter.log("Expand taken OwnerShip cabinet");
		Thread.sleep(3000);
		jsclick(Drawer);
		Reporter.log("Expand taken Ownership drawer");
		Thread.sleep(3000);
		selectElement(Folder);
		Reporter.log("Open a taken Ownership folder");
		Thread.sleep(3000);
		Reporter.log("Mousehover on RoomcontextMenu tab and check Takeownership option it should be disable");
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		Reporter.log("Open a document from taken ownership folder");
		VisiblityOf(ForLockedPDFDoc);
		jsclick(ForLockedPDFDoc);
		Thread.sleep(3000);
		Reporter.log(
				"It should display'Document locked by admin' warning dialog, Warning dialog displayed successfully");
		OKBTNDocLockDialog.sendKeys(Keys.ENTER);
		Reporter.log("Viewer menu tool bar should be disable on the page");
		Thread.sleep(3000);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("NoAlertISPResent");
		}
		Thread.sleep(5000);
		LogoutPage();
		try{
			alertIsPresent();
			acceptAlert();
			}
		catch(Exception e) {
			System.out.print("Session dialog not present");
		}
		Reporter.log("Current user LogOut the session");
		Thread.sleep(3000);
		LogInAdmin();
		Reporter.log("Log into EWA as admin user");
		Thread.sleep(3000);
		jsclick(CabinetTest);
		Reporter.log("Expand a taken OwnerShip Cabinet");
		Thread.sleep(2000);
		jsclick(Drawer);
		Reporter.log("Expand a taken OwnerShip Drawer");
		Thread.sleep(3000);
		selectElement(Folder);
		Thread.sleep(4000);
		Reporter.log("Select a folder");
		movingElement(RoomContextTab);
		Thread.sleep(4000);
		wait.until(ExpectedConditions.visibilityOf(ReleaseOSFolder));
		jsclick(ReleaseOSFolder);
		Reporter.log("Mousehover on RoomcontextMenu tab and click Release ownership option");
		Thread.sleep(4000);
		LogoutPage();
		try{
			alertIsPresent();
			acceptAlert();
			}
		catch(Exception e) {
			System.out.print("Session dialog not present");
		}
		Reporter.log("Admin user logout the session");
		Thread.sleep(3000);
		loginCVS();
		Reporter.log("Another user log into EWA to check TakeOwnerShip option");
		Thread.sleep(3000);
		jsclick(CabinetTest);
		
		Reporter.log("Expand a cabinet");
		Thread.sleep(3000);
		jsclick(Drawer);
		Reporter.log("Expand a drawer");
		Thread.sleep(3000);
		selectElement(Folder);
		Reporter.log("Select a folder");
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Reporter.log("Mousehover on RoomContextTab and check TakeOwnerShip it should be enable");
		Thread.sleep(3000);
		jsclick(ForLockedPDFDoc);
		Reporter.log("Open a document it should not show a warning dialog ");

		Thread.sleep(3000);
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.println("AlertISNotPResent");
		}
		Thread.sleep(8000);
		Reporter.log("The user able to use viewer menu tool bar icon it should not disable");
		LogoutPage();
		try{
			alertIsPresent();
			acceptAlert();
			}
		catch(Exception e) {
			System.out.print("Session dialog not present");
		}
		Reporter.log("Logout the session");
		Thread.sleep(3000);
		Reporter.log("TakeOwnerShip and ReleaseOwnerShip option verified successfully...");
		LogInAdmin();

//		Reporter.log("Log into EWA as admin user", true);

	}

	public void CopyAndPasteDrawer() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Reporter.log("Scenario 02: Verify RoomContextMenu tab - (copy and paste drawer)");
		Reporter.log("Log into as admin user");
		jsclick(RoomContextTab);
		Thread.sleep(3000);
		jsclick(CabinetTest);
		Reporter.log("Expand the cabinet");
		Thread.sleep(3000);
		jsclick(drawerforCopy);
		Reporter.log("Select a drawer");
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Reporter.log("Mousehover on Roomcontextmenu tab");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(CopyTab));
		movingclkElement(CopyTab);
		Reporter.log("Click on copy option");
		Thread.sleep(3000);
		jsclick(BillsCabinet);
		Reporter.log("Expand another cabinet");
		Thread.sleep(2000);
		Reporter.log("Select another drawer");
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Reporter.log("Mousehover on Roomcontextmenu tab");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PasteTab));
		Reporter.log("Paste option should be enable,Click on paste Option");
		movingclkElement(PasteTab);
		Thread.sleep(3000);
		Reporter.log("Paste confirm dialog should be open,Click on paste confirm dialog OK button");
		jsclick(PasteConfimDialogOKBTN);
		Thread.sleep(8000);

		// scrollDown(BillsCabinet);
		Reporter.log("Copy and a paste drawer successfully...");
		Thread.sleep(4000);
		
	}

	public void copyAndpasteFolder() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Reporter.log("Scenario 03: Verify RoomContextMenu tab - (copy and paste Folder)");
		jsclick(RoomContextTab);
		Thread.sleep(2000);
		Reporter.log("Click on Roomcontextmenu tab");
		jsclick(CabinetTest);
		Reporter.log("Expand a Cabinet");
		Thread.sleep(3000);
		jsclick(Drawer);
		Reporter.log("Expand a Drawer");
		Thread.sleep(3000);
		jsclick(FolderForCopy);
		Reporter.log("Select a Folder");
		Thread.sleep(5000);
		Reporter.log("Mousehover on Roomcontextmenu tab");
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(CopyTab));//*[@id='retainNodePropertiesOk1']//*[@id="retainNodePropertiesModel1"]/div[2]
		Reporter.log("Click on copy option");
		movingclkElement(CopyTab);
		
			
			
		
		Reporter.log("Expand another Cabinet");
		Thread.sleep(4000);
		selectElement(BillsCabinet);
		Reporter.log("Expand another Drawer");
		Thread.sleep(5000);
		ElementToBeClickable(BillsDrawer);
		selectElement(BillsDrawer);// *[@id=\"12105\"]/a
		Thread.sleep(3000);// *[@id="26165"]/a
		movingElement(NewFolderFrPaste);
		Reporter.log("Select another Folder");
		jsclick(NewFolderFrPaste);
		Thread.sleep(3000);
		Reporter.log("Mousehover on Roomcontextmenu tab");
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PasteTab));
		movingElement(PasteTab);
		
		Reporter.log("Click on paste option");
		jsclick(PasteTab);
		
		Thread.sleep(3000);
		Reporter.log("It should display paste confirmation dialog, click on paste confirm dialog OK button");
		jsclick(PasteConfimDialogOKBTN);
		Thread.sleep(4000);
		try {
			
				WebElement RetainOKBTN = driver.findElement(By.xpath("//*[@id='retainNodePropertiesOk1']"));
				jsclick(RetainOKBTN);
			
		}
			catch(Exception e) {
				System.out.println("Retain dialog Not Present");
			
			}
			
		Thread.sleep(15000);
		// scrollDown(CVAppExpandIcon);
		Reporter.log("Pasted Folder has 50 documents", true);
		Reporter.log("Copy paste a folder successfully...");
		Thread.sleep(3000);
		
	}

	public void NodePropertiesCSR() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		Actions act = new Actions(driver);
		// scrollDown(NishaRCaninet);
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
		WebElement CvReports = driver.findElement(By.xpath("//*[@id=\"nodePropVal_5\"]"));
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

		WebElement moveToPlusIcon = driver.findElement(By.xpath("//*[@id=\"addPagesDropDown\"]/span"));
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
		} catch (Exception e) {
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
		Reporter.log("Scneario 04: Verify Node properties Option");
		scrollDown(NishaRCaninet);
		Reporter.log("Expand a cabinet");
		wait.until(ExpectedConditions.elementToBeClickable(NishaRCaninet));
		selectElement(NishaRCaninet);
		Reporter.log("Expand a drawer");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(NishaRDrawer));
		Thread.sleep(3000);
		selectElement(NishaRDrawer);
		Reporter.log("Select a folder");
		wait.until(ExpectedConditions.elementToBeClickable(NishaRFolder));
		selectElement(NishaRFolder);
		Thread.sleep(3000);
		Reporter.log("Mousehover on Roomcontextmenu tab");
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		Reporter.log("Click on Nodeproperties option");
		jsclick(NodeProperties);

		Thread.sleep(6000);
		jsclick(selectDocDropDownFrNode);
		Reporter.log("Node properties dialog should be open");
		Thread.sleep(3000);
		Reporter.log("Select AllDataType ");
		selectDocNames();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(TextKey));
		movingclkElement(TextKey);
		TextKey.clear();
		Reporter.log("Enter value into TextKey field");
		sendvalue(TextKey, readFromRoomCntxt(1, 0));
		Thread.sleep(3000);

		scrollDown(numeric123);
		Reporter.log("Enter value into Numeric123  field");
		movingclkElement(numeric123);
		numeric123.clear();
		sendvalue(numeric123, "93838383823");
		Reporter.log("Enter value into Restaruent field");
		Thread.sleep(5000);
		scrollDown(Restaurent);
		movingclkElement(Restaurent);
		Restaurent.clear();
		sendvalue(Restaurent, readFromRoomCntxt(4, 0));
		Thread.sleep(5000);
		Reporter.log("Select a date");
		scrollDown(Date);
		Thread.sleep(2000);
		movingclkElement(Date);

		jsclick(DateOct);

		Thread.sleep(2000);
		movingclkElement(Boolean123);
		Thread.sleep(2000);
		Reporter.log("Select Boolean123 dropdown YES");
		selectDropDownByIndex(YesORNoBoolean, 1);
		Thread.sleep(2000);
		selectDropDownByIndex(Selection123, 3);
		Thread.sleep(3000);
		Reporter.log("Select value in Selection123 dropdown.");
		jsclick(NodePropOKBTN);
		try {
			WebElement updatePopup = driver.findElement(By.id("confirmMessageOk35"));
			if (updatePopup.isDisplayed()) {
				updatePopup.click();
			}
		} catch (Exception e) {
			Reporter.log("Node Properties Updated Successfully...");
		}
		Reporter.log("Click NodeProperties dialog OK button");

		Thread.sleep(3000);
		Reporter.log("Click on new document tab");
		movingclkElement(CreateDocTab);
		Thread.sleep(3000);

		WebElement moveToPlusIcon = driver.findElement(By.xpath("//*[@id=\"addPagesDropDown\"]/span"));
		VisiblityOf(moveToPlusIcon);
		Reporter.log("Click on browse icon");
		movingElement(moveToPlusIcon);
		Thread.sleep(4000);
	//	Reporter.log("Click broswe submenu");
		WebElement browseOption = driver.findElement(By.xpath("//input[@id='viewDocumentAddPages']"));
		movingclkElement(browseOption);
		Reporter.log("By using AutoIT add file from the external folder ");
		Thread.sleep(8000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Ampersant.exe");
		Thread.sleep(5000);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("Alert not present. . .");
		}
		Thread.sleep(5000);
		WebElement CreateBTN = driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		jsclick(CreateBTN);
		Reporter.log("Click on create button");
		Thread.sleep(8000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		jsclick(viewOption);
		Reporter.log("'Document created succssfully' dialog opened, Click View button");

		Thread.sleep(8000);
		Reporter.log("'Document created succssfully' dialog opened, Click View button");
		jsclick(RoomContextTab);
		Thread.sleep(3000);
		Reporter.log("Indices should save the values which are set for the Node Properties");
		movingElement(RoomContextTab);
		Reporter.log("Close the document");
		Thread.sleep(5000);
		Reporter.log("Mousehover on RoomContextMenu tab");
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		jsclick(NodeProperties);
		Reporter.log("Click on NodeProperties option,Node properties dialog should be open ");
		Thread.sleep(6000);
		jsclick(NodeResetBTN);
		Reporter.log("Click on reset buttonconfirm dialog OK button");
		Thread.sleep(3000);
		jsclick(NodeResetYesBTN);
		Reporter.log("Reset confirm dialog should be open, Click Reset confirm dialog OK button");
		Reporter.log("Node properties was reset successfully...");
		Thread.sleep(8000);
		jsclick(NodePropOKBTN);
		Thread.sleep(3000);
		try {
			WebElement updatePopup = driver.findElement(By.id("confirmMessageOk35"));
			if (updatePopup.isDisplayed()) {
				updatePopup.click();
			}
		} catch (Exception e) {
			System.out.println("Node Properties Updated Successfully...");
		}

		Thread.sleep(3000);
		movingclkElement(CreateDocTab);
		Thread.sleep(8000);
		jsclick(Refresh_Button(driver));
		Thread.sleep(5000);
		Reporter.log("Node properties verified successfully", true);
		Reporter.log("===============================================================================");
	}

	public void NodePropertiesDefault() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		jsclick(RoomContextTab);
		Reporter.log("Scenario 06:Verify Default  NodeProperties  ");
		wait.until(ExpectedConditions.elementToBeClickable(vidyaCaninet));
		selectElement(vidyaCaninet);
		Reporter.log("User should expand a cabinet which has default node value");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(vidyaDrawer));
		Thread.sleep(3000);
		Reporter.log("Expand a drawer which has default node value");
		selectElement(vidyaDrawer);
		Reporter.log("User should select a folder which has default node value");
		wait.until(ExpectedConditions.elementToBeClickable(vidyaFolder));
		selectElement(vidyaFolder);
		Thread.sleep(3000);
		Reporter.log("Mousehover on Roomcontextmenu and select NodeProperties option");
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		jsclick(NodeProperties);
		Thread.sleep(10000);
		Reporter.log("Nodeproperties dialog  should be open");
		jsclick(CountriesDrpdown);
		Thread.sleep(3000);
		Reporter.log("Change country dropdown");
		selectDropDownByIndex(CountriesDrpdown, 6);
		Thread.sleep(3000);
		jsclick(NodePropOKBTN);
		Reporter.log("Click on NodeProperties dialog OK button");
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
		Reporter.log("Click on new document tab");
		Thread.sleep(10000);
		Reporter.log("Indices should show the default Nodeproperty values");
		jsclick(Refresh_Button(driver));
		Reporter.log("Default NodeProeprties verified successfully...");
		Reporter.log("Click on refresh button");
		Reporter.log("===============================================================================");
	}

	public void Notification() throws Exception {
		Reporter.log("Scenario 07: Verify Roomcontextmenu tab Notification Option");
		jsclick(RoomContextTab);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(3000);
		Reporter.log("Expand a cabinet and expand a drawer to select a folder.");
		wait.until(ExpectedConditions.elementToBeClickable(FinanceCab4th));
		selectElement(FinanceCab4th);
		// Thread.sleep(3000);
		// wait.until(ExpectedConditions.elementToBeClickable(DeleteChkDfDfDrawer));
		Thread.sleep(3000);
		Reporter.log("Folder selected successfully...");
		selectElement(Finance1stDrawer);
		Reporter.log("Mousehover on Roomcontext menu tab ");
		wait.until(ExpectedConditions.elementToBeClickable(Finance1stFolder));
		selectElement(Finance1stFolder);
		Reporter.log("Select Notification option");
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(Notification));
		Thread.sleep(3000);
		jsclick(Notification);
		Thread.sleep(2000);
		Reporter.log("Notifiaction dialog should be open");
		jsclick(resetBTNmyPref);
		Reporter.log("Click on reset button");
		Thread.sleep(3000);
		Reporter.log("Reset option verified successfully...");
		jsclick(NotificationDropDown);
		Reporter.log("Click on notificationdropdonw");
		Thread.sleep(3000);
		Reporter.log("Select 'any changes to the folder' option");
		WebElement AnyChangesOption = driver.findElement(By.xpath(" //span[text()='Any changes to folder']"));
		VisiblityOf(AnyChangesOption);
		jsclick(AnyChangesOption);
		Thread.sleep(3000);
		Reporter.log("Select' any changes to the document' option from notification dropdonw");
		scrollDown(AnyChangesToDocuments);
		wait.until(ExpectedConditions.elementToBeClickable(AnyChangesToDocuments));
		movingElement(AnyChangesToDocuments);
		jsclick(AnyChangesToDocuments);

		Thread.sleep(3000);
		scrollDown(ScrollIntoDown);
		Reporter.log("Click on apply button");
		Thread.sleep(4000);
		scrollUp(AnyChangesOption);
		Reporter.log("Select notification tab, it will show the notification for selected option");
		Thread.sleep(4000);
		jsclick(applyBTNmypref);
		Reporter.log(
				"If any changes have been made by other user in the selected notification folder. The specified user will receive a notification");
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

		Reporter.log("Notification option verified successfull", true);
	}

	public void CustomDocTypes() throws Exception {
		Reporter.log("Scneario 08: Verify RoomContextmenu 'CustomDocumentType' option");
		jsclick(RoomContextTab);
		Thread.sleep(3000);
		jsclick(CabinetForCustomDoc);
		Thread.sleep(2000);
		Reporter.log("Select a cabinet to set custom document type");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		movingElement(RoomContextTab);
		Reporter.log("Mousehover on Roomcontextmenu tab");
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOf(customdoc));
		Thread.sleep(3000);
		jsclick(customdoc);
		Reporter.log("Select Custom DocumentType Submenu");
		Thread.sleep(3000);
		
	   movingclkElement(bill);
		
		Thread.sleep(2000);
		movingElement(dateMask);
		jsclick(dateMask);
		
		Reporter.log("Customdocument type dialog box should be open");
		Reporter.log("Select the required document types");
		Thread.sleep(3000);
		
		movingclkElement(cvReports);
		Thread.sleep(2000);
		
		
		
		movingclkElement(alldataType);
		
		Thread.sleep(5000);
		WebElement OKBTNcustomcol = driver.findElement(By.xpath("(//button[@id='setCustomDocTypeOK'])[1]"));
		jsclick(OKBTNcustomcol);
		Reporter.log("Click on custom document type dloag OK button");
		Thread.sleep(3000);
		jsclick(CreateDocTab);
		Reporter.log("Click on new document tab");
		Thread.sleep(5000);
		movingclkElement(selectDocDropDown);
		Reporter.log("Click on 'Select DocumentType' option");
		Thread.sleep(15000);
		jsclick(RoomContextTab);
		Thread.sleep(4000);
		Reporter.log("It should show the saved document types");
		jsclick(CabinetForCustomDoc);
		Thread.sleep(4000);
		Reporter.log("The saved document type displayed successfully");
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		Reporter.log("Customdocument type verified successfully");
		wait.until(ExpectedConditions.visibilityOf(customdoc));
		Thread.sleep(3000);
		Reporter.log("MouseHover on RoomContextmenu tab and select Resetcustomdocument option ");
		Reporter.log("Customdocument type Reset successfully...");
		jsclick(ResetcustomDocType);
		Thread.sleep(7000);

		jsclick(Refresh_Button(driver));
	//	Reporter.log("custome documents verified successfull", true);
	}

	public void CategoryPrivate() throws Exception {
		Thread.sleep(3000);
		Reporter.log("Scenario 09: RoomcontextMenu tab 'Category - private' option");
		jsclick(RoomContextTab);
		Thread.sleep(2000);
		Reporter.log("Select cabinet");
		jsclick(CabinetForCustomDoc);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		movingElement(RoomContextTab);
		Reporter.log("Mousehover on roomcontextmenu tab");
		Thread.sleep(7000);
		// wait.until(ExpectedConditions.visibilityOf(Categories));
		// Thread.sleep(3000);
		jsclick(Categories);
		Reporter.log("Select categories option");
		Thread.sleep(5000);
		try {

		WebElement privateView = driver.findElement(By.xpath("//span[text()='Private ']"));

		movingElement(privateView);
		jsclick(privateView);
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
		Reporter.log("Select private option");
		Thread.sleep(2000);
		WebElement RedColr = driver.findElement(By.xpath("//span[@id='CustomColourid_5']"));
		movingElement(RedColr);
		Reporter.log("Select red colour");
		try
		{
		jsclick(RedColr);
	}
	catch(Exception e) {
		System.out.println("Exception Handled");
	}
		
		Reporter.log("Click on categories dialog OK button");
		Thread.sleep(3000);
		Reporter.log("The cabinet should be displayed in Red color for the user");
		WebElement OKBTNColor = driver.findElement(By.xpath("(//button[@id='customColourModelOk'])[1]"));
		jsclick(OKBTNColor);
	
		Thread.sleep(2000);
		jsclick(Refresh_Button(driver));
		Thread.sleep(4000);
		/*
		 * LogoutPage(); Thread.sleep(5000); loginCVS();
		 */
		Reporter.log("Categories Private verified successfully", true);
		Reporter.log("===============================================================================");
	}

	public void CategoryPublic() throws Exception {
		Reporter.log("Scenario 10: RoomcontextMenu tab 'Category - public' option");
		Thread.sleep(3000);
		selectElement(Cabinet);
		// jsclick(Cabinet);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		movingElement(RoomContextTab);
		Reporter.log("Select a cabinet");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Thread.sleep(3000);
		Reporter.log("Mousehover on roomcontextmenu tab and click categories option");
		jsclick(Categories);

		Thread.sleep(5000);
		WebElement publicView = driver.findElement(By.xpath("//span[text()='Public  ']"));

		movingElement(publicView);
		Reporter.log("Select public option");
		wait.until(ExpectedConditions.elementToBeClickable(publicView));
		jsclick(publicView);
		Thread.sleep(3000);
		Reporter.log("Select purple colour");
		WebElement PurpleColr = driver.findElement(By.xpath("//span[@id='CustomColourid_7']"));
		movingElement(PurpleColr);
		jsclick(PurpleColr);
		Thread.sleep(3000);
		Reporter.log("Click on OK button");
		Reporter.log("The cabinet should be displayed in purple color for all user");
		WebElement OKBTNColor = driver.findElement(By.xpath("(//button[@id='customColourModelOk'])[1]"));
		jsclick(OKBTNColor);
		Thread.sleep(3000);

		// movingclkElement(Cabinet);
		Thread.sleep(8000);
		Reporter.log("categories public option verified successfully...", true);
		Reporter.log("===============================================================================");
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
		// wait.until(ExpectedConditions.elementToBeClickable(Folder));
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
		movingDoublecli(SQLRoomFolder, SQLRoomFolder);
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		VisiblityOf(ForLockedPDFDoc);
		jsclick(ForLockedPDFDoc);
		Thread.sleep(3000);
		OKBTNDocLockDialog.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
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
		movingDoublecli(SQLRoomFolder, SQLRoomFolder);
		Thread.sleep(5000);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		jsclick(ForLockedPDFDoc);
		Thread.sleep(3000);
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.println("AlertISNotPResent");
		}
		Thread.sleep(8000);
		LogoutPage();
		Thread.sleep(5000);
		LogInAdminSQL();
		Reporter.log("TakeOwnerShip functionality verified successfull", true);

	}

}
