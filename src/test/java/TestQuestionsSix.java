import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestQuestionsSix extends BaseTest {
    @Test
    public void test5() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickSixQuestion();
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        assertEquals(expected, mainPage.getSixQuestionText());
    }
}
