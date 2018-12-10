package com.cedaniel200.screenplay.googletranslate.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions( features = {"src/test/resources/features/translate_text.feature"},
        glue = {"com.cedaniel200.screenplay.googletranslate.stepdefinitions"},
        snippets = SnippetType.CAMELCASE)
public class TranslateText {

}
