Feature: Booking Hotel using Adactin Application

  Scenario: Login functionality
    Given User launches the Adactin application URL
    When User enters a valid username in the Username field
    And User enters a valid password in the Password field
    Then User clicks the login button
    And User navigates to the Search Hotel Page
