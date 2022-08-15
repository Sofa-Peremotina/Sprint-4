import org.junit.Test;
import static junit.framework.TestCase.assertTrue;

public class TestSprintFourCaseOne extends BaseTest{

    @Test
    public void test() {
        MainPage mainPage = new MainPage(driver);
        boolean result = mainPage.clickCookieButton()
                .clickOrderButtonOne()
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
}