package Script;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.Language;

public class Language_Test extends Generic.BaseClass {

	private static final Logger log = LogManager.getLogger(Language_Test.class);

	 @BeforeClass
	public void LandBrowser() {

		loadBrowser("Chrome");
		launchUrl();
		log.info("CVS URL started Successfully...");
	}

	 @Test
	public void Login_EWA() throws Exception {
		LogDipakUser();
		log.info("CVS User is logged in successfully...");

	}

	@Test(priority = 1)
	public void verify_Spanish_Language() throws Exception {

		Language pojo = new Language();
		Thread.sleep(6000);
		jsclick(pojo.getSetting_Icon());
		Thread.sleep(4000);
		jsclick(pojo.getMy_Preferencesetting());
		Thread.sleep(4000);
		pojo.getSelect_Office_document_Defaultviewing();
		Thread.sleep(4000);
		pojo.getPdf_document_Defaultviewing();
		Thread.sleep(4000);
		jsclick(pojo.getApply_button());
		Thread.sleep(4000);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		jsclick(pojo.getLogout());
		Thread.sleep(4000);
		jsclick(pojo.getSpanish_Language());
		Thread.sleep(4000);
		LogDipakUser();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		pojo.Spanish_Myaccount_Text_Laguage(driver);
		Thread.sleep(4000);
		jsclick(pojo.getspanishLogout());
		Thread.sleep(4000);
		log.info("Spanish Language verified Successfully");
	}

	@Test(priority = 2)
	public void verify_French_Language() throws Exception {

		Language pojo = new Language();
		jsclick(pojo.getFrench_Language());
		Thread.sleep(4000);
		LogDipakUser();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		pojo.French_Myaccount_Text_Laguage(driver);
		Thread.sleep(4000);
		jsclick(pojo.getFrenchLogout());
		Thread.sleep(4000);
		log.info("French Language verified Successfully");
	}

	@Test(priority = 3)
	public void verify_Dutch_Language() throws Exception {

		Language pojo = new Language();
		jsclick(pojo.getDutch_Language());
		Thread.sleep(4000);
		LogDipakUser();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		pojo.Dutch_Myaccount_Text_Laguage(driver);
		Thread.sleep(4000);
		jsclick(pojo.getDutchLogout());
		Thread.sleep(4000);
		log.info("Dutch Language verified Successfully");
	}

	@Test(priority = 4)
	public void verify_Hindi_Language() throws Exception {

		Language pojo = new Language();
		jsclick(pojo.getHindi_Language());
		Thread.sleep(4000);
		LogDipakUser();
		Thread.sleep(4000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(4000);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		pojo.Hindi_Myaccount_Text_Laguage(driver);
		Thread.sleep(4000);
		jsclick(pojo.getHindiLogout());
		Thread.sleep(4000);
		log.info("Hindi Language verified Successfully");
	}

	@Test(priority = 5)
	public void verify_English_Language() throws Exception {

		Language pojo = new Language();
		jsclick(pojo.getEnglish_Language());
		Thread.sleep(4000);
		LogDipakUser();
		Thread.sleep(4000);
		jsclick(pojo.getUsername());
		Thread.sleep(4000);
		pojo.English_Myaccount_Text_Laguage(driver);
		Thread.sleep(6000);
		jsclick(pojo.getRefreshbutton());
		Thread.sleep(6000);
		log.info("English Language verified Successfully");

	}
}
