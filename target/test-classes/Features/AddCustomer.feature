#Author: karthick@your.domain.com
@AddCustomer @regression
Feature: Validating add customer flow

Background:
  And user click on add customer button

  Scenario: Add Customer validation
    When user need to fill up the fields
    And user click on submit button
    Then user verify customer id is generated

@OneDimList @smoke
  Scenario: Add Customer validation by 1D list concept
    When user need to fill up the fields by oneDim list
      | Soundar | Rajan | Rajan@gmail.com | Addr | 65465464 |
    And user click on submit button
    Then user verify customer id is generated

@OneDimMap @smoke
  Scenario: Add Customer validation by 1D map concept
    When user need to fill up the fields by oneDim map
      | Fname | Soundar         |
      | Lname | Rajan           |
      | mail  | Rajan@gmail.com |
      | addr  | Addr            |
      | phno  |        65465464 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add Customer validation by 2D list concept
    When user need to fill up the fields by twoDim list
      | Soundar  | Rajan | Rajan@gmail.com    | Addr       | 65465464 |
      | karthi   | Rajan | karthi@gmail.com   | thoraipkam | 65465464 |
      | java     | Rajan | java@gmail.com     | selaiyur   | 65465464 |
      | selenium | Rajan | selenium@gmail.com | chennai    | 65465464 |
    And user click on submit button
    Then user verify customer id is generated

  Scenario: Add Customer validation by 2D map concept
    When user need to fill up the fields by twoDim map
      | Fname    | Lname | mail               | Addr       | phno     |
      | Soundar  | Rajan | Rajan@gmail.com    | Addr       | 65465464 |
      | karthi   | Rajan | karthi@gmail.com   | thoraipkam | 65465464 |
      | java     | Rajan | java@gmail.com     | selaiyur   | 65465464 |
      | selenium | Rajan | selenium@gmail.com | chennai    | 65465464 |
    And user click on submit button
    Then user verify customer id is generated
