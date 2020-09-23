package Wrappers;

import PageObjects.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Elements extends Base {

    /**
     * Use this function to get the Element by a valid Xpath.
     * @param xpathValue is the literal xpath for the Element.
     * @return the WebElement.
     */
    public WebElement getElementByXpath(String xpathValue) {
        return getDriver().findElement(By.xpath(xpathValue));
    }

    /**
     * Use this function to get the Selector by a valid Xpath.
     * @param xpathValue is the literal xpath for the Element.
     * @return the locator.
     */
    public By getSelectorByXpath(String xpathValue) {
        return By.xpath(xpathValue);
    }

    /**
     * Use this function to get all the Elements by a valid Xpath.
     * @param xpathValue is the literal xpath for all the Elements.
     * @return the List of WebElement(s).
     */
    public List<WebElement> getElementsByXpath(String xpathValue) {
        return getDriver().findElements(By.xpath(xpathValue));
    }

    /**
     * Use this function to get the Element by a valid class name.
     * @param className is the literal class name for the Element.
     * @return the WebElement.
     */
    public WebElement getElementByClass(String className) {
        return getDriver().findElement(By.className(className));
    }

    /**
     * Use this function to get all the Elements by a valid class name.
     * @param className is the literal class name for all the Elements.
     * @return the List of WebElement(s).
     */
    public List<WebElement> getElementsByClass(String className) {
        return getDriver().findElements(By.className(className));
    }

    /**
     * Use this function to get the Element by a valid id.
     * @param idValue is the literal id for the Element.
     * @return the WebElement.
     */
    public WebElement getElementById(String idValue) {
        return getDriver().findElement(By.id(idValue));
    }

    /**
     * Use this function to get the Element by a valid name.
     * @param nameValue is the literal name for the Element.
     * @return the WebElement.
     */
    public WebElement getElementByName(String nameValue) {
        return getDriver().findElement(By.name(nameValue));
    }

    /**
     * Use this function to get the Element by its exact text value.
     * @param textValue is the literal text value for the Element.
     * @return the WebElement.
     */
    public WebElement getElementByText(String textValue) {
        return getDriver().findElement(By.xpath("//*[.='" + textValue + "']"));
    }

    /**
     * Use this function to get the child element of a given parent node.
     * @param parentElement is the parent element whose child node has to be retrieved.
     * @param xpathValue is the value of xpath for the known parent element.
     * @return the child WebElement for the given xpath.
     */
    public WebElement getChildForElement(WebElement parentElement, String xpathValue) {
        return parentElement.findElement(By.xpath(xpathValue));
    }

    public WebDriver switchToIFrame(By selector) {
        return getDriver().switchTo().frame(getDriver().findElement(selector));
    }
}
