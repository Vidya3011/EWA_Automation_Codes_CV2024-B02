package Script;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Generic.BaseClass;
import Pom.Document_Version;

public class Document_Version_Test extends BaseClass {

	private static final Logger log = LogManager.getLogger(Document_Version_Test.class);

	// @BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	// @Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		//loginCaseSensitiveRoom();
		log.info("CVS User is logged in successfully...");

	}

	@Test(priority = 1)
	public void Verify_Document_Versions() throws Exception {

		Document_Version pojo = new Document_Version();
		Thread.sleep(6000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getCabinet_Plus_button());
		Thread.sleep(3000);
		jsclick(pojo.getDrawer_Plus_button());
		Thread.sleep(3000);
		movingDoublecli(pojo.get_Folder(), pojo.get_Folder());
		Thread.sleep(3000);
		jsclick(pojo.getSelect_Document());
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(6000);
		log.info("Verified Current Document Version Successfully");
	}

	@Test(priority = 2)
	public void Upload_and_Save_Newpage_and_Verify_Versionwith_Comments() throws Exception {

		Document_Version pojo = new Document_Version();
		jsclick(pojo.getFloatingButton());
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getUploadFab()));
		movingclkElement(pojo.getUploadFab());
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\Sample exe file Special characters\\Allowing files\\Tile.exe");
		log.info("New Page Upload Successfully");
		Thread.sleep(5000);
		jsclick(pojo.getSaveFab());
		Thread.sleep(4000);
		jsclick(pojo.getSaveOkButton());
		Thread.sleep(2000);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(2000);
		pojo.getVerify_Message();
		Thread.sleep(2000);
		jsclick(pojo.getClick_Message());
		Thread.sleep(4000);
		jsclick(pojo.getComments_Option());
		Thread.sleep(2000);
		jsclick(pojo.getComments_Box());
		pojo.getComments_Box().clear();
		pojo.getComments_Box().sendKeys(pojo.DocumentVersion_excelRead(1, 0));
		Thread.sleep(2000);
		jsclick(pojo.getSave_Comments());
		Thread.sleep(4000);
		log.info("Document Version Update with Comments");

	}

	@Test(priority = 3)
	public void Delete_Page_and_Verify_Version() throws Exception {

		Document_Version pojo = new Document_Version();
		jsclick(pojo.getSelect_ThumbnailPage());
		Thread.sleep(3000);
		jsclick(pojo.getDelete_FabButton());
		Thread.sleep(3000);
		jsclick(pojo.getDelete_Yes());
		Thread.sleep(3000);
		jsclick(pojo.getDelete_Ok());
		Thread.sleep(3000);
		jsclick(pojo.getSaveFab());
		Thread.sleep(4000);
		jsclick(pojo.getSaveOkButton());
		Thread.sleep(3000);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(3000);
		log.info("Document Page delete and Verified versions");
	}

	@Test(priority = 4)
	public void Verify_Delete_All_versions_and_FullScreen_Option() throws Exception {

		Document_Version pojo = new Document_Version();
		jsclick(pojo.getDelete_AllVersions());
		Thread.sleep(3000);
		jsclick(pojo.getyDelete_VersionmessageOk());
		Thread.sleep(3000);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(3000);
		jsclick(pojo.getFullScreen_Fabbutton());
		Thread.sleep(5000);
		jsclick(pojo.getCloseDoc());
		Thread.sleep(5000);
		log.info("Verified Delete All versions and Full screen Document from Floating button");
		jsclick(pojo.getCheckDoc());
		Thread.sleep(2000);
		pojo.getVerify_Delete_Document();

	}

	@Test(priority = 5)
	public void Verify_Add_Pages() throws Exception {

		Document_Version pojo = new Document_Version();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getCabinet_Plus_button());
		Thread.sleep(3000);
		jsclick(pojo.getDrawer_Plus_button());
		Thread.sleep(3000);
		movingDoublecli(pojo.get_Folder(), pojo.get_Folder());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Document());
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(4000);
		jsclick(pojo.getFloatingButton());
		Thread.sleep(5000);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(pojo.getUploadFab()));
		movingclkElement(pojo.getUploadFab());
		Thread.sleep(2000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\OfficeDoc\\FileUploadOfficedoc.exe");
		Thread.sleep(5000);
		jsclick(pojo.getFloatingButton());
		jsclick(pojo.getSaveFab());
		Thread.sleep(4000);
		jsclick(pojo.getSaveOkButton());
		Thread.sleep(2000);
		jsclick(pojo.getVersion_Option());
		Thread.sleep(2000);
		jsclick(pojo.getCloseDoc());
		Thread.sleep(5000);
		log.info("New page add and Verified Updated Version");
		jsclick(pojo.getCheckDoc());
		Thread.sleep(2000);
		pojo.get_CopyandPaste_Document();
		Thread.sleep(5000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
	}
}
