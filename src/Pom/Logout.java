package Pom;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

//Dipak codes 
public class Logout {
	private static WebElement element = null;

	public static WebElement Username(WebDriver driver) {
		element = driver.findElement(By.id("logedinusername"));
		return element;

	}

	public static WebElement LogoutOption(WebDriver driver) {
		element = driver.findElement(By.linkText("Logout"));
		Reporter.log("Logout Successfully", true);
		return element;

	}
}
