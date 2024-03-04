package Pom;

//Dipak Automation script
import java.io.File;
import java.io.FileInputStream;
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
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Security extends Generic.BaseClass {

	private static final boolean False = false;
	public static WebElement element = null;

	public Security() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "security")
	private WebElement Security_option;

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

	@FindBy(xpath = "//a[text()='Dipak Automation']")
	private WebElement Select_Folder;

	public WebElement getSelect_Folder() {
		return Select_Folder;
	}

	@FindBy(xpath = "//a[text()='Dipak Automation subfolder']")
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

	@FindBy(xpath = ("//a[text()='Dipak Automation']"))
	private WebElement Select_Folder1;

	public WebElement getSelect_Folder1() {
		return Select_Folder1;

	}

	@FindBy(xpath = "//*[@id=\"menu-content\"]/li[3]/a/span/img")
	private WebElement cvnamed;

	@FindBy(id = "securityAdd")
	private WebElement Add_Button;

	@FindBy(xpath = "(//a[normalize-space()='dipak'])[1]")
	private WebElement Select_User;

	@FindBy(xpath = "//button[@id='selectedUsersAndGroups']")
	private WebElement Ok_button_UserDialog;

	@FindBy(id = "applySecurity")
	private WebElement Apply_button_SecurityDialog;

	@FindBy(id = "securityUpdate")
	private WebElement Ok_button_SecurityDialog;

	@FindBy(xpath = "//button[@id='securityRemove']")
	private WebElement Remove_Button;

	@FindBy(xpath = "//button[@id='cancelSecurity']")
	private WebElement Cancel_Button_SecurityDialog;

	@FindBy(xpath = "//span[@id='navigatorModelClose36']")
	private WebElement Cross_Button_SecurityDialog;

	@FindBy(id = "resetSecurity")
	private WebElement Reset_Button_SecurityDialog;

	@FindBy(id = "resetNo")
	private WebElement No_Button_Securitypopup;

	@FindBy(id = "resetYes")
	private WebElement Yes_Button_Securitypopup;

	@FindBy(id = "imgDelete")
	private WebElement Delete_Permission;

	@FindBy(id = "imgShare")
	private WebElement Share_Permission;

	@FindBy(id = "imgModify")
	private WebElement Modify_Permission;

	@FindBy(id = "logedinusername")
	private WebElement Username;

	@FindBy(linkText = "Logout")
	private WebElement Logout;

	@FindBy(xpath = "//button[@id='ownershipMessageModelOk']")
	private WebElement View_WorkflowDoc;

	@FindBy(id = "navigationMenuBtn")
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

	public WebElement getSelect_User() {
		return Select_User;
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

	public WebElement getMoveTo_Menu_RoomName() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_RoomName).perform();
		return MoveTo_Menu_RoomName;
	}

	@FindBy(xpath = "//h2[@id='securityModal']")
	private WebElement titelvalidation;

	public WebElement gettitelvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Permissions for Node: Test apk";
		String actualtext = titelvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return titelvalidation;
	}

	@FindBy(id = "imgAssign")
	private WebElement DoubleClick_CrossBar;

	public WebElement getDoubleClick_CrossBar() {
		Actions builder = new Actions(driver);
		builder.doubleClick(DoubleClick_CrossBar).perform();
		return DoubleClick_CrossBar;
	}

	@FindBy(id = "pUserList")
	private WebElement Select_Added_User;
	@FindBy(xpath = "//li[normalize-space()='dipak']")
	private WebElement Click_User;

	public WebElement getSelect_Added_User() throws Exception {
		jsclick(Select_Added_User);
		Select_Added_User.sendKeys(Security_excelRead(2, 0));
		Thread.sleep(4000);
		jsclick(Click_User);
		return element;
	}

	public void login_Admin1_User() throws Exception {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(Security_excelRead(1, 0));
		driver.findElement(By.id("loginPassword")).sendKeys(Security_excelRead(1, 1));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText((readFromExLogin(1, 2)));
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Login button clicked successfully", true);
		try {
			WebElement sessionmsgYes = driver.findElement(By.xpath(" //button[@id='cvModelLoginValidationOk']"));
			sessionmsgYes.click();
			Thread.sleep(6000);
		} catch (Exception e) {
			// Session message is not displayed
		}
	}

	public static void Verify_AsperModifyPermission_Rename_Security_Option_Disable() throws InterruptedException {
		WebElement Rename = driver.findElement(By.id("renameNodeAnchor"));
		if (Rename.isEnabled() == False)
			;
		WebElement Security = driver.findElement(By.id("security"));
		if (Security.isEnabled() == False)
			;
	}

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document_UnderFolder;

	public WebElement getOpen_Document_UnderFolder() {
		jsclick(Open_Document_UnderFolder);
		return Open_Document_UnderFolder;
	}

	@FindBy(xpath = "//input[@class='thumbnailOptionSelected']")
	private WebElement Select_Document;

	public WebElement getSelect_Document() {
		jsclick(Select_Document);
		return Select_Document;
	}

	@FindBy(css = ".thumbnailOptionSelected")
	private WebElement Verify_Share_Document_Option_Disable;

	public WebElement getVerify_Share_Document_Option_Disable() {
		if (Verify_Share_Document_Option_Disable.isEnabled() == False)
			;
		return Verify_Share_Document_Option_Disable;
	}

	@FindBy(css = "#cvDocumentClose > .icon")
	private WebElement Close_Document;

	public WebElement getClose_Document() {
		jsclick(Close_Document);
		return Close_Document;
	}

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_subfolder_Document;

	public WebElement getOpen_subfolder_Document() {
		jsclick(Open_subfolder_Document);
		return Open_subfolder_Document;
	}

	public static void Verify_Delete_Option_Disable() throws InterruptedException {

		Boolean Delete1 = driver.findElement(By.cssSelector("#fileControl_delete > .icon")).isEnabled();
		if (Delete1) {
			System.out.println("Delete option is Disable");
		} else {
			System.out.println("Delete option is Enable");
		}

		Boolean Delete2 = driver.findElement(By.id("deleteFabButton")).isEnabled();
		if (Delete2) {
			System.out.println("Delete option from button is Disable");
		} else {
			System.out.println("Delete option from button is Enable");
		}

	}

	@FindBy(id = "pUserList")
	private WebElement Select_Added_User_Folder;
	@FindBy(xpath = "//li[normalize-space()='dipak']")
	private WebElement Click_UserFolder;

	public WebElement getSelect_Added_User_Folder() throws Exception {
		jsclick(Select_Added_User_Folder);
		Select_Added_User_Folder.sendKeys(Security_excelRead(2, 0));
		jsclick(Click_UserFolder);
		return Select_Added_User_Folder;
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

	@FindBy(xpath = "//div[@id='homeMenuBtn']")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
	}

	@FindBy(id = "imgSettings")
	private WebElement Setting_Icon;

	public WebElement getSetting_Icon() {
		return Setting_Icon;
	}

	@FindBy(css = "#myPreferencesSettingsNav > p")
	private WebElement My_Preferencesetting;

	public WebElement getMy_Preferencesetting() {
		return My_Preferencesetting;
	}

	@FindBy(xpath = "//button[@id='myPreferencesSubmit']")
	private WebElement Apply_button;

	public WebElement getApply_button() {
		return Apply_button;
	}

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Defaultviewing;

	public WebElement getSelect_Office_document_Defaultviewing() {
		Select sel = new Select(Select_Office_document_Defaultviewing);
		sel.selectByVisibleText("Default viewing");
		return Select_Office_document_Defaultviewing;
	}

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Defaultviewing;

	public WebElement getPdf_document_Defaultviewing() {
		Select drop = new Select(Pdf_document_Defaultviewing);
		drop.selectByVisibleText("Default viewing");
		return Pdf_document_Defaultviewing;
	}

	@FindBy(xpath = "//*[@id=\"menu-content\"]/li[2]")
	private WebElement cvadmins;

	public WebElement getcvadmins() {
		return cvadmins;
	}

	@FindBy(xpath = "//*[@id=\"existingEntryAlert\"]/p")
	private WebElement Groupaddvalidation;

	public WebElement getaddvalidationmessage() {
		System.out.println(Groupaddvalidation.getText());
		return Groupaddvalidation;
	}

	@FindBy(xpath = "//*[@id=\"closeGroupUserModal\"]")
	private WebElement Closebutton;

	public WebElement getClosebutton() {
		return Closebutton;
	}

	@FindBy(id = "pUserList")
	private WebElement Select_Added_Group;
	@FindBy(xpath = "//li[normalize-space()='cvadmins']")
	private WebElement Click_Group;

	public WebElement getSelect_Added_Group() throws Exception {
		jsclick(Select_Added_Group);
		Select_Added_Group.sendKeys(Security_excelRead(3, 0));
		jsclick(Click_Group);
		return Select_Added_Group;
	}

	@FindBy(xpath = "//*[@id=\"newEntry\"]")
	private WebElement NewEntry;

	public WebElement getNewEntry() {
		return NewEntry;
	}

	public void login_Added_GroupUser() throws Exception {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(Security_excelRead(2, 0));
		driver.findElement(By.id("loginPassword")).sendKeys(Security_excelRead(1, 1));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(readFromExLogin(1, 2));
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Login button clicked successfully", true);
		try {
			WebElement sessionmsgYes = driver.findElement(By.xpath(" //button[@id='cvModelLoginValidationOk']"));
			sessionmsgYes.click();
			Thread.sleep(6000);
		} catch (Exception e) {
			// Session message is not displayed
		}
	}

	@FindBy(id = "deleteNodeAnchor")
	private WebElement Verify_Delete_option;

	public WebElement getVerify_Delete_option() throws Exception {
		Boolean ele = Verify_Delete_option.isDisplayed();
		if (ele) {
			System.out.println(" Delete option is Disable");
		} else {
			System.out.println(" Delete option is Enable");
		}
		return Verify_Delete_option;

	}

	@FindBy(xpath = "//*[@id=\"cvnamed\"]/li[2]")
	private WebElement Select_ValidationUser;

	public WebElement getSelect_ValidationUser() {
		return Select_ValidationUser;
	}

}
