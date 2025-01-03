package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.Customcolumns;

<<<<<<< HEAD
//Dipak Automation Coading
=======
// Dipak Automation script
>>>>>>> origin/Dipak-Pandurang-Gawali

public class Custom_Columns_Test extends Computhink.Generic.BaseClass {

	/*
	 * @BeforeClass
	 * 
	 * public void Launch_Browser() throws Exception { loadBrowser("edge");
	 * launchUrl(); Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test
	 * 
	 * public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully", true);
	 * 
	 * }
	 */

<<<<<<< HEAD
	// Custom columns for Room
=======
	// Room level Custom columns
>>>>>>> origin/Dipak-Pandurang-Gawali

	@Test(priority = 1)
	public void TC_01_Verify_Open_Custom_List_Dialog_Title() throws Exception {

		Customcolumns pojo = new Customcolumns();
		pojo.Verify_Custom_List_Dialog();
	}

	@Test(priority = 2)
<<<<<<< HEAD
	public void TC_02_Verify__Text_of_Custom_List_Dialog() throws Exception {
=======
	public void TC_02_Verify_Text_of_Custom_List_Dialog() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		Customcolumns pojo = new Customcolumns();
		pojo.Verify_Custom_List_Dialog_Text();
	}

	@Test(priority = 3)
	public void TC_03_Set_And_Verify_Custom_Columns_NodeLevel() throws Exception {

		Customcolumns pojo = new Customcolumns();
		pojo.Set_Custom_Column_Node_Level();
	}

	@Test(priority = 4)
	public void TC_04_Verify_Default_Custom_Columns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		pojo.Default_Custom_Columns();
	}

	@Test(priority = 5)
	public void TC_05_Verify_Cancel_Button_of_CustomList() throws Exception {

		Customcolumns pojo = new Customcolumns();
		pojo.Cancel_Button_Custom_List();
	}

	@Test(priority = 6)
<<<<<<< HEAD
	public void TC_06_Verify_Custom_Columns_RoomLevel() throws Exception {

		Customcolumns pojo = new Customcolumns();
		pojo.Custom_Columns_RoomLevel();
	}

	@Test(priority = 7)
	public void TC_07_Verify_Reset_Columns_Functionality() throws Exception {
=======
	public void TC_06_Verify_Reset_Columns_Functionality() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		Customcolumns pojo = new Customcolumns();
		pojo.Reset_Columns_RoomLevel();
	}

	// Custom columns for Search

<<<<<<< HEAD
	@Test(priority = 8)
	public void TC_08_Open_Custom_List_Dialog_And_Verify_Title_Searchcolumn() throws Exception {
=======
	@Test(priority = 7)
	public void TC_07_Open_Custom_List_Dialog_And_Verify_Title_Searchcolumn() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		Customcolumns pojo = new Customcolumns();
		pojo.Title_Custom_Columns_Search();
	}

<<<<<<< HEAD
	@Test(priority = 9)
	public void TC_09_Verify__Text_of_Custom_List_Dialog_Searchcolumn() throws Exception {
=======
	@Test(priority = 8)
	public void TC_08_Verify_Text_of_Custom_List_Dialog_Searchcolumn() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		Customcolumns pojo = new Customcolumns();
		pojo.Text_Custom_Columns_Search();
	}

<<<<<<< HEAD
	@Test(priority = 10)
	public void TC_10_Verify_Set_Custom_Columns_for_Search() throws Exception {
=======
	@Test(priority = 9)
	public void TC_9_Verify_Set_Custom_Columns_for_Search() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		Customcolumns pojo = new Customcolumns();
		pojo.Set_Custom_Columns_Search();
	}

<<<<<<< HEAD
	@Test(priority = 11)
	public void TC_11_Verify_Reset_Columns_for_Search() throws Exception {
=======
	@Test(priority = 10)
	public void TC_10_Verify_Reset_Columns_for_Search() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		Customcolumns pojo = new Customcolumns();
		pojo.Reset_Custom_Columns_Search();
	}

<<<<<<< HEAD
	// Custom column for ToDolist

	@Test(priority = 12)
	public void TC_12_Open_Custom_List_Dialog_And_Verify_Title_ToDoList() throws Exception {
=======
// Custom column for ToDolist

	@Test(priority = 11)
	public void TC_11_Open_Custom_List_Dialog_And_Verify_Title_ToDoList() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		Customcolumns pojo = new Customcolumns();
		pojo.Title_Custom_Columns_TodoList();
	}

<<<<<<< HEAD
	@Test(priority = 13)
	public void TC_13_Verify_Text_of_Custom_List_Dialog_ToDoList() throws Exception {
=======
	@Test(priority = 12)
	public void TC_12_Verify_Text_of_Custom_List_Dialog_ToDoList() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		Customcolumns pojo = new Customcolumns();
		pojo.Text_Custom_Columns_TodoList();
	}

<<<<<<< HEAD
	@Test(priority = 14)
	public void TC_14_Verify_Set_Custom_Columns_for_ToDoList() throws Exception {
=======
	@Test(priority = 13)
	public void TC_13_Verify_Set_Custom_Columns_for_ToDoList() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		Customcolumns pojo = new Customcolumns();
		pojo.Set_Custom_Columns_TodoList();
	}

<<<<<<< HEAD
	@Test(priority = 15)
	public void TC_15_Reset_Custom_Columns_for_ToDoList() throws Exception {
=======
	@Test(priority = 14)
	public void TC_14_Reset_Custom_Columns_for_ToDoList() throws Exception {
>>>>>>> origin/Dipak-Pandurang-Gawali

		Customcolumns pojo = new Customcolumns();
		pojo.Reset_Custom_Columns_TodoList();
	}
}