package Script;

import java.time.Duration;

//Dipak Automation script

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.BatchIndexing;
import Pom.Customcolumns;

public class BatchIndexing_Test extends Generic.BaseClass {

	private static final Logger log = LogManager.getLogger(BatchIndexing_Test.class);

	// @BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	// @Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		log.info("CVS User is logged in successfully...");
	}

	@Test(priority = 1)
	public void Create_Indexing_Document() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(4000);
		jsclick(pojo.getAdd());
		Thread.sleep(4000);
		jsclick(pojo.getAddFolder());
		pojo.getFolderText().sendKeys(pojo.BatchIndexing_excelRead(1, 1));
		Thread.sleep(4000);
		pojo.getFolderDescription().sendKeys(pojo.BatchIndexing_excelRead(2, 1));
		Thread.sleep(4000);
		jsclick(pojo.getcheck1());
		jsclick(pojo.getOkbuttonFolder());
		Thread.sleep(4000);
		try {
			WebElement Message = pojo.getFolderOK();
			Message.click();
			Thread.sleep(4000);
			jsclick(pojo.getCancelbutton());
			Thread.sleep(4000);
		} catch (Exception e) {
			// message is not displayed
		}
		jsclick(pojo.getclickFolderDropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelectFolder());
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getChooseFile()));
		movingclkElement(pojo.getChooseFile());
		Thread.sleep(8000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\BatchIndexingDoc.exe");
		Thread.sleep(6000);
		log.info("page upload successfully");
		jsclick(pojo.getclickFolderDropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelectFolder());
		Thread.sleep(6000);
		jsclick(pojo.getAdd());
		Thread.sleep(4000);
		jsclick(pojo.getshowThumbnailoption());
		Thread.sleep(4000);
		jsclick(pojo.getClickShowThumbnails());
		Thread.sleep(6000);
		jsclick(pojo.getSelectDoc1());
		Thread.sleep(8000);
		pojo.getVerifyFolderDescription();
		Thread.sleep(4000);
		jsclick(pojo.getSingleDoc());
		Thread.sleep(4000);
		jsclick(pojo.getIndexbutton());
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
		Thread.sleep(4000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Cabinet(), pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Drawer(), pojo.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Folder(), pojo.getSelect_Folder());
		Thread.sleep(4000);
		Reporter.log("Folder is selected for Create New Documents", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		pojo.getEnter_Report_Name_Text().sendKeys(pojo.BatchIndexing_excelRead(3, 1));
		Thread.sleep(4000);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(4000);
		jsclick(pojo.getView_Button());
		Thread.sleep(6000);
		log.info("Indexing Document created successfully");
	}

	@Test(priority = 2)
	public void Delete_Indexing_Document() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(4000);
		jsclick(pojo.getclickFolderDropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelectFolder());
		Thread.sleep(4000);
		jsclick(pojo.getSelectDoc1());
		Thread.sleep(4000);
		jsclick(pojo.getAdd());
		Thread.sleep(4000);
		jsclick(pojo.getDeleteDoc());
		log.info("Selected Indexing Document Deleted successfully");
	}

	@Test(priority = 3)
	public void Verify_Setting_Delete_on_Index_onDocument() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		Thread.sleep(5000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(4000);
		jsclick(pojo.getclickFolderDropdown());
		Thread.sleep(8000);
		jsclick(pojo.getSelectFolder());
		Thread.sleep(4000);
		jsclick(pojo.getAdd());
		Thread.sleep(4000);
		jsclick(pojo.getsettingoption());
		Thread.sleep(4000);
		pojo.getDeletesource_Option(driver);
		Thread.sleep(4000);
		pojo.getallowDeleteOnIndex_Option(driver);
		Thread.sleep(4000);
		jsclick(pojo.getrepostSettingsModalOk());
		jsclick(pojo.getSingleDoc());
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getChooseFile()));
		movingclkElement(pojo.getChooseFile());
		Thread.sleep(8000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\BatchIndexingDoc.exe");
		Thread.sleep(6000);
		jsclick(pojo.getSelectDoc1());
		Thread.sleep(4000);
		jsclick(pojo.getIndexbutton());
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		wait2.until(ExpectedConditions.alertIsPresent());
		Alert alt2 = driver.switchTo().alert();
		alt2.accept();
		Thread.sleep(6000);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Cabinet(), pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Drawer(), pojo.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Folder(), pojo.getSelect_Folder());
		Thread.sleep(4000);
		Reporter.log("Folder is selected for Create New Documents", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document_Type_Dropdown());
		Thread.sleep(4000);
		pojo.getEnter_Report_Name_Text().sendKeys(pojo.BatchIndexing_excelRead(3, 1));
		Thread.sleep(4000);
		jsclick(pojo.getCreate_Button());
		Thread.sleep(4000);
		jsclick(pojo.getView_Button());
		Thread.sleep(5000);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(8000);
		jsclick(pojo.getCloseButton());

		log.info("Verified Setting Delete on Index onDocument");

	}

	@Test(priority = 4)
	public void Verify_Assign_Share_Permission() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		Thread.sleep(5000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(4000);
		jsclick(pojo.getclickFolderDropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelectFolder());
		Thread.sleep(4000);
		jsclick(pojo.getAdd());
		Thread.sleep(4000);
		jsclick(pojo.getsharePermission());
		Thread.sleep(4000);
		pojo.getAlluser().click();
		pojo.getSelectcheckbox().click();
		Thread.sleep(2000);
		pojo.getassign().click();
		Thread.sleep(4000);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		jsclick(pojo.getLogout());
		Thread.sleep(4000);
		pojo.login_Assign_User();
		Thread.sleep(7000);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(4000);
		jsclick(pojo.getclickFolderDropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelectFolder());
		Thread.sleep(6000);
		jsclick(pojo.getCloseButton());
		Thread.sleep(4000);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		jsclick(pojo.getLogout());
		Thread.sleep(6000);
		LogDipakUser();
		log.info("Verified assign share permission on Index onDocument");
	}

	@Test(priority = 5)
	public void Verify_Revoke_Share_Permission() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		Thread.sleep(5000);
		jsclick(pojo.getRefreshbutton());
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(4000);
		jsclick(pojo.getclickFolderDropdown());
		Thread.sleep(4000);
		jsclick(pojo.getSelectFolder());
		Thread.sleep(4000);
		jsclick(pojo.getAdd());
		Thread.sleep(4000);
		jsclick(pojo.getsharePermission());
		Thread.sleep(6000);
		jsclick(pojo.getRevoke());
		Thread.sleep(4000);
		jsclick(pojo.getCloseButton());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		log.info("Verified Revoke share permission on Index onDocument");
	}
}