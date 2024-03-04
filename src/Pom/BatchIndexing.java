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
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class BatchIndexing extends Generic.BaseClass {

	public static WebElement element = null;

	public BatchIndexing() {
		PageFactory.initElements(driver, this);

	}

	// BatchIndexing datadriven

	public String BatchIndexing_excelRead(int rowNo, int cellNo) throws Exception {

		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("BatchIndexing");
		XSSFRow row = s.getRow(rowNo);
		XSSFCell cll = row.getCell(cellNo);
		String cellType = cll.getStringCellValue();
		return cellType;
	}

	@FindBy(xpath = ("//*[@id=\"createReposFabButton\"]"))
	private WebElement BatchIndexing_MenuOption;

	public WebElement getBatchIndexing_MenuOption() {
		return BatchIndexing_MenuOption;
	}

	@FindBy(xpath = "//*[@id=\"addNewReposFileAndFolderSpan\"]")
	private WebElement Add;

	public WebElement getAdd() {
		return Add;
	}

	@FindBy(xpath = ("//*[@id=\"addReposFolderAnchor\"]"))
	private WebElement AddFolder;

	public WebElement getAddFolder() {
		return AddFolder;
	}

	@FindBy(id = ("repositoryCreateFoldLabelTxt"))
	private WebElement FolderText;

	public WebElement getFolderText() {
		return FolderText;
	}

	@FindBy(id = ("newFolderDescription"))
	private WebElement FolderDescription;

	public WebElement getFolderDescription() {
		return FolderDescription;
	}

	@FindBy(id = ("allowDeleteAtSourceFoldLevel"))
	private WebElement check1;

	public WebElement getcheck1() {
		return check1;
	}

	@FindBy(id = ("allowDeleteOnIndexFoldLevel"))
	private WebElement check2;

	public WebElement getcheck2() {
		return check2;
	}

	@FindBy(id = ("repostCreateModalOk"))
	private WebElement OkbuttonFolder;

	public WebElement getOkbuttonFolder() {
		return OkbuttonFolder;
	}

	@FindBy(css = ("#userBasedDropDownRepositoryFolders > dt"))
	private WebElement clickFolderDropdown;

	public WebElement getclickFolderDropdown() {
		return clickFolderDropdown;
	}

	@FindBy(xpath = ("//*[@id=\"spanRepositoryCheck_Batch Indexing\"]"))
	private WebElement SelectFolder;

	public WebElement getSelectFolder() {
		return SelectFolder;
	}

	@FindBy(xpath = "//input[@id='files']")
	private WebElement ChooseFile;

	public WebElement getChooseFile() {
		return ChooseFile;
	}

	@FindBy(xpath = ("(//input[@id='showThumbnailSelectToggle'])[1]"))
	private WebElement ClickShowThumbnails;

	public WebElement getClickShowThumbnails() {
		return ClickShowThumbnails;
	}

	@FindBy(xpath = ("//tbody/tr[1]/td[1]/label[1]/input[1]"))
	private WebElement SelectDoc1;

	public WebElement getSelectDoc1() {
		return SelectDoc1;
	}

	@FindBy(xpath = ("//tbody/tr[2]/td[1]/label[1]/input[1]"))
	private WebElement SelectDoc2;

	public WebElement getSelectDoc2() {
		return SelectDoc2;
	}

	@FindBy(xpath = "(//span[@id='folderDescriptionSpan'])[1]")
	private WebElement VerifyFolderDescription;

	public WebElement getVerifyFolderDescription() {
		WebElement Description = VerifyFolderDescription;
		System.out.println("File Description is:" + Description.getText());
		return VerifyFolderDescription;
	}

	@FindBy(xpath = ("(//input[@id='createAsSingleRepo'])[1]"))
	private WebElement SingleDoc;

	public WebElement getSingleDoc() {
		return SingleDoc;
	}

	@FindBy(xpath = ("(//button[normalize-space()='Index'])[1]"))
	private WebElement Indexbutton;

	public WebElement getIndexbutton() {
		return Indexbutton;
	}

	@FindBy(xpath = ("//input[@id='createDocuemtnLocation']"))
	private WebElement Destination_Folder_Textbox;

	public WebElement getDestination_Folder_Textbox() {
		return Destination_Folder_Textbox;
	}

	@FindBy(xpath = ("(//a[text()='CVApp Test'])[1]"))
	private WebElement Select_Cabinet;

	public WebElement getSelect_Cabinet() {
		return Select_Cabinet;
	}

	@FindBy(xpath = ("//a[text()='CVMobile App 2022']"))
	private WebElement Select_Drawer;

	public WebElement getSelect_Drawer() {
		return Select_Drawer;
	}

	@FindBy(xpath = ("//a[text()='Test apk']"))
	private WebElement Select_Folder;

	public WebElement getSelect_Folder() {
		return Select_Folder;
	}

	@FindBy(xpath = "//button[@id='navigatorTreeOk']")
	private WebElement OK_Button_BrowseforFolder;

	public WebElement getOK_Button_BrowseforFolder() {
		return OK_Button_BrowseforFolder;
	}

	@FindBy(id = "docTypeList")
	private WebElement Click_Document_Type_Dropdown;

	public WebElement getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;
	}

	@FindBy(id = "indices_33")
	private WebElement Enter_Report_Name_Text;

	public WebElement getEnter_Report_Name_Text() {
		return Enter_Report_Name_Text;
	}

	@FindBy(xpath = "//button[@id='createDocumentSubmit']")
	private WebElement Create_Button;

	public WebElement getCreate_Button() {
		return Create_Button;

	}

	@FindBy(xpath = "//button[@id='viewCreatedDocument']")
	private WebElement View_Button;

	public WebElement getView_Button() {
		return View_Button;

	}

	@FindBy(linkText = "Show Thumbnails")
	private WebElement showThumbnailoption;

	public WebElement getshowThumbnailoption() {
		return showThumbnailoption;

	}

	@FindBy(linkText = "Delete")
	private WebElement DeleteDoc;

	public WebElement getDeleteDoc() {
		return DeleteDoc;

	}

	@FindBy(linkText = "Settings")
	private WebElement settingoption;

	public WebElement getsettingoption() {
		return settingoption;

	}

	@FindBy(id = "allowDeleteAtSource")
	private WebElement Deletesourceoption;

	public WebElement getDeletesource_Option(WebDriver driver) {
		if (Deletesourceoption.isSelected() == true) {
			jsclick(Deletesourceoption);
		}
		return Deletesourceoption;
	}

	@FindBy(id = "allowDeleteOnIndex")
	private WebElement allowDeleteOnIndex;

	public WebElement getallowDeleteOnIndex_Option(WebDriver driver) {
		if (allowDeleteOnIndex.isSelected() == false) {
			jsclick(allowDeleteOnIndex);
		}
		return allowDeleteOnIndex;
	}

	@FindBy(id = "repostSettingsModalOk")
	private WebElement repostSettingsModalOk;

	public WebElement getrepostSettingsModalOk() {
		return repostSettingsModalOk;

	}

	@FindBy(xpath = "(//button[@id='repostModalCancel'])[1]")
	private WebElement CloseButton;

	public WebElement getCloseButton() {
		return CloseButton;

	}

	@FindBy(linkText = "Share Permission")
	private WebElement sharePermission;

	public WebElement getsharePermission() {
		return sharePermission;
	}

	@FindBy(xpath = "//*[contains(text(),'ram')]")
	private WebElement SelectUser;

	public WebElement getSelectUser() {
		WebElement user = SelectUser;
		if (user.isSelected()) {
			Reporter.log("user already selected");
		} else {
			jsclick(user);
		}
		return SelectUser;
	}

	@FindBy(xpath = "//*[@id=\"assignSharePermission\"]")
	private WebElement assign;

	public WebElement getassign() {
		return assign;
	}

	public void login_Assign_User() throws Exception {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(BatchIndexing_excelRead(4, 1));
		driver.findElement(By.id("loginPassword")).sendKeys(BatchIndexing_excelRead(5, 1));
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

	@FindBy(id = "logedinusername")
	private WebElement Username;

	public WebElement getUsername() {
		return Username;
	}

	@FindBy(linkText = "Logout")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}

	@FindBy(id = "revokeSharePermission")
	private WebElement Revoke;

	public WebElement getRevoke() {
		return Revoke;
	}

	@FindBy(xpath = "//*[@id=\"homeMenuBtn\"]/img")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
	}

	@FindBy(xpath = "//button[@id='repostCreateModalCancel']")
	private WebElement Cancelbutton;

	public WebElement getCancelbutton() {
		return Cancelbutton;
	}

	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement FolderOK;

	public WebElement getFolderOK() {
		return FolderOK;
	}

	@FindBy(xpath = "//a[@id='documentListSubMenu']")
	private WebElement MoveTo_Cross;

	public WebElement getMoveTo_Cross() {
		element = MoveTo_Cross;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		return MoveTo_Cross;
	}

	@FindBy(xpath = "//span[@class='e-input-group-icon e-ddl-icon']")
	private WebElement clickdropdown;

	public WebElement getclickdropdown() {
		return clickdropdown;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Foldernamevalidation;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement Ok;

	public WebElement getFoldernamevalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Failed to authenticate user";
		String actualtext = Foldernamevalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(Foldernamevalidation.getText());
		jsclick(Ok);
		return Foldernamevalidation;
	}

	@FindBy(css = ".e-multi-select-wrapper")
	private WebElement Alluser;

	public WebElement getAlluser() {
		return Alluser;
	}

	@FindBy(css = (".e-selectall-parent .e-frame"))
	private WebElement Selectcheckbox;

	public WebElement getSelectcheckbox() {
		return Selectcheckbox;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Uservalidation;

	public WebElement getUservalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please select a user to assign permission";
		String actualtext = Uservalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(Uservalidation.getText());
		jsclick(Ok);
		return Uservalidation;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Revokeuservalidation;

	public WebElement getRevokeuservalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Selected folder is not shared to any user";
		String actualtext = Revokeuservalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(Revokeuservalidation.getText());
		jsclick(Ok);
		return Revokeuservalidation;
	}
}
