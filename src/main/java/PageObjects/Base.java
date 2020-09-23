package PageObjects;

import Utils.Helper;
import Wrappers.Assertions;
import Wrappers.Elements;
import Wrappers.Interactions;
import Wrappers.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class Base {

    private static WebDriver driver;

    static protected Assertions assertions;
    static protected Elements elements;
    static protected Interactions interactions;
    static protected Wait wait;

    static protected Homepage homepage;
    static protected CalculatorsPage calculatorsPage;
    static protected RetirementCalculatorPage retirementCalculatorPage;



    public WebDriver Setup() {
        setSystemProperties();
        try {
            InitiateDriver();
        } catch (Exception e) {
        }
        InitializePages();
        return driver;
    }

    private void setSystemProperties() {
        String path = System.getProperty("user.dir") + "/drivers/";

        if (System.getProperty("os.name").contains("Win")) {
            System.setProperty("webdriver.chrome.driver", path + "win/chromedriver.exe");
            System.setProperty("webdriver.firefox.marionette", path + "win/geckodriver.exe");

        } else if (System.getProperty("os.name").contains("Mac")) {
            System.setProperty("webdriver.chrome.driver", path + "mac/chromedriver");
            System.setProperty("webdriver.gecko.driver", path + "mac/geckodriver");
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void getPage(String _url) {
        driver.get(_url);
    }

    public void InitializePages() {

        homepage = PageFactory.initElements(driver, Homepage.class);
        calculatorsPage = PageFactory.initElements(driver, CalculatorsPage.class);
        retirementCalculatorPage = PageFactory.initElements(driver, RetirementCalculatorPage.class);

        assertions = PageFactory.initElements(driver, Assertions.class);
        elements = PageFactory.initElements(driver, Elements.class);
        interactions = PageFactory.initElements(driver, Interactions.class);
        wait = PageFactory.initElements(driver, Wait.class);
    }

    private WebDriver InitiateDriver() throws Exception {
        String browser;
        System.out.println("Initiating WebDriver");
        DesiredCapabilities cap = new DesiredCapabilities();
        String _browser = System.getProperty("browser");
        if (null != _browser && !_browser.isEmpty()) {
            browser = _browser;
        } else {
            browser = Helper.getConfigValue("default.browser");
        }
        switch (browser.toLowerCase()) {
            case "chrome":
                ChromeOptions option = new ChromeOptions();
                option.setExperimentalOption("useAutomationExtension", false);
                option.addArguments("--disable-infobars");
                this.driver = new ChromeDriver(option);
                break;

            case "firefox":
                if (System.getProperty("os.name").contains("Mac")) {
                    FirefoxProfile profile = new FirefoxProfile();
                    this.driver = new FirefoxDriver(profile);
                } else {
                    cap = DesiredCapabilities.firefox();
                    cap.setCapability("platform", "Windows 7");
                    this.driver = new FirefoxDriver(cap);
                }
                break;
            default:
                fail("Unknown browser");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return this.driver;
    }

}


