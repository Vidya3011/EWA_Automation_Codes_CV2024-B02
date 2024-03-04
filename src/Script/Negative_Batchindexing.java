package Script;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.BatchIndexing;

public class Negative_Batchindexing extends Generic.BaseClass {

	private static final Logger log = LogManager.getLogger(Negative_Batchindexing.class);

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
	public void Verify_Emptyname_Indexing_folder() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(8000);
		jsclick(pojo.getBatchIndexing_MenuOption());
		Thread.sleep(6000);
		jsclick(pojo.getAdd());
		Thread.sleep(2000);
		jsclick(pojo.getAddFolder());
		jsclick(pojo.getOkbuttonFolder());
		Thread.sleep(4000);
		pojo.getFoldernamevalidation();
		Thread.sleep(4000);
		jsclick(pojo.getCancelbutton());
		log.info("Empty name Indexing folder not Created verified");
	}

	@Test(priority = 2)
	public void Verify_WithoutaddingUser_ShareandRevoke_Permission() throws Exception {

		BatchIndexing pojo = new BatchIndexing();
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
		pojo.getSelectcheckbox().click();
		Thread.sleep(2000);
		pojo.getassign().click();
		Thread.sleep(3000);
		pojo.getUservalidation();
		Thread.sleep(4000);
		jsclick(pojo.getCloseButton());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		log.info("Without adding user showing validation verified");
		Thread.sleep(5000);
	}
}
