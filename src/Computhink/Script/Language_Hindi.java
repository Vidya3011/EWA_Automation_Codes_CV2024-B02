package Computhink.Script;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Computhink.Pom.LanguageHindiFrench;

//NishaR codes
public class
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~NishaR
// codes~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Language_Hindi extends Computhink.Generic.BaseClass {

	private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AdvancedViewer_Script.class);

	@BeforeClass
	public void ladBrowser() throws Exception {
		loadBrowser("Chrome");
		log.info("Chrome Browser");

		launchUrl();
		log.info("ContentVerseURL");
	}

	@Test(priority = 1)
	public void Login() throws Exception {

		LanguageHindiFrench ln = new LanguageHindiFrench();
		ln.HindiLanguageScript();
		Thread.sleep(3000);
		loginCVS();

		log.info("User is Successfully logged in");
	}

}
