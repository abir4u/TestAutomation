@Automate
Feature:
  As a Product Owner,
  I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present
  So that the user is able to get a clear understanding of what needs to be entered in the field .

  Scenario: 1 - Verify that User is able to see the information icons on all the fields in the calculator
    Given I am on Westpac website
    When I navigate to the KiwiSaver Retirement Calculator page
    Then I should see the information icons on all the fields in the calculator

  Scenario: 2 - Verify that User is able to see the right message for Current age
    Given I am on Westpac website
    And I navigate to the KiwiSaver Retirement Calculator page
    When I click the information icon beside Current Age
    Then I should see the appropriate message field information for Current Age

  Scenario Outline: <Scenario Number> - Verify that User is able to see the right message for <Field Name>
    Given I am on Westpac website
    And I navigate to the KiwiSaver Retirement Calculator page
    When I click the information icon beside <Field Name>
    Then I should see the appropriate message field information for <Field Name>

    Examples:
      | Scenario Number | Field Name                    |
      | 3               | Current Age                   |
      | 4               | KiwiSaver Balance             |
      | 5               | Voluntary Contributions       |
      | 7               | Savings Goal                  |



