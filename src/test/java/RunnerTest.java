import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags={"@TEST_POEC4-89"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json","junit:target/surefire-reports/cucumber.xml"},
        // features = {"src/test/resources"}
        glue ={"Steps"}
)
public class RunnerTest {
}

