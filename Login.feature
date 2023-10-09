@LoginSuccess
Feature: Login Validation

  Scenario: Successfull Validation
    Given User tries to launch the browser with the url 
    When USer tries to login
    Then Login should be successfull
    And Browser need to be closed 
    