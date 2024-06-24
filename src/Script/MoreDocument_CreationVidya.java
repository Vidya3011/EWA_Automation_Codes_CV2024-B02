package Script;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.My_Preferences;

//Dipak Automation script
public class MoreDocument_CreationVidya extends Generic.BaseClass {

	@BeforeClass

	public void  Launch_Browser() throws Exception {
		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
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
		Thread.sleep(4000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer2());
		Thread.sleep(4000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder3());
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
		Thread.sleep(4000);
		pojo.getMove_To_PlusIcon();
		Reporter.log("Move to  Plus Icon", true);
		pojo.getNew_pdf_Document_Option();
		Thread.sleep(4000);
		Reporter.log("Click on Pdf Document Option", true);
		pojo.getEnter_pdf_File_Name();
		Thread.sleep(4000);
		Reporter.log("Enter Pdf file name", true);
		Thread.sleep(4000);
		jsclick(pojo.getCreate_button());
		Thread.sleep(4000);
		Reporter.log("Click on Create button", true);
		jsclick(pojo.getViewDocument_Button());
		Thread.sleep(6000);
		Reporter.log("Click on View button", true);
		pojo.getMove_To_PlusIcon();
		Reporter.log("Move to  Plus Icon", true);
		pojo.getNew_pdf_Document_Option();
		Thread.sleep(4000);
		Reporter.log("Click on Pdf Document Option", true);
		pojo.getEnter_pdf_File_Name2page();
		Thread.sleep(4000);
		Reporter.log("Enter Pdf file name", true);
		jsclick(pojo.getSave_button());
		Thread.sleep(6000);
		Reporter.log("Click on Save button menu Option", true);
		jsclick(pojo.getDocumentSave_Ok_button());
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		
	}
}
