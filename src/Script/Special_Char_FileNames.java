package Script;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import Pom.SpecialCharFilenames;

//Dipak Automation Coading

public class Special_Char_FileNames extends Generic.BaseClass {

	/*
	 * @BeforeClass public void Launch_Browser() throws Exception {
	 * 
	 * loadBrowser("edge"); launchUrl();
	 * Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully.", true);
	 * 
	 * }
	 */

	@Test(priority = 1)
	public void TC_01_Upload_and_verify_Allowing_Percentage_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Percentage_Characterfile();
	}

	@Test(priority = 2)
	public void TC_02_Upload_and_verify_Allowing_Tile_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Tile_Characterfile();
	}

	@Test(priority = 3)
	public void TC_03_Upload_and_verify_Allowing_Atrate_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Atrate_Characterfile();
	}

	@Test(priority = 4)
	public void TC_04_Upload_and_verify_Allowing_Hash_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Hash_Characterfile();
	}

	@Test(priority = 5)
	public void TC_05_Upload_and_verify_Allowing_Dollar_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Dollar_Characterfile();
	}

	@Test(priority = 6)
	public void TC_06_Upload_and_verify_Allowing_Plus_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Plus_Characterfile();
	}

	@Test(priority = 7)
	public void TC_07_Upload_and_verify_Allowing_Caret_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Caret_Characterfile();
	}

	@Test(priority = 8)
	public void TC_08_Upload_and_verify_Allowing_Equals_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Equals_Characterfile();
	}

	@Test(priority = 9)
	public void TC_09_Upload_and_verify_Allowing_SingleQuote_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_SingleQuote_Characterfile();

	}

	@Test(priority = 10)
	public void TC_10_Upload_and_verify_Allowing_Comma_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Comma_Characterfile();
	}

	@Test(priority = 11)
	public void TC_11_Upload_and_verify_Allowing_Exclamatory_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Exclamatory_Characterfile();
	}

	@Test(priority = 12)
	public void TC_12_Upload_and_verify_Allowing_Hyphen_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Hyphen_Characterfile();
	}

	@Test(priority = 13)
	public void TC_13_Upload_and_verify_Allowing_RoundBrackets_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_RoundBrackets_Characterfile();
	}

	@Test(priority = 14)
	public void TC_14_Upload_and_verify_Allowing_Accent_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Accent_Characterfile();
	}

	@Test(priority = 15)
	public void TC_15_Upload_and_verify_Allowing_Ampersant_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Ampersant_Characterfile();
	}

	@Test(priority = 16)
	public void TC_16_Upload_and_verify_Allowing_Underscore_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Underscore_Characterfile();
	}

	@Test(priority = 17)
	public void TC_17_Upload_and_verify_Allowing_Flowerbracket_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Flowerbracket_Characterfile();
	}

	@Test(priority = 18)
	public void TC_18_Upload_and_verify_Allowing_Squarebracket_Characterfile() throws Exception {
		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_Squarebracket_Characterfile();
	}

	@Test(priority = 19)
	public void TC_19_Upload_and_verify_Allowing_SemiColon_Characterfile() throws Exception {

		SpecialCharFilenames pojo = new SpecialCharFilenames();
		pojo.Upload_and_verify_Allowing_SemiColon_Characterfile();
	}
}
