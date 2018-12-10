package com.cedaniel200.screenplay.googletranslate.exceptions;

import com.cedaniel200.screenplay.googletranslate.model.Translation;

public class CreationTranslationModelException extends IllegalStateException {

    private static final String MESSAGE = "State of the translation " +
                    "model is wrong. values text= %s " +
                    "sourceLanguage= %s " +
                    " targetLanguage= %s";

    public CreationTranslationModelException(Translation translation) {
        super(String.format(MESSAGE,
                translation.getText(),
                translation.getSourceLanguage(),
                translation.getTargetLanguage()));
    }
}
