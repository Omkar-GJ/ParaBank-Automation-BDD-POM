package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginBtn = By.cssSelector("input[value='Log In']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String uname, String pwd) {
        driver.findElement(usernameField).sendKeys(uname);
        driver.findElement(passwordField).sendKeys(pwd);
        driver.findElement(loginBtn).click();
    }
}
