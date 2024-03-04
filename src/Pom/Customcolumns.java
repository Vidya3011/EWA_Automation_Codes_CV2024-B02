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
import org.testng.asserts.SoftAssert;

public class Customcolumns extends Generic.BaseClass {

	public static WebElement element = null;

	public Customcolumns() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "CustomList")
	private WebElement CustomColumnOption;

	public WebElement getCustomColumnOption() {
		return CustomColumnOption;
	}

	@FindBy(xpath = "(//ins[@class='jstree-icon'])[41]")
	private WebElement Select_Cabinet;

	@FindBy(xpath = "(//ins[@class='jstree-icon'])[43]")
	private WebElement Select_Drawer;

	@FindBy(xpath = "//li[@id='78168']//a[@href='#']")
	private WebElement Select_Folder;

	@FindBy(id = "todoAll")
	private WebElement Select_All_Item;

	@FindBy(id = "todoResetColumns")
	private WebElement To_Do_Resetcolumn_Option;

	@FindBy(id = "resetColumsOk")
	private WebElement ToDoList_Reset_Column_OK_Button;

	@FindBy(xpath = "//span[@id='spanCheckCustomValues_Text key']")
	private WebElement Select_Indices01;

	@FindBy(xpath = "//span[@id='spanCheckCustomValues_Numeric 123']")
	private WebElement Select_Indices02;

	@FindBy(xpath = "//span[@id='spanCheckCustomValues_Date 123']")
	private WebElement Select_Indices03;

	@FindBy(id = "setCustomListdropdown")
	private WebElement Click_DropdownOption;

	@FindBy(id = "spanCheckCustomValues_Bill Number")
	private WebElement Set_RoomLevel_Indices;

	@FindBy(id = "Resetcolumns")
	private WebElement Reset_Column_option;

	@FindBy(id = "resetColumsOk")
	private WebElement ResetColumn_popup_OK_button;

	@FindBy(id = "imgSettings")
	private WebElement Setting_Icon;

	@FindBy(css = "#myPreferencesSettingsNav > p")
	private WebElement My_Preferencesetting;

	@FindBy(id = "myPreferencesSubmit")
	private WebElement Apply_button;

	@FindBy(id = "culstomcolsearch")
	private WebElement Search_Custom_Columns_option;

	@FindBy(xpath = "//span[@id='spanCheckCustomValues_Document Size']")
	private WebElement Search_Select_Indices01;
	@FindBy(xpath = "//span[@id='spanCheckCustomValues_Current date']")
	private WebElement Search_Select_Indices02;
	@FindBy(xpath = "//span[@id='spanCheckCustomValues_ReportName']")
	private WebElement Search_Select_Indices03;

	@FindBy(xpath = "//a[@id='advSearchMenuBtn']")
	private WebElement Click_Search_Option;

	@FindBy(id = "advFindBtnLabel")
	private WebElement Find_Button;

	@FindBy(id = "Defaultcolsearch")
	private WebElement Click_ResetColumn;

	@FindBy(id = "resetColumsOk")
	private WebElement Ok_Button_ResetColumn;

	@FindBy(id = "todoCustomColumns")
	private WebElement ToDoList_Custom_Columns_option;

	@FindBy(id = "navigationMenuBtn")
	private WebElement MoveTo_Menu_RoomName;

	public static WebElement getElement() {
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
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Menu_RoomName).perform();
		return MoveTo_Menu_RoomName;
	}

	@FindBy(css = "div[id='CustomUserTitle'] h2[class='headerText']")
	private WebElement titelvalidation;

	public WebElement gettitelvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = titelvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return titelvalidation;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/label[1]")
	private WebElement textlvalidation;
	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/div[2]/h2[1]")
	private WebElement textlvalidation2;

	public WebElement getextvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Set custom columns";
		String actualtext = textlvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		String expectedtext2 = "Select the indices you want display for documents";
		String actualtext2 = textlvalidation2.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		return textlvalidation;
	}

	@FindBy(id = "CustomListOK")
	private static WebElement ele;

	public WebElement Ok_Button_CustomList(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
		return ele;
	}

	public static WebElement Scroll_Button(WebDriver driver) {
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).clickAndHold().perform();
		}
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).release().perform();
		}
		return element;
	}

	@FindBy(xpath = "//th[contains(text(),'DATE 123')]")
	private static WebElement DATE;
	@FindBy(xpath = "//th[contains(text(),'NUMERIC 123')]")
	private static WebElement NUMERIC;
	@FindBy(xpath = "//th[contains(text(),'TEXT KEY')]")
	private static WebElement TEXT;

	public WebElement Verify_Indicess_Value(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "DATE 123";
		String actualtext = DATE.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Indices01 value displayed successfully" + DATE.getText());
		Thread.sleep(4000);
		String expectedtext1 = "NUMERIC 123";
		String actualtext1 = NUMERIC.getAttribute("value");
		softassert.assertEquals(actualtext1, expectedtext1, "Text verification failed");
		System.out.println("Indices02 value displayed successfully" + NUMERIC.getText());
		Thread.sleep(4000);
		String expectedtext2 = "TEXT KEY";
		String actualtext2 = TEXT.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		System.out.println("Indices03 value displayed successfully" + TEXT.getText());
		return element;

	}

	@FindBy(xpath = "//*[@id=\"DefaultCustomList\"]")
	private static WebElement Default_Button_CustomList;

	public static WebElement Default_Button_CustomList(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Default_Button_CustomList);
		return Default_Button_CustomList;
	}

	@FindBy(xpath = "//button[@id='CustomListCancel']")
	private static WebElement Cancel_Button_CustomList;

	public static WebElement Cancel_Button_CustomList(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Cancel_Button_CustomList);
		return Cancel_Button_CustomList;
	}

	public WebElement Select_DropdownValue(WebDriver driver) {
		WebElement dropdown = driver.findElement(By.id("setCustomListdropdown"));
		jsclick(dropdown.findElement(By.xpath("//option[. = 'Room level']")));
		return element;
	}

	public WebElement Verify_CompactView_checkbox(WebDriver driver) {
		if (driver.findElement(By.id("displayCompactViewOfList")).isSelected() == true) {
			jsclick(driver.findElement(By.id("displayCompactViewOfList")));
		}
		return element;
	}

	// Search *

	@FindBy(xpath = "//a[@id='advSearchMenuBtn']")
	private WebElement MoveTo_Search_Option;

	public WebElement MoveTo_Search_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_Search_Option).perform();
		return MoveTo_Search_Option;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/div[1]/h2[1]")
	private WebElement Search_titelvalidation;

	public WebElement getSearch_titelvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = Search_titelvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return Search_titelvalidation;
	}

	@FindBy(xpath = "//h2[contains(text(),'Select the indices you want display for documents')]")
	private WebElement Search_textvalidation;

	public WebElement getSearch_textvalidation() {
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Select the indices you want display for documents";
		String actualtext = Search_textvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return Search_textvalidation;
	}

	public static WebElement Search_Scroll_Button(WebDriver driver) {
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).clickAndHold().perform();
		}
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).release().perform();
		}
		return element;
	}

	@FindBy(xpath = "//button[@id='CustomListOK']")
	private static WebElement Search_Ok_Button_CustomList;

	public static WebElement Search_Ok_Button_CustomList(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Search_Ok_Button_CustomList);
		return Search_Ok_Button_CustomList;
	}

	@FindBy(xpath = "//th[contains(text(),'DOCUMENT SIZE')]")
	private static WebElement DocumentSize;
	@FindBy(xpath = "//th[contains(text(),'CURRENT DATE')]")
	private static WebElement Currentdate;
	@FindBy(xpath = "//th[contains(text(),'REPORTNAME')]")
	private static WebElement REPORTNAME;

	public WebElement Search_Verify_Indicess_Value4(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "DOCUMENT SIZE";
		String actualtext = DocumentSize.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Indices value displayed successfully" + DocumentSize.getText());
		return element;
	}

	public WebElement Search_Verify_Indicess_Value5(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "CURRENT DATE";
		String actualtext = Currentdate.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Indices value displayed successfully" + Currentdate.getText());
		return element;
	}

	public WebElement Search_Verify_Indicess_Value6(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "REPORTNAME";
		String actualtext = REPORTNAME.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Indices value displayed successfully" + REPORTNAME.getText());
		return element;
	}

	// ToDoList *

	@FindBy(xpath = "//a[@id='myTaskMenu']")
	private WebElement MoveTo_ToDoList_Option;

	public WebElement MoveTo_ToDoList_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_ToDoList_Option).perform();
		return MoveTo_ToDoList_Option;
	}

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/div[1]/h2[1]")
	private static WebElement titlevalidation;

	public WebElement ToDoList_titelvalidation(WebDriver driver) {

		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = titlevalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return element;

	}

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/div[2]/h2[1]")
	private static WebElement textvalidation;

	public WebElement ToDoList_textvalidation(WebDriver driver) {

		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Select the indices you want display for documents";
		String actualtext = textvalidation.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return element;
	}

	public static WebElement ToDoList_Scroll_Button(WebDriver driver) {
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).clickAndHold().perform();
		}
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).perform();
		}
		{
			WebElement element = driver.findElement(By.id("CustomListDlgUL"));
			Actions builder = new Actions(driver);
			builder.moveToElement(element).release().perform();
		}
		return element;
	}

	@FindBy(xpath = "//*[@id=\"CustomListTodoOK\"]")
	private static WebElement ToDoList_Ok_Button_CustomList;

	public static WebElement ToDoList_Ok_Button_CustomList(WebDriver driver) throws InterruptedException {
		return ToDoList_Ok_Button_CustomList;
	}

	@FindBy(xpath = "//input[@id='folderLocationForSearch']")
	private static WebElement Document_Location;

	public WebElement getDocument_Location(WebDriver driver) throws InterruptedException {
		return Document_Location;

	}

	@FindBy(xpath = "//button[@id='navigatorTreeOk1']")
	private static WebElement Ok_button;

	public WebElement getOk_button() throws InterruptedException {
		return Ok_button;

	}

	@FindBy(xpath = "(//ins[@class='jstree-icon'])[41]")
	private static WebElement CabinetPlus;

	public WebElement getCabinetPlus() throws InterruptedException {
		return CabinetPlus;

	}

	@FindBy(xpath = "(//ins[@class='jstree-icon'])[43]")
	private static WebElement DrawerPlus;

	public WebElement getDrawerPlus(WebDriver driver) throws InterruptedException {
		return DrawerPlus;

	}

	@FindBy(xpath = "(//a[@href='#'])[23]")
	private static WebElement Folder;

	public WebElement getFolder(WebDriver driver) throws InterruptedException {
		return Folder;

	}

	@FindBy(xpath = "//a[@id='documentListSubMenu']")
	private WebElement MoveTo_Menu_Documents;

	public WebElement getMoveTo_Menu_Documents() {
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		return MoveTo_Menu_Documents;
	}

	@FindBy(xpath = "//tbody/tr[1]/td[1]/label[1]/span[1]")
	private static WebElement getSelect_Document;

	public WebElement getSelectDoc(WebDriver driver) throws InterruptedException {
		return getSelect_Document;
	}

	@FindBy(id = "sendtoworkflow")
	private static WebElement sendWorkflow;

	public WebElement getsendWorkflow(WebDriver driver) throws InterruptedException {
		return sendWorkflow;
	}

	@FindBy(css = "#assignedWfTable td")
	private static WebElement WFAssign;

	public WebElement getWFAssign(WebDriver driver) throws InterruptedException {
		return WFAssign;
	}

	@FindBy(id = "copyId")
	private WebElement Copy_ID;
	@FindBy(id = "pasteid")
	private WebElement Paste_ID;

	public WebElement getVerify_CopyandPaste_Document() throws InterruptedException {

		jsclick(Copy_ID);
		Thread.sleep(4000);
		element = MoveTo_Menu_Documents;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(3000);
		jsclick(Paste_ID);
		return Paste_ID;
	}

	@FindBy(xpath = "//img[@src='images/newRe.png']")
	private WebElement Refreshbutton;

	public WebElement getRefreshbutton() {
		return Refreshbutton;

	}

//  Datadriven CustomColumns
	public static String CustomColumns_excelRead(int rowNo, int cellNo) throws Exception {
		File src = new File("./data/TestData.xlsx");
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet s = wb.getSheet("Custom Columns");
		XSSFRow row = s.getRow(rowNo);
		XSSFCell cll = row.getCell(cellNo);
		String cellType = cll.getStringCellValue();
		return cellType;
	}

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBox;

	public WebElement getSearchBoxIndices1() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(1, 0));
		return SearchBox;
	}

	public WebElement getSearchBoxIndices2() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(2, 0));
		return SearchBox;
	}

	public WebElement getSearchBoxIndices3() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(3, 0));
		return SearchBox;
	}

	@FindBy(xpath = "//*[@id=\"customListModelClose\"]")
	private WebElement Crosscancel;

	public WebElement getCrosscancel() throws Exception {
		return Crosscancel;
	}

	public WebElement getSearchBoxIndices4() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(4, 0));
		return SearchBox;
	}

	public WebElement getSearchBoxIndices5() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(5, 0));
		return SearchBox;
	}

	public WebElement getSearchBoxIndices6() throws Exception {
		SearchBox.sendKeys(CustomColumns_excelRead(6, 0));
		return SearchBox;
	}

	@FindBy(xpath = "//*[@id=\"spanCheckCustomValuesTodolist_Workflow Status\"]")
	private WebElement ToDoList_Select_Indices01;

	public WebElement getToDoList_Select_Indices01() {
		return ToDoList_Select_Indices01;
	}

	@FindBy(xpath = "//*[@id=\"searchInput\"]")
	private WebElement SearchBoxTODO;

	public WebElement getSearchBoxIndices7() throws Exception {
		jsclick(SearchBoxTODO);
		SearchBoxTODO.sendKeys(CustomColumns_excelRead(7, 0));
		return SearchBoxTODO;
	}

	@FindBy(xpath = "//th[contains(text(),'WORKFLOW STATUS')]")
	private static WebElement WORKFLOWSTATUS;

	public WebElement ToDoList_Verify_Indicess_Value(WebDriver driver) throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		Thread.sleep(4000);
		String expectedtext2 = "WORKFLOW STATUS";
		String actualtext2 = WORKFLOWSTATUS.getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		System.out.println("Indices value displayed successfully" + WORKFLOWSTATUS.getText());
		return element;
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
}
