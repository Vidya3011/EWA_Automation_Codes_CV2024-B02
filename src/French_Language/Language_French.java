package French_Language;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pom.LanguageHindiFrench;

public class Language_French  extends Generic.BaseClass {
	
    private static org.apache.logging.log4j.Logger log = LogManager.getLogger(AdvancedViewer_Script.class);
	@BeforeClass
	public void ladBrowser() {
		loadBrowser("Chrome");
		log.info("Chrome Browser");
		
		launchUrl();
		log.info("ContentVerseURL");
	}

	@Test (priority=1)
	public void Login() throws Exception {
		
		LanguageHindiFrench ln=new LanguageHindiFrench();
		ln.frenchLanguageScript();
		Thread.sleep(3000);
		loginCVS();
		
		log.info("User is Successfully logged in");
	} 

}
