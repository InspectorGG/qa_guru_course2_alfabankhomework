package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.visible;
class AlfaBankHomeTest {
    @Test
    void AlfaBankHomeTest() {

        open("https://alfabank.ru/");
        Configuration.holdBrowserOpen = true;

        $("body").shouldHave(Condition.text("Вклады"));
        $(byLinkText("Вклады")).click();

        $("body").shouldHave(Condition.text("Депозиты"));
        $(byLinkText("Депозиты")).click();

        $("body").shouldHave(Condition.text("Архивные депозиты"));
        $$(byText("Архивные депозиты")).find(visible).click();
        $("body").shouldHave(Condition.text("Максимальный доход при открытии до 31 января 2019"));
        $("body").shouldHave(Condition.text("Растущая процентная"));
        $("body").shouldHave(Condition.text("Высокий доход при открытии до 31 мая 2019"));
    }
    @Test
    public void AlfaBank(){

        open("https://alfabank.ru/make-money/deposits/archive/");
        $("html").shouldHave(Condition.text("Максимальный доход при открытии до 31 января 2019"));
        $("html").shouldHave(Condition.text("Растущая процентная"));
        $("html").shouldHave(Condition.text("Высокий доход при открытии до 31 мая 2019"));
    }
}
