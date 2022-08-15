import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestQuestionsFour extends BaseTest {
    @Test
    public void test4() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickFourQuestion();
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        assertEquals(expected, mainPage.getFourQuestionText());
    }
}