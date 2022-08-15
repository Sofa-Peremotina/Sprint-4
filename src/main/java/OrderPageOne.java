import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageOne {
    //первая страница заказа
    public OrderPageOne(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    private final By userNameInput = By.xpath("//input[@placeholder = '* Имя']");
    private final By userSurnameInput = By.xpath("//input[@placeholder = '* Фамилия']");
    private final By userAddressInput = By.xpath("//input[@placeholder = '* Адрес: куда привезти заказ']");
    private final By metroDropdown = By.className("select-search__input");
    private final By metroStationForTestOneDropdown = By.xpath("//div[@class = 'select-search__select']//button[@value = '36']");
    private final By metroStationForTestTwoDropdown = By.xpath("//div[@class = 'select-search__select']//button[@value = '15']");

    private final By userPhoneInput = By.xpath("//input[@placeholder = '* Телефон: на него позвонит курьер']");
    private final By nextButton = By.xpath("//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

    //ввести значение в поле Имя
    public OrderPageOne printUserName(String userName) {

        driver.findElement(userNameInput).sendKeys(userName);
        return this;
    }

    //ввести значение в поле Фамилия
    public OrderPageOne printUserSurname(String userSurname) {

        driver.findElement(userSurnameInput).sendKeys(userSurname);
        return this;
    }

    //ввести значение в поле Адрес
    public OrderPageOne printUserAddress(String userAddress) {

        driver.findElement(userAddressInput).sendKeys(userAddress);
        return this;
    }

    //кликнуть по полю Станция метро
    public OrderPageOne clickMetro() {

        driver.findElement(metroDropdown).click();
        return this;
    }

    //выбрать станцию метро из списка для первого теста
    public OrderPageOne clickMetroStationOne() {

        driver.findElement(metroStationForTestOneDropdown).click();
        return this;
    }

    //выбрать станцию метро из списка для второго теста
    public OrderPageOne clickMetroStationTwo() {

        driver.findElement(metroStationForTestTwoDropdown).click();
        return this;
    }

    //ввести значение в поле Телефон
    public OrderPageOne printPhoneNumber(String phoneNumber) {

        driver.findElement(userPhoneInput).sendKeys(phoneNumber);
        return this;
    }

    //клик по кнопке Далее
    public OrderPageTwo clickNextButton() {

        driver.findElement(nextButton).click();
        return new OrderPageTwo(driver);
    }
}
