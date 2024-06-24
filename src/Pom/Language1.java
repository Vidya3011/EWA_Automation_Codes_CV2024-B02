package Pom;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

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

import Generic.BaseClass;

public class Language1 extends BaseClass {

	public static WebElement element = null;
	private static final boolean False = false;

	public Language1() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "logedinusername")
	private WebElement Username;

	public WebElement getUsername() {
		return Username;
	}

	@FindBy(xpath = "//a[normalize-space()='Logout']")
	private WebElement Logout;

	public WebElement getLogout() {
		return Logout;
	}

	@FindBy(xpath = "//a[normalize-space()='English']")
	private WebElement English_Language;

	public WebElement getEnglish_Language() {
		return English_Language;
	}

	@FindBy(xpath = "//a[normalize-space()='Spanish']")
	private WebElement Spanish_Language;

	public WebElement getSpanish_Language() {
		return Spanish_Language;
	}

	@FindBy(xpath = "//a[normalize-space()='French']")
	private WebElement French_Language;

	public WebElement getFrench_Language() {
		return French_Language;
	}

	@FindBy(xpath = "//a[normalize-space()='Dutch']")
	private WebElement Dutch_Language;

	public WebElement getDutch_Language() {
		return Dutch_Language;
	}

	@FindBy(xpath = "//a[normalize-space()='Hindi']")
	private WebElement Hindi_Language;

	public WebElement getHindi_Language() {
		return Hindi_Language;
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

	
	
	
	
	
	
	@FindBy(xpath = "//img[@src='images/newRe.png']")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;
	}

	@FindBy(xpath = "//a[normalize-space()='Cerrar sesión']")
	private WebElement spanishLogout;

	public WebElement getspanishLogout() {
		return spanishLogout;
	}

	@FindBy(xpath = "//a[normalize-space()='Connectez - Out']")
	private WebElement FrenchLogout;

	public WebElement getFrenchLogout() {
		return FrenchLogout;
	}

	@FindBy(xpath = "//a[normalize-space()='Uitloggen']")
	private WebElement DutchLogout;

	public WebElement getDutchLogout() {
		return DutchLogout;
	}

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement HindiLogout;

	public WebElement getHindiLogout() {
		return HindiLogout;
	}

	public void loginwithoutUsername() throws Exception {

		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		a1 = new Actions(driver);
		a1.moveToElement(room).click().build().perform();
		WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
		ro.click();
		driver.findElement(By.id("submitid")).click();
	}

	public void loginwithoutPassword() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		driver.findElement(By.id("loginPassword")).clear();
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		a1 = new Actions(driver);
		a1.moveToElement(room).click().build().perform();
		WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
		ro.click();
		driver.findElement(By.id("submitid")).click();
	}

	public void loginwithoutRoomname() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		a1 = new Actions(driver);
		a1.moveToElement(room).click().build().perform();
		WebElement ro = driver.findElement(By.xpath("//option[text()='Please select a room']"));
		ro.click();
		driver.findElement(By.id("submitid")).click();
	}
	
	//1. LoginCVS
	
		public static String ExcelLogin ( int rowNo, int cellNo) throws Exception {
			File src=new File("./data/TestData.xlsx"); 
			FileInputStream	fis = new FileInputStream(src); 
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet s = wb.getSheet("Login");
			XSSFRow row =s.getRow(rowNo);
			XSSFCell cll = row.getCell(cellNo);
			String cellType = cll.getStringCellValue();
			return cellType;
	}

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[1]/div[1]/div[2]")
	private WebElement Usernameerror;

	public WebElement getUsernameerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "!Please enter username";
		String actualtext = Usernameerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(Usernameerror.getText());
		return Usernameerror;
	}

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[1]/div[2]/div[2]")
	private WebElement Passworderror;

	public WebElement getPassworderror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "!Please enter password";
		String actualtext = Passworderror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(Passworderror.getText());
		return Passworderror;
	}

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement Roomerror;

	public WebElement getRoomerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Select a room";
		String actualtext = Roomerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(Roomerror.getText());
		return Roomerror;
	}

	public void InvalidUsername() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(3, 0));
		driver.findElement(By.id("loginPassword")).clear();
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		a1 = new Actions(driver);
		a1.moveToElement(room).click().build().perform();
		WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
		ro.click();
		driver.findElement(By.id("submitid")).click();
	}

	public void InvalidPassword() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		driver.findElement(By.id("loginPassword")).clear();
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(4, 0));
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		a1 = new Actions(driver);
		a1.moveToElement(room).click().build().perform();
		WebElement ro = driver.findElement(By.xpath("//option[text()='CVWin19Server.Win2019_TestRoom']"));
		ro.click();
		driver.findElement(By.id("submitid")).click();
	}

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement Usernotexist;

	public WebElement getUsernotexist() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "User does not exist";
		String actualtext = Usernotexist.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(Usernotexist.getText());
		return Usernotexist;
	}

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement Invalidpassword;

	public WebElement getInvalidpassword() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Failed to authenticate user";
		String actualtext = Invalidpassword.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(Invalidpassword.getText());
		return Invalidpassword;
	}

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/h3")
	private WebElement MyaccountText;

	public WebElement French_Myaccount_Text_Laguage(WebDriver driver) throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "Mon compte";
		String actualtext2 = MyaccountText.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		System.out.println("Change Laguage French My Account Text is " + MyaccountText.getText());
		return element;
	}

	public WebElement Dutch_Myaccount_Text_Laguage(WebDriver driver) throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "Mijn rekening";
		String actualtext2 = MyaccountText.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		System.out.println("Change Laguage Dutch My Account Text is " + MyaccountText.getText());
		return element;
	}

	
	
	
	
	
	
	@FindBy(id = "viewerZoomId")
	private WebElement SelectViewerr;

	public WebElement selectViewer() {
		Select drop = new Select(SelectViewerr);
		drop.selectByVisibleText("Actual Size");
		return SelectViewerr;
	}

	
	

	
	
	
	public WebElement Hindi_Myaccount_Text_Laguage(WebDriver driver) throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "मेरा खाता";
		String actualtext2 = MyaccountText.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		System.out.println("Change Laguage Hindi My Account Text is " + MyaccountText.getText());
		return element;
	}

	public WebElement English_Myaccount_Text_Laguage(WebDriver driver) throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "My Account";
		String actualtext2 = MyaccountText.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		System.out.println("Change Laguage English My Account Text is " + MyaccountText.getText());
		return element;
	}

	public WebElement Spanish_Myaccount_Text_Laguage(WebDriver driver) throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "Mi cuenta";
		String actualtext2 = MyaccountText.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Laguage verification failed");
		System.out.println("Change Laguage spanish My Account Text is " + MyaccountText.getText());
		return element;
	}

	// Spanish Language

	@FindBy(xpath = ("//*[@id=\"createDocument\"]"))
	private WebElement NewDocuments_MenuOption;

	public WebElement getNewDocuments_MenuOption() {
		return NewDocuments_MenuOption;
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

	@FindBy(xpath = "(//button[@id='navigatorTreeOk'])[1]")
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

	@FindBy(xpath= "//*[@id=\"indices_5\"]")
	private WebElement Enter_Report_Name_Text_SQL;

	public WebElement getEnter_Report_Name_Text_SQL() {
		return Enter_Report_Name_Text_SQL;
	}
	
	
	
	
	@FindBy(xpath = "//div[@id='addPagesDropDown']//span[1]")
	private WebElement Move_To_PlusIcon;

	public WebElement getMove_To_PlusIcon() {
		WebElement ele = Move_To_PlusIcon;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return ele;
	}

	@FindBy(id = "viewDocumentAddPages")
	private WebElement Browse_Option;

	public WebElement getBrowse_Option() {
		WebElement ele = Browse_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
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

	@FindBy(xpath = "//div[@id='fileInfoButton']//span[contains(@class,'fileinformationBtn')]")
	private WebElement Click_FileInfo_Option;

	public WebElement getClick_FileInfo_Option() {
		WebElement ele = Click_FileInfo_Option;
		ele.click();
		return Click_FileInfo_Option;
	}

	@FindBy(xpath = "//span[@id='fileNameLabel']")
	private WebElement Click_FileInfo_OkButton_withFileName;
	@FindBy(xpath = "//button[@id='fileRenameOK']")
	private WebElement RemarkOk;

	public WebElement getClick_FileInfo_OkButton_withFileName() {
		WebElement Filename = Click_FileInfo_OkButton_withFileName;
		System.out.println("File name is:" + Filename.getText());
		WebElement ele = RemarkOk;
		ele.click();
		return Click_FileInfo_OkButton_withFileName;

	}
	// Language datadriven

	public String Language_excelRead(int rowNo, int cellNo) throws Exception {

		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("Language");
		XSSFRow row = s.getRow(rowNo);
		XSSFCell cll = row.getCell(cellNo);
		String cellType = cll.getStringCellValue();
		return cellType;
	}

	@FindBy(xpath = "//button[@id='btnSignatureAdd']//span[@class='icon icon-sm signatureIcon']")
	private WebElement Click_signature_Menuoption;

	public WebElement getClick_signature_Menuoption() throws Exception {
		return Click_signature_Menuoption;
	}

	@FindBy(css = "#imageViewerDiv .lt-imageviewer-eventcanvas")
	private WebElement Add_Signature_Onpage;

	public WebElement getAdd_Signature_Onpage() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Add_Signature_Onpage;
		action.dragAndDropBy(element, 200, 100).build().perform();
		return Add_Signature_Onpage;
	}

	@FindBy(xpath = "//*[@id=\"signInputPasswordL\"]")
	private WebElement signinputpassword;
	@FindBy(xpath = "//*[@id=\"verifySignaturePasswordL\"]")
	private WebElement verifypassok;

	public WebElement getinputpassword() throws Exception {
		jsclick(signinputpassword);
		signinputpassword.sendKeys(Language_excelRead(1, 0));
		jsclick(verifypassok);
		return verifypassok;
	}

	@FindBy(css = ".annotationRoot")
	private WebElement Move_to_Annotation_Option_inViewer;

	public WebElement getMove_to_Annotation_Option_inViewer() throws Exception {
		WebElement ele = Move_to_Annotation_Option_inViewer;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return Move_to_Annotation_Option_inViewer;
	}

	@FindBy(css = "#lockenable1 > .text")
	private WebElement Redaction_Option;

	public WebElement getRedaction_Option() throws Exception {
		WebElement ele1 = Redaction_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return Redaction_Option;
	}

	@FindBy(css = "#imageViewerDiv .lt-imageviewer-eventcanvas")
	private WebElement Set_Redaction_ToDocument;
	@FindBy(id = "objectName")
	private WebElement objectname;
	@FindBy(id = "dlgInput_Input")
	private WebElement input;
	@FindBy(id = "objectConfirmPassword")
	private WebElement confirmpassword;
	@FindBy(xpath = "//*[@id=\"dlgInput_Apply\"]")
	private WebElement Apply;

	public WebElement getSet_Redaction_ToDocument() throws Exception {
		Actions action = new Actions(driver);
		WebElement element = Set_Redaction_ToDocument;
		action.dragAndDropBy(element, 400, 150).build().perform();
		jsclick(Set_Redaction_ToDocument);
		Thread.sleep(3000);
		objectname.sendKeys(Language_excelRead(1, 0));
		Thread.sleep(3000);
		jsclick(input);
		Thread.sleep(2000);
		input.sendKeys(Language_excelRead(1, 0));
		Thread.sleep(2000);
		jsclick(confirmpassword);
		Thread.sleep(2000);
		confirmpassword.sendKeys(Language_excelRead(1, 0));
		Thread.sleep(3000);
		jsclick(Apply);
		return Set_Redaction_ToDocument;
	}

	@FindBy(xpath = "//*[@id=\"rubberBandInteractiveMode_shortcut\"]/span")
	private WebElement ClickOCR;

	public WebElement getClickOCR() throws Exception {
		return ClickOCR;
	}

	@FindBy(css = "#imageViewerDiv .lt-imageviewer-eventcanvas")
	private WebElement setOCR;

	public WebElement getSet_OCR_ToDocument() throws Exception {

		Actions action = new Actions(driver);
		WebElement element = setOCR;
		action.dragAndDropBy(element, -300, -20).build().perform();
		jsclick(setOCR);
		return element;

	}

	public WebElement getSet_OCR_ToDocumentPDF() throws Exception {

		Actions action = new Actions(driver);
		WebElement element = setOCR;
		action.dragAndDropBy(element, -150, -20).build().perform();
		jsclick(setOCR);
		return element;

	}

	@FindBy(css = "#saveAddedPages > .icon")
	private WebElement Save_button;

	public WebElement getSave_button() {
		return Save_button;
	}

	@FindBy(id = "messageButtonOK42")
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

	@FindBy(id = "documentTemplates")
	private WebElement Templates_MenuOption;

	public WebElement getTemplates_MenuOption() {
		return Templates_MenuOption;
	}

	@FindBy(xpath = ("(//a[text()='CVApp Test'])[1]"))
	private WebElement Template_Test_Cabinet;

	public WebElement getTemplate_Test_Cabinet() {
		return Template_Test_Cabinet;
	}

	@FindBy(xpath = ("//a[text()='CVMobile App 2022']"))
	private WebElement Template_Test_Drawer;

	public WebElement getTemplate_Test_Drawer() {
		return Template_Test_Drawer;
	}

	@FindBy(xpath = ("//a[text()='Test apk']"))
	private WebElement Template_Folder;

	public WebElement getTemplate_Folder() {
		return Template_Folder;
	}

	@FindBy(id = "navigatorTreeCancle")
	private WebElement Cancel_Button_BrowseforFolder;

	public WebElement getCancel_Button_BrowseforFolder() {
		return Cancel_Button_BrowseforFolder;
	}

	@FindBy(id = "retainBtn")
	private WebElement Select_Retain_Checkbox;

	public WebElement getSelect_Retain_Checkbox() {
		return Select_Retain_Checkbox;
	}

	@FindBy(xpath = "//*[@id=\"createTemplateBtn\"]")
	private WebElement Save_Template_Button;

	public WebElement getSave_Template_Button() {
		return Save_Template_Button;
	}

	@FindBy(id = "CommentsMessageModelOk40")
	private WebElement Modify_Permission_OK_Button;

	public WebElement getModify_Permission_OK_Button() {
		return Modify_Permission_OK_Button;
	}

	@FindBy(id = "messageButtonOK")
	private WebElement PageCreation_Alert_OK_Button;

	public WebElement getPageCreation_Alert_OK_Button() {
		return PageCreation_Alert_OK_Button;
	}

	@FindBy(id = "createDocumentClear")
	private WebElement Clear_Button;

	public WebElement getClear_Button() {
		return Clear_Button;
	}

	@FindBy(xpath = "//button[@id='CommentsMessageModelOk']")
	private WebElement Select_Folder_Alert_OK_Button;

	public WebElement getSelect_Folder_Alert_OK_Button() {
		return Select_Folder_Alert_OK_Button;
	}

	@FindBy(css = "#createDocuemntNavigator #\\33 5 > .jstree-icon")
	private WebElement Cabinet_Plus_button;

	public WebElement getCabinet_Plus_button() {
		return Cabinet_Plus_button;
	}

	@FindBy(css = "#\\31 037 > .jstree-icon")
	private WebElement Drawer_Plus_button;

	public WebElement getDrawer_Plus_button() {
		return Drawer_Plus_button;
	}

	@FindBy(id = "createTemplateCancel")
	private WebElement Template_Description_No_button;

	public WebElement getTemplate_Description_No_button() {
		return Template_Description_No_button;
	}

	@FindBy(id = "templateName")
	private WebElement Template_NameTextbox;

	public WebElement getTemplate_NameTextbox() {
		return Template_NameTextbox;
	}

	public WebElement getTemplate_NameTextboxvalue() throws Exception {
		Template_NameTextbox.sendKeys(Language_excelRead(5, 0));
		return Template_NameTextbox;
	}

	@FindBy(id = "templateDescription")
	private WebElement Template_Description_Messagebox;

	public WebElement getTemplate_Description_Messagebox() {
		return Template_Description_Messagebox;
	}

	public WebElement getTemplate_Description_Messageboxvalue() throws Exception {
		Template_Description_Messagebox.sendKeys(Language_excelRead(6, 0));
		return Template_Description_Messagebox;
	}

	@FindBy(xpath = "//*[@id=\"createTemplateOk\"]")
	private WebElement Template_Description_OK_button;

	public WebElement getTemplate_Description_OK_button() {
		return Template_Description_OK_button;
	}

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Template_Created_Message_Verify;

	public WebElement getTemplate_Created_Message_Verify() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Template Created Successfully!";
		String actualtext = Template_Created_Message_Verify.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return Template_Created_Message_Verify;
	}

	@FindBy(id = "messageButtonOK")
	private WebElement Template_Created_OK_button;

	public WebElement getTemplate_Created_OK_button() {
		return Template_Created_OK_button;
	}

	@FindBy(xpath = "//a[@id='documentTemplates']")
	private WebElement Moveto_Templates_Option;

	public WebElement getMoveto_Templates_Option() {
		WebElement ele = Moveto_Templates_Option;
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		return ele;
	}

	@FindBy(id = "indices_33")
	private WebElement Select_ReportName_Test;

	public WebElement getSelect_ReportName_Test() {
		return Select_ReportName_Test;
	}

	public WebElement getSelect_ReportName_Testvalue() throws Exception {
		Select_ReportName_Test.sendKeys(Language_excelRead(2, 0));
		return Select_ReportName_Test;
	}

	@FindBy(id = "indices_33")
	private WebElement Enter_Report_Name_Test;

	public WebElement getEnter_Report_Name_Test() {
		return Enter_Report_Name_Test;
	}

	@FindBy(id = "Template_Automation1")
	private WebElement Select_Created_Template;

	public WebElement getSelect_Created_Template() {
		return Select_Created_Template;
	}

	@FindBy(id = "createDocumentSubmit")
	private WebElement Created_button;

	public WebElement getCreated_button() {
		return Created_button;
	}

	@FindBy(id = "modelHome")
	private WebElement Navigate_button;

	public WebElement getNavigate_button() {
		return Navigate_button;
	}

	@FindBy(id = "editTemplate1")
	private WebElement Click_Edit_Template_Button;

	public WebElement getClick_Edit_Template_Button() {
		return Click_Edit_Template_Button;
	}

	@FindBy(id = "editTemplateDescription")
	private WebElement EditTemplate_Description_Messagebox;

	public WebElement getEditTemplate_Description_Messagebox() {
		return EditTemplate_Description_Messagebox;
	}

	public WebElement getEditTemplate_Description_Messageboxvalue() throws Exception {
		EditTemplate_Description_Messagebox.sendKeys(Language_excelRead(7, 0));
		return EditTemplate_Description_Messagebox;
	}

	@FindBy(id = "editTemplateOk")
	private WebElement EditTemplate_Description_OK_button;

	public WebElement getEditTemplate_Description_OK_button() {
		return EditTemplate_Description_OK_button;
	}

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement EditTemplate_Created_Message_Verify;

	public WebElement getEditTemplate_Created_Message_Verify() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Template Edited Successfully!";
		String actualtext = EditTemplate_Created_Message_Verify.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return EditTemplate_Created_Message_Verify;
	}

	@FindBy(id = "messageButtonOK")
	private WebElement EditTemplate_Created_OK_button;

	public WebElement getEditTemplate_Created_OK_button() {
		return EditTemplate_Created_OK_button;
	}

	@FindBy(id = "delTemp")
	private WebElement Delete_Template_Button;

	public WebElement getDelete_Template_Button() {
		return Delete_Template_Button;
	}

	@FindBy(id = "deleteTemplateOk")
	private WebElement Delete_Template_OK_Button;

	public WebElement getDelete_Template_OK_Button() {
		return Delete_Template_OK_Button;
	}

	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement Select_Home_Templatedoc;

	public WebElement getSelect_Home_Templatedoc() {
		return Select_Home_Templatedoc;
	}

	@FindBy(xpath = "//button[@id='editTemplateCancel']")
	private WebElement EditTemplate_Description_No_button;

	public WebElement getEditTemplate_Description_No_button() {
		return EditTemplate_Description_No_button;
	}

	@FindBy(xpath = "//select[@id='defaultOfficeDocViewListNo']")
	private WebElement Select_Office_document_Advancedviewing;

	public WebElement getSelect_Office_document_Advancedviewing() {
		Select sel = new Select(Select_Office_document_Advancedviewing);
		sel.selectByVisibleText("Advanced viewing");
		return Select_Office_document_Advancedviewing;
	}

	// New Word Document

	@FindBy(linkText = "New Word Document")
	private WebElement New_Word_Document_Option;

	public WebElement getNew_Word_Document_Option() {
		WebElement ele1 = New_Word_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return ele1;

	}

	@FindBy(id = "newTemplateFileName")
	private WebElement Enter_Word_File_Name;
	@FindBy(id = "templateOK")
	private WebElement TemplateOK;

	public WebElement getEnter_Word_File_Name() throws Exception {
		WebElement ele = Enter_Word_File_Name;
		ele.sendKeys(Language_excelRead(3, 0));
		TemplateOK.click();
		return ele;
	}

	// New Excel Spreadsheet

	@FindBy(linkText = "New Excel Spreadsheet")
	private WebElement New_Excel_Spreadsheet_Option;

	public WebElement getNew_Excel_Spreadsheet_Option() {
		WebElement ele1 = New_Excel_Spreadsheet_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return ele1;
	}

	@FindBy(id = "newTemplateFileName")
	private WebElement Enter_Excel_File_Name;

	public WebElement getEnter_Excel_File_Name() throws Exception {
		WebElement ele1 = Enter_Excel_File_Name;
		ele1.sendKeys(Language_excelRead(4, 0));
		TemplateOK.click();
		return ele1;
	}

	@FindBy(xpath = "//select[@id='defaultPdfDocViewListNo']")
	private WebElement Pdf_document_Advancedviewing;

	public WebElement getPdf_document_Advancedviewing() {
		Select drop = new Select(Pdf_document_Advancedviewing);
		drop.selectByVisibleText("Advanced viewing");
		return Pdf_document_Advancedviewing;
	}

	@FindBy(linkText = "New Pdf Document")
	private WebElement New_pdf_Document_Option;

	public WebElement getNew_pdf_Document_Option() {
		WebElement ele1 = New_pdf_Document_Option;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return New_pdf_Document_Option;
	}

	@FindBy(id = "newTemplateFileName")
	private WebElement Enter_pdf_File_Name;
	@FindBy(id = "templateOK")
	private WebElement TempOK;

	public WebElement getEnter_pdf_File_Name() throws Exception {
		WebElement ele1 = Enter_pdf_File_Name;
		ele1.sendKeys(Language_excelRead(8, 0));
		Thread.sleep(3000);
		TempOK.click();
		return Enter_pdf_File_Name;
	}

	@FindBy(xpath = "//span[@id='pdfViewerDiv_formdesignerIcon']")
	private WebElement pdfViewer;

	public WebElement getpdfViewer() {
		return pdfViewer;
	}

	@FindBy(xpath = "//span[@id='pdfViewerDiv_formdesigner_textboxIcon']")
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
	private WebElement Select_FormFiled;

	public WebElement getSelect_FormFiled() {
		Select sel = new Select(Select_FormFiled);
		sel.selectByVisibleText("Textbox1");
		return Select_FormFiled;
	}

	@FindBy(xpath = "//button[@id='setFormMapping']")
	private WebElement FormOK;

	public WebElement getFormOK() {
		return FormOK;
	}

	@FindBy(xpath = "//span[@id='messageContent']")
	private WebElement Verify_DuplicateTemp_Message;

	public WebElement getVerify_DuplicateTemp_Message() {
		WebElement Message = Verify_DuplicateTemp_Message;
		System.out.println(Message.getText());
		return Message;
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

	public WebElement getFolderSelectMessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please select a folder to create document";
		String actualtext = FolderSelectMessage.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(FolderSelectMessage.getText());
		jsclick(CommentOK);
		return FolderSelectMessage;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement addpagesMessage;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement CommentOKbutton;

	public WebElement getFolder_ErrorMessage() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please add pages to the template before creating!";
		String actualtext = addpagesMessage.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println(addpagesMessage.getText());
		jsclick(CommentOKbutton);
		return addpagesMessage;
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

	public WebElement getvalidationerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "*Template name should be specified.";
		String actualtext = validationerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println(validationerror.getText());
		return validationerror;
	}

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Createdoc;

	public WebElement getCreatedoc() {
		return Createdoc;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Reportvaluevalidationerror;

	public WebElement getReportvaluevalidationerror() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "ReportName*  	field is required";
		String actualtext = Reportvaluevalidationerror.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println(Reportvaluevalidationerror.getText());
		jsclick(CommentOKbutton);
		return Reportvaluevalidationerror;
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

	public WebElement getFilenamevalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please enter file name ";
		String actualtext = Filenamevalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println(Filenamevalidation.getText());
		jsclick(CommentOKbutton);
		return Reportvaluevalidationerror;
	}

	@FindBy(xpath = "//*[@id=\"createDocumentMessage\"]")
	private WebElement NavigateDoc;
	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement NavigateButton;

	public WebElement getNavigateDoc() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Document created successfully";
		String actualtext = NavigateDoc.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println(NavigateDoc.getText());
		jsclick(NavigateButton);
		return Reportvaluevalidationerror;
	}

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Formmappingvalidation;
	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement FormOKbutton;

	public WebElement getFormmappingvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Please add form fields before mapping.";
		String actualtext = Formmappingvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println(Formmappingvalidation.getText());
		jsclick(FormOKbutton);
		return FolderSelectMessage;
	}

	// Load More count

	@FindBy(xpath = "//input[@id='loadmorecount']")
	private WebElement Enter_Loadmorecount;

	public WebElement getEnter_Loadmorecount() throws Exception {
		WebElement ele = Enter_Loadmorecount;
		ele.click();
		ele.clear();
		ele.sendKeys("40");
		return Enter_Loadmorecount;
	}

	@FindBy(xpath = "//span[@id='totalSearchCount']")
	private WebElement Verify_Loadmorecount_Searchresult;

	public WebElement getVerify_Loadmorecount_Searchresult() throws Exception {
		WebElement count = Verify_Loadmorecount_Searchresult;
		System.out.println("The " + count.getText());
		return Verify_Loadmorecount_Searchresult;
	}

	@FindBy(xpath = "//strong[@id='docCount']")
	private WebElement Verify_Loadmorecount_Document_Folder;

	public WebElement getVerify_Loadmorecount_Document_Folder() throws Exception {
		WebElement DocDisplay = Verify_Loadmorecount_Document_Folder;
		System.out.println("Verify and " + DocDisplay.getText());
		return Verify_Loadmorecount_Document_Folder;
	}

	@FindBy(xpath = "//*[@id=\"loadMoreDocList\"]/button")
	private WebElement Loadmorebutton;

	public WebElement getLoadmorebutton() throws Exception {
		return Loadmorebutton;

	}

	@FindBy(xpath = ("(//a[text()='CVApp Test'])[1]"))
	private WebElement Cabinet;

	public WebElement getCabinet() {
		return Cabinet;
	}

	@FindBy(xpath = ("//a[text()='CVMobile App 2022']"))
	private WebElement Drawer;

	public WebElement getDrawer() {
		return Drawer;
	}

	@FindBy(xpath = ("//a[text()='Test apk']"))
	private WebElement Folder;

	public WebElement getFolder() {
		return Folder;
	}

	@FindBy(xpath = "//a[@id='advSearchMenuBtn']")
	private WebElement Click_Search_Option;

	public WebElement getClick_Search_Option() {
		return Click_Search_Option;
	}

	@FindBy(id = "advFindBtnLabel")
	private WebElement Find_Button;

	public WebElement getFind_Button() {
		return Find_Button;
	}

	// Custom Columns

	@FindBy(id = "CustomList")
	private WebElement CustomColumnOption;

	public WebElement getCustomColumnOption() {
		return CustomColumnOption;
	}

	@FindBy(id = "todoAll")
	private WebElement Select_All_Item;

	@FindBy(id = "todoResetColumns")
	private WebElement To_Do_Resetcolumn_Option;

	@FindBy(id = "resetColumsOk")
	private WebElement ToDoList_Reset_Column_OK_Button;

	@FindBy(xpath = "//span[@id='spanCheckCustomValues_Text key']")
	private WebElement Select_Indices01;

	@FindBy(xpath = "//span[@id='spanCheckCustomValues_Numeric 123']")
	private WebElement Select_Indices02;

	@FindBy(xpath = "//span[@id='spanCheckCustomValues_Date 123']")
	private WebElement Select_Indices03;

	@FindBy(id = "setCustomListdropdown")
	private WebElement Click_DropdownOption;

	@FindBy(id = "spanCheckCustomValues_Bill Number")
	private WebElement Set_RoomLevel_Indices;

	@FindBy(id = "Resetcolumns")
	private WebElement Reset_Column_option;

	@FindBy(id = "resetColumsOk")
	private WebElement ResetColumn_popup_OK_button;

	@FindBy(id = "culstomcolsearch")
	private WebElement Search_Custom_Columns_option;

	@FindBy(xpath = "//span[@id='spanCheckCustomValues_Document Size']")
	private WebElement Search_Select_Indices01;
	@FindBy(xpath = "//span[@id='spanCheckCustomValues_Current date']")
	private WebElement Search_Select_Indices02;
	@FindBy(xpath = "//span[@id='spanCheckCustomValues_ReportName']")
	private WebElement Search_Select_Indices03;

	@FindBy(id = "Defaultcolsearch")
	private WebElement Click_ResetColumn;

	@FindBy(id = "resetColumsOk")
	private WebElement Ok_Button_ResetColumn;

	@FindBy(id = "todoCustomColumns")
	private WebElement ToDoList_Custom_Columns_option;

	@FindBy(id = "navigationMenuBtn")
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

	@FindBy(css = "div[id='CustomUserTitle'] h2[class='headerText']")
	private WebElement titelvalidation;

	public WebElement gettitelvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = titelvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return titelvalidation;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/label[1]")
	private WebElement textlvalidation;
	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/div[2]/h2[1]")
	private WebElement textlvalidation2;

	public WebElement getextvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Set custom columns";
		String actualtext = textlvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		String expectedtext2 = "Select the indices you want display for documents";
		String actualtext2 = textlvalidation2.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		return textlvalidation;
	}

	@FindBy(id = "CustomListOK")
	private static WebElement ele;

	public WebElement Ok_Button_CustomList(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	public static WebElement Scroll_Button(WebDriver driver) {
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).clickAndHold().perform();
		}
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).release().perform();
		}
		return element;
	}

	@FindBy(xpath = "//th[contains(text(),'DATE 123')]")
	private static WebElement DATE;
	@FindBy(xpath = "//th[contains(text(),'NUMERIC 123')]")
	private static WebElement NUMERIC;
	@FindBy(xpath = "//th[contains(text(),'TEXT KEY')]")
	private static WebElement TEXT;

	public WebElement Verify_Indicess_Value(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "DATE 123";
		String actualtext = DATE.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Indices01 value displayed successfully" + DATE.getText());
		Thread.sleep(4000);
		String expectedtext1 = "NUMERIC 123";
		String actualtext1 = NUMERIC.getAttribute("value");
		softassert.assertEquals(actualtext1, expectedtext1, "Text verification failed");
		System.out.println("Indices02 value displayed successfully" + NUMERIC.getText());
		Thread.sleep(4000);
		String expectedtext2 = "TEXT KEY";
		String actualtext2 = TEXT.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		System.out.println("Indices03 value displayed successfully" + TEXT.getText());
		return element;

	}

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement Default_Button_CustomList;

	public static WebElement Default_Button_CustomList(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Default_Button_CustomList);
		return Default_Button_CustomList;
	}

	@FindBy(xpath = "//button[@id='CustomListCancel']")
	private static WebElement Cancel_Button_CustomList;

	public static WebElement Cancel_Button_CustomList(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Cancel_Button_CustomList);
		return Cancel_Button_CustomList;
	}

	public WebElement Select_DropdownValue(WebDriver driver) {
		WebElement dropdown = driver.findElement(By.id("setCustomListdropdown"));
		jsclick(dropdown.findElement(By.xpath("//option[. = 'Room level']")));
		return element;
	}

	public WebElement Verify_CompactView_checkbox(WebDriver driver) {
		if (driver.findElement(By.id("displayCompactViewOfList")).isSelected() == true) {
			jsclick(driver.findElement(By.id("displayCompactViewOfList")));
		}
		return element;
	}

	// Search *

	@FindBy(xpath = "//a[@id='advSearchMenuBtn']")
	private WebElement MoveTo_Search_Option;

	public WebElement MoveTo_Search_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Search_Option).perform();
		return MoveTo_Search_Option;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/div[1]/h2[1]")
	private WebElement Search_titelvalidation;

	public WebElement getSearch_titelvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = Search_titelvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return Search_titelvalidation;
	}

	@FindBy(xpath = "//h2[contains(text(),'Select the indices you want display for documents')]")
	private WebElement Search_textvalidation;

	public WebElement getSearch_textvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Select the indices you want display for documents";
		String actualtext = Search_textvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return Search_textvalidation;
	}

	public static WebElement Search_Scroll_Button(WebDriver driver) {
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).clickAndHold().perform();
		}
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).release().perform();
		}
		return element;
	}

	@FindBy(xpath = "//button[@id='CustomListOK']")
	private static WebElement Search_Ok_Button_CustomList;

	public static WebElement Search_Ok_Button_CustomList(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Search_Ok_Button_CustomList);
		return Search_Ok_Button_CustomList;
	}

	@FindBy(xpath = "//th[contains(text(),'DOCUMENT SIZE')]")
	private static WebElement DocumentSize;
	@FindBy(xpath = "//th[contains(text(),'CURRENT DATE')]")
	private static WebElement Currentdate;
	@FindBy(xpath = "//th[contains(text(),'REPORTNAME')]")
	private static WebElement REPORTNAME;

	public WebElement Search_Verify_Indicess_Value4(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "DOCUMENT SIZE";
		String actualtext = DocumentSize.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Indices value displayed successfully" + DocumentSize.getText());
		return element;
	}

	public WebElement Search_Verify_Indicess_Value5(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "CURRENT DATE";
		String actualtext = Currentdate.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Indices value displayed successfully" + Currentdate.getText());
		return element;
	}

	public WebElement Search_Verify_Indicess_Value6(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "REPORTNAME";
		String actualtext = REPORTNAME.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Indices value displayed successfully" + REPORTNAME.getText());
		return element;
	}

	// ToDoList *

	@FindBy(xpath = "//a[@id='myTaskMenu']")
	private WebElement MoveTo_ToDoList_Option;

	public WebElement MoveTo_ToDoList_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_ToDoList_Option).perform();
		return MoveTo_ToDoList_Option;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/div[1]/h2[1]")
	private static WebElement titlevalidation;

	public WebElement ToDoList_titelvalidation(WebDriver driver) {

		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = titlevalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return element;

	}

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/div[2]/h2[1]")
	private static WebElement textvalidation;

	public WebElement ToDoList_textvalidation(WebDriver driver) {

		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Select the indices you want display for documents";
		String actualtext = textvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return element;
	}

	public static WebElement ToDoList_Scroll_Button(WebDriver driver) {
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).clickAndHold().perform();
		}
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).release().perform();
		}
		return element;
	}

	@FindBy(id = "CustomListTodoOK")
	private static WebElement ToDoList_Ok_Button_CustomList;

	public static WebElement ToDoList_Ok_Button_CustomList(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ToDoList_Ok_Button_CustomList);
		return ToDoList_Ok_Button_CustomList;
	}

	@FindBy(xpath = "//input[@id='folderLocationForSearch']")
	private static WebElement Document_Location;

	public WebElement getDocument_Location(WebDriver driver) throws InterruptedException {
		return Document_Location;

	}

	@FindBy(xpath = "//button[@id='navigatorTreeOk1']")
	private static WebElement Ok_button;

	public WebElement getOk_button(WebDriver driver) throws InterruptedException {
		return Ok_button;

	}

	@FindBy(xpath = "(//ins[@class='jstree-icon'])[41]")
	private static WebElement CabinetPlus;

	public WebElement getCabinetPlus(WebDriver driver) throws InterruptedException {
		return CabinetPlus;

	}

	@FindBy(xpath = "(//ins[@class='jstree-icon'])[43]")
	private static WebElement DrawerPlus;

	public WebElement getDrawerPlus(WebDriver driver) throws InterruptedException {
		return DrawerPlus;

	}

	@FindBy(xpath = "(//a[@href='#'])[23]")
	private static WebElement Folder1;

	public WebElement getFolder1(WebDriver driver) throws InterruptedException {
		return Folder;

	}

	@FindBy(xpath = "//a[@id='documentListSubMenu']")
	private WebElement MoveTo_Menu_Documents;

	public WebElement getMoveTo_Menu_Documents() {
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		return MoveTo_Menu_Documents;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]")
	private static WebElement getSelect_Document;

	public WebElement getSelectDoc(WebDriver driver) throws InterruptedException {
		return getSelect_Document;
	}

	@FindBy(id = "sendtoworkflow")
	private static WebElement sendWorkflow;

	public WebElement getsendWorkflow(WebDriver driver) throws InterruptedException {
		return sendWorkflow;
	}

	@FindBy(css = "#assignedWfTable td")
	private static WebElement WFAssign;

	public WebElement getWFAssign(WebDriver driver) throws InterruptedException {
		return WFAssign;
	}

	@FindBy(id = "copyId")
	private WebElement Copy_ID;
	@FindBy(id = "pasteid")
	private WebElement Paste_ID;

	public WebElement getVerify_CopyandPaste_Document() throws InterruptedException {

		jsclick(Copy_ID);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		jsclick(Paste_ID);
		return Paste_ID;
	}

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBox;

	public WebElement getSearchBoxIndices1() throws Exception {
		SearchBox.sendKeys(Language_excelRead(1, 1));
		return SearchBox;
	}

	public WebElement getSearchBoxIndices2() throws Exception {
		SearchBox.sendKeys(Language_excelRead(2, 1));
		return SearchBox;
	}

	public WebElement getSearchBoxIndices3() throws Exception {
		SearchBox.sendKeys(Language_excelRead(3, 1));
		return SearchBox;
	}

	@FindBy(xpath = "//*[@id=\"customListModelClose\"]")
	private WebElement Crosscancel;

	public WebElement getCrosscancel() throws Exception {
		return Crosscancel;
	}

	public WebElement getSearchBoxIndices4() throws Exception {
		SearchBox.sendKeys(Language_excelRead(4, 1));
		return SearchBox;
	}

	public WebElement getSearchBoxIndices5() throws Exception {
		SearchBox.sendKeys(Language_excelRead(5, 1));
		return SearchBox;
	}

	public WebElement getSearchBoxIndices6() throws Exception {
		SearchBox.sendKeys(Language_excelRead(6, 1));
		return SearchBox;
	}

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValuesTodolist_Workflow Status\"]")
	private WebElement ToDoList_Select_Indices01;

	public WebElement getToDoList_Select_Indices01() {
		return ToDoList_Select_Indices01;
	}

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBoxTODO;

	public WebElement getSearchBoxIndices7() throws Exception {
		jsclick(SearchBoxTODO);
		SearchBoxTODO.sendKeys(Language_excelRead(7, 1));
		return SearchBoxTODO;
	}

	@FindBy(xpath = "//th[contains(text(),'WORKFLOW STATUS')]")
	private static WebElement WORKFLOWSTATUS;

	public WebElement ToDoList_Verify_Indicess_Value(WebDriver driver) throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "WORKFLOW STATUS";
		String actualtext2 = WORKFLOWSTATUS.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		System.out.println("Indices value displayed successfully" + WORKFLOWSTATUS.getText());
		return element;
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

	@FindBy(id = "logedinusername")
	private WebElement Click_Username;

	public WebElement getClick_Username() {
		return Click_Username;
	}

	@FindBy(linkText = "Logout")
	private WebElement Click_LogoutOption;

	public WebElement getClick_LogoutOption() {
		return Click_LogoutOption;
	}

	//
	public void login_New_User() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(Language_excelRead(9, 2));
		driver.findElement(By.id("loginPassword")).sendKeys(Language_excelRead(1, 3));
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

	@FindBy(xpath = "//*[@id=\"documentListTable\"]/tbody/tr[1]/td[3]")
	private WebElement Open_Document;

	public WebElement getOpen_Document() {
		return Open_Document;
	}

	@FindBy(xpath = "//span[@id='docOwnerName']")
	private WebElement Docownername;
	@FindBy(xpath = "//span[contains(text(),'Open in view only mode?')]")
	private WebElement openviewonly;
	@FindBy(id = "ownershipMessageModelOk")
	private WebElement ownershipmessageok;

	public WebElement getVerify_Ownership_Message() throws InterruptedException {
		WebElement Message1 = Docownername;
		System.out.println("Take Ownership Message " + Message1.getText());
		WebElement Message2 = openviewonly;
		System.out.println("Take Ownership Message " + Message2.getText());
		jsclick(ownershipmessageok);
		return Docownername;
	}

	@FindBy(id = "releaseOwnership")
	private WebElement Select_Option_ReleaseOwnership;

	public WebElement getSelect_Option_ReleaseOwnership() {
		WebElement ele1 = Select_Option_ReleaseOwnership;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return Select_Option_ReleaseOwnership;
	}

	@FindBy(id = "refreshDocuments")
	private WebElement Select_Option_Refresh;

	public WebElement getSelect_Option_Refresh() {
		WebElement ele1 = Select_Option_Refresh;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele1);
		return Select_Option_Refresh;
	}

	@FindBy(id = "documentSetcolour")
	private WebElement Select_Option_Catagories_andSet_Colors;
	@FindBy(id = "CustomColourid_5")
	private WebElement Select_Colors;

	public WebElement getSelect_Option_Catagories_andSet_Colors() throws InterruptedException {
		Thread.sleep(2000);
		jsclick(Select_Option_Catagories_andSet_Colors);
		Thread.sleep(4000);
		jsclick(Select_Colors);
		return Select_Option_Catagories_andSet_Colors;
	}

	@FindBy(id = "cutid")
	private WebElement Cut_ID;
	@FindBy(linkText = "subfolder")
	private WebElement subfolder;

	public WebElement getVerify_CutandPaste_Document() throws InterruptedException {

		jsclick(Cut_ID);
		Thread.sleep(6000);
		jsclick(subfolder);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(Paste_ID);
		return Paste_ID;
	}

	@FindBy(css = ".odd .checkmark")
	private WebElement check;
	@FindBy(id = "delDocument")
	private WebElement deletedoc;
	@FindBy(id = "deleteMessageOk")
	private WebElement deleteOK;

	public WebElement getVerify_Delete_Document() throws InterruptedException {
		jsclick(check);
		Thread.sleep(6000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(6000);
		jsclick(deletedoc);
		Thread.sleep(6000);
		jsclick(deleteOK);
		return deleteOK;
	}

	@FindBy(css = ".odd:nth-child(1) .checkmark")
	private WebElement checkdoc;
	@FindBy(id = "documentcreatefav")
	private WebElement createFavorite;
	@FindBy(id = "createFavText")
	private WebElement createFavoriteText;
	@FindBy(id = "createFavModelOk")
	private WebElement createFavoriteOK;

	public WebElement getVerify_CreateFavorites_Document() throws Exception {

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
		createFavoriteText.sendKeys(Language_excelRead(2, 3));
		Thread.sleep(6000);
		jsclick(createFavoriteOK);
		return createFavoriteOK;
	}

	@FindBy(css = "#bookmarkid > img")
	private WebElement bookmark;
	@FindBy(id = "loadAllfavrites")
	private WebElement loadfav;
	@FindBy(id = "searchFav")
	private WebElement Searchfav;
	@FindBy(css = "#createfavshowAllModelTabel td:nth-child(1)")
	private WebElement doc;

	public WebElement getOpen_CreateFavorites_Document() throws Exception {
		Thread.sleep(6000);
		element = bookmark;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(4000);
		jsclick(loadfav);
		Thread.sleep(8000);
		jsclick(Searchfav);
		Thread.sleep(8000);
		Searchfav.sendKeys(Language_excelRead(2, 3));
		Thread.sleep(8000);
		jsclick(doc);
		return doc;
	}

	@FindBy(id = "sendtoworkflow")
	private WebElement Workflow;
	@FindBy(css = "#assignedWfTable .odd:nth-child(13) > td")
	private WebElement AutoWorkflow;
	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement customdoc;
	@FindBy(id = "ownershipMessageModelOk")
	private WebElement ownershipok;
	@FindBy(css = "#cvDocumentClose > .icon")
	private WebElement closedoc;

	public WebElement getCreate_SendToWorkflow_Document() throws Exception {

		jsclick(Workflow);
		Thread.sleep(4000);
		jsclick(AutoWorkflow);
		Thread.sleep(4000);
		jsclick(customdoc);
		Thread.sleep(6000);
		WebElement Message1 = Docownername;
		System.out.println("Take Ownership Message " + Message1.getText());
		Thread.sleep(4000);
		WebElement Message2 = openviewonly;
		System.out.println("Take Ownership Message " + Message2.getText());
		Thread.sleep(4000);
		jsclick(ownershipok);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(4000);
		jsclick(closedoc);
		return closedoc;

	}

	@FindBy(id = "notificationSettings")
	private WebElement notification;
	@FindBy(id = "contentverseRef")
	private WebElement contref;
	@FindBy(id = "documentHistory")
	private WebElement dochistory;
	@FindBy(css = "#dropdownNotifylist a")
	private WebElement notifylist;
	@FindBy(id = "spanCheckNotifications_1")
	private WebElement checknotification;
	@FindBy(id = "notifySaveBtn")
	private WebElement savenotify;
	@FindBy(linkText = "Test apk")
	private WebElement Testapk;
	@FindBy(css = ".odd:nth-child(1) > .customDocName")
	private WebElement customdocname;
	@FindBy(xpath = "//*[@id=\"general\"]/div/div[1]/span")
	private WebElement general;

	public WebElement getCreate_Notification_Document() throws Exception {
		Thread.sleep(6000);
		jsclick(notification);
		Thread.sleep(6000);
		jsclick(contref);
		jsclick(dochistory);
		Thread.sleep(6000);
		jsclick(notifylist);
		Thread.sleep(6000);
		jsclick(checknotification);
		jsclick(savenotify);
		Thread.sleep(6000);
		jsclick(Testapk);
		Thread.sleep(7000);
		jsclick(customdocname);
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		jsclick(general);
		Thread.sleep(8000);
		return element;

	}

	@FindBy(css = "#saveAddedPages > .icon")
	private WebElement saveaddpage;
	@FindBy(id = "messageButtonOK42")
	private WebElement okbutton;

	public WebElement getSave_Signature_Document() throws Exception {
		jsclick(saveaddpage);
		Thread.sleep(8000);
		jsclick(okbutton);
		return okbutton;
	}

	public WebElement getClose_Document() throws Exception {
		element = closedoc;
		return element;
	}

	@FindBy(id = "documentSendTo")
	private WebElement sendTo;
	@FindBy(id = "sendToMail")
	private WebElement sendToMail;
	@FindBy(id = "convertToPdfChk")
	private WebElement converttopdf;
	@FindBy(id = "retainPdfColorExport1")
	private WebElement colorexport;
	@FindBy(id = "convertToPdfQuality")
	private WebElement pdfquality;
	@FindBy(id = "certifiedCoverPage")
	private WebElement coverpage;
	@FindBy(id = "compressToZip")
	private WebElement compresszip;
	@FindBy(id = "sendToPassword")
	private WebElement sendtopassword;
	@FindBy(id = "zipPasswordInputpdf")
	private WebElement zippassinput;
	@FindBy(id = "runAnnotations")
	private WebElement Runannotation;
	@FindBy(id = "toEmial")
	private WebElement toemail;
	@FindBy(id = "subjectid")
	private WebElement subid;
	@FindBy(id = "saveSendToDocument")
	private WebElement savesendto;
	@FindBy(xpath = "(//button[@id='messageButtonOK'])[1]")
	private WebElement sentmailOK;
	@FindBy(xpath = ("(//button[@class='modalDialogButtons'])[1]"))
	private WebElement EmailsuccessMessageDialogboxOK;

	public WebElement getSentTo_Mail_asCopy() throws Exception {

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
		zippassinput.sendKeys(Language_excelRead(3, 3));
		Thread.sleep(2000);
		jsclick(Runannotation);
		Thread.sleep(2000);
		jsclick(toemail);
		Thread.sleep(2000);
		toemail.sendKeys(Language_excelRead(4, 3));
		Thread.sleep(2000);
		jsclick(subid);
		Thread.sleep(2000);
		subid.sendKeys(Language_excelRead(5, 3));
		Thread.sleep(4000);
		jsclick(savesendto);
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);
		return sendTo;

	}

	@FindBy(id = "sendDocAsReference")
	private WebElement Referencemail;

	public WebElement getSentTo_Mail_asReference() throws Exception {

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
		toemail.sendKeys(Language_excelRead(4, 3));
		Thread.sleep(3000);
		jsclick(subid);
		Thread.sleep(3000);
		subid.sendKeys(Language_excelRead(5, 3));
		Thread.sleep(4000);
		jsclick(savesendto);
		WebDriverWait wait = new WebDriverWait(driver, 150);
		wait.until(ExpectedConditions.elementToBeClickable(EmailsuccessMessageDialogboxOK));
		jsclick(EmailsuccessMessageDialogboxOK);
		return Referencemail;
	}

	@FindBy(id = "sendToPrint")
	private WebElement sendtoPrint;
	@FindBy(id = "certifiedCoverPagePrint")
	private WebElement pageprint;
	@FindBy(id = "includeRouteSummaryPrint")
	private WebElement summaryprint;
	@FindBy(id = "unlockRedactionsWithPrint")
	private WebElement withunlockredaction;
	@FindBy(id = "unlockRedactionsPwdPrint")
	private WebElement pwdunlockredaction;
	@FindBy(id = "printDocumentOnView")
	private WebElement printview;

	public WebElement getSentTo_Print() throws Exception {
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
		pwdunlockredaction.sendKeys(Language_excelRead(3, 3));
		Thread.sleep(4000);
		jsclick(printview);
		return printview;
	}

	@FindBy(id = "sendToExport")
	private WebElement sendexport;
	@FindBy(id = "retainFormatChkExport")
	private WebElement retainchkexport;
	@FindBy(id = "includeRouteSummary")
	private WebElement Routesummary;
	@FindBy(xpath = "//*[@id=\"zipPasswordInput\"]")
	private WebElement Zippassword;
	@FindBy(id = "convertToPdfChkExport")
	private WebElement convertpdfexport;
	@FindBy(id = "exportAnnotations")
	private WebElement exportannotation;
	@FindBy(id = "unlockRedactionsWithExport")
	private WebElement exportwith;
	@FindBy(id = "unlockRedactionsPwdExport")
	private WebElement exportPwd;
	@FindBy(id = "zipPasswordInput")
	private WebElement Zippasswordinput;
	@FindBy(id = "pdfPasswordInput")
	private WebElement Pdfpasswordinput;

	public WebElement getSentTo_Export() throws Exception {
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
		Thread.sleep(3000);
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
		exportPwd.sendKeys(Language_excelRead(3, 3));
		Thread.sleep(3000);
		jsclick(Zippasswordinput);
		Thread.sleep(3000);
		Zippasswordinput.sendKeys(Language_excelRead(3, 3));
		Thread.sleep(3000);
		jsclick(Pdfpasswordinput);
		Thread.sleep(3000);
		Pdfpasswordinput.sendKeys(Language_excelRead(3, 3));
		Thread.sleep(3000);
		jsclick(savesendto);
		Thread.sleep(6000);
		return element;
	}

	@FindBy(id = "sendToSecureMail")
	private WebElement SecureMail;
	@FindBy(id = "recepientEmailId")
	private WebElement recpmail;
	@FindBy(id = "confirmEmailIdSecure")
	private WebElement Confirmemail;
	@FindBy(id = "modifyPermissionCheckbox")
	private WebElement modifychk;
	@FindBy(id = "navigatorTreeOk32")
	private WebElement navigateOK;
	@FindBy(id = "recipientMailIdSecond")
	private WebElement recpmailsec;
	@FindBy(id = "confirmEmailIdSecureSecond")
	private WebElement confirmemailsec;
	@FindBy(id = "navigatorTreeOk33")
	private WebElement navigateOK2;

	public WebElement getSentTo_SecureLink() throws Exception {
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
		recpmail.sendKeys(Language_excelRead(4, 3));
		Thread.sleep(3000);
		jsclick(Confirmemail);
		Thread.sleep(3000);
		Confirmemail.sendKeys(Language_excelRead(4, 3));
		Thread.sleep(3000);
		jsclick(modifychk);
		jsclick(navigateOK);
		Thread.sleep(3000);
		recpmailsec.sendKeys(Language_excelRead(4, 3));
		jsclick(confirmemailsec);
		Thread.sleep(3000);
		confirmemailsec.sendKeys(Language_excelRead(4, 3));
		Thread.sleep(3000);
		jsclick(navigateOK2);
		Thread.sleep(6000);
		return SecureMail;
	}

	@FindBy(id = "generateDocumentLink")
	private WebElement generatedoc;
	@FindBy(id = "documentLinkOk")
	private WebElement doclinkok;

	public WebElement getSentTo_GenerateDocumentLink() throws Exception {
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
		return doclinkok;
	}

	@FindBy(xpath = "//*[@id=\"ocrPopUp\"]")
	private WebElement ocrpopup;

	public WebElement getocrpopup() {
		return ocrpopup;

	}  
	
	@FindBy(xpath = "//*[@id=\"33\"]")
	private WebElement ReportID;

	public WebElement getReportID() {
		return ReportID;

	}  
	@FindBy(xpath = "//*[@id=\"Underscore _.pdf\"]/div/img")
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
	
	public WebElement getOCRReportnamevalidation_BeforeCreateDOC() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "MORTHWEST MEDICAT";
		String actualtext = ReportNameValueBeforeDoc.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println("Report Name is " + ReportNameValueBeforeDoc.getText());
		return element;
	}
	
	@FindBy(xpath = "//td[contains(text(),'Export Documentaryv Credit (DC) Bill Ne¢')]")
	private static WebElement ReportNameValueAfterDoc;
	public WebElement getReportNameValueAfterDoc() {
		return ReportNameValueAfterDoc;
	}

	public WebElement getOCRReportnamevalidation_AfterCreateDOC() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Export Documentaryv Credit (DC) Bill Ne¢";
		String actualtext = ReportNameValueAfterDoc.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verified");
		System.out.println("Report Name is " + ReportNameValueAfterDoc.getText());
		return element;
	}
	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_Button;

	public WebElement getNavigate_Button() {
		return Navigate_Button;

	}
	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement Navigate_Button_view;

	public WebElement getNavigate_Button_view() {
		return Navigate_Button_view;

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
}