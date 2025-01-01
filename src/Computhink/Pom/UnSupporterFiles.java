package Computhink.Pom;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.velocity.runtime.directive.Foreach;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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

import Computhink.Generic.BaseClass;
import Computhink.Script.Viewer;

//NishaR codes

//~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
public class UnSupporterFiles extends BaseClass {
	public UnSupporterFiles() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = ("//a[@id='createDocument']"))
	private WebElement NewDocumentID;

	// @FindBy(xpath=("//*[@id='viewDocumentTypeList']"))
	// private WebElement DocTypeList;

	@FindBy(xpath = ("//*[@id='addPagesDropDown']/span"))
	private WebElement AddFileicon;

	@FindBy(xpath = ("//*[@id='createDocuemntNavigator']/ul/li[5]/a"))
	private WebElement NishaCabinet;

	@FindBy(xpath = ("//*[@id='createDocuemntNavigator']/ul/li[5]/ul/li/a"))
	private WebElement NishaDrawer;

	@FindBy(xpath = ("//*[@id='createDocuemntNavigator']/ul/li[5]/ul/li/ul/li[1]/a"))
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

	@FindBy(xpath = ("//*[@id='viewCreatedDocument']"))
	private WebElement ViewOption;

	@FindBy(xpath = ("//*[@id='createDocumentSubmit']"))
	private WebElement CreateBTN;

	@FindBy(xpath = ("//div[@id='saveAddedPages']//span[1]"))
	private WebElement SaveTab;

	@FindBy(xpath = ("(//button[@id='messageButtonOK42'])[1]"))
	private WebElement SaveTabOKBTN;

	@FindBy(xpath = ("//*[@id=\"navigatorTreeOk\"]"))
	private WebElement DestinationLocationOKBTN;

	@FindBy(xpath = ("//div[@id='locationDiv']"))
	private WebElement Docfolderdiv;

	@FindBy(id = "docTypeList")
	private WebElement Click_Document_Type_Dropdown;

	@FindBy(xpath = "//*[@id=\"addPagesDropDown\"]/span")
	private WebElement Move_To_PlusIcon;

	@FindBy(xpath = "//*[@id='viewDocumentAddPages']")
	private WebElement Browse_Option;

	@FindBy(xpath = "//*[@id=\"docTypeIndicesTable\"]/tbody/tr/td[2]")
	private WebElement DocumentCVRep;

	@FindBy(xpath = "//*[@id='takeOffLine']")
	private WebElement OfflineBTN;

	// *[@id="docViewerMetaData"]/div[1]/div/img

	@FindBy(xpath = "//*[@id='docViewerMetaData']/div[1]/div/img")
	private WebElement FirstFileThumbnail;

	// *[@id="messageButtonOK26"]

	@FindBy(xpath = "//*[@id='messageButtonOK26']")
	private WebElement DownloadBTN;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement DownloadConfirmOKBTN;

	@FindBy(xpath = "//*[@id=\"loadAgainBtn43\"]")
	private WebElement UnableToLoad;

	public void getSelect_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");

	}

	public void create_document_Auto() throws Exception {
		Reporter.log("Scenario 01: Verifying Unsupported Files", true);
		Thread.sleep(2000);
		jsclick(NewDocumentID);
		Reporter.log("Click on New Document tab", true);
		Thread.sleep(2000);

		jsclick(DestinationFolder);
		Reporter.log("Open Desitination folder dialog", true);
		Thread.sleep(3000);
		selectElement(NishaCabinet);
		Reporter.log("Select Folder", true);
		Thread.sleep(3000);
		selectElement(NishaDrawer);

		Thread.sleep(3000);
		selectElement(NishFolder);
		Thread.sleep(3000);
		jsclick(DestinationLocationOKBTN);
		Thread.sleep(3000);
		Reporter.log("Click on Destination folder dialog OK button", true);
		getSelect_Document_Type_Dropdown();
		Reporter.log("Select a Document type", true);
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		try {

			act.click(DocumentCVRep).sendKeys(readFrmXLNEgative(5, 1)).build().perform();
			Reporter.log("Enter indices value", true);
		} catch (Exception e) {
			System.out.println("Document name not enter failed");
		}

		jsclick(CreateBTN);
		Reporter.log("Click on Create button", true);
		Thread.sleep(4000);

		jsclick(ViewOption);
		Reporter.log("Click on View button", true);
		Thread.sleep(3000);
		movingElement(Move_To_PlusIcon);
		Reporter.log("Select Browse icon", true);
		try {

			act.moveToElement(Browse_Option).click().build().perform();
		} catch (JavascriptException e) {
			System.out.println("Exception there");
		}

		Thread.sleep(25000);
		Reporter.log("Add Unsupported files by using AutoIT script", true);
		String path1 = "D:\\UnsupporterFiles";
		File directory = new File(path1);

		// Ensure the directory exists and is not empty
		if (directory.exists() && directory.isDirectory()) {
			File[] flist = directory.listFiles();
			if (flist != null && flist.length > 0) {
				// Prepare a string of file paths for the first 10 files
				StringBuilder filePaths = new StringBuilder();
				int fileCount = 0;
				for (File file : flist) {
					if (file.isFile() && fileCount < 16) {
						if (fileCount > 0) {
							filePaths.append(" "); // Use space to separate file paths
						}
						filePaths.append("\"").append(file.getAbsolutePath()).append("\"");
						fileCount++;
					}
				}

				if (filePaths.length() > 0) {
					try {
						// Execute the AutoIt script with the full file paths as argument
						String command = "D:\\RNishaAutoIt\\FileuploadForFolder.exe " + filePaths.toString();
						Reporter.log(" Unsupported File names With Extention : " + command, true); // Log the command
																									// for verification
						Process process = Runtime.getRuntime().exec(command);
						process.waitFor();
						Reporter.log("All Unsupported files are uploaded successful", true);
					} catch (IOException | InterruptedException e) {
						System.out.println("Upload Failed");
						e.printStackTrace();
					}
				}
			} else {
				Reporter.log("No files found in directory: " + path1);
			}
		} else {
			Reporter.log("Directory does not exist or is not a directory : " + path1);
		}
		Thread.sleep(8000);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());

		Thread.sleep(2000);
		myAlert.accept();
		Thread.sleep(4000);
		Reporter.log("Click on save button", true);
		jsclick(SaveTab);
		Thread.sleep(3000);
		VisiblityOf(SaveTabOKBTN);
		Reporter.log("Added Unsupported files are saved successfully...", true);
		jsclick(SaveTabOKBTN);
		Thread.sleep(4000);

	}

	public void FirstDocView() throws Exception {
		Reporter.log("Scenario 02: Verify Unsupported files Download & Offine functionality", true);
		Thread.sleep(3000);
		jsclick(FirstFileThumbnail);
		Reporter.log("Select unsupported file", true);
		Thread.sleep(5000);
		jsclick(DownloadBTN);
		Reporter.log(" it will show 'Unable to View dialog' with Offline, Download and Cancel button", true);
		try {
			jsclick(OfflineBTN);
			Reporter.log("Click on Offline button", true);
			Thread.sleep(5000);
			Reporter.log("Click on offline confirmation dialog OK button", true);
			jsclick(DownloadConfirmOKBTN);
			Reporter.log("Document move to offline successful", true);
		} catch (Exception e) {
			System.out.println("OFfline dialog not visible");
		}

	}

	public void viewAndDownloadDocs(int numberOfDocs) throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Reporter.log("Scenario 02:Verify Unsupported files Download & Offine functionality", true);
		for (int i = 1; i <= numberOfDocs; i++) {
			// Construct the XPath with the current index
			String xpath = "//*[@id='docViewerMetaData']/div[" + i + "]";

			System.out.println("print the downloaded xpath details" + xpath);

			WebElement element = driver.findElement(By.xpath(xpath));
			jsclick(element);
			Reporter.log("Select unsupported file", true);
			String Uploaded = element.getAttribute("title");
			Reporter.log("Unsupported file name with file type :" + Uploaded);

			try {
				Thread.sleep(3000);
				jsclick(UnableToLoad);
				System.out.println("we will get unable to load dialog for Unsuported files");
				System.out.println("Click on unable to load dialog OK button");
			} catch (Exception e) {
				System.out.println(" Unable to dialog is not displayed");
			}

			Thread.sleep(5000);

			jsclick(DownloadBTN);
			Reporter.log(" It will show 'Unable to View dialog' with Offline, Download and Cancel button", true);
			Thread.sleep(5000);

			try {
				jsclick(OfflineBTN);
				Reporter.log("Select Offline button from the dialog", true);
				Thread.sleep(5000);
				Reporter.log(" It will show 'page(s) taken offline' dialog on the viewer ", true);
				jsclick(DownloadConfirmOKBTN);
				Reporter.log("Click on Document pages offline confimation dialog OK button", true);
				Reporter.log("Document move to offline successfully", true);
				Thread.sleep(8000);
				Reporter.log(
						"==============================================================================================================================",
						true);
			} catch (Exception e) {
				System.out.println("Offline dialog not visible for document " + i);
			}
		}
		
		/*	List<WebElement> elements = driver.findElements(By.xpath("(//img[@class='imgP'])"));
			
			int size = elements.size();
			
			for (WebElement doc : elements) {
				
				String text = doc.getText();
				
				if(text.contains("FileName")) {
					
					WebElement Sel = driver.findElement(By.xpath("(//img[@class='imgP'])[1]"));
					Sel.click();
					
				}
				
				
			}*/
	}
	
	

}
