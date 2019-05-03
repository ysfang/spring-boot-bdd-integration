package com.changehealthcare.scpe.bdd.steps;

import com.changehealthcare.scpe.bdd.BaseIntegrationTest;
import com.changehealthcare.scpe.bdd.steps.pageutil.NavigateTo;
import com.changehealthcare.scpe.bdd.steps.pageutil.PagePlainText;
import com.changehealthcare.scpe.service.HelloService;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class DemoFeatureTestSteps extends BaseIntegrationTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoFeatureTestSteps.class);

    @Autowired
    HelloService helloService;

    @Autowired
    PagePlainText pagePlainText;

    String resultOfGetHello;


    @Steps
    NavigateTo navigateTo;

    @Given("^context is initialized")
    public void contex_is_initialized() {
        LOGGER.debug("++ GIVEN -> Initializing needed context");
    }

    @When("^browse the page \"(.*)\"$")
    public void get_page_with_path(String path) {
        LOGGER.debug("++ WHEN -> Using Serenity PageObject to page: \"{}\"", path);

        navigateTo.toPage(path);
    }

    @When("^summon service \"(.*)\"$")
    public void call_service_method(String method) {
        LOGGER.debug("++ WHEN -> Calling service method: \"{}\"", method);

        resultOfGetHello = helloService.getHello();
    }

    @Then("^get result of \"(.*)\"$")
    public void verify_return_with(String str) {
        LOGGER.debug("++ THEN -> Verifying the returned String of method is: \"{}\"", str);

        assertThat(resultOfGetHello).isEqualTo(str);
    }

    @Then("^see \"(.*)\" on the page")
    public void see_page_with(String str) throws Throwable {
        LOGGER.debug("++ THEN -> Using Serenity UIInteractionSteps to examine the value of <body> is: \"{}\"", str);

        assertThat(pagePlainText.getBody()).isEqualTo(Optional.of(str));
    }
}
