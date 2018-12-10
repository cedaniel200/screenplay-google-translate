package com.cedaniel200.screenplay.googletranslate.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://translate.google.com.co/")
public class GoogleTranslateHomePage extends PageObject {


    public static final Target BUTTON_TO_SELECT_SOURCE_LANGUAGE = Target.the("button to select source language")
            .locatedBy("//div[@class='sl-more tlid-open-source-language-list']");

    public static final Target BUTTON_TO_SELECT_TARGET_LANGUAGE = Target.the("button to select target language")
            .locatedBy("//div[@class='tl-more tlid-open-target-language-list']");

    public static final Target TARGET_LANGUAGE = Target.the("target language {0}")
            .locatedBy("/html/body/div[2]/div[3]/div/div[2]/div[2]/div[2]/div/div[2]//div[contains(text(), '{0}')]");

    public static final Target SOURCE_LANGUAGE = Target.the("source  language {0}")
            .locatedBy("/html/body/div[2]/div[3]/div/div[2]/div[1]/div[2]/div/div[3]//div[contains(text(), '{0}')]");

    public static final Target TEXT_AREA_FOR_SOURCE_LANGUAGE = Target.the("text area for source language")
            .located(By.id("source"));

    public static final Target TEXT_AREA_FOR_TARGET_LANGUAGE = Target.the("text area for target language")
            .locatedBy("//div[@class='tlid-results-container results-container']");

}
