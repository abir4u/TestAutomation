package Wrappers;

import PageObjects.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertTrue;


public class Assertions extends Base {
    /**
     * Use this function to Assert if an element is present on the page.
     * @param selector is the selector for the target Element.
     * @return boolean value to assert the presence of the Element.
     */
    public boolean isElementPresent(By selector) {
        List<WebElement> els = getDriver().findElements(selector);
        return  (els.size() != 0) ? true : false;
    }

    /**
     * Use this function to compare string to be equal
     * @param expected is the expected string in a node
     * @param actual is the actual string in the node
     */
    public void expectStringToEqual(String expected, String actual) {
        assertTrue("Strings did not match:\nExpected String: " + expected + "\nActual String: " + actual, expected.equals(actual));
    }

    /**
     * Use this function to assert if a condition is true
     * @param condition is the condition to be checked
     * @param error is the error to be displayed if the condition is not true.
     */
    public void expectConditionToBeTrue(boolean condition, String error) {
        error = (error.equals("")) ? "A condition was expected to be true, but it returned false" : error;
        assertTrue(error, condition);
    }
}
