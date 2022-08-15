import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestQuestionsOne extends BaseTest {

    @Test
    public void test1() {
        MainPage mainPage = new MainPage(driver);
        //кликаем по кнопке с куками, скроллим до последнего вопроса в FAQ
        mainPage.clickCookieButton()
                .skroll();
        //кликаем по 1 вопросу (если указыва этот метод просто .clickOneQuestion() после скролла, то появлялась ошибка
        // пока решила оставить так, потом поресёчу еще)
        mainPage.clickOneQuestion();
        //ожидаемый текст
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        //сравниваем ОР и ФР
        assertEquals(expected, mainPage.getOneQuestionText());
    }
}
