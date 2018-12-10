package com.cedaniel200.screenplay.googletranslate.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static com.cedaniel200.screenplay.googletranslate.userinterfaces.GoogleTranslateHomePage.TEXT_AREA_FOR_TARGET_LANGUAGE;

@Subject("text translated")
public class Translated implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return TEXT_AREA_FOR_TARGET_LANGUAGE.resolveFor(actor).getText();
    }

    public static Translated text() {
      return new Translated();
    }
}
