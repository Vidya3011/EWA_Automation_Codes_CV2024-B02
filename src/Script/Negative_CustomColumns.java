package Script;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Customcolumns;

// Dipak Automation script

public class Negative_CustomColumns extends Generic.BaseClass {
	private static final Logger log = LogManager.getLogger(Negative_CustomColumns.class);

	// @BeforeClass

	public void LandBrowser() {
		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	// @Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		log.info("CVS User is logged in successfully...");

	}

	// Custom columns for Room

	@Test(priority = 1)
	public void Verify_Default_Custom_Columns_RoomLevel() throws InterruptedException {

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
		jsclick(pojo.getDefault_Button_CustomList());
		log.info("Default Custom Columns Roomlevel Verified");
	}

	@Test(priority = 2)
	public void Verify_CrossCancelButton_RoomCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Thread.sleep(4000);
		jsclick(pojo.getCrosscancel());
		log.info("Cross Cancel button Roomlevel Verified");
	}

	@Test(priority = 3)
	public void Verify_CancelButton_RoomCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Thread.sleep(4000);
		pojo.getMoveTo_Menu_RoomName();
		Thread.sleep(3000);
		jsclick(pojo.getCustomColumnOption());
		Thread.sleep(4000);
		jsclick(pojo.getcancelbutton());
		log.info("Cancel button Room level Custom columns Verified");
	}

	@Test(priority = 4)
	public void Verify_CrossCancelButton_SearchCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Thread.sleep(4000);
		pojo.MoveTo_Search_Option();
		Thread.sleep(4000);
		jsclick(pojo.getSearch_Custom_Columns_option());
		Thread.sleep(5000);
		jsclick(pojo.getCrosscancel());
		log.info("Cross cancel button Search custom columns Verified");
	}

	@Test(priority = 5)
	public void Verify_CancelButton_SearchCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Thread.sleep(4000);
		pojo.MoveTo_Search_Option();
		Thread.sleep(4000);
		jsclick(pojo.getSearch_Custom_Columns_option());
		Thread.sleep(5000);
		jsclick(pojo.getcancelbutton());
		log.info("Cancel button Search Custom Columns Verified");
	}

	@Test(priority = 6)
	public void Verify_CrossCancelButton_TODOCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Thread.sleep(4000);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(4000);
		jsclick(pojo.getToDoList_Custom_Columns_option());
		Thread.sleep(6000);
		jsclick(pojo.getCrosscancelTODObutton());
		log.info("Cross cancel button TODO List Custom columns Verified");
	}

	@Test(priority = 7)
	public void Verify_CancelButton_TODOCustomColumns() throws Exception {

		Customcolumns pojo = new Customcolumns();
		Thread.sleep(4000);
		pojo.getMoveTo_ToDoList_Option();
		Thread.sleep(4000);
		jsclick(pojo.getToDoList_Custom_Columns_option());
		Thread.sleep(6000);
		jsclick(pojo.getcancelTODObutton());
		Thread.sleep(5000);
		log.info("TODO list Custom columns Cancel button Verified");
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(5000);
	}
}
