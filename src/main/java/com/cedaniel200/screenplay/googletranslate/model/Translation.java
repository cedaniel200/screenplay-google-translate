package com.cedaniel200.screenplay.googletranslate.model;

import com.cedaniel200.screenplay.googletranslate.exceptions.CreationTranslationModelException;

import static com.cedaniel200.screenplay.googletranslate.util.Validate.isEmptyOrNull;

public class Translation {

    private final String text;
    private final String sourceLanguage;
    private final String targetLanguage;

    public Translation(String text, String sourceLanguage, String targetLanguage) {
        this.text = text;
        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
        isValid();
    }

    private void isValid() {
        if (isEmptyOrNull(text) ||
                isEmptyOrNull(sourceLanguage) ||
                isEmptyOrNull(targetLanguage)) {
            throw new CreationTranslationModelException(this);
        }
    }

    public String getText() {
        return text;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public String getTargetLanguage() {
        return targetLanguage;
    }
}
