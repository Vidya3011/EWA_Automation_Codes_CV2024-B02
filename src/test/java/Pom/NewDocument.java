package Pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
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

import Scripts.Viewer;

public class NewDocument {
	
	
	  @FindBy(id="saveAddedPages") 
	  private WebElement SaveIcon;
	 
	
	@FindBy(xpath=("//button[@id='messageButtonOK42']"))
    private WebElement SaveOK;
	@FindBy(id="cvDocumentClose")
    private WebElement CloseVeiwer;
	@FindBy(xpath = ("//button[@id='messageButtonOK42']"))
	private WebElement SaveOKBtn;
	
	@FindBy(xpath=("//div[@id='messageBox27']"))
    private WebElement SaveDialog;
	@FindBy(id="saveAddedPages")
    private WebElement SaveBtn;
	

	@FindBy(xpath=("//button[@id='messageButtonOK27']"))
    private WebElement SaveDialogYesButton;
	
	@FindBy(xpath=("//button[@id='messageButtonNo27']"))
    private WebElement SaveDialogNOButton;
	
	
	@FindBy(id="messageButtonOK42")
    private WebElement SaveOkBtn;
	
	
	@FindBy(xpath = ("//button[@id='createNewNodeOk']"))
	private WebElement CreateNodeOK;
	
	@FindBy(id="messageButtonOK27")
    private WebElement SaveDialogYes;
	
	@FindBy(id="messageButtonNo27")
    private WebElement SaveDialogNo;
	
	@FindBy(id="messageButtonCancel27")
    private WebElement SaveDialogCancel;

	@FindBy(xpath = ("//a[@id='createDocument']"))
	private WebElement NewDocumentID;

	// @FindBy(xpath=("//*[@id='viewDocumentTypeList']"))
	// private WebElement DocTypeList;

	@FindBy(xpath = ("//*[@id='addPagesDropDown']/span"))
	private WebElement AddFileicon;


	@FindBy(xpath = ("//input[@id='viewDocumentAddPages']"))
	private WebElement Browse;
	@FindBy(xpath = ("//*[@id=\\\"addDocdropdwn\\\"]/div[1]/div[1]"))
	private WebElement Browse1;


	@FindBy(xpath = ("//select[@id='docTypeList']"))
	private WebElement DocTypeList;

	
	
	//@FindBy(xpath = ("//*[@id=\"docTypeIndicesTable\"]/tbody/tr/td[2]/input"))
	@FindBy(xpath = ("//input[@id='indices_21'"))
	private WebElement IndexValuetextbox;

	@FindBy(xpath = ("//*[@id='createDocuemtnLocation']"))
	private WebElement DestinationFolder;

	@FindBy(xpath = ("//div[@id='addDocdropdwn']"))
	private WebElement menuitem;

	// @FindBy(xpath = ("/div[contains(text(),'Destination Folder')]"))
	// private WebElement DestinationFolder;

	@FindBy(xpath = ("//div[@id='locationDiv']"))
	private WebElement Docfolderdiv;
	
	 @FindBy(xpath = ("//*[@id=\"cvDocumentClose\"]/span"))
	 private WebElement CloseIcon; 
	 
	 @FindBy(xpath = ("//*[@id=\"documentListTable\"]/tbody[1]/tr[1]/td[3]"))
	 private WebElement ReopenTheDocument;

	 @FindBy(xpath = ("//*[@id='messageContent']"))
		private WebElement LowdiskspaceErr;
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
	
	@FindBy(xpath = ("/div[@id='docTypeDiv']"))
	private WebElement SavedialogNo;

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
	public void SetFileUpload() throws InterruptedException {
		  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until(ExpectedConditions.elementToBeClickable((menuitem)));
		 Reporter.log("Menu items are" + menuitem.getText(), true);
		 Reporter.log("Menu items are displayed", true);
		 action.moveToElement(AddFileicon).build().perform(); Thread.sleep(2000);
		// WebElement multiFileInput = Browse; Browse.sendKeys(path);
		  
		  File folder = new File ("D://Automationimages");
		 
		 File[] files = folder.listFiles();String filesList = ""; for(int i = 0; i <
		 files.length;i++){
		 
		 filesList += (i != 0 ?"\n":"") + files[i].getAbsolutePath();
		 
		  }
		  
		
		 driver.findElement(By.xpath("//input[@id='viewDocumentAddPages']")).sendKeys(filesList);
	}

	public void SetFileuploadmenu(String path, Viewer view1) throws Exception {
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
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
		for (int i=0 ; i<flist.length ; i++) {
			File file = flist[i];
			if (file.isFile()) {
				allimages = allimages + "\"" + file.getName() + "\"" + " ";
				System.out.println("FileName: "+file.getName());
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
		Thread.sleep(2000);
try {
		Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
 Alert alert = driver.switchTo().alert();

		Thread.sleep(2000);
	myAlert.accept();
}
catch(Exception e) {
	Reporter.log("Alert is not present", true);
}


	}

	public void SetDocType(String Documenttypename, String IndexVal) {

		WebElement element = driver.findElement(By.xpath("//select[@id='docTypeList']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('style')", element);
		element.sendKeys(Documenttypename);

		Reporter.log("document type is selected", true);
		
		WebElement element1 = driver.findElement(By.xpath("//input[@id='indices_21']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('style')", element1);
		element1.sendKeys(IndexVal);
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='indices_21']")));
//		IndexValuetextbox.sendKeys(IndexVal);
		Reporter.log("Index value is:" + IndexVal, true);
	}

	public void SetClickCreateButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		try {
			Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
	 Alert alert = driver.switchTo().alert();

			Thread.sleep(2000);
		myAlert.accept();
	}
	catch(Exception e) {
		Reporter.log("Alert is not present", true);
	}

			
		
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(CreateButton));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		//CreateButton.click();
//		try {
//			wait.until(ExpectedConditions.elementToBeClickable((CreateButton)));
//			WebElement element = driver.findElement(By.xpath("//*[@id='messageContent']"));
//		
//WebElement Repname= driver.findElement(By.xpath("//*[@id='messageButtonOK']"));
//	 WebElement Repnamedialog= driver.findElement(By.xpath("//*[@id='messageContent']"));
//	if(Repnamedialog.isDisplayed()) {
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Repname);
//			
//			Reporter.log("Create Button is clicked ", true);
//	}
//		} catch (Exception e) {
//			Reporter.log("Create Button is not clicked ", true);
//		}

			 
		
		Thread.sleep(2000);
		ViewButton.click();
		Reporter.log("View Button is clicked ", true);
	
		
		/*WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(SavedialogNo));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		Thread.sleep(2000);*/
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
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
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
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		try {
			Alert myAlert = wait.until(ExpectedConditions.alertIsPresent());
	 Alert alert = driver.switchTo().alert();

			Thread.sleep(2000);
		myAlert.accept();
	}
	catch(Exception e) {
		Reporter.log("Alert is not present", true);
	}
		WebElement Create  = wait.until(ExpectedConditions.elementToBeClickable(CreateButton));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Create);
		//CreateButton.click();
//		try {
//			
//			wait.until(ExpectedConditions.elementToBeClickable((CreateButton)));
//			WebElement element = driver.findElement(By.xpath("//*[@id='messageContent']"));
//			
//			WebElement Repname= driver.findElement(By.xpath("//*[@id='messageButtonOK']"));
//				 WebElement Repnamedialog= driver.findElement(By.xpath("//*[@id='messageContent']"));
//				if(Repnamedialog.isDisplayed()) {
//					((JavascriptExecutor)driver).executeScript("arguments[0].click();", Repname);
//						
//			Reporter.log("Create Button is clicked ", true);
//				}
//		} catch (Exception e) {
//			Reporter.log("Create Button is not clicked ", true);
//		}
		Thread.sleep(2000);
		
		WebElement navigate  = wait.until(ExpectedConditions.elementToBeClickable(NavigateButton));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", navigate);
		//NavigateButton.click();
		Reporter.log("Navigate Button is clicked ", true);

	}
	
	public void SetRependoc()throws Exception {
	
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(ReopenTheDocument));
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		Thread.sleep(5000);
		
		
		try {
		action.moveToElement(AddFileicon).perform();
		Thread.sleep(3000);
//		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(Browse1));
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element2);
		
		action.moveToElement(Browse).click().build().perform();
		Thread.sleep(4000);
		}
		catch(Exception e) {
			Reporter.log("File not added",true);
			
		}
		
		try {
			//Runtime.getRuntime().exec("D:\\Autoit\\FileUploadMorePdfDoc.exe");
			Runtime.getRuntime().exec("D:\\DipakAutoit\\PdfDoc\\FileUploadMorePdfDoc.exe");
			
			//Runtime.getRuntime().exec("D:\\Autoit\\GetFolder.exe" );
			Thread.sleep(5000);
			//Runtime.getRuntime().exec("D:\\Autoit\\Fileupload.exe" );
			
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Reporter.log("Pages are uploaded successfully", true);

		// Wait for Alert to be present
		
		
		//Runtime.getRuntime().exec("D:\\Autoit\\Fileupload.exe");
		 Thread.sleep(8000);
		 //SaveOKBtn.click();
		 /*WebElement save  = wait.until(ExpectedConditions.elementToBeClickable(SaveIcon));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", save);
	*/
			Reporter.log("Document is Saved successfully " ,true);
			
		/*	WebElement saveok  = wait.until(ExpectedConditions.elementToBeClickable(SaveOKBtn));
			((JavascriptExecutor)driver).executeScript("arguments[0].click();", saveok);*/


			
				
		
		/*WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(CloseVeiwerIcon));
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", element2);
	*/
			try {
			CloseVeiwerIcon.click();
			Thread.sleep(3000);
	Reporter.log("Closing the viewer",true);
	  
	  SaveDialogYesButton.click();
	  Thread.sleep(2000);
	 SaveOKBtn.click();
	 
}catch(Exception e) {
	Reporter.log("Document is not updated",true);
}
		
	

}
}