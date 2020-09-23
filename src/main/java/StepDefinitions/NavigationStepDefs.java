package StepDefinitions;

import PageObjects.Base;
import Utils.Helper;
import cucumber.api.java.en.Given;

public class NavigationStepDefs extends Base {

    @Given("^I am on Westpac website$")
    public void i_navigate_to_Westpac() {
        getPage(Helper.getConfigValue("url"));
    }

    @Given("^I navigate to the KiwiSaver Retirement Calculator page$")
    public void i_navigate_to_retirement_calculator() {
        homepage.navigateToCalculatorPage();
        calculatorsPage.navigateToRetirementCalculator();
    }

}
