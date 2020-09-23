package Wrappers;

import PageObjects.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Interactions extends Base {
    /**
     * Use this function to click an Element when it is clickable.
     * @param element is the Element to be clicked.
     */
    public void waitAndClick(WebElement element) {
        wait.forElementToBeClickable(element).click();
    }

    /**
     * Use this function to enter a given text in a text field
     * @param element is the Element for the target text field.
     * @param inputText is the value of the text to be entered.
     */
    public void enterTextInTextField(WebElement element, String inputText) {
        wait.forElementToExist(element);
        element.sendKeys(inputText);
    }

    /**
     * Use this function to choose an option in a dropdown.
     * @param dropdown is the Element for the target dropdown.
     * @param optionValue is the value of the option to be chosen.
     */
    public void chooseFromDropdown(WebElement dropdown, String optionValue) {
        waitAndClick(dropdown);
        WebElement option = elements.getElementByXpath("//*[@class='dropdown']//li[contains(.,'" + optionValue +"')]");
        waitAndClick(option);
    }

    /**
     * Use this function to hover over a target Element.
     * @param element is target WebElement to hover upon.
     */
    public Actions hover(WebElement element) {
        Actions action = new Actions(getDriver());
        return action.moveToElement(element);
    }

    /**
     * Use this function to hover over an element and then click on the same/another element.
     * @param elementToHover is the element which is to hovered upon.
     * @param selectorToClick is the selector of the element which is to be clicked.
     */
    public void hoverAndClick(WebElement elementToHover, By selectorToClick) {
        wait.forElementToExist(elementToHover);
        hover(elementToHover).perform();
        wait.forSelectorToExist(selectorToClick);
        WebElement elementToClick = getDriver().findElement(selectorToClick);
        hover(elementToHover).click(elementToClick).build().perform();
    }
}
