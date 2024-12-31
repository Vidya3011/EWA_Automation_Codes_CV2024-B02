package Computhink.Generic;


	

	import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Capabilities;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.edge.EdgeOptions;
	import org.openqa.selenium.firefox.FirefoxOptions;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseGrid {

		public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<RemoteWebDriver>();
		public static String remote_url = "http://10.4.8.14:4444/";
		public Capabilities capabilities;

		@SuppressWarnings({ "deprecation", "deprecation" })
		@Parameters({ "browser" })
		@BeforeMethod
		public void setDriver(String browser) throws MalformedURLException {

			System.out.println("Test is running on " + browser);

			if (browser.equals("chrome")) {
				//capabilities = new ChromeOptions();
				/*System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Harsha Patil\\Documents\\Manipal\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");
				*/	
				WebDriverManager.chromedriver().setup();
				capabilities = new ChromeOptions();
//						
			} else if (browser.equals("edge")) {
				//capabilities = new EdgeOptions();
				
				/*	System.setProperty("webdriver.edge.driver", 
							"C:\\Users\\Harsha Patil\\Documents\\Manipal\\edgedriver_win64 (2)\\msedgedriver.exe");
						*/	
				
				WebDriverManager.edgedriver().setup();
				
				WebDriver driver=new EdgeDriver();	
						
			}

			driver.set(new RemoteWebDriver(new URL(remote_url), capabilities));
			driver.get().get("http://10.4.10.21:8080/CVWeb/cvLgn");
		
			driver.get().manage().window().maximize();
			//driver.get().manage().timeouts().pageLoadTimeout(driver, 10);
			WebDriverWait wait = new WebDriverWait(driver.get(),30);
		//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='username']")));
		}

		public WebDriver getDriver() {
			return driver.get();
		}

		@AfterMethod
		public void closeBrowser() {
			driver.get().quit();
			driver.remove();
		}

	}


