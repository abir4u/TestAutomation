package StepDefinitions;

import PageObjects.Base;
import Shared.Models.User;
import Utils.Helper;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.Arrays;
import java.util.List;

public class RetirementCalculatorStepDefs extends Base {

    @And("^I click the information icon beside (Current Age|Employment Status|Annual Income|KiwiSaver Member Contribution|KiwiSaver Balance|Voluntary Contributions|Risk Profile|Savings Goal)$")
    public void iClickInfoIcon(String fieldType) {
        retirementCalculatorPage.clickInfoIconForField(fieldType);
    }

    @And("^I should see the appropriate message field information for (Current Age|Employment Status|Annual Income|KiwiSaver Member Contribution|KiwiSaver Balance|Voluntary Contributions|Risk Profile|Savings Goal)$")
    public void iShouldSeeMessage(String fieldType) {
        retirementCalculatorPage.verifyInfoMessageForField(fieldType);
    }

    @And ("^I fill up the calculator form with the following details$")
    public void iFillUpCalculatorForm(DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        User user = new User(Helper.getValueForRowInDataTable(rows, "Current Age"),
                Helper.getValueForRowInDataTable(rows, "Employment Status"),
                Helper.getValueForRowInDataTable(rows, "Annual Income"),
                Helper.getValueForRowInDataTable(rows, "KiwiSaver Member Contribution"),
                Helper.getValueForRowInDataTable(rows, "KiwiSaver Balance"),
                Helper.getValueForRowInDataTable(rows, "Voluntary Contributions"),
                Helper.getValueForRowInDataTable(rows, "Frequency"),
                Helper.getValueForRowInDataTable(rows, "Risk Profile"),
                Helper.getValueForRowInDataTable(rows, "Savings Goal"));
        retirementCalculatorPage.fillFormAndRevealProjectionFor(user);
    }

    @And("^I should (not |)see the following projected retirement balances calculated$")
    public void iShouldSeeProjectedBalance(String shouldSee, DataTable table) {
        List<List<String>> rows = table.asLists(String.class);
        retirementCalculatorPage.verifyCalculationSection(shouldSee.matches(""),
                Helper.getValueForRowInDataTable(rows, "Projected Balance"),
                Helper.getValueForRowInDataTable(rows, "Life Expectancy"),
                Helper.getValueForRowInDataTable(rows, "Intended Retirement"));
    }

    @And("^I should see the information icons on all the fields in the calculator$")
    public void iShouldSeeInfoIcons() {
        retirementCalculatorPage.verifyAllInformationIconPresent();
    }
}
