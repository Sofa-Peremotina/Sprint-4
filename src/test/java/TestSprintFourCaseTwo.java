import org.junit.Test;
import static junit.framework.TestCase.assertTrue;

public class TestSprintFourCaseTwo extends BaseTest{

    @Test
    public void test() {
        MainPage mainPage = new MainPage(driver);
        boolean result = mainPage.clickCookieButton()
                .clickOrderButtonOne()
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