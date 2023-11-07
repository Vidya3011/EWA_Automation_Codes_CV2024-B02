package Pom;

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
	
	@FindBy(xpath = ".//*[@id='viewDocumentnavigator']/ul/li/a")
	private WebElement Select_Cabinet;
	
	@FindBy(xpath = ".//*[@id='viewDocumentnavigator']/ul/li/ul/li")
	private WebElement Select_Drawer;
	
	@FindBy(xpath = ".//*[@id='viewDocumentnavigator']/ul/li/ul/li/ul/li/a")
	private WebElement Select_Folder;
	
	@FindBy(css = ".collapsed:nth-child(1) span > img")
	private WebElement cvnamed;
	
	@FindBy(id = "securityAdd")
	private WebElement Add_Button;

	@FindBy(linkText = "ram")
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
	
	@FindBy(xpath = ".//*[@id='viewDocumentnavigator']/ul/li/ul/li/ul/li/ul/li/a")
	private WebElement Select_SubFolder;

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

	public WebElement getSelect_Cabinet() {
		return Select_Cabinet;
	}

	public WebElement getSelect_Drawer() {
		return Select_Drawer;
	}

	public WebElement getSelect_Folder() {
		return Select_Folder;
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

	public WebElement getSelect_SubFolder() {
		return Select_SubFolder;
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
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[31]/div[1]/div[2]/div[1]/div[1]/li[12]")
	private WebElement Click_User;
	public WebElement getSelect_Added_User() throws Exception {
		jsclick(Select_Added_User);
		Select_Added_User.sendKeys(Security_excelRead(1, 0));
		jsclick(Click_User);
		return Select_Added_User;
	}
	
	
	public static void login_Added_User() throws Exception {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(Security_excelRead(1, 0));
		driver.findElement(By.id("loginPassword")).sendKeys(Security_excelRead(1, 1));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		a1 = new Actions(driver);
		a1.moveToElement(room).click().build().perform();
		WebElement ro = driver.findElement(By.xpath("//option[text()= 'CVWin19Server.Win2019_TestRoom']"));
		ro.click();
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
		if (Rename.isEnabled() == False);
		WebElement Security = driver.findElement(By.id("security"));
		if (Security.isEnabled() == False);
	}

	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement Open_Document_UnderFolder;
	public WebElement getOpen_Document_UnderFolder() {
		jsclick(Open_Document_UnderFolder);
		return Open_Document_UnderFolder;
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[59]/div[7]/div[4]/div[1]/div[1]/input[1]")
	private WebElement Select_Document;
	public WebElement getSelect_Document() {
		jsclick(Select_Document);
		return Select_Document;
	}
	
	@FindBy(css = ".thumbnailOptionSelected")
	private WebElement Verify_Share_Document_Option_Disable;
	public WebElement getVerify_Share_Document_Option_Disable() {
		if(Verify_Share_Document_Option_Disable.isEnabled()==False);
		return Verify_Share_Document_Option_Disable;
	}
	
	@FindBy(css = "#cvDocumentClose > .icon")
	private WebElement Close_Document;
	public WebElement getClose_Document() {
		jsclick(Close_Document);
		return Close_Document;
	}
	
	@FindBy(css = ".even:nth-child(4) > .customDocName")
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
	@FindBy(xpath = "/html[1]/body[1]/div[56]/div[31]/div[1]/div[2]/div[1]/div[1]/li[13]")
	private WebElement Click_UserFolder;
	public WebElement getSelect_Added_User_Folder() throws Exception {
		jsclick(Select_Added_User_Folder);
		Select_Added_User_Folder.sendKeys(Security_excelRead(1, 0));
		jsclick(Click_UserFolder);
		return Select_Added_User_Folder;
	}
	
	//  Datadriven Security
	public static String Security_excelRead(int rowNo, int cellNo) throws Exception {
		File src = new File("C:\\Users\\dipak.p\\eclipse-workspace\\Contentverse\\data\\TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("Security");
		XSSFRow row = s.getRow(rowNo);
		XSSFCell cll = row.getCell(cellNo);
		String cellType = cll.getStringCellValue();
		return cellType;
	}
}
