package Script;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pom.Customcolumns;

// Dipak Automation script

public class Custom_Columns_Test extends Generic.BaseClass {

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

	// Custom columns for Room

	@Test(priority = 1)
	public void TC_01_Verify_Open_Custom_List_Dialog_Title() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 1 : Verifying open custom List dialog title ", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		Reporter.log("Click on Refresh button", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("Expand a Folder", true);
		movingElement(pojo.getMoveTo_Menu_RoomName());
		Thread.sleep(3000);
		Reporter.log("Moousehover on Roomname Tab", true);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(7000);
		Reporter.log("Click on Custom column Option", true);
		pojo.gettitelvalidation();
		Reporter.log("Custom List title validate", true);

	}

	@Test(priority = 2)
	public void TC_02_Verify__Text_of_Custom_List_Dialog() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 2 : Verifying  text of custom List dialog", true);
		Thread.sleep(7000);
		pojo.getextvalidation();
		Reporter.log("Custom List dialog text verified", true);

	}

	@Test(priority = 3)
	public void TC_03_Set_And_Verify_Custom_Columns_NodeLevel() throws Exception {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 3 : Set and verifying Custom Columns Node Level ", true);
		Thread.sleep(7000);
		pojo.getSearchBoxIndices1();
		Thread.sleep(2000);
		Reporter.log("Enter Indices Name in search textbox field", true);
		jsclick(pojo.getSelect_Indices01());
		Thread.sleep(2000);
		Reporter.log("Select entered Indices", true);
		pojo.getSearchBoxIndices2();
		Thread.sleep(2000);
		Reporter.log("Enter Indices name in search textbox field", true);
		jsclick(pojo.getSelect_Indices02());
		Thread.sleep(2000);
		Reporter.log("Select entered Indices", true);
		pojo.getSearchBoxIndices3();
		Thread.sleep(2000);
		Reporter.log("Enter Indices name in search textbox field", true);
		jsclick(pojo.getSelect_Indices03());
		Thread.sleep(2000);
		Reporter.log("Select entered Indices", true);
		pojo.Ok_Button_CustomList();
		Reporter.log("Click on Ok button", true);
		Reporter.log("Indices selected successfully", true);
		Thread.sleep(7000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(7000);
		Reporter.log("Click on setting Icon", true);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(7000);
		Reporter.log("Click on My Preferences Option", true);
		pojo.Verify_CompactView_checkbox();
		Thread.sleep(7000);
		Reporter.log("Uncheck Compact View checkbox", true);
		jsclick(pojo.getApply_button());
		Thread.sleep(7000);
		Reporter.log("Click on Apply button", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("Expand a Folder", true);
		Verify_Indicess_Value();
		Reporter.log("Verifying Indices and Custom Columns is set Node Level successfully", true);

	}

	private void Verify_Indicess_Value() {
		// TODO Auto-generated method stub

	}

	@Test(priority = 4)
	public void TC_04_Verify_Default_Custom_Columns() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 4 : Verifying Default Custom Columns ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		selectElement(pojo.getSelect_Cabinet());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder());
		Thread.sleep(7000);
		Reporter.log("Expand a Folder", true);
		movingElement(pojo.getMoveTo_Menu_RoomName());
		Thread.sleep(3000);
		Reporter.log("Mousehover on Roomname Tab", true);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Column Option", true);
		movingElement(pojo.getMoveTo_Menu_RoomName());
		Thread.sleep(7000);
		Reporter.log("Mousehover on Roomname Tab", true);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Column Option", true);
		pojo.getDefault_Button_CustomList();
		Thread.sleep(7000);
		Reporter.log("Click on Default button", true);
		pojo.Ok_Button_CustomList();
		Reporter.log("Click on Ok button", true);
		Reporter.log("Set and Verifying Default Custom columns successfully", true);
	}

	@Test(priority = 5)
	public void TC_05_Verify_Cancel_Button_of_CustomList() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 5 : Verifying Cancel button of Custom List ", true);
		movingElement(pojo.getMoveTo_Menu_RoomName());
		Reporter.log("Mousehover on Roomname Tab", true);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Column Option", true);
		pojo.getCancel_Button_CustomList();
		Reporter.log("Click on Cancel button", true);
	}

	@Test(priority = 6)
	public void TC_06_Verify_Custom_Columns_RoomLevel() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 6 : Verifying Custom Columns Room Level ", true);
		movingElement(pojo.getMoveTo_Menu_RoomName());
		Reporter.log("Mousehover on Roomname Tab", true);
		Thread.sleep(7000);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Column Option", true);
		jsclick(pojo.getClick_DropdownOption());
		Reporter.log("Click on Dropdown", true);
		pojo.Select_DropdownValue();
		Thread.sleep(7000);
		Reporter.log("Select Dropdown value", true);
		jsclick(pojo.getSet_RoomLevel_Indices());
		Thread.sleep(7000);
		Reporter.log("Set Room level Indices", true);
		pojo.Ok_Button_CustomList();
		Reporter.log("Click on Ok button", true);
		Reporter.log("Indices is Selected Successfully for RoomLevel", true);

	}

	@Test(priority = 7)
	public void TC_07_Verify_Reset_Columns_Functionality() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 7 : Verifying Reset Columns Functionality ", true);
		movingElement(pojo.getMoveTo_Menu_RoomName());
		Reporter.log("Mousehover on Roomname Tab", true);
		Thread.sleep(7000);
		jsclick(pojo.getReset_Column_option());
		Thread.sleep(7000);
		Reporter.log("Click on Reset Column Option", true);
		jsclick(pojo.getResetColumn_popup_OK_button());
		Reporter.log("Click on Ok button", true);
		Reporter.log("Custom columns Reset Successfully", true);

	}

	// Custom columns for Search

	@Test(priority = 8)
	public void TC_08_Open_Custom_List_Dialog_And_Verify_Title_Searchcolumn() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 8 : Open Custom List Dialog And Verifying Title Search column ", true);
		movingElement(pojo.MoveTo_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Mousehover on Search Tab", true);
		jsclick(pojo.getSearch_Custom_Columns_option());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Column Option", true);
		pojo.getSearch_titelvalidation();
		Reporter.log("Search Custom List title validate", true);
	}

	@Test(priority = 9)
	public void TC_09_Verify__Text_of_Custom_List_Dialog_Searchcolumn() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 9 : Verifying  Text of Custom List Dialog Search column ", true);
		Thread.sleep(7000);
		pojo.getSearch_textvalidation();
		Reporter.log("Search Custom List Dialog Text verified", true);
	}

	@Test(priority = 10)
	public void TC_10_Verify_Set_Custom_Columns_for_Search() throws Exception {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 10 : Verifying Set Custom Columns for Search ", true);
		Thread.sleep(7000);
		pojo.getSearchBoxIndices4();
		Thread.sleep(3000);
		Reporter.log("Enter Indices value in Search textbox field", true);
		jsclick(pojo.getSearch_Select_Indices01());
		Thread.sleep(7000);
		Reporter.log("Select Entered Indices", true);
		pojo.getSearchBoxIndices5();
		Thread.sleep(3000);
		Reporter.log("Enter Indices value in Search textbox field", true);
		jsclick(pojo.getSearch_Select_Indices02());
		Thread.sleep(7000);
		Reporter.log("Select Entered Indices", true);
		pojo.getSearchBoxIndices6();
		Thread.sleep(3000);
		Reporter.log("Enter Indices value in Search textbox field", true);
		jsclick(pojo.getSearch_Select_Indices03());
		Thread.sleep(7000);
		Reporter.log("Select Entered Indice", true);
		jsclick(pojo.getSearch_Ok_Button_CustomList());
		Reporter.log("Click on Ok button", true);
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Tab", true);
		jsclick(pojo.getDocument_Location());
		Thread.sleep(7000);
		Reporter.log("Click on Document Location textbox", true);
		selectElement(pojo.getSelect_Cabinet2());
		Thread.sleep(7000);
		Reporter.log("Expand a Cabinet", true);
		selectElement(pojo.getSelect_Drawer2());
		Thread.sleep(7000);
		Reporter.log("Expand a Drawer", true);
		selectElement(pojo.getSelect_Folder2());
		Thread.sleep(7000);
		Reporter.log("Expand a Folder", true);
		jsclick(pojo.getOk_button());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		pojo.Search_Verify_Indicess_Value4();
		Thread.sleep(6000);
		Reporter.log("Verifying and Select Indices Custom Column 1", true);
		pojo.Search_Verify_Indicess_Value5();
		Thread.sleep(6000);
		Reporter.log("Verifying Select Indices Custom Column 2", true);
		pojo.Search_Verify_Indicess_Value6();
		Thread.sleep(7000);
		Reporter.log("Verifying Select Indices Custom Column 3", true);
		Reporter.log("Custom column is set successfully for Search Functionality", true);
	}

	@Test(priority = 11)
	public void TC_11_Verify_Reset_Columns_for_Search() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 11 : Verifying Reset Columns for Search ", true);
		movingElement(pojo.MoveTo_Search_Option());
		Thread.sleep(7000);
		Reporter.log("Mousehover on Search Tab", true);
		jsclick(pojo.getClick_ResetColumn());
		Thread.sleep(7000);
		Reporter.log("Click on Reset Column Option ", true);
		jsclick(pojo.getOk_Button_ResetColumn());
		Thread.sleep(7000);
		Reporter.log("Click on Ok button", true);
		jsclick(pojo.getFind_Button());
		Thread.sleep(7000);
		Reporter.log("Click on Find button", true);
		Reporter.log("Reset Custom Columns Successfully for Search", true);

	}

// Custom column for ToDolist

	@Test(priority = 12)
	public void TC_12_Open_Custom_List_Dialog_And_Verify_Title_ToDoList() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 12 : Open Custom List Dialog And Verifying Title ToDoLis ", true);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		movingElement(pojo.getMoveTo_ToDoList_Option());
		Thread.sleep(7000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(pojo.getToDoList_Custom_Columns_option());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Column Option", true);
		pojo.ToDoList_titelvalidation();
		Reporter.log("ToDoList Custom List title validate", true);
	}

	@Test(priority = 13)
	public void TC_13_Verify__Text_of_Custom_List_Dialog_ToDoList() throws Exception {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 13: Verifying  Text of Custom List Dialog ToDoList ", true);
		Thread.sleep(7000);
		pojo.ToDoList_textvalidation();
		Reporter.log("Custom List Dialog Text verified", true);
	}

	@Test(priority = 14)
	public void TC_14_Verify_Set_Custom_Columns_for_ToDoList() throws Exception {

		Customcolumns pojo = new Customcolumns();

		Reporter.log("Test Scenario 14 : Verifying Set Custom Columns for ToDoList ", true);
		Thread.sleep(5000);
		pojo.getTODOSearchBox();
		Reporter.log("Search Indices value", true);
		Thread.sleep(7000);
		jsclick(pojo.getSelect_ToDoIndices());
		Reporter.log("Select Indices value", true);
		jsclick(pojo.ToDoList_Ok_Button_CustomList());
		Reporter.log("Click on Ok button", true);
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(7000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(7000);
		Reporter.log("Click on Refresh button", true);
		movingElement(pojo.getMoveTo_ToDoList_Option());
		Thread.sleep(7000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(pojo.getToDoNew_Item());
		Thread.sleep(7000);
		Reporter.log("Click on New Items and Verified Indices Value", true);
		pojo.ToDoList_Verify_Indicess_Value();
		Reporter.log("Indices Value display in New Item", true);
		movingElement(pojo.getMoveTo_ToDoList_Option());
		Thread.sleep(7000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(pojo.getToDo_Pending());
		Thread.sleep(7000);
		Reporter.log("Click on Pending Items and Verified Indices Value", true);
		pojo.ToDoList_Verify_Indicess_Value();
		Reporter.log("Indices Value display in Pending Item", true);
		movingElement(pojo.getMoveTo_ToDoList_Option());
		Thread.sleep(7000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(pojo.getToDoReviewed());
		Thread.sleep(7000);
		Reporter.log("Click on Reviewed Items and Verified Indices Value", true);
		pojo.ToDoList_Verify_Indicess_Value();
		Reporter.log("Indices Value display in Reviewed Item", true);
		movingElement(pojo.getMoveTo_ToDoList_Option());
		Thread.sleep(7000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(pojo.getToDoSentItem());
		Thread.sleep(7000);
		Reporter.log("Click on Sent Items and Verified Indices Value", true);
		pojo.ToDoList_Verify_Indicess_Value();
		Reporter.log("Indices Value display in Sent Item", true);
		movingElement(pojo.getMoveTo_ToDoList_Option());
		Thread.sleep(7000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(pojo.getSelect_All_Item());
		Thread.sleep(7000);
		pojo.ToDoList_Verify_Indicess_Value();
		Reporter.log("Indices Value display in All Item", true);
		Reporter.log("Custom column is Verified successfully for ToDoList Functionality", true);

	}

	@Test(priority = 15)
	public void TC_15_Reset_Custom_Columns_for_ToDoList() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();
		Reporter.log("Test Scenario 15 : Reset Custom Columns for ToDoList ", true);
		Thread.sleep(7000);
		movingElement(pojo.getMoveTo_ToDoList_Option());
		Thread.sleep(7000);
		Reporter.log("Mousehover on ToDoList Tab", true);
		jsclick(pojo.getTo_Do_Resetcolumn_Option());
		Thread.sleep(7000);
		Reporter.log("Click on Reset Column Option", true);
		jsclick(pojo.getToDoList_Reset_Column_OK_Button());
		Reporter.log("Click on Ok button", true);
		Reporter.log("ToDoList Custom column Reset Successfully", true);
		jsclick(pojo.getRefreshbutton());
		Reporter.log("Click on Refresh button", true);
		Thread.sleep(7000);
		driver.close();
		Reporter.log("Close the browser", true);
	}
}