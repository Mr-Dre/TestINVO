package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"}, // будеть давать JSON отчеты
        features = {"classpath:features"},
        glue = {"step_defs"},
        dryRun = false,
        tags = {"@Regression"}
)

public class Runner {


}
