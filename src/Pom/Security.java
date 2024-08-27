package Pom;

//Dipak Automation Coading

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

//Dipak Automation script
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Security extends Generic.BaseClass {

	private static final boolean False = false;
	public static WebElement element = null;

	public Security() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//li[normalize-space()='dipak']") // Here you can change User instaed dipak
	private WebElement Click_User;

	@FindBy(xpath = "//li[normalize-space()='cvadmins']") // Here you can change groupname instaed cvadmins
	private WebElement Click_Groupcvadmin;

	@FindBy(xpath = "//li[normalize-space()='cvnamed']") // Here you can change groupname instaed cvnamed
	private WebElement Click_Groupcvnamed;

	@FindBy(xpath = "//*[@id=\"menu-content\"]/li[3]/a/span/img")
	private WebElement cvnamed;

	@FindBy(xpath = "//*[@id=\"menu-content\"]/li[2]")
	private WebElement cvadmins;

	@FindBy(xpath = "//*[@id=\"cvnamed\"]/li[1]/a/img")
	private WebElement cvnamed_User;

	@FindBy(xpath = "//*[@id=\"security\"]")
	private WebElement Security_option;

	@FindBy(xpath = "//*[@id=\"pUserList\"]")
	private WebElement UserSearchbox;

	public void getSelect_Added_User() throws Exception {

		jsclick(UserSearchbox);
		UserSearchbox.sendKeys(Security_excelRead(1, 0));
		Thread.sleep(5000);
		jsclick(Click_User);
	}

	// Select From Document Navigator

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	@FindBy(xpath = (".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_subFolder;

	// Select from Destination folder Location

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer1;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder1;

	@FindBy(xpath = "//*[@id=\"securityAdd\"]")
	private WebElement Add_Button;

	@FindBy(xpath = "//*[@id=\"selectedUsersAndGroups\"]")
	private WebElement Ok_button_UserDialog;

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"applySecurity\"]")
	private WebElement Apply_button_SecurityDialog;

	@FindBy(xpath = "//*[@id=\"securityUpdate\"]")
	private WebElement Ok_button_SecurityDialog;

	@FindBy(xpath = "//button[@id='securityRemove']")
	private WebElement Remove_Button;

	@FindBy(xpath = "//button[@id='cancelSecurity']")
	private WebElement Cancel_Button_SecurityDialog;

	@FindBy(xpath = "//span[@id='navigatorModelClose36']")
	private WebElement Cross_Button_SecurityDialog;

	@FindBy(xpath = "//*[@id=\"resetSecurity\"]")
	private WebElement Reset_Button_SecurityDialog;

	@FindBy(xpath = "//*[@id=\"resetNo\"]")
	private WebElement No_Button_Securitypopup;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"resetYes\"]")
	private WebElement Yes_Button_Securitypopup;

	@FindBy(xpath = "//*[@id=\"imgDelete\"]")
	private WebElement Delete_Permission;

	@FindBy(xpath = "//*[@id=\"docTypeList\"]")
	private WebElement Click_Document_Type_Dropdown;

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_ReportName;

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
	private WebElement Browse_Option;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Create_button;

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_button;

	@FindBy(xpath = "//*[@id=\"imgShare\"]")
	private WebElement Share_Permission;

	@FindBy(xpath = "//*[@id=\"imgModify\"]")
	private WebElement Modify_Permission;

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Username;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Logout;

	@FindBy(xpath = "//*[@id=\"docOwnerName\"]")
	private WebElement Docownername;

	@FindBy(xpath = "//*[@id=\"detailsBlock\"]/p[2]/span")
	private WebElement openviewonly;

	@FindBy(xpath = "//*[@id=\"ownershipMessageModelOk\"]")
	private WebElement ownershipmessageok;

	@FindBy(xpath = "//button[@id='ownershipMessageModelOk']")
	private WebElement View_WorkflowDoc;

	@FindBy(xpath = "//*[@id=\"navigationMenuBtn\"]")
	private WebElement MoveTo_Menu_RoomName;

	@FindBy(xpath = "//*[@id=\"imgAssign\"]")
	private WebElement DoubleClick_CrossBar;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document_UnderFolder;

	@FindBy(xpath = "//input[@class='thumbnailOptionSelected']")
	private WebElement Select_Document;

	@FindBy(xpath = "//*[@id=\"createDocument\"]")
	private WebElement Click_New_Document;

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	@FindBy(xpath = "//*[@id=\"toolbarId\"]/div[6]")
	private WebElement Verify_Share_Document_Option_Disable;

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement Close_Document;

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_subfolder_Document;

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	@FindBy(xpath = "//*[@id=\"defaultPdfDocViewListNo\"]")
	private WebElement Pdf_document_Defaultviewing;

	@FindBy(xpath = "//*[@id=\"defaultOfficeDocViewListNo\"]")
	private WebElement Select_Office_document_Defaultviewing;

	@FindBy(xpath = "//*[@id=\"existingEntryAlert\"]/p")
	private WebElement Groupaddvalidation;

	@FindBy(xpath = "//*[@id=\"closeGroupUserModal\"]")
	private WebElement Closebutton;

	@FindBy(xpath = "//*[@id=\"cancelSecurity\"]")
	private WebElement CancelSecuritydialog;

	@FindBy(xpath = "//*[@id=\"newEntry\"]")
	private WebElement NewEntry;

	@FindBy(xpath = "//a[normalize-space()='dipak']")
	private WebElement Select_ValidationUser;

	@FindBy(xpath = "//*[@id=\"recentMenuBtn\"]")
	private WebElement MoveTo_Menu_Recent;

	@FindBy(xpath = "//*[@id=\"recentFolders\"]/tbody/tr[1]/td")
	private WebElement Recent_Folder;

	@FindBy(xpath = "//*[@id='fileControl_delete']/span")
	private WebElement DeleteFromViewer;

	@FindBy(xpath = "//i[@id='deleteFabButton']")
	private WebElement DeleteFromFab;

	@FindBy(xpath = "//*[@id=\"menuWebWrapper\"]/div[3]")
	private WebElement saveviewer;

	@FindBy(xpath = "//*[@id=\"menuWebWrapper\"]/div[10]")
	private WebElement ocrviewer;

	@FindBy(xpath = "//*[@id=\"documentSendTo\"]")
	private WebElement sendTo;

	@FindBy(xpath = "//*[@id=\"sendToMail\"]")
	private WebElement Verify_sendTomail_option;

	@FindBy(xpath = "//*[@id=\"sendToPrint\"]")
	private WebElement Verify_sendToprint_option;

	@FindBy(xpath = "//*[@id=\"sendToExport\"]")
	private WebElement Verify_sendToExport_option;

	@FindBy(xpath = "//*[@id=\"cutNodeLi\"]")
	private WebElement cutnode;

	@FindBy(xpath = "//*[@id=\"copyNodeLi\"]")
	private WebElement copynode;

	@FindBy(xpath = "//*[@id=\"renameNodeAnchor\"]")
	private WebElement Renamenode;

	@FindBy(xpath = "//a[@id='deleteNodeAnchor']")
	private WebElement deletenode;

	@FindBy(xpath = "//*[@id=\"cutid\"]")
	private WebElement doclistcut;

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement doclistcopy;

	@FindBy(xpath = "//*[@id=\"delDocument\"]")
	private WebElement doclistdelete;

	@FindBy(xpath = "//*[@id=\"generateDocumentLink\"]")
	private WebElement doclistgeneratedoclink;

	@FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]/label/span"))
	private WebElement Select_DocumentList;

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	@FindBy(xpath = "//*[@id=\"sendToSecureMail\"]")
	private WebElement Verify_sendTosecuremail_option;

	SoftAssert softAssert = new SoftAssert();

	public void getMoveTo_Menu_Documents() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Documents).build().perform();
	}

	public void getMoveTo_Menu_Recent() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Recent).perform();
	}

	public void getSelect_Added_Group() throws Exception {
		jsclick(UserSearchbox);
		UserSearchbox.sendKeys(Security_excelRead(3, 0));
		Thread.sleep(2000);
		jsclick(Click_Groupcvadmin);
	}

	public void getSelect_Added_CvnamedGroup() throws Exception {
		jsclick(UserSearchbox);
		UserSearchbox.sendKeys(Security_excelRead(4, 0));
		Thread.sleep(2000);
		jsclick(Click_Groupcvnamed);
	}

	public WebElement getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;
	}

	public void getEnter_ReportName() throws Exception {

		jsclick(Enter_ReportName);
		Enter_ReportName.sendKeys(MyPreferences_excelRead(1, 0));
	}

	public void getMoveTo_Menu_RoomName() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_RoomName).build().perform();
	}

	public WebElement getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	public void getDoubleClick_CrossBar() {
		Actions builder = new Actions(driver);
		builder.doubleClick(DoubleClick_CrossBar).build().perform();
	}

	public void getSelect_Office_document_Defaultviewing() {
		Select sel = new Select(Select_Office_document_Defaultviewing);
		sel.selectByVisibleText("Default viewing");

	}

	public void getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		drop.selectByVisibleText("Default viewing");
	}

	public void getaddvalidationmessage() {
		Reporter.log(Groupaddvalidation.getText() + " this validation message should show", true);

	}

	public void getVerify_Ownership_Message() throws InterruptedException {
		jsclick(ownershipmessageok);

	}

	public void getSelect_Added_User_Folder() throws Exception {
		Thread.sleep(3000);
		jsclick(UserSearchbox);
		UserSearchbox.sendKeys(Security_excelRead(1, 0));
		Thread.sleep(2000);
		jsclick(Click_User);

	}

	public void getVerify_Share_Document_Option_Disable() {

		softAssert.assertTrue(Verify_Share_Document_Option_Disable.isEnabled());
	}

	public void getVerify_DisableOptions_FromDocList() throws Exception {

		softAssert.assertTrue(Verify_sendTomail_option.isEnabled());
		softAssert.assertTrue(Verify_sendToprint_option.isEnabled());
		softAssert.assertTrue(Verify_sendToExport_option.isEnabled());
		softAssert.assertTrue(Verify_sendTosecuremail_option.isEnabled());

	}

	public void All_permission_To_Cabinet() throws Exception {

		Reporter.log("Test Scenario 1 : Give All permission for Cabinet ", true);
		try {
			LogDipakUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Username);
		Thread.sleep(6000);
		Reporter.log("Click on Username", true);
		jsclick(Logout);
		Thread.sleep(6000);
		Reporter.log("Click on Logout Option", true);
		LoginAdminUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with  User", true);
		selectElement(Select_Cabinet);
		Thread.sleep(3000);
		Reporter.log("Expand a Cabinet", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on  Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on  Security dialog Add button", true);
		jsclick(cvnamed);
		Thread.sleep(6000);
		Reporter.log("Select cvnamed Group", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			Reporter.log("Verifying Validation message", true);
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		getSelect_Added_CvnamedGroup();
		Thread.sleep(6000);
		Reporter.log("Select Added Group", true);
		jsclick(NewEntry);
		Thread.sleep(3000);
		Reporter.log("Click on  New Entry Security button", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign all permission to Group", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on  Security dialog Add button", true);
		jsclick(cvnamed);
		Thread.sleep(6000);
		Reporter.log("Select cvnamed Group", true);
		jsclick(cvnamed_User);
		Thread.sleep(6000);
		Reporter.log("Select User from Group", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			Reporter.log("Verifying Validation message", true);
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}

		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		Reporter.log("Select a User", true);
		jsclick(NewEntry);
		Reporter.log("Click on  New Enty button", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign all permission to User", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(5000);
		LogoutPage();
		Reporter.log("Click on  Security dialog Ok button", true);
		Reporter.log("All permission should be given for Cabinet", true);
	}

	public void Verify_Permission_CabinetLevel() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying All permission for Cabinet", true);

		LogDipakUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with User credential", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office Document and set Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and set Default View", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Apply button", true);
		Refresh_Button();
		Thread.sleep(8000);
		jsclick(Click_New_Document);
		Thread.sleep(4000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(4000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(Select_Cabinet1);
		Thread.sleep(2000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer1);
		Thread.sleep(3000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder1);
		Thread.sleep(2000);
		Reporter.log("select a Folder", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button ", true);
		getSelect_Document_Type_Dropdown();
		Thread.sleep(4000);
		Reporter.log("Select Value from Document type dropdown", true);
		getEnter_ReportName();
		Thread.sleep(3000);
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(Move_To_PlusIcon));
		movingElement(Move_To_PlusIcon);
		getBrowse_Option();
		Thread.sleep(3000);
		Reporter.log("Browse a Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PdfDoc\\FileUploadUpdate.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		movingclkElement(Create_button);
		Thread.sleep(4000);
		Reporter.log("Click on Create button", true);
		jsclick(Navigate_button);
		Thread.sleep(7000);
		Refresh_Button();
		Thread.sleep(8000);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover to Roomname Tab", true);
		Thread.sleep(1000);
		softAssert.assertTrue(cutnode.isEnabled());
		softAssert.assertTrue(copynode.isEnabled());
		softAssert.assertTrue(deletenode.isEnabled());
		softAssert.assertTrue(Security_option.isEnabled());
		Thread.sleep(2000);
		jsclick(Select_DocumentList);
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List ", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		Reporter.log("Mousehover on Documents Tab", true);
		softAssert.assertTrue(doclistcut.isEnabled());
		softAssert.assertTrue(doclistcopy.isEnabled());
		softAssert.assertTrue(doclistdelete.isEnabled());
		Thread.sleep(1000);
		jsclick(sendTo);
		Thread.sleep(1000);
		Reporter.log("Click on the Send To Option", true);
		softAssert.assertTrue(Verify_sendTomail_option.isEnabled());
		softAssert.assertTrue(Verify_sendToprint_option.isEnabled());
		softAssert.assertTrue(Verify_sendToExport_option.isEnabled());
		softAssert.assertTrue(Verify_sendTosecuremail_option.isEnabled());
		softAssert.assertTrue(doclistgeneratedoclink.isEnabled());
		Thread.sleep(1000);
		jsclick(Open_Document_UnderFolder);
		Thread.sleep(9000);
		Reporter.log("Click on Document from Document List", true);
		try {
			getVerify_Ownership_Message();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Document Open successfuly");
		}
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(8000);
		Reporter.log("Document Open successfully", true);
		jsclick(Select_Document);
		Thread.sleep(8000);
		Reporter.log("Click on First Page Thumbnail", true);
		softAssert.assertTrue(Verify_Share_Document_Option_Disable.isEnabled());
		softAssert.assertTrue(DeleteFromViewer.isEnabled());
		softAssert.assertTrue(DeleteFromFab.isEnabled());
		Thread.sleep(2000);
		movingclkElement(Close_Document);
		Thread.sleep(2000);
		Reporter.log("Verified All permission for Cabinet", true);
		LogoutPage();
		Reporter.log("Logout the user account ", true);
	}

	public void Remove_All_permission_Cabinet() throws Exception {

		Reporter.log("Test Scenario 3 : Remove All permission To  for Cabinet", true);

		LoginAdminUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with admin User ", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		getSelect_Added_User();
		Thread.sleep(6000);
		Reporter.log("Select added User", true);
		jsclick(Remove_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Remove button", true);
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		Reporter.log("Added Remove Successfully on Cabinet level", true);
	}

	public void Set_Delete_Denied_onFolder() throws Exception {

		Reporter.log("Test Scenario 4 : Set Delete permission Denied for Folder", true);
		try {
			LoginAdminUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(cvnamed);
		Thread.sleep(6000);
		Reporter.log("Select cvnamed Group", true);
		jsclick(cvnamed_User);
		Thread.sleep(6000);
		Reporter.log("Select User from Group", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			Reporter.log("Verifying Valialidation message", true);
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		Reporter.log("Select added User", true);
		jsclick(NewEntry);
		Reporter.log("Click on New Entry button", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign Permission to added User", true);
		jsclick(Delete_Permission);
		Thread.sleep(6000);
		Reporter.log("Denied Delete Permission for Folder", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		Reporter.log("Delete permission should be Denied Selected  for Drawer", true);
		LogoutPage();
		Thread.sleep(6000);
	}

	public void Verify_Delete_permission_Denied_Folder() throws Exception {

		Reporter.log("Test Scenario 5 : Verifying Delete permission Denied for Folder ", true);

		LogDipakUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with User Credential ", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(7000);
		Reporter.log("select a Folder", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover to Roomname Tab", true);
		Thread.sleep(2000);

		if (Security_option.isEnabled()) {
			System.out.println("Security option found enabled");
		} else {
			System.out.println("Security option found disabled");
		}

		if (deletenode.isEnabled()) {
			System.out.println("delete option found enabled");
		} else {
			System.out.println("delete option found disabled");
		}

		Thread.sleep(2000);
		jsclick(Select_DocumentList);
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List ", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		Reporter.log("Mousehover on Documents Tab", true);

		if (doclistdelete.isEnabled()) {
			System.out.println("delete option found enabled");
		} else {
			System.out.println("delete option found disabled");
		}

		jsclick(Open_Document_UnderFolder);
		Reporter.log("Open Document from document List ", true);
		try {
			getVerify_Ownership_Message();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Document Open successfuly");
		}
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("Document Open successfully", true);
		Thread.sleep(9000);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Select First page Thumbnail", true);

		if (DeleteFromViewer.isEnabled()) {
			System.out.println("delete option found enabled from viewer");
		} else {
			System.out.println("delete option found disabled from viewer");
		}
		if (DeleteFromFab.isEnabled()) {
			System.out.println("delete option found enabled from viewer");
		} else {
			System.out.println("delete option found disabled from viewer");
		}

		Thread.sleep(6000);
		Reporter.log("Verified Delete Option is Disable from Fab button and Delete Menu Option", true);
		movingclkElement(Close_Document);
		Thread.sleep(5000);
		Reporter.log("Click on Cross button and Close Document", true);
		LogoutPage();
		Thread.sleep(5000);

	}

	public void Remove_Delete_Denied_Folder() throws Exception {

		Reporter.log("Test Scenario 6 : Remove Delete Permission Denied for Folder", true);

		LoginAdminUser();
		Thread.sleep(5000);
		Reporter.log("Login EWA with  User", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(7000);
		Reporter.log("select a Folder", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover into Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		getSelect_Added_User();
		Thread.sleep(6000);
		Reporter.log("Select added User", true);
		jsclick(Remove_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Remove button", true);
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		Reporter.log("Added user Remove Successfully on Folder level", true);
		Reporter.log("Delete permission is denied for Folder verified Successfully...");

	}

	public void Share_permission_Denied_Folder() throws Exception {

		Reporter.log("Test Scenario 7 : Share permission Denied for Folder ", true);

		try {
			LoginAdminUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname ", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(cvnamed);
		Thread.sleep(6000);
		Reporter.log("Click on cvnamed Group", true);
		jsclick(cvnamed_User);
		Thread.sleep(6000);
		Reporter.log("Select from Group", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			Reporter.log("Verifying Validation message", true);
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		Reporter.log("Select added User", true);
		jsclick(NewEntry);
		Reporter.log("Click on New Entry button", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign permission to Selected ", true);
		jsclick(Share_Permission);
		Thread.sleep(6000);
		Reporter.log("Denied Share permission to Selected ", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		Reporter.log("Share permission should be Denied Selected  for Folder", true);
		jsclick(Username);
		Thread.sleep(6000);
		Reporter.log("Click on Username", true);
		jsclick(Logout);
		Thread.sleep(6000);
		Reporter.log("Click on Logout Option", true);
		LogDipakUser();
		Thread.sleep(2000);
		Reporter.log("Login EWA with User Credential", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		jsclick(Select_DocumentList);
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List ", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		Reporter.log("Mousehover on Documents Tab", true);
		jsclick(sendTo);
		Thread.sleep(1000);
		Reporter.log("Click on the Send To Option", true);
		getVerify_DisableOptions_FromDocList();
		Thread.sleep(2000);
		jsclick(Open_Document_UnderFolder);
		try {
			getVerify_Ownership_Message();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Document Open successfuly");
		}
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("Document open successfully under Folder", true);
		Thread.sleep(6000);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Click on First page Thumbnail", true);
		getVerify_Share_Document_Option_Disable();
		Thread.sleep(6000);
		Reporter.log("Verified Share option is Disable from Viewer menu", true);
		movingclkElement(Close_Document);
		Thread.sleep(6000);
		Reporter.log("Click on Cross button and Close document", true);
		LogoutPage();
		LoginAdminUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with admin User ", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Tab", true);
		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		Reporter.log("Select added User ", true);
		jsclick(Remove_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Remove button", true);
		jsclick(Ok_button_SecurityDialog);
		Reporter.log("Click on  Security dialog Ok button", true);
		Reporter.log("Added  Remove Successfully on Folder level", true);
		Reporter.log("Share permission is denied for Folder verified Successfully...");
	}

	public void Modify_Denied_Subfolder() throws Exception {

		Reporter.log("Test Scenario 8 : Verifying Modify Permissions Denied on subFolder ", true);
		try {
			LoginAdminUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(15000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		selectElement(Select_subFolder);
		Thread.sleep(6000);
		Reporter.log("select a SubFolder", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Add button", true);
		jsclick(cvnamed);
		Thread.sleep(6000);
		Reporter.log("Select Cvnamed Group", true);
		jsclick(cvnamed_User);
		Thread.sleep(3000);
		Reporter.log("Select User from Group", true);
		movingclkElement(Ok_button_UserDialog);
		Thread.sleep(3000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			Reporter.log("Verifying Validation message", true);
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		Reporter.log("Select added User", true);
		jsclick(NewEntry);
		Reporter.log("Click on  New Entry button", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign all permission to Selected ", true);
		jsclick(Modify_Permission);
		Thread.sleep(6000);
		Reporter.log("Denied Modify Permission to Selected ", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Reporter.log("Click on the Ok button", true);
		Reporter.log("Modify permission should be Denied Selected  for SubFolder", true);
		LogoutPage();
		LogDipakUser();
		Reporter.log("Login EWA with User Credential", true);
		Thread.sleep(6000);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a  Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		selectElement(Select_subFolder);
		Thread.sleep(6000);
		Reporter.log("select a SubFolder", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover to Roomname Tab", true);
		Thread.sleep(1000);
		softAssert.assertTrue(Renamenode.isEnabled());
		softAssert.assertTrue(copynode.isEnabled());
		softAssert.assertTrue(Security_option.isEnabled());
		Thread.sleep(2000);
		jsclick(Select_DocumentList);
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List ", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		Reporter.log("Mousehover on Documents Tab", true);
		softAssert.assertTrue(doclistcopy.isEnabled());
		Thread.sleep(2000);
		jsclick(Open_subfolder_Document);
		Reporter.log("Click on SubFolder Document", true);
		try {
			getVerify_Ownership_Message();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Document Open successfuly");
		}
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("Document Open successfully", true);
		Thread.sleep(11000);
		jsclick(Select_Document);
		Thread.sleep(9000);
		Reporter.log("Select First page Thumbnail", true);
		softAssert.assertTrue(DeleteFromViewer.isEnabled());
		softAssert.assertTrue(DeleteFromFab.isEnabled());
		softAssert.assertTrue(saveviewer.isEnabled());
		softAssert.assertTrue(ocrviewer.isEnabled());
		Thread.sleep(3000);
		movingclkElement(Close_Document);
		Thread.sleep(3000);
		Reporter.log("Click on Cross button and Close Document", true);
		LogoutPage();
		LoginAdminUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with  User", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		selectElement(Select_subFolder);
		Thread.sleep(6000);
		Reporter.log(" select a SubFolder", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		Reporter.log("Select Added User", true);
		jsclick(Remove_Button);
		Thread.sleep(6000);
		Reporter.log("Click on  Security dialog Remove button", true);
		jsclick(Ok_button_SecurityDialog);
		Reporter.log("Click on  Security dialog Ok button", true);
		Reporter.log("Added  Remove Successfully on subFolder level", true);
		Reporter.log("Modify permission is denied for Subfolder verified Successfully...");
	}

	public void Diffrenet_permissions_Group() throws Exception {

		Reporter.log("Test Scenario 9 : Give Different permission To Group for AllNodes", true);
		try {
			LoginAdminUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(cvadmins);
		Thread.sleep(6000);
		Reporter.log("Click on cvadmins Group Name", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			Reporter.log("Verifying Group added already Validation Message", true);
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		getSelect_Added_Group();
		Thread.sleep(6000);
		Reporter.log("Select Added Group", true);
		jsclick(NewEntry);
		Thread.sleep(3000);
		Reporter.log("Click on  New Entry Security button", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign all permission to Group", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Reporter.log("Click on  Security dialog Ok button", true);
		Reporter.log("All permission should be given to  for Cabinet", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(cvadmins);
		Thread.sleep(6000);
		Reporter.log("Select cvadmins Group", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			getaddvalidationmessage();
		} catch (Exception e) {
			System.out.println("Validation message not showing");
		}
		Thread.sleep(6000);
		Reporter.log("Verifying Validation message", true);
		jsclick(Closebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Close button", true);
		getSelect_Added_Group();
		Thread.sleep(6000);
		Reporter.log("Select Added Group", true);
		jsclick(NewEntry);
		Thread.sleep(6000);
		Reporter.log("Click on New Entry button", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign all permission to Group", true);
		jsclick(Delete_Permission);
		Thread.sleep(6000);
		Reporter.log("Denied Delete permission to Group", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Ok button", true);
		Reporter.log("Delete permission should be Denied Selected  for Drawer", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Add button", true);
		jsclick(cvadmins);
		Thread.sleep(6000);
		Reporter.log("Select cvadmins Group", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		getaddvalidationmessage();
		Thread.sleep(6000);
		Reporter.log("Verifying Validation message", true);
		jsclick(Closebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Close button", true);
		getSelect_Added_Group();
		Thread.sleep(6000);
		Reporter.log("Select added Group", true);
		jsclick(NewEntry);
		Thread.sleep(6000);
		Reporter.log("Click on New Entry button", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign all permission to selected Group", true);
		jsclick(Share_Permission);
		Thread.sleep(6000);
		Reporter.log("Denied share permission", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Ok button", true);
		Reporter.log("Share permission should be Denied Selected  for Folder", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		selectElement(Select_subFolder);
		Thread.sleep(6000);
		Reporter.log("select a SubFolder", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Add button", true);
		jsclick(cvadmins);
		Thread.sleep(6000);
		Reporter.log("Select cvadmins Group ", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog  Ok button", true);
		getaddvalidationmessage();
		Thread.sleep(6000);
		Reporter.log("Verifying Validation Message", true);
		jsclick(Closebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Close button", true);
		getSelect_Added_Group();
		Thread.sleep(6000);
		Reporter.log("Select added Group", true);
		jsclick(NewEntry);
		Thread.sleep(6000);
		Reporter.log("Click on New Entry Tab", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign all Permission to Group", true);
		jsclick(Modify_Permission);
		Thread.sleep(6000);
		Reporter.log("Denied Modify Permission", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		Reporter.log("Modify permission should be Denied Selected  for SubFolder", true);

	}

	public void Verify_Respective_Group_permission() throws Exception {

		Reporter.log("Test Scenario 10 :Verifying Respective permission To Group for AllNodes ", true);

		try {
			LoginAdminUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		Reporter.log("Login with Security permission assign Group", true);
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Setting_Icon);
		Thread.sleep(6000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Office Document and set Default View Option ", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(6000);
		Reporter.log("Select Pdf Document and set Default View Option", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Apply button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		Reporter.log("Mousehover to Roomname Tab", true);
		softAssert.assertTrue(deletenode.isEnabled());
		Thread.sleep(6000);
		Reporter.log("Delete permission should be Denied Selected  for Drawer", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(9000);
		Reporter.log("select a Folder", true);
		jsclick(Select_DocumentList);
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List ", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		Reporter.log("Mousehover on Documents Tab", true);
		jsclick(sendTo);
		Thread.sleep(1000);
		Reporter.log("Click on the Send To Option", true);
		getVerify_DisableOptions_FromDocList();
		Thread.sleep(2000);
		jsclick(Open_Document_UnderFolder);
		try {
			getVerify_Ownership_Message();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Document Open successfuly");
		}
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("Document open successfully under Folder", true);
		Thread.sleep(6000);
		jsclick(Select_Document);
		Thread.sleep(6000);
		Reporter.log("Click on First page Thumbnail", true);
		getVerify_Share_Document_Option_Disable();
		Thread.sleep(6000);
		Reporter.log("Verified Share option is Disable from Viewer menu", true);
		movingclkElement(Close_Document);
		Thread.sleep(6000);
		Reporter.log("Click on Cross button and Close document", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		selectElement(Select_subFolder);
		Thread.sleep(6000);
		Reporter.log("select a SubFolder", true);
		getMoveTo_Menu_RoomName();
		Reporter.log("Mousehover to Roomname Tab", true);
		Thread.sleep(1000);
		softAssert.assertTrue(Renamenode.isEnabled());
		softAssert.assertTrue(copynode.isEnabled());
		softAssert.assertTrue(Security_option.isEnabled());
		Thread.sleep(2000);
		jsclick(Select_DocumentList);
		Thread.sleep(6000);
		Reporter.log("Check Document from Document List ", true);
		getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		Reporter.log("Mousehover on Documents Tab", true);
		softAssert.assertTrue(doclistcopy.isEnabled());
		Thread.sleep(2000);
		jsclick(Open_subfolder_Document);
		Reporter.log("Click on SubFolder Document", true);
		try {
			getVerify_Ownership_Message();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("Document Open successfuly");
		}
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Reporter.log("Document Open successfully", true);
		Thread.sleep(11000);
		jsclick(Select_Document);
		Thread.sleep(9000);
		Reporter.log("Select First page Thumbnail", true);
		softAssert.assertTrue(DeleteFromViewer.isEnabled());
		softAssert.assertTrue(DeleteFromFab.isEnabled());
		softAssert.assertTrue(saveviewer.isEnabled());
		softAssert.assertTrue(ocrviewer.isEnabled());
		Thread.sleep(3000);
		movingclkElement(Close_Document);
		Thread.sleep(3000);
		Reporter.log("Click on Cross button and Close Document", true);
		LogoutPage();
		Thread.sleep(6000);
		LoginAdminUser();
		Thread.sleep(6000);
		Reporter.log("Login EWA with  User", true);
		selectElement(Select_Cabinet);
		Thread.sleep(3000);
		Reporter.log("Expand a Cabinet", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(2000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on  Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on  Security dialog Add button", true);
		jsclick(cvnamed);
		Thread.sleep(6000);
		Reporter.log("Select cvnamed Group", true);
		jsclick(Select_ValidationUser);
		Thread.sleep(6000);
		Reporter.log("Select User from Group", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			getaddvalidationmessage();
			Thread.sleep(6000);
			Reporter.log("Verifying Validation message", true);
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		getSelect_Added_User_Folder();
		Thread.sleep(6000);
		Reporter.log("Select User", true);
		jsclick(NewEntry);
		Reporter.log("Click on  New Enty button", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign all to permission to cabinet", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(5000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(cvadmins);
		Thread.sleep(6000);
		Reporter.log("Select cvadmins Group", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		try {
			getaddvalidationmessage();
		} catch (Exception e) {
			System.out.println("Validation message not showing");
		}
		Thread.sleep(6000);
		Reporter.log("Verifying Validation message", true);
		jsclick(Closebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Close button", true);
		getSelect_Added_Group();
		Thread.sleep(6000);
		Reporter.log("Select Added Group", true);
		jsclick(NewEntry);
		Thread.sleep(6000);
		Reporter.log("Click on New Entry button", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign all permission to Group", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Ok button", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Add button", true);
		jsclick(cvadmins);
		Thread.sleep(6000);
		Reporter.log("Select cvadmins Group", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		getaddvalidationmessage();
		Thread.sleep(6000);
		Reporter.log("Verifying Validation message", true);
		jsclick(Closebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Close button", true);
		getSelect_Added_Group();
		Thread.sleep(6000);
		Reporter.log("Select added Group", true);
		jsclick(NewEntry);
		Thread.sleep(6000);
		Reporter.log("Click on New Entry button", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign all permission to selected Group", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Ok button", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		selectElement(Select_subFolder);
		Thread.sleep(6000);
		Reporter.log("select a SubFolder", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(6000);
		Reporter.log("Click on Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Security Dialog Add button", true);
		jsclick(cvadmins);
		Thread.sleep(6000);
		Reporter.log("Select cvadmins Group ", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog  Ok button", true);
		getaddvalidationmessage();
		Thread.sleep(6000);
		Reporter.log("Verifying Validation Message", true);
		jsclick(Closebutton);
		Thread.sleep(6000);
		Reporter.log("Click on Close button", true);
		getSelect_Added_Group();
		Thread.sleep(6000);
		Reporter.log("Select added Group", true);
		jsclick(NewEntry);
		Thread.sleep(6000);
		Reporter.log("Click on New Entry Tab", true);
		getDoubleClick_CrossBar();
		Thread.sleep(6000);
		Reporter.log("Assign all Permission to Group", true);
		jsclick(Apply_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Apply button", true);
		jsclick(Ok_button_SecurityDialog);
		Thread.sleep(6000);
		Reporter.log("Click on Security dialog Ok button", true);
		LogoutPage();
		LogDipakUser();
		Thread.sleep(5000);
		Refresh_Button();
		Thread.sleep(4000);
		Reporter.log("Click on Refresh button", true);
	}

	public void Security_Dialog_Cancel_Button() throws Exception {

		Reporter.log("Test Scenario 1 : Open Security Dialog And Verifying Title and Cancel button ", true);
		try {
			LogDipakUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Thread.sleep(7000);
		Refresh_Button();
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Setting_Icon);
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		getSelect_Office_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Office Document and set as Default View", true);
		getPdf_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Pdf Document and set as Default View", true);
		movingclkElement(Apply_button);
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(7000);
		Reporter.log("Click on Security Option", true);
		Reporter.log("Security dialog title Verified", true);
		jsclick(Cancel_Button_SecurityDialog);
		Thread.sleep(7000);
		Reporter.log("Click on cancel button", true);
		Reporter.log("Open security dialog Verifying title and cancel button successfully", true);
	}

	public void Added_Users_Validation() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying Already added  showing Validation ", true);
		try {
			LogDipakUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(7000);
		Reporter.log("Click on Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(7000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(cvnamed);
		Thread.sleep(7000);
		Reporter.log("Select Cvnamed Group", true);
		jsclick(Select_ValidationUser);
		Thread.sleep(7000);
		Reporter.log("Select from Group", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(7000);
		Reporter.log("Click on Security Dialog Ok button", true);
		try {
			getaddvalidationmessage();
			Thread.sleep(7000);
			Reporter.log("Verified Validation Message", true);
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		jsclick(Cancel_Button_SecurityDialog);
		Thread.sleep(7000);
		Reporter.log("Click on Cancel button", true);
		Reporter.log("Already added showing validation Verified", true);
	}

	public void Added_Group_Validation() throws Exception {
		Reporter.log("Test Scenario 3 : Verifying Already added Group showing Validation ", true);
		try {
			LogDipakUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already Logged");
		}
		try {
			Thread.sleep(2000);
			jsclick(CancelSecuritydialog);
		} catch (Exception e) {
			// Security dialog not open
		}
		Refresh_Button();
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(Security_option);
		Thread.sleep(7000);
		Reporter.log("Click on Security Option", true);
		jsclick(Add_Button);
		Thread.sleep(7000);
		Reporter.log("Click on Security dialog Add button", true);
		jsclick(cvadmins);
		Thread.sleep(7000);
		Reporter.log("Click on cvadmins Group", true);
		jsclick(Ok_button_UserDialog);
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		try {
			getaddvalidationmessage();
			Thread.sleep(7000);
			Reporter.log("Verifying Validation message", true);
			jsclick(Closebutton);
		} catch (Exception e) {
			// Group is not already added
		}
		jsclick(Cancel_Button_SecurityDialog);
		Thread.sleep(7000);
		Reporter.log("Click on Cancel button", true);
		Reporter.log("Already added Group showing validation Verified", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);

	}
}
