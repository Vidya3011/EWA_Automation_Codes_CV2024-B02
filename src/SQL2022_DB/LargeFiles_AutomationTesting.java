package SQL2022_DB;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pom.AdvancedViewer;
import Pom.SpecialCharFilenames;

public class LargeFiles_AutomationTesting extends Generic.BaseClass {
	private static final Logger log = LogManager.getLogger(LargeFiles_AutomationTesting.class);

	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser");
		
		launchUrl();
		//launchLocalUrlRnisha();
		log.info("ContentVerseURL");
	}

	@Test (priority=1)
	public void Login() throws Exception {
		//loginLocalCVS();
		loginCVS();
		log.info("User is Successfully logged in");
	} 
		
		 @Test(priority=4,invocationCount=500)
			public void AdvancedViewerPDfDoc() throws Exception{
				AdvancedViewer ad=new AdvancedViewer();
				ad.AdvancedViewPDFDocument_SQL();
				Reporter.log("PDF Document verified successfull");
			
		}
		 
	//	@Test(priority=1, invocationCount=100)
		public void Upload_and_verify_Large_PDF_file() throws Exception {

			SpecialCharFilenames pojo = new SpecialCharFilenames();
			//jsclick(pojo.getRefresh_button());
			Thread.sleep(4000);
			jsclick(pojo.getNewDocuments_MenuOption());
			Thread.sleep(7000);
			jsclick(pojo.getDestination_Folder_Textbox());
			Thread.sleep(4000);
			Thread.sleep(3000);
			WebElement AutomationCab = driver.findElement(By.xpath("//*[@id=\"144\"]/ins"));
			jsclick(AutomationCab);
			Thread.sleep(4000);
			WebElement AutomationDrawer = driver.findElement(By.xpath("//*[@id=\"145\"]/ins"));
			jsclick(AutomationDrawer);
			Thread.sleep(4000);
			WebElement AutomationFolder = driver.findElement(By.xpath("//*[@id=\"434\"]/a"));
			jsclick(AutomationFolder);
			

			Thread.sleep(4000);
			Reporter.log("Folder is selected for Create New Documents", true);
			jsclick(pojo.getOK_Button_BrowseforFolder());
			Thread.sleep(4000);
			jsclick(pojo.getSelect_Document_Type_Dropdown());
			Thread.sleep(4000);
			Actions act=new Actions(driver);
		//	act.click(pojo.getDocumentCVRep()).sendKeys("PDF document Creation?").build().perform();
			Thread.sleep(4000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
			movingclkElement(pojo.getMove_To_PlusIcon());
			Thread.sleep(3000);
			pojo.getBrowse_Option();
			Thread.sleep(10000);
			
			Runtime.getRuntime()
					.exec("D:\\RNishaAutoIt\\LArgePDF.exe");
			Thread.sleep(8000);
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
			Thread.sleep(4000);
			jsclick(pojo.getView_Button());
			Thread.sleep(6000);
			
			
			Thread.sleep(6000);
			jsclick(pojo.getSave_button());
			Thread.sleep(4000);
			jsclick(pojo.getDocumentSave_Ok_button());
			Thread.sleep(10000);
			log.info("Upload and verify large file pdf document", true);
			jsclick(Refresh_Button(driver));
		}
 
	//	@Test(priority=2)
		public void Upload_and_verify_Large_TIFF_file() throws Exception {

			SpecialCharFilenames pojo = new SpecialCharFilenames();
			//jsclick(pojo.getRefresh_button());
			Thread.sleep(4000);
			jsclick(pojo.getNewDocuments_MenuOption());
			Thread.sleep(4000);
			jsclick(pojo.getDestination_Folder_Textbox());
			Thread.sleep(4000);
			
			WebElement AutomationCab = driver.findElement(By.xpath("//*[@id=\"144\"]/ins"));
			jsclick(AutomationCab);
			Thread.sleep(4000);
			WebElement AutomationDrawer = driver.findElement(By.xpath("//*[@id=\"145\"]/ins"));
			jsclick(AutomationDrawer);
			Thread.sleep(4000);
			WebElement AutomationFolder = driver.findElement(By.xpath("//*[@id=\"146\"]/a"));
			jsclick(AutomationFolder);
			Thread.sleep(8000);
			Reporter.log("Folder is selected for Create New Documents", true);
			jsclick(pojo.getOK_Button_BrowseforFolder());
			Thread.sleep(4000);
			jsclick(pojo.getSelect_Document_Type_Dropdown());
			Thread.sleep(4000);
			Actions act=new Actions(driver);
		//	act.click(pojo.getDocumentCVRep()).sendKeys("Large Tiff Document @#&*()^%").build().perform();
			
			
			Thread.sleep(4000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
			movingclkElement(pojo.getMove_To_PlusIcon());
			pojo.getBrowse_Option();
			Thread.sleep(10000);
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
			Thread.sleep(4000);
			jsclick(pojo.getView_Button());
			Thread.sleep(6000);
			/*jsclick(pojo.getClick_FileInfo_Option1());
			Thread.sleep(4000);
			pojo.getClick_FileInfo_OkButton_withFileName();
			Thread.sleep(6000);*/
			jsclick(pojo.getSave_button());
			Thread.sleep(4000);
			jsclick(pojo.getDocumentSave_Ok_button());
			Thread.sleep(10000);
			log.info("Upload and verify large tiff file  document", true);
			jsclick(Refresh_Button(driver));
		}
		//@Test(priority=3)
		public void Upload_and_verify_Large_DOCX_file() throws Exception {

			SpecialCharFilenames pojo = new SpecialCharFilenames();
		//	jsclick(pojo.getRefresh_button());
			Thread.sleep(4000);
			jsclick(pojo.getNewDocuments_MenuOption());
			Thread.sleep(4000);
			jsclick(pojo.getDestination_Folder_Textbox());
			Thread.sleep(4000);
			WebElement AutomationCab = driver.findElement(By.xpath("//*[@id=\"144\"]/ins"));
			jsclick(AutomationCab);
			Thread.sleep(4000);
			WebElement AutomationDrawer = driver.findElement(By.xpath("//*[@id=\"145\"]/ins"));
			jsclick(AutomationDrawer);
			Thread.sleep(4000);
			WebElement AutomationFolder = driver.findElement(By.xpath("//*[@id=\"146\"]/a"));
			jsclick(AutomationFolder);
			Thread.sleep(3000);
			Reporter.log("Folder is selected for Create New Documents", true);
			jsclick(pojo.getOK_Button_BrowseforFolder());
			Thread.sleep(4000);
			jsclick(pojo.getSelect_Document_Type_Dropdown());
			Thread.sleep(4000);
			Actions act=new Actions(driver);
		//	act.click(pojo.getDocumentCVRep()).sendKeys("Large Word Document #$%&^*()_").build().perform();
			
			
			Thread.sleep(4000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
			movingclkElement(pojo.getMove_To_PlusIcon());
			pojo.getBrowse_Option();
			Thread.sleep(10000);
			Runtime.getRuntime()
					.exec("D:\\RNishaAutoIt\\LargeWordFile.exe");
			Thread.sleep(5000);
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
			Thread.sleep(4000);
			jsclick(pojo.getView_Button());
			Thread.sleep(8000);
			/*ElementToBeClickable(pojo.getClick_FileInfo_Option1());
			jsclick(pojo.getClick_FileInfo_Option1());
			Thread.sleep(9000);
			pojo.getClick_FileInfo_OkButton_withFileName();
			Thread.sleep(6000);*/
			jsclick(pojo.getSave_button());
			Thread.sleep(4000);
			jsclick(pojo.getDocumentSave_Ok_button());
			Thread.sleep(10000);
			log.info("Upload and verify large Docx file  document", true);
			jsclick(Refresh_Button(driver));
		}
		
		//@Test(priority=4)
		public void Upload_and_verify_Large_XLSX_file() throws Exception {

			SpecialCharFilenames pojo = new SpecialCharFilenames();
			//jsclick(pojo.getRefresh_button());
			Thread.sleep(4000);
			jsclick(pojo.getNewDocuments_MenuOption());
			Thread.sleep(4000);
			jsclick(pojo.getDestination_Folder_Textbox());
			Thread.sleep(4000);
			WebElement AutomationCab = driver.findElement(By.xpath("//*[@id=\"144\"]/ins"));
			jsclick(AutomationCab);
			Thread.sleep(4000);
			WebElement AutomationDrawer = driver.findElement(By.xpath("//*[@id=\"145\"]/ins"));
			jsclick(AutomationDrawer);
			Thread.sleep(4000);
			WebElement AutomationFolder = driver.findElement(By.xpath("//*[@id=\"146\"]/a"));
			jsclick(AutomationFolder);
			Thread.sleep(3000);
			Reporter.log("Folder is selected for Create New Documents", true);
			jsclick(pojo.getOK_Button_BrowseforFolder());
			Thread.sleep(4000);
			jsclick(pojo.getSelect_Document_Type_Dropdown());
			Thread.sleep(4000);
			Actions act=new Actions(driver);
//			act.click(pojo.getDocumentCVRep()).sendKeys("Large excel Document^%$#@*(+_+?><").build().perform();
			
			Thread.sleep(4000);
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
			movingclkElement(pojo.getMove_To_PlusIcon());
			pojo.getBrowse_Option();
			Thread.sleep(10000);
			Runtime.getRuntime()
					.exec("D:\\RNishaAutoIt\\LargeXlxsFile.exe");
			Thread.sleep(5000);
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
			Thread.sleep(4000);
			jsclick(pojo.getView_Button());
			Thread.sleep(8000);
			/*pojo.getClick_FileInfo_Option1();
			Thread.sleep(9000);
			jsclick(pojo.getClick_FileInfo_OkButton_withFileName());
			Thread.sleep(6000);*/
			jsclick(pojo.getSave_button());
			Thread.sleep(4000);
			jsclick(pojo.getDocumentSave_Ok_button());
			Thread.sleep(10000);
			log.info("Upload and verify large xlxs file  document", true);
			jsclick(Refresh_Button(driver));
		}
		
		
		
		
		
		

}
