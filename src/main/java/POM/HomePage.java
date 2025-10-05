package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

	private By accountSummary = By.xpath("//a[text()= 'Accounts Overview']");
	private By message = By.xpath("//h1[@class='title']");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public void getAccountSummary() {
		driver.findElement(accountSummary).click();
	}
	
	public String getWelcomeMessage() throws InterruptedException {
		
		Thread.sleep(5000);
		String s = driver.findElement(message).getText();
		return s;
		
	}
	
}
