package Pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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

import com.google.common.collect.Table.Cell;

import Generic.BaseClass;

public class Language extends BaseClass {

	public static WebElement element = null;
	private static final boolean False = false;

	public Language() {
		PageFactory.initElements(driver, this);

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

	@FindBy(xpath = "//*[@id=\"locale\"]/a[1]")
	private WebElement English_Language;

	public WebElement getEnglish_Language() {
		return English_Language;
	}

	@FindBy(xpath = "//*[@id=\"locale\"]/a[2]")
	private WebElement Spanish_Language;

	public WebElement getSpanish_Language() {
		return Spanish_Language;
	}

	@FindBy(xpath = "//*[@id=\"locale\"]/a[3]")
	private WebElement French_Language;

	public WebElement getFrench_Language() {
		return French_Language;
	}

	@FindBy(xpath = "//*[@id=\"locale\"]/a[4]")
	private WebElement Dutch_Language;

	public WebElement getDutch_Language() {
		return Dutch_Language;
	}

	@FindBy(xpath = "//*[@id=\"locale\"]/a[5]")
	private WebElement Hindi_Language;

	public WebElement getHindi_Language() {
		return Hindi_Language;
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

	@FindBy(xpath = "//*[@id=\"homeMenuBtn\"]")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
	}

	// ****************Login Validation*********//

	static By LoginUsername = By.xpath("//*[@id=\"userName\"]");
	static By Password = By.xpath("//*[@id=\"loginPassword\"]");
	static By Room = By.xpath("//*[@id=\"rooms\"]");
	static By Captch_Image = By.xpath("//*[@id=\"image\"]");
	static By Enter_Captch_textbox = By.xpath("//*[@id=\"captchaInput\"]");
	static By Login_button = By.xpath("//*[@id=\"submitid\"]");
	static By session_message = By.xpath("//*[@id=\"cvModelLoginValidationMessage\"]");
	static By session_message_Yes = By.xpath("//*[@id=\"cvModelLoginValidationOk\"]");
	static By session_message_No = By.xpath("//*[@id=\"cvModelLoginValidationCancel\"]");

	public void loginwithoutUsername() throws Exception {
		Reporter.log("Do not entered username into username field", true);
		driver.findElement(Password).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
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
			Reporter.log(sessionmsg.getText() + "this message is displayed", true);
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

	public void loginwithoutPassword() throws Exception {

		driver.findElement(LoginUsername).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		driver.findElement(Password).clear();
		Reporter.log("Do not entered password into password field", true);
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
			Reporter.log(sessionmsg.getText() + "this message is displayed", true);
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

	public void loginwithoutRoomname() throws Exception {

		driver.findElement(LoginUsername).clear();
		driver.findElement(LoginUsername).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		driver.findElement(Password).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
		WebElement room = driver.findElement(Room);
		Select sel = new Select(room);
		sel.selectByIndex(0);
		Reporter.log("Select Please select a room Option", true);
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
			Reporter.log(sessionmsg.getText() + "this message is displayed", true);
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

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[1]/div[1]/div[2]")
	private WebElement Usernameerror;

	public void getUsernameerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "!Please enter username";
		String actualtext = Usernameerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(Usernameerror.getText() + " validation message should show", true);

	}

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[1]/div[2]/div[2]")
	private WebElement Passworderror;

	public void getPassworderror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "!Please enter password";
		String actualtext = Passworderror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(Passworderror.getText() + " validation message should show", true);

	}

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement Roomerror;

	public void getRoomerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Select a room";
		String actualtext = Roomerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(Roomerror.getText() + " validation message should show when none of above room selected for Login",
				true);

	}

	public void InvalidUsername() throws Exception {

		driver.findElement(LoginUsername).clear();
		driver.findElement(LoginUsername).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter Invalid Username into Username field", true);
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
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
			Reporter.log(sessionmsg.getText() + "this message is displayed", true);
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

	public void InvalidPassword() throws Exception {

		driver.findElement(LoginUsername).clear();
		driver.findElement(LoginUsername).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter Invalid Password into Password field", true);
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
			Reporter.log(sessionmsg.getText() + "this message is displayed", true);
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

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement Usernotexist;

	public void getUsernotexist() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "User does not exist";
		String actualtext = Usernotexist.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(Usernotexist.getText() + " validation message should show", true);

	}

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement Invalidpassword;

	public void getInvalidpassword() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Failed to authenticate user";
		String actualtext = Invalidpassword.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(Invalidpassword.getText() + " validation message should show", true);

	}

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/h3")
	private WebElement MyaccountText;

	public void French_Myaccount_Text_Laguage() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "Mon compte";
		String actualtext2 = MyaccountText.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		Reporter.log("Change Laguage in French and My Account Text is: " + MyaccountText.getText(), true);

	}

	public void Dutch_Myaccount_Text_Laguage() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "Mijn rekening";
		String actualtext2 = MyaccountText.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		Reporter.log("Change Laguage in Dutch and My Account Text is: " + MyaccountText.getText(), true);

	}

	public void Hindi_Myaccount_Text_Laguage() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "मेरा खाता";
		String actualtext2 = MyaccountText.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		Reporter.log("Change Laguage in Hindi and My Account Text is: " + MyaccountText.getText(), true);

	}

	public void English_Myaccount_Text_Laguage() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "My Account";
		String actualtext2 = MyaccountText.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		Reporter.log("Change Laguage in English and My Account Text is: " + MyaccountText.getText(), true);

	}

	public void Spanish_Myaccount_Text_Laguage() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "Mi cuenta";
		String actualtext2 = MyaccountText.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		Reporter.log("Change Laguage in spanish and My Account Text is : " + MyaccountText.getText(), true);

	}

	// Spanish Language

	@FindBy(xpath = ("//*[@id=\"createDocument\"]"))
	private WebElement NewDocuments_MenuOption;

	public WebElement getNewDocuments_MenuOption() {
		return NewDocuments_MenuOption;
	}

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	public WebElement getDestination_Folder_Textbox() {
		return Destination_Folder_Textbox;
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

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	public WebElement getMove_To_PlusIcon() {
		WebElement ele = Move_To_PlusIcon;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return ele;
	}

	@FindBy(xpath = "//*[@id=\"viewDocumentAddPages\"]")
	private WebElement Browse_Option;

	public void getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);

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

	@FindBy(xpath = "//*[@id=\"fileInfoButton\"]/span")
	private WebElement Click_FileInfo_Option;

	public void getClick_FileInfo_Option() {
		WebElement ele = Click_FileInfo_Option;
		ele.click();

	}

	@FindBy(xpath = "//*[@id=\"fileNameLabel\"]")
	private WebElement Click_FileInfo_OkButton_withFileName;
	@FindBy(xpath = "//*[@id=\"fileRenameOK\"]")
	private WebElement RemarkOk;

	public void getClick_FileInfo_OkButton_withFileName() {
		WebElement Filename = Click_FileInfo_OkButton_withFileName;
		Reporter.log("File name is:" + Filename.getText(), true);
		WebElement ele = RemarkOk;
		ele.click();

	}
	// Language datadriven

	public String Language_excelRead(int rowNo, int cellNo) throws Exception {

		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet s = wb.getSheet("Language");
			XSSFRow row = s.getRow(rowNo);
			XSSFCell cll = row.getCell(cellNo);
			String cellType = cll.getStringCellValue();
			return cellType;
		}
	}

	@FindBy(xpath = "//*[@id=\"btnSignatureAdd\"]/span[1]")
	private WebElement Click_signature_Menuoption;

	public WebElement getClick_signature_Menuoption() throws Exception {
		return Click_signature_Menuoption;
	}

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement Add_Signature_Onpage;

	public void getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Signature_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();

	}

	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;
	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;

	public void getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys(Language_excelRead(2, 1));
		jsclick(verifypassok);

	}

	@FindBy(css = "//*[@id=\"menuDropDownButton\"]/span")
	private WebElement Move_to_Annotation_Option_inViewer;

	public void getMove_to_Annotation_Option_inViewer() throws Exception {
		WebElement ele = Move_to_Annotation_Option_inViewer;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

	}

	@FindBy(xpath = "//*[@id=\"lockenable1\"]")
	private WebElement Redaction_Option;

	public void getRedaction_Option() throws Exception {
		WebElement ele1 = Redaction_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(xpath = ("//*[@id=\"imageViewerDiv\"]/div[2]/canvas"))
	private WebElement Page;

	@FindBy(xpath = ("//*[@id=\"fabButton\"]"))
	private WebElement fabbtn;

	@FindBy(xpath = "//*[@id=\"objectName\"]")
	private WebElement objectname;
	@FindBy(xpath = "//*[@id=\"dlgInput_Input\"]")
	private WebElement input;
	@FindBy(xpath = "//*[@id=\"objectConfirmPassword\"]")
	private WebElement confirmpassword;
	@FindBy(xpath = "//*[@id=\"dlgInput_Apply\"]")
	private WebElement Apply;

	public void getSet_Redaction_ToDocument() throws Exception {

		Actions act = new Actions(driver);
		act.click(Redaction_Option).clickAndHold(Page).moveToElement(fabbtn).release().build().perform();
		Thread.sleep(3000);
		objectname.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(input);
		Thread.sleep(2000);
		input.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(2000);
		jsclick(confirmpassword);
		Thread.sleep(2000);
		confirmpassword.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(Apply);

	}

	@FindBy(xpath = "//*[@id=\"rubberBandInteractiveMode_shortcut\"]/span")
	private WebElement ClickOCR;

	public WebElement getClickOCR() throws Exception {
		return ClickOCR;
	}

	public void getSet_OCR_ToDocument() throws Exception {

		Actions action = new Actions(driver);
		WebElement element = Page;
		action.dragAndDropBy(element, -300, -20).build().perform();
		jsclick(Page);

	}

	@FindBy(xpath = "//*[@id=\"viewerZoomId\"]")
	private WebElement Select_Dropdown_Actual_Size;

	public void getSelect_Dropdown_Actual_Size() {
		Select sel = new Select(Select_Dropdown_Actual_Size);
		sel.selectByVisibleText("Actual Size");

	}

	public void getSet_OCR_ToDocumentPDF() throws Exception {

		Actions action = new Actions(driver);
		WebElement element = Page;
		action.dragAndDropBy(element, -150, -20).build().perform();
		jsclick(Page);

	}

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement Save_button;

	public WebElement getSave_button() {
		return Save_button;
	}

	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement DocumentSave_Ok_button;

	public WebElement getDocumentSave_Ok_button() {
		return DocumentSave_Ok_button;

	}

	@FindBy(linkText = "actualizar")
	private WebElement UpdateSpanish_Button;

	public WebElement getUpdateSpanish_Button() {
		return UpdateSpanish_Button;
	}

	@FindBy(linkText = "salvar")
	private WebElement SpanishSave_UpdateButton;

	public WebElement getSpanishSave_UpdateButton() {
		return SpanishSave_UpdateButton;
	}

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement SpanishUpdate_Ok_button;

	public WebElement getSpanishUpdate_Ok_button() {
		return SpanishUpdate_Ok_button;
	}

	@FindBy(xpath = "//span[normalize-space()='PROPIEDADES']")
	private WebElement SpanishProperties_option;

	public WebElement getSpanishProperties_option() {
		return SpanishProperties_option;
	}

	@FindBy(linkText = "ReportName")
	private WebElement ReportName;

	public WebElement getReportName() {
		return ReportName;

	}

	@FindBy(xpath = "//*[@id=\"showHideThumbnail\"]/span")
	private WebElement showHideThumbnail;

	public WebElement getshowHideThumbnail() {
		return showHideThumbnail;
	}

	@FindBy(xpath = "//*[@id=\"documentTemplates\"]")
	private WebElement Templates_MenuOption;

	public WebElement getTemplates_MenuOption() {
		return Templates_MenuOption;
	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeCancle\"]")
	private WebElement Cancel_Button_BrowseforFolder;

	public WebElement getCancel_Button_BrowseforFolder() {
		return Cancel_Button_BrowseforFolder;
	}

	@FindBy(xpath = "//*[@id=\"createTemplateBtn\"]")
	private WebElement Save_Template_Button;

	public WebElement getSave_Template_Button() {
		return Save_Template_Button;
	}

	@FindBy(xpath = "//*[@id=\"createTemplateCancel\"]")
	private WebElement Template_Description_No_button;

	public WebElement getTemplate_Description_No_button() {
		return Template_Description_No_button;
	}

	@FindBy(xpath = "//*[@id=\"templateName\"]")
	private WebElement Template_NameTextbox;

	public WebElement getTemplate_NameTextbox() {
		return Template_NameTextbox;
	}

	public void getTemplate_NameTextboxvalue() throws Exception {
		Template_NameTextbox.sendKeys(Language_excelRead(1, 2));

	}

	@FindBy(xpath = "//*[@id=\"templateDescription\"]")
	private WebElement Template_Description_Messagebox;

	public WebElement getTemplate_Description_Messagebox() {
		return Template_Description_Messagebox;
	}

	public void getTemplate_Description_Messageboxvalue() throws Exception {
		Template_Description_Messagebox.sendKeys(Language_excelRead(2, 2));

	}

	@FindBy(xpath = "//*[@id=\"createTemplateOk\"]")
	private WebElement Template_Description_OK_button;

	public WebElement getTemplate_Description_OK_button() {
		return Template_Description_OK_button;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Template_Created_Message_Verify;

	public void getTemplate_Created_Message_Verify() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Template Created Successfully!";
		String actualtext = Template_Created_Message_Verify.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement Template_Created_OK_button;

	public WebElement getTemplate_Created_OK_button() {
		return Template_Created_OK_button;
	}

	@FindBy(xpath = "//*[@id=\"documentTemplates\"]")
	private WebElement Moveto_Templates_Option;;

	public void getMoveto_Templates_Option() {
		WebElement ele = Moveto_Templates_Option;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();

	}

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Select_ReportName_Test;

	public WebElement getSelect_ReportName_Test() {
		return Select_ReportName_Test;
	}

	public void getSelect_ReportName_Testvalue() throws Exception {
		Select_ReportName_Test.sendKeys(Language_excelRead(3, 2));

	}

	@FindBy(id = "Template_Automation1")
	private WebElement Select_Created_Template;

	public WebElement getSelect_Created_Template() {
		return Select_Created_Template;
	}

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Created_button;

	public WebElement getCreated_button() {
		return Created_button;
	}

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_button;

	public WebElement getNavigate_button() {
		return Navigate_button;
	}

	@FindBy(xpath = "//*[@id=\"editTemplate1\"]")
	private WebElement Click_Edit_Template_Button;

	public WebElement getClick_Edit_Template_Button() {
		return Click_Edit_Template_Button;
	}

	@FindBy(xpath = "//*[@id=\"editTemplateDescription\"]")
	private WebElement EditTemplate_Description_Messagebox;

	public WebElement getEditTemplate_Description_Messagebox() {
		return EditTemplate_Description_Messagebox;
	}

	public void getEditTemplate_Description_Messageboxvalue() throws Exception {
		EditTemplate_Description_Messagebox.sendKeys(Language_excelRead(4, 2));

	}

	@FindBy(xpath = "//*[@id=\"editTemplateOk\"]")
	private WebElement EditTemplate_Description_OK_button;

	public WebElement getEditTemplate_Description_OK_button() {
		return EditTemplate_Description_OK_button;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement EditTemplate_Created_Message_Verify;

	public void getEditTemplate_Created_Message_Verify() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Template Edited Successfully!";
		String actualtext = EditTemplate_Created_Message_Verify.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement EditTemplate_Created_OK_button;

	public WebElement getEditTemplate_Created_OK_button() {
		return EditTemplate_Created_OK_button;
	}

	@FindBy(xpath = "//*[@id=\"delTemp\"]")
	private WebElement Delete_Template_Button;

	public WebElement getDelete_Template_Button() {
		return Delete_Template_Button;
	}

	@FindBy(xpath = "//*[@id=\"deleteTemplateOk\"]")
	private WebElement Delete_Template_OK_Button;

	public WebElement getDelete_Template_OK_Button() {
		return Delete_Template_OK_Button;
	}

	@FindBy(xpath = "//*[@id=\"editTemplateCancel\"]")
	private WebElement EditTemplate_Description_No_button;

	public WebElement getEditTemplate_Description_No_button() {
		return EditTemplate_Description_No_button;
	}

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Advancedviewing;

	public void getSelect_Office_document_Advancedviewing() {
		Select sel = new Select(Select_Office_document_Advancedviewing);
		sel.selectByVisibleText("Advanced viewing");

	}

	// New Word Document

	@FindBy(xpath = ("//*[@id=\"addWordFile\"]"))
	private WebElement New_Word_Document_Option;

	public void getNew_Word_Document_Option() {
		WebElement ele1 = New_Word_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_Word_File_Name;
	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement TemplateOK;

	public void getEnter_Word_File_Name() throws Exception {
		WebElement ele = Enter_Word_File_Name;
		ele.sendKeys(Language_excelRead(5, 2));
		TemplateOK.click();

	}

	// New Excel Spreadsheet

	@FindBy(xpath = "//*[@id=\"addExcelFile\"]")
	private WebElement New_Excel_Spreadsheet_Option;

	public void getNew_Excel_Spreadsheet_Option() {
		WebElement ele1 = New_Excel_Spreadsheet_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_Excel_File_Name;

	public void getEnter_Excel_File_Name() throws Exception {
		WebElement ele1 = Enter_Excel_File_Name;
		ele1.sendKeys(Language_excelRead(6, 2));
		TemplateOK.click();

	}

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Advancedviewing;

	public void getPdf_document_Advancedviewing() {
		Select drop = new Select(Pdf_document_Advancedviewing);
		drop.selectByVisibleText("Advanced viewing");

	}

	@FindBy(xpath = "//*[@id=\"addPdfFile\"]")
	private WebElement New_pdf_Document_Option;

	public void getNew_pdf_Document_Option() {
		WebElement ele1 = New_pdf_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(xpath = "//*[@id=\"newTemplateFileName\"]")
	private WebElement Enter_pdf_File_Name;
	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement TempOK;

	public void getEnter_pdf_File_Name() throws Exception {
		WebElement ele1 = Enter_pdf_File_Name;
		ele1.sendKeys(Language_excelRead(7, 2));
		Thread.sleep(3000);
		TempOK.click();

	}

	@FindBy(xpath = "//span[@id='pdfViewerDiv_formdesignerIcon']")
	private WebElement pdfViewer;

	public WebElement getpdfViewer() {
		return pdfViewer;
	}

	@FindBy(xpath = "//*[@id=\"pdfViewerDiv_formdesigner_textbox\"]")
	private WebElement Textbox;

	public WebElement getTextbox() {
		return Textbox;
	}

	@FindBy(css = "#pdfViewerDiv_textLayer_0")
	private WebElement Add_Textbox_Onpage;

	public WebElement getAdd_Textbox_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Textbox_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();
		return Add_Textbox_Onpage;
	}

	@FindBy(xpath = "//*[@id=\"formMapper\"]")
	private WebElement Click_Formmapper;

	public WebElement getClick_Formmapper() throws Exception {
		return Click_Formmapper;
	}

	@FindBy(xpath = "//select[@id='formField1']")
	private WebElement Select_Formfield;

	public void getSelect_Formfield() {
		Select sel = new Select(Select_Formfield);
		sel.selectByVisibleText("Textbox1");

	}

	@FindBy(xpath = "//button[@id='setFormMapping']")
	private WebElement FormOK;

	public WebElement getFormOK() {
		return FormOK;
	}

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Verify_DuplicateTemp_Message;

	public void getVerify_DuplicateTemp_Message() {
		WebElement Message = Verify_DuplicateTemp_Message;
		Reporter.log(Message.getText(), true);

	}

	@FindBy(xpath = "//button[@id='messageButtonOK']")
	private WebElement Okbutton;

	public WebElement getOkbutton() {
		return Okbutton;
	}

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	public WebElement getNobutton() {
		return Nobutton;
	}

	@FindBy(xpath = "//*[@id=\"commentMessage\"]")
	private WebElement FolderSelectMessage;
	@FindBy(xpath = "//*[@id=\"CommentsMessageModelOk\"]")
	private WebElement CommentOK;

	public void getFolderSelectMessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please select a folder to create document";
		String actualtext = FolderSelectMessage.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(FolderSelectMessage.getText(), true);
		jsclick(CommentOK);

	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement addpagesMessage;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement CommentOKbutton;

	public void getFolder_ErrorMessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please add pages to the template before creating!";
		String actualtext = addpagesMessage.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(addpagesMessage.getText(), true);
		jsclick(CommentOKbutton);

	}

	@FindBy(xpath = "//*[@id=\"saveTemplate\"]")
	private WebElement savetemp;

	public WebElement getsavetemp() {
		return savetemp;
	}

	@FindBy(xpath = "//*[@id=\"createDocumentClear\"]")
	private WebElement ClearButton;

	public WebElement getClearButton() {
		return ClearButton;
	}

	@FindBy(xpath = "//*[@id=\"templateErr\"]")
	private WebElement validationerror;

	public void getvalidationerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "*Template name should be specified.";
		String actualtext = validationerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(validationerror.getText(), true);

	}

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Createdoc;

	public WebElement getCreatedoc() {
		return Createdoc;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Reportvaluevalidationerror;

	public void getReportvaluevalidationerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "ReportName*  	field is required";
		String actualtext = Reportvaluevalidationerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(Reportvaluevalidationerror.getText(), true);
		jsclick(CommentOKbutton);

	}

	@FindBy(xpath = "//*[@id=\"Word document automation.docx\"]/div/img")
	private WebElement Open_Word_page;

	public WebElement getOpen_Word_page() throws Exception {
		return Open_Word_page;
	}

	@FindBy(xpath = "//*[@id=\"Excel document automation.xlsx\"]/div/img")
	private WebElement Open_Excel_page;

	public WebElement getOpen_Excel_page() throws Exception {
		return Open_Excel_page;
	}

	@FindBy(xpath = "//*[@id=\"templateOK\"]")
	private WebElement OKButton;

	public WebElement getOKButton() {
		return OKButton;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Filenamevalidation;

	public void getFilenamevalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter file name ";
		String actualtext = Filenamevalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(Filenamevalidation.getText(), true);
		jsclick(CommentOKbutton);

	}

	@FindBy(xpath = "//*[@id=\"createDocumentMessage\"]")
	private WebElement NavigateDoc;
	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement NavigateButton;

	public void getNavigateDoc() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Document created successfully";
		String actualtext = NavigateDoc.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log(NavigateDoc.getText(), true);
		jsclick(NavigateButton);

	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Formmappingvalidation;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement FormOKbutton;

	public void getFormmappingvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please add form fields before mapping.";
		String actualtext = Formmappingvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log(Formmappingvalidation.getText(), true);
		jsclick(FormOKbutton);

	}

	// Load More count

	@FindBy(xpath = "//*[@id=\"loadmorecount\"]")
	private WebElement Enter_Loadmorecount;

	public void getEnter_Loadmorecount() throws Exception {
		WebElement ele = Enter_Loadmorecount;
		ele.clear();
		ele.sendKeys(CountexcelRead(1, 4));

	}

	@FindBy(xpath = "//span[@id='totalSearchCount']")
	private WebElement Verify_Loadmorecount_Searchresult;

	public void getVerify_Loadmorecount_Searchresult() throws Exception {
		WebElement count = Verify_Loadmorecount_Searchresult;
		Reporter.log("The " + count.getText());

	}

	@FindBy(xpath = "//strong[@id='docCount']")
	private WebElement Verify_Loadmorecount_Document_Folder;

	public void getVerify_Loadmorecount_Document_Folder() throws Exception {
		WebElement DocDisplay = Verify_Loadmorecount_Document_Folder;
		Reporter.log("Verify and " + DocDisplay.getText());

	}

	@FindBy(xpath = "//*[@id=\"loadMoreDocList\"]/button")
	private WebElement Loadmorebutton;

	public WebElement getLoadmorebutton() throws Exception {
		return Loadmorebutton;

	}

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement Click_Search_Option;

	public WebElement getClick_Search_Option() {
		return Click_Search_Option;
	}

	@FindBy(xpath = "//*[@id=\"advFindBtnLabel\"]")
	private WebElement Find_Button;

	public WebElement getFind_Button() {
		return Find_Button;
	}

	// Custom Columns

	@FindBy(xpath = "//*[@id=\"CustomList\"]")
	private WebElement CustomColumnOption;

	public WebElement getCustomColumnOption() {
		return CustomColumnOption;
	}

	@FindBy(xpath = "//*[@id=\"todoAll\"]")
	private WebElement Select_All_Item;

	@FindBy(xpath = "//*[@id=\"todoResetColumns\"]")
	private WebElement To_Do_Resetcolumn_Option;

	@FindBy(xpath = "//*[@id=\"resetColumsOk\"]")
	private WebElement ToDoList_Reset_Column_OK_Button;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Text key\"]")
	private WebElement Select_Indices01;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Numeric 123\"]")
	private WebElement Select_Indices02;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Date 123\"]")
	private WebElement Select_Indices03;

	@FindBy(xpath = "//*[@id=\"setCustomListdropdown\"]")
	private WebElement Click_DropdownOption;

	@FindBy(xpath = "//*[@id=\"roomLevel\"]")
	private WebElement Set_RoomLevel_Indices;

	@FindBy(xpath = "//*[@id=\"Resetcolumns\"]")
	private WebElement Reset_Column_option;

	@FindBy(xpath = "//*[@id=\"resetColumsOk\"]")
	private WebElement ResetColumn_popup_OK_button;

	@FindBy(xpath = "//*[@id=\"culstomcolsearch\"]")
	private WebElement Search_Custom_Columns_option;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Document Size\"]")
	private WebElement Search_Select_Indices01;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Student Name\"]")
	private WebElement Search_Select_Indices02;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_ReportName\"]")
	private WebElement Search_Select_Indices03;

	@FindBy(xpath = "//*[@id=\"Defaultcolsearch\"]")
	private WebElement Click_ResetColumn;

	@FindBy(xpath = "//*[@id=\"resetColumsOk\"]")
	private WebElement Ok_Button_ResetColumn;

	@FindBy(xpath = "//*[@id=\"todoCustomColumns\"]")
	private WebElement ToDoList_Custom_Columns_option;

	@FindBy(xpath = "//*[@id=\"navigationMenuBtn\"]")
	private WebElement MoveTo_Menu_RoomName;

	public static WebElement getElement() {
		return element;
	}

	public WebElement getSelect_All_Item() {
		return Select_All_Item;
	}

	public WebElement getTo_Do_Resetcolumn_Option() {
		return To_Do_Resetcolumn_Option;
	}

	public WebElement getToDoList_Reset_Column_OK_Button() {
		return ToDoList_Reset_Column_OK_Button;
	}

	public WebElement getSelect_Indices01() {
		return Select_Indices01;
	}

	public WebElement getSelect_Indices02() {
		return Select_Indices02;
	}

	public WebElement getSelect_Indices03() {
		return Select_Indices03;
	}

	public WebElement getClick_DropdownOption() {
		return Click_DropdownOption;
	}

	public WebElement getSet_RoomLevel_Indices() {
		return Set_RoomLevel_Indices;
	}

	public WebElement getReset_Column_option() {
		return Reset_Column_option;
	}

	public WebElement getResetColumn_popup_OK_button() {
		return ResetColumn_popup_OK_button;
	}

	public WebElement getSearch_Custom_Columns_option() {
		return Search_Custom_Columns_option;
	}

	public WebElement getSearch_Select_Indices01() {
		return Search_Select_Indices01;
	}

	public WebElement getSearch_Select_Indices02() {
		return Search_Select_Indices02;
	}

	public WebElement getSearch_Select_Indices03() {
		return Search_Select_Indices03;
	}

	public WebElement getClick_ResetColumn() {
		return Click_ResetColumn;
	}

	public WebElement getOk_Button_ResetColumn() {
		return Ok_Button_ResetColumn;
	}

	public WebElement getToDoList_Custom_Columns_option() {
		return ToDoList_Custom_Columns_option;
	}

	public WebElement getTitelvalidation() {
		return titelvalidation;
	}

	public WebElement getTextlvalidation() {
		return textlvalidation;
	}

	public WebElement getTextlvalidation2() {
		return textlvalidation2;
	}

	public static WebElement getEle() {
		return ele;
	}

	public WebElement getDefault_Button_CustomList() {
		return Default_Button_CustomList;
	}

	public WebElement getCancel_Button_CustomList() {
		return Cancel_Button_CustomList;
	}

	public WebElement getMoveTo_Search_Option() {
		return MoveTo_Search_Option;
	}

	public WebElement getSearch_Ok_Button_CustomList() {
		return Search_Ok_Button_CustomList;
	}

	public WebElement getMoveTo_ToDoList_Option() {
		return MoveTo_ToDoList_Option;
	}

	public static WebElement getToDoList_Ok_Button_CustomList() {
		return ToDoList_Ok_Button_CustomList;
	}

	public WebElement getMoveTo_Menu_RoomName() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_RoomName).perform();
		return MoveTo_Menu_RoomName;
	}

	@FindBy(xpath = "//*[@id=\"CustomUserTitle\"]/h2")
	private WebElement titelvalidation;

	public void gettitelvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = titelvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"setCustomListlabel\"]")
	private WebElement textlvalidation;
	@FindBy(xpath = "//*[@id=\"tittleofcustom\"]/h2")
	private WebElement textlvalidation2;

	public void getextvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Set custom columns";
		String actualtext = textlvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		String expectedtext2 = "Select the indices you want display for documents";
		String actualtext2 = textlvalidation2.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement ele;

	public void Ok_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);

	}

	@FindBy(xpath = "//th[contains(text(),'DATE 123')]")
	private static WebElement DATE;
	@FindBy(xpath = "//th[contains(text(),'NUMERIC 123')]")
	private static WebElement NUMERIC;
	@FindBy(xpath = "//th[contains(text(),'TEXT KEY')]")
	private static WebElement TEXT;

	public void Verify_Indicess_Value() throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "DATE 123";
		String actualtext = DATE.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log("Indices01 value displayed successfully" + DATE.getText(), true);
		Thread.sleep(4000);
		String expectedtext1 = "NUMERIC 123";
		String actualtext1 = NUMERIC.getAttribute("value");
		softassert.assertEquals(actualtext1, expectedtext1, "Text verification failed");
		Reporter.log("Indices02 value displayed successfully" + NUMERIC.getText(), true);
		Thread.sleep(4000);
		String expectedtext2 = "TEXT KEY";
		String actualtext2 = TEXT.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		Reporter.log("Indices03 value displayed successfully" + TEXT.getText(), true);

	}

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement Default_Button_CustomList;

	public static void Default_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Default_Button_CustomList);

	}

	@FindBy(xpath = "//*[@id=\"CustomListCancel\"]")
	private static WebElement Cancel_Button_CustomList;

	public static void Cancel_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Cancel_Button_CustomList);

	}

	public void Select_DropdownValue() {
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"setCustomListdropdown\"]"));
		jsclick(dropdown.findElement(By.xpath("//*[@id=\"roomLevel\"]")));

	}

	public void Verify_CompactView_checkbox() {
		if (driver.findElement(By.id("displayCompactViewOfList")).isSelected() == true) {
			jsclick(driver.findElement(By.id("displayCompactViewOfList")));
		}

	}

	// Search *

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement MoveTo_Search_Option;

	public void MoveTo_Search_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Search_Option).perform();

	}

	@FindBy(xpath = "//*[@id=\"CustomUserTitle\"]/h2")
	private WebElement Search_titelvalidation;

	public void getSearch_titelvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = Search_titelvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"tittleofcustom\"]/h2")
	private WebElement Search_textvalidation;

	public void getSearch_textvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Select the indices you want display for documents";
		String actualtext = Search_textvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"CustomListOK\"]")
	private static WebElement Search_Ok_Button_CustomList;

	public static void Search_Ok_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Search_Ok_Button_CustomList);

	}

	@FindBy(xpath = "//th[contains(text(),'DOCUMENT SIZE')]")
	private static WebElement DocumentSize;
	@FindBy(xpath = "//th[contains(text(),'CURRENT DATE')]")
	private static WebElement Currentdate;
	@FindBy(xpath = "//th[contains(text(),'REPORTNAME')]")
	private static WebElement REPORTNAME;

	public void Search_Verify_Indicess_Value4() throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "DOCUMENT SIZE";
		String actualtext = DocumentSize.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log("Indices value displayed successfully" + DocumentSize.getText(), true);

	}

	public void Search_Verify_Indicess_Value5() throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "CURRENT DATE";
		String actualtext = Currentdate.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log("Indices value displayed successfully" + Currentdate.getText(), true);

	}

	public void Search_Verify_Indicess_Value6() throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "REPORTNAME";
		String actualtext = REPORTNAME.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log("Indices value displayed successfully" + REPORTNAME.getText(), true);

	}

	// ToDoList *

	@FindBy(xpath = "//*[@id=\"myTaskMenu\"]")
	private WebElement MoveTo_ToDoList_Option;

	public void MoveTo_ToDoList_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_ToDoList_Option).perform();

	}

	@FindBy(xpath = "//*[@id=\"CustomUserTitleToDoList\"]/h2")
	private static WebElement titlevalidation;

	public void ToDoList_titelvalidation() {

		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = titlevalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"tittleoftodoListcustom\"]/h2")
	private static WebElement textvalidation;

	public void ToDoList_textvalidation() {

		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Select the indices you want display for documents";
		String actualtext = textvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"CustomListTodoOK\"]")
	private static WebElement ToDoList_Ok_Button_CustomList;

	public static void ToDoList_Ok_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ToDoList_Ok_Button_CustomList);

	}

	@FindBy(xpath = "//*[@id=\"folderLocationForSearch\"]")
	private static WebElement Document_Location;

	public WebElement getDocument_Location() throws InterruptedException {
		return Document_Location;

	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk1\"]")
	private static WebElement Ok_button;

	public WebElement getOk_button() throws InterruptedException {
		return Ok_button;

	}

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	public void getMoveTo_Menu_Documents() {
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}

	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]")
	private static WebElement getSelect_Document;

	public WebElement getSelectDoc() throws InterruptedException {
		return getSelect_Document;
	}

	@FindBy(id = "sendtoworkflow")
	private static WebElement sendWorkflow;

	public WebElement getsendWorkflow() throws InterruptedException {
		return sendWorkflow;
	}

	@FindBy(css = "#assignedWfTable td")
	private static WebElement WFAssign;

	public WebElement getWFAssign() throws InterruptedException {
		return WFAssign;
	}

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;
	@FindBy(xpath = "//*[@id=\"pasteid\"]")
	private WebElement Paste_ID;

	public void getVerify_CopyandPaste_Document() throws InterruptedException {

		jsclick(Copy_ID);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		jsclick(Paste_ID);

	}

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBox;

	public void getSearchBoxIndices1() throws Exception {
		SearchBox.sendKeys(Language_excelRead(1, 3));

	}

	public void getSearchBoxIndices2() throws Exception {
		SearchBox.sendKeys(Language_excelRead(2, 3));

	}

	public void getSearchBoxIndices3() throws Exception {
		SearchBox.sendKeys(Language_excelRead(3, 3));

	}

	@FindBy(xpath = "//*[@id=\"customListModelClose\"]")
	private WebElement Crosscancel;

	public WebElement getCrosscancel() throws Exception {
		return Crosscancel;
	}

	public void getSearchBoxIndices4() throws Exception {
		SearchBox.sendKeys(Language_excelRead(4, 3));

	}

	public void getSearchBoxIndices5() throws Exception {
		SearchBox.sendKeys(Language_excelRead(5, 3));

	}

	public void getSearchBoxIndices6() throws Exception {
		SearchBox.sendKeys(Language_excelRead(6, 3));

	}

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValuesTodolist_Workflow Status\"]")
	private WebElement ToDoList_Select_Indices01;

	public WebElement getToDoList_Select_Indices01() {
		return ToDoList_Select_Indices01;
	}

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBoxTODO;

	public void getSearchBoxIndices7() throws Exception {
		jsclick(SearchBoxTODO);
		SearchBoxTODO.sendKeys(Language_excelRead(7, 3));

	}

	@FindBy(xpath = "//th[contains(text(),'WORKFLOW STATUS')]")
	private static WebElement WORKFLOWSTATUS;

	public void ToDoList_Verify_Indicess_Value() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "WORKFLOW STATUS";
		String actualtext2 = WORKFLOWSTATUS.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		Reporter.log("Indices value displayed successfully" + WORKFLOWSTATUS.getText(), true);

	}

	@FindBy(xpath = "//*[@id=\"CustomListCancel\"]")
	private WebElement cancelbutton;

	public WebElement getcancelbutton() throws Exception {
		return cancelbutton;
	}

	@FindBy(xpath = "//*[@id=\"CustomListTodoCancel\"]")
	private WebElement cancelTODObutton;

	public WebElement getcancelTODObutton() throws Exception {
		return cancelTODObutton;
	}

	@FindBy(xpath = "//*[@id=\"customTodoListModelClose\"]")
	private WebElement CrosscancelTODObutton;

	public WebElement getCrosscancelTODObutton() throws Exception {
		return CrosscancelTODObutton;
	}

	// Document Context Menu

	@FindBy(xpath = ("//tbody/tr[1]/td[1]/label[1]/span[1]"))
	private WebElement Select_Document;

	public WebElement getSelect_Document() {
		return Select_Document;
	}

	@FindBy(xpath = "//*[@id=\"logoutElement\"]")
	private WebElement Click_Username;

	public WebElement getClick_Username() {
		return Click_Username;
	}

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Click_LogoutOption;

	public WebElement getClick_LogoutOption() {
		return Click_LogoutOption;
	}

	//
	public void login_New_User() throws Exception {

		driver.findElement(LoginUsername).sendKeys(Language_excelRead(1, 0));
		Reporter.log("Enter valid new username into username field", true);
		driver.findElement(Password).sendKeys(Language_excelRead(1, 1));
		Reporter.log("Enter valid new user password into password field", true);
		WebElement room = driver.findElement(Room);
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		Thread.sleep(3000);
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
			Reporter.log(sessionmsg.getText() + "this message is displayed", true);
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

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document;

	public WebElement getOpen_Document() {
		return Open_Document;
	}

	@FindBy(xpath = "//*[@id=\"docOwnerName\"]")
	private WebElement Docownername;
	@FindBy(xpath = "//*[@id=\"detailsBlock\"]/p[2]/span")
	private WebElement openviewonly;
	@FindBy(xpath = "//*[@id=\"ownershipMessageModelOk\"]")
	private WebElement ownershipmessageok;

	public void getVerify_Ownership_Message() throws InterruptedException {
		WebElement Message1 = Docownername;
		Reporter.log("Take Ownership Message " + Message1.getText(), true);
		WebElement Message2 = openviewonly;
		Reporter.log("Take Ownership Message " + Message2.getText(), true);
		jsclick(ownershipmessageok);

	}

	@FindBy(xpath = "//*[@id=\"releaseOwnership\"]")
	private WebElement Select_Option_ReleaseOwnership;

	public void getSelect_Option_ReleaseOwnership() {
		WebElement ele1 = Select_Option_ReleaseOwnership;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(xpath = "//*[@id=\"refreshDocuments\"]")
	private WebElement Select_Option_Refresh;

	public void getSelect_Option_Refresh() {
		WebElement ele1 = Select_Option_Refresh;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);

	}

	@FindBy(xpath = "//*[@id=\"documentSetcolour\"]")
	private WebElement Select_Option_Catagories_andSet_Colors;
	@FindBy(xpath = "//*[@id=\"CustomColourid_5\"]")
	private WebElement Select_Colors;

	public void getSelect_Option_Catagories_andSet_Colors() throws InterruptedException {
		Thread.sleep(2000);
		jsclick(Select_Option_Catagories_andSet_Colors);
		Thread.sleep(4000);
		jsclick(Select_Colors);

	}

	@FindBy(xpath = "//*[@id=\"cutid\"]")
	private WebElement Cut_ID;

	public void getVerify_CutandPaste_Document() throws InterruptedException {

		jsclick(Cut_ID);
		Thread.sleep(6000);
		jsclick(Select_subFolder);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(Paste_ID);

	}

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]/label/span")
	private WebElement check;
	@FindBy(xpath = "//*[@id=\"delDocument\"]")
	private WebElement deletedoc;
	@FindBy(xpath = "//*[@id=\"deleteMessageOk\"]")
	private WebElement deleteOK;

	public void getVerify_Delete_Document() throws InterruptedException {
		jsclick(check);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(deletedoc);
		Thread.sleep(6000);
		jsclick(deleteOK);

	}

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[1]/label/span")
	private WebElement checkdoc;
	@FindBy(xpath = "//*[@id=\"documentcreatefav\"]")
	private WebElement createFavorite;
	@FindBy(xpath = "//*[@id=\"createFavText\"]")
	private WebElement createFavoriteText;
	@FindBy(xpath = "//*[@id=\"createFavModelOk\"]")
	private WebElement createFavoriteOK;

	public void getVerify_CreateFavorites_Document() throws Exception {

		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(createFavorite);
		Thread.sleep(4000);
		createFavoriteText.clear();
		Thread.sleep(4000);
		createFavoriteText.sendKeys(Language_excelRead(8, 2));
		Thread.sleep(6000);
		jsclick(createFavoriteOK);

	}

	@FindBy(xpath = "//*[@id=\"bookmarkid\"]/img")
	private WebElement bookmark;
	@FindBy(xpath = "//*[@id=\"loadAllfavrites\"]")
	private WebElement loadfav;
	@FindBy(xpath = "//*[@id=\"searchFav\"]")
	private WebElement Searchfav;
	@FindBy(xpath = "//*[@id=\"createfavshowAllModelTabel\"]/tbody/tr[1]/td[1]")
	private WebElement doc;

	public void getOpen_CreateFavorites_Document() throws Exception {
		Thread.sleep(6000);
		element = bookmark;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(4000);
		jsclick(loadfav);
		Thread.sleep(8000);
		jsclick(Searchfav);
		Thread.sleep(8000);
		Searchfav.sendKeys(Language_excelRead(8, 2));
		Thread.sleep(8000);
		jsclick(doc);

	}

	@FindBy(xpath = "//*[@id=\"sendtoworkflow\"]")
	private WebElement Workflow;
	@FindBy(css = "#assignedWfTable .odd:nth-child(13) > td")
	private WebElement AutoWorkflow;
	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement customdoc;
	@FindBy(xpath = "//*[@id=\"ownershipMessageModelOk\"]")
	private WebElement ownershipok;

	public void getCreate_SendToWorkflow_Document() throws Exception {

		jsclick(Workflow);
		Thread.sleep(4000);
		jsclick(AutoWorkflow);
		Thread.sleep(4000);
		jsclick(customdoc);
		Thread.sleep(6000);
		WebElement Message1 = Docownername;
		Reporter.log("Take Ownership Message " + Message1.getText(), true);
		Thread.sleep(4000);
		WebElement Message2 = openviewonly;
		Reporter.log("Take Ownership Message " + Message2.getText(), true);
		Thread.sleep(4000);
		jsclick(ownershipok);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(4000);
		jsclick(closedoc);

	}

	@FindBy(xpath = "//*[@id=\"notificationSettings\"]")
	private WebElement notification;
	@FindBy(xpath = "//*[@id=\"contentverseRef\"]")
	private WebElement contref;
	@FindBy(xpath = "//*[@id=\"documentHistory\"]")
	private WebElement dochistory;
	@FindBy(css = "//*[@id=\"dropdownNotifylist\"]")
	private WebElement notifylist;
	@FindBy(xpath = "//*[@id=\"spanCheckNotifications_1\"]")
	private WebElement checknotification;
	@FindBy(xpath = "//*[@id=\"notifySaveBtn\"]")
	private WebElement savenotify;
	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement customdocname;
	@FindBy(xpath = "//*[@id=\"general\"]/div/div[1]/span")
	private WebElement general;

	public void getCreate_Notification_Document() throws Exception {

		Thread.sleep(6000);
		jsclick(notification);
		Thread.sleep(110000);
		jsclick(contref);
		jsclick(dochistory);
		Thread.sleep(6000);
		jsclick(notifylist);
		Thread.sleep(6000);
		jsclick(checknotification);
		jsclick(savenotify);
		Thread.sleep(6000);
		jsclick(Select_Folder);
		Thread.sleep(7000);
		jsclick(customdocname);
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		jsclick(general);
		Thread.sleep(8000);

	}

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement saveaddpage;
	@FindBy(xpath = "//*[@id=\"messageButtonOK42\"]")
	private WebElement okbutton;

	public void getSave_Signature_Document() throws Exception {
		jsclick(saveaddpage);
		Thread.sleep(8000);
		jsclick(okbutton);

	}

	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement closedoc;

	public WebElement getclosedoc() {
		return closedoc;
	}

	@FindBy(xpath = "//*[@id=\"documentSendTo\"]")
	private WebElement sendTo;
	@FindBy(xpath = "//*[@id=\"sendToMail\"]")
	private WebElement sendToMail;
	@FindBy(xpath = "//*[@id=\"convertToPdfChk\"]")
	private WebElement converttopdf;
	@FindBy(xpath = "//*[@id=\"retainPdfColorExport1\"]")
	private WebElement colorexport;
	@FindBy(xpath = "//*[@id=\"convertToPdfQuality\"]")
	private WebElement pdfquality;
	@FindBy(xpath = "//*[@id=\"certifiedCoverPage\"]")
	private WebElement coverpage;
	@FindBy(xpath = "//*[@id=\"compressToZip\"]")
	private WebElement compresszip;
	@FindBy(xpath = "//*[@id=\"sendToPassword\"]")
	private WebElement sendtopassword;
	@FindBy(xpath = "//*[@id=\"zipPasswordInputpdf\"]")
	private WebElement zippassinput;
	@FindBy(xpath = "//*[@id=\"runAnnotations\"]")
	private WebElement Runannotation;
	@FindBy(xpath = "//*[@id=\"toEmial\"]")
	private WebElement toemail;
	@FindBy(xpath = "//*[@id=\"subjectid\"]")
	private WebElement subid;
	@FindBy(xpath = "//*[@id=\"saveSendToDocument\"]")
	private WebElement savesendto;
	@FindBy(xpath = "(//*[@id=\"messageButtonOK\"]")
	private WebElement sentmailOK;
	@FindBy(xpath = ("(//button[@class='modalDialogButtons'])[1]"))
	private WebElement EmailsuccessMessageDialogboxOK;

	public void getSentTo_Mail_asCopy() throws Exception {

		jsclick(sendTo);
		Thread.sleep(2000);
		jsclick(sendToMail);
		Thread.sleep(3000);
		jsclick(converttopdf);
		Thread.sleep(3000);
		jsclick(colorexport);
		Thread.sleep(2000);
		jsclick(pdfquality);
		Thread.sleep(2000);
		Select sel = new Select(pdfquality);
		sel.selectByVisibleText("Best Quality");
		Thread.sleep(2000);
		jsclick(coverpage);
		Thread.sleep(2000);
		jsclick(compresszip);
		Thread.sleep(2000);
		jsclick(sendtopassword);
		Thread.sleep(2000);
		jsclick(zippassinput);
		Thread.sleep(2000);
		zippassinput.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(2000);
		jsclick(Runannotation);
		Thread.sleep(2000);
		jsclick(toemail);
		Thread.sleep(2000);
		toemail.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(2000);
		jsclick(subid);
		Thread.sleep(2000);
		subid.sendKeys(Language_excelRead(9, 2));
		Thread.sleep(4000);
		jsclick(savesendto);
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);

	}

	@FindBy(xpath = "//*[@id=\"sendDocAsReference\"]")
	private WebElement Referencemail;

	public void getSentTo_Mail_asReference() throws Exception {

		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendToMail);
		Thread.sleep(3000);
		jsclick(Referencemail);
		Thread.sleep(3000);
		Select sel = new Select(pdfquality);
		sel.selectByVisibleText("Best Quality");
		jsclick(toemail);
		Thread.sleep(3000);
		toemail.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(subid);
		Thread.sleep(3000);
		subid.sendKeys(Language_excelRead(9, 2));
		Thread.sleep(4000);
		jsclick(savesendto);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);

	}

	@FindBy(xpath = "//*[@id=\"sendToPrint\"]")
	private WebElement sendtoPrint;
	@FindBy(xpath = "//*[@id=\"certifiedCoverPagePrint\"]")
	private WebElement pageprint;
	@FindBy(xpath = "//*[@id=\"includeRouteSummaryPrint\"]")
	private WebElement summaryprint;
	@FindBy(xpath = "//*[@id=\"unlockRedactionsWithPrint\"]")
	private WebElement withunlockredaction;
	@FindBy(xpath = "//*[@id=\"unlockRedactionsPwdPrint\"]")
	private WebElement pwdunlockredaction;
	@FindBy(xpath = "//*[@id=\"printDocumentOnView\"]")
	private WebElement printview;

	public void getSentTo_Print() throws Exception {
		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendtoPrint);
		Thread.sleep(4000);
		jsclick(pageprint);
		Thread.sleep(4000);
		jsclick(summaryprint);
		Thread.sleep(4000);
		jsclick(withunlockredaction);
		Thread.sleep(4000);
		jsclick(pwdunlockredaction);
		pwdunlockredaction.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(4000);
		jsclick(printview);

	}

	@FindBy(xpath = "//*[@id=\"sendToExport\"]")
	private WebElement sendexport;
	@FindBy(xpath = "//*[@id=\"retainFormatChkExport\"]")
	private WebElement retainchkexport;
	@FindBy(xpath = "//*[@id=\"includeRouteSummary\"]")
	private WebElement Routesummary;
	@FindBy(xpath = "//*[@id=\"zipPasswordInput\"]")
	private WebElement Zippassword;
	@FindBy(xpath = "//*[@id=\"convertToPdfChkExport\"]")
	private WebElement convertpdfexport;
	@FindBy(xpath = "//*[@id=\"exportAnnotations\"]")
	private WebElement exportannotation;
	@FindBy(xpath = "//*[@id=\"unlockRedactionsWithExport\"]")
	private WebElement exportwith;
	@FindBy(xpath = "//*[@id=\"unlockRedactionsPwdExport\"]")
	private WebElement exportPwd;
	@FindBy(xpath = "//*[@id=\"zipPasswordInput\"]")
	private WebElement Zippasswordinput;
	@FindBy(xpath = "//*[@id=\"pdfPasswordInput\"]")
	private WebElement Pdfpasswordinput;

	public void getSentTo_Export() throws Exception {
		Thread.sleep(6000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendexport);
		Thread.sleep(3000);
		jsclick(retainchkexport);
		jsclick(Routesummary);
		Thread.sleep(3000);
		jsclick(savesendto);
		Thread.sleep(19000);
		jsclick(checkdoc);
		Thread.sleep(5000);
		element = MoveTo_Menu_Documents;
		Actions action2 = new Actions(driver);
		action2.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(sendexport);
		Thread.sleep(3000);
		jsclick(convertpdfexport);
		jsclick(exportannotation);
		jsclick(exportwith);
		jsclick(exportPwd);
		Thread.sleep(3000);
		exportPwd.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(Zippasswordinput);
		Thread.sleep(3000);
		Zippasswordinput.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(Pdfpasswordinput);
		Thread.sleep(3000);
		Pdfpasswordinput.sendKeys(Language_excelRead(2, 1));
		Thread.sleep(3000);
		jsclick(savesendto);
		Thread.sleep(6000);

	}

	@FindBy(xpath = "//*[@id=\"sendToSecureMail\"]")
	private WebElement SecureMail;
	@FindBy(xpath = "//*[@id=\"recepientEmailId\"]")
	private WebElement recpmail;
	@FindBy(xpath = "//*[@id=\"confirmEmailIdSecure\"]")
	private WebElement Confirmemail;
	@FindBy(xpath = "//*[@id=\"modifyPermissionCheckbox\"]")
	private WebElement modifychk;
	@FindBy(xpath = "//*[@id=\"navigatorTreeOk32\"]")
	private WebElement navigateOK;
	@FindBy(xpath = "//*[@id=\"recipientMailIdSecond\"]")
	private WebElement recpmailsec;
	@FindBy(xpath = "//*[@id=\"confirmEmailIdSecureSecond\"]")
	private WebElement confirmemailsec;
	@FindBy(xpath = "//*[@id=\"navigatorTreeOk33\"]")
	private WebElement navigateOK2;

	public void getSentTo_SecureLink() throws Exception {
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(SecureMail);
		Thread.sleep(4000);
		jsclick(recpmail);
		Thread.sleep(3000);
		recpmail.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(Confirmemail);
		Thread.sleep(3000);
		Confirmemail.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);
		recpmailsec.sendKeys(Language_excelRead(1, 4));
		jsclick(confirmemailsec);
		Thread.sleep(3000);
		confirmemailsec.sendKeys(Language_excelRead(1, 4));
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);

	}

	@FindBy(xpath = "//*[@id=\"generateDocumentLink\"]")
	private WebElement generatedoc;
	@FindBy(xpath = "//*[@id=\"documentLinkOk\"]")
	private WebElement doclinkok;
	@FindBy(xpath = "//*[@id=\"messageContentLink\"]")
	private WebElement CopyDoclink;

	public void getSentTo_GenerateDocumentLink() throws Exception {
		Thread.sleep(3000);
		jsclick(checkdoc);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		jsclick(sendTo);
		Thread.sleep(3000);
		jsclick(generatedoc);
		Thread.sleep(4000);
		jsclick(doclinkok);
		Thread.sleep(6000);

	}

	@FindBy(xpath = "//*[@id=\"ocrPopUp\"]")
	private WebElement ocrpopup;

	public WebElement getocrpopup() {
		return ocrpopup;

	}

	@FindBy(xpath = ".//div[@id='Underscore _.pdf']/div[1]/img[1]")
	private WebElement Open_Underscore_page;

	public WebElement getOpen_Underscore_page() {
		return Open_Underscore_page;
	}

	@FindBy(linkText = "bijwerken")
	private WebElement UpdateDutch_Button;

	public WebElement getUpdateDutch_Button() {
		return UpdateDutch_Button;
	}

	@FindBy(linkText = "opslaan")
	private WebElement DutchSave_UpdateButton;

	public WebElement getDutchSave_UpdateButton() {
		return DutchSave_UpdateButton;
	}

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement DutchUpdate_Ok_button;

	public WebElement getDutchUpdate_Ok_button() {
		return DutchUpdate_Ok_button;
	}

	@FindBy(xpath = "//span[normalize-space()='EIGENSCHAPPEN']")
	private WebElement DutchProperties_option;

	public WebElement getDutchProperties_option() {
		return DutchProperties_option;
	}

	@FindBy(xpath = "//td[contains(text(),'MORTHWEST MEDICAT')]")
	private static WebElement ReportNameValueBeforeDoc;

	public WebElement getReportNameValueBeforeDoc() {
		return ReportNameValueBeforeDoc;
	}

	public void getOCRReportnamevalidation_BeforeCreateDOC() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "MORTHWEST MEDICAT";
		String actualtext = ReportNameValueBeforeDoc.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log("Report Name is: " + ReportNameValueBeforeDoc.getText(), true);

	}

	@FindBy(xpath = "//td[contains(text(),'Export Documentary Credit (DC) Bill Ne')]")
	private static WebElement ReportNameValueAfterDoc;

	public WebElement getReportNameValueAfterDoc() {
		return ReportNameValueAfterDoc;
	}

	public void getOCRReportnamevalidation_AfterCreateDOC() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Export Documentary Credit (DC) Bill Ne";
		String actualtext = ReportNameValueAfterDoc.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		Reporter.log("Report Name is: " + ReportNameValueAfterDoc.getText(), true);

	}

	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_Button;

	public WebElement getNavigate_Button() {
		return Navigate_Button;

	}

	@FindBy(xpath = "//span[@title='Document Close']")
	private WebElement Close_Document;

	public WebElement getClose_Documentpage() {
		return Close_Document;

	}

	@FindBy(xpath = "//*[@id=\"Hyphen -.tif\"]/div/img")
	private WebElement Open_Hyphen_page;

	public WebElement getOpen_Hyphen_page() {
		return Open_Hyphen_page;

	}

	// Select from Search Document Location

	@FindBy(xpath = ("//*[@id=\"1\"]/a"))
	private WebElement Select_Cabinet2;

	public WebElement getSelect_Cabinet2() {
		return Select_Cabinet2;

	}

	@FindBy(xpath = ("//*[@id=\"2\"]/a"))
	private WebElement Select_Drawer2;

	public WebElement getSelect_Drawer2() {
		return Select_Drawer2;

	}

	@FindBy(xpath = ("//li[@id='2870']//a[@href='#']"))
	private WebElement Select_Folder2;

	public WebElement getSelect_Folder2() {
		return Select_Folder2;

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

}