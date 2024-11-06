package Computhink.Pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import Computhink.Generic.BaseClass;
import Computhink.Script.Viewer;

//Dipak codes 
public class NewDocument extends BaseClass {
	public NewDocument() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = ("//a[@id='createDocument']"))
	private WebElement NewDocumentID;

	// @FindBy(xpath=("//*[@id='viewDocumentTypeList']"))
	// private WebElement DocTypeList;

	@FindBy(xpath = ("//*[@id='addPagesDropDown']/span"))
	private WebElement AddFileicon;

	@FindBy(xpath = ("//*[@id=\"createDocuemntNavigator\"]/ul/li[5]/ins"))
	private WebElement NishaCabinet;

	@FindBy(xpath = ("//*[@id=\"createDocuemntNavigator\"]/ul/li[5]/ul/li[1]/ins"))
	private WebElement NishaDrawer;

	@FindBy(xpath = ("//*[@id=\"createDocuemntNavigator\"]/ul/li[5]/ul/li[1]/ul/li/a"))
	private WebElement NishFolder;

	@FindBy(xpath = ("//input[@id='viewDocumentAddPages']"))
	private WebElement Browse;

	@FindBy(xpath = ("//*[@id=\"docTypeList\"]"))
	private WebElement DocTypeList;

	@FindBy(xpath = ("//input[@id='indices_33']"))
	private WebElement IndexValuetextbox;

	@FindBy(xpath = ("//*[@id='createDocuemtnLocation']"))
	private WebElement DestinationFolder;

	@FindBy(xpath = ("//div[@id='addDocdropdwn']"))
	private WebElement menuitem;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeOk\"]"))
	private WebElement DestinationLocationOKBTN;

	@FindBy(xpath = ("//div[@id='locationDiv']"))
	private WebElement Docfolderdiv;

	@FindBy(xpath = ("//*[@id=\"commentMessage\"]"))
	private WebElement DestinationFolderMessage;

	@FindBy(xpath = ("//*[@id=\"CommentsMessageModelOk\"]"))
	private WebElement ValidationMessageBoxOKBTN;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeCancle\"]"))
	private WebElement CancelBTNDestination;

	@FindBy(xpath = ("//*[@id=\"messageButtonOK\"]"))
	private WebElement DocTypeOKBTN;

	@FindBy(xpath = ("//*[@id=\"messageContent\"]"))
	private WebElement DocTypeMessage;

	@FindBy(xpath = ("//*[@id=\"docTypeList\"]/option[13]"))
	private WebElement CVReportIndice;

	@FindBy(xpath = ("//*[@id=\"messageContent\"]"))
	private WebElement FileNameMessage;

	public void CreateNewDocumentWithoutFolder() throws Exception {
		Reporter.log("Scneario 01: Create newdocument without folder");

		Thread.sleep(4000);
		Reporter.log("Click on Newdocument tab");
		jsclick(NewDocumentID);
		Thread.sleep(4000);
		Reporter.log("Click on create button");
		jsclick(CreateButton);
		Thread.sleep(3000);
		Reporter.log("Click on destination location textbox");
		jsclick(DestinationLocationOKBTN);
		Reporter.log("Click on destination location OK button without selecting a folder");
		Thread.sleep(3000);
		System.out.println("Validation Message :" + DestinationFolderMessage.getText());
		Reporter.log(
				"User should get 'Please select a folder to create document' warning message, Warning message displayed successfull");
		SoftAssertEqalValidation(DestinationFolderMessage, "Please select a folder to create document");
		Thread.sleep(3000);
		Reporter.log("Click on warning alert OK button");
		jsclick(ValidationMessageBoxOKBTN);
		Thread.sleep(3000);
		Reporter.log("Unable to create document without folder");

		jsclick(CancelBTNDestination);
	}

	public void CreateNewDocumentWithoutDocumentType() throws Exception {
		Reporter.log("Scenario 02:Create newdocument without document type");

		Thread.sleep(4000);

		jsclick(DestinationFolder);
		Reporter.log("Click on destination location textbox");

		Thread.sleep(4000);
		Reporter.log("Expand the cabinet");

		jsclick(NishaCabinet);
		Thread.sleep(4000);
		Reporter.log("Expand the drawer");
		ElementToBeClickable(NishaDrawer);
		jsclick(NishaDrawer);
		Thread.sleep(5000);
		jsclick(NishFolder);
		Reporter.log("Select a folder");
		Thread.sleep(2000);
		jsclick(DestinationLocationOKBTN);
		Reporter.log("Click on destination location OK button");
		Thread.sleep(3000);
		jsclick(CreateButton);
		Reporter.log("Click on create button without selecting document type");
		Thread.sleep(2000);
		System.out.println("Validation Message :" + DocTypeMessage.getText());
		Reporter.log("User should get 'Select document type' warning dialog");
		SoftAssertEqalValidation(DocTypeMessage, "Select document type");
		Thread.sleep(3000);
		Reporter.log("Unable to create document without document type");
		jsclick(DocTypeOKBTN);
	}

	public void CreateNewDocumentWithoutFileName() throws Exception {
		Thread.sleep(4000);
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		Reporter.log("Scenario 03: New document without file name");
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(3000);
		Reporter.log("Click on create ");
		jsclick(CreateButton);
		Thread.sleep(3000);
		System.out.println("Validation message:" + FileNameMessage.getText());
		Thread.sleep(2000);
		Reporter.log("User should get'ReportName*  	field is required' warning message");
		Reporter.log("Unable to create a document without file name");
		SoftAssertEqalValidation(FileNameMessage, "ReportName*  	field is required");
		jsclick(DocTypeOKBTN);

		Thread.sleep(5000);
	}

	/*
	 * @FindBy(id="createDocuemtnLocation") private WebElement
	 * BrowseFolderNavigator;
	 * 
	 * @FindBy(xpath=(".//*[@id='createDocuemntNavigator']/ul/li")) private
	 * WebElement cabinetId;
	 * 
	 * @FindBy(id="navigatorTreeOk") private WebElement navigatorTreeOkButton;
	 */

	// @FindBy(id="logedinusername")
	// private WebElement LoggedInUser;
	//
	/*
	 * @FindBy(xpath=("//*[@class='elementBody']/div/table/tbody/tr/td/input"))
	 * private WebElement DocumentIndicesKeyfield;
	 * 
	 * @FindBy(xpath=(
	 * "//*[@class='elementBody']/div/table/tbody/tr[2]/td[2]/input[@type='text']"))
	 * private WebElement DocumentIndicesNumberField;
	 * 
	 * @FindBy(xpath=(
	 * "//*[@class='elementBody']/div/table/tbody/tr[3]/td[2]/input[@type='text']"))
	 * private WebElement DocumentIndicesDatemask;
	 * 
	 * @FindBy(xpath=(
	 * "//*[@class='elementBody']/div/table/tbody/tr[4]/td[@class='docCreateBoolean']"
	 * )) private WebElement DocumentIndicesyesnotype;
	 * 
	 * @FindBy(xpath=
	 * "//*[@class='elementBody']/div/table/tbody/tr[4]/td[2]input[@type='text']")
	 * private WebElement Multiselectindices;
	 */

	// @FindBy(xpath=("//table[@id='docTypeIndicesTable']/following-sibling::td[2]"))
	// private WebElement DoctypeList;
	//
	// @FindBy(id="addDocdropdwn")
	// private WebElement ListAllicon;
	//
	@FindBy(xpath = ("//button[@id='createDocumentSubmit']"))
	private WebElement CreateButton;
	//
	@FindBy(xpath = ("//div[@id='createElementContainer']"))
	private WebElement DestContainer;
	//
	@FindBy(xpath = ("//button[@id='viewCreatedDocument']"))
	private WebElement ViewButton;

	@FindBy(xpath = ("//button[@id='modelNewDocument']"))
	private WebElement NewButton;

	@FindBy(xpath = ("//button[@id='modelHome']"))
	private WebElement NavigateButton;

	@FindBy(xpath = ("//button[@id='createDocumentClear']"))
	private WebElement ClearButton;

	@FindBy(xpath = ("//input[@id='retainBtn']"))
	private WebElement RetainCheck;

	@FindBy(xpath = ("//div[@id='toolbarId']"))
	private WebElement Toolbar;

	@FindBy(xpath = ("/div[@id='docTypeDiv']"))
	private WebElement Documenttypediv;

	@FindBy(id = "cvDocumentClose")
	private WebElement CloseVeiwerIcon;

	// @FindBy(id="cvDocumentClose")
	// private WebElement CloseVeiwer;

	// @FindBy(xpath=(".//*[@class='ThumbnailHolder']/div[1]/input"))
	// private WebElement Thumbnail;

	public WebDriver driver;
	Actions action;

	public NewDocument(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);

		this.driver = driver;
	}

	public void SetCreateNewDocument() {
		NewDocumentID.click();
		Reporter.log("New Document Button is clicked ", true);
	}

	public void SetDestinationfolder() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String text = js.executeScript("return document.getElementById('createDocuemtnLocation').value").toString();
		Reporter.log("Folder location is: " + text, true);

	}

	public void SetFileuploadmenu(String path, Viewer view1) throws Exception {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable((menuitem)));
		Reporter.log("Menu items are" + menuitem.getText(), true);
		Reporter.log("Menu items are displayed", true);
		action.moveToElement(AddFileicon).build().perform();
		Thread.sleep(2000);
		action.click(Browse).build().perform();
		Thread.sleep(5000);
		// Runtime.getRuntime().exec("D:\\Autoit\\Fileupload.exe");
		// Thread.sleep(5000);

		File directory = new File(path);
		String allimages = "";
		File[] flist = directory.listFiles();
		String fileNames[] = new String[flist.length];
		for (int i = 0; i < flist.length; i++) {
			File file = flist[i];
			if (file.isFile()) {
				allimages = allimages + "\"" + file.getName() + "\"" + " ";
				System.out.println("FileName: " + file.getName());
				fileNames[i] = file.getName();
			}
		}
		view1.setFilenames(fileNames);
		try {

			Runtime.getRuntime().exec("D:\\Autoit\\GetFolder.exe" + " " + directory + File.separator);
			Thread.sleep(5000);
			Runtime.getRuntime().exec("D:\\Autoit\\Fileupload.exe" + " " + allimages);

		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Reporter.log("Pages are uploaded successfully", true);

		// Wait for Alert to be present
		Thread.sleep(5000);

		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());

		// Alert alert = driver.switchTo().alert();

		Thread.sleep(2000);
		myAlert.accept();
	}

	public void SetDocType(String Documenttypename, String IndexVal) {

		WebElement element = driver.findElement(By.xpath("//select[@id='docTypeList']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('style')", element);
		element.sendKeys(Documenttypename);

		Reporter.log("document type is selected", true);

		// WebElement element1 =
		// driver.findElement(By.xpath("//input[@id='indices_33']"));
		// ((JavascriptExecutor)
		// driver).executeScript("arguments[0].removeAttribute('style')", element);
		// element1.sendKeys(IndexVal);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='indices_33']")));
		IndexValuetextbox.sendKeys(IndexVal);
		Reporter.log("Index value is:" + IndexVal, true);
	}

	public void SetClickCreateButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		CreateButton.click();
		try {
			wait.until(ExpectedConditions.elementToBeClickable((CreateButton)));

			Reporter.log("Create Button is clicked ", true);
		} catch (Exception e) {
			Reporter.log("Create Button is not clicked ", true);
		}
		Thread.sleep(2000);
		ViewButton.click();
		Reporter.log("View Button is clicked ", true);

	}

	public void SetRetainCheck() {
		RetainCheck.click();
		if (RetainCheck.isSelected()) {
			Reporter.log("Retain checkbox is selected", true);
			// DestinationFolder.getText();
			// SetDocType();
		}
	}

	public void SetClearButton() {
		ClearButton.click();
		if (ClearButton.isSelected()) {
			DocTypeList.clear();
			RetainCheck.clear();

		}
	}

	public void SetClickCreateNewbutton() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		CreateButton.click();
		try {
			wait.until(ExpectedConditions.elementToBeClickable((CreateButton)));

			Reporter.log("Create Button is clicked ", true);
		} catch (Exception e) {
			Reporter.log("Create Button is not clicked ", true);
		}
		Thread.sleep(2000);
		NewButton.click();
		Reporter.log("New Button is clicked ", true);

	}

	public void SetClickCreateNavigatebutton() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		CreateButton.click();
		try {
			wait.until(ExpectedConditions.elementToBeClickable((CreateButton)));

			Reporter.log("Create Button is clicked ", true);
		} catch (Exception e) {
			Reporter.log("Create Button is not clicked ", true);
		}
		Thread.sleep(2000);
		NavigateButton.click();
		Reporter.log("Navigate Button is clicked ", true);

	}

}
