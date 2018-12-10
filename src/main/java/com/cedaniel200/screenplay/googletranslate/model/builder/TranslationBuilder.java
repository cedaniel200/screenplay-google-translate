package com.cedaniel200.screenplay.googletranslate.model.builder;

import com.cedaniel200.screenplay.googletranslate.model.Translation;

public class TranslationBuilder {

    private String text;
    private String sourceLanguage;
    private String targetLanguage;

    public TranslationBuilder(String text) {
        this.text = text;
    }

    public static TranslationBuilder theText(String text) {
        return new TranslationBuilder(text);
    }

    public TranslationBuilder from(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }

    public Translation to(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return new Translation(text, sourceLanguage, targetLanguage);
    }
}
