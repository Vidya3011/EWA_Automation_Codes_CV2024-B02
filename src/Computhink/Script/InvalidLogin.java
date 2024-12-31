package Computhink.Script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Computhink.Generic.BaseTest;
import Computhink.Generic.Lib;
import Computhink.Pom.LoginPage;

//vidya codes 
public class InvalidLogin extends BaseTest {
	@Test(priority = 2)
	public void testInvalidLogin() throws InterruptedException {
		int rc = Lib.getRowCount(xlpath, "InvalidLogin");
		for (int i = 1; i <= rc; i++) {
			String un = Lib.getCellValue(xlpath, "InvalidLogin", i, 0);
			Reporter.log("Username:" + un, true);
			Reporter.log("5555");
			String pw = Lib.getCellValue(xlpath, "InvalidLogin", i, 1);
			Reporter.log("Password:" + pw, true);
			Reporter.log("66666");
			String roomname = Lib.getCellValue(xlpath, "InvalidLogin", i, 2);
			Reporter.log("Room:" + roomname, true);
			LoginPage login = new LoginPage();
			login.SetUserName(un);
			login.SetPassword(pw);
			login.SetSelectRooms(roomname);
			// login.CheckRememberMe(un,pw);
			login.ClickLoginButton(un, pw, roomname);
			login.VerifyErrMsgIsDisplayed(un, pw, roomname);
		}
	}
}