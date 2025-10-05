package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DriverManager {

	public static WebDriver  driver;

	public static WebDriver getDriver() {
		String url = "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		return driver;
	}
	
	
	public static void driverclose() {
		driver.quit();
	}
}
