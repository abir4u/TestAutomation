package Utils;


import PageObjects.Base;
import org.junit.Assert;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Helper extends Base {

    public static String getConfigValue(String key) {
        Properties config = new Properties();

        try {
            String filename = "";
            if (System.getProperty("os.name").contains("Win")) {
                filename = "properties\\config";
            } else {
                filename = "properties/config";
            }
            config.load(new FileInputStream("target/classes/" + filename));
        } catch (Throwable t) {
            System.out.print("Issue loading properties file");
            t.printStackTrace();
        }
        return config.getProperty(key);

    }

    public static String getValueForRowInDataTable(List<List<String>> dataTableRows, String alphaElement) {
        for (List<String> eachTableRow : dataTableRows) {
            if (eachTableRow.get(0).matches(alphaElement)) {
                return eachTableRow.get(1);
            }
        }
        return null;
    }
}

