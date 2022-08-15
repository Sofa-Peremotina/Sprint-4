import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestQuestionsThree extends BaseTest {

    @Test
    public void test1() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickThreeQuestion();
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        assertEquals(expected, mainPage.getThreeQuestionText());
    }
}