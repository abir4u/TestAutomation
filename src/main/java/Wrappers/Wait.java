package Wrappers;

import PageObjects.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait extends Base {
    /**
     * This private function is to be used to create wrapper methods for wait functionalities specific to the application.
     * @return a WebDriverWait that make use of explicit custom waits to cater to the needs of the application.
     */
    private WebDriverWait explicitWait() {
        return new WebDriverWait(getDriver(), 30);
    }

    /**
     * Use this function to wait for an element to exist/complete loading.
     * @param element is the target Element for which the wait is being performed.
     */
    public void forElementToExist(WebElement element) {
        explicitWait().until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * Use this function to wait for Element to become clickable.
     * @param element is the target Element for which the wait is being performed.
     * @return the Element that has to be clicked.
     */
    public WebElement forElementToBeClickable(WebElement element) {
        return explicitWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Use this function to wait for a selector to exist/complete loading.
     * @param selector is the target Selector for which the wait is being performed.
     */
    public void forSelectorToExist(By selector) {
        explicitWait().until(ExpectedConditions.visibilityOfElementLocated(selector));
    }

    /**
     * Use this function to wait for a selector to disappear.
     * @param selector is the target Selector for which the wait is being performed.
     */
    public void forSelectorToDisappear(By selector) {
        explicitWait().until(ExpectedConditions.invisibilityOfElementLocated(selector));
    }
}
