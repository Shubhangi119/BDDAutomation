package qai.login_gmail_testinitiator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class setup {

	public static WebDriver driver;
	public static String driverpath = "src/test/resources/selenium-drivers/chromedriver.exe";

	
	public static void setupBrowser() {
		System.setProperty("webdriver.chrome.driver", driverpath);
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

}
