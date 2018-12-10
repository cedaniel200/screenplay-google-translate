package com.cedaniel200.screenplay.googletranslate.stepdefinitions;

import com.cedaniel200.screenplay.googletranslate.exceptions.CreationTranslationModelException;
import com.cedaniel200.screenplay.googletranslate.questions.Translated;
import com.cedaniel200.screenplay.googletranslate.userinterfaces.GoogleTranslateHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.cedaniel200.screenplay.googletranslate.model.builder.TranslationBuilder.theText;
import static com.cedaniel200.screenplay.googletranslate.tasks.Translate.translate;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.Is.is;

public class TranslateTextStepDefinitions {

    private static final String CESAR = "Cesar";
    private GoogleTranslateHomePage googleTranslateHomePage;

    @Before
    public void prepararEscenario(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^I want to translate$")
    public void iWantToTranslate() throws Exception {
        theActorCalled(CESAR).wasAbleTo(
                Open.browserOn(googleTranslateHomePage)
        );
    }

    @When("^I translate the text (.*) from the (.*) to the (.*)$")
    public void translateText(String text, String sourceLanguage, String targetLanguage) throws CreationTranslationModelException {
        theActorInTheSpotlight().attemptsTo(
                translate(theText(text).from(sourceLanguage).to(targetLanguage))
        );
    }

    @Then("^should see that the translated text is (.*)$")
    public void shouldSeeThatTheTranslatedTextIs(String translatedText) throws Exception {
        theActorInTheSpotlight().should(seeThat(Translated.text(), is(translatedText)));
    }

}
