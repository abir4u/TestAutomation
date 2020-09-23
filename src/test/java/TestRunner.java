import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = "classpath:features",
        glue = "StepDefinitions",
        plugin = {"json:target/cucumber"}

)
public class TestRunner {
}

