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
	Thread.sleep(50000);
		loadBrowser("Chrome");
		//log.info("Chrome Browser");
		
		launchUrl();
		//log.info("ContentVerseURL");
	}

	@Test (priority=1)
	public void Login() throws Exception {
		
		loginSQL2022RAM();
		//loginCVS();
	//	log.info("User is Successfully logged in");
	} 
	// @Test(priority=4,invocationCount=2000)
		public void AdvancedViewerPDfDoc() throws Exception{
			AdvancedViewer ad=new AdvancedViewer();
			ad.AdvancedViewPDFDocument_SQL();
			Reporter.log("PDF Document verified successfull");
		
	}
	@Test(priority=2,invocationCount=60)
	public void Createdocumentagain() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		//jsclick(pojo.getRefresh_button());
		Thread.sleep(3000);
		jsclick(pojo.getNewDocuments_MenuOption());
		Thread.sleep(3000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(3000);
		
		WebElement AutomationCab = driver.findElement(By.xpath("//*[@id=\"144\"]/ins"));
		jsclick(AutomationCab);
		Thread.sleep(3000);
		WebElement AutomationDrawer = driver.findElement(By.xpath("//*[@id=\"145\"]/ins"));
		jsclick(AutomationDrawer);
		Thread.sleep(3000);
		WebElement AutomationFolder = driver.findElement(By.xpath("//*[@id=\"434\"]/a"));
		jsclick(AutomationFolder);
		

		Thread.sleep(3000);
		Reporter.log("Folder is selected for Create New Documents", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(2000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.click(pojo.getDocumentCVRep()).sendKeys("Document with 4 pages").build().perform();
		Thread.sleep(3000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		Thread.sleep(3000);
		pojo.getBrowse_Option();
		Thread.sleep(8000);
		
		Runtime.getRuntime()
				.exec("D:\\RNishaAutoIt\\NishaRScript.exe");
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
		Thread.sleep(5000);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(4000);
		jsclick(pojo.getView_Button());
		Thread.sleep(5000);
		AnnotaionsPom an=new AnnotaionsPom();
	//	an.closeAndReopenThePage();
		
		Thread.sleep(4000);
		movingclkElement(pojo.getMove_To_PlusIcon());
		Thread.sleep(3000);
		pojo.getBrowse_Option();
		Thread.sleep(5000);
		
		Runtime.getRuntime()
				.exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Accent.exe");
		Thread.sleep(5000);
	
	
	movingElement(pojo.getSave_button());
		jsclick(pojo.getSave_button());
		Thread.sleep(5000);
		jsclick(pojo.getDocumentSave_Ok_button());
		
		
	//	log.info("Upload and verify large file pdf document", true);
		//jsclick(Refresh_Button(driver));
		Thread.sleep(7000);
	}


}
