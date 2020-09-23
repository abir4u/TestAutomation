package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homepage extends Base {

    /*************    PAGE SELECTORS & ELEMENTS    *************/

    private By menuItemSelector(String optionText) {
        return elements.getSelectorByXpath("//*[@class='sw-ubermenu-section-link ' and .='" + optionText + "']");
    }

    private WebElement menuItem(String optionText) {
        return elements.getElementByXpath("//*[@class='sw-ubermenu-section-link ' and .='" + optionText + "']");
    }

    private By menuColumnItemSelector(String itemText) {
        return elements.getSelectorByXpath("//*[@id='ubermenu-item-cta-kiwisaver-calculators-ps' and .='" + itemText + "']");
    }

    /****************** ELEMENTARY FUNCTIONS ******************/

    private void clickKiwiSaverMenu() {
        interactions.waitAndClick(menuItem("KiwiSaver"));
    }

    private void clickKiwiSaverCalculatorButton() {
        WebElement menuToHoverOn = menuItem("KiwiSaver");
        By targetButtonSelector = menuColumnItemSelector("KiwiSaver calculators");
        interactions.hoverAndClick(menuToHoverOn, targetButtonSelector);
    }

    /******************    PAGE FUNCTIONS    ******************/

    public void navigateToCalculatorPage() {
        wait.forSelectorToExist(menuItemSelector("KiwiSaver"));
        clickKiwiSaverCalculatorButton();
    }
}
