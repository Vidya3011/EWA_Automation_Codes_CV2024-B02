package Script;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;

//Dipak Automation Coading

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Login;

public class Login_Validation extends Generic.BaseClass {

	@BeforeClass
	public void Launch_Browser() throws Exception {

		loadBrowser("edge");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully", true);

	}

	@Test(priority = 1)
	public void TC_01_Verifying_No_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Login pojo = new Login();
		
		//driver.switchTo().window(WindowType.TAB);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.open();");
		Thread.sleep(3000);
	
		
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(tabs.size() - 1));
		launchUrl();
		Thread.sleep(4000);
		pojo.Verifying_No_button_of_Session_for_user_is_already_active_dialog_box();
	}

	@Test(priority = 2)
	public void TC_02_Verifying_Login_EWA_with_blank_Username() throws Exception {

		Login pojo = new Login();
		Thread.sleep(4000);
		pojo.Verifying_Login_EWA_with_blank_Username();
	}

	@Test(priority = 3)
	public void TC_03_Verifying_Login_EWA_with_blank_Password() throws Exception {

		Login pojo = new Login();
		pojo.Verifying_Login_EWA_with_blank_Password();

	}

	//@Test(priority = 4)
	public void TC_04_Verifying_Login_EWA_without_Selecting_Roomname() throws Exception {

		Login pojo = new Login();
		pojo.Verifying_Login_EWA_without_Selecting_Roomname();

	}

	@Test(priority = 5)
	public void TC_05_Verifying_Login_EWA_with_Invalid_Username() throws Exception {

		Login pojo = new Login();
		pojo.Verifying_Login_EWA_with_Invalid_Username();

	}

	@Test(priority = 6)
	public void TC_06_Verifying_Login_EWA_with_Invalid_Password() throws Exception {

		Login pojo = new Login();
		pojo.Verifying_Login_EWA_with_Invalid_Password();
		
	}
	
	@Test(priority = 7)
	public void TC_07_Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {
		Login pojo = new Login();
		pojo.Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box();
	}

}
