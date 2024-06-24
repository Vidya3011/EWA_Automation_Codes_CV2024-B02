package Pom;

//Dipak Automation script
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
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

	@FindBy(xpath = "//*[@id=\"security\"]")
	private WebElement Security_option;

	// Enter Username in Searchbox or Select user from cvnamed
	@FindBy(xpath = "//*[@id=\"pUserList\"]")
	private WebElement Select_Added_User;
	@FindBy(xpath = "//li[normalize-space()='dipak']") // here you can enter your user instaed "dipak"
	private WebElement Click_User;

	public void getSelect_Added_User() throws Exception {
		jsclick(Select_Added_User);
		Select_Added_User.sendKeys(Security_excelRead(1, 0));
		Thread.sleep(4000);
		jsclick(Click_User);
	}

	// Select From Document Navigator

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	public WebElement getSelect_Cabinet() {
		return Select_Cabinet;
	}

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	public WebElement getSelect_Drawer() {
		return Select_Drawer;
	}

	@FindBy(xpath = (".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	public WebElement getSelect_Folder() {
		return Select_Folder;

	}

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_subFolder;

	public WebElement getSelect_subFolder() {
		return Select_subFolder;
	}
	// Select from Destination folder Location

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet1;

	public WebElement getSelect_Cabinet1() {
		return Select_Cabinet1;

	}

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer1;

	public WebElement getSelect_Drawer1() {
		return Select_Drawer1;

	}

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder1;

	public WebElement getSelect_Folder1() {
		return Select_Folder1;

	}

	@FindBy(xpath = "//*[@id=\"menu-content\"]/li[3]/a/span/img")
	private WebElement cvnamed;

	@FindBy(xpath = "//*[@id=\"securityAdd\"]")
	private WebElement Add_Button;

	@FindBy(xpath = "//*[@id=\"selectedUsersAndGroups\"]")
	private WebElement Ok_button_UserDialog;

	@FindBy(xpath = "//*[@id=\"applySecurity\"]")
	private WebElement Apply_button_SecurityDialog;

	@FindBy(xpath = "//*[@id=\"securityUpdate\"]")
	private WebElement Ok_button_SecurityDialog;

	@FindBy(xpath = "//*[@id=\"securityRemove\"]")
	private WebElement Remove_Button;

	@FindBy(xpath = "//*[@id=\"cancelSecurity\"]")
	private WebElement Cancel_Button_SecurityDialog;

	@FindBy(xpath = "//*[@id=\"navigatorModelClose36\"]")
	private WebElement Cross_Button_SecurityDialog;

	@FindBy(xpath = "//*[@id=\"resetSecurity\"]")
	private WebElement Reset_Button_SecurityDialog;

	@FindBy(xpath = "//*[@id=\"resetNo\"]")
	private WebElement No_Button_Securitypopup;

	@FindBy(xpath = "//*[@id=\"resetYes\"]")
	private WebElement Yes_Button_Securitypopup;

	@FindBy(xpath = "//*[@id=\"imgDelete\"]")
	private WebElement Delete_Permission;

	@FindBy(xpath = "//*[@id=\"imgShare\"]")
	private WebElement Share_Permission;

	@FindBy(xpath = "//*[@id=\"imgModify\"]")
	private WebElement Modify_Permission;

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Username;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Logout;

	@FindBy(xpath = "//button[@id='ownershipMessageModelOk']")
	private WebElement View_WorkflowDoc;

	@FindBy(xpath = "//*[@id=\"navigationMenuBtn\"]")
	private WebElement MoveTo_Menu_RoomName;

	public static boolean isFalse() {
		return False;
	}

	public static WebElement getElement() {
		return element;
	}

	public WebElement getSecurity_option() {
		return Security_option;
	}

	public WebElement getCvnamed() {
		return cvnamed;
	}

	public WebElement getAdd_Button() {
		return Add_Button;
	}

	public WebElement getClick_User() {
		return Click_User;
	}

	public WebElement getOk_button_UserDialog() {
		return Ok_button_UserDialog;
	}

	public WebElement getApply_button_SecurityDialog() {
		return Apply_button_SecurityDialog;
	}

	public WebElement getOk_button_SecurityDialog() {
		return Ok_button_SecurityDialog;
	}

	public WebElement getRemove_Button() {
		return Remove_Button;
	}

	public WebElement getCancel_Button_SecurityDialog() {
		return Cancel_Button_SecurityDialog;
	}

	public WebElement getCross_Button_SecurityDialog() {
		return Cross_Button_SecurityDialog;
	}

	public WebElement getReset_Button_SecurityDialog() {
		return Reset_Button_SecurityDialog;
	}

	public WebElement getNo_Button_Securitypopup() {
		return No_Button_Securitypopup;
	}

	public WebElement getYes_Button_Securitypopup() {
		return Yes_Button_Securitypopup;
	}

	public WebElement getDelete_Permission() {
		return Delete_Permission;
	}

	public WebElement getShare_Permission() {
		return Share_Permission;
	}

	public WebElement getModify_Permission() {
		return Modify_Permission;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getLogout() {
		return Logout;
	}

	public WebElement getView_WorkflowDoc() {
		return View_WorkflowDoc;
	}

	public void getMoveTo_Menu_RoomName() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_RoomName).perform();

	}

	@FindBy(xpath = "//*[@id=\"imgAssign\"]")
	private WebElement DoubleClick_CrossBar;

	public void getDoubleClick_CrossBar() {
		Actions builder = new Actions(driver);
		builder.doubleClick(DoubleClick_CrossBar).perform();

	}

	public void login_Admin1_User() throws Exception {
		driver.findElement(LoginUsername).sendKeys(Security_excelRead(2, 0));
		Reporter.log("Enter valid admin username into username field", true);
		driver.findElement(Password).sendKeys(Security_excelRead(1, 1));
		Reporter.log("Enter valid admin user password into password field", true);
		WebElement room = driver.findElement(Room);
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		Reporter.log("Select a Room", true);
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(Captch_Image);
			WebElement enterCaptch = driver.findElement(Enter_Captch_textbox);
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(Login_button).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(2000);
		try {
			WebElement sessionmsg = driver.findElement(session_message);
			WebElement sessionmsgYes = driver.findElement(session_message_Yes);
			Reporter.log(sessionmsg.getText() +  "this message is displayed", true);
			Thread.sleep(2000);
			sessionmsgYes.click();
			Thread.sleep(2000);
			Reporter.log("Click on the Yes button", true);

		} catch (Exception e1) {
			// Session message is not displayed
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public static void Verify_AsperModifyPermission_Rename_Security_Option_Disable() throws InterruptedException {
		WebElement Rename = driver.findElement(By.xpath("//*[@id=\"renameNodeAnchor\"]"));
		if (Rename.isEnabled() == False)
			;
		WebElement Security = driver.findElement(By.xpath("//*[@id=\"security\"]"));
		if (Security.isEnabled() == False)
			;
	}

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document_UnderFolder;

	public void getOpen_Document_UnderFolder() {
		jsclick(Open_Document_UnderFolder);

	}

	@FindBy(xpath = "//input[@class='thumbnailOptionSelected']")
	private WebElement Select_Document;

	public void getSelect_Document() {
		jsclick(Select_Document);

	}

	@FindBy(xpath = "//*[@id=\"fileControl_sendTo\"]")
	private WebElement Verify_Share_Document_Option_Disable;

	public void getVerify_Share_Document_Option_Disable() {
		if (Verify_Share_Document_Option_Disable.isEnabled() == False)
			;

	}

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement Close_Document;

	public void getClose_Document() {
		jsclick(Close_Document);

	}

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_subfolder_Document;

	public void getOpen_subfolder_Document() {
		jsclick(Open_subfolder_Document);

	}

	public static void Verify_Delete_Option_Disable() throws InterruptedException {

		Boolean Delete1 = driver.findElement(By.xpath("//*[@id=\"fileControl_delete\"]")).isEnabled();
		if (Delete1) {
			Reporter.log("Delete option is Disable");
		} else {
			Reporter.log("Delete option is Enable");
		}

		Boolean Delete2 = driver.findElement(By.id("deleteFabButton")).isEnabled();
		if (Delete2) {
			Reporter.log("Delete option from button is Disable");
		} else {
			Reporter.log("Delete option from button is Enable");
		}

	}

	@FindBy(xpath = "//*[@id=\"pUserList\"]")
	private WebElement Select_Added_User_Folder;

	public void getSelect_Added_User_Folder() throws Exception {
		Thread.sleep(3000);
		jsclick(Select_Added_User_Folder);
		Select_Added_User_Folder.sendKeys(Security_excelRead(1, 0));
		jsclick(Click_User);

	}

	// Datadriven Security
	public static String Security_excelRead(int rowNo, int cellNo) throws Exception {
		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet s = wb.getSheet("Security");
			XSSFRow row = s.getRow(rowNo);
			XSSFCell cll = row.getCell(cellNo);
			String cellType = cll.getStringCellValue();
			return cellType;
		}
	}

	@FindBy(xpath = "//*[@id=\"homeMenuBtn\"]")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;

	}

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	public WebElement getSetting_Icon() {
		return Setting_Icon;
	}

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

	public WebElement getMy_Preferencesetting() {
		return My_Preferencesetting;
	}

	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	public WebElement getApply_button() {
		return Apply_button;
	}

	@FindBy(xpath = "//*[@id=\"defaultOfficeDocViewListNo\"]")
	private WebElement Select_Office_document_Defaultviewing;

	public void getSelect_Office_document_Defaultviewing() {
		Select sel = new Select(Select_Office_document_Defaultviewing);
		sel.selectByVisibleText("Default viewing");

	}

	@FindBy(xpath = "//*[@id=\"defaultPdfDocViewListNo\"]")
	private WebElement Pdf_document_Defaultviewing;

	public void getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		drop.selectByVisibleText("Default viewing");

	}

	@FindBy(xpath = "//*[@id=\"menu-content\"]/li[2]")
	private WebElement cvadmins;

	public WebElement getcvadmins() {
		return cvadmins;
	}

	@FindBy(xpath = "//*[@id=\"existingEntryAlert\"]/p")
	private WebElement Groupaddvalidation;

	public void getaddvalidationmessage() {
		Reporter.log(Groupaddvalidation.getText() + " this validation message should show", true);

	}

	@FindBy(xpath = "//*[@id=\"closeGroupUserModal\"]")
	private WebElement Closebutton;

	public WebElement getClosebutton() {
		return Closebutton;
	}

	@FindBy(xpath = "//*[@id=\"pUserList\"]")
	private WebElement Select_Added_Group;
	@FindBy(xpath = "//*[@id=\"permissionList\"]/li[1]") 
	private WebElement Click_Group;

	public void getSelect_Added_Group() throws Exception {
		jsclick(Select_Added_Group);
		Select_Added_Group.sendKeys(Security_excelRead(3, 0));
		jsclick(Click_Group);

	}

	@FindBy(xpath = "//*[@id=\"newEntry\"]")
	private WebElement NewEntry;

	public WebElement getNewEntry() {
		return NewEntry;
	}

	public void login_Added_GroupUser() throws Exception {

		driver.findElement(LoginUsername).sendKeys(Security_excelRead(1, 0));
		Reporter.log("Enter valid groupuser permission assign username into username field", true);
		driver.findElement(Password).sendKeys(Security_excelRead(1, 1));
		Reporter.log("Enter valid group user permission assign user password into password field", true);
		WebElement room = driver.findElement(Room);
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		Thread.sleep(2000);
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(Captch_Image);
			WebElement enterCaptch = driver.findElement(Enter_Captch_textbox);
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(Login_button).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(2000);
		try {
			WebElement sessionmsg = driver.findElement(session_message);
			WebElement sessionmsgYes = driver.findElement(session_message_Yes);
			Reporter.log(sessionmsg.getText() +  "this message is displayed", true);
			Thread.sleep(2000);
			sessionmsgYes.click();
			Thread.sleep(2000);
			Reporter.log("Click on the Yes button", true);

		} catch (Exception e1) {
			// Session message is not displayed
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	@FindBy(xpath = "//*[@id=\"fileControl_deleteMobile\"]")
	private WebElement Verify_Delete_option;

	public void getVerify_Delete_option() throws Exception {
		Boolean ele = Verify_Delete_option.isDisplayed();
		if (ele) {
			Reporter.log(" Delete option is Disable");
		} else {
			Reporter.log(" Delete option is Enable");
		}

	}

	@FindBy(xpath = "//*[@id=\"cvnamed\"]/li[1]")
	private WebElement Select_ValidationUser;

	public WebElement getSelect_ValidationUser() {
		return Select_ValidationUser;
	}

	@FindBy(xpath = "//*[@id=\"recentMenuBtn\"]")
	private WebElement MoveTo_Menu_Recent;

	public void getMoveTo_Menu_Recent() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_Recent).perform();

	}

	@FindBy(xpath = "//*[@id=\"recentFolders\"]/tbody/tr[1]/td")
	private WebElement Recent_Folder;

	public WebElement get_clickRecent_Folder() {
		return Recent_Folder;
	}
	
	static By LoginUsername = By.xpath("//*[@id=\"userName\"]");
	static By Password = By.xpath("//*[@id=\"loginPassword\"]");
	static By Room = By.xpath("//*[@id=\"rooms\"]");
	static By Captch_Image = By.xpath("//*[@id=\"image\"]");
	static By Enter_Captch_textbox = By.xpath("//*[@id=\"captchaInput\"]");
	static By Login_button = By.xpath("//*[@id=\"submitid\"]");
	static By session_message = By.xpath("//*[@id=\"cvModelLoginValidationMessage\"]");
	static By session_message_Yes = By.xpath("//*[@id=\"cvModelLoginValidationOk\"]");
	static By session_message_No = By.xpath("//*[@id=\"cvModelLoginValidationCancel\"]");
}
