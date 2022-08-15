import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestQuestionsTwo extends BaseTest {
    @Test
    public void test2() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickTwoQuestion();
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        assertEquals(expected, mainPage.getTwoQuestionText());
    }
}



