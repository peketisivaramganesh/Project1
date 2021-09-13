import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\Test\Resources",
        plugin = {"pretty",
                "html:target/cucumber-reports","json:target/cucumber.json","junit:target/cucumber-reports/Cucumber.xml"},
        monochrome = true,
        strict=true        )


public class CucumberTest {
}