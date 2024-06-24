package Pom;
//Dipak Automation script

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Customcolumns extends Generic.BaseClass {

	private static WebElement element = null;

	public Customcolumns() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"CustomList\"]")
	private WebElement CustomColumnOption;

	public WebElement getCustomColumnOption() {
		return CustomColumnOption;
	}

	// Select From Document Navigator

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[20]/a[1]")
	private WebElement Select_Cabinet;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[20]/ul[1]/li[1]/a[1]")
	private WebElement Select_Drawer;

	@FindBy(xpath = ".//div[@id='viewDocumentnavigator']/ul[1]/li[20]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
	private WebElement Select_Folder;

	// Select from Destination folder Location

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[21]/a[1]"))
	private WebElement Select_Cabinet1;

	public WebElement getSelect_Cabinet1() {
		return Select_Cabinet1;

	}

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[21]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer1;

	public WebElement getSelect_Drawer1() {
		return Select_Drawer1;

	}

	@FindBy(xpath = (".//div[@id='navigatorModel']/div[2]/div[1]/div[1]/ul[1]/li[21]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder1;

	public WebElement getSelect_Folder1() {
		return Select_Folder1;

	}

	@FindBy(xpath = "//*[@id=\"todoAll\"]")
	private WebElement Select_All_Item;

	@FindBy(xpath = "//*[@id=\"todoResetColumns\"]")
	private WebElement To_Do_Resetcolumn_Option;

	@FindBy(xpath = "//*[@id=\"resetColumsOk\"]")
	private WebElement ToDoList_Reset_Column_OK_Button;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Text key\"]")
	private WebElement Select_Indices01;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Numeric 123\"]")
	private WebElement Select_Indices02;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Date 123\"]")
	private WebElement Select_Indices03;

	@FindBy(xpath = "//*[@id=\"setCustomListdropdown\"]")
	private WebElement Click_DropdownOption;

	@FindBy(xpath = "//*[@id=\"roomLevel\"]")
	private WebElement Set_RoomLevel_Indices;

	@FindBy(xpath = "//*[@id=\"Resetcolumns\"]")
	private WebElement Reset_Column_option;

	@FindBy(xpath = "//*[@id=\"resetColumsOk\"]")
	private WebElement ResetColumn_popup_OK_button;

	@FindBy(xpath = "//*[@id=\"imgSettings\"]")
	private WebElement Setting_Icon;

	@FindBy(xpath = "//*[@id=\"myPreferencesSettingsNav\"]")
	private WebElement My_Preferencesetting;

	@FindBy(xpath = "//*[@id=\"myPreferencesSubmit\"]")
	private WebElement Apply_button;

	@FindBy(xpath = "//*[@id=\"culstomcolsearch\"]")
	private WebElement Search_Custom_Columns_option;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Document Size\"]")
	private WebElement Search_Select_Indices01;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_Student Name\"]")
	private WebElement Search_Select_Indices02;

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValues_ReportName\"]")
	private WebElement Search_Select_Indices03;

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement Click_Search_Option;

	@FindBy(xpath = "//*[@id=\"advFindBtnLabel\"]")
	private WebElement Find_Button;

	@FindBy(xpath = "//*[@id=\"Defaultcolsearch\"]")
	private WebElement Click_ResetColumn;

	@FindBy(xpath = "//*[@id=\"resetColumsOk\"]")
	private WebElement Ok_Button_ResetColumn;

	@FindBy(xpath = "//*[@id=\"todoCustomColumns\"]")
	private WebElement ToDoList_Custom_Columns_option;

	@FindBy(xpath = "//*[@id=\"navigationMenuBtn\"]")
	private WebElement MoveTo_Menu_RoomName;

	public WebElement getElement() {
		return element;
	}

	public WebElement getSelect_Cabinet() {
		return Select_Cabinet;
	}

	public WebElement getSelect_Drawer() {
		return Select_Drawer;
	}

	public WebElement getSelect_Folder() {
		return Select_Folder;
	}

	public WebElement getSelect_All_Item() {
		return Select_All_Item;
	}

	public WebElement getTo_Do_Resetcolumn_Option() {
		return To_Do_Resetcolumn_Option;
	}

	public WebElement getToDoList_Reset_Column_OK_Button() {
		return ToDoList_Reset_Column_OK_Button;
	}

	public WebElement getSelect_Indices01() {
		return Select_Indices01;
	}

	public WebElement getSelect_Indices02() {
		return Select_Indices02;
	}

	public WebElement getSelect_Indices03() {
		return Select_Indices03;
	}

	public WebElement getClick_DropdownOption() {
		return Click_DropdownOption;
	}

	public WebElement getSet_RoomLevel_Indices() {
		return Set_RoomLevel_Indices;
	}

	public WebElement getReset_Column_option() {
		return Reset_Column_option;
	}

	public WebElement getResetColumn_popup_OK_button() {
		return ResetColumn_popup_OK_button;
	}

	public WebElement getSetting_Icon() {
		return Setting_Icon;
	}

	public WebElement getMy_Preferencesetting() {
		return My_Preferencesetting;
	}

	public WebElement getApply_button() {
		return Apply_button;
	}

	public WebElement getSearch_Custom_Columns_option() {
		return Search_Custom_Columns_option;
	}

	public WebElement getSearch_Select_Indices01() {
		return Search_Select_Indices01;
	}

	public WebElement getSearch_Select_Indices02() {
		return Search_Select_Indices02;
	}

	public WebElement getSearch_Select_Indices03() {
		return Search_Select_Indices03;
	}

	public WebElement getClick_Search_Option() {
		return Click_Search_Option;
	}

	public WebElement getFind_Button() {
		return Find_Button;
	}

	public WebElement getClick_ResetColumn() {
		return Click_ResetColumn;
	}

	public WebElement getOk_Button_ResetColumn() {
		return Ok_Button_ResetColumn;
	}

	public WebElement getToDoList_Custom_Columns_option() {
		return ToDoList_Custom_Columns_option;
	}

	public WebElement getTitelvalidation() {
		return titelvalidation;
	}

	public WebElement getTextlvalidation() {
		return textlvalidation;
	}

	public WebElement getTextlvalidation2() {
		return textlvalidation2;
	}

	public static WebElement getEle() {
		return ele;
	}

	public WebElement getDefault_Button_CustomList() {
		return Default_Button_CustomList;
	}

	public WebElement getCancel_Button_CustomList() {
		return Cancel_Button_CustomList;
	}

	public WebElement getMoveTo_Search_Option() {
		return MoveTo_Search_Option;
	}

	public WebElement getSearch_Ok_Button_CustomList() {
		return Search_Ok_Button_CustomList;
	}

	public WebElement getMoveTo_ToDoList_Option() {
		return MoveTo_ToDoList_Option;
	}

	public static WebElement getToDoList_Ok_Button_CustomList() {
		return ToDoList_Ok_Button_CustomList;
	}

	public WebElement getMoveTo_Menu_RoomName() {
		return MoveTo_Menu_RoomName;
	}

	@FindBy(xpath = "//*[@id=\"CustomUserTitle\"]/h2")
	private WebElement titelvalidation;

	public void gettitelvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = titelvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"setCustomListlabel\"]")
	private WebElement textlvalidation;
	@FindBy(xpath = "//*[@id=\"tittleofcustom\"]/h2")
	private WebElement textlvalidation2;

	public void getextvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Set custom columns :";
		String actualtext = textlvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		String expectedtext2 = "Select the indices you want display for documents";
		String actualtext2 = textlvalidation2.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement ele;

	public WebElement Ok_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	@FindBy(xpath = "//th[contains(text(),'DATE 123')]")
	private static WebElement DATE;
	@FindBy(xpath = "//th[contains(text(),'NUMERIC 123')]")
	private static WebElement NUMERIC;
	@FindBy(xpath = "//th[contains(text(),'TEXT KEY')]")
	private static WebElement TEXT;

	public void Verify_Indicess_Value() throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "DATE 123";
		String actualtext = DATE.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log("Indices01 value displayed successfully" + DATE.getText(), true);
		Thread.sleep(4000);
		String expectedtext1 = "NUMERIC 123";
		String actualtext1 = NUMERIC.getAttribute("value");
		softassert.assertEquals(actualtext1, expectedtext1, "Text verification failed");
		Reporter.log("Indices02 value displayed successfully" + NUMERIC.getText(), true);
		Thread.sleep(4000);
		String expectedtext2 = "TEXT KEY";
		String actualtext2 = TEXT.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		Reporter.log("Indices03 value displayed successfully" + TEXT.getText(), true);

	}

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement Default_Button_CustomList;

	public static void Default_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Default_Button_CustomList);

	}

	@FindBy(xpath = "//*[@id=\"CustomListCancel\"]")
	private static WebElement Cancel_Button_CustomList;

	public static void Cancel_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Cancel_Button_CustomList);

	}

	public WebElement Select_DropdownValue() {
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"setCustomListdropdown\"]"));
		jsclick(dropdown.findElement(By.xpath("//*[@id=\"roomLevel\"]")));
		return element;
	}

	public void Verify_CompactView_checkbox() {
		if (driver.findElement(By.xpath("//*[@id=\"displayCompactViewOfList\"]")).isSelected() == true) {
			jsclick(driver.findElement(By.xpath("//*[@id=\"displayCompactViewOfList\"]")));
		}

	}

	// Search *

	@FindBy(xpath = "//*[@id=\"advSearchMenuBtn\"]")
	private WebElement MoveTo_Search_Option;

	public WebElement MoveTo_Search_Option() {
		return MoveTo_Search_Option;

	}

	@FindBy(xpath = "//*[@id=\"CustomUserTitle\"]/h2")
	private WebElement Search_titelvalidation;

	public void getSearch_titelvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = Search_titelvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"tittleofcustom\"]/h2")
	private WebElement Search_textvalidation;

	public void getSearch_textvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Select the indices you want display for documents";
		String actualtext = Search_textvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"CustomListOK\"]")
	private static WebElement Search_Ok_Button_CustomList;

	public static void Search_Ok_Button_CustomList() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Search_Ok_Button_CustomList);

	}

	@FindBy(xpath = "//th[contains(text(),'DOCUMENT SIZE')]")
	private static WebElement DocumentSize;
	@FindBy(xpath = "//th[contains(text(),'STUDENT NAME')]")
	private static WebElement STUDENTNAME;
	@FindBy(xpath = "//th[contains(text(),'REPORTNAME')]")
	private static WebElement REPORTNAME;

	public void Search_Verify_Indicess_Value4() throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "DOCUMENT SIZE";
		String actualtext = DocumentSize.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log("Indices value displayed successfully" + DocumentSize.getText(), true);

	}

	public void Search_Verify_Indicess_Value5() throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "STUDENT NAME";
		String actualtext = STUDENTNAME.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log("Indices value displayed successfully" + STUDENTNAME.getText(), true);

	}

	public void Search_Verify_Indicess_Value6() throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "REPORTNAME";
		String actualtext = REPORTNAME.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		Reporter.log("Indices value displayed successfully" + REPORTNAME.getText(), true);

	}

	// ToDoList *

	@FindBy(xpath = "//*[@id=\"myTaskMenu\"]")
	private WebElement MoveTo_ToDoList_Option;

	public WebElement MoveTo_ToDoList_Option() {
		return MoveTo_ToDoList_Option;

	}

	@FindBy(xpath = "//*[@id=\"CustomUserTitleToDoList\"]/h2")
	private static WebElement titlevalidation;

	public void ToDoList_titelvalidation() {

		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = titlevalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}

	@FindBy(xpath = "//*[@id=\"tittleoftodoListcustom\"]/h2")
	private static WebElement textvalidation;

	public void ToDoList_textvalidation() {

		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Select the indices you want display for documents";
		String actualtext = textvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

	}



	@FindBy(xpath = "//*[@id=\"CustomListTodoOK\"]")
	private static WebElement ToDoList_Ok_Button_CustomList;

	public WebElement ToDoList_Ok_Button_CustomList() throws InterruptedException {
		return ToDoList_Ok_Button_CustomList;
	}

	@FindBy(xpath = "//*[@id=\"folderLocationForSearch\"]")
	private static WebElement Document_Location;

	public WebElement getDocument_Location() throws InterruptedException {
		return Document_Location;

	}

	@FindBy(xpath = "//*[@id=\"navigatorTreeOk1\"]")
	private static WebElement Ok_button;

	public WebElement getOk_button() throws InterruptedException {
		return Ok_button;

	}

	@FindBy(xpath = "//*[@id=\"documentListSubMenu\"]")
	private WebElement MoveTo_Menu_Documents;

	public void getMoveTo_Menu_Documents() {
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}

	@FindBy(xpath = "//*[@id=\"copyId\"]")
	private WebElement Copy_ID;
	@FindBy(xpath = "//*[@id=\"pasteid\"]")
	private WebElement Paste_ID;

	public void getVerify_CopyandPaste_Document() throws InterruptedException {

		jsclick(Copy_ID);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		jsclick(Paste_ID);

	}

//  Datadriven CustomColumns
	public static String CustomColumns_excelRead(int rowNo, int cellNo) throws Exception {
		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		try (XSSFWorkbook wb = new XSSFWorkbook(fis)) {
			XSSFSheet s = wb.getSheet("Custom Columns");
			XSSFRow row = s.getRow(rowNo);
			XSSFCell cll = row.getCell(cellNo);
			String cellType = cll.getStringCellValue();
			return cellType;
		}
	}

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBox;

	public WebElement getSearchBoxIndices1() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(1, 0));
		return SearchBox;
	}

	public void getSearchBoxIndices2() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(2, 0));

	}

	public void getSearchBoxIndices3() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(3, 0));

	}

	@FindBy(xpath = "//*[@id=\"customListModelClose\"]")
	private WebElement Crosscancel;

	public WebElement getCrosscancel() throws Exception {
		return Crosscancel;
	}

	public void getSearchBoxIndices4() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(4, 0));

	}

	public void getSearchBoxIndices5() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(5, 0));

	}

	public void getSearchBoxIndices6() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(6, 0));

	}

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBoxTODO;

	public void getSearchBoxIndices7() throws Exception {
		jsclick(SearchBoxTODO);
		SearchBoxTODO.sendKeys(CustomColumns_excelRead(7, 0));

	}

	@FindBy(xpath = "//th[contains(text(),'DATE 123')]")
	private static WebElement DATE123;

	public void ToDoList_Verify_Indicess_Value() throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "DATE 123";
		String actualtext2 = DATE123.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		Reporter.log("Indices value displayed successfully" + DATE123.getText(), true);

	}

	@FindBy(xpath = "//*[@id=\"CustomListCancel\"]")
	private WebElement cancelbutton;

	public WebElement getcancelbutton() throws Exception {
		return cancelbutton;
	}

	@FindBy(xpath = "//*[@id=\"CustomListTodoCancel\"]")
	private WebElement cancelTODObutton;

	public WebElement getcancelTODObutton() throws Exception {
		return cancelTODObutton;
	}

	@FindBy(xpath = "//*[@id=\"customTodoListModelClose\"]")
	private WebElement CrosscancelTODObutton;

	public WebElement getCrosscancelTODObutton() throws Exception {
		return CrosscancelTODObutton;
	}

	// Select from Search Document Location

	@FindBy(xpath = (".//div[@id='navigatorModel1']/div[2]/div[1]/div[1]/ul[1]/li[20]/a[1]"))
	private WebElement Select_Cabinet2;

	public WebElement getSelect_Cabinet2() {
		return Select_Cabinet2;

	}

	@FindBy(xpath = (".//div[@id='navigatorModel1']/div[2]/div[1]/div[1]/ul[1]/li[20]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Drawer2;

	public WebElement getSelect_Drawer2() {
		return Select_Drawer2;

	}

	@FindBy(xpath = (".//div[@id='navigatorModel1']/div[2]/div[1]/div[1]/ul[1]/li[20]/ul[1]/li[1]/ul[1]/li[1]/a[1]"))
	private WebElement Select_Folder2;

	public WebElement getSelect_Folder2() {
		return Select_Folder2;

	}

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement TODOSearchBox;

	public void getTODOSearchBox() throws Exception {
		TODOSearchBox.sendKeys(CustomColumns_excelRead(3, 0));

	}

	@FindBy(xpath = ("//*[@id=\"spanCheckCustomValuesTodolist_Date 123\"]"))
	private WebElement Select_ToDoIndices;

	public WebElement getSelect_ToDoIndices() {
		return Select_ToDoIndices;

	}

	@FindBy(xpath = "//*[@id=\"newItems\"]")
	private WebElement ToDoNew_Item;

	public WebElement getToDoNew_Item() {
		return ToDoNew_Item;

	}

	@FindBy(xpath = "//*[@id=\"todoPending\"]")
	private WebElement ToDo_Pending;

	public WebElement getToDo_Pending() {
		return ToDo_Pending;

	}

	@FindBy(xpath = "//*[@id=\"todoReviewed\"]")
	private WebElement ToDoReviewed;

	public WebElement getToDoReviewed() {
		return ToDoReviewed;

	}

	@FindBy(xpath = "//*[@id=\"todoSentItems\"]")
	private WebElement ToDoSentItem;

	public WebElement getToDoSentItem() {
		return ToDoSentItem;

	}

	@FindBy(xpath = "//*[@id=\"todoListTable\"]/tbody/tr[1]/td[2]")
	private WebElement Open_ToDoDocument;

	public WebElement getOpen_ToDoDocument() {
		return Open_ToDoDocument;
	}

	@FindBy(xpath = "//*[@id=\"wfcomments\"]")
	private WebElement WfComment;
	@FindBy(xpath = "//*[@id=\"endwf\"]")
	private WebElement EndWorkflow;
	@FindBy(xpath = "//*[@id=\"wfactionOk\"]")
	private WebElement okbutton;

	public void getToDoEndWorkflow() throws Exception {

		Thread.sleep(3000);
		jsclick(EndWorkflow);
		Thread.sleep(4000);
		jsclick(WfComment);
		Thread.sleep(3000);
		WfComment.sendKeys(CustomColumns_excelRead(8, 0));
		Thread.sleep(5000);
		jsclick(okbutton);

	}

	@FindBy(xpath = "//*[@id=\"homeMenuBtn\"]")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;

	}
}
