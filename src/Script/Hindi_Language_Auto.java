package Script;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Language;
import Pom.Language1;
import Pom.LanguageHindiFrench;
import Pom.LanguageHindiFrench;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Hindi_Language_Auto extends Generic.BaseClass {

	private static final Logger log = LogManager.getLogger(Hindi_Language_Auto.class);

	// @BeforeClass
	public void LandBrowser() {

		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	// @Test
	public void Login_EWA() throws Exception {
		loginCVS();

		log.info("CVS User is logged in successfully...");

	}

	@Test(priority = 1)
	public void TC_01_CreateandOpen_NewDocument_Dutch_Language() throws Exception {

		Language pojo = new Language();
		pojo.CreateandOpen_NewDocument_Dutch_Language();
	}

	@Test(priority = 2)
	public void TC_02_Verify_OCR_afterCreatingDocument() throws Exception {

		Language pojo = new Language();
		pojo.Verify_OCR_afterCreatingDocument();
	}

	@Test(priority = 3)
	public void TC_03_Addsignature_Dutch_Language() throws Exception {

		Language pojo = new Language();
		pojo.Addsignature_Dutch_Language();
	}

	@Test(priority = 4)
	public void TC_04_AddRedaction_Dutch_Language() throws Exception {

		Language pojo = new Language();
		pojo.getAddRedaction_Dutch_Language();
	}

	@Test(priority = 5)
	public void TC_05_ShowHideThumbnail_Dutch_Language() throws Exception {

		Language pojo = new Language();
		pojo.getShowHideThumbnail_Dutch_Language();
	}

	// Create Template in Dutch laguage

	@Test(priority = 6)
	public void TC_06_verify_to_CreateorBrowse_Template_Defaultviewing() throws Exception {

		Language pojo = new Language();
		pojo.getverify_to_CreateorBrowse_Template_Defaultviewing();
	}

	@Test(priority = 7)
	public void TC_07_Verify_to_Edit_and_Delete_DefaultTemplate() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_to_Edit_and_Delete_DefaultTemplate();
	}

	@Test(priority = 8)
	public void TC_08_verify_to_CreateorBrowse_Template_Advancedviewing_OfficeDoc() throws Exception {

		Language pojo = new Language();
		pojo.getverify_to_CreateorBrowse_Template_Advancedviewing_OfficeDoc();
	}

	@Test(priority = 9)
	public void TC_09_Verify_to_Edit_and_Delete_AdvancedTemplate_OfficeDoc() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_to_Edit_and_Delete_AdvancedTemplate_OfficeDoc();
	}

	@Test(priority = 10)
	public void TC_10_verify_to_Create_Formmapping_PDFTemplate_Advancedviewing() throws Exception {

		Language pojo = new Language();
		pojo.getverify_to_Create_Formmapping_PDFTemplate_Advancedviewing();
	}

	@Test(priority = 11)
	public void TC_11_Verify_to_Edit_and_Delete_Formfield() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_to_Edit_and_Delete_Formfield();
	}

	@Test(priority = 12)
	public void TC_12_Set_Defaultview() throws Exception {

		Language pojo = new Language();
		pojo.getSet_Defaultview();
	}

	// Verifying Load more in Search and Folder in Spanish laguage

	@Test(priority = 13)
	public void TC_13_Verify_Load_MoreCount_On_Search() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_Load_MoreCount_On_Search();
	}

	@Test(priority = 14)
	public void TC_14_Verify_Load_MoreCount_On_Folder() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_Load_MoreCount_On_Folder();
	}

	// Verifying Custom Columns in Spanish Language

	// Custom columns for Room

	@Test(priority = 15)
	public void TC_15_Open_Custom_List_Dialog_And_Verify_Title_Roomcolumn() throws InterruptedException {

		Language pojo = new Language();
		pojo.getOpen_Custom_List_Dialog_And_Verify_Title_Roomcolumn();
	}

	@Test(priority = 16)
	public void TC_16_Verify__Text_of_Custom_List_Dialog_Roomcolumn() throws InterruptedException {

		Language pojo = new Language();
		pojo.getVerify__Text_of_Custom_List_Dialog_Roomcolumn();
	}

	@Test(priority = 17)
	public void TC_17_Set_And_Verify_Custom_Columns_NodeLevel() throws Exception {

		Language pojo = new Language();
		pojo.getSet_And_Verify_Custom_Columns_NodeLevel();
	}

	@Test(priority = 18)
	public void TC_18_Verify_Default_Custom_Columns() throws InterruptedException {

		Language pojo = new Language();
		pojo.getVerify_Default_Custom_Columns();
	}

	@Test(priority = 19)
	public void TC_19_Verify_Cancel_Button_of_CustomList() throws InterruptedException {

		Language pojo = new Language();
		pojo.getVerify_Cancel_Button_of_CustomList();
	}

	@Test(priority = 20)
	public void TC_20_Verify_Custom_Columns_RoomLevel() throws InterruptedException {

		Language pojo = new Language();
		pojo.getVerify_Custom_Columns_RoomLevel();
	}

	@Test(priority = 21)
	public void TC_21_Verify_Reset_Columns_Functionality() throws InterruptedException {

		Language pojo = new Language();
		pojo.getVerify_Reset_Columns_Functionality();
	}

	// Custom columns for Search

	@Test(priority = 22)
	public void TC_22_Open_Custom_List_Dialog_And_Verify_Title_Searchcolumn() throws InterruptedException {

		Language pojo = new Language();
		pojo.getOpen_Custom_List_Dialog_And_Verify_Title_Searchcolumn();
	}

	@Test(priority = 23)
	public void TC_23_Verify__Text_of_Custom_List_Dialog_Searchcolumn() throws InterruptedException {

		Language pojo = new Language();
		pojo.getVerify__Text_of_Custom_List_Dialog_Searchcolumn();
	}

	@Test(priority = 24)
	public void TC_24_Verify_Set_Custom_Columns_for_Search() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_Set_Custom_Columns_for_Search();
	}

	@Test(priority = 25)
	public void TC_25_Verify_Reset_Columns_for_Search() throws InterruptedException {

		Language pojo = new Language();
		pojo.getVerify_Reset_Columns_for_Search();
	}

	// Custom column for ToDolist

	@Test(priority = 26)
	public void TC_26_Open_Custom_List_Dialog_And_Verify_Title_ToDoList() throws InterruptedException {

		Language pojo = new Language();
		pojo.getOpen_Custom_List_Dialog_And_Verify_Title_ToDoList();
	}

	@Test(priority = 27)
	public void TC_27_Verify__Text_of_Custom_List_Dialog_ToDoList() throws Exception {

		Language pojo = new Language();
		pojo.getVerify__Text_of_Custom_List_Dialog_ToDoList();
	}

	@Test(priority = 28)
	public void TC_28_Verify_Set_Custom_Columns_for_ToDoList() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_Set_Custom_Columns_for_ToDoList();
	}

	@Test(priority = 29)
	public void TC_29_Reset_Custom_Columns_for_ToDoList() throws InterruptedException {
		Language pojo = new Language();
		pojo.getReset_Custom_Columns_for_ToDoList();
	}

	// Document Context Menu

	@Test(priority = 30)
	public void TC_30_Verify_Refresh_Option() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_Refresh_Option();
	}

	@Test(priority = 31)
	public void TC_31_Verify_Categories_Option() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_Categories_Option();
	}

	@Test(priority = 32)
	public void TC_32_Verify_copy_and_paste_Option() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_copy_and_paste_Option();
	}

	@Test(priority = 33)
	public void TC_33_Verify_cut_and_paste_Option() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_cut_and_paste_Option();
	}

	@Test(priority = 34)
	public void TC_34_Verify_Delete_Option() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_Delete_Option();
	}

	@Test(priority = 35)
	public void TC_35_Verify_CreateFavorites_Document() throws Exception {

		Language pojo = new Language();
		pojo.Verify_CreateFavorites_Documents();
	}

	@Test(priority = 36)
	public void TC_36_Verify_Notification_on_Document() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_Notification_on_Document();
	}

	@Test(priority = 37)
	public void TC_37_Verify_SendTo_Mail() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_SendTo_Mail();
	}

	@Test(priority = 38)
	public void TC_38_Verify_SendTo_Print() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_SendTo_Print();
	}

	@Test(priority = 39)
	public void TC_39_Verify_SendTo_Export() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_SendTo_Export();
	}

	@Test(priority = 40)
	public void TC_40_Verify_SendTo_GenerateDocumentLink() throws Exception {

		Language pojo = new Language();
		pojo.getVerify_SendTo_GenerateDocumentLink();
	}

	@Test(priority = 41)
	public void TC_41_Verify_SendTo_SecureLink() throws Exception {
		Language pojo = new Language();
		pojo.getVerify_SendTo_SecureLink();
	}
}
