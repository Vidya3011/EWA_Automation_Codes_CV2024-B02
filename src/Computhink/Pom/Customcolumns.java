package Computhink.Pom;

//Dipak Automation Coading

<<<<<<< HEAD
=======
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
>>>>>>> origin/Dipak-Pandurang-Gawali
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
<<<<<<< HEAD
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
=======
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
>>>>>>> origin/Dipak-Pandurang-Gawali
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Customcolumns extends Computhink.Generic.BaseClass {

	private static WebElement element = null;

	public Customcolumns() {
		PageFactory.initElements(driver, this);
	}

	// Select From Document Navigator

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/a[1]")
	private WebElement Select_Cabinet;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Folder;

	// Select from Search Document Location

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[1]/a"))
	private WebElement Search_Cabinet;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[1]/ul/li[1]/a"))
	private WebElement Search_Drawer;

	@FindBy(xpath = ("//*[@id='searchDocumentNavigator1']/ul/li[1]/ul/li/ul/li[1]/a"))
	private WebElement Search_Folder;

	@FindBy(xpath = "//*[@id=\"todoAll\"]")
	private WebElement Select_All_Item;

	@FindBy(xpath = "//*[@id=\"todoResetColumns\"]")
	private WebElement To_Do_Resetcolumn_Option;

	@FindBy(xpath = "//*[@id=\"resetColumsOk\"]")
	private WebElement Reset_Column_OK_Button;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Document Size\"]")
	private WebElement Select_Indices01;

	@FindBy(xpath = "//*[@id=\"setCustomListdropdown\"]")
	private WebElement Click_DropdownOption;

	@FindBy(xpath = "//*[@id=\"messageButtonNo27\"]")
	private WebElement Nobutton;

	@FindBy(xpath = "//*[@id=\"Resetcolumns\"]")
	private WebElement Room_Reset_CustomColumns;

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

<<<<<<< HEAD
	@FindBy(xpath = "//*[@id='CustomListTodoCancel']")
	private static WebElement Cancel_Button_TodoCustomList;

=======
>>>>>>> origin/Dipak-Pandurang-Gawali
	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	@FindBy(xpath = "//*[@id=\"culstomcolsearch\"]")
	private WebElement Search_Custom_Columns_option;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Document Size\"]")
	private WebElement Search_Select_Indices01;

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement Click_Search_Option;

	@FindBy(xpath = "//*[@id=\"advFindBtnLabel\"]")
	private WebElement Find_Button;

	@FindBy(xpath = "//*[@id=\"Defaultcolsearch\"]")
	private WebElement Search_ResetColumn;

	@FindBy(xpath = "//*[@id=\"todoCustomColumns\"]")
	private WebElement ToDoList_Custom_Columns_option;

	@FindBy(xpath = "//*[@id=\"navigationMenuBtn\"]")
	private WebElement MoveTo_Menu_RoomName;

	@FindBy(xpath = "//*[@id=\"CustomUserTitle\"]/h2")
	private WebElement titelvalidation;

	@FindBy(xpath = "//*[@id=\"setCustomListlabel\"]")
	private WebElement textlvalidation;

	@FindBy(xpath = "//*[@id=\"tittleofcustom\"]/h2")
	private WebElement textlvalidation2;

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement ele;

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement Default_Button_CustomList;

	@FindBy(xpath = "//button[@id='CustomListOK']")
	private static WebElement Ok_Button_CustomList;

	// Search *

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement MoveTo_Search_Option;

	@FindBy(xpath = "//*[@id=\"CustomUserTitle\"]/h2")
	private WebElement Search_titelvalidation;

	@FindBy(xpath = "//*[@id=\"tittleofcustom\"]/h2")
	private WebElement Search_textvalidation;

	// ToDoList *

	@FindBy(xpath = "//*[@id=\"myTaskMenu\"]")
	private WebElement MoveTo_ToDoList_Option;

	@FindBy(xpath = "//*[@id=\"CustomUserTitleToDoList\"]/h2")
	private static WebElement titlevalidation;

	@FindBy(xpath = "//*[@id=\"CustomListCancel\"]")
	private static WebElement Cancel_Button_CustomList;

<<<<<<< HEAD
=======
	@FindBy(xpath = "//*[@id='CustomListTodoCancel']")
	private static WebElement Cancel_Button_TodoCustomList;

>>>>>>> origin/Dipak-Pandurang-Gawali
	@FindBy(xpath = "//*[@id=\"CustomListOK\"]")
	private static WebElement Search_Ok_Button_CustomList;

	@FindBy(xpath = "//*[@id=\"tittleoftodoListcustom\"]/h2")
	private static WebElement textvalidation;

	@FindBy(xpath = "//*[@id=\"CustomListTodoOK\"]")
	private static WebElement ToDoList_Ok_Button_CustomList;

	@FindBy(xpath = "//*[@id=\"folderLocationForSearch\"]")
	private static WebElement Document_Location;

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk1\"]")
	private static WebElement Ok_button;

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;

	@FindBy(xpath = "//*[@id=\"pasteid\"]")
	private WebElement Paste_ID;

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBox;

	@FindBy(xpath = "//*[@id=\"customListModelClose\"]")
	private WebElement Crosscancel;

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBoxTODO;

	@FindBy(xpath = "//*[@id=\"CustomListCancel\"]")
	private WebElement cancelbutton;

	@FindBy(xpath = "//*[@id=\"CustomListTodoCancel\"]")
	private WebElement cancelTODObutton;

	@FindBy(xpath = "//*[@id=\"customTodoListModelClose\"]")
	private WebElement CrosscancelTODObutton;

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	@FindBy(xpath = "//th[contains(text(),'DOCUMENT SIZE')]")
	private static WebElement DocumentSize;

	@FindBy(xpath = "//th[contains(text(),'WORKFLOW STATUS')]")
	private static WebElement WorkflowStatus;

	@FindBy(xpath = "//div[@id='showcustomTodoListModel']//input[@id='searchInput']")
	private WebElement TODOSearchBox;

	@FindBy(xpath = ("//*[@id='spanCheckCustomValuesTodolist_Workflow Status']"))
	private WebElement Select_ToDoIndices;

	@FindBy(xpath = "//*[@id=\"newItems\"]")
	private WebElement ToDoNew_Item;

	@FindBy(xpath = "//*[@id=\"todoPending\"]")
	private WebElement ToDo_Pending;

	@FindBy(xpath = "//*[@id=\"todoReviewed\"]")
	private WebElement ToDoReviewed;

	@FindBy(xpath = "//*[@id=\"todoSentItems\"]")
	private WebElement ToDoSentItem;

	@FindBy(xpath = "//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]")
	private WebElement Open_ToDoDocument;

	@FindBy(xpath = "//*[@id=\"wfcomments\"]")
	private WebElement WfComment;

	@FindBy(xpath = "//*[@id=\"endwf\"]")
	private WebElement EndWorkflow;

	@FindBy(xpath = "//*[@id=\"wfactionOk\"]")
	private WebElement okbutton;

	@FindBy(xpath = "//*[@id=\"CustomList\"]")
	private WebElement CustomColumnOptionRoom;

<<<<<<< HEAD
	public void Verify_Reset_CustomColumsnRoom() {
		if (Room_Reset_CustomColumns.isEnabled() == true) {
			jsclick(Room_Reset_CustomColumns);
		}
	}
=======
	SoftAssert softAssert = new SoftAssert();
>>>>>>> origin/Dipak-Pandurang-Gawali

	public void Verify_Reset_CustomColumsnSearch() {

		if (Search_ResetColumn.isEnabled() == true) {
			jsclick(Search_ResetColumn);
		}
	}

	public void Verify_Reset_CustomColumsnTodolist() {

		if (To_Do_Resetcolumn_Option.isEnabled() == true) {
			jsclick(To_Do_Resetcolumn_Option);
		}
	}

	public void titelvalidation() {

		String expectedtext = "Custom List";
		String actualtext = titelvalidation.getText();
<<<<<<< HEAD
		Assert.assertEquals(actualtext, expectedtext);
=======
		softAssert.assertEquals(actualtext, expectedtext);
>>>>>>> origin/Dipak-Pandurang-Gawali

	}

	public void textvalidation() {

		String expectedtext = "Set custom columns :";
		String actualtext = textlvalidation.getText();
<<<<<<< HEAD
		Assert.assertEquals(actualtext, expectedtext);
		String expectedtext2 = "Select the indices you want display for documents";
		String actualtext2 = textlvalidation2.getText();
		Assert.assertEquals(actualtext2, expectedtext2);
=======
		softAssert.assertEquals(actualtext, expectedtext);
		String expectedtext2 = "Select the indices you want display for documents";
		String actualtext2 = textlvalidation2.getText();
		softAssert.assertEquals(actualtext2, expectedtext2);
>>>>>>> origin/Dipak-Pandurang-Gawali

	}

	public static void Default_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", Default_Button_CustomList);

	}

	public static void Cancel_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", Cancel_Button_CustomList);

	}

	public WebElement Select_DropdownValue() {

		Select drop = new Select(Click_DropdownOption);
		drop.selectByVisibleText("Room level");
		return element;
	}

	public void Verify_CompactView_checkbox() {
		if (driver.findElement(By.xpath("//*[@id=\"displayCompactViewOfList\"]")).isSelected() == true) {
			jsclick(driver.findElement(By.xpath("//*[@id=\"displayCompactViewOfList\"]")));
		}

	}

	public void Search_titelvalidation() {

		String expectedtext = "Custom List";
		String actualtext = Search_titelvalidation.getText();
<<<<<<< HEAD
		Assert.assertEquals(actualtext, expectedtext);
=======
		softAssert.assertEquals(actualtext, expectedtext);
>>>>>>> origin/Dipak-Pandurang-Gawali

	}

	public void Search_textvalidation() {

		String expectedtext = "Select the indices you want display for documents";
		String actualtext = Search_textvalidation.getText();
<<<<<<< HEAD
		Assert.assertEquals(actualtext, expectedtext);
=======
		softAssert.assertEquals(actualtext, expectedtext);
>>>>>>> origin/Dipak-Pandurang-Gawali

	}

	public static void Search_Ok_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click", Search_Ok_Button_CustomList);

	}

	public void ToDoList_titelvalidation() {

		String expectedtext = "Custom List";
		String actualtext = titlevalidation.getText();
<<<<<<< HEAD
		Assert.assertEquals(actualtext, expectedtext);
=======
		softAssert.assertEquals(actualtext, expectedtext);
>>>>>>> origin/Dipak-Pandurang-Gawali

	}

	public void ToDoList_textvalidation() {

		String expectedtext = "Select the indices to display for To Do List documents";
		String actualtext = textvalidation.getText();
<<<<<<< HEAD
		Assert.assertEquals(actualtext, expectedtext);
=======
		softAssert.assertEquals(actualtext, expectedtext);
>>>>>>> origin/Dipak-Pandurang-Gawali

	}

	public void MoveTo_Menu_Documents() {
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}

	public void Verify_CopyandPaste_Document() throws InterruptedException {

		jsclick(Copy_ID);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		jsclick(Paste_ID);

	}

	public WebElement SearchBoxIndices1() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(1, 0));
		return SearchBox;
	}

	public WebElement Crosscancel() throws Exception {
		return Crosscancel;
	}

	public void SearchBoxIndices4() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(1, 0));

	}

	public void Verify_Indicess_Value() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "DOCUMENT SIZE";
		String actualtext2 = DocumentSize.getText();
<<<<<<< HEAD
		Assert.assertEquals(actualtext2, expectedtext2);
=======
		softAssert.assertEquals(actualtext2, expectedtext2);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Indices value displayed successfully " + DocumentSize.getText(), true);
	}

	public void VerifyTodo_Indicess_Value() throws InterruptedException {

		Thread.sleep(4000);
		String expectedtext2 = "WORKFLOW STATUS";
		String actualtext2 = WorkflowStatus.getText();
<<<<<<< HEAD
		Assert.assertEquals(actualtext2, expectedtext2);
=======
		softAssert.assertEquals(actualtext2, expectedtext2);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Indices value displayed successfully " + WorkflowStatus.getText(), true);
	}

	public void ToDoEndWorkflow() throws Exception {

<<<<<<< HEAD
		Thread.sleep(6000);
		jsclick(EndWorkflow);
		Thread.sleep(4000);
		jsclick(WfComment);
		Thread.sleep(6000);
		WfComment.sendKeys(CustomColumns_excelRead(3, 0));
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		jsclick(EndWorkflow);
		Thread.sleep(4000);
		jsclick(WfComment);
		Thread.sleep(9000);
		WfComment.sendKeys(CustomColumns_excelRead(3, 0));
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		jsclick(okbutton);

	}

	public void Verify_Custom_List_Dialog() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying open custom List dialog title ", true);

		try {
			LogDipakUser();
<<<<<<< HEAD
			Thread.sleep(6000);
=======
			Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Nobutton.isDisplayed() == true) {
			movingclkElement(Nobutton);
		} else {
			// Saving dialog not present
		}
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
<<<<<<< HEAD
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("Expand a Folder", true);
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(6000);
		Reporter.log("Moousehover on Roomname Tab", true);

		if (Room_Reset_CustomColumns.isEnabled() == true) {
			Thread.sleep(3000);
			jsclick(Room_Reset_CustomColumns);
			Reporter.log("Click on Reset Column Option", true);
			jsclick(Reset_Column_OK_Button);
			Reporter.log("Click on Ok button", true);
			Thread.sleep(9000);
			Reporter.log("Custom columns Reset Successfully on Room Level", true);
		} else {
			System.out.println("Reset Column Option is Disable");
		}
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(12000);
		Reporter.log("Click on Custom column Option", true);
		titelvalidation();
		Reporter.log("Custom List title validate", true);
=======

		Refresh_Button();
		Thread.sleep(9000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(9000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(9000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(9000);
		Reporter.log("Expand a Folder", true);
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(9000);
		Reporter.log("Moousehover on Roomname Tab", true);
		try {
			if (Room_Reset_CustomColumns.isEnabled() == true) {
				Thread.sleep(3000);
				jsclick(Room_Reset_CustomColumns);
				Reporter.log("Click on Reset Column Option", true);
				jsclick(Reset_Column_OK_Button);
				Reporter.log("Click on Ok button", true);
				Thread.sleep(9000);
				Reporter.log("Custom columns Reset Successfully on Room Level", true);
			}
		} catch (Exception e) {
			System.out.println("Reset Column Option is Disable");

		}

>>>>>>> origin/Dipak-Pandurang-Gawali
	}

	public void Verify_Custom_List_Dialog_Text() throws Exception {

		Reporter.log("Test Scenario 2 : Verifying  text of custom List dialog", true);
<<<<<<< HEAD
		Thread.sleep(6000);
=======

		Refresh_Button();
		Thread.sleep(9000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(9000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(9000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(9000);
		Reporter.log("Expand a Folder", true);
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(2000);
		Reporter.log("Moousehover on Roomname Tab", true);
		movingclkElement(CustomColumnOptionRoom);
		Reporter.log("Click on Custom column Option", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"showcustomlistModel\"]")));
		titelvalidation();
		Reporter.log("Custom List title validate", true);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		textvalidation();
		Reporter.log("Custom List dialog text verified", true);
	}

	public void Set_Custom_Column_Node_Level() throws Exception {

		Reporter.log("Test Scenario 3 : Set and verifying Custom Columns Node Level ", true);
<<<<<<< HEAD
		Thread.sleep(6000);
		SearchBoxIndices1();
		Thread.sleep(6000);
		Reporter.log("Enter Indices Name in search textbox field", true);
		jsclick(Select_Indices01);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		SearchBoxIndices1();
		Thread.sleep(9000);
		Reporter.log("Enter Indices Name in search textbox field", true);
		jsclick(Select_Indices01);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Select entered Indices", true);
		jsclick(Ok_Button_CustomList);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Indices selected successfully", true);
		Thread.sleep(12000);
		jsclick(Setting_Icon);
<<<<<<< HEAD
		Thread.sleep(6000);
		Reporter.log("Click on setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(6000);
		Reporter.log("Click on My Preferences Option", true);
		Verify_CompactView_checkbox();
		Thread.sleep(6000);
		Reporter.log("Uncheck Compact View checkbox", true);
		movingclkElement(Apply_button);
		Thread.sleep(6000);
		Reporter.log("Click on Apply button", true);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		Reporter.log("Click on setting Icon", true);
		jsclick(My_Preferencesetting);
		Thread.sleep(9000);
		Reporter.log("Click on My Preferences Option", true);
		Verify_CompactView_checkbox();
		Thread.sleep(9000);
		Reporter.log("Uncheck Compact View checkbox", true);
		movingclkElement(Apply_button);
		Thread.sleep(9000);
		Reporter.log("Click on Apply button", true);
		Refresh_Button();
		Thread.sleep(9000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(9000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(7000);
		Reporter.log("Expand a Folder", true);
		Verify_Indicess_Value();
		Reporter.log("Verifying Indices and Custom Columns is set Node Level successfully", true);

	}

	public void Default_Custom_Columns() throws Exception {

		Reporter.log("Test Scenario 4 : Verifying Default Custom Columns ", true);
		try {
			LogDipakUser();
<<<<<<< HEAD
			Thread.sleep(6000);
=======
			Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		Refresh_Button();
<<<<<<< HEAD
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("Expand a Folder", true);
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(6000);
		Reporter.log("Mousehover on Roomname Tab", true);
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(12000);
		Reporter.log("Click on Custom Column Option", true);
		Default_Button_CustomList();
		Thread.sleep(6000);
		Reporter.log("Click on Default button", true);
		jsclick(Ok_Button_CustomList);
		Reporter.log("Click on Ok button", true);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(9000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(9000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(9000);
		Reporter.log("Expand a Folder", true);
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(9000);
		Reporter.log("Mousehover on Roomname Tab", true);
		movingclkElement(CustomColumnOptionRoom);
		Reporter.log("Click on Custom Column Option", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"showcustomlistModel\"]")));
		Default_Button_CustomList();
		Thread.sleep(9000);
		Reporter.log("Click on Default button", true);
		jsclick(Ok_Button_CustomList);
		Reporter.log("Click on Ok button", true);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Set and Verifying Default Custom columns successfully", true);
	}

	public void Cancel_Button_Custom_List() throws Exception {

		Reporter.log("Test Scenario 5 : Verifying Cancel button of Custom List ", true);

<<<<<<< HEAD
		movingElement(MoveTo_Menu_RoomName);
		Reporter.log("Mousehover on Roomname Tab", true);
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(12000);
		Reporter.log("Click on Custom Column Option", true);
=======
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		movingElement(MoveTo_Menu_RoomName);
		Reporter.log("Mousehover on Roomname Tab", true);
		Thread.sleep(9000);
		movingclkElement(CustomColumnOptionRoom);
		Reporter.log("Click on Custom Column Option", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"showcustomlistModel\"]")));
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Cancel_Button_CustomList();
		Reporter.log("Click on Cancel button", true);
	}

	public void Custom_Columns_RoomLevel() throws Exception {

		Reporter.log("Test Scenario 6 : Verifying Custom Columns Room Level ", true);
<<<<<<< HEAD
=======

>>>>>>> origin/Dipak-Pandurang-Gawali
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
<<<<<<< HEAD
		Thread.sleep(6000);
		movingElement(MoveTo_Menu_RoomName);
		Reporter.log("Mousehover on Roomname Tab", true);
		Thread.sleep(6000);
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(12000);
		Reporter.log("Click on Custom Column Option", true);
		jsclick(Click_DropdownOption);
		Reporter.log("Click on Dropdown", true);
		Select_DropdownValue();
		Thread.sleep(6000);
		Reporter.log("Select Dropdown value", true);
		jsclick(Ok_Button_CustomList);
		Reporter.log("Click on Ok button", true);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		movingElement(MoveTo_Menu_RoomName);
		Reporter.log("Mousehover on Roomname Tab", true);
		Thread.sleep(9000);
		movingclkElement(CustomColumnOptionRoom);
		Reporter.log("Click on Custom Column Option", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 50);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"showcustomlistModel\"]")));
		Thread.sleep(9000);
		jsclick(Click_DropdownOption);
		Reporter.log("Click on Dropdown", true);
		Select_DropdownValue();
		Thread.sleep(9000);
		Reporter.log("Select Dropdown value", true);
		jsclick(Ok_Button_CustomList);
		Reporter.log("Click on Ok button", true);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Indices is Selected Successfully for RoomLevel", true);

	}

	public void Reset_Columns_RoomLevel() throws Exception {

		Reporter.log("Test Scenario 7 : Verifying Reset Columns Functionality ", true);
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		movingElement(MoveTo_Menu_RoomName);
		Reporter.log("Mousehover on Roomname Tab", true);
<<<<<<< HEAD
		Thread.sleep(6000);
		jsclick(Room_Reset_CustomColumns);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		jsclick(Room_Reset_CustomColumns);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on Reset Column Option", true);
		jsclick(Reset_Column_OK_Button);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Custom columns Reset Successfully on Room Level", true);
	}

	public void Title_Custom_Columns_Search() throws Exception {

		Reporter.log("Test Scenario 8 : Open Custom List Dialog And Verifying Title Search column ", true);
		try {
			LogDipakUser();
<<<<<<< HEAD
			Thread.sleep(6000);
=======
			Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		movingElement(MoveTo_Search_Option);
<<<<<<< HEAD
		Thread.sleep(6000);
		Reporter.log("Mousehover on Search Tab", true);
		try {
			Verify_Reset_CustomColumsnSearch();
			Thread.sleep(6000);
			Reporter.log("Click on Reset Column Option", true);
			jsclick(Reset_Column_OK_Button);
			Thread.sleep(6000);
			Reporter.log("Click on Ok button", true);
			Thread.sleep(6000);
			Reporter.log("Custom columns Reset Successfully on Search Level", true);
			movingElement(MoveTo_Search_Option);
			Thread.sleep(6000);
=======
		Thread.sleep(9000);
		Reporter.log("Mousehover on Search Tab", true);
		try {
			Verify_Reset_CustomColumsnSearch();
			Thread.sleep(9000);
			Reporter.log("Click on Reset Column Option", true);
			jsclick(Reset_Column_OK_Button);
			Thread.sleep(9000);
			Reporter.log("Click on Ok button", true);
			Thread.sleep(9000);
			Reporter.log("Custom columns Reset Successfully on Search Level", true);
			movingElement(MoveTo_Search_Option);
			Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(Search_Custom_Columns_option);
		Thread.sleep(12000);
		Reporter.log("Click on Custom Column Option", true);
		Search_titelvalidation();
		Reporter.log("Search Custom List title validate", true);
	}

	public void Text_Custom_Columns_Search() throws Exception {

		Reporter.log("Test Scenario 9 : Verifying  Text of Custom List Dialog Search column ", true);
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Search_textvalidation();
		Reporter.log("Search Custom List Dialog Text verified", true);

	}

	public void Set_Custom_Columns_Search() throws Exception {

		Reporter.log("Test Scenario 10 : Verifying Set Custom Columns for Search ", true);
<<<<<<< HEAD
		Thread.sleep(6000);
		SearchBoxIndices4();
		Thread.sleep(6000);
		Reporter.log("Enter Indices value in Search textbox field", true);
		jsclick(Search_Select_Indices01);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		SearchBoxIndices4();
		Thread.sleep(9000);
		Reporter.log("Enter Indices value in Search textbox field", true);
		jsclick(Search_Select_Indices01);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Select Entered Indices", true);
		jsclick(Search_Ok_Button_CustomList);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Indices Selected Successfully", true);
<<<<<<< HEAD
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(6000);
		Reporter.log("Click on Search Tab", true);
		jsclick(Document_Location);
		Thread.sleep(6000);
		Reporter.log("Click on Document Location textbox", true);
		selectElement(Search_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Search_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Search_Folder);
		Thread.sleep(6000);
		Reporter.log("Expand a Folder", true);
		jsclick(Ok_button);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		Refresh_Button();
		Thread.sleep(9000);
		Reporter.log("Click on Refresh button", true);
		jsclick(Click_Search_Option);
		Thread.sleep(9000);
		Reporter.log("Click on Search Tab", true);
		jsclick(Document_Location);
		Thread.sleep(9000);
		Reporter.log("Click on Document Location textbox", true);
		selectElement(Search_Cabinet);
		Thread.sleep(9000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Search_Drawer);
		Thread.sleep(9000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Search_Folder);
		Thread.sleep(9000);
		Reporter.log("Expand a Folder", true);
		jsclick(Ok_button);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on Ok button", true);
		jsclick(Find_Button);
		Thread.sleep(50000);
		Reporter.log("Click on Find button", true);
		Verify_Indicess_Value();
		Thread.sleep(4000);
		Reporter.log("Verifying and Select Indices Custom Column", true);
		Reporter.log("Custom column is set successfully for Search Functionality", true);
	}

	public void Reset_Custom_Columns_Search() throws Exception {

		Reporter.log("Test Scenario 11 : Verifying Reset Columns for Search ", true);
		try {
			LogDipakUser();
<<<<<<< HEAD
			Thread.sleep(6000);
=======
			Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		movingElement(MoveTo_Search_Option);
<<<<<<< HEAD
		Thread.sleep(6000);
		Reporter.log("Mousehover on Search Tab", true);
		jsclick(Search_ResetColumn);
		Thread.sleep(6000);
		Reporter.log("Click on Reset Column Option ", true);
		jsclick(Reset_Column_OK_Button);
		Thread.sleep(6000);
		Reporter.log("Click on Ok button", true);
		jsclick(Find_Button);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		Reporter.log("Mousehover on Search Tab", true);
		jsclick(Search_ResetColumn);
		Thread.sleep(9000);
		Reporter.log("Click on Reset Column Option ", true);
		jsclick(Reset_Column_OK_Button);
		Thread.sleep(9000);
		Reporter.log("Click on Ok button", true);
		jsclick(Find_Button);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on Find button", true);
		Reporter.log("Reset Custom Columns Successfully for Search", true);
	}

	public void Title_Custom_Columns_TodoList() throws Exception {

		Reporter.log("Test Scenario 12 : Open Custom List Dialog And Verifying Title ToDoLis ", true);
<<<<<<< HEAD
=======
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
>>>>>>> origin/Dipak-Pandurang-Gawali
		if (Cancel_Button_TodoCustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_TodoCustomList);
		} else {
			// Custom List Dialog not present
		}
		Refresh_Button();
<<<<<<< HEAD
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(6000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		try {
			Verify_Reset_CustomColumsnTodolist();
			Thread.sleep(6000);
			Reporter.log("Click on Reset Column Option", true);
			jsclick(Reset_Column_OK_Button);
			Reporter.log("Click on Ok button", true);
			Thread.sleep(6000);
			Reporter.log("Custom columns Reset Successfully on TodoList Level", true);
			movingElement(MoveTo_ToDoList_Option);
			Thread.sleep(6000);
=======
		Thread.sleep(9000);
		Reporter.log("Click on Refresh button", true);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		try {
			Verify_Reset_CustomColumsnTodolist();
			Thread.sleep(9000);
			Reporter.log("Click on Reset Column Option", true);
			jsclick(Reset_Column_OK_Button);
			Reporter.log("Click on Ok button", true);
			Thread.sleep(9000);
			Reporter.log("Custom columns Reset Successfully on TodoList Level", true);
			movingElement(MoveTo_ToDoList_Option);
			Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		} catch (Exception e) {
			System.out.println(" Reset Column Option is Disable");
		}
		jsclick(ToDoList_Custom_Columns_option);
		Thread.sleep(12000);
		Reporter.log("Click on Custom Column Option", true);
		ToDoList_titelvalidation();
		Reporter.log("ToDoList Custom List title validate", true);
	}

	public void Text_Custom_Columns_TodoList() throws Exception {

		Reporter.log("Test Scenario 13: Verifying  Text of Custom List Dialog ToDoList ", true);
<<<<<<< HEAD
		Thread.sleep(6000);
		ToDoList_textvalidation();
		Reporter.log("Custom List Dialog Text verified", true);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		ToDoList_textvalidation();
		Reporter.log("Custom List Dialog Text verified", true);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali

	}

	public void Set_Custom_Columns_TodoList() throws Exception {

		Reporter.log("Test Scenario 14 : Verifying Set Custom Columns for ToDoList ", true);

<<<<<<< HEAD
		Thread.sleep(6000);
		TODOSearchBox.click();
		TODOSearchBox.sendKeys(CustomColumns_excelRead(2, 0));
		Reporter.log("Search Indices value", true);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		TODOSearchBox.click();
		TODOSearchBox.sendKeys(CustomColumns_excelRead(2, 0));
		Reporter.log("Search Indices value", true);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		jsclick(Select_ToDoIndices);
		Reporter.log("Select Indices value", true);
		jsclick(ToDoList_Ok_Button_CustomList);
		Reporter.log("Click on Ok button", true);
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(12000);
		Refresh_Button();
<<<<<<< HEAD
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		Reporter.log("Click on Refresh button", true);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(ToDoNew_Item);
		Thread.sleep(9000);
		Reporter.log("Click on New Items and Verified Indices Value", true);
		VerifyTodo_Indicess_Value();
		Reporter.log("Indices Value display in New Item", true);
		movingElement(MoveTo_ToDoList_Option);
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(ToDo_Pending);
		Thread.sleep(9000);
		Reporter.log("Click on Pending Items and Verified Indices Value", true);
		VerifyTodo_Indicess_Value();
		Reporter.log("Indices Value display in Pending Item", true);
		movingElement(MoveTo_ToDoList_Option);
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(ToDoReviewed);
		Thread.sleep(9000);
		Reporter.log("Click on Reviewed Items and Verified Indices Value", true);
		VerifyTodo_Indicess_Value();
		Reporter.log("Indices Value display in Reviewed Item", true);
		movingElement(MoveTo_ToDoList_Option);
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(ToDoSentItem);
		Thread.sleep(9000);
		Reporter.log("Click on Sent Items and Verified Indices Value", true);
		VerifyTodo_Indicess_Value();
		Reporter.log("Indices Value display in Sent Item", true);
		movingElement(MoveTo_ToDoList_Option);
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(Select_All_Item);
		Thread.sleep(9000);
		VerifyTodo_Indicess_Value();
		Reporter.log("Indices Value display in All Item", true);
		Reporter.log("Custom column is Verified successfully for ToDoList Functionality", true);
	}

	public void Reset_Custom_Columns_TodoList() throws Exception {

		Reporter.log("Test Scenario 15 : Reset Custom Columns for ToDoList ", true);
		try {
			LogDipakUser();
<<<<<<< HEAD
			Thread.sleep(6000);
=======
			Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Cancel_Button_TodoCustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_TodoCustomList);
		} else {
			// Custom List Dialog not present
		}
<<<<<<< HEAD
		Thread.sleep(6000);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(6000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(To_Do_Resetcolumn_Option);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(To_Do_Resetcolumn_Option);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on Reset Column Option", true);
		jsclick(Reset_Column_OK_Button);
		Reporter.log("Click on Ok button", true);
		Reporter.log("ToDoList Custom column Reset Successfully", true);
		Refresh_Button();
		Reporter.log("Click on Refresh button", true);
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
	}

	public void Negative_Default_Custom_Columns_RoomLevel() throws Exception {

		Reporter.log("Test Scenario 1: Verifying Default Custom Columns RoomLevel", true);
		try {
			LogDipakUser();
<<<<<<< HEAD
			Thread.sleep(6000);
=======
			Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
<<<<<<< HEAD
		Thread.sleep(6000);
		Refresh_Button();
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(6000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(6000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(6000);
		Reporter.log("select a Folder", true);
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(12000);
		Reporter.log("Click on  Custom Column Option", true);
=======
		Thread.sleep(9000);
		Refresh_Button();
		Thread.sleep(9000);
		Reporter.log("Click on Refresh button", true);
		selectElement(Select_Cabinet);
		Thread.sleep(9000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(Select_Drawer);
		Thread.sleep(9000);
		Reporter.log("Expand a Drawer", true);
		selectElement(Select_Folder);
		Thread.sleep(9000);
		Reporter.log("select a Folder", true);
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(4000);
		Reporter.log("Mousehover to Roomname Tab", true);
		movingclkElement(CustomColumnOptionRoom);
		Reporter.log("Click on  Custom Column Option", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"showcustomlistModel\"]")));
>>>>>>> origin/Dipak-Pandurang-Gawali
		jsclick(Default_Button_CustomList);
		Reporter.log("Default Custom Columns Roomlevel Verified");
	}

	public void CrossCancelButton_RoomLevel() throws Exception {

		Reporter.log("Test Scenario 2: Verifying Cross Cancel button Room Custom Columns", true);
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		jsclick(Crosscancel);
		Reporter.log("Click on  Cross button and Close Custom Column dialog", true);
		Reporter.log("Cross Cancel button Roomlevel Verified");
	}

	public void CancelButton_RoomCustomColumns() throws Exception {

		Reporter.log("Test Scenario 3 : Verifying Cancel button Room Custom Columns ", true);
<<<<<<< HEAD
		Thread.sleep(6000);
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(6000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(CustomColumnOptionRoom);
		Thread.sleep(12000);
		Reporter.log("Click on  Custom Column Option", true);
=======
		Thread.sleep(5000);
		movingElement(MoveTo_Menu_RoomName);
		Thread.sleep(4000);
		Reporter.log("Mousehover to Roomname Tab", true);
		movingclkElement(CustomColumnOptionRoom);
		Reporter.log("Click on  Custom Column Option", true);
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"showcustomlistModel\"]")));
>>>>>>> origin/Dipak-Pandurang-Gawali
		jsclick(cancelbutton);
		Reporter.log("Cancel button Room level Custom columns Verified");
	}

	public void Cross_CancelButton_Search() throws Exception {

		Reporter.log("Test Scenario 4 : Verifying Cross Cancel button Search Custom Columns", true);
		try {
			LogDipakUser();
<<<<<<< HEAD
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		if (Cancel_Button_CustomList.isDisplayed() == true) {
			movingclkElement(Cancel_Button_CustomList);
		} else {
			// Custom List Dialog not present
		}
		Thread.sleep(6000);
		movingElement(MoveTo_Search_Option);
		Thread.sleep(6000);
=======
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Thread.sleep(9000);
		movingElement(MoveTo_Search_Option);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Mousehover to Search Tab", true);
		jsclick(Search_Custom_Columns_option);
		Thread.sleep(12000);
		Reporter.log("Click on Search Custom Column Option", true);
		jsclick(Crosscancel);
		Reporter.log("Click on Cross cancel button", true);
		Reporter.log("Cross cancel button Search custom columns Verified");
	}

	public void CancelButton_Search() throws Exception {

		Reporter.log("Test Scenario 5: Verifying Cancel button Search Custom Columns", true);
		try {
			LogDipakUser();
<<<<<<< HEAD
			Thread.sleep(6000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Thread.sleep(6000);
		movingElement(MoveTo_Search_Option);
		Thread.sleep(6000);
=======
			Thread.sleep(9000);
		} catch (Exception e) {
			System.out.println("User is alreday Logged");
		}
		Thread.sleep(9000);
		movingElement(MoveTo_Search_Option);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Mousehover to Search Tab", true);
		jsclick(Search_Custom_Columns_option);
		Thread.sleep(12000);
		Reporter.log("Click on Custom Column Option", true);
		jsclick(cancelbutton);
		Reporter.log("Click on  Cancel button", true);
		Reporter.log("Cancel button Search Custom Columns Verified");
	}

	public void Cross_CancelButton_TodoList() throws Exception {

		Reporter.log("Test Scenario 6: Verifying Cross Cancel button TO DOCustom Columns", true);
<<<<<<< HEAD
		Thread.sleep(6000);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(6000);
		Reporter.log("Moushover to ToDoList Tab", true);
		jsclick(ToDoList_Custom_Columns_option);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
		Reporter.log("Moushover to ToDoList Tab", true);
		jsclick(ToDoList_Custom_Columns_option);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on Custom Column Option", true);
		jsclick(CrosscancelTODObutton);
		Reporter.log("Click on Cross cancel button", true);
		Reporter.log("Cross cancel button TODO List Custom columns Verified");
	}

	public void CancelButton_TodoList() throws Exception {

		Reporter.log("Test Scenario 7 : Verifying Cancel button TO DOCustom Columns", true);
<<<<<<< HEAD
		Thread.sleep(6000);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
		movingElement(MoveTo_ToDoList_Option);
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Mousehover to ToDoList Tab", true);
		jsclick(ToDoList_Custom_Columns_option);
		Thread.sleep(12000);
		Reporter.log("Click on To Do List Custom column Option", true);
		jsclick(cancelTODObutton);
<<<<<<< HEAD
		Thread.sleep(6000);
=======
		Thread.sleep(9000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		Reporter.log("Click on Cancel  button ToDo List Dialog ", true);
		Reporter.log("TODO list Custom columns Cancel button Verified");
		Refresh_Button();
		Reporter.log("Click on Refresh button", true);
	}
}
