package Pom;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public class LoginPage {

	// Vidya
	@FindBy(xpath = ("//input[@id='userName']"))
	private WebElement userNameTextBox;

	// @FindBy(id="userName")
	// private WebElement passwordTextBox;

//	@FindBy(id = "password")
	@FindBy(xpath = ("//input[@id='loginPassword']"))
	private WebElement passwordTextBox;

	//@FindBy(xpath = ("//select[@id='rooms']"))
	@FindBy(xpath = ("//*[@id='rooms']"))
	private WebElement SelectRoomsDropdown;

	@FindBy(id = "submitid")
	private WebElement LoginBTN;

	@FindBy(xpath = "//span[@id='loginError']")
	private WebElement errMsg;

	@FindBy(xpath="//div[@id='image']")
	 private WebElement enterCaptcha;

	 @FindBy(xpath="///input[@id='captchaInput']")
	 private WebElement Captcha;
	 
	 @FindBy(xpath="//*[@id='check1']")
	//@FindBy(xpath = "//strong[contains(text(),'Remember me')]")
	private WebElement RememberMeCheck;

	@FindBy(id = "cvModelLoginValidationMessage")
	private WebElement SessionMessage;

	@FindBy(id = "cvModelLoginValidationOk")
	private WebElement SessionMessageOK;

	public List<String> rooms;

	// Select addSelect;
	Select select;
	public static WebDriver driver;
	Actions action;

	// List<WebElement> Cabinet;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		action = new Actions(driver);
		rooms = new ArrayList<String>();

		this.driver = driver;

		select = new Select(SelectRoomsDropdown);
		for (WebElement s : select.getOptions()) {
			rooms.add(s.getText());
		}
	}

	public void SetUserName(String username) {
		userNameTextBox.sendKeys(username);

	}

	public void SetPassword(String password) {
		passwordTextBox.sendKeys(password);

	}
	// public void SetSelectRooms(int value){
	// int j=0;
	// Select rooms=new Select(SelectRoomsDropdown);
	// rooms.selectByIndex(0);
	// rooms.selectByIndex(1);
	// rooms.selectByIndex(2);
	// rooms.selectByIndex(3);
	// for(int i =0; i < oSize.size() ; i++){
	//
	// sValue = rooms.getOptions().get(value).getText();
	//
	// }
	//
	// select.selectByIndex(value);
	//
	// System.out.println("Selected room name is:" + rooms.get(value));
	// }

	// public void SetSelectRooms(String roomName){
	// Select rooms=new Select(SelectRoomsDropdown);
	// rooms.selectByValue(roomName);
	// List<WebElement> oSize = rooms.getOptions();
	// for(int i =1; i < oSize.size() ; i++){
	//
	// String sValue = rooms.getOptions().get(i).getText();
	// System.out.println(sValue);
	//
	// }

	public void SetSelectRooms(String roomname) throws Exception {
		try {
	
			
			 Select rooms = new Select(SelectRoomsDropdown);
			  rooms.selectByValue(roomname); 
			  List<WebElement> oSize = rooms.getOptions();
			  for (int i = 1; i < oSize.size(); i++) {
			  
			  String sValue = rooms.getOptions().get(i).getText();
			  System.out.println(sValue);
			  
			 }
			 
		} catch (Exception e) {
			/// System.out.println("Select rooms is not enabled");
			Reporter.log("Select rooms is disabled", true);
		}
		Thread.sleep(1000);
		try {
		
			if(Captcha.isDisplayed() && Captcha.isSelected()) {
				Thread.sleep(2000);
				enterCaptcha.sendKeys(Captcha.getText());
			}
			
			Reporter.log("Enter a valid captch", true);
		} catch (Exception e) {
			Reporter.log("captch is not displayed",true ) ;
		}
		try {
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			wait.until(ExpectedConditions.alertIsPresent());
			acceptAlert();
		} catch (Exception e) {
			// Database alert is not present
		}

	}

	private void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	public void CheckRememberMe(String username, String password) throws InterruptedException {
		// RememberMeCheck.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if (RememberMeCheck.isEnabled()) {
			WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(RememberMeCheck));
			ele.click();
			Reporter.log("Remember me checkbox is selected", true);
		} else {
			// userNameTextBox.sendKeys(" ");
			// passwordTextBox.sendKeys(" ");
			// SelectRoomsDropdown.sendKeys(" ");
			Reporter.log("Remember me checkbox is not selected", true);
		}
	}

	public void ClickLoginButton(String username, String password, String RoomName) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		if (username.isEmpty()) {
			Reporter.log("Username should not be blank ", true);
		} else if (password.isEmpty()) {
			Reporter.log("Password should not be blank ", true);
		} else if (RoomName.isEmpty()) {
			Reporter.log("Select a room ", true);
		}
		WebElement ele=wait.until(ExpectedConditions.elementToBeClickable(LoginBTN));
		ele.click();
		//LoginBTN.click();
		Thread.sleep(2000);
		try {
			if (SessionMessage.isDisplayed()) {
				SessionMessageOK.click();
			}
		} catch (Exception e) {
			Reporter.log("Session message is not displayed", true);
		}

	}

	public void VerifyErrMsgIsDisplayed(String username, String password, String RoomName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			Reporter.log("pass:Error message is Displayed", true);

		} catch (Exception e) {
			Reporter.log("pass:Error message is Displayed", true);
			Assert.fail();
		}
	}
}
