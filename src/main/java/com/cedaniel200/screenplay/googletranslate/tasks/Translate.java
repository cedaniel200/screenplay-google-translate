package com.cedaniel200.screenplay.googletranslate.tasks;

import com.cedaniel200.screenplay.googletranslate.model.Translation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.cedaniel200.screenplay.googletranslate.userinterfaces.GoogleTranslateHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Translate implements Task {

    private Translation translation;

    public Translate(Translation translation) {
        this.translation = translation;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_TO_SELECT_SOURCE_LANGUAGE),
                Click.on(SOURCE_LANGUAGE.of(translation.getSourceLanguage())),
                Click.on(BUTTON_TO_SELECT_TARGET_LANGUAGE),
                Click.on(TARGET_LANGUAGE.of(translation.getTargetLanguage())),
                Enter.theValue(translation.getText()).into(TEXT_AREA_FOR_SOURCE_LANGUAGE)
                );
    }

    public static Translate translate(Translation translation){
        return instrumented(Translate.class, translation);
    }
}
