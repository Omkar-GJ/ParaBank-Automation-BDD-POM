package stepDefination;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import POM.*;
import base.DriverManager;

import java.util.Random;

public class ParaBankSteps {

    WebDriver driver;
    RegistrationPage registrationPage;
    LoginPage loginPage;
    AccountsPage accountsPage;
    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC";
    String username;
    String password;

    @Given("the user is on the ParaBank registration page")
    public void openRegistrationPage() throws InterruptedException {
    	
    	driver = DriverManager.getDriver();
    	Thread.sleep(5000);
        driver.findElement(org.openqa.selenium.By.linkText("Register")).click();
        registrationPage = new RegistrationPage(driver);
    }

    @When("the user enters valid details and submits the form")
    public void registerNewAccount() throws InterruptedException {
        Random rand = new Random();
        username = "user" + rand.nextInt(10000);
        password = "Pwd@" + rand.nextInt(10000);

        registrationPage.fillRegistrationForm(username, password);
        registrationPage.submitForm();
    }

    @Then("the user should be redirected to the home page")
    public void the_user_should_be_redirected_to_the_home_page() throws InterruptedException {
        
    	String expectedMsg = "Welcome "+username;
    	String actualMsg ="";
    	HomePage hp = new HomePage(driver);
    	actualMsg = hp.getWelcomeMessage();
    	Assert.assertEquals(actualMsg.trim(), expectedMsg.trim(), "Welcome message did not match!");
    	
    			
    	
    }
    @When("the user click account summary")
    public void the_user_click_account_summary() {
    	HomePage hp = new HomePage(driver);
    	hp.getAccountSummary();
    }


    @Then("the account balance should be printed in the logs")
    public void printAccountBalance() throws InterruptedException {
    	accountsPage = new AccountsPage(driver);
        String balance = accountsPage.getAccountBalance();
        System.out.println("Account Balance: " + balance);
      
        //DriverManager.driverclose();
    }
}
