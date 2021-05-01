Feature: Login

  @regression @smoke @login @test
  Scenario: Login with valid email and password
    Given I am at talentTEK Home Page
    And I enter valid email address
    And I enter valid password
    When I click on Log In button