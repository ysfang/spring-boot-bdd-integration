package com.changehealthcare.scpe.bdd.steps.pageutil;

import net.thucydides.core.annotations.Step;

public class NavigateTo {
    IndexPage indexPage = new IndexPage();
    private final String HOST = "http://localhost:8090/";

    @Step("Open page")
    public void toPage(String path) {
        indexPage.setDefaultBaseUrl(HOST + path);
        indexPage.open();
    }
}
