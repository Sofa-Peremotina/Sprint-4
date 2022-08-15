import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    public MainPage(WebDriver driver) {
        this.driver = driver;
        driver.get(pageUrl);
    }

    WebDriver driver;

    public final String pageUrl = "https://qa-scooter.praktikum-services.ru/";

    //кнопка куки
    private final By cookiesButton = By.className("App_CookieButton__3cvqF");
    //кнопка Заказать
    private final By orderButtonOne = By.className("Button_Button__ra12g");

    //кнопка 1 вопроса в FAQ
    private final By oneQuestionButton = By.id("accordion__heading-0");
    //текст 1 ответа в FAQ
    private final By getOneQuestionText = By.id("accordion__panel-0");

    //кнопка 2 вопроса в FAQ
    private final By twoQuestionButton = By.id("accordion__heading-1");
    //текст 2 ответа в FAQ
    private final By getTwoQuestionText = By.id("accordion__panel-1");

    //кнопка 3 вопроса в FAQ
    private final By threeQuestionButton = By.id("accordion__heading-2");
    //текст 3 ответа в FAQ
    private final By getThreeQuestionText = By.id("accordion__panel-2");

    //кнопка 4 вопроса в FAQ
    private final By fourQuestionButton = By.id("accordion__heading-3");
    //текст 4 ответа в FAQ
    private final By getFourQuestionText = By.id("accordion__panel-3");

    //кнопка 5 вопроса в FAQ
    private final By fiveQuestionButton = By.id("accordion__heading-4");
    //текст 5 ответа в FAQ
    private final By getFiveQuestionText = By.id("accordion__panel-4");

    //кнопка 6 вопроса в FAQ
    private final By sixQuestionButton = By.id("accordion__heading-5");
    //текст 6 ответа в FAQ
    private final By getSixQuestionText = By.id("accordion__panel-5");

    //кнопка 7 вопроса в FAQ
    private final By sevenQuestionButton = By.id("accordion__heading-6");
    //текст 7 ответа в FAQ
    private final By getSevenQuestionText = By.id("accordion__panel-6");

    //кнопка 8 вопроса в FAQ
    private final By eightQuestionButton = By.id("accordion__heading-7");
    //текст 8 ответа в FAQ
    private final By getEightQuestionText = By.id("accordion__panel-7");





    //клик по кнопке с куки
    public MainPage clickCookieButton() {

        driver.findElement(cookiesButton).click();
        return this;
    }

    //клик по кнопке Заказать
    public OrderPageOne clickOrderButtonOne() {

        driver.findElement(orderButtonOne).click();
        return new OrderPageOne(driver);
    }

    public void skroll() {
        WebElement element = driver.findElement(eightQuestionButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    //клик по кнопке 1 вопроса
    public MainPage clickOneQuestion() {
        driver.findElement(oneQuestionButton).click();
        return this;
    }

    //берем текст 1 вопроса
    public String getOneQuestionText() {
        return driver.findElement(getOneQuestionText).getText();
    }

    //клик по кнопке 2 вопроса
    public MainPage clickTwoQuestion() {
        driver.findElement(twoQuestionButton).click();
        return this;
    }

    //берем текст 2 вопроса
    public String getTwoQuestionText() {
        return driver.findElement(getTwoQuestionText).getText();
    }

    //клик по кнопке 3 вопроса
    public MainPage clickThreeQuestion() {
        driver.findElement(threeQuestionButton).click();
        return this;
    }

    //берем текст 3 вопроса
    public String getThreeQuestionText() {
        return driver.findElement(getThreeQuestionText).getText();
    }

    //клик по кнопке 4 вопроса
    public MainPage clickFourQuestion() {
        driver.findElement(fourQuestionButton).click();
        return this;
    }

    //берем текст 4 вопроса
    public String getFourQuestionText() {
        return driver.findElement(getFourQuestionText).getText();
    }

    //клик по кнопке 5 вопроса
    public MainPage clickFiveQuestion() {
        driver.findElement(fiveQuestionButton).click();
        return this;
    }

    //берем текст 5 вопроса
    public String getFiveQuestionText() {
        return driver.findElement(getFiveQuestionText).getText();
    }

    //клик по кнопке 6 вопроса
    public MainPage clickSixQuestion() {
        driver.findElement(sixQuestionButton).click();
        return this;
    }

    //берем текст 6 вопроса
    public String getSixQuestionText() {
        return driver.findElement(getSixQuestionText).getText();
    }
    //клик по кнопке 7 вопроса
    public MainPage clickSevenQuestion() {
        driver.findElement(sevenQuestionButton).click();
        return this;
    }

    //берем текст 7 вопроса
    public String getSevenQuestionText() {
        return driver.findElement(getSevenQuestionText).getText();
    }

    //клик по кнопке 8 вопроса
    public MainPage clickEightQuestion() {
        driver.findElement(eightQuestionButton).click();
        return this;
    }

    //берем текст 8 вопроса
    public String getEightQuestionText() {
        return driver.findElement(getEightQuestionText).getText();
    }
}
