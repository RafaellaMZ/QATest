#Author: rafaellamacegosa@hotmail.com

Feature: Test WebJump
  As a QA I want to run the scenarios using the webjump qa environment

	Background:
    Given that is in "https://wj-qa-automation-test.github.io/qa-test/"

  Scenario: Check button functionality
    When click on the buttons described one, two and four
    Then validate their absence
    
  Scenario: Validate buttons inside the iframe buttons box
    When click on buttons one, two and four on the panel
    Then validate their absence again
    
   Scenario: Validate field, button, checkbox, list and image
    When fill in YourFirstName field
    And click on the button called one
    And check the option OptionThree
    And select the option ExampleTwo inside the select box
    Then validate the Selenium Webdriver s image
