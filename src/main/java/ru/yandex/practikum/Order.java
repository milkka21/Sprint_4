package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Order extends BasePage { //описывает главную страницу
    private By orderButton = By.className("Button_Button__ra12g"); //локатор кнопки заказать
    private By orderName = By.xpath("//input[@placeholder='* Имя']"); //имя
    private By orderSurname = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    private By address = By.xpath("//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    private By station = By.className("select-search__input");
    private By stationMetroBulvar =By.xpath("//button[@value=1]");
    private By stationMetroSokolniki =By.xpath("//button[@value=4]");
    private By number = By.xpath("//input[@placeholder='* Телефон: на него позвонит курьер']");
    private By nextButton = By.xpath("//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");


    private By dayOrder=By.xpath("//input[@placeholder='* Когда привезти самокат']");
    private By headingSamokat = By.xpath(".//div[@class='Order_Header__BZXOb']");
    private By Arenda = By.xpath(".//div[@class='Dropdown-control']/div[@class='Dropdown-placeholder']");
    private By ArendaTwoDay = By.xpath(".//div[@class='Dropdown-menu']/div[2]");
    private By ArendaThreeDay = By.xpath(".//div[@class='Dropdown-menu']/div[3]");
    private By ColorBlack = By.xpath(".//label[@class='Checkbox_Label__3wxSf']/input[@id='black']");
    private By ColorGray = By.xpath(".//label[@class='Checkbox_Label__3wxSf']/input[@id='grey']");
    private By Courier = By.xpath(".//input[@class='Input_Input__1iN_Z Input_Responsible__1jDKN']");
    private By ButtonOrder = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private By yesButton = By.xpath(".//div[@class='Order_Buttons__1xGrp']/button[text() ='Да']");
    protected By buttonViewOrder = By.xpath(".//div[@class='Order_NextButton__1_rCA']/button[text()='Посмотреть статус']");

    private By Samokat = By.xpath(".//img[@src='/assets/scooter.svg']");
    private By Yandex = By.xpath(".//img[@src='/assets/ya.svg']");
private By ErrorMessage = By.xpath(".//div[@class='Input_ErrorMessage__3HvIb Input_Visible___syz6']");


    public Order (WebDriver webDriver) {
        super(webDriver);
    }
    public void clickOrderButton() { webDriver.findElement(orderButton).click(); }
    public void enterName(String text) { webDriver.findElement(orderName).sendKeys(text);}
    public void enterSurname(String text) {
        webDriver.findElement(orderSurname).sendKeys(text);
    }
    public void enterAddress(String text) {
        webDriver.findElement(address).sendKeys(text);
    }
    public void clickStation() {webDriver.findElement(station).click(); }
    public void clickStationBulvar() {webDriver.findElement(stationMetroBulvar).click(); }
    public void clickStationSokolniki() {webDriver.findElement(stationMetroSokolniki).click(); }
    public void enterNumber(String text) {
        webDriver.findElement(number).sendKeys(text);
    }
    public void clickNextButton() {webDriver.findElement(nextButton).click(); }
    public void clickDayOrder (String day) {webDriver.findElement(dayOrder).sendKeys(day);}
    public void clickEmptySpace() {webDriver.findElement(headingSamokat).click();}
    public void clickArenda(){webDriver.findElement(Arenda).click();}
    public void clickArendaTwoDay() {webDriver.findElement(ArendaTwoDay).click();}
    public void clickArendahreeDay() {webDriver.findElement(ArendaThreeDay).click();}
    public void clickColorBlack() {webDriver.findElement(ColorBlack).click();}
    public void clickColorGray () {webDriver.findElement(ColorGray).click();}
    public void enterCourier(String text) {
        webDriver.findElement(Courier).sendKeys(text);
    }
    public void clickButtonOrderOne () {webDriver.findElement(ButtonOrder).click();}
    public void clickYesButton () {webDriver.findElement(yesButton).click();}


    public boolean displayButtonViev () {return webDriver.findElement(buttonViewOrder).isDisplayed();};
    public void clickButtonViewOrder () {webDriver.findElement(buttonViewOrder).click();}


    public void clickSamokat () {webDriver.findElement(Samokat).click();}
    public boolean displaySamokat () {return webDriver.findElement(Samokat).isDisplayed();};

public void clickYandex () {webDriver.findElement(Yandex).click();}
    public boolean displayYandex () {return webDriver.findElement(Yandex).isDisplayed();};
public boolean ErrorNameText () {return webDriver.findElement(ErrorMessage).isDisplayed();}


    }
