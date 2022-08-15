import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestQuestionsEight extends BaseTest {
    @Test
    public void test8() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickEightQuestion();
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        assertEquals(expected, mainPage.getEightQuestionText());

    }
}