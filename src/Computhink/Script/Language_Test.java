package Computhink.Script;

//Dipak Automation Coading

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.Language;

public class Language_Test extends Computhink.Generic.BaseClass {

	/*
	 * @BeforeClass public void Launch_Browser() throws Exception {
	 * 
	 * loadBrowser("edge"); launchUrl();
	 * Reporter.log("CVS URL started Successfully", true); }
	 * 
	 * @Test public void Login_EWA() throws Exception { LogDipakUser();
	 * Reporter.log("User has logged in successfully", true);
	 * 
	 * }
	 */

	@Test(priority = 1)
	public void TC_01_verify_Spanish_Language() throws Exception {

		Language pojo = new Language();
		pojo.verify_Spanish_Language();
	}

	@Test(priority = 2)
	public void TC_02_verify_French_Language() throws Exception {

		Language pojo = new Language();
		pojo.verify_French_Language();
	}

	@Test(priority = 3)
	public void TC_03_verify_Dutch_Language() throws Exception {

		Language pojo = new Language();
		pojo.verify_Dutch_Language();
	}

	@Test(priority = 4)
	public void TC_04_verify_Hindi_Language() throws Exception {

		Language pojo = new Language();
		pojo.verify_Hindi_Language();
	}

	@Test(priority = 5)
	public void TC_05_verify_English_Language() throws Exception {

		Language pojo = new Language();
		pojo.verify_English_Language();
	}
}
