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
import org.openqa.selenium.JavascriptException;
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

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class RoomContextMenu extends BaseClass {

	public RoomContextMenu() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = ("//*[@id='navigationMenuBtn']"))
	private WebElement RoomContextTab;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[2]/a"))
	private WebElement Cabinet;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/a"))
	private WebElement CabinetSecurity;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ins"))
	private WebElement CabinetTest;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/ins"))
	private WebElement Drawer;

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/ul/li[2]/a")) // 5 dipak automation folder
	private WebElement Folder;

	@FindBy(xpath = ("//*[@id=\"1002\"]/a"))
	private WebElement FolderVidya;

	@FindBy(xpath = ("//*[@id=\"settings\"]"))
	private WebElement SettingsIcon;

	@FindBy(xpath = ("//*[@id='idSidenavSettings']/ul/li[4]"))
	private WebElement AdminPreference;

	@FindBy(xpath = ("//*[@id='sortNavigationTreeId']"))
	private WebElement NavigationSort;

	public void NavigateName() {
		org.openqa.selenium.support.ui.Select sel = new org.openqa.selenium.support.ui.Select(NavigationSort);
		sel.selectByVisibleText("Name");
	}

	public void NavigateID() {
		org.openqa.selenium.support.ui.Select sel = new org.openqa.selenium.support.ui.Select(NavigationSort);
		sel.selectByVisibleText("Id");
	}

	public void ChangeNavigation() throws Exception {
		Reporter.log("Changing Navigation Sort", true);
		Thread.sleep(3000);
		jsclick(SettingsIcon);
		Reporter.log("Click on setting icon", true);
		Thread.sleep(2000);
		jsclick(AdminPreference);
		Reporter.log("Select Admin Preference", true);
		Thread.sleep(2000);
		NavigateName();
		Reporter.log("Change the navigation Sort as Name", true);
		Thread.sleep(3000);
		jsclick(ApplyBTN);
		Reporter.log("Click on Apply button", true);
		Thread.sleep(3000);
		jsclick(Refresh_Button(driver));
		Reporter.log("Click on Refresh icon", true);
		Thread.sleep(4000);
	}

	public void ChangeNavigationID() throws Exception {
		Reporter.log("Changing Navigation Sort", true);
		Thread.sleep(3000);
		jsclick(SettingsIcon);
		Reporter.log("Click on setting icon", true);
		Thread.sleep(2000);
		jsclick(AdminPreference);
		Reporter.log("Select Admin Preference", true);
		Thread.sleep(2000);
		NavigateID();
		Reporter.log("Change the navigation Sort as Name", true);
		Thread.sleep(3000);
		jsclick(ApplyBTN);
		Reporter.log("Click on Apply button", true);
		Thread.sleep(3000);
		jsclick(Refresh_Button(driver));
		Reporter.log("Click on Refresh icon", true);
		Thread.sleep(4000);
	}

	@FindBy(xpath = "//*[@id=\"security\"]")
	private WebElement Security_option;

	@FindBy(xpath = "//*[@id='menu-content']/li[2]")
	private WebElement CVAdmin;

	@FindBy(xpath = "//*[@id=\"securityAdd\"]")
	private WebElement Add_Button;

	@FindBy(xpath = "//*[@id=\"selectedUsersAndGroups\"]")
	private WebElement Ok_button_UserDialog;

	@FindBy(xpath = "//*[@id='existingEntryAlert']/p")
	private WebElement Groupaddvalidation;

	public void getaddvalidationmessage() {
		Reporter.log(Groupaddvalidation.getText() + " this validation message should show", true);

	}

	@FindBy(xpath = "//*[@id=\"closeGroupUserModal\"]")
	private WebElement Closebutton;

	@FindBy(xpath = "//*[@id=\"navigationMenuBtn\"]")
	private WebElement MoveTo_Menu_RoomName;

	public void getMoveTo_Menu_RoomName() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_RoomName).perform();
	}

	@FindBy(xpath = ("//*[@id='securityDropdown']"))
	private WebElement SelectPermisson;

	public void GrantPermission() throws Exception {
		org.openqa.selenium.support.ui.Select sel = new org.openqa.selenium.support.ui.Select(SelectPermisson);
		sel.selectByVisibleText("Grant Supervisor");
	}

	@FindBy(id = "applySecurity")
	private WebElement Apply_button_SecurityDialog;

	@FindBy(id = "securityUpdate")
	private WebElement Ok_button_SecurityDialog;

	public void GrantSuperivorPermission() throws Exception {

		Reporter.log("Verifying Cabinet Permission", true);
		Thread.sleep(5000);

		selectElement(Cabinet);
		Thread.sleep(3000);
		Reporter.log("Expand a Cabinet", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(5000);
		Reporter.log("Click on  Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(5000);
		Reporter.log("Click on  Security dialog Add button", true);
		jsclick(CVAdmin);
		Thread.sleep(5000);
		Reporter.log("Select CVAdmin Group", true);

		jsclick(Ok_button_UserDialog);
		Thread.sleep(5000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			getaddvalidationmessage();
			Thread.sleep(5000);
			Reporter.log("Verifying Validation message", true);
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		Thread.sleep(3000);
		GrantPermission();
		Thread.sleep(5000);
		Reporter.log("Assign to permission to ", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(5000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Reporter.log("Click on  Security dialog Ok button", true);
		Reporter.log("All permission should be given for Cabinet", true);

	}

	public void GrantSuperivorPermissionForADMINAC() throws Exception {

		Reporter.log("Verifying Cabinet Permission", true);
		Thread.sleep(5000);

		Reporter.log("Expand a Cabinet", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(5000);
		Reporter.log("Click on  Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(5000);
		Reporter.log("Click on  Security dialog Add button", true);
		jsclick(CVAdmin);
		Thread.sleep(5000);
		Reporter.log("Select CVAdmin Group", true);

		jsclick(Ok_button_UserDialog);
		Thread.sleep(5000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			getaddvalidationmessage();
			Thread.sleep(5000);
			Reporter.log("Verifying Validation message", true);
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		Thread.sleep(3000);
		GrantPermission();
		Thread.sleep(5000);
		Reporter.log("Assign to permission to ", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(5000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Reporter.log("Click on  Security dialog Ok button", true);
		Reporter.log("All permission should be given for Cabinet", true);

	}

	@FindBy(xpath = ("//*[@id='adminPreferencesSubmit']"))
	private WebElement ApplyBTN;

	@FindBy(xpath = ("//a[@id='takeOwnershipFolder']"))
	private WebElement TakeOwner;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[2]/td[3]"))
	private WebElement ForLockedPDFDoc;

	@FindBy(xpath = ("(//button[@class='modalDialogButtons'])[17]"))
	private WebElement OKBTNDocLockDialog;

	@FindBy(xpath = ("//a[@id='releaseOwnershipFolder']"))
	private WebElement ReleaseOSFolder;

	@FindBy(xpath = ("//*[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/a")) // first drawer
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

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[1]/ul/li[1]/ul/li[4]/a")) // dipak automation folder
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

	@FindBy(xpath = ("//div[@id='viewDocumentnavigator']/ul/li[7]/a"))
	private WebElement CabinetForCustomDoc;

	@FindBy(xpath = ("//a[@id='custmDocumentTypes']"))
	private WebElement customdoc;

	@FindBy(xpath = ("(//span[@id='spanCheckCustomDocTypeValues_12'])[1]"))
	private WebElement bill;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[14]/span[2]"))
	private WebElement dateMask;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[13]/span[2]"))
	private WebElement cvReports;// cvReports

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[13]/span[2]"))
	private WebElement cvReports1;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[67]/span[2]"))
	private WebElement WithDrawn;

	@FindBy(xpath = ("//div[@id='showcustomDocTypeModel']/ul/li[5]/span[2]"))
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
		n.selectByVisibleText("All data type");
	}

	public void selectDocNamesCSR() throws Exception {
		WebElement allList = driver.findElement(By.id("nodePropertiesDocTypeList"));
		org.openqa.selenium.support.ui.Select n = new org.openqa.selenium.support.ui.Select(allList);
		n.selectByVisibleText("CVReports");
	}

	public static void expandNodesCustomCol() throws Exception {
		Actions actions = new Actions(driver);

		// Loop through each cabinet and double-click to expand
		int cabinetCount = driver.findElements(By.xpath("//div[@id='viewDocumentnavigator']/ul/li")).size();
		for (int i = 1; i <= cabinetCount; i++) {

			WebElement cabinet = driver.findElement(By.xpath("//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/a"));
			Thread.sleep(3000);
			actions.doubleClick(cabinet).perform();
			Reporter.log("Expand a cabinet " + i, true);

			// Check if the current cabinet is the one we want to fully expand
			if (i == 2) {
				// Find the list of drawer elements within the current cabinet
				int drawerCount = driver
						.findElements(By.xpath("//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/ul/li")).size();

				// Loop through each drawer and double-click to expand
				for (int j = 1; j <= drawerCount; j++) {
					WebElement drawer = driver.findElement(
							By.xpath("//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/ul/li[" + j + "]/a"));
					Thread.sleep(3000);
					actions.doubleClick(drawer).perform();
					Reporter.log("Expand a drawer " + j, true);

					// Check if the current drawer is the one we want to fully expand
					if (j == 1) {
						// Find the list of folder elements within the current drawer
						int folderCount = driver
								.findElements(By.xpath(
										"//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/ul/li[" + j + "]/ul/li"))
								.size();

						// Double-click on the first folder only
						if (folderCount > 0) {
							WebElement folder = driver.findElement(By.xpath(
									"//div[@id='viewDocumentnavigator']/ul/li[" + i + "]/ul/li[" + j + "]/ul/li[1]/a"));
							Thread.sleep(3000);
							actions.doubleClick(folder).perform();
							Reporter.log("Expand a folder " + folder, true);

							// Perform any additional actions on the expanded folder here

							// Break after expanding the first folder
							break;
						}
					}
				}
				// Break after expanding the specific cabinet and drawer
				break;
			}
		}
	}

	public void TakeOwnerShip() throws Exception {
		Reporter.log("Scenario 01: Verify Roomcontextmenu tab 'Takeownership and ReleaseOwnership' option");
		jsclick(RoomContextTab);
		Reporter.log("Click on RoomContextMenu tab", true);
		Thread.sleep(3000);
		// jsclick(CabinetTest);
		Reporter.log("Expand a cabinet", true);
		Thread.sleep(3000);
		// jsclick(Drawer);
		Reporter.log("Expand a drawer", true);
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		// wait.until(ExpectedConditions.elementToBeClickable(Folder));
		// jsclick(Folder);
		expandNodesCustomCol();
		Reporter.log("Select a folder", true);
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(RoomContextTab).perform();

		Reporter.log("Mousehover on RoomContextMenu tab", true);
		Thread.sleep(5000);
		WebElement TakeOwnerShipTab = driver.findElement(By.xpath("//a[@id='takeOwnershipFolder']"));
		wait.until(ExpectedConditions.visibilityOf(TakeOwnerShipTab));
		Thread.sleep(3000);

		act.moveToElement(TakeOwnerShipTab).click().build().perform();
		Reporter.log("Click on TakeOwnerShip option", true);
		Thread.sleep(6000);
		try {
			WebElement BTN = driver.findElement(By.xpath("(//button[@id='takeOwnerShipAnyway25'])[1]"));
			if (BTN.isDisplayed()) {
				jsclick(BTN);
			}
		} catch (Exception e) {
			Reporter.log("The document OwnerShip Taken Successfully", true);
		}

		Thread.sleep(8000);
		movingElement(RoomContextTab);
		Reporter.log("Mousehover on Roomcontextmenu tab to check TakeOwnerShip is visible or disable", true);
		Thread.sleep(3000);
		LogoutPage();

		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.print("Session dialog not present");
		}
		Reporter.log("Admin user Logout the session", true);
		Thread.sleep(4000);

		loginCVS();
		Reporter.log("Log into EWA with another user account", true);
		Thread.sleep(3000);

		// jsclick(CabinetTest);
		Reporter.log("Expand taken OwnerShip cabinet", true);
		Thread.sleep(3000);
		// jsclick(Drawer);
		Reporter.log("Expand taken Ownership drawer", true);
		Thread.sleep(3000);
		// selectElement(Folder);
		Reporter.log("Open a taken Ownership folder", true);
		Thread.sleep(5000);
		expandNodesCustomCol();
		Thread.sleep(3000);
		Reporter.log("Mousehover on RoomcontextMenu tab and check Takeownership option it should be disable", true);
		act.moveToElement(RoomContextTab).perform();
		Thread.sleep(4000);
		Reporter.log("Open a document from taken ownership folder", true);
		try {
			VisiblityOf(ForLockedPDFDoc);
			jsclick(ForLockedPDFDoc);
			Thread.sleep(4000);
			Reporter.log(
					"It should display 'Document locked by admin' warning dialog, Warning dialog displayed successfully",
					true);
			jsclick(OKBTNDocLockDialog);
			Reporter.log("Viewer menu tool bar should be disable on the page", true);
			Thread.sleep(3000);
		} catch (Exception e) {
			Reporter.log("Document is not there", true);
		}
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("NoAlertISPResent", true);
		}
		Thread.sleep(5000);
		LogoutPage();

		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.print("Session dialog not present");
		}
		Reporter.log("Current user LogOut the session Successfully...", true);
	}

	public void ReleaseOwnerShip() throws Exception {
		Thread.sleep(5000);
		LogInAdmin();
		Reporter.log("Log into EWA as admin user", true);
		Thread.sleep(3000);
		/*
		 * jsclick(CabinetTest); Reporter.log("Expand a taken OwnerShip Cabinet", true);
		 * Thread.sleep(2000); jsclick(Drawer);
		 * Reporter.log("Expand a taken OwnerShip Drawer", true); Thread.sleep(3000);
		 * selectElement(Folder);
		 */
		expandNodesCustomCol();
		Thread.sleep(4000);
		Reporter.log("Select a folder", true);
		Actions act = new Actions(driver);
		act.moveToElement(RoomContextTab).perform();

		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(ReleaseOSFolder));
		jsclick(ReleaseOSFolder);
		Reporter.log("Mousehover on RoomcontextMenu tab and click Release ownership option", true);
		Thread.sleep(4000);
		LogoutPage();
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.print("Session dialog not present");
		}
		Reporter.log("Admin user logout the session", true);
		Thread.sleep(3000);
		loginCVS();
		Reporter.log("Another user log into EWA to check TakeOwnerShip option", true);
		Thread.sleep(3000);
		/*
		 * jsclick(CabinetTest);
		 * 
		 * Reporter.log("Expand a cabinet", true); Thread.sleep(3000); jsclick(Drawer);
		 * Reporter.log("Expand a drawer", true); Thread.sleep(3000);
		 * selectElement(Folder);
		 */
		expandNodesCustomCol();
		Reporter.log("Select a folder", true);
		Thread.sleep(3000);
		act.moveToElement(RoomContextTab).perform();
		Reporter.log("Mousehover on RoomContextTab and check TakeOwnerShip it should be enable", true);
		Thread.sleep(3000);
		try {
			jsclick(ForLockedPDFDoc);
			Reporter.log("Open a document it should not show a warning dialog ", true);

			Thread.sleep(3000);
		} catch (Exception e) {
			//
		}
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.println("AlertISNotPResent");
		}
		Thread.sleep(8000);
		Reporter.log("The user able to use viewer menu tool bar icon it should not disable", true);
		LogoutPage();
		try {
			alertIsPresent();
			acceptAlert();
		} catch (Exception e) {
			System.out.print("Session dialog not present");
		}
		Reporter.log("Logout the session", true);
		Thread.sleep(3000);
		Reporter.log("TakeOwnerShip and ReleaseOwnerShip option verified successfully...", true);
		LogInAdmin();

		// Reporter.log("Log into EWA as admin user", true);

	}

	public void CopyAndPasteDrawer() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Reporter.log("Scenario 02: Verify RoomContextMenu tab - (copy and paste drawer)", true);
		Reporter.log("Log into as admin user", true);
		jsclick(RoomContextTab);
		Thread.sleep(3000);
		jsclick(CabinetTest);
		Reporter.log("Expand the cabinet", true);
		Thread.sleep(3000);
		jsclick(drawerforCopy);
		Reporter.log("Select a drawer", true);
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Reporter.log("Mousehover on Roomcontextmenu tab", true);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(CopyTab));
		movingclkElement(CopyTab);
		Reporter.log("Click on copy option", true);
		Thread.sleep(3000);
		jsclick(BillsCabinet);
		Reporter.log("Expand another cabinet", true);
		Thread.sleep(2000);
		Reporter.log("Select another drawer", true);
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Reporter.log("Mousehover on Roomcontextmenu tab", true);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PasteTab));
		Reporter.log("Paste option should be enable,Click on paste Option", true);
		movingclkElement(PasteTab);
		Thread.sleep(3000);
		Reporter.log("Paste confirm dialog should be open,Click on paste confirm dialog OK button", true);
		jsclick(PasteConfimDialogOKBTN);

		Thread.sleep(8000);
		try {

			WebElement RetainOKBTN = driver.findElement(By.xpath("//*[@id='retainNodePropertiesOk1']"));
			jsclick(RetainOKBTN);

		} catch (Exception e) {
			System.out.println("Retain dialog Not Present");

		}

		// scrollDown(BillsCabinet);
		Reporter.log("Copy and a paste drawer successfully...", true);
		Thread.sleep(4000);
	}

	public void copyAndpasteFolder() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Reporter.log("Scenario 03: Verify RoomContextMenu tab - (copy and paste Folder)", true);
		jsclick(RoomContextTab);
		Thread.sleep(2000);
		Reporter.log("Click on Roomcontextmenu tab", true);
		jsclick(CabinetTest);
		Reporter.log("Expand a Cabinet", true);
		Thread.sleep(3000);
		jsclick(Drawer);
		Reporter.log("Expand a Drawer", true);
		Thread.sleep(3000);
		jsclick(FolderForCopy);
		Reporter.log("Select a Folder", true);
		Thread.sleep(5000);
		Reporter.log("Mousehover on Roomcontextmenu tab", true);
		Actions act = new Actions(driver);
		act.moveToElement(RoomContextTab).perform();

		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(CopyTab));// *[@id='retainNodePropertiesOk1']//*[@id="retainNodePropertiesModel1"]/div[2]
		Reporter.log("Click on copy option", true);
		act.moveToElement(CopyTab).click().build().perform();

		Reporter.log("Expand another Cabinet", true);
		Thread.sleep(4000);
		selectElement(BillsCabinet);
		Reporter.log("Expand another Drawer", true);
		Thread.sleep(5000);
		ElementToBeClickable(BillsDrawer);
		selectElement(BillsDrawer);// *[@id=\"12105\"]/a
		Thread.sleep(3000);// *[@id="26165"]/a
		movingElement(NewFolderFrPaste);
		Reporter.log("Select another Folder", true);
		jsclick(NewFolderFrPaste);
		Thread.sleep(3000);
		Reporter.log("Mousehover on Roomcontextmenu tab", true);
		act.moveToElement(RoomContextTab).perform();
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(PasteTab));
		movingElement(PasteTab);

		Reporter.log("Click on paste option", true);
		jsclick(PasteTab);

		Thread.sleep(3000);
		Reporter.log("It should display paste confirmation dialog, click on paste confirm dialog OK button", true);
		jsclick(PasteConfimDialogOKBTN);
		Thread.sleep(4000);
		try {

			WebElement RetainOKBTN = driver.findElement(By.xpath("//*[@id='retainNodePropertiesOk1']"));
			jsclick(RetainOKBTN);

		} catch (Exception e) {
			System.out.println("Retain dialog Not Present");

		}

		Thread.sleep(15000);
		// scrollDown(CVAppExpandIcon);
		Reporter.log("Pasted Folder has 50 documents", true);
		Reporter.log("Copy paste a folder successfully...", true);
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
		Thread.sleep(3000);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		Reporter.log("Scenario 04: Verify Node properties Option", true);

		expandCabinets();
		Thread.sleep(3000);
		Reporter.log("Mousehover on Roomcontextmenu tab", true);
		Actions act = new Actions(driver);
		act.moveToElement(RoomContextTab).perform();

		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		Reporter.log("Click on Nodeproperties option", true);
		jsclick(NodeProperties);

		Thread.sleep(6000);
		jsclick(selectDocDropDownFrNode);
		Reporter.log("Node properties dialog should be open", true);
		Thread.sleep(3000);
		Reporter.log("Select AllDataType ", true);
		selectDocNames();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOf(TextKey));
		movingclkElement(TextKey);
		TextKey.clear();
		Reporter.log("Enter value into TextKey field", true);
		sendvalue(TextKey, readFromRoomCntxt(1, 0));
		Thread.sleep(3000);

		scrollDown(numeric123);
		Reporter.log("Enter value into Numeric123 field", true);
		movingclkElement(numeric123);
		numeric123.clear();
		sendvalue(numeric123, "93838383823");
		Reporter.log("Enter value into Restaruent field", true);
		Thread.sleep(5000);
		scrollDown(Restaurent);
		movingclkElement(Restaurent);
		Restaurent.clear();
		sendvalue(Restaurent, readFromRoomCntxt(4, 0));
		Thread.sleep(5000);
		WebElement Contract = driver.findElement(By.xpath("//*[@id=\"nodePropVal_68\"]"));
		act.moveToElement(Contract).click().sendKeys("123").build().perform();
		Reporter.log("Select a date", true);
		scrollDown(Date);
		Thread.sleep(2000);
		movingclkElement(Date);

		jsclick(DateOct);

		Thread.sleep(2000);
		movingclkElement(Boolean123);
		Thread.sleep(2000);
		Reporter.log("Select Boolean123 dropdown YES", true);
		selectDropDownByIndex(YesORNoBoolean, 1);
		Thread.sleep(2000);
		selectDropDownByIndex(Selection123, 3);
		Thread.sleep(3000);
		Reporter.log("Select value in Selection123 dropdown.", true);
		jsclick(NodePropOKBTN);
		try {
			WebElement updatePopup = driver.findElement(By.id("confirmMessageOk35"));
			if (updatePopup.isDisplayed()) {
				updatePopup.click();
			}
		} catch (Exception e) {
			Reporter.log("Node Properties Updated Successfully...", true);
		}
		Reporter.log("Click NodeProperties dialog OK button", true);

		Thread.sleep(3000);
		Reporter.log("Click on new document tab", true);
		movingclkElement(CreateDocTab);
		Thread.sleep(3000);

		WebElement moveToPlusIcon = driver.findElement(By.xpath("//*[@id=\"addPagesDropDown\"]/span"));
		VisiblityOf(moveToPlusIcon);
		Reporter.log("Click on browse icon", true);
		movingElement(moveToPlusIcon);
		Thread.sleep(4000);
		// Reporter.log("Click broswe submenu");
		WebElement browseOption = driver.findElement(By.xpath("//input[@id='viewDocumentAddPages']"));
		movingclkElement(browseOption);
		Reporter.log("By using AutoIT add file from the external folder ", true);
		Thread.sleep(8000);
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\EdgeFileUpload.exe");
		Thread.sleep(8000);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			Reporter.log("Alert not present. . .", true);
		}
		Thread.sleep(5000);
		WebElement CreateBTN = driver.findElement(By.xpath("//*[@id=\"createDocumentSubmit\"]"));
		jsclick(CreateBTN);
		Reporter.log("Click on create button", true);
		Thread.sleep(8000);
		WebElement viewOption = driver.findElement(By.xpath("//*[@id=\"viewCreatedDocument\"]"));
		jsclick(viewOption);
		Reporter.log("'Document created succssfully' dialog opened, Click View button", true);

		Thread.sleep(8000);
		Reporter.log("'Document created succssfully' dialog opened, Click View button", true);
		jsclick(RoomContextTab);
		Thread.sleep(3000);
		Reporter.log("Indices should save the values which are set for the Node Properties", true);
		act.moveToElement(RoomContextTab).perform();
		Reporter.log("Close the document", true);
		Thread.sleep(5000);
		Reporter.log("Mousehover on RoomContextMenu tab", true);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		jsclick(NodeProperties);
		Reporter.log("Click on NodeProperties option, Node properties dialog should be open ", true);
		Thread.sleep(6000);
		jsclick(NodeResetBTN);
		Reporter.log("Click on reset button confirm dialog OK button", true);
		Thread.sleep(3000);
		jsclick(NodeResetYesBTN);
		Reporter.log("Reset confirm dialog should be open, Click Reset confirm dialog OK button", true);
		Reporter.log("Node properties was reset successfully...", true);
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
		Reporter.log("===============================================================================", true);
	}

	public void NodePropertiesDefault() throws Exception {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		jsclick(RoomContextTab);
		Reporter.log("Scenario 06: Verify Default NodeProperties ", true);
		wait.until(ExpectedConditions.elementToBeClickable(vidyaCaninet));
		selectElement(vidyaCaninet);
		Reporter.log("User should expand a cabinet which has default node value", true);
		Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(vidyaDrawer));
		Thread.sleep(3000);
		Reporter.log("Expand a drawer which has default node value", true);
		selectElement(vidyaDrawer);
		Reporter.log("User should select a folder which has default node value", true);
		wait.until(ExpectedConditions.elementToBeClickable(vidyaFolder));
		selectElement(vidyaFolder);
		Thread.sleep(3000);
		Reporter.log("Mousehover on Roomcontextmenu and select NodeProperties option", true);
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(NodeProperties));
		jsclick(NodeProperties);
		Thread.sleep(10000);
		Reporter.log("Nodeproperties dialog should be open", true);
		jsclick(CountriesDrpdown);
		Thread.sleep(3000);
		Reporter.log("Change country dropdown", true);
		selectDropDownByIndex(CountriesDrpdown, 6);
		Thread.sleep(3000);
		jsclick(NodePropOKBTN);
		Reporter.log("Click on NodeProperties dialog OK button", true);
		try {
			WebElement updatePopup = driver.findElement(By.id("confirmMessageOk35"));
			if (updatePopup.isDisplayed()) {
				updatePopup.click();
			}
		} catch (Exception e) {
			Reporter.log("Node Properties Updated Successfully...", true);
		}
		Thread.sleep(5000);
		movingclkElement(CreateDocTab);
		Reporter.log("Click on new document tab", true);
		Thread.sleep(10000);
		Reporter.log("Indices should show the default Nodeproperty values", true);
		jsclick(Refresh_Button(driver));
		Reporter.log("Default NodeProeprties verified successfully...", true);
		Reporter.log("Click on refresh button", true);
		Reporter.log("===============================================================================", true);
	}

	public void Notification() throws Exception {
		Reporter.log("Scenario 07: Verify Roomcontextmenu tab Notification Option", true);

		jsclick(RoomContextTab);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Thread.sleep(3000);
		Reporter.log("Expand a cabinet and expand a drawer to select a folder.", true);

		Thread.sleep(3000);
		Reporter.log("Folder selected successfully...", true);
		// jsclick(Drawer);
		Reporter.log("Mousehover on Roomcontext menu tab ", true);

		Reporter.log("Select Notification option", true);
		expandNodesCustomCol();
		Thread.sleep(3000);
		movingElement(RoomContextTab);
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(Notification));
		Thread.sleep(3000);
		jsclick(Notification);

		Thread.sleep(5000);
		Reporter.log("Notification dialog should be open", true);
		jsclick(resetBTNmyPref);
		Reporter.log("Click on reset button", true);
		Thread.sleep(3000);
		Reporter.log("Reset option verified successfully...", true);
		jsclick(NotificationDropDown);
		Reporter.log("Click on notification dropdown", true);
		Thread.sleep(3000);
		Reporter.log("Select 'any changes to the folder' option", true);
		WebElement AnyChangesOption = driver.findElement(By.xpath("//span[text()='Any changes to folder']"));
		VisiblityOf(AnyChangesOption);
		jsclick(AnyChangesOption);
		Thread.sleep(3000);
		Reporter.log("Select 'any changes to the document' option from notification dropdown", true);
		scrollDown(AnyChangesToDocuments);
		wait.until(ExpectedConditions.elementToBeClickable(AnyChangesToDocuments));
		movingElement(AnyChangesToDocuments);
		jsclick(AnyChangesToDocuments);

		Thread.sleep(3000);
		scrollDown(ScrollIntoDown);
		Reporter.log("Click on apply button", true);
		Thread.sleep(4000);
		scrollUp(AnyChangesOption);
		Reporter.log("Select notification tab, it will show the notification for selected option", true);
		Thread.sleep(4000);
		jsclick(applyBTNmypref);
		Reporter.log(
				"If any changes have been made by other user in the selected notification folder, the specified user will receive a notification",
				true);
		Thread.sleep(10000);
		selectElement(ForOpenNotiAgain);

		// jsclick(Notification);
		Thread.sleep(3000);
		jsclick(NotificationDropDown);
		Thread.sleep(3000);
		try {
			WebElement FolderDocoption = driver
					.findElement(By.xpath("//span[text()='Folder / Document / Sub Folder is created']"));
			if (FolderDocoption.isDisplayed()) {
				jsclick(resetBTNmyPref);
				Thread.sleep(2000);
				jsclick(FolderDocoption);
				jsclick(applyBTNmypref);
				Thread.sleep(10000);
			}
		} catch (Exception e) {
			Reporter.log("Folder/document/subfolder changes notified", true);
		}
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.moveToElement(RoomContextTab).perform();

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
			Reporter.log("It's already selected", true);
		} else {
			jsclick(CustomeClNoti);
		}
		Thread.sleep(2000);
		jsclick(applyBTNmypref);
		Thread.sleep(8000);

		Reporter.log("Notification option verified successfully", true);
	}

	public void CustomDocTypes() throws Exception {
		Reporter.log("Scenario 08: Verify RoomContextmenu 'CustomDocumentType' option", true);
		jsclick(RoomContextTab);
		Thread.sleep(3000);
		jsclick(CabinetForCustomDoc);
		GrantSuperivorPermissionForADMINAC();
		Thread.sleep(2000);
		jsclick(Refresh_Button(driver));
		Thread.sleep(4000);
		jsclick(CabinetForCustomDoc);
		Reporter.log("Select a cabinet to set custom document type", true);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		movingElement(RoomContextTab);
		Reporter.log("Mousehover on Roomcontextmenu tab", true);
		Thread.sleep(6000);
		wait.until(ExpectedConditions.visibilityOf(customdoc));
		Thread.sleep(3000);
		jsclick(customdoc);
		Reporter.log("Select Custom DocumentType Submenu", true);
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		try {
			act.moveToElement(bill).click().build().perform();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("Failed to add custom column");
		}
		try {
			act.moveToElement(dateMask).click().build().perform();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Failed to add custom column");
		}
		try {
			act.moveToElement(cvReports).click().build().perform();
			Thread.sleep(3000);
			act.moveToElement(WithDrawn).click().build().perform();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("Failed to add custom column");
		}

		Reporter.log("Custom document type dialog box should be open", true);
		Reporter.log("Select the required document types", true);
		Thread.sleep(3000);
		act.moveToElement(alldataType).click().build().perform();

		Thread.sleep(5000);
		WebElement OKBTNcustomcol = driver.findElement(By.xpath("(//button[@id='setCustomDocTypeOK'])[1]"));
		jsclick(OKBTNcustomcol);
		Reporter.log("Click on custom document type dialog OK button", true);
		Thread.sleep(3000);
		jsclick(CreateDocTab);
		Reporter.log("Click on new document tab", true);
		Thread.sleep(5000);
		movingclkElement(selectDocDropDown);
		Reporter.log("Click on 'Select DocumentType' option", true);
		Thread.sleep(15000);
		jsclick(RoomContextTab);
		Thread.sleep(4000);
		Reporter.log("It should show the saved document types", true);
		jsclick(CabinetForCustomDoc);
		Thread.sleep(4000);
		Reporter.log("The saved document type displayed successfully", true);
		movingElement(RoomContextTab);
		Thread.sleep(3000);
		Reporter.log("Custom document type verified successfully", true);
		wait.until(ExpectedConditions.visibilityOf(customdoc));
		Thread.sleep(3000);
		Reporter.log("MouseHover on RoomContextmenu tab and select Reset custom document option", true);
		Reporter.log("Custom document type reset successfully...", true);
		jsclick(ResetcustomDocType);
		Thread.sleep(7000);

		jsclick(Refresh_Button(driver));
		// Reporter.log("Custom documents verified successfully", true);
	}

	public void CategoryPrivate() throws Exception {
		Thread.sleep(3000);
		Reporter.log("Scenario 09: RoomcontextMenu tab 'Category - private' option", true);
		jsclick(RoomContextTab);
		Thread.sleep(4000);
		Reporter.log("Select cabinet", true);
		/*
		 * jsclick(CabinetForCustomDoc); Thread.sleep(2000);
		 * GrantSuperivorPermissionForADMINAC();
		 */
		/*
		 * jsclick(CabinetForCustomDoc); WebDriverWait wait = new WebDriverWait(driver,
		 * 20); movingElement(RoomContextTab);
		 * Reporter.log("Mousehover on roomcontextmenu tab", true); Thread.sleep(7000);
		 * // wait.until(ExpectedConditions.visibilityOf(Categories)); //
		 * Thread.sleep(3000); jsclick(Categories);
		 */
		Reporter.log("Select categories option", true);
		Thread.sleep(5000);
		/*
		 * try { WebElement privateView =
		 * driver.findElement(By.xpath("//span[text()='Private ']"));
		 * movingElement(privateView); jsclick(privateView); } catch (Exception e) {
		 * System.out.println("Exception Handled"); }
		 * Reporter.log("Select private option", true); Thread.sleep(2000); try {
		 * WebElement RedColr =
		 * driver.findElement(By.xpath("//span[@id='CustomColourid_5']"));
		 * movingElement(RedColr); Reporter.log("Select red colour", true);
		 * jsclick(RedColr); } catch (Exception e) {
		 * System.out.println("Exception Handled"); }
		 */
		CheckAllColors();

		Reporter.log("Click on categories dialog OK button", true);
		Thread.sleep(3000);
		Reporter.log("The cabinet should be displayed in Red color for the user", true);
		WebElement OKBTNColor = driver.findElement(By.xpath("(//button[@id='customColourModelOk'])[1]"));
		jsclick(OKBTNColor);

		Thread.sleep(2000);
		jsclick(Refresh_Button(driver));
		Thread.sleep(4000);
		/*
		 * LogoutPage(); Thread.sleep(5000); loginCVS();
		 */
		Reporter.log("Categories Private verified successfully", true);
		Reporter.log("============================================================================", true);
	}

	public void CheckAllColors() {
		// Array of color element IDs
		String[] colorIds = { "CustomColourid_1", // Green
				"CustomColourid_2", // Dark Yellow
				"CustomColourid_3", // Red
				"CustomColourid_4", // Orange
				"CustomColourid_5", // Olive
				"CustomColourid_6", // Maroon
				"CustomColourid_7", // Purple
				"CustomColourid_8", "CustomColourid_9"// None
		};

		// Loop through each color
		for (String colorId : colorIds) {
			try {
				// Select 'Private' option
				jsclick(CabinetForCustomDoc);
				WebDriverWait wait = new WebDriverWait(driver, 20);
				movingElement(RoomContextTab);
				Reporter.log("Mousehover on roomcontextmenu tab", true);
				Thread.sleep(7000);
				// wait.until(ExpectedConditions.visibilityOf(Categories));
				// Thread.sleep(3000);
				jsclick(Categories);
				WebElement privateView = driver.findElement(By.xpath("//span[text()='Private ']"));
				Actions actions = new Actions(driver);
				actions.moveToElement(privateView).click().perform();
				Reporter.log("Select private option", true);
				Thread.sleep(2000);

				// Select color
				WebElement colorElement = driver.findElement(By.xpath("//span[@id='" + colorId + "']"));
				actions.moveToElement(colorElement).click().perform();
				Reporter.log("Select color with ID: " + colorId, true);

				// Click on 'OK' button
				WebElement okButton = driver.findElement(By.xpath("(//button[@id='customColourModelOk'])[1]"));
				actions.moveToElement(okButton).click().perform();
				Reporter.log("Click on categories dialog OK button", true);
				Thread.sleep(6000);

				// Log the color selection
				Reporter.log("The cabinet should be displayed in the selected color for the user", true);
			} catch (Exception e) {
				System.out.println("Exception Handled: " + e.getMessage());
			}
		}
	}

	public void CategoryPublic() throws Exception {
		Reporter.log("Scenario 10: RoomcontextMenu tab 'Category - public' option", true);
		Thread.sleep(5000);
		jsclick(Cabinet);
		// jsclick(Cabinet);
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try {
			movingElement(RoomContextTab);
		} catch (JavascriptException e) {
			System.out.println("Exception handled");
		}
		Reporter.log("Select a cabinet");
		Thread.sleep(3000);
		wait.until(ExpectedConditions.visibilityOf(Categories));
		Thread.sleep(3000);
		Reporter.log("Mousehover on roomcontextmenu tab and click categories option", true);
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
		Reporter.log("The cabinet should be displayed in purple color for all user", true);
		WebElement OKBTNColor = driver.findElement(By.xpath("(//button[@id='customColourModelOk'])[1]"));
		jsclick(OKBTNColor);
		Thread.sleep(3000);

		// movingclkElement(Cabinet);
		Thread.sleep(8000);
		Reporter.log("categories public option verified successfully...", true);
		Reporter.log("===============================================================================", true);
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
		LogInAdmin();
		Reporter.log("TakeOwnerShip functionality verified successfull", true);

	}

}
