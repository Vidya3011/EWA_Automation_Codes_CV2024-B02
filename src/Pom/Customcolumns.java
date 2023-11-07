package Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import Generic.BaseClass;

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

	@FindBy(xpath = ("(//a[text()='CVApp Test'])[1]"))
	private WebElement Select_Cabinet;

	@FindBy(xpath = ("//a[text()='CVMobile App 2022']"))
	private WebElement Select_Drawer;

	@FindBy(xpath = ("//a[text()='Test apk']"))
	private WebElement Select_Folder;

	@FindBy(id = "todoAll")
	private WebElement Select_All_Item;

	@FindBy(id = "todoResetColumns")
	private WebElement To_Do_Resetcolumn_Option;

	@FindBy(id = "resetColumsOk")
	private WebElement ToDoList_Reset_Column_OK_Button;

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/ul[1]/li[75]/span[2]")
	private WebElement Select_Indices01;

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/ul[1]/li[230]/span[2]")
	private WebElement Select_Indices02;

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/ul[1]/li[299]/span[2]")
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

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/ul[1]/li[82]/span[2]")
	private WebElement Search_Select_Indices01;

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

	@FindBy(xpath = "/html[1]/body[1]/div[33]/div[1]/ul[1]/li[317]/span[2]")
	private WebElement ToDoList_Select_Indices;

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

	public WebElement getToDoList_Select_Indices() {
		return ToDoList_Select_Indices;
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

	public WebElement Verify_Indicess_Value(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "DATE";
		String actualtext = driver.findElement(By.xpath("//th[contains(text(),'DATE')]")).getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Indices01 value displayed successfully");
		Thread.sleep(4000);
		String expectedtext1 = "NUMERIC 123";
		String actualtext1 = driver.findElement(By.xpath("//th[contains(text(),'NUMERIC 123')]")).getAttribute("value");
		softassert.assertEquals(actualtext1, expectedtext1, "Text verification failed");
		System.out.println("Indices02 value displayed successfully");
		Thread.sleep(4000);
		String expectedtext2 = "TEXT";
		String actualtext2 = driver.findElement(By.xpath("//th[contains(text(),'TEXT')]")).getAttribute("value");
		softassert.assertEquals(actualtext2, expectedtext2, "Text verification failed");
		System.out.println("Indices03 value displayed successfully");

		return element;

	}

	@FindBy(id = "DefaultCustomList")
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

	@FindBy(xpath = "//button[@id='CustomListCancel']")
	private static WebElement Search_Ok_Button_CustomList;

	public static WebElement Search_Ok_Button_CustomList(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", Search_Ok_Button_CustomList);
		return Search_Ok_Button_CustomList;
	}

	public WebElement Search_Verify_Indicess_Value(WebDriver driver) throws InterruptedException {

		Thread.sleep(4000);
		SoftAssert softassert = new SoftAssert();
		String expectedtext = "DATE";
		String actualtext = driver.findElement(By.xpath("//th[contains(text(),'DATE')]")).getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Indices01 value displayed successfully");
		return element;
	}

	// ToDoList *

	@FindBy(xpath = "//a[@id='myTaskMenu']")
	private WebElement MoveTo_ToDoList_Option;

	public WebElement MoveTo_ToDoList_Option() {
		Actions action = new Actions(driver);
		action.moveToElement(MoveTo_ToDoList_Option).perform();
		return MoveTo_Search_Option;
	}

	public WebElement ToDoList_titelvalidation(WebDriver driver) {

		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Custom List";
		String actualtext = driver.findElement(By.xpath("/html[1]/body[1]/div[33]/div[1]/div[1]/h2[1]"))
				.getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		return element;
	}

	public WebElement ToDoList_textvalidation(WebDriver driver) {

		SoftAssert softassert = new SoftAssert();
		String expectedtext = "Select the indices you want display for documents";
		String actualtext = driver.findElement(By.xpath("/html[1]/body[1]/div[33]/div[1]/div[2]/h2[1]"))
				.getAttribute("value");
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

	@FindBy(id = "CustomListTodoOK")
	private static WebElement ToDoList_Ok_Button_CustomList;

	public static WebElement ToDoList_Ok_Button_CustomList(WebDriver driver) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ToDoList_Ok_Button_CustomList);
		return ToDoList_Ok_Button_CustomList;
	}

	public WebElement ToDoList_Verify_Indicess_Value(WebDriver driver) throws InterruptedException {

		SoftAssert softassert = new SoftAssert();
		String expectedtext = "TEXT";
		String actualtext = driver.findElement(By.xpath("//th[contains(text(),'TEXT')]")).getAttribute("value");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");
		System.out.println("Indices01 value displayed successfully");
		return element;
	}
}
