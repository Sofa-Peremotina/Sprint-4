import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestQuestions extends BaseTest {

    @Test
    public void questionOne() {
        MainPage mainPage = new MainPage(driver);
        //кликаем по кнопке с куками, скроллим до последнего вопроса в FAQ, кликаем по соотв.вопросу
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickUniversalQuestionFromElement(0);
        //ожидаемый текст
        String expected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        //сравниваем ОР и ФР
        String actual = mainPage.getUniversalTextFromElement(0);
        assertEquals(expected, actual);
    }

    @Test
    public void questionTwo() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickUniversalQuestionFromElement(1);
        String expected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actual = mainPage.getUniversalTextFromElement(1);
        assertEquals(expected, actual);
    }

    @Test
    public void questionThree() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickUniversalQuestionFromElement(2);
        String expected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actual = mainPage.getUniversalTextFromElement(2);
        assertEquals(expected, actual);
    }

    @Test
    public void questionFour() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickUniversalQuestionFromElement(3);
        String expected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actual = mainPage.getUniversalTextFromElement(3);
        assertEquals(expected, actual);
    }

    @Test
    public void questionFive() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickUniversalQuestionFromElement(4);
        String expected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actual = mainPage.getUniversalTextFromElement(4);
        assertEquals(expected, actual);
    }

    @Test
    public void questionSix() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickUniversalQuestionFromElement(5);
        String expected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actual = mainPage.getUniversalTextFromElement(5);
        assertEquals(expected, actual);
    }

    @Test
    public void questionSeven() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickUniversalQuestionFromElement(6);
        String expected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actual = mainPage.getUniversalTextFromElement(6);
        assertEquals(expected, actual);
    }

    @Test
    public void questionEight() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickCookieButton()
                .skroll();
        mainPage.clickUniversalQuestionFromElement(7);
        String expected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actual = mainPage.getUniversalTextFromElement(7);
        assertEquals(expected, actual);
    }
}