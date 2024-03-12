
Feature: Register
  I want to use this template for my feature file

  @tag1
  Scenario: user Registering with mandatory fiels
    Given user navigate to user register page
    When user enaters the details into the below field
    |firstname			|madhavi|
   	|lastname				|penumatsa|
   	|telephone			|8245637890|
   	|password				|1234512345|
   	|conformpassword|1234512345|
    And user selets pivacypolocy
    And user click on continue button
    And user account should successfully created

  Scenario Outline: user registering with all fields
   Given user navigate to user register page
    When user enaters the details into the below field
    |firstname			|madhavi|
   	|lastname				|penumatsa|
   	|telephone			|8245637890|
   	|password				|1234512345|
   	|conformpassword|1234512345|
   	And user selects newletter field
    And user selets pivacypolocy
    And user click on continue button
    And user account should successfully created
    
    Scenario Outline: user registering without providing details
   Given user navigate to user register page
    When user click on continue button
    And user should get proper error messages
    
    Scenario Outline: user registering with different passwords 
   Given user navigate to user register page
    When user enaters the details into the below field
    |firstname			|madhavi|
   	|lastname				|penumatsa|
   	|telephone			|8245637890|
   	|password				|1234512345|
   	|conformpassword|1234512|
   	And user selects newletter field
    And user selets pivacypolocy
    And user click on continue button
    And user should get password error message
    