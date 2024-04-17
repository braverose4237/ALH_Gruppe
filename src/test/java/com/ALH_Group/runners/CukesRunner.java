package com.ALH_Group.runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber-reports/cucumber.json",
                "html:target/cucumber-reports/cucumber-report.html",
                "rerun:target/cucumber-reports/rerun.txt",
                "pretty"},
        features = "src/test/resources/features",
        glue = "com/ALH_Group/step_definitions",
        dryRun = false,
        tags = "@FNW-568"
)
public class CukesRunner {

}
