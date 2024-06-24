package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.My_Preferences;

public class My_Preferences_Add_signature extends BaseClass {

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
	public void TC_01_Verify_Upload_New_Signature() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 1 : Verifying Upload New Signature", true);
		Thread.sleep(6000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Office document and set as Default view", true);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(7000);
		Reporter.log("Select Pdf document and set as Default view", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getClick_AddSignature();
		Thread.sleep(7000);
		Reporter.log("Click on Add signature button", true);
		try {
		pojo.getsettingpass();
		Thread.sleep(7000);
		Reporter.log("Enter a Password", true);
		} catch (Exception e) {
			System.out.println("signature is not password protected...");
		}
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getClick_AddSignature_Upload()));
		jsclick(pojo.getClick_AddSignature_Upload());
		Thread.sleep(4000);
		pojo.getclickProtectpassword();
		Thread.sleep(7000);
		Reporter.log("Check on Protect password Icon", true);
		Actions act = new Actions(driver);
		act.moveToElement(pojo.getClick_AddSignature_Browse()).click().build().perform();
		Thread.sleep(5000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\UploadSignature.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(5000);
		pojo.getClick_AddSignature_Save();
		Thread.sleep(5000);
		Reporter.log("Click on Save button", true);
		pojo.getEnterpassword();
		Thread.sleep(4000);
		Reporter.log("Enter a Password", true);
		pojo.getSignature_Upload_OkButton();
		Thread.sleep(5000);
		Reporter.log("Click on Upload button", true);
		Reporter.log("New signature Upload Successfully", true);
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(7000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(5000);
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
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getSelect_Document_Type_Dropdown();
		Thread.sleep(3000);
		Reporter.log("Select Document type dropdown", true);
		pojo.getEnter_ReportName_Addsignature();
		Thread.sleep(2000);
		Reporter.log("Enter value Report Name field", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(10000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScript.exe");
		Reporter.log("By using AutoIT add file from external folder", true);

		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(9000);
		pojo.getClick_signature_Menuoption();
		Thread.sleep(7000);
		Reporter.log("Click on signature menu Option", true);
		pojo.getinputpassword();
		Thread.sleep(7000);
		Reporter.log("Enter a Password", true);
		pojo.getAdd_Signature_Onpage();
		Thread.sleep(7000);
		Reporter.log("New signature added Successfully on  Document", true);
		jsclick(pojo.getCreate_button());
		Thread.sleep(7000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getNavigate_button());
		Reporter.log("New Document Created successfully with signature", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify_Type_New_Signature() throws Exception {

		My_Preferences pojo = new My_Preferences();

		Reporter.log("Test Scenario 2 : Verifying New Signature Type ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on Setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences", true);
		pojo.getClick_AddSignature();
		Thread.sleep(7000);
		Reporter.log("Click on Add Signature button", true);
		try {
		pojo.getsettingpass();
		Thread.sleep(7000);
		Reporter.log("Enter a Password", true);
		} catch (Exception e) {
			System.out.println("signature is not password protected...");
		}
		jsclick(pojo.getsignType());
		Thread.sleep(7000);
		Reporter.log("Select sign type", true);
		pojo.getclickProtectpassword();
		Thread.sleep(7000);
		Reporter.log("Check Password Protect Icon", true);
		pojo.getsignatureFont();
		Thread.sleep(7000);
		Reporter.log("Select signature Font", true);
		pojo.getsignInput();
		Thread.sleep(7000);
		Reporter.log("Enter  Signature Name", true);
		pojo.getsignatureFontOption2();
		Thread.sleep(7000);
		Reporter.log("Select again New Signature Font", true);
		pojo.getsignInput();
		Thread.sleep(7000);
		Reporter.log("Enter signature Name", true);
		pojo.getsavesigntype();
		Thread.sleep(7000);
		Reporter.log("Click on Save button", true);
		pojo.getEnterpassword();
		Thread.sleep(7000);
		Reporter.log("Enter a Password", true);
		pojo.getSignature_Upload_OkButton();
		Thread.sleep(7000);
		Reporter.log("Click on the Upload button", true);
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(7000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(7000);
		Reporter.log("Click on Destination Folder textbox", true);
		selectElement(pojo.getSelect_Cabinet1());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer1());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder1());
		Thread.sleep(7000);
		Reporter.log("select a Folder", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		pojo.getSelect_Document_Type_Dropdown();
		Thread.sleep(7000);
		Reporter.log("Select document type dropdown", true);
		pojo.getEnter_ReportName_Addsignature();
		Thread.sleep(2000);
		Reporter.log("Enter Report name", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Reporter.log("Browse Document Page", true);
		Thread.sleep(8000);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\FileUploadScriptpdf.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		try {
			WebDriverWait wait2 = new WebDriverWait(driver, 20);
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(7000);
		pojo.getClick_signature_Menuoption();
		Thread.sleep(7000);
		Reporter.log("Click on Signature menu Option", true);
		pojo.getinputpassword();
		Thread.sleep(7000);
		Reporter.log("Enter a Password", true);
		pojo.getAdd_Signature_Onpage();
		Thread.sleep(7000);
		Reporter.log("New signature type added Successfully on  Document", true);
		jsclick(pojo.getCreate_button());
		Thread.sleep(7000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getNavigate_button());
		Reporter.log("New Document Created successfully with signature type ", true);
		Thread.sleep(7000);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
