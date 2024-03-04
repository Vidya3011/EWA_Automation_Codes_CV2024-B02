package Script;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pom.SpecialCharFilenames;

public class LargeFiles_AutomationTesting extends Generic.BaseClass {
	private static final Logger log = LogManager.getLogger(LargeFiles_AutomationTesting.class);

	  @BeforeClass
		public void LandBrowser() {

			loadBrowser("Chrome");
			launchUrl();
			Reporter.log("CVS URL started Successfully...");
		}

		@Test
		public void Login_EWA() throws Exception {
			loginCVS();
			Reporter.log("CVS User is logged in successfully...");

		}
		 
		@Test(priority=1)
		public void TC_1_Upload_and_verify_Large_PDF_file() throws Exception {

			SpecialCharFilenames pojo = new SpecialCharFilenames();
			//jsclick(pojo.getRefresh_button());
			Thread.sleep(4000);
			jsclick(pojo.getNewDocuments_MenuOption());
			Reporter.log("User click on new document menu tab");
			Thread.sleep(7000);
			jsclick(pojo.getDestination_Folder_Textbox());
			Reporter.log("User click on destination folder textbox");
			Thread.sleep(4000);
			ElementToBeClickable(pojo.getSelect_Cabinet());
			Reporter.log("User expand cabinet");
			selectElement(pojo.getSelect_Cabinet());
			Thread.sleep(6000);
			Reporter.log("User expand drawer");
			ElementToBeClickable(pojo.getSelect_Drawer());
			selectElement(pojo.getSelect_Drawer());
			Thread.sleep(6000);
			Reporter.log("User select the folder");
			jsclick(pojo.getNewDrawerFolder());
			Thread.sleep(4000);
			Reporter.log("Folder is selected for Create New Documents", true);
			jsclick(pojo.getOK_Button_BrowseforFolder());
			Reporter.log("User click on select folder dialog OK button");
			Thread.sleep(4000);
			jsclick(pojo.getSelect_Document_Type_Dropdown());
			Reporter.log("User select a document type");
			Thread.sleep(4000);
			pojo.getEnter_Report_Name_Text().sendKeys("LargePDF Document ><?:??");
			Reporter.log("Enter document name");
			Thread.sleep(4000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
			Reporter.log("User mouse hover on browse icon");
			movingclkElement(pojo.getMove_To_PlusIcon());
			Thread.sleep(3000);
			pojo.getBrowse_Option();
			Reporter.log("Select browse submenu");
			Thread.sleep(15000);
			
			Runtime.getRuntime()
					.exec("D:\\RNishaAutoIt\\LArgePDF.exe");
			Thread.sleep(8000);
			Reporter.log("User has added file successfull by using auto IT");
			try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
			}
			catch(Exception e) {
				System.out.println("Alert not present");
			}
			Thread.sleep(5000);
			jsclick(pojo.getCreate_Button());
			Reporter.log("User click on create button");
			Thread.sleep(4000);
			jsclick(pojo.getView_Button());
			Reporter.log("User click on view button");
			Thread.sleep(6000);
			/*pojo.getClick_FileInfo_Option();
			Thread.sleep(4000);
			pojo.getClick_FileInfo_OkButton_withFileName();*/
			Thread.sleep(6000);
			jsclick(pojo.getSave_button());
			Reporter.log("User click on save button");
			Thread.sleep(4000);
			jsclick(pojo.getDocumentSave_Ok_button());
			Reporter.log("User click on save tab OK button");
			Thread.sleep(10000);
			log.info("Upload and verify large file pdf document", true);
			jsclick(Refresh_Button(driver));
			Reporter.log("User click on refresh icon");
		}
 
		@Test(priority=2)
		public void TC_2_Upload_and_verify_Large_TIFF_file() throws Exception {

			SpecialCharFilenames pojo = new SpecialCharFilenames();
			//jsclick(pojo.getRefresh_button());
			Thread.sleep(4000);
			Reporter.log("User click on new document menu tab");
			jsclick(pojo.getNewDocuments_MenuOption());
			Reporter.log("User click on destination folder textbox");
			Thread.sleep(4000);
			jsclick(pojo.getDestination_Folder_Textbox());
			Reporter.log("User expand cabinet");
			Thread.sleep(4000);
			ElementToBeClickable(pojo.getSelect_Cabinet());
			selectElement(pojo.getSelect_Cabinet());
			Reporter.log("User expand drawer");
			Thread.sleep(6000);
			ElementToBeClickable(pojo.getSelect_Drawer());
			selectElement(pojo.getSelect_Drawer());
			Thread.sleep(6000);
			Reporter.log("User select a folder");
			jsclick(pojo.getNewDrawerFolder());
			Thread.sleep(4000);
			Reporter.log("User click on browse folder dialog OK button");
			Reporter.log("Folder is selected for Create New Documents", true);
			jsclick(pojo.getOK_Button_BrowseforFolder());
			Thread.sleep(4000);
			Reporter.log("User select document type as CVReports");
			jsclick(pojo.getSelect_Document_Type_Dropdown());
			Thread.sleep(4000);
			pojo.getEnter_Report_Name_Text().sendKeys("Large Tiff Document @#&*()^%");
			Reporter.log("User enter document name");
			Thread.sleep(4000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
			movingclkElement(pojo.getMove_To_PlusIcon());
			Reporter.log("User mouse hover on browse icon");
			pojo.getBrowse_Option();
			Thread.sleep(10000);
			Reporter.log("User added a Large TIFF file from folder by using Auto IT script ");
			Runtime.getRuntime()
					.exec("D:\\RNishaAutoIt\\LargeTiffFile.exe");
			Thread.sleep(5000);
			try {
				WebDriverWait wait1 = new WebDriverWait(driver, 20);
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alt = driver.switchTo().alert();
				alt.accept();
				}
				catch(Exception e) {
					System.out.println("Alert not present");
				}
			Thread.sleep(3000);
			jsclick(pojo.getCreate_Button());
			Reporter.log("User click on create button");
			Thread.sleep(4000);
			jsclick(pojo.getView_Button());
			Reporter.log("User click on view button");
			Thread.sleep(6000);
			/*pojo.getClick_FileInfo_Option();
			
			Thread.sleep(4000);
			pojo.getClick_FileInfo_OkButton_withFileName();
			Thread.sleep(6000);*/
			jsclick(pojo.getSave_button());
			Reporter.log("User click on save button");
			Thread.sleep(4000);
			jsclick(pojo.getDocumentSave_Ok_button());
			Reporter.log("User click on save dialog OK button");
			Thread.sleep(10000);
			log.info("Upload and verify large tiff file  document", true);
			jsclick(Refresh_Button(driver));
		}
		@Test(priority=3)
		public void TC_3_Upload_and_verify_Large_DOCX_file() throws Exception {

			SpecialCharFilenames pojo = new SpecialCharFilenames();
		//	jsclick(pojo.getRefresh_button());
			Thread.sleep(4000);
			jsclick(pojo.getNewDocuments_MenuOption());
			Reporter.log("User click on new document tab");
			Thread.sleep(4000);
			jsclick(pojo.getDestination_Folder_Textbox());
			Reporter.log("User click on destination folder textbox");
			Thread.sleep(4000);
			ElementToBeClickable(pojo.getSelect_Cabinet());
			Reporter.log("User expand cabinet");
			selectElement(pojo.getSelect_Cabinet());
			Thread.sleep(6000);
			Reporter.log("User expand drawer");
			ElementToBeClickable(pojo.getSelect_Drawer());
			selectElement(pojo.getSelect_Drawer());
			Reporter.log("User select a folder");
			Thread.sleep(6000);
			jsclick(pojo.getNewDrawerFolder());
			Reporter.log("User click on Destinatio folder dialog OK button");
			Thread.sleep(4000);
			Reporter.log("Folder is selected for Create New Documents", true);
			jsclick(pojo.getOK_Button_BrowseforFolder());
			Thread.sleep(4000);
			Reporter.log("User select a document type as CVReports");
			jsclick(pojo.getSelect_Document_Type_Dropdown());
			Thread.sleep(4000);
			Reporter.log("User enter a file name");
			pojo.getEnter_Report_Name_Text().sendKeys("Large Word Document #$%&^*()_");
			Thread.sleep(4000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
			movingclkElement(pojo.getMove_To_PlusIcon());
			Reporter.log("User mouse hover on browse icon");
			pojo.getBrowse_Option();
			Reporter.log("User select browse submenu");
			Thread.sleep(10000);
			Runtime.getRuntime()
					.exec("D:\\RNishaAutoIt\\LargeWordFile.exe");
			Thread.sleep(5000);
			Reporter.log("User added large word file by using AutoIT script");
			try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
			}
			catch(Exception e) {
				System.out.println("Alert is not present!!!");
			}
			jsclick(pojo.getCreate_Button());
			Reporter.log("User click on create button");
			Thread.sleep(4000);
			jsclick(pojo.getView_Button());
			Reporter.log("User click on view button");
			Thread.sleep(8000);
			/*ElementToBeClickable(pojo.getClick_FileInfo_Option());
			jsclick(pojo.getClick_FileInfo_Option1());
			Thread.sleep(9000);
			pojo.getClick_FileInfo_OkButton_withFileName();
			Thread.sleep(6000);*/
			jsclick(pojo.getSave_button());
			Reporter.log("User click on save button");
			Thread.sleep(4000);
			jsclick(pojo.getDocumentSave_Ok_button());
			Reporter.log("User click on save dialog OK button");
			Thread.sleep(10000);
			log.info("Upload and verify large Docx file  document", true);
			jsclick(Refresh_Button(driver));
		}
		
		@Test(priority=4)
		public void TC_4_Upload_and_verify_Large_XLSX_file() throws Exception {

			SpecialCharFilenames pojo = new SpecialCharFilenames();
			//jsclick(pojo.getRefresh_button());
			Thread.sleep(4000);
			jsclick(pojo.getNewDocuments_MenuOption());
			Reporter.log("User click on new document tab");
			Thread.sleep(4000);
			jsclick(pojo.getDestination_Folder_Textbox());
			Reporter.log("User select folder from destination folder dialog");
			Thread.sleep(4000);
			ElementToBeClickable(pojo.getSelect_Cabinet());
			Reporter.log("User expand cabinet");
			selectElement(pojo.getSelect_Cabinet());
			Thread.sleep(6000);
			Reporter.log("User expand drawer");
			ElementToBeClickable(pojo.getSelect_Drawer());
			movingDoublecli(pojo.getSelect_Drawer(), pojo.getSelect_Drawer());
			Thread.sleep(6000);
			Reporter.log("User select a folder");
			jsclick(pojo.getNewDrawerFolder());
			Thread.sleep(4000);
			Reporter.log("Folder is selected for Create New Documents", true);
			jsclick(pojo.getOK_Button_BrowseforFolder());
			Reporter.log("User click on destination folder dialog OK button");
			Thread.sleep(4000);
			jsclick(pojo.getSelect_Document_Type_Dropdown());
			Reporter.log("User click on document type dropdown");
			Thread.sleep(4000);
			Reporter.log("User select document type as CVReports");
			pojo.getEnter_Report_Name_Text().sendKeys("Large excel Document^%$#@*(+_+?><");
			Thread.sleep(4000);
			Reporter.log("User enter a file name");
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
			movingclkElement(pojo.getMove_To_PlusIcon());
			Reporter.log("User click on browse icon");
			pojo.getBrowse_Option();
			Thread.sleep(10000);
			Reporter.log("User click on browse submenu");
			Runtime.getRuntime()
					.exec("D:\\RNishaAutoIt\\LargeXlxsFile.exe");
			Thread.sleep(5000);
			Reporter.log("User added large excel file from folder by using AutoIT script");
			try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
			}
			catch(Exception e) {
				System.out.println("Alert is not present!!!");
			}
			jsclick(pojo.getCreate_Button());
			Reporter.log("User click on create button");
			Thread.sleep(4000);
			jsclick(pojo.getView_Button());
			Reporter.log("User click on view button");
			Thread.sleep(8000);
			/*pojo.getClick_FileInfo_Option1();
			Thread.sleep(9000);
			jsclick(pojo.getClick_FileInfo_OkButton_withFileName());
			Thread.sleep(6000);*/
			jsclick(pojo.getSave_button());
			Thread.sleep(4000);
			jsclick(pojo.getDocumentSave_Ok_button());
			Reporter.log("User click on save button");
			Thread.sleep(10000);
			Reporter.log("User click on save dialog button");
			Reporter.log("Upload and verify large xlxs file  document successfull...");
			log.info("Upload and verify large xlxs file  document", true);
			jsclick(Refresh_Button(driver));
		}
		
		
		
		
		
		

}
