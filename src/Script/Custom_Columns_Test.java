package Script;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Reporter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Pom.Customcolumns;
import Pom.Logout;
import Pom.Security;

// Dipak Automation script

public class Custom_Columns_Test extends Generic.BaseClass {
	private static final Logger log = LogManager.getLogger(Custom_Columns_Test.class);

	@BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	 @Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		log.info("CVS User is logged in successfully...");

	}

	// Custom columns for Room

	@Test(priority = 1)
	public void Open_Custom_List_Dialog_And_Verify_Title_Roomcolumn() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
		jsclick(pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Drawer());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Folder());
		Thread.sleep(4000);
		pojo.getMoveTo_Menu_RoomName();
		Thread.sleep(3000);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(4000);
		pojo.gettitelvalidation();
		Reporter.log("Custom List title validate", true);
		log.info("Custom List dialog Title verified");
	}

	@Test(priority = 2)
	public void Verify_The_Text_of_Custom_List_Dialog_Roomcolumn() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();
		Thread.sleep(5000);
		pojo.getextvalidation();
		Reporter.log("Custom List Dialog Text verified", true);
		log.info("Custom List dialog Text verified");
	}

	@Test(priority = 3)
	public void Set_And_Verify_Custom_Columns_NodeLevel() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Thread.sleep(6000);
		pojo.getSearchBoxIndices1();
		Thread.sleep(2000);
		jsclick(pojo.getSelect_Indices01());
		Thread.sleep(2000);
		pojo.getSearchBoxIndices2();
		Thread.sleep(2000);
		jsclick(pojo.getSelect_Indices02());
		Thread.sleep(2000);
		pojo.getSearchBoxIndices3();
		Thread.sleep(2000);
		jsclick(pojo.getSelect_Indices03());
		Thread.sleep(2000);
		pojo.Ok_Button_CustomList(driver);
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(4000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.Verify_CompactView_checkbox(driver);
		Thread.sleep(6000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Folder(), pojo.getSelect_Folder());
		Thread.sleep(6000);
		pojo.Verify_Indicess_Value(driver);
		Thread.sleep(5000);
		Reporter.log("Custom Columns is set Node Level successfully", true);
		log.info("Custom Columns is set Node Level successfully");

	}

	@Test(priority = 4)
	public void Verify_Default_Custom_Columns() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
		jsclick(pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Drawer());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Folder());
		Thread.sleep(4000);
		pojo.getMoveTo_Menu_RoomName();
		Thread.sleep(3000);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(4000);
		pojo.getMoveTo_Menu_RoomName();
		Thread.sleep(4000);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(4000);
		pojo.getDefault_Button_CustomList();
		Thread.sleep(4000);
		pojo.Ok_Button_CustomList(driver);
		Reporter.log("Set and Verify Default Custom columns successfully", true);
		log.info("Set and Verify Default Custom columns successfully");
	}

	@Test(priority = 5)
	public void Verify_Cancel_Button_of_CustomList() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();
		pojo.getMoveTo_Menu_RoomName();
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(4000);
		pojo.getCancel_Button_CustomList();
		Reporter.log("Cancle button is clicked", true);
		log.info("Cancle button is clicked successfully");
	}

	@Test(priority = 6)
	public void Verify_Custom_Columns_RoomLevel() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();
		pojo.getMoveTo_Menu_RoomName();
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(4000);
		jsclick(pojo.getClick_DropdownOption());
		pojo.Select_DropdownValue(driver);
		Thread.sleep(4000);
		jsclick(pojo.getSet_RoomLevel_Indices());
		Thread.sleep(4000);
		pojo.Ok_Button_CustomList(driver);
		Reporter.log("Indices is Selected Successfully for RoomLevel", true);
		log.info("Indices is Selected Successfully for RoomLevel");

	}

	@Test(priority = 7)
	public void Verify_Reset_Columns_Functionality() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();
		pojo.getMoveTo_Menu_RoomName();
		jsclick(pojo.getReset_Column_option());
		Thread.sleep(4000);
		jsclick(pojo.getResetColumn_popup_OK_button());
		Reporter.log("Custom columns Reset Successfully", true);
		log.info("Custom columns Reset Successfully");

	}

	// Custom columns for Search

	@Test(priority = 8)
	public void Open_Custom_List_Dialog_And_Verify_Title_Searchcolumn() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();
		pojo.MoveTo_Search_Option();
		Thread.sleep(4000);
		jsclick(pojo.getSearch_Custom_Columns_option());
		Thread.sleep(5000);
		pojo.getSearch_titelvalidation();
		Reporter.log("Search Custom List title validate", true);
		log.info("Search Custom List title validate");
	}

	@Test(priority = 9)
	public void Verify_The_Text_of_Custom_List_Dialog_Searchcolumn() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();
		Thread.sleep(5000);
		pojo.getSearch_textvalidation();
		Reporter.log("Search Custom List Dialog Text verified", true);
		log.info("Search Custom List Dialog Text verified");
	}

	@Test(priority = 10)
	public void Verify_Set_Custom_Columns_for_Search() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Thread.sleep(8000);
		pojo.getSearchBoxIndices4();
		Thread.sleep(3000);
		jsclick(pojo.getSearch_Select_Indices01());
		Thread.sleep(4000);
		pojo.getSearchBoxIndices5();
		Thread.sleep(3000);
		jsclick(pojo.getSearch_Select_Indices02());
		Thread.sleep(4000);
		pojo.getSearchBoxIndices6();
		Thread.sleep(3000);
		jsclick(pojo.getSearch_Select_Indices03());
		Thread.sleep(4000);
		jsclick(pojo.getSearch_Ok_Button_CustomList());
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(5000);
		jsclick(pojo.getClick_Search_Option());
		Thread.sleep(4000);
		jsclick(pojo.getDocument_Location(driver));
		Thread.sleep(4000);
		jsclick(pojo.getCabinetPlus());
		Thread.sleep(4000);
		jsclick(pojo.getDrawerPlus(driver));
		Thread.sleep(4000);
		jsclick(pojo.getFolder(driver));
		Thread.sleep(4000);
		jsclick(pojo.getOk_button());
		Thread.sleep(8000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(6000);
		pojo.Search_Verify_Indicess_Value4(driver);
		Thread.sleep(3000);
		pojo.Search_Verify_Indicess_Value5(driver);
		Thread.sleep(3000);
		pojo.Search_Verify_Indicess_Value6(driver);
		Thread.sleep(6000);
		Reporter.log("Custom column is set successfully for Search Functionality", true);
		log.info("Custom column is set successfully for Search Functionality");
	}

	@Test(priority = 11)
	public void Verify_Reset_Columns_for_Search() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();
		pojo.MoveTo_Search_Option();
		Thread.sleep(4000);
		jsclick(pojo.getClick_ResetColumn());
		Thread.sleep(4000);
		jsclick(pojo.getOk_Button_ResetColumn());
		Thread.sleep(4000);
		jsclick(pojo.getFind_Button());
		Thread.sleep(6000);
		Reporter.log("Reset Custom Columns Successfully for Search", true);
		log.info("Reset Custom Columns Successfully for Search");

	}

// Custom column for ToDolist

	@Test(priority = 12)
	public void Open_Custom_List_Dialog_And_Verify_Title_ToDoList() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(4000);
		jsclick(pojo.getToDoList_Custom_Columns_option());
		Thread.sleep(5000);
		pojo.ToDoList_titelvalidation(driver);
		Reporter.log("ToDoList Custom List title validate", true);
		log.info("ToDoList Custom List title validate");
	}

	@Test(priority = 13)
	public void Verify_The_Text_of_Custom_List_Dialog_ToDoList() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Thread.sleep(5000);
		pojo.ToDoList_textvalidation(driver);
		Reporter.log("Custom List Dialog Text verified", true);
		log.info("Custom List Dialog Text verified");
	}

	@Test(priority = 14)
	public void Verify_Set_Custom_Columns_for_ToDoList() throws Exception {

		Customcolumns pojo = new Customcolumns();

		Thread.sleep(9000);
		jsclick(pojo.getToDoList_Select_Indices01());
		Thread.sleep(4000);
		Customcolumns.ToDoList_Ok_Button_CustomList(driver).click();
		Reporter.log("Indices Selected Successfully", true);
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Cabinet());
		Thread.sleep(4000);
		jsclick(pojo.getSelect_Drawer());
		Thread.sleep(4000);
		movingDoublecli(pojo.getSelect_Folder(), pojo.getSelect_Folder());
		Thread.sleep(6000);
		jsclick(pojo.getSelectDoc(driver));
		Thread.sleep(4000);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(2000);
		jsclick(pojo.getsendWorkflow(driver));
		Thread.sleep(3000);
		jsclick(pojo.getWFAssign(driver));
		Thread.sleep(5000);
		pojo.getSelectDoc(driver);
		Thread.sleep(8000);
		pojo.getMoveTo_Menu_Documents();
		Thread.sleep(4000);
		pojo.getVerify_CopyandPaste_Document();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(4000);
		jsclick(pojo.getSelect_All_Item());
		Thread.sleep(6000);
		pojo.ToDoList_Verify_Indicess_Value(driver);
		Reporter.log("Custom column is set successfully for ToDoList Functionality", true);
		log.info("Custom column is set successfully for ToDoList Functionality");
	}

	@Test(priority = 15)
	public void Reset_Custom_Columns_for_ToDoList() throws InterruptedException {
		Customcolumns pojo = new Customcolumns();
		Thread.sleep(4000);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(4000);
		jsclick(pojo.getTo_Do_Resetcolumn_Option());
		Thread.sleep(4000);
		jsclick(pojo.getToDoList_Reset_Column_OK_Button());
		Reporter.log("ToDoList Custom column Reset Successfully", true);
		log.info("ToDoList Custom column Reset Successfully");
		jsclick(pojo.getRefreshbutton());
	}
}