import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {

    public MainPage(WebDriver driver) {
        this.driver = driver;
        driver.get(pageUrl);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    WebDriver driver;
    WebDriverWait wait;


    public final String pageUrl = "https://qa-scooter.praktikum-services.ru/";

    //кнопка куки
    private final By cookiesButton = By.className("App_CookieButton__3cvqF");
    //кнопка Заказать верхняя
    private final By orderButtonUp = By.className("Button_Button__ra12g");
    //кнопка Заказать нижняя
    private final By orderButtonDown = By.xpath("//button[@class = 'Button_Button__ra12g Button_Middle__1CSJM']");

    //кнопка 1 вопроса в FAQ
//    private final By oneQuestionButton = By.id("accordion__heading-0");
//    //текст 1 ответа в FAQ
//    private final By oneQuestionText = By.id("accordion__panel-0");
//
//    //кнопка 2 вопроса в FAQ
//    private final By twoQuestionButton = By.id("accordion__heading-1");
//    //текст 2 ответа в FAQ
//    private final By twoQuestionText = By.id("accordion__panel-1");
//
//    //кнопка 3 вопроса в FAQ
//    private final By threeQuestionButton = By.id("accordion__heading-2");
//    //текст 3 ответа в FAQ
//    private final By threeQuestionText = By.id("accordion__panel-2");
//
//    //кнопка 4 вопроса в FAQ
//    private final By fourQuestionButton = By.id("accordion__heading-3");
//    //текст 4 ответа в FAQ
//    private final By fourQuestionText = By.id("accordion__panel-3");
//
//    //кнопка 5 вопроса в FAQ
//    private final By fiveQuestionButton = By.id("accordion__heading-4");
//    //текст 5 ответа в FAQ
//    private final By fiveQuestionText = By.id("accordion__panel-4");
//
//    //кнопка 6 вопроса в FAQ
//    private final By sixQuestionButton = By.id("accordion__heading-5");
//    //текст 6 ответа в FAQ
//    private final By sixQuestionText = By.id("accordion__panel-5");
//
//    //кнопка 7 вопроса в FAQ
//    private final By sevenQuestionButton = By.id("accordion__heading-6");
//    //текст 7 ответа в FAQ
//    private final By sevenQuestionText = By.id("accordion__panel-6");
//
//    //кнопка 8 вопроса в FAQ
    private final By eightQuestionButton = By.id("accordion__heading-7");

//    //текст 8 ответа в FAQ
//    private final By eightQuestionText = By.id("accordion__panel-7");

    //клик по кнопке с куки
    public MainPage clickCookieButton() {

        driver.findElement(cookiesButton).click();
        return this;
    }

    //клик по верхней кнопке Заказать
    public OrderPageOne clickOrderButtonUp() {

        driver.findElement(orderButtonUp).click();
        return new OrderPageOne(driver);
    }

    //клик по нижней кнопке Заказать
    public OrderPageOne clickOrderButtonDown() {
        driver.findElement(orderButtonDown).click();
        return new OrderPageOne(driver);
    }

    //скролл до последнего элемента FAQ
    public WebElement skroll() {
        WebElement element = driver.findElement(eightQuestionButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        return element;
    }

    //универсальный метод для получения текста вопросов с ожиданием
    public String getUniversalTextFromElement(int number) {
        By questionText = By.id("accordion__panel-" + number);
        wait.until(ExpectedConditions.visibilityOfElementLocated(questionText));
        return driver.findElement(questionText).getText();
    }

    //универсальный метод для клика по вопросу
    public MainPage clickUniversalQuestionFromElement(int num) {
        By questionButton = By.id("accordion__heading-" + num);
        driver.findElement(questionButton).click();
        return this;
    }
}
