package Script;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Customcolumns;

// Dipak Automation script

public class Negative_CustomColumns extends Generic.BaseClass {

	@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("Chrome");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}

	// Custom columns for Room

	@Test(priority = 1)
	public void TC_01_Verify_Default_Custom_Columns_RoomLevel() throws InterruptedException {

		Customcolumns pojo = new Customcolumns();
		Reporter.log("Test Scenario 1: Verifying Default Custom Columns RoomLevel", true);
		Thread.sleep(7000);
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
		Reporter.log("select a Folder", true);
		pojo.getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(7000);
		Reporter.log("Click on  Custom Column Option", true);
		jsclick(pojo.getDefault_Button_CustomList());
		Reporter.log("Default Custom Columns Roomlevel Verified");
	}

	@Test(priority = 2)
	public void TC_02_Verify_CrossCancelButton_RoomCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Reporter.log("Test Scenario 2: Verifying Cross Cancel button Room Custom Columns", true);
		Thread.sleep(7000);
		jsclick(pojo.getCrosscancel());
		Reporter.log("Click on  Cross button and Close Custom Column dialog", true);
		Reporter.log("Cross Cancel button Roomlevel Verified");
	}

	@Test(priority = 3)
	public void TC_03_Verify_CancelButton_RoomCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Reporter.log("Test Scenario 3 : Verifying Cancel button Room Custom Columns ", true);
		Thread.sleep(7000);
		pojo.getMoveTo_Menu_RoomName();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Roomname Tab", true);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(7000);
		Reporter.log("Click on  Custom Column Option", true);
		jsclick(pojo.getcancelbutton());
		Reporter.log("Cancel button Room level Custom columns Verified");
	}

	@Test(priority = 4)
	public void TC_04_Verify_CrossCancelButton_SearchCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Reporter.log("Test Scenario 4 : Verifying Cross Cancel button Search Custom Columns", true);
		Thread.sleep(7000);
		pojo.MoveTo_Search_Option();
		Thread.sleep(6000);
		Reporter.log("Mousehover to Search Tab", true);
		jsclick(pojo.getSearch_Custom_Columns_option());
		Thread.sleep(7000);
		Reporter.log("Click on Search Custom Column Option", true);
		jsclick(pojo.getCrosscancel());
		Reporter.log("Click on Cross cancel button", true);
		Reporter.log("Cross cancel button Search custom columns Verified");
	}

	@Test(priority = 5)
	public void TC_05_Verify_CancelButton_SearchCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Reporter.log("Test Scenario 5: Verifying Cancel button Search Custom Columns", true);
		Thread.sleep(7000);
		pojo.MoveTo_Search_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover to Search Tab", true);
		jsclick(pojo.getSearch_Custom_Columns_option());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Column Option", true);
		jsclick(pojo.getcancelbutton());
		Reporter.log("Click on  Cancel button", true);
		Reporter.log("Cancel button Search Custom Columns Verified");
	}

	@Test(priority = 6)
	public void TC_06_Verify_CrossCancelButton_TODOCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Reporter.log("Test Scenario 6: Verifying Cross Cancel button TO DOCustom Columns", true);
		Thread.sleep(7000);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(7000);
		Reporter.log("Moushover to ToDoList Tab", true);
		jsclick(pojo.getToDoList_Custom_Columns_option());
		Thread.sleep(7000);
		Reporter.log("Click on Custom Column Option", true);
		jsclick(pojo.getCrosscancelTODObutton());
		Reporter.log("Click on Cross cancel button", true);
		Reporter.log("Cross cancel button TODO List Custom columns Verified");
	}

	@Test(priority = 7)
	public void TC_07_Verify_CancelButton_TODOCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Reporter.log("Test Scenario 7 : Verifying Cancel button TO DOCustom Columns", true);
		Thread.sleep(7000);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(7000);
		Reporter.log("Mousehover to ToDoList Tab", true);
		jsclick(pojo.getToDoList_Custom_Columns_option());
		Thread.sleep(7000);
		Reporter.log("Click on To Do List Custom column Option", true);
		jsclick(pojo.getcancelTODObutton());
		Thread.sleep(7000);
		Reporter.log("Click on Cancel  button ToDo List Dialog ", true);
		Reporter.log("TODO list Custom columns Cancel button Verified");
		driver.close();
		Reporter.log("Close the browser", true);
	}
}
