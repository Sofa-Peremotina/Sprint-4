import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageTwo {

    public OrderPageTwo(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;

    private final By deliveryDateInput = By.xpath("//input[@placeholder = '* Когда привезти самокат']");
    private final By rentalPeriodDropdown = By.className("Dropdown-arrow");
    private final By amountOfDaysDropdown = By.xpath("//div[@class = 'Dropdown-menu']/div[4]");
    private final By scooterColorForTestOneCheckbox = By.id("black");
    private final By scooterColorForTestTwoCheckbox = By.id("grey");

    private final By commentInput = By.xpath("//input[@placeholder = 'Комментарий для курьера']");
    private final By orderButtonDown = By.xpath("//div[@class = 'Order_Buttons__1xGrp']/button[2]");
    private final By confirmTheOrderButton = By.xpath("//button[@text() = 'Да']");
    private final By successfulOrderModal = By.className("Order_Modal__YZ-d3");

    //ввести значение в поле Даты доставки самоката
    public OrderPageTwo printDeliveryDate(String date) {

        driver.findElement(deliveryDateInput).sendKeys(date);
        return this;
    }

    //Клик по полю со сроком аренды
    public OrderPageTwo clickRentalPeriod() {
        driver.findElement(rentalPeriodDropdown).click();
        return this;
    }

    //Клик по количеству дней адренды из списка
    public OrderPageTwo clickAmountOfDays() {

        driver.findElement(amountOfDaysDropdown).click();
        return this;
    }

    //Выбрать цвет самоката для первого теста
    public OrderPageTwo clickScooterColorOne() {

        driver.findElement(scooterColorForTestOneCheckbox).click();
        return this;
    }

    //Выбрать цвет самоката для второго теста
    public OrderPageTwo clickScooterColorTwo() {

        driver.findElement(scooterColorForTestTwoCheckbox).click();
        return this;
    }

    //ввести комментарий для курьера
    public OrderPageTwo printComment(String comment) {

        driver.findElement(commentInput).sendKeys(comment);
        return this;
    }

    //клик по нижней кнопке Заказать
    public OrderPageTwo clickOrderButtonDown() {

        driver.findElement(orderButtonDown).click();
        return this;
    }

    //клик по кнопке подтверждения заказа
    public OrderPageTwo clickConfirmTheOrder() {
        driver.findElement(confirmTheOrderButton).click();
        return this;
    }

    //отображение модалки успешного заказа
    public boolean getModalSuccessfulOrder() {

        return driver.findElement(successfulOrderModal).isDisplayed();
    }
}
