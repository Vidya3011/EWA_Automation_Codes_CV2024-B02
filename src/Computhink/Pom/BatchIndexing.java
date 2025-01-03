package Computhink.Pom;

//Dipak Automation Coading

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
<<<<<<< HEAD
import org.testng.Assert;
=======
>>>>>>> origin/Dipak-Pandurang-Gawali
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class BatchIndexing extends Computhink.Generic.BaseClass {

	public BatchIndexing() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Cabinet;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer;

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder;

	@FindBy(xpath = "//*[@id=\"createReposFabButton\"]/img")
	private WebElement BatchIndexing_MenuOption;

	@FindBy(xpath = "//*[@id=\"addNewReposFileAndFolderSpan\"]")
	private WebElement Add;

	@FindBy(xpath = "//*[@id=\"addReposFolderAnchor\"]")
	private WebElement AddFolder;

	@FindBy(xpath = "//*[@id=\"repositoryCreateFoldLabelTxt\"]")
	private WebElement FolderText;

<<<<<<< HEAD
	@FindBy(xpath = "//*[@class=\"e-content e-dropdownbase\"]/ul/li[4]")
=======
	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//ul[@id='checkbox_options']/li[4]")
>>>>>>> origin/Dipak-Pandurang-Gawali
	private WebElement SelectrAssignUser;

	@FindBy(xpath = "//*[@id=\"newFolderDescription\"]")
	private WebElement FolderDescription;

	@FindBy(xpath = "//*[@id=\"allowDeleteAtSourceFoldLevel\"]")
	private WebElement check1;

	@FindBy(xpath = "//*[@id=\"allowDeleteOnIndexFoldLevel\"]")
	private WebElement check2;

	@FindBy(xpath = "//*[@id=\"repostCreateModalOk\"]")
	private WebElement OkbuttonFolder;

<<<<<<< HEAD
	@FindBy(xpath = "//*[@id=\"userBasedDropDownRepositoryFolders\"]")
	private WebElement clickFolderDropdown;

	@FindBy(xpath = ("//*[@id='spanRepositoryCheck_BatchIndexing']"))
	private WebElement SelectFolder;

=======
	@FindBy(xpath = "//*[@id=\"cvDocumentClose\"]/span")
	private WebElement closedoc;

	@FindBy(xpath = "//*[@id=\"userBasedDropDownRepositoryFolders\"]")
	private WebElement clickFolderDropdown;

	@FindBy(xpath = "//*[@id=\"backBtnReposFolder\"]/a/i")
	private WebElement FolderBackButton;

	@FindBy(xpath = ("//*[@id='spanRepositoryCheck_BatchIndexing']"))
	private WebElement SelectFolder;

	@FindBy(xpath = ("//*[@id='spanRepositoryCheck_dipak']"))
	private WebElement SelectAssignFolder;

>>>>>>> origin/Dipak-Pandurang-Gawali
	@FindBy(xpath = "//*[@id=\"files\"]")
	private WebElement ChooseFile;

	@FindBy(xpath = "//*[@id=\"showThumbnailSelectToggle\"]")
	private WebElement ClickShowThumbnails;

	@FindBy(xpath = "//*[@id=\"repositoryFileListTable\"]/tbody/tr[1]/td[1]/label/input")
	private WebElement SelectDoc1;

<<<<<<< HEAD
	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"repositoryFileListTable\"]/tbody/tr[2]/td[1]/label/input")
	private WebElement SelectDoc2;

=======
	@FindBy(xpath = "//*[@id=\"repositoryFileListTable\"]/tbody/tr[2]/td[1]/label/input")
	private WebElement SelectDoc2;

	@FindBy(xpath = "//*[@id=\"repositoryFileListTable\"]/tbody/tr[3]/td[1]/label/input")
	private WebElement SelectDoc3;

	@FindBy(xpath = "//*[@id=\"repositoryFileListTable\"]/tbody/tr[4]/td[1]/label/input")
	private WebElement SelectDoc4;

>>>>>>> origin/Dipak-Pandurang-Gawali
	@FindBy(xpath = "(//*[@id='folderDescriptionSpan'])[1]")
	private WebElement VerifyFolderDescription;

	@FindBy(xpath = "//*[@id=\"createAsSingleRepo\"]")
	private WebElement SingleDoc;

	@FindBy(xpath = "//*[@id=\"repostModalIndex\"]")
	private WebElement Indexbutton;

	@FindBy(xpath = "//*[@id=\"createDocuemtnLocation\"]")
	private WebElement Destination_Folder_Textbox;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk\"]")
	private WebElement OK_Button_BrowseforFolder;

	@FindBy(xpath = "//*[@id=\"docTypeList\"]")
	private WebElement Click_Document_Type_Dropdown;

	@FindBy(xpath = "//*[@id='docTypeIndicesTable']/tbody[1]/tr[1]/td[2]/input[1]")
	private WebElement Enter_Report_Name_Text;

	@FindBy(xpath = "//*[@id=\"createDocumentSubmit\"]")
	private WebElement Create_Button;

	@FindBy(xpath = "//*[@id=\"viewCreatedDocument\"]")
	private WebElement View_Button;

<<<<<<< HEAD
=======
	@FindBy(xpath = "//*[@id=\"modelHome\"]")
	private WebElement Navigate_Button;

>>>>>>> origin/Dipak-Pandurang-Gawali
	@FindBy(xpath = "//*[@id=\"settingsBtnShowThumbnail\"]/a")
	private WebElement showThumbnailoption;

	@FindBy(xpath = "//*[@id=\"deleteBtnReposFolder\"]")
	private WebElement DeleteDoc;

<<<<<<< HEAD
=======
	@FindBy(xpath = "//*[@id=\"folderDescriptionSpan\"]")
	private WebElement BatchIndex_FolderDescription;

>>>>>>> origin/Dipak-Pandurang-Gawali
	@FindBy(xpath = "//*[@id=\"settingsBtnReposFolder\"]")
	private WebElement settingoption;

	@FindBy(xpath = "//*[@id=\"allowDeleteAtSource\"]")
	private WebElement Deletesourceoption;

	@FindBy(xpath = "//*[@id=\"repostSettingsModalOk\"]")
	private WebElement repostSettingsModalOk;

	@FindBy(xpath = "//*[@id=\"repostSettingsModalCancel\"]")
	private WebElement CloseButton;

	@FindBy(xpath = "//*[@id=\"shareBtnReposFolder\"]/a")
	private WebElement sharePermission;

	@FindBy(xpath = "//*[@id=\"repostModalCancel\"] ")
	private WebElement BatchIndexDialogCancel;

	@FindBy(xpath = "//*[@id=\"assignSharePermission\"]")
	private WebElement assign;

	@FindBy(xpath = "//*[@id=\"revokeSharePermission\"]")
	private WebElement Revoke;

<<<<<<< HEAD
	@FindBy(xpath = "//*[@id=\"repostCreateModalCancel\"]")
=======
	@FindBy(xpath = "//button[@id='repostCreateModalCancel']")
>>>>>>> origin/Dipak-Pandurang-Gawali
	private WebElement Cancelbutton;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement FolderOK;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Foldernamevalidation;

	@FindBy(xpath = "//*[@id=\"messageButtonOK\"]")
	private WebElement Ok;

	@FindBy(xpath = "//*[@id=\"reposAllUsersDiv\"]/div/div")
	private WebElement Alluser;

	@FindBy(xpath = ("//*[@id=\"reposAllUsersDiv\"]/div"))
	private WebElement Selectcheckbox;

	@FindBy(xpath = "//*[@id=\"messageContent\"]")
	private WebElement Uservalidation;

	@FindBy(xpath = "//*[@id=\"allowDeleteOnIndex\"]")
	private WebElement allowDeleteOnIndex;

<<<<<<< HEAD
	public void VerifyFolderDescription() {
		WebElement Description = VerifyFolderDescription;
		Reporter.log("File Description is:" + Description.getText() + "this message should show", true);
=======
	SoftAssert softAssert = new SoftAssert();

	public void VerifyFolderDescription() {
		WebElement Description = VerifyFolderDescription;
		Reporter.log("File Description is :" + Description.getText() + " this message should show", true);
	}

	public void getFolder_Message_Verify() {

		String expectedtext = "This folder is created for Batch Indexing";
		String actualtext = BatchIndex_FolderDescription.getText();
		softAssert.assertEquals(actualtext, expectedtext, "Text verification failed");
		softAssert.assertAll();
>>>>>>> origin/Dipak-Pandurang-Gawali
	}

	public WebElement Select_Document_Type_Dropdown() {
		Select drop = new Select(Click_Document_Type_Dropdown);
		drop.selectByVisibleText("CVReports");
		return Click_Document_Type_Dropdown;

	}

	public WebElement Deletesource_Option() {
		if (Deletesourceoption.isSelected() == true) {
			jsclick(Deletesourceoption);
		}
		return Deletesourceoption;
	}

	public void allowDeleteOnIndex_Option() {
		if (allowDeleteOnIndex.isSelected() == false) {
			jsclick(allowDeleteOnIndex);
		}

	}

	public void Foldernamevalidation() {

		String expectedtext = "Please enter folder name!";
		String actualtext = Foldernamevalidation.getText();
<<<<<<< HEAD
		Assert.assertEquals(actualtext, expectedtext);
=======
		softAssert.assertEquals(actualtext, expectedtext);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log(Foldernamevalidation.getText() + " this validation message should show", true);
		jsclick(Ok);

	}

	public void Uservalidation() {

		String expectedtext = "Please select a user to assign permission";
		String actualtext = Uservalidation.getText();
<<<<<<< HEAD
		Assert.assertEquals(actualtext, expectedtext);
=======
		softAssert.assertEquals(actualtext, expectedtext);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log(Uservalidation.getText() + " this validation message should show", true);
		jsclick(Ok);

	}

	public void Revokeuservalidation() {

		String expectedtext = "Selected folder is not shared to any user";
		String actualtext = Uservalidation.getText();
<<<<<<< HEAD
		Assert.assertEquals(actualtext, expectedtext);
=======
		softAssert.assertEquals(actualtext, expectedtext);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log(Uservalidation.getText() + " this validation message should show", true);
		jsclick(Ok);

	}

	public void Create_Folder_and_Indexing_Document_with_Thumbnail() throws Exception {

		Reporter.log(
				"Test Scenario 1 :Verifying Create new folder and create Indexing document with show Thumbnails option ",
				true);
		try {
			LogDipakUser();
<<<<<<< HEAD
			Thread.sleep(6000);
=======
			Thread.sleep(5000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		} catch (Exception e) {
			System.out.println("User is already logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(BatchIndexDialogCancel);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Batch Index dialog closed
		}
		Refresh_Button();
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(8000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on Refresh button", true);
		jsclick(BatchIndexing_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on Batch Indexing Icon", true);
		jsclick(Add);
		Thread.sleep(6000);
		Reporter.log("Click on Add Icon", true);
		jsclick(AddFolder);
		Reporter.log("Click on Add Folder", true);
		FolderText.sendKeys(BatchIndexing_excelRead(1, 2));
		Thread.sleep(6000);
		Reporter.log("Click on Folder Textbox", true);
		FolderDescription.sendKeys(BatchIndexing_excelRead(1, 3));
		Thread.sleep(6000);
		Reporter.log("Enter Description text into folder description field", true);
		jsclick(check1);
		Reporter.log("Check a Checkbox", true);
		jsclick(OkbuttonFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);

		try {
			WebElement Message = FolderOK;
			Message.click();
			Thread.sleep(6000);
			Reporter.log("Verifying folder already exist and click on Ok button", true);
			jsclick(Cancelbutton);
			Reporter.log("Click on cancel button", true);
			Thread.sleep(6000);
		} catch (Exception e) {
			// message is not displayed
		}
<<<<<<< HEAD
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on Folder dropdown", true);
		movingclkElement(SelectFolder);
		Thread.sleep(6000);
		Reporter.log("Select a created folder", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ChooseFile));
		jsclick(ChooseFile);
=======
		Thread.sleep(6000);
		movingclkElement(FolderBackButton);
		Reporter.log("Click on back button", true);
		Thread.sleep(4000);
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on Folder dropdown", true);
		jsclick(SelectFolder);
		Thread.sleep(6000);
		Reporter.log("Select a created folder", true);
		getFolder_Message_Verify();

		if (BatchIndex_FolderDescription.isDisplayed()) {

			Reporter.log("BatchIndex Folder Description is displayed successfully.", true);
		} else {
			Reporter.log("BatchIndex Folder Description is NOT displayed.", true);
		}

		softAssert.assertTrue(BatchIndex_FolderDescription.isDisplayed(),
				"BatchIndex Folder Description is not displayed");
		Thread.sleep(6000);
		softAssert.assertAll();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ChooseFile));
		movingclkElement(ChooseFile);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Thread.sleep(6000);
		Reporter.log("Click on Choose file button and upload document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\BatchIndexingDoc.exe");
		Thread.sleep(6000);
		Reporter.log("By using AutoIT add file from external folder", true);
<<<<<<< HEAD
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on Folder dropdown", true);
		movingclkElement(SelectFolder);
=======
		movingclkElement(FolderBackButton);
		Reporter.log("Click on back button", true);
		Thread.sleep(4000);
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on Folder dropdown", true);
		jsclick(SelectFolder);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Thread.sleep(6000);
		Reporter.log("Select a created folder", true);
		movingclkElement(Add);
		Thread.sleep(6000);
		Reporter.log("Click on add Icon", true);
		movingclkElement(showThumbnailoption);
		Thread.sleep(6000);
		Reporter.log("Click on Show Thumbnail option", true);
		jsclick(ClickShowThumbnails);
		Thread.sleep(6000);
		Reporter.log("Check Show Thumbnail Icon", true);
		jsclick(SelectDoc1);
		Thread.sleep(6000);
		Reporter.log("Select a first page Thumbnail", true);
		VerifyFolderDescription();
		Thread.sleep(6000);
		Reporter.log("Verified folder description", true);
		jsclick(Indexbutton);
		Reporter.log("Click on Index button", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on destination folder Textbox", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("Select a folder for create new documents", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Select_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select a document type dropdown", true);
		Enter_Report_Name_Text.sendKeys(BatchIndexing_excelRead(1, 2));
		Thread.sleep(6000);
		Reporter.log("Enter value into Report name field", true);
		movingclkElement(Create_Button);
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(8000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on create button", true);
		jsclick(View_Button);
		Thread.sleep(6000);
		Reporter.log("Click on View button", true);
		Reporter.log("Verifying Create folder and create Indexing document with show Thumbnails option successfully",
				true);

	}

	public void Create_Single_Document() throws Exception {

		Reporter.log("Scenario 02: Verifying create As Single document", true);
		try {
			LogDipakUser();
<<<<<<< HEAD
			Thread.sleep(6000);
=======
			Thread.sleep(5000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		} catch (Exception e) {
			System.out.println("User is already logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(BatchIndexDialogCancel);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Batch Index dialog closed
		}
		Refresh_Button();
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(8000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on Refresh button", true);
		jsclick(BatchIndexing_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on Batch Indexing Icon", true);
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on Folder dropdown", true);
<<<<<<< HEAD
		movingclkElement(SelectFolder);
		Thread.sleep(6000);
		Reporter.log("Select a created folder", true);
		WebDriverWait wait = new WebDriverWait(driver, 20);
=======
		jsclick(SelectFolder);
		Thread.sleep(6000);
		Reporter.log("Select a created folder", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
>>>>>>> origin/Dipak-Pandurang-Gawali
		wait.until(ExpectedConditions.elementToBeClickable(ChooseFile));
		jsclick(ChooseFile);
		Thread.sleep(6000);
		Reporter.log("Click on Choose file button and upload document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\BatchIndexingDoc.exe");
		Thread.sleep(6000);
		Reporter.log("By using AutoIT add file from external folder", true);
<<<<<<< HEAD
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on folder dropdown", true);
		movingclkElement(SelectFolder);
=======
		movingclkElement(FolderBackButton);
		Reporter.log("Click on back button", true);
		Thread.sleep(4000);
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on folder dropdown", true);
		jsclick(SelectFolder);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Thread.sleep(6000);
		Reporter.log("Select folder from dropdown", true);
		jsclick(SelectDoc1);
		Thread.sleep(6000);
		Reporter.log("Select a first page Thumbnail", true);
<<<<<<< HEAD
=======
		jsclick(SelectDoc2);
		Thread.sleep(6000);
		Reporter.log("Select a second page Thumbnail", true);
>>>>>>> origin/Dipak-Pandurang-Gawali
		VerifyFolderDescription();
		Thread.sleep(6000);
		Reporter.log("Verified folder description", true);
		jsclick(SingleDoc);
		Thread.sleep(6000);
		Reporter.log("Check single document checkbox", true);
		jsclick(Indexbutton);
		Reporter.log("Click on Index button", true);
<<<<<<< HEAD
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.alertIsPresent());
		Alert alt1 = driver.switchTo().alert();
		alt1.accept();
=======
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			System.out.println("Alert is not Present");
		}
>>>>>>> origin/Dipak-Pandurang-Gawali
		Thread.sleep(6000);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on destination folder Textbox", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("Select a folder for create new documents", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Select_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select a document type dropdown", true);
		Enter_Report_Name_Text.sendKeys(BatchIndexing_excelRead(1, 2));
		Thread.sleep(6000);
		Reporter.log("Enter value into Report Name field ", true);
		movingclkElement(Create_Button);
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(8000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on create button", true);
		jsclick(View_Button);
		Thread.sleep(6000);
		Reporter.log("Click on View button", true);
<<<<<<< HEAD
		Reporter.log("Verifying create As Single document successfully", true);
=======
		jsclick(closedoc);
		Reporter.log("Close the open document", true);
		Thread.sleep(4000);
		Reporter.log("Verifying create As Single document successfully", true);

	}

	public void Create_multiple_Document() throws Exception {

		Reporter.log("Scenario 03: Verifying create As Single document", true);
		try {
			LogDipakUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(BatchIndexDialogCancel);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Batch Index dialog closed
		}

		Refresh_Button();
		Thread.sleep(8000);
		Reporter.log("Click on Refresh button", true);
		jsclick(BatchIndexing_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on Batch Indexing Icon", true);
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on Folder dropdown", true);
		jsclick(SelectFolder);
		Thread.sleep(10000);
		Reporter.log("Select a created folder", true);
		jsclick(SelectDoc1);
		Thread.sleep(3000);
		Reporter.log("Select a first page Thumbnail", true);
		jsclick(SelectDoc2);
		Thread.sleep(3000);
		Reporter.log("Select a second page Thumbnail", true);
		jsclick(SelectDoc3);
		Thread.sleep(3000);
		Reporter.log("Select a third page Thumbnail", true);
		jsclick(SelectDoc4);
		Thread.sleep(3000);
		Reporter.log("Select a fourth page Thumbnail", true);
		VerifyFolderDescription();
		Thread.sleep(6000);
		Reporter.log("Verified folder description", true);
		jsclick(Indexbutton);
		Reporter.log("Click on Index button", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			System.out.println("Alert is not Present");
		}
		Thread.sleep(6000);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on destination folder Textbox", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("Select a folder for create new documents", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Select_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select a document type dropdown", true);
		Enter_Report_Name_Text.sendKeys(BatchIndexing_excelRead(1, 2));
		Thread.sleep(6000);
		Reporter.log("Enter value into Report Name field ", true);
		movingclkElement(Create_Button);
		Thread.sleep(8000);
		Reporter.log("Click on create button", true);
		Thread.sleep(6000);

		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			System.out.println("Alert is not Present");
		}
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on destination folder Textbox", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("Select a folder for create new documents", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Select_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select a document type dropdown", true);
		Enter_Report_Name_Text.sendKeys(BatchIndexing_excelRead(1, 2));
		Thread.sleep(6000);
		Reporter.log("Enter value into Report Name field ", true);
		movingclkElement(Create_Button);
		Thread.sleep(8000);
		Reporter.log("Click on create button", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			System.out.println("Alert is not Present");
		}
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on destination folder Textbox", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("Select a folder for create new documents", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Select_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select a document type dropdown", true);
		Enter_Report_Name_Text.sendKeys(BatchIndexing_excelRead(1, 2));
		Thread.sleep(6000);
		Reporter.log("Enter value into Report Name field ", true);
		movingclkElement(Create_Button);
		Thread.sleep(8000);
		Reporter.log("Click on create button", true);
		Thread.sleep(6000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			System.out.println("Alert is not Present");
		}
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on destination folder Textbox", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("Select a folder for create new documents", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Select_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select a document type dropdown", true);
		Enter_Report_Name_Text.sendKeys(BatchIndexing_excelRead(1, 2));
		Thread.sleep(6000);
		Reporter.log("Enter value into Report Name field ", true);
		movingclkElement(Create_Button);
		Thread.sleep(8000);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 30);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt1 = driver.switchTo().alert();
			alt1.accept();
		} catch (Exception e) {
			System.out.println("Alert is not Present");
		}
		Reporter.log("Click on create button", true);
		jsclick(Navigate_Button);
		Thread.sleep(6000);
		Reporter.log("Click on navigate button", true);
		Reporter.log("Verifying create As four Multiple document successfully", true);
>>>>>>> origin/Dipak-Pandurang-Gawali
	}

	public void Delete_Indexing_Document() throws Exception {

<<<<<<< HEAD
		Reporter.log("Test Scenario 3: Verifying delete Indexing document ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
=======
		Reporter.log("Test Scenario 4: Verifying delete Indexing document ", true);
		try {
			LogDipakUser();
			Thread.sleep(5000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		} catch (Exception e) {
			System.out.println("User is already logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(BatchIndexDialogCancel);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Batch Index dialog closed
		}
		Refresh_Button();
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(8000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on Refresh button", true);
		jsclick(BatchIndexing_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on Batch Indexing Icon", true);
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on Folder dropdown", true);
<<<<<<< HEAD
		movingclkElement(SelectFolder);
		Thread.sleep(6000);
		Reporter.log("Selct a folder", true);
=======
		jsclick(SelectFolder);
		Thread.sleep(6000);
		Reporter.log("Selct a folder", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(ChooseFile));
		movingclkElement(ChooseFile);
		Thread.sleep(6000);
		Reporter.log("Click on Choose file button and upload document page", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\BatchIndexingDoc.exe");
		Thread.sleep(6000);
		Reporter.log("By using AutoIT add file from external folder", true);
>>>>>>> origin/Dipak-Pandurang-Gawali
		jsclick(SelectDoc1);
		Thread.sleep(6000);
		Reporter.log("Check first page Thumbnail", true);
		movingclkElement(Add);
		Thread.sleep(6000);
		Reporter.log("Click on Add Icon", true);
		jsclick(DeleteDoc);
		Reporter.log("Click on delete document option", true);
		Reporter.log("Verifying selected Indexing document deleted successfully", true);
	}

	public void Delete_Indexing_Document_From_Setting() throws Exception {

<<<<<<< HEAD
		Reporter.log("Test Scenario 4 : Verifying Setting delete on Index on document ", true);
		try {
			LogDipakUser();
			Thread.sleep(6000);
=======
		Reporter.log("Test Scenario 5 : Verifying Setting delete on Index on document ", true);
		try {
			LogDipakUser();
			Thread.sleep(5000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		} catch (Exception e) {
			System.out.println("User is already logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(BatchIndexDialogCancel);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Batch Index dialog closed
		}
		Thread.sleep(6000);
		Refresh_Button();
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(8000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on Refresh button", true);
		jsclick(BatchIndexing_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on batch Indexing Icon", true);
<<<<<<< HEAD
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on folder dropdown", true);
		movingclkElement(SelectFolder);
		Thread.sleep(6000);
		Reporter.log("Select a folder", true);
=======
>>>>>>> origin/Dipak-Pandurang-Gawali
		movingclkElement(Add);
		Thread.sleep(6000);
		Reporter.log("Click on Add Icon", true);
		jsclick(settingoption);
		Thread.sleep(6000);
		Reporter.log("Click on setting option", true);
		Deletesource_Option();
		Thread.sleep(6000);
		Reporter.log("Check Delete Source Icon", true);
		allowDeleteOnIndex_Option();
		Thread.sleep(6000);
		Reporter.log("Check allow delete on Index", true);
		jsclick(repostSettingsModalOk);
		Reporter.log("Click on Ok button", true);
<<<<<<< HEAD
		jsclick(SingleDoc);
		Reporter.log("Click on Single document checkbox", true);
		WebDriverWait wait = new WebDriverWait(driver, 20);
=======
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on folder dropdown", true);
		jsclick(SelectFolder);
		Thread.sleep(6000);
		Reporter.log("Select a folder", true);
		Reporter.log("Click on Single document checkbox", true);
		WebDriverWait wait = new WebDriverWait(driver, 30);
>>>>>>> origin/Dipak-Pandurang-Gawali
		wait.until(ExpectedConditions.elementToBeClickable(ChooseFile));
		jsclick(ChooseFile);
		Thread.sleep(6000);
		Reporter.log("Click on choose file button", true);
		Runtime.getRuntime().exec("D:\\DipakAutoit\\BatchIndexingDoc.exe");
		Thread.sleep(6000);
		Reporter.log("By using AutoIT add file from external folder", true);
		jsclick(SelectDoc1);
		Thread.sleep(6000);
		Reporter.log("Check Uploaded document", true);
		jsclick(Indexbutton);
		Reporter.log("Click on Index button", true);
		try {
			WebDriverWait wait1 = new WebDriverWait(driver, 20);
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alt = driver.switchTo().alert();
			alt.accept();
		} catch (Exception e) {
			System.out.println("Alert is not present...");
		}
		Thread.sleep(6000);
		jsclick(Destination_Folder_Textbox);
		Thread.sleep(6000);
		Reporter.log("Click on destination folder textbox", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("Expand a folder", true);
		Reporter.log("Select folder for create new documents", true);
		jsclick(OK_Button_BrowseforFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Select_Document_Type_Dropdown());
		Thread.sleep(6000);
		Reporter.log("Select documment Type", true);
		Enter_Report_Name_Text.sendKeys(BatchIndexing_excelRead(1, 2));
		Thread.sleep(6000);
		Reporter.log("Enter value into Report Name field", true);
		movingclkElement(Create_Button);
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(8000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on create button", true);
		jsclick(View_Button);
		Thread.sleep(6000);
		Reporter.log("Click on View button", true);
		jsclick(BatchIndexing_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on Batch Indexing Icon", true);
		jsclick(CloseButton);
		Reporter.log("Click on Close button", true);
		Reporter.log("Verified Setting delete on Index on document", true);
	}

	public void Assign_Share_Permission_toUser() throws Exception {

<<<<<<< HEAD
		Reporter.log("Test Scenario 5 : Verifying Assign Share Permission toUser", true);

		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(BatchIndexing_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on batch Indexing Icon", true);
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on folder dropdown", true);
		movingclkElement(SelectFolder);
		Thread.sleep(6000);
		Reporter.log("Select a folder", true);
=======
		Reporter.log("Test Scenario 6 : Verifying Assign Share Permission toUser", true);
		try {
			LogDipakUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
			jsclick(BatchIndexDialogCancel);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Batch Index dialog closed
		}

		Refresh_Button();
		Thread.sleep(8000);
		Thread.sleep(6000);
		jsclick(BatchIndexing_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on batch Indexing Icon", true);
>>>>>>> origin/Dipak-Pandurang-Gawali
		movingclkElement(Add);
		Thread.sleep(6000);
		Reporter.log("Click on Add Icon", true);
		jsclick(sharePermission);
		Thread.sleep(6000);
		Reporter.log("Click on sharepPermission button", true);
		jsclick(Revoke);
		Thread.sleep(6000);
		Reporter.log("Click on Revoke button", true);
		try {
			Revokeuservalidation();
<<<<<<< HEAD
			Reporter.log("Verified selected folder is Not shared to any ", true);
=======
			Reporter.log("Verified selected folder is Not shared to any user ", true);
>>>>>>> origin/Dipak-Pandurang-Gawali
			Thread.sleep(6000);
		} catch (Exception e) {
			// message is not displayed
		}
		movingclkElement(Alluser);
		Thread.sleep(6000);
		Reporter.log("Click on select To assign permission textbox", true);
		movingclkElement(SelectrAssignUser);
<<<<<<< HEAD
		Thread.sleep(6000);
		Reporter.log("Check assign user from dropdown list", true);
		jsclick(assign);
=======
		Thread.sleep(7000);
		Reporter.log("Check assign user from dropdown list", true);
		movingclkElement(assign);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Thread.sleep(6000);
		Reporter.log("Click on assign button", true);
		jsclick(CloseButton);
		Reporter.log("Click on Close button", true);
		Reporter.log("Give assign share permission to user", true);
		try {
			jsclick(BatchIndexDialogCancel);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Batch Index dialog closed
		}
		LogoutPage();
		Reporter.log("Click on Logout option", true);
	}

	public void Check_Assign_Share_Permission() throws Exception {

<<<<<<< HEAD
		Reporter.log("Test Scenario 6 : Verifying assign share permission to Respective user", true);
=======
		Reporter.log("Test Scenario 7 : Verifying assign share permission to Respective user", true);
>>>>>>> origin/Dipak-Pandurang-Gawali

		LoginAdminUser();
		Thread.sleep(6000);
		Refresh_Button();
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(8000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Login with assign user ", true);
		jsclick(BatchIndexing_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on batch Indexing Icon", true);
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on folder dropdown", true);
<<<<<<< HEAD
		movingclkElement(SelectFolder);
		Thread.sleep(6000);
		Reporter.log("Select a folder", true);
=======
		jsclick(SelectAssignFolder);
		Thread.sleep(6000);
		Reporter.log("Select a assign folder", true);
>>>>>>> origin/Dipak-Pandurang-Gawali
		jsclick(CloseButton);
		Thread.sleep(6000);
		Reporter.log("Click on close button", true);
		Reporter.log("Verified assign share permission on Index on Document", true);
		try {
			jsclick(BatchIndexDialogCancel);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Batch Index dialog closed
		}
		LogoutPage();
		Reporter.log("Click on Logout option", true);
	}

	public void Revoke_Share_Permission() throws Exception {

		Reporter.log("Test Scenario 8 : Verifying Revoke share permission of user ", true);

		LogDipakUser();
		Thread.sleep(6000);
		Refresh_Button();
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(8000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Login with user", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(BatchIndexing_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on batchIndexing Icon", true);
<<<<<<< HEAD
		movingclkElement(clickFolderDropdown);
		Thread.sleep(6000);
		Reporter.log("Click on folder dropdown", true);
		movingclkElement(SelectFolder);
		Thread.sleep(6000);
		Reporter.log("Select a folder", true);
=======
>>>>>>> origin/Dipak-Pandurang-Gawali
		movingclkElement(Add);
		Thread.sleep(6000);
		Reporter.log("Click on add Icon", true);
		movingclkElement(sharePermission);
		Thread.sleep(6000);
		Reporter.log("Click on share permission", true);
		jsclick(Revoke);
		Thread.sleep(6000);
		Reporter.log("Click on Revoke button", true);
		jsclick(CloseButton);
		Thread.sleep(6000);
		Reporter.log("Click on close button", true);
<<<<<<< HEAD
		Refresh_Button();
		Reporter.log("Click on Refresh button", true);
=======
		try {
			Revokeuservalidation();
			Reporter.log("Verified selected folder is Not shared to any user ", true);
			Thread.sleep(6000);
		} catch (Exception e) {
			// message is not displayed
		}
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Verified Revoke share permission on Index on document", true);
		try {
			jsclick(BatchIndexDialogCancel);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Batch Index dialog closed
		}
<<<<<<< HEAD

=======
		Refresh_Button();
		Reporter.log("Click on Refresh button", true);
		Thread.sleep(8000);
>>>>>>> origin/Dipak-Pandurang-Gawali
	}

	public void Empty_Name_Folder() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying Empty name Indexing folder", true);
<<<<<<< HEAD
		try {
			LogDipakUser();
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is already logged");
		}
=======

>>>>>>> origin/Dipak-Pandurang-Gawali
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		try {
<<<<<<< HEAD
			jsclick(BatchIndexDialogCancel);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Batch Index dialog closed
		}
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
=======
			LogDipakUser();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("User is already logged");
		}

		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(8000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on Refresh button", true);
		jsclick(BatchIndexing_MenuOption);
		Thread.sleep(6000);
		Reporter.log("Click on Batch Indexing Icon", true);
		jsclick(Add);
		Thread.sleep(6000);
		Reporter.log("Click on Add Icon on Batch Indexing dialog", true);
		jsclick(AddFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Add Folder Option", true);
		jsclick(OkbuttonFolder);
		Thread.sleep(6000);
		Reporter.log("Click on Folder dialog Ok button", true);
		Foldernamevalidation();
		Thread.sleep(6000);
		Reporter.log("Verified Folder Name Validation", true);
		jsclick(Cancelbutton);
		Reporter.log("Empty name Indexing folder not Created verified");
	}

	public void Without_BatchIndex_permissions() throws Exception {

		Reporter.log("Test Scenario 2 :Verifying Without adding  Share and Revoke Permission ", true);
<<<<<<< HEAD
		try {
			jsclick(BatchIndexDialogCancel);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Batch Index dialog closed
		}
		Thread.sleep(6000);
		jsclick(clickFolderDropdown);
=======

		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		Thread.sleep(6000);
		movingclkElement(clickFolderDropdown);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Thread.sleep(6000);
		Reporter.log("Click on Folder Dropdown", true);
		jsclick(SelectFolder);
		Thread.sleep(6000);
		Reporter.log("Select a Folder", true);
		jsclick(Add);
		Thread.sleep(6000);
		Reporter.log("Click on  Add button Batch Indexing dialog", true);
		jsclick(sharePermission);
		Thread.sleep(6000);
		Reporter.log("Click on Share Permission button", true);
<<<<<<< HEAD
		Actions actor = new Actions(driver);
		actor.moveToElement(Alluser).click(Alluser).build().perform();
=======

		Actions actor = new Actions(driver);
		actor.moveToElement(Alluser).click(Alluser).build().perform();

>>>>>>> origin/Dipak-Pandurang-Gawali
		Thread.sleep(6000);
		Reporter.log("Click and Select All Users ", true);
		jsclick(Selectcheckbox);
		jsclick(Selectcheckbox);
		Thread.sleep(6000);
		Reporter.log("Unselect all Users again", true);
		assign.click();
		Thread.sleep(6000);
		Reporter.log("Click on  Assign button", true);
		Uservalidation();
		Thread.sleep(6000);
		Reporter.log("Verified Validation Message", true);
<<<<<<< HEAD
		jsclick(CloseButton);
		Thread.sleep(6000);
		Reporter.log("Click on  Batch Indexing dialog Close button", true);
		Reporter.log("Without adding  showing validation verified");
		Refresh_Button();
		Reporter.log("Click on Refresh button", true);
=======
		jsclick(BatchIndexDialogCancel);
		Thread.sleep(6000);
		Reporter.log("Click on  Batch Indexing dialog Close button", true);
		Reporter.log("Without adding  showing validation verified");
		try {
			Revokeuservalidation();
			Reporter.log("Verified selected folder is Not shared to any user ", true);
			Thread.sleep(6000);
		} catch (Exception e) {
			// message is not displayed
		}
		Reporter.log("Verified Revoke share permission on Index on document", true);
		try {
			jsclick(BatchIndexDialogCancel);
			Thread.sleep(2000);
		} catch (Exception e) {
			// Batch Index dialog closed
		}
		Refresh_Button();
		Reporter.log("Click on Refresh button", true);
		Thread.sleep(8000);
>>>>>>> origin/Dipak-Pandurang-Gawali
	}
}
