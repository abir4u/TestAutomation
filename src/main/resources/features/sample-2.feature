@Automate
Feature:
  As a Product Owner
  I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement
  So that the users are able to plan their investments better.

  Scenario Outline: <Scenario No> - User with the provided profile should be able to calculate their projected balances at retirement
    Given I am on Westpac website
    And I navigate to the KiwiSaver Retirement Calculator page
    When I fill up the calculator form with the following details
      | Current Age                   | <Age>           |
      | Employment Status             | <Status>        |
      | Annual Income                 | <Income>        |
      | KiwiSaver Member Contribution | <MC>            |
      | KiwiSaver Balance             | <Balance>       |
      | Voluntary Contributions       | <VC>            |
      | Frequency                     | <Frequency>     |
      | Risk Profile                  | <Risk>          |
      | Savings Goal                  | <Goal>          |
    Then I should see the following projected retirement balances calculated
      | Projected Balance             | <Projection>      |
      | Life Expectancy               | <Life Expectancy> |
      | Intended Retirement           | <Retirement>      |

    Examples:
    | Scenario No | Age | Status        | Income  | MC  | Balance | VC  | Frequency   | Risk      | Goal    | Projection  | Life Expectancy | Retirement  |
    | 1           | 30  | Employed      | 82000   | 4%  |         |     |             | Growth    |         | 709,640     | 90              | 65          |
    | 2           | 45  | Self-employed |         |     | 100000  | 90  | Fortnightly | Balanced  | 290000  | 303,945     | 90              | 65          |
    | 3           | 55  | Not employed  |         |     | 140000  | 10  | Annually    | Balanced  | 200000  | 197,679     | 90              | 65          |