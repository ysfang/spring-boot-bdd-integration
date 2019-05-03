package com.changehealthcare.scpe.bdd.steps.pageutil;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PagePlainText extends UIInteractionSteps {
    public Optional<String> getBody() {
        return findAll("//body")
                .stream()
                .map(WebElementFacade::getTextContent)
                .findFirst();
    }
}
