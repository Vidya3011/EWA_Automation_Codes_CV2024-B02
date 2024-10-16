package Script;

//Dipak Automation Coading

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pom.My_Preferences;

//Dipak Automation script
public class My_Preferences_Viewer_Zoom extends Generic.BaseClass {

	/*@BeforeClass

	public void Launch_Browser() throws Exception {
		loadBrowser("edge");
		launchUrl();
		Reporter.log("CVS URL started Successfully", true);
	}

	@Test

	public void Login_EWA() throws Exception {
		LogDipakUser();
		Reporter.log("User has logged in successfully.", true);

	}*/

	@Test(priority = 1)
	public void TC_01_Verify_Viewer_Zoom_Fit_To_Width() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Viewer_Zoom_Fit_To_Width();

	}

	@Test(priority = 2)
	public void TC_02_Verify_Viewer_Zoom_Fit_To_Height() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Viewer_Zoom_Fit_To_Height();

	}

	@Test(priority = 3)
	public void TC_03_Verify_Viewer_Zoom_Fit_Entire_Image() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Viewer_Zoom_Fit_Entire_Image();

	}

	@Test(priority = 4)
	public void TC_04_Verify_Viewer_Zoom_Actual_Size() throws Exception {

		My_Preferences pojo = new My_Preferences();
		pojo.Verify_Viewer_Zoom_Actual_Size();

	}
}
