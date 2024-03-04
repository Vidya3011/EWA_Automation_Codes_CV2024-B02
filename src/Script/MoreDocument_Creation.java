package Script;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Dipak_MY_PRefe;

//Dipak Automation script
public class MoreDocument_Creation extends Generic.BaseClass {

	private static final Logger log = LogManager.getLogger(My_preferences_Pdf_documents.class);

	@BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully",true);
	}

	@Test

	public void Login_EWA() throws Exception {
		loginSQL2022RAM();
		Reporter.log("CVS User is logged in successfully.", true);

	}

	//@Test(priority = 1)
	public void Create_PDF() throws Exception {

		Dipak_MY_PRefe pojo = new Dipak_MY_PRefe();
		
		Reporter.log("Test Scenario : Create Pdf ",true);
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(2000);
		Reporter.log("Click on the New Document Tab",true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(2000);
		Reporter.log("Click on the Destination Folder Textbox",true);
		selectElement(pojo.getCabinet());
		Thread.sleep(2000);
		Reporter.log("User expand the Cabinet",true);
		selectElement(pojo.getDrawer());
		Thread.sleep(2000);
		Reporter.log("User expand Drawer",true);
		selectElement(pojo.getDipakSubFolder());
		Thread.sleep(2000);
		Reporter.log("User select the SubFolder",true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		Reporter.log("Click on the Ok Button ",true);
		pojo.getSelect_Document_Type_Dropdown();
		Thread.sleep(2000);
		Reporter.log("Select value from Document type Dropdown",true);
		pojo.getEnter_ReportName();
		Thread.sleep(3000);
		Reporter.log("Enter the Report Name",true);
		pojo.getMove_To_PlusIcon();
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse the Document page",true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Accent.exe");
		Reporter.log("PDF Page is uploaded successfully", true);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(8000);
		jsclick(pojo.getCreate_button());
		Thread.sleep(3000);
		Reporter.log("Click on the Create Button",true);
		jsclick(pojo.getViewDocument_Button());
		Thread.sleep(5000);
		Reporter.log("Click on the View Button",true);
		jsclick(pojo.getClose_Documentpage());
		Reporter.log("Click on the viewer Close Button",true);
	}

	@Test(priority = 1, invocationCount = 2000)
	public void Create_PDF_Documents() throws Exception {

		Dipak_MY_PRefe pojo = new Dipak_MY_PRefe();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(2000);
		Reporter.log("Click on the New Document Tab",true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(2000);
		Reporter.log("Click on the Destination Folder Textbox",true);
		selectElement(pojo.getCabinet());
		Thread.sleep(2000);
		Reporter.log("User expand the Cabinet",true);
		selectElement(pojo.getDrawer());
		Thread.sleep(2000);
		Reporter.log("User expand Drawer",true);
		selectElement(pojo.getDipakSubFolder());
		Thread.sleep(2000);
		Reporter.log("User select the SubFolder",true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		Reporter.log("Click on the Ok Button ",true);
		pojo.getSelect_Document_Type_Dropdown();
		Thread.sleep(5000);
		Reporter.log("Select Value from Document type Dropdown",true);
		pojo.getEnter_ReportName();
		Thread.sleep(3000);
		Reporter.log("Enter the Report Name",true);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse the Document Page",true);
		Runtime.getRuntime().exec("D:\\RNishaAutoIt\\NishaRScript.exe");
		Reporter.log("PDF Page is uploaded successfully", true);
		try {
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		}
		catch(Exception e) {
		System.out.println("No alert is present");
		}
		Thread.sleep(8000);
		
		jsclick(pojo.getCreate_button());
		Thread.sleep(3000);
		Reporter.log("Click on the Create Button",true);
		jsclick(pojo.getViewDocument_Button());
		Thread.sleep(8000);
		Reporter.log("Click on the View Button",true);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse the Document Page",true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Accent.exe");
		Thread.sleep(6000);
		Reporter.log("Browse document and Page is uploaded successfully", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		Reporter.log("Click on the Save Button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(5000);
		Reporter.log("Click on the Ok Button", true);
		jsclick(pojo.getClose_Documentpage());
		Reporter.log("Click on the Viewer Close Button ",true);
		Reporter.log("Document Created Successfully ",true);
	}
}

