package ru.test;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selectors.*;

public class SomeTest {
    @Test
    void shouldSearch() {
        //cccgit commit -m "first commit"
        open("http://google.com/ncr");
        element(byName("q")).setValue("selenide").pressEnter();
        elements("#search .g").shouldHave(sizeGreaterThanOrEqual(6)).first().shouldHave(text("Selenide: concise UI tests in Java"))
                .find(".r>a").click();

        open("http://google.com/ncr");
        open("http://google.com/ncr");
        open("http://google.com/ncr");
    }


}


