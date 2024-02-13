Feature: User Login

  Scenario: Successful Login
    Given the user is on the nopcommerce login page
    When the user enters valid credentials (username:"student", password:"Password123")
    And the user clicks on the Login button
    Then the user should be redirected to the My Account Page
    And the user should see a welcome message
