Feature: Test https://www.valtech.com/ website

  @suite
  Scenario: As a user, i should visit https://www.valtech.com/ website on browser
    Given I visit "https://www.valtech.com" url
    Then I am on "Where Experiences are Engineered - Valtech" page
    And I should see "Latest News" section on page
    When I click on "Navigation Menu" clickable on page
    And I click on "Cases" partial link on page
    Then "Cases" is the page header
    And I click back on browser
    When I click on "Navigation Menu" clickable on page
    And I click on "Services" partial link on page
    Then "Services" is the page header
    And I click back on browser
    When I click on "Navigation Menu" clickable on page
    And I click on "Jobs" partial link on page
    Then "Jobs" is the page header
    And I click back on browser
    When I click on "Contact Icon" clickable on page
    Then I should see "Contact our other offices" contact heading on page
    And I should see 30 Valtech offices in total
