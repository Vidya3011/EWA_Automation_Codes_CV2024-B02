package Pom;

//Dipak Automation Coading

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Generic.BaseClass;

public class Login extends BaseClass {

	public static WebElement element = null;
	private static final boolean False = false;

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

	SoftAssert softAssert = new SoftAssert();

	public static void loginwithoutUsername() throws Exception {
		Reporter.log("Do not entered username into username field", true);
		Thread.sleep(2000);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
		Thread.sleep(1000);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2));
		Reporter.log("Select a Room", true);
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
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2)); // Here You can change Room name from Data driven Excel as per Room
		Reporter.log("Select a Room", true);
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

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		Thread.sleep(1000);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 1));
		Reporter.log("Enter valid Password into Password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByIndex(0); // Here room is not selected
		Reporter.log("Select Please select a room Option", true);
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
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		;
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2)); // Here You can change Room name from Data driven Excel as per Room
													// selection Required
		Reporter.log("Select a Room", true);
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

	public void InvalidPassword() throws Exception {

		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(ExcelLogin(1, 0));
		Reporter.log("Enter valid Username into Username field", true);
		driver.findElement(By.id("loginPassword")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("loginPassword")).sendKeys(ExcelLogin(1, 2));
		Reporter.log("Enter Invalid Password into Password field", true);
		WebElement room = driver.findElement(By.xpath("//select[@id='rooms']"));
		Select sel = new Select(room);
		sel.selectByVisibleText(ExcelLogin(1, 2)); // Here You can change Room name from Data driven Excel as per Room
		Reporter.log("Select a Room", true);
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
			WebElement sessionmsg = driver.findElement(By.xpath("//*[@id=\"cvModelLoginValidationMessage\"]"));
			WebElement sessionmsgNO = driver.findElement(By.xpath("//*[@id=\"cvModelLoginValidationCancel\"]"));
			Reporter.log(sessionmsg.getText() + "this message is displayed", true);
			sessionmsgNO.click();
			Thread.sleep(2000);
			Reporter.log("Click on the No button", true);

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
		Reporter.log(error.getText() + " validation message should show", true);

	}

	// Login Validation

	public void Verifying_Login_EWA_with_blank_Username() throws Exception {

		Login pojo = new Login();

		Reporter.log("Test Scenario 2 : Verifying Login EWA with blank username ", true);
		Login.loginwithoutUsername();
		Thread.sleep(2000);
		pojo.getUsernameerror();
	}

	public void Verifying_Login_EWA_with_blank_Password() throws Exception {

		Login pojo = new Login();

		Reporter.log("Test Scenario 3 : Verifying Login EWA with blank password", true);
		Thread.sleep(2000);
		Login.loginwithoutPassword();
		Thread.sleep(2000);
		pojo.getPassworderror();
	}

	public void Verifying_Login_EWA_without_Selecting_Roomname() throws Exception {

		Login pojo = new Login();

		Reporter.log("Test Scenario 4 : Verifying Login EWA without selecting roomname ", true);
		Thread.sleep(2000);
		pojo.loginwithoutRoomname();
		Thread.sleep(2000);
		pojo.getRoomerror();
	}

	public void Verifying_Login_EWA_with_Invalid_Username() throws Exception {

		Login pojo = new Login();

		Reporter.log("Test Scenario 5 : Verifying Login EWA with invalid username ", true);
		Thread.sleep(2000);
		pojo.InvalidUsername();
		Thread.sleep(4000);
		pojo.getUsernotexist();
		Thread.sleep(2000);
	}

	public void Verifying_Login_EWA_with_Invalid_Password() throws Exception {

		Login pojo = new Login();
		Reporter.log("Test Scenario 6 : Verifying Login EWA with invalid password ", true);
		Thread.sleep(2000);
		pojo.InvalidPassword();
		Thread.sleep(4000);
	}

	public void Verifying_No_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Reporter.log("Test Scenario 1 : Verifying No button of Session for user is already active dialog box ", true);
		Already_Logged_User();
		Thread.sleep(2000);
		Reporter.log("Verified No button of Session for user is already active dialog box ", true);

	}

	public void Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Reporter.log("Test Scenario 7 : Verifying Yes button of Session for user is already active dialog box ", true);
		Thread.sleep(2000);
		LogDipakUser();
		Thread.sleep(2000);
		Reporter.log("Verified Yes button of Session for user is already active dialog box ", true);
		Refresh_Button();
		Thread.sleep(4000);
	}
}