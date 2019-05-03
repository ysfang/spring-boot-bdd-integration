package com.changehealthcare.scpe.bdd;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber", "junit:target/junit-report.xml"}
        , features = "src/bdd-test/resources/features"
)
@ActiveProfiles(value = "test")
public class DemoFeatureRunner {
}




