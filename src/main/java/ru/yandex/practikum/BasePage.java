package ru.yandex.practikum;

import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected final WebDriver webDriver;

    protected BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}