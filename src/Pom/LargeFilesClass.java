package Pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Generic.BaseClass;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class LargeFilesClass extends BaseClass {

	public LargeFilesClass() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = ("//a[@id='createDocument']"))
	private WebElement NewDocuments_MenuOption;

	@FindBy(xpath = ("//input[@id='createDocuemtnLocation']"))
	private WebElement Destination_Folder_Textbox;

	@FindBy(xpath = ("//div[@id='createDocuemntNavigator']/ul/li[2]/a"))
	private WebElement Select_CabinetDest;

	@FindBy(xpath = ("//div[@id='createDocuemntNavigator']/ul/li[2]/ul/li/a"))
	private WebElement Select_DrawerDest;

	@FindBy(xpath = ("//div[@id='createDocuemntNavigator']/ul/li[2]/ul/li/ul/li/a"))
	private WebElement Select_FolderDest;

	@FindBy(xpath = "//button[@id='navigatorTreeOk']")
	private WebElement OK_Button_BrowseforFolder;

	@FindBy(id = "docTypeList")
	private WebElement Click_Document_Type_Dropdown;

	public void getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");

	}

	public void getClick_FileInfo_OkButton_withFileName() {
		WebElement Filename = Click_FileInfo_OkButton_withFileName;
		System.out.println("File name is:" + Filename.getText());

		// ele.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", RemarkOk);

	}

	@FindBy(xpath = "//span[@id='fileNameLabel']")
	private WebElement Click_FileInfo_OkButton_withFileName;

	@FindBy(xpath = "//button[@id='fileRenameOK']")
	private WebElement RemarkOk;

	@FindBy(xpath = "//*[@id=\"docTypeIndicesTable_wrapper\"]/table/tbody/tr/td[2]/input")
	private WebElement Enter_Report_Name_Text;

	@FindBy(xpath = "//*[@id='viewDocumentAddPages']")
	private WebElement Browse_OptionNish;

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIconNish;

	@FindBy(xpath = "//div[@id='fileInfoButton']//span[contains(@class,'fileinformationBtn')]")
	private WebElement Click_FileInfo_Option;

	@FindBy(xpath = "//button[@id='createDocumentSubmit']")
	private WebElement Create_Button;

	@FindBy(xpath = "//button[@id='viewCreatedDocument']")
	private WebElement View_Button;

	@FindBy(xpath = "//*[@id=\"saveAddedPages\"]/span")
	private WebElement Save_button;

	@FindBy(id = "messageButtonOK42")
	private WebElement DocumentSave_Ok_button;

	public void Upload_and_verify_Large_PDF_file() throws Exception {

		Reporter.log("Scenario 01: Add large PDF file");
		// jsclick(pojo.getRefresh_button());
		Thread.sleep(4000);
		jsclick(NewDocuments_MenuOption);
		Reporter.log("Click on new document menu tab");
		Thread.sleep(4000);
		jsclick(Destination_Folder_Textbox);
		Reporter.log("Click on destination folder textbox");
		Thread.sleep(4000);
		ElementToBeClickable(Select_CabinetDest);
		Reporter.log("Expand cabinet");
		selectElement(Select_CabinetDest);
		Thread.sleep(3000);
		Reporter.log("Expand drawer");
		ElementToBeClickable(Select_DrawerDest);
		selectElement(Select_DrawerDest);
		Thread.sleep(4000);
		Reporter.log("Select the folder");
		jsclick(Select_FolderDest);
		Thread.sleep(4000);
		Reporter.log("Folder is selected for Create New Documents", true);
		jsclick(OK_Button_BrowseforFolder);
		Reporter.log("Click on select folder dialog OK button");
		Thread.sleep(4000);
		getSelect_Document_Type_Dropdown();
		Reporter.log("Select a document type");
		Thread.sleep(4000);

		sendvalue(Enter_Report_Name_Text, readFromRoomCntxt(8, 2));
		// pojo.getEnter_Report_Name_Text().sendKeys("LargePDF Document ><?:??");
		Reporter.log("Enter document name");
		Thread.sleep(3000);
		movingElement(Move_To_PlusIconNish);

		try {
			Actions act = new Actions(driver);
			act.moveToElement(Browse_OptionNish).click().build().perform();
		} catch (JavascriptException e) {
			System.out.println("Exception there");
		}

		Thread.sleep(15000);

		// Runtime.getRuntime().exec("D:\\RNishaAutoIt\\LArgePDF.exe");
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\ForBothBrowser.exe");
		Thread.sleep(8000);
		Reporter.log("Add a file  by using auto IT");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert not present");
		}
		Thread.sleep(5000);
		jsclick(Create_Button);
		Reporter.log("Click on create button");
		Thread.sleep(4000);
		jsclick(View_Button);
		Reporter.log("Click on view button");
		Thread.sleep(6000);
		/*
		 * pojo.getClick_FileInfo_Option(); Thread.sleep(4000);
		 * pojo.getClick_FileInfo_OkButton_withFileName();
		 */
		Thread.sleep(6000);
		jsclick(Save_button);
		Reporter.log("Click on save button");
		Thread.sleep(4000);
		jsclick(DocumentSave_Ok_button);
		Reporter.log("Click on save tab OK button");
		Thread.sleep(10000);
		Reporter.log("Large PDF file added successfully...");
		jsclick(Refresh_Button(driver));
		// Reporter.log("User click on refresh icon");
	}

	public void Upload_and_verify_Large_TIFF_file() throws Exception {

		// jsclick(pojo.getRefresh_button());
		Reporter.log("Scenario 02: Add large TIFF file");
		try {
			loginCVS();
		} catch (Exception e) {
			System.out.println("Browser Not Closed");
		}
		Thread.sleep(4000);
		Reporter.log("Click on new document menu tab");
		jsclick(NewDocuments_MenuOption);
		Reporter.log("Click on destination folder textbox");
		Thread.sleep(4000);
		jsclick(Destination_Folder_Textbox);
		Reporter.log("Expand cabinet");
		Thread.sleep(4000);
		ElementToBeClickable(Select_CabinetDest);
		selectElement(Select_CabinetDest);
		Reporter.log("Expand drawer");
		Thread.sleep(6000);
		ElementToBeClickable(Select_DrawerDest);
		selectElement(Select_DrawerDest);
		Thread.sleep(6000);
		Reporter.log("Select a folder");
		jsclick(Select_FolderDest);
		Thread.sleep(4000);
		Reporter.log("Click on browse folder dialog OK button");
		Reporter.log("Folder is selected for Create New Documents", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(4000);
		Reporter.log("Select document type as CVReports");
		getSelect_Document_Type_Dropdown();
		Thread.sleep(4000);

		sendvalue(Enter_Report_Name_Text, readFromRoomCntxt(5, 2));
		// pojo.getEnter_Report_Name_Text().sendKeys("Large Tiff Document @#&*()^%");
		Reporter.log("Enter document name");
		Thread.sleep(4000);
		movingElement(Move_To_PlusIconNish);
		Reporter.log("Mouse hover on browse icon");

		try {
			Actions act = new Actions(driver);
			act.moveToElement(Browse_OptionNish).click().build().perform();
			Reporter.log("Select browse option");
		} catch (JavascriptException e) {
			System.out.println("Exception there");
		}

		Thread.sleep(20000);
		Reporter.log("Add a Large TIFF file from folder by using Auto IT script ");
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\LargeTiffFile.exe");
		Thread.sleep(10000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert not present");
		}
		Thread.sleep(5000);

		jsclick(Create_Button);
		Reporter.log("Click on create button");
		Thread.sleep(4000);
		jsclick(View_Button);
		Reporter.log("Click on view button");
		Thread.sleep(6000);
		jsclick(Click_FileInfo_Option);

		Thread.sleep(4000);
		getClick_FileInfo_OkButton_withFileName();
		Thread.sleep(6000);
		jsclick(Save_button);
		Reporter.log("Click on save button");
		Thread.sleep(4000);
		jsclick(DocumentSave_Ok_button);
		Reporter.log("Click on save dialog OK button");
		Thread.sleep(10000);
		Reporter.log("Large Tiff file added successfully...");

		jsclick(Refresh_Button(driver));
	}

	public void Upload_and_verify_Large_DOCX_file() throws Exception {

		Thread.sleep(4000);
		Reporter.log("Scenario 03: Add Large Word(DOCX) file");
		try {
			loginCVS();
		} catch (Exception e) {
			System.out.println("Browser Not Closed");
		}
		jsclick(NewDocuments_MenuOption);
		Reporter.log("Click on new document tab");
		Thread.sleep(4000);
		jsclick(Destination_Folder_Textbox);
		Reporter.log("Click on destination folder textbox");
		Thread.sleep(4000);
		ElementToBeClickable(Select_CabinetDest);
		Reporter.log("Expand cabinet");
		selectElement(Select_CabinetDest);
		Thread.sleep(6000);
		Reporter.log("Expand drawer");
		ElementToBeClickable(Select_DrawerDest);
		selectElement(Select_DrawerDest);
		Reporter.log("Select a folder");
		Thread.sleep(6000);
		jsclick(Select_FolderDest);
		Reporter.log("Click on Destination folder dialog OK button");
		Thread.sleep(4000);
		// Reporter.log("Folder is selected for Create New Documents", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(4000);
		Reporter.log("select a document type");
		getSelect_Document_Type_Dropdown();
		Thread.sleep(4000);
		Reporter.log("Enter a file name");

		sendvalue(Enter_Report_Name_Text, readFromRoomCntxt(6, 2));
		// pojo.getEnter_Report_Name_Text().sendKeys("Large Word Document #$%&^*()_");
		Thread.sleep(4000);
		movingElement(Move_To_PlusIconNish);
		Reporter.log("Mouse hover on browse icon");

		try {
			Actions act = new Actions(driver);
			act.moveToElement(Browse_OptionNish).click().build().perform();
			Reporter.log("Select browse option");
		} catch (JavascriptException e) {
			System.out.println("Exception there");
		}

		Thread.sleep(10000);
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\LargeWordFile.exe");
		Thread.sleep(5000);
		Reporter.log("Add large word file by using AutoIT script");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present!!!");
		}
		jsclick(Create_Button);
		Reporter.log("Click on create button");
		Thread.sleep(4000);
		jsclick(View_Button);
		Reporter.log("Click on view button");
		Thread.sleep(8000);

		jsclick(Save_button);
		Reporter.log("Click on save button");
		Thread.sleep(4000);
		jsclick(DocumentSave_Ok_button);
		Reporter.log("Click on save dialog OK button");
		Thread.sleep(10000);
		Reporter.log("Large Docx file added successfully...");

		jsclick(Refresh_Button(driver));
	}

	public void Upload_and_verify_Large_XLSX_file() throws Exception {
		Reporter.log("Scenario 04: Add Large EXCEL file");

		Thread.sleep(4000);
		jsclick(NewDocuments_MenuOption);
		Reporter.log("Click on new document tab");
		Thread.sleep(4000);
		jsclick(Destination_Folder_Textbox);
		Reporter.log("Select folder from destination folder dialog");
		Thread.sleep(4000);
		ElementToBeClickable(Select_CabinetDest);
		Reporter.log("Expand cabinet");
		selectElement(Select_CabinetDest);
		Thread.sleep(6000);
		Reporter.log("Expand drawer");
		ElementToBeClickable(Select_DrawerDest);
		selectElement(Select_DrawerDest);
		Thread.sleep(6000);
		Reporter.log("Select a folder");
		selectElement(Select_FolderDest);
		Thread.sleep(4000);
		Reporter.log("Folder is selected for Create New Documents", true);
		jsclick(OK_Button_BrowseforFolder);
		Reporter.log("Click on destination folder dialog OK button");
		Thread.sleep(4000);
		getSelect_Document_Type_Dropdown();
		Reporter.log("Click on document type dropdown");
		Thread.sleep(4000);
		Reporter.log("Select document type");

		sendvalue(Enter_Report_Name_Text, readFromRoomCntxt(7, 2));
		// pojo.getEnter_Report_Name_Text().sendKeys("Large excel
		// Document^%$#@*(+_+?><");
		Thread.sleep(4000);
		Reporter.log("Enter a file name");
		movingElement(Move_To_PlusIconNish);
		Reporter.log("Mouse hover on browse icon");

		try {
			Actions act = new Actions(driver);
			act.moveToElement(Browse_OptionNish).click().build().perform();

		} catch (JavascriptException e) {
			System.out.println("Exception there");
		}

		Thread.sleep(10000);
		Reporter.log("Click on browse option");
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\LargeXlxsFile.exe");
		Thread.sleep(10000);
		Reporter.log("Add large excel file from folder by using AutoIT script");
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 50);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present!!!");
		}
		jsclick(Create_Button);
		Reporter.log("Click on create button");
		Thread.sleep(4000);
		jsclick(View_Button);
		Reporter.log("Click on view button");
		Thread.sleep(8000);

		Thread.sleep(9000);
		jsclick(Click_FileInfo_OkButton_withFileName);
		Thread.sleep(6000);
		jsclick(Save_button);
		Thread.sleep(4000);
		jsclick(DocumentSave_Ok_button);
		Reporter.log("Click on save button");
		Thread.sleep(10000);
		Reporter.log("Click on save dialog button");
		Reporter.log("Large xlxs file added successfully...");

		jsclick(Refresh_Button(driver));
	}

}
