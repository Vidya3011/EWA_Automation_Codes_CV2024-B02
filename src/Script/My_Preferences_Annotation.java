package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.My_Preferences;

public class My_Preferences_Annotation extends BaseClass {

	@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully", true);

	}

	@Test(priority = 1)
	public void TC_01_Verify_Maximum_Annotation() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 1 : Verifying Maximum Annotation ", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.getallannotation().click();
		Thread.sleep(7000);
		Reporter.log("Click on Annotation", true);
		pojo.Select_Annotation_Dropdown1();
		Thread.sleep(3000);
		Reporter.log("Select Annotation value", true);
		pojo.getToastmessage();
		Reporter.log("Verified maximum annotation error message", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getUsername());
		Thread.sleep(2000);
		Reporter.log("Click on Username", true);
		jsclick(pojo.getLogout());
		Thread.sleep(7000);
		Reporter.log("Click on Logout Option", true);
		LogDipakUser();
		Thread.sleep(7000);
		Reporter.log("Login EWA with User credential ", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify_set_Annotation1() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 2 : Verifying set Annotation1 ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(7000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(7000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(7000);
		Reporter.log("select a Folder", true);
		pojo.getOK_Button_BrowseforFolder().click();
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getSelect_Document_Type_Dropdown();
		Thread.sleep(7000);
		Reporter.log("Select Document type Dropdown", true);
		pojo.getEnter_ReportName_Annotation();
		Reporter.log("Enter value Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse a Document", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(7000);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(10000);
		pojo.getVerify_AnnotationDropdown1_Option_enable();
		Thread.sleep(7000);
		Reporter.log("Verified Added annotation enable from menu", true);
		jsclick(pojo.getCreate_button());
		Thread.sleep(7000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getNavigate_button());
		Reporter.log("New Document Created successfully with verifying Annotation", true);
		Thread.sleep(7000);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
