package com.ALH_Group.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/ALH_Group/step_definitions",
        features = "@target/cucumber-reports/rerun.txt"

)


public class FailedTestRunner {


}
