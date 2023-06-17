Feature: Login functionality of the test-store website.

  Scenario Outline: Login to test-store website as user
    Given I am on the test-store website
    When I enter a username "<username>"
    And I enter a password "<password>"
    And I click sign in
    Then I should be on the store page
    Examples:
      |username  | password|
      |test@test.com| test123|
      |test@test.com| test123|