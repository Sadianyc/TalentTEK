Feature: SignUp
  Scenario: Scenario: Signup student
    Given I am at talentTEK Home Page
    And I click on Create New Account button
    And I get title of the page
    And I filled out the form with valid information
    And I clicked on agree checkbox
    When I click Create My Account button
    Then I will verify Thank you message