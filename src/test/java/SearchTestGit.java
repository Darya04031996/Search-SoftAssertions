import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class SearchTestGit {
    @Test
    void shouldFindSpecialTests() {

        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("input#wiki-pages-filter").setValue("SoftAssertions");
        $(".wiki-rightbar").shouldHave(text("SoftAssertions"));
        $(".wiki-rightbar").$(byText("SoftAssertions")).click();
        $(".markdown-heading.heading-element").shouldHave(text("3. Using JUnit5 extend test class:"));



    }
}

