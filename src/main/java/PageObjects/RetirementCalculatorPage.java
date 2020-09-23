package PageObjects;

import Shared.Constants;
import Shared.Models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RetirementCalculatorPage extends Base {

    /*******************    PAGE HELPERS    *******************/

    private enum FieldType {
        CurrentAge,
        EmploymentStatus,
        AnnualIncome,
        KiwiSaverMemberContribution,
        KiwiSaverBalance,
        VoluntaryContributions,
        RiskProfile,
        SavingsGoal
    }

    private String getInfoTextFor(FieldType fieldType) {
        switch (fieldType) {
            case CurrentAge:
                return Constants.currentAge;
            case EmploymentStatus:
                return Constants.employmentStatus;
            case AnnualIncome:
                return Constants.annualIncome;
            case KiwiSaverMemberContribution:
                return Constants.kiwiSaverMemberContribution;
            case KiwiSaverBalance:
                return Constants.kiwiSaverBalance;
            case VoluntaryContributions:
                return Constants.voluntaryContributions;
            case RiskProfile:
                return Constants.riskProfile;
            case SavingsGoal:
                return Constants.savingsGoal;
            default:
                return "";
        }
    }

    private String getXpathForField(FieldType fieldType) {
        return "//*[@class='ng-scope']//*[@help-id='" + fieldType.name() + "']";
    }

    /*************    PAGE SELECTORS & ELEMENTS    *************/

    private By fieldSectionSelector(FieldType fieldType) {
        return elements.getSelectorByXpath(getXpathForField(fieldType));
    }

    private By iFrameSelector() {
        return elements.getSelectorByXpath("//*[@id='calculator-embed']/iframe");
    }

    private By loadingMaskSelector() {
        return elements.getSelectorByXpath("//*[@id='widget-loading-mask']");
    }

    private By fieldInfoIconSelector(FieldType fieldType) {
        return elements.getSelectorByXpath(getXpathForField(fieldType) + "/button");
    }

    private WebElement fieldInfoIcon(FieldType fieldType) {
        return elements.getElementByXpath(getXpathForField(fieldType) + "/button");
    }

    private By fieldInfoSelector(FieldType fieldType) {
        return elements.getSelectorByXpath(getXpathForField(fieldType) + "//p");
    }

    private WebElement fieldInfo(FieldType fieldType) {
        return elements.getElementByXpath(getXpathForField(fieldType) + "//p");
    }

    private WebElement textInputFor(FieldType fieldType) {
        return elements.getElementByXpath(getXpathForField(fieldType) + "//input");
    }

    private WebElement employmentStatusDropDown() {
        return elements.getElementByXpath(getXpathForField(FieldType.EmploymentStatus) + "//*[@class='control-well']");
    }

    private WebElement frequencyDropdown() {
        return elements.getElementsByXpath(getXpathForField(FieldType.VoluntaryContributions) + "//*[@class='control-well']").get(1);
    }

    private WebElement memberContributionRadioButton(String option) {
        return elements.getElementByXpath("//*[@class='control-group' and @data-control-count='5']/div[contains(., '" + option + "')]");
    }


    private WebElement riskProfileRadioButton(String option) {
        return elements.getElementByXpath("//*[@class='control-group' and @data-control-count='4']/div[contains(., '" + option + "')]");
    }

    private WebElement revealResultButton() {
        return elements.getElementByXpath("//*[@class='btn btn-regular btn-results-reveal btn-has-chevron']");
    }

    private WebElement resultsHeader() {
        return elements.getElementByClass("results-heading");
    }

    private By resultsGraphSelector() {
        return elements.getSelectorByXpath("//*[@class='results-graph']");
    }

    private WebElement resultsField(String fieldLabel) {
        return elements.getElementByXpath("//*[@label='" + fieldLabel + "']//input");
    }

    private By resultsSectionSelector() {
        return elements.getSelectorByXpath("//*[@class='field-group-set-portion results-validation-overlay-holder']");
    }

    /****************** ELEMENTARY FUNCTIONS ******************/

    private void assertInfoIconPresence(FieldType fieldType, boolean isPresent) {
        boolean isInfoIconPresentOnPage = assertions.isElementPresent(fieldInfoIconSelector(fieldType));
        assertions.expectConditionToBeTrue(isInfoIconPresentOnPage == isPresent, "The info icon for " + fieldType + "was not found.");
    }

    private void clickInfoIcon(FieldType fieldType) {
        interactions.waitAndClick(fieldInfoIcon(fieldType));
    }

    private void assertInfoText(FieldType fieldType) {
        String actualInfoText = fieldInfo(fieldType).getText();
        String expectedInfoText = getInfoTextFor(fieldType);
        assertions.expectConditionToBeTrue(actualInfoText.matches(expectedInfoText), "The info text did not match\nExpected: " + expectedInfoText + "\nActual: " + actualInfoText);
    }

    private void clickField(FieldType fieldType) {
        interactions.waitAndClick(textInputFor(fieldType));
    }

    private void enterInField(FieldType fieldType, String textValue) {
        interactions.enterTextInTextField(textInputFor(fieldType), textValue);
    }

    private void chooseEmploymentStatus(String optionValue) {
        interactions.chooseFromDropdown(employmentStatusDropDown(), optionValue);
    }

    private void chooseFrequency(String optionValue) {
        interactions.chooseFromDropdown(frequencyDropdown(), optionValue);
    }

    private void clickRiskProfileOption(String option) {
        interactions.waitAndClick(riskProfileRadioButton(option));
    }

    private void clickMemberContributionOption(String option) {
        interactions.waitAndClick(memberContributionRadioButton(option));
    }

    private void assertRevealResultsButtonText(String expectedText) {
        String actualText = revealResultButton().getText();
        assertions.expectStringToEqual(expectedText, actualText);
    }

    private void clickRevealResultsButton() {
        interactions.waitAndClick(revealResultButton());
    }

    private void assertResultsFieldValue(String fieldLabel, String expectedFieldValue) {
        String[] expectedFieldValues = expectedFieldValue.split(" ");
        String actualFieldValue = resultsField(fieldLabel).getAttribute("value");
        assertions.expectConditionToBeTrue(actualFieldValue.matches(expectedFieldValues[0]), "User is not displayed with the expected result in '" + fieldLabel + "' field for the provided inputs.\nExpected Value: " + expectedFieldValues[0] + "\nActual Value: " + actualFieldValue);
    }

    private void assertKiwiSaverBalance(String balance) {
        String[] targetTexts = resultsHeader().getText().split("\n");
        assertions.expectConditionToBeTrue(targetTexts[0].matches(Constants.resultHeaderMessage), "The result header message is incorrect.\nExpected: " + "" + "\nActual: " + targetTexts[0]);
        assertions.expectConditionToBeTrue(targetTexts[2].matches(balance), "The estimated KiwiSaver balance is not as expected.\nExpected: " + balance + "\nActual: " + targetTexts[2]);
    }

    private void assertGraphPresence(boolean isPresent) {
        boolean isGraphPresent = assertions.isElementPresent(resultsGraphSelector());
        assertions.expectConditionToBeTrue(isGraphPresent == isPresent, "The graph was expected to " + (isPresent ? "": "not ") + "be displayed in the results section.");
    }

    private void prepareIFrameForInteration() {
        wait.forSelectorToExist(iFrameSelector());
        elements.switchToIFrame(iFrameSelector());
        wait.forSelectorToDisappear(loadingMaskSelector());
    }

    /******************    PAGE FUNCTIONS    ******************/

    public void verifyAllInformationIconPresent() {
        prepareIFrameForInteration();
        wait.forSelectorToExist(fieldInfoIconSelector(FieldType.CurrentAge));
        boolean shouldContributionSectionExist = assertions.isElementPresent(fieldSectionSelector(FieldType.KiwiSaverMemberContribution));
        assertInfoIconPresence(FieldType.CurrentAge, true);
        assertInfoIconPresence(FieldType.EmploymentStatus, true);
        assertInfoIconPresence(FieldType.AnnualIncome, shouldContributionSectionExist);
        assertInfoIconPresence(FieldType.KiwiSaverMemberContribution, shouldContributionSectionExist);
        assertInfoIconPresence(FieldType.KiwiSaverBalance, true);
        assertInfoIconPresence(FieldType.VoluntaryContributions, true);
        assertInfoIconPresence(FieldType.RiskProfile, true);
        assertInfoIconPresence(FieldType.SavingsGoal, true);
    }

    public void clickInfoIconForField(String field) {
        FieldType fieldType = FieldType.valueOf(field.replace(" ", ""));
        prepareIFrameForInteration();
        wait.forSelectorToExist(fieldInfoIconSelector(fieldType));
        clickInfoIcon(fieldType);
    }

    public void verifyInfoMessageForField(String field) {
        FieldType fieldType = FieldType.valueOf(field.replace(" ", ""));
        wait.forSelectorToExist(fieldInfoSelector(fieldType));
        assertInfoText(fieldType);
    }

    public void fillFormAndRevealProjectionFor(User user) {
        prepareIFrameForInteration();
        wait.forSelectorToExist(fieldInfoIconSelector(FieldType.CurrentAge));
        enterInField(FieldType.CurrentAge, user.getCurrentAge());
        chooseEmploymentStatus(user.getEmploymentStatus());
        if (user.getEmploymentStatus().matches("Employed")) {
            enterInField(FieldType.AnnualIncome, user.getAnnualIncome());
            clickMemberContributionOption(user.getKiwiSaverMemberContribution());
        }
        enterInField(FieldType.KiwiSaverBalance, user.getKiwiSaverBalance());
        if (!user.getVoluntaryContributions().matches("")) {
            clickField(FieldType.VoluntaryContributions);
            enterInField(FieldType.VoluntaryContributions, user.getVoluntaryContributions());
            chooseFrequency(user.getFrequency());
        }
        clickRiskProfileOption(user.getRiskProfile());
        enterInField(FieldType.SavingsGoal, user.getSavingsGoal());
        wait.forElementToBeClickable(revealResultButton());
        assertRevealResultsButtonText(Constants.revealResultsButton);
        clickRevealResultsButton();
    }

    public void verifyCalculationSection(boolean isDisplayed, String balance, String lifeExpectancy, String intendedRetirementAge) {
        wait.forSelectorToExist(resultsSectionSelector());
        assertGraphPresence(isDisplayed);
        if (!isDisplayed) {
            return;
        }
        assertKiwiSaverBalance(balance);
        assertResultsFieldValue("Life expectancy", lifeExpectancy);
        assertResultsFieldValue("Intended retirement age", intendedRetirementAge);
    }
}
