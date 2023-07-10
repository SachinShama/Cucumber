#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: OrangeHRM login
  

  @login
  Scenario Outline: Logging into the orangeHRM website
    Given Chrome broswer is launched
    And User navigates to the orangeHRM URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And Provide the username as "<username>" and password as "<password>"
    When user clicks on login button
    Then User page title should be "OrangeHRM"
    
  Examples:
  |username|password|
  |Admin|admin123|
  |admin|admin123|
  
  @Dashboard
  Scenario: Click on dashboard options and save details
  Given Chrome broswer is launched
  And User navigates to the orangeHRM URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  And Provide the username as "Admin" and password as "admin123"
  And user clicks on login button
  And user clicks on Dashboard Options
  Then Employee Distribution by location should be fetched