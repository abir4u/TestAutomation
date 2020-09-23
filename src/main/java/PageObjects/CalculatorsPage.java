package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CalculatorsPage extends Base {

    /*************    PAGE SELECTORS & ELEMENTS    *************/

    private By getStartedButtonSelector() {
        return elements.getSelectorByXpath("//a[.='Click here to get started.']");
    }

    private WebElement getStartedButton() {
        return elements.getElementByXpath("//a[.='Click here to get started.']");
    }

    /****************** ELEMENTARY FUNCTIONS ******************/

    private void clickGetStartedButton() {
        interactions.waitAndClick(getStartedButton());
    }

    /******************    PAGE FUNCTIONS    ******************/

    public void navigateToRetirementCalculator() {
        wait.forSelectorToExist(getStartedButtonSelector());
        clickGetStartedButton();
    }

}
