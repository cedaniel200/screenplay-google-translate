Feature: Translate text
  I as a user want to translate a text to be happy

  Scenario Outline: Translate text
    Given I want to translate
    When I translate the text <text to be translated> from the <source language> to the <target language>
    Then should see that the translated text is <translated text>

    Examples:
      | source language | text to be translated | target language | translated text  |
      | Español         | hola mundo            | Italiano        | ciao mondo       |
      | Español         | manzana               | Italiano        | mela             |
      | Español         | Suerte en el examen   | Inglés          | Luck on the exam |