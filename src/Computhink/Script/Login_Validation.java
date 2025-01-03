package Computhink.Script;

<<<<<<< HEAD
//Dipak Automation Coading

import org.openqa.selenium.WindowType;
=======
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

//Dipak Automation Coading

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
>>>>>>> origin/Dipak-Pandurang-Gawali
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

<<<<<<< HEAD
import Computhink.Pom.Language;
=======
import Computhink.Pom.Login;
>>>>>>> origin/Dipak-Pandurang-Gawali

public class Login_Validation extends Computhink.Generic.BaseClass {

	@BeforeClass
	public void Launch_Browser() throws Exception {

<<<<<<< HEAD
		loadBrowser("edge");
=======
		loadBrowser("Chrome");
>>>>>>> origin/Dipak-Pandurang-Gawali
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully", true);

	}

<<<<<<< HEAD
	@Test(priority = 2)
	public void TC_02_Verifying_Login_EWA_with_blank_Username() throws Exception {

		Language pojo = new Language();
		Thread.sleep(2000);
=======
	@Test(priority = 1)
	public void TC_01_Verifying_No_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {

		Login pojo = new Login();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.open();");
		driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		Thread.sleep(4000);
		launchUrl();
		Thread.sleep(4000);
		pojo.Verifying_No_button_of_Session_for_user_is_already_active_dialog_box();
	}

	@Test(priority = 2)
	public void TC_02_Verifying_Login_EWA_with_blank_Username() throws Exception {

		Login pojo = new Login();
		Thread.sleep(4000);
>>>>>>> origin/Dipak-Pandurang-Gawali
		pojo.Verifying_Login_EWA_with_blank_Username();
	}

	@Test(priority = 3)
	public void TC_03_Verifying_Login_EWA_with_blank_Password() throws Exception {

<<<<<<< HEAD
		Language pojo = new Language();
=======
		Login pojo = new Login();
>>>>>>> origin/Dipak-Pandurang-Gawali
		pojo.Verifying_Login_EWA_with_blank_Password();

	}

	@Test(priority = 4)
	public void TC_04_Verifying_Login_EWA_without_Selecting_Roomname() throws Exception {

<<<<<<< HEAD
		Language pojo = new Language();
=======
		Login pojo = new Login();
>>>>>>> origin/Dipak-Pandurang-Gawali
		pojo.Verifying_Login_EWA_without_Selecting_Roomname();

	}

	@Test(priority = 5)
	public void TC_05_Verifying_Login_EWA_with_Invalid_Username() throws Exception {

<<<<<<< HEAD
		Language pojo = new Language();
=======
		Login pojo = new Login();
>>>>>>> origin/Dipak-Pandurang-Gawali
		pojo.Verifying_Login_EWA_with_Invalid_Username();

	}

	@Test(priority = 6)
	public void TC_06_Verifying_Login_EWA_with_Invalid_Password() throws Exception {

<<<<<<< HEAD
		Language pojo = new Language();
		pojo.Verifying_Login_EWA_with_Invalid_Password();

	}

	@Test(priority = 7)
	public void TC_07_Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {
		Language pojo = new Language();
		pojo.Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box();
	}

=======
		Login pojo = new Login();
		pojo.Verifying_Login_EWA_with_Invalid_Password();
		
	}
	
	@Test(priority = 7)
	public void TC_07_Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box() throws Exception {
		Login pojo = new Login();
		pojo.Verifying_Yes_button_of_Session_for_user_is_already_active_dialog_box();
	}
>>>>>>> origin/Dipak-Pandurang-Gawali
}
