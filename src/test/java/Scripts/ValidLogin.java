package Scripts;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Lib;
import Pom.LoginPage;
import Pom.NewDocument;

public class ValidLogin extends BaseTest {
	//private static org.apache.logging.log4j.Logger log = LogManager.getLogger(ValidLogin.class);
	@Test(priority = 1)
	public void testValidLogin() throws Exception {
		
		//Vidya
			
	int rc = Lib.getRowCount(xlpath, "ValidLogin");
		Reporter.log("rc count:" + rc,true);
		//String StartPage = Lib.getCellValue(xlpath, "SplitRange", 1, 0);
//		StartPage = StartPage.substring(0, StartPage.length()-2);
//		Reporter.log("StartRange:" + StartPage.trim(), true);
//
//		String EndPage = Lib.getCellValue(xlpath, "SplitRange", 1, 1);
//		Reporter.log("EndRange:" + EndPage.trim(), true);
		
		for (int i = 1; i < rc-1; i++) {

			String un = Lib.getCellValue(xlpath, "ValidLogin", i, 0);		
			Reporter.log("Username:" + un, true);
			String pw = Lib.getCellValue(xlpath, "ValidLogin", i, 1);
			Reporter.log("Password:" + pw, true);			
			String roomname = Lib.getCellValue(xlpath, "ValidLogin", i, 2);
			Reporter.log("Room:" + roomname, true);
			LoginPage login = new LoginPage(driver);
			login.SetUserName(un);
			login.SetPassword(pw);
			login.SetSelectRooms(roomname);
			Thread.sleep(2000);
			login.ClickLoginButton(un, pw, roomname);
			Thread.sleep(2000);
			login.CheckRememberMe(un, pw);
			Thread.sleep(2000);
			NodeCreation create1 = new NodeCreation(driver);
		    create1.testCreateNode();


	}
	}
}

