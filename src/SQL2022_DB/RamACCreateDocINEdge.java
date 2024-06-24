package SQL2022_DB;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.AdvancedViewer;
import Pom.AnnotaionsPom;
import Pom.SpecialCharFilenames;

public class RamACCreateDocINEdge extends BaseClass {
	@BeforeClass
	public void ladBrowser()  throws Exception {
	//Thread.sleep(50000);
		loadBrowser("Chrome");
		//log.info("Chrome Browser");
		launchUrl();
		//launchCreatedocUrl();
		//log.info("ContentVerseURL");
	}

	@Test (priority=1)
	public void Login() throws Exception {
		AdvancedViewer ad=new AdvancedViewer();
		loginSQL2022RAM();
		ad.ExpandNodes();
	//	log.info("User is Successfully logged in");
	} 
	
	
	
	
	
	
	 @Test(priority=4,invocationCount=4000)
		public void AdvancedViewerPDfDoc() throws Exception{
	
			/*AdvancedViewer ad=new AdvancedViewer();
			ad.AdvancedViewPDFDocument_SQL();
			Reporter.log("PDF Document verified successfull",true);*/
		 
		
		 
		 
		//	driver.findElement(By.xpath("//*[@id=\"general\"]/div/div[1]/span")).click();
		 AdvancedViewer am = new AdvancedViewer();
			am.CerateDocPDF();//Creating document and view and save script is this
		am.UpdateDocument();
		
		 
	}
		//@Test(priority=3,invocationCount=80)
		public void AdvancedViewerWordDocument() throws Exception {
			
			AdvancedViewer ad=new AdvancedViewer();
			ad.CreateDocumentAdvancedViewWordDocument_SQL();
			Reporter.log("Word Document verified successfull");
		}
	//@Test(priority=2,invocationCount=10)
	public void Createdocumentagain() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		
	//	for (int i= 0;i< 4; i++) {

	
		//jsclick(pojo.getRefresh_button());-
		//Thread.sleep(2000);
		Thread.sleep(3000);
		jsclick(pojo.getNewDocuments_MenuOption());
		Thread.sleep(3000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(3000);
		
		
		jsclick(pojo.getSelect_Cabinet1());
		Thread.sleep(2000);
	
		jsclick(pojo.getSelect_Drawer1());
		Thread.sleep(2000);
	
		jsclick(pojo.getSelect_Folder1());
		

		Thread.sleep(3000);
		Reporter.log("Folder is selected for Create New Documents", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(2000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.click().sendKeys("CreateAndUpdate").build().perform();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
	//	wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		pojo.getMove_To_PlusIcon();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getBrowse_Option()));
		movingclkElement(pojo.getBrowse_Option());
		Thread.sleep(8000);
		
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Tile.exe");
		Thread.sleep(8000);
		try {
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		}
		catch(Exception e) {
			Reporter.log("Alert not present");
		}
		Thread.sleep(2000);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(3000);
		jsclick(pojo.getView_Button());
		Thread.sleep(2000);
		
		
		
		
		
		
	}
	//@Test(priority=3)
		public void UpdateDocument() throws Exception {
		
			SpecialCharFilenames pojo = new SpecialCharFilenames();
	
	ElementToBeClickable(pojo.getMove_To_PlusIcon());
		Thread.sleep(3000);
		movingElement(pojo.getMove_To_PlusIcon());
		Thread.sleep(2000);
		movingclkElement(pojo.getBrowse_Option());
		Thread.sleep(8000);
		
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Tile.exe");
		Thread.sleep(6000);
		try {
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		}
		catch(Exception e) {
			Reporter.log("Alert not present");
		}
		Thread.sleep(2000);
	
	
	movingElement(pojo.getSave_button());
	Thread.sleep(3000);
	
		jsclick(pojo.getSave_button());
		Thread.sleep(5000);
		jsclick(pojo.getDocumentSave_Ok_button());
		
	}
	}



