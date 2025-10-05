Feature: ParaBank Account Registration and Login

  Scenario: Register a new account, login and print balance
    Given the user is on the ParaBank registration page
    When the user enters valid details and submits the form
    Then the user should be redirected to the home page
    When the user click account summary
    Then the account balance should be printed in the logs
