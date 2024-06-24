package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.My_Preferences;

//Dipak Automation script
public class MoreDocument_Creation_Updatepage extends Generic.BaseClass {

	@BeforeClass

	public void  Launch_Browser() throws Exception {
		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		loginCVSTest();
		Reporter.log("User has logged in successfully.", true);

	}

	@Test(priority = 1, invocationCount = 2000)
	public void TC_01_Create_PDF_Documents() throws Exception {

		My_Preferences pojo = new My_Preferences();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
		jsclick(pojo.getClick_New_Document());
		Thread.sleep(2000);
		Reporter.log("Click on New Document Tab", true);
		jsclick(pojo.getDestination_Folder_Textbox());
		Thread.sleep(2000);
		Reporter.log("Click on Destination Folder Textbox", true);
		selectElement(pojo.getSelect_Cabinet2());
		Thread.sleep(2000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer2());
		Thread.sleep(3000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder2());
		Thread.sleep(2000);
		Reporter.log("select a Folder", true);
		jsclick(pojo.getOK_Button_BrowseforFolder());
		Thread.sleep(4000);
		Reporter.log("Click on Ok button ", true);
		pojo.getSelect_Document_Type_Dropdown1();
		Thread.sleep(4000);
		Reporter.log("Select Value from Document type dropdown", true);
		pojo.getEnter_ReportName();
		Thread.sleep(3000);
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse a Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PdfDoc\\FileUploadUpdate.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(5000);
		jsclick(pojo.getCreate_button());
		Thread.sleep(4000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getViewDocument_Button());
		Thread.sleep(3000);
		Reporter.log("Click on View button", true);
		Thread.sleep(3000);
		Reporter.log("Enter value into Report Name field", true);
		WebDriverWait wait11 = new WebDriverWait(driver, 20);
		wait11.until(ExpectedConditions.elementToBeClickable(pojo.getMove_To_PlusIcon()));
		movingclkElement(pojo.getMove_To_PlusIcon());
		pojo.getBrowse_Option();
		Thread.sleep(2000);
		Reporter.log("Browse a Document Page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\PdfDoc\\FileUploadUpdate.exe");
		Reporter.log("By using AutoIT add file from external folder", true);
		Thread.sleep(5000);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
	}
}

