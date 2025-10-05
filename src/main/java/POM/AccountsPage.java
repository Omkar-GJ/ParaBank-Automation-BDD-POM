package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {

    private By balanceField = By.xpath("//table[@id='accountTable']//tr[2]/td[2]/b");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public String getAccountBalance() throws InterruptedException {
    Thread.sleep(10000);
    	return driver.findElement(balanceField).getText();
    }
}
