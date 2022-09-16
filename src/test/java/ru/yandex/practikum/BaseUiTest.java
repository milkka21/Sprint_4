package ru.yandex.practikum;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;
public abstract class BaseUiTest {
    protected WebDriver webDriver;   //вынесла вебдрайвер как поле и  вынесла локаторы


  //  @Before //вынесла открытие сервера для того, чтобы в тесте не было технических деталей
    // public void setup() {
       // WebDriverManager.chromedriver().setup();
       // webDriver = new ChromeDriver();
      //  webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       // webDriver.get("https://qa-scooter.praktikum-services.ru/");
   // }
@Before
public void setup() {
    WebDriverManager.firefoxdriver().setup();
    webDriver = new FirefoxDriver();
    webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    webDriver.get("https://qa-scooter.praktikum-services.ru/");
}


    @After
    public void tearDown() {
        webDriver.quit();
    }

}
