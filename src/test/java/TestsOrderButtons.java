import org.junit.Test;
import static junit.framework.TestCase.assertTrue;

public class TestsOrderButtons extends BaseTest{

    @Test
    public void orderButtonUp() {
        MainPage mainPage = new MainPage(driver);
        boolean result = mainPage.clickCookieButton()
                .clickOrderButtonUp()
                .printUserName("Рик")
                .printUserSurname("Санчез")
                .printUserAddress("Измерение Ц-137")
                .clickMetro()
                .clickMetroStationOne()
                .printPhoneNumber("+79000000000")
                .clickNextButton()
                .printDeliveryDate("22.09.2022")
                .clickRentalPeriod()
                .clickAmountOfDays()
                .clickScooterColorOne()
                .printComment("Вабба-лабба-даб-дабс!")
                .clickOrderButtonDown()
                .clickConfirmTheOrder()
                .getModalSuccessfulOrder();
        assertTrue(result);
    }

    @Test
    public void orderButtonDown() {
        MainPage mainPage = new MainPage(driver);
        boolean result = mainPage.clickCookieButton()
                .clickOrderButtonDown()
                .printUserName("Джеффри")
                .printUserSurname("Лебовски")
                .printUserAddress("Сиэтл")
                .clickMetro()
                .clickMetroStationTwo()
                .printPhoneNumber("+79111111111")
                .clickNextButton()
                .printDeliveryDate("01.11.2022")
                .clickRentalPeriod()
                .clickAmountOfDays()
                .clickScooterColorTwo()
                .printComment("-")
                .clickOrderButtonDown()
                .clickConfirmTheOrder()
                .getModalSuccessfulOrder();
        assertTrue(result);
    }
}
