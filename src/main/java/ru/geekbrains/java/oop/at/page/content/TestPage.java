package ru.geekbrains.java.oop.at.page.content;

import org.openqa.selenium.WebDriver;

public class TestPage extends HomePage {

    public TestPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public HomePage openUrl() {
        driver.get("https://geekbrains.ru/tests");
        return this;
    }
}
