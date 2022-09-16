package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

public class MainPage extends BasePage {   //описывает главную страницу
        //вынесла локаторы
        private By orderStatusButton = By.className("Header_Link__1TAG7");
        private By orderNumberField = By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");
        private By goButton = By.xpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']");
        private By questionOne = By.id("accordion__heading-0");

    private By questionTwo = By.id("accordion__heading-1"); //локатор вопрос1
    private By questionThree = By.id("accordion__heading-2"); //вопрос2
    private By questionFour = By.id("accordion__heading-3");
    private By questionFive = By.id("accordion__heading-4");
    private By questionSix = By.id("accordion__heading-5");
    private By questionSeven = By.id("accordion__heading-6");
    private By questionEight = By.id("accordion__heading-7");


    private By answerOne = By.id("accordion__panel-0"); // локатор ответ1
    private By answerTwo = By.id("accordion__panel-1");
    private By answerThree = By.id("accordion__panel-2");
    private By answerFour = By.id("accordion__panel-3");
    private By answerFive = By.id("accordion__panel-4");
    private By answerSix = By.id("accordion__panel-5");
    private By answerSeven = By.id("accordion__panel-6");
    private By answerEight = By.id("accordion__panel-7");


    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }
        //вынесла методы для локаторов
        public void clickOrderStatusButton() {
          webDriver.findElement(orderStatusButton).click();
        }
    public void enterOrderNumber(String text) {
          webDriver.findElement(orderNumberField).sendKeys(text);
    }

    public void clickOrderButton() {
          webDriver.findElement(goButton).click();
    }

    public void scrollToFaq() {
        WebElement element = webDriver.findElement(questionOne);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", element);
    }
    public void clickOnQuestionOne() {
        webDriver.findElement(questionOne).click();
        String expectedQuestionOne = "Сколько это стоит? И как оплатить?";
        String actualQuestionOne = webDriver.findElement(questionOne).getText();
        String expectedAnswerOne = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        String actualAnswerOne = webDriver.findElement(answerOne).getText();
        assertEquals("Ошибка" , expectedQuestionOne, actualQuestionOne);
        assertEquals("Ошибка" , expectedAnswerOne, actualAnswerOne);
    }

    public void clickFaqTwo () {
        webDriver.findElement(questionTwo).click();
        String expectedQuestionTwo = "Хочу сразу несколько самокатов! Так можно?";
        String actualQuestionTwo = webDriver.findElement(questionTwo).getText();
        String expectedAnswerTwo = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        String actualAnswerTwo = webDriver.findElement(answerTwo).getText();
        assertEquals("Ошибка" , expectedQuestionTwo, actualQuestionTwo);
        assertEquals("Ошибка" , expectedAnswerTwo, actualAnswerTwo);
    }
    public void clickFaqThree () {
        webDriver.findElement(questionThree).click();
        String expectedQuestionThree = "Как рассчитывается время аренды?";
        String actualQuestionThree = webDriver.findElement(questionThree).getText();
        String expectedAnswerThree = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        String actualAnswerThree = webDriver.findElement(answerThree).getText();
        assertEquals("Ошибка" , expectedQuestionThree, actualQuestionThree);
        assertEquals("Ошибка" , expectedAnswerThree, actualAnswerThree);
    }
    public void clickFaqFour () {
        webDriver.findElement(questionFour).click();
        String expectedQuestionFour = "Можно ли заказать самокат прямо на сегодня?";
        String actualQuestionFour = webDriver.findElement(questionFour).getText();
        String expectedAnswerFour = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        String actualAnswerFour = webDriver.findElement(answerFour).getText();
        assertEquals("Ошибка" , expectedQuestionFour, actualQuestionFour);
        assertEquals("Ошибка" , expectedAnswerFour, actualAnswerFour);
    }
    public void clickFaqFive () {
        webDriver.findElement(questionFive).click();
        String expectedQuestionFive = "Можно ли продлить заказ или вернуть самокат раньше?";
        String actualQuestionFive = webDriver.findElement(questionFive).getText();
        String expectedAnswerFive = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        String actualAnswerFive = webDriver.findElement(answerFive).getText();
        assertEquals("Ошибка" , expectedQuestionFive, actualQuestionFive);
        assertEquals("Ошибка" , expectedAnswerFive, actualAnswerFive);
    }
    public void clickFaqSix () {
        webDriver.findElement(questionSix).click();
        String expectedQuestionSix = "Вы привозите зарядку вместе с самокатом?";
        String actualQuestionSix = webDriver.findElement(questionSix).getText();
        String expectedAnswerSix = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        String actualAnswerSix = webDriver.findElement(answerSix).getText();
        assertEquals("Ошибка" , expectedQuestionSix, actualQuestionSix);
        assertEquals("Ошибка" , expectedAnswerSix, actualAnswerSix);
    }
    public void clickFaqSeven () {
        webDriver.findElement(questionSeven).click();
        String expectedQuestionSeven = "Можно ли отменить заказ?";
        String actualQuestionSeven = webDriver.findElement(questionSeven).getText();
        String expectedAnswerSeven = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        String actualAnswerSeven = webDriver.findElement(answerSeven).getText();
        assertEquals("Ошибка" , expectedQuestionSeven, actualQuestionSeven);
        assertEquals("Ошибка" , expectedAnswerSeven, actualAnswerSeven);
    }
    public void clickFaqEight () {
        webDriver.findElement(questionEight).click();
        String expectedQuestionEight = "Я жизу за МКАДом, привезёте?";
        String actualQuestionEight = webDriver.findElement(questionEight).getText();
        String expectedAnswerEight = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        String actualAnswerEight = webDriver.findElement(answerEight).getText();
        assertEquals("Ошибка" , expectedQuestionEight, actualQuestionEight);
        assertEquals("Ошибка" , expectedAnswerEight, actualAnswerEight);
    }

}


