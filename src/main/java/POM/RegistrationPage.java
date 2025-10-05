package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage {

	private By firstName = By.id("customer.firstName");
	private By lastName = By.id("customer.lastName");
	private By address = By.id("customer.address.street");
	private By city = By.id("customer.address.city");
	private By state = By.id("customer.address.state");
	private By zipCode = By.id("customer.address.zipCode");
	private By phone = By.id("customer.phoneNumber");
	private By ssn = By.id("customer.ssn");
	private By username = By.id("customer.username");
	private By password = By.id("customer.password");
	private By confirmPassword = By.id("repeatedPassword");
	private By registerBtn = By.cssSelector("input[value='Register']");

	public RegistrationPage(WebDriver driver) {
		super(driver);
	}

	public void fillRegistrationForm(String uname, String pwd) {

		driver.findElement(firstName).sendKeys("Tom");
		driver.findElement(lastName).sendKeys("Cruise");
		driver.findElement(address).sendKeys("123 Street");
		driver.findElement(city).sendKeys("Pune");
		driver.findElement(state).sendKeys("MH");
		driver.findElement(zipCode).sendKeys("411001");
		driver.findElement(phone).sendKeys("9999999999");
		driver.findElement(ssn).sendKeys("1234567");

		driver.findElement(username).sendKeys(uname);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(confirmPassword).sendKeys(pwd);
	}

	 public void submitForm() throws InterruptedException {
		 Thread.sleep(5000);
	        driver.findElement(registerBtn).click();
	    }

}
