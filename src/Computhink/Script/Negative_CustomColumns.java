package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.Customcolumns;

//Dipak Automation Coading

public class Negative_CustomColumns extends Computhink.Generic.BaseClass {

	/*
	 * @BeforeClass
	 * 
	 * public void Launch_Browser() throws Exception { loadBrowser("edge");
	 * launchUrl(); Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test
	 * 
	 * public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully.", true);
	 * 
	 * }
	 */

	// Custom columns negative scenario

	@Test(priority = 1)
	public void TC_01_Verify_Default_Custom_Columns_RoomLevel() throws Exception {

		Customcolumns pojo = new Customcolumns();
		pojo.Negative_Default_Custom_Columns_RoomLevel();
	}

	@Test(priority = 2)
	public void TC_02_Verify_CrossCancelButton_RoomCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		pojo.CrossCancelButton_RoomLevel();
	}

	@Test(priority = 3)
	public void TC_03_Verify_CancelButton_RoomCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		pojo.CancelButton_RoomCustomColumns();
	}

	@Test(priority = 4)
	public void TC_04_Verify_CrossCancelButton_SearchCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		pojo.Cross_CancelButton_Search();
	}

	@Test(priority = 5)
	public void TC_05_Verify_CancelButton_SearchCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		pojo.CancelButton_Search();
	}

	@Test(priority = 6)
	public void TC_06_Verify_CrossCancelButton_TODOCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		pojo.Cross_CancelButton_TodoList();
	}

	@Test(priority = 7)
	public void TC_07_Verify_CancelButton_TODOCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		pojo.CancelButton_TodoList();
	}
}
