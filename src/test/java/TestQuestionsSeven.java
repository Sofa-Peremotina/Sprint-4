import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestQuestionsSeven extends BaseTest {
    @Test
    public void test7() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickSevenQuestion();
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        assertEquals(expected, mainPage.getSevenQuestionText());
    }
}
