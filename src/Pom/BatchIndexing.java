package Pom;

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

public class BatchIndexing extends Generic.BaseClass {

	public BatchIndexing() {
		PageFactory.initElements(driver, this);

	}

	// BatchIndexing datadriven

	public String BatchIndexing_excelRead(int rowNo, int cellNo) throws Exception {

		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet s = wb.getSheet("BatchIndexing");
			XSSFRow row = s.getRow(rowNo);
			XSSFCell cll = row.getCell(cellNo);
			String cellType = cll.getStringCellValue();
			return cellType;
		}
	}

	@FindBy(xpath = "//*[@id=\"createReposFabButton\"]/img")
	private WebElement BatchIndexing_MenuOption;

	public WebElement getBatchIndexing_MenuOption() {
		return BatchIndexing_MenuOption;

	}

	@FindBy(xpath = "//*[@id=\"addNewReposFileAndFolderSpan\"]")
	private WebElement Add;

	public WebElement getAdd() {
		return Add;
	}

	@FindBy(xpath = "//*[@id=\"addReposFolderAnchor\"]")
	private WebElement AddFolder;

	public WebElement getAddFolder() {
		return AddFolder;
	}

	@FindBy(xpath = "//*[@id=\"repositoryCreateFoldLabelTxt\"]")
	private WebElement FolderText;

	public WebElement getFolderText() {
		return FolderText;
	}

	@FindBy(xpath = "//*[@id=\"newFolderDescription\"]")
	private WebElement FolderDescription;

	public WebElement getFolderDescription() {
		return FolderDescription;
	}

	@FindBy(xpath = "//*[@id=\"allowDeleteAtSourceFoldLevel\"]")
	private WebElement check1;

	public WebElement getcheck1() {
		return check1;
	}

	@FindBy(xpath = "//*[@id=\"allowDeleteOnIndexFoldLevel\"]")
	private WebElement check2;

	public WebElement getcheck2() {
		return check2;
	}

	@FindBy(xpath = "//*[@id=\"repostCreateModalOk\"]")
	private WebElement OkbuttonFolder;

	public WebElement getOkbuttonFolder() {
		return OkbuttonFolder;
	}

	@FindBy(xpath = "//*[@id=\"userBasedDropDownRepositoryFolders\"]")
	private WebElement clickFolderDropdown;

	public WebElement getclickFolderDropdown() {
		return clickFolderDropdown;
	}

	@FindBy(xpath = ("//*[@id=\"spanRepositoryCheck_Batch Indexing\"]"))
	private WebElement SelectFolder;

	public WebElement getSelectFolder() {
		return SelectFolder;
	}

	@FindBy(xpath = "//*[@id=\"files\"]")
	private WebElement ChooseFile;

	public WebElement getChooseFile() {
		return ChooseFile;
	}

	@FindBy(xpath = "//*[@id=\"showThumbnailSelectToggle\"]")
	private WebElement ClickShowThumbnails;

	public WebElement getClickShowThumbnails() {
		return ClickShowThumbnails;
	}

	@FindBy(xpath = "//*[@id=\"repositoryFileListTable\"]/tbody/tr[1]/td[1]/label/input")
	private WebElement SelectDoc1;

	public WebElement getSelectDoc1() {
		return SelectDoc1;
	}

	@FindBy(xpath = "//*[@id=\"repositoryFileListTable\"]/tbody/tr[2]/td[1]/label/input")
	private WebElement SelectDoc2;

	public WebElement getSelectDoc2() {
		return SelectDoc2;
	}

	@FindBy(xpath = "(//*[@id='folderDescriptionSpan'])[1]")
	private WebElement VerifyFolderDescription;

	public void getVerifyFolderDescription() {
		WebElement Description = VerifyFolderDescription;
		Reporter.log("File Description is:" + Description.getText() + "this message should show", true);

	}

	@FindBy(xpath = "//*[@id=\"createAsSingleRepo\"]")
	private WebElement SingleDoc;

	public WebElement getSingleDoc() {
		return SingleDoc;
	}

	@FindBy(xpath = "//*[@id=\"repostModalIndex\"]")
	private WebElement Indexbutton;

	public WebElement getIndexbutton() {
		return Indexbutton;
	}

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	public WebElement getDestination_Folder_Textbox() {
		return Destination_Folder_Textbox;
	}

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet;

	public WebElement getSelect_Cabinet() {
		return Select_Cabinet;

	}

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer;

	public WebElement getSelect_Drawer() {
		return Select_Drawer;

	}

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	public WebElement getSelect_Folder() {
		return Select_Folder;

	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	public WebElement getOK_Button_BrowseforFolder() {
		return OK_Button_BrowseforFolder;
	}

	@FindBy(xpath = "//*[@id=\"docTypeList\"]")
	private WebElement Click_Document_Type_Dropdown;

	public WebElement getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;

	}

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_Report_Name_Text;

	public WebElement getEnter_Report_Name_Text() {
		return Enter_Report_Name_Text;
	}

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Create_Button;

	public WebElement getCreate_Button() {
		return Create_Button;

	}

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement View_Button;

	public WebElement getView_Button() {
		return View_Button;

	}

	@FindBy(xpath = "//*[@id=\"settingsBtnShowThumbnail\"]/a")
	private WebElement showThumbnailoption;

	public WebElement getshowThumbnailoption() {
		return showThumbnailoption;

	}

	@FindBy(xpath = "//*[@id=\"deleteBtnReposFolder\"]")
	private WebElement DeleteDoc;

	public WebElement getDeleteDoc() {
		return DeleteDoc;

	}

	@FindBy(xpath = "//*[@id=\"settingsBtnReposFolder\"]")
	private WebElement settingoption;

	public WebElement getsettingoption() {
		return settingoption;

	}

	@FindBy(xpath = "//*[@id=\"allowDeleteAtSource\"]")
	private WebElement Deletesourceoption;

	public WebElement getDeletesource_Option() {
		if (Deletesourceoption.isSelected() == true) {
			jsclick(Deletesourceoption);
		}
		return Deletesourceoption;
	}

	@FindBy(xpath = "//*[@id=\"allowDeleteOnIndex\"]")
	private WebElement allowDeleteOnIndex;

	public void getallowDeleteOnIndex_Option() {
		if (allowDeleteOnIndex.isSelected() == false) {
			jsclick(allowDeleteOnIndex);
		}

	}

	@FindBy(xpath = "//*[@id=\"repostSettingsModalOk\"]")
	private WebElement repostSettingsModalOk;

	public WebElement getrepostSettingsModalOk() {
		return repostSettingsModalOk;

	}

	@FindBy(xpath = "//*[@id=\"repostSettingsModalCancel\"]")
	private WebElement CloseButton;

	public WebElement getCloseButton() {
		return CloseButton;

	}

	@FindBy(xpath = "//*[@id=\"shareBtnReposFolder\"]/a")
	private WebElement sharePermission;

	public WebElement getsharePermission() {
		return sharePermission;
	}

	@FindBy(xpath = "//*[@id=\"assignSharePermission\"]")
	private WebElement assign;

	public WebElement getassign() {
		return assign;
	}

	public void login_Assign_User() throws Exception {

		driver.findElement(LoginUsername).sendKeys(BatchIndexing_excelRead(1, 0));
		Reporter.log("Enter valid batch Indexing permission assign username into username field", true);
		driver.findElement(Password).sendKeys(BatchIndexing_excelRead(1, 1));
		Reporter.log("Enter valid batch Indexing permission assign User password into password field", true);
		WebElement room = driver.findElement(Room);
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		Reporter.log("Select a room", true);
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

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Username;

	public WebElement getUsername() {
		return Username;
	}

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}

	@FindBy(xpath = "//*[@id=\"revokeSharePermission\"]")
	private WebElement Revoke;

	public WebElement getRevoke() {
		return Revoke;
	}

	@FindBy(xpath = "//*[@id=\"homeMenuBtn\"]/img")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
	}

	@FindBy(xpath = "//*[@id=\"repostCreateModalCancel\"]")
	private WebElement Cancelbutton;

	public WebElement getCancelbutton() {
		return Cancelbutton;
	}

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement FolderOK;

	public WebElement getFolderOK() {
		return FolderOK;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Foldernamevalidation;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement Ok;

	public void getFoldernamevalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Failed to authenticate user";
		String actualtext = Foldernamevalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(Foldernamevalidation.getText() + " this validation message should show", true);
		jsclick(Ok);

	}

	@FindBy(xpath = "//*[@id=\"reposAllUsersDiv\"]/div/div")
	private WebElement Alluser;

	public WebElement getAlluser() {
		return Alluser;
	}

	@FindBy(xpath = ("//*[@id=\"reposAllUsersDiv\"]/div"))
	private WebElement Selectcheckbox;

	public WebElement getSelectcheckbox() {
		return Selectcheckbox;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Uservalidation;

	public void getUservalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please select a user to assign permission";
		String actualtext = Uservalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(Uservalidation.getText() + " this validation message should show", true);
		jsclick(Ok);

	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Revokeuservalidation;

	public void getRevokeuservalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Selected folder is not shared to any user";
		String actualtext = Revokeuservalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(Revokeuservalidation.getText() + " this validation message should show", true);
		jsclick(Ok);

	}

	// Here Select User for Assign Permission.

	@FindBy(xpath = "//*[@class=\"e-content e-dropdownbase\"]/ul/li[4]")
	private WebElement AssignUser;

	public WebElement getSelectrAssignUser() {
		return AssignUser;

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
