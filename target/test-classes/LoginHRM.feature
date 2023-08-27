#Author : brahim bounguicha
Feature: orangeHRM login page

  Background: 
    Given admin is on login page

  Scenario: Login with valid credentials
    When admin enter correct username "Admin" and correct password "admin123"
    Then admin is directed to the homepage that contains message "Dasrd"

  Scenario: Login with wrong credentials to admin dashboard
    When admin enter correct username "Admin" and wrong password "adminadmin"
    Then admin is still on login page that contains message "Invalid credentials"
