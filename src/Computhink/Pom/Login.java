package Computhink.Pom;

//Dipak Automation Coading

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import Computhink.Generic.BaseClass;

public class Login extends BaseClass {

	//public static WebElement element = null;
	//private static final boolean False = false;

	public Login() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\"logedinusername\"]")
	private WebElement Username;

	@FindBy(xpath = "//*[@id=\"idSidenav\"]/ul/li[1]/a")
	private WebElement Logout;

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[1]/div[1]/div[2]/i")
	private WebElement Usernameerror;

	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[1]/div[2]/div[2]")
	private WebElement Passworderror;

	@FindBy(xpath = "//*[@id=\"loginError\"]")
	private WebElement error;
	
	@FindBy(xpath = "//*[@id=\"userName\"]")
	private WebElement UsernameTextbox;
	
	@FindBy(xpath = "//*[@id=\"loginPassword\"]")
	private WebElement PasswordTextbox;
	
	
	SoftAssert softAssert = new SoftAssert(); // Initialize SoftAssert to capture all assertions
	

	public static void loginwithoutUsername() throws Exception {
		
		Reporter.log("Do not entered username into username field", true);
		Thread.sleep(2000);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
		Thread.sleep(1000);
		RoomSelectionCVS();
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(1000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public static void loginwithoutPassword() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		driver.findElement(By.id("loginPassword")).clear();
		Thread.sleep(1000);
		Reporter.log("Do not entered password into password field", true);
		Thread.sleep(1000);
		RoomSelectionCVS();
		Thread.sleep(1000);
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(1000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void loginwithoutRoomname() throws Exception {

		SoftAssert as = new SoftAssert();
		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		Thread.sleep(1000);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		as.assertTrue(room.isDisplayed(), "Room selection dropdown is not displayed.");
		Select sel = new Select(room);
		sel.selectByIndex(0);
		Reporter.log("Not select Room", true);
		Thread.sleep(1000);
		// Validate that the room has been selected correctly
		String selectedRoom = sel.getFirstSelectedOption().getText();
		Reporter.log("Selected Room name: " + selectedRoom, true);
		as.assertEquals(selectedRoom, "Room selection is not correct."); // Assuming "Room 3" is the option
		Thread.sleep(1000);
		
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(1000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void InvalidUsername() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 2));
		Reporter.log("Enter Invalid Username into Username field", true);
		driver.findElement(By.id("loginPassword")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
		Thread.sleep(2000);
		RoomSelectionCVS();	
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(1000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void InvalidPassword() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		driver.findElement(By.id("loginPassword")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(2, 1));
		Reporter.log("Enter Invalid Password into Password field", true);
		Thread.sleep(2000);
		RoomSelectionCVS();
		try {
			Thread.sleep(2000);
			WebElement Captch = driver.findElement(By.xpath("//*[@id=\"image\"]"));
			WebElement enterCaptch = driver.findElement(By.xpath("//*[@id=\"captchaInput\"]"));
			enterCaptch.sendKeys(Captch.getText());
			Reporter.log("Enter a valid captch under textbox", true);
		} catch (Exception e) {
			// captch is not displayed
		}
		driver.findElement(By.id("submitid")).click();
		Reporter.log("Click on the Login button", true);
		Thread.sleep(2000);
	
		try {
			WebElement sessionmsg = driver.findElement(By.xpath("//*[@id=\"cvModelLoginValidationMessage\"]"));
			WebElement sessiomsgOK = driver.findElement(By.id("cvModelLoginValidationOk"));
			Reporter.log(sessionmsg.getText() + "this message is displayed", true);
			sessiomsgOK.click();
			Thread.sleep(1000);
			Reporter.log("Click on the Yes button", true);

		} catch (Exception e1) {
			// Session message is not displayed
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}
	}

	public void getUsernameerror() {

		String expectedtext = "Please enter username";
		String actualtext = Usernameerror.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		Reporter.log(Usernameerror.getText() + " validation message should show", true);

	}

	public void getPassworderror() {

		String expectedtext = "Please enter password";
		String actualtext = Passworderror.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		Reporter.log(Passworderror.getText() + " validation message should show", true);

	}

	public void getRoomerror() {

		String expectedtext = "Select a room";
		String actualtext = error.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		Reporter.log(error.getText() + " validation message should show when none of above room selected for Login",
				true);

	}

	public void getUsernotexist() {

		String expectedtext = "The username or password was incorrect";
		String actualtext = error.getText();
		softAssert.assertEquals(actualtext, expectedtext);
		Reporter.log(error.getText() + " this validation message should show", true);

	}

	// Login Validation

	public void Verifying_Login_EWA_with_blank_Username() throws Exception {

		Login pojo = new Login();

		Reporter.log("Test Scenario 2 : Verifying Login EWA with blank username ", true);
		Login.loginwithoutUsername();
		pojo.getUsernameerror();
	}

	public void Verifying_Login_EWA_with_blank_Password() throws Exception {

		Login pojo = new Login();

		Reporter.log("Test Scenario 3 : Verifying Login EWA with blank password", true);
		Thread.sleep(2000);
		Login.loginwithoutPassword();
		pojo.getPassworderror();
	}

	public void Verifying_Login_EWA_without_Selecting_Roomname() throws Exception {

		Login pojo = new Login();

		Reporter.log("Test Scenario 4 : Verifying Login EWA without selecting roomname ", true);
		Thread.sleep(2000);
		pojo.loginwithoutRoomname();
		pojo.getRoomerror();
	}

	public void Verifying_Login_EWA_with_Invalid_Username() throws Exception {

		Login pojo = new Login();

		Reporter.log("Test Scenario 5 : Verifying Login EWA with invalid username ", true);
		Thread.sleep(2000);
		pojo.InvalidUsername();
		pojo.getUsernotexist();
		Thread.sleep(2000);
	}

	public void Verifying_Login_EWA_with_Invalid_Password() throws Exception {

		Login pojo = new Login();
		Reporter.log("Test Scenario 6 : Verifying Login EWA with invalid password ", true);
		Thread.sleep(2000);
		pojo.InvalidPassword();
		pojo.getUsernotexist();
		
	}

	public void Verifying_No_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying No button of Session for user is already active dialog box ", true);
		Already_Logged_User();
		Thread.sleep(3000);
		Reporter.log("Verified No button of Session for user is already active dialog box ", true);

	}

	public void Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Reporter.log("Test Scenario 7 : Verifying Yes button of Session for user is already active dialog box ", true);
		loadBrowser("Chrome");
		launchUrl();
		Thread.sleep(1000);
		LogDipakUser();
		Reporter.log("Verified Yes button of Session for user is already active dialog box ", true);
		
	}
	
}