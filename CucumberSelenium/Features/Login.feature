Feature: Login

Scenario: Successfull login
    Given User Launch chrome browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/" 
    And User enters Username as "Admin"
    And User enters Password as "admin123"
    And Click on button
    