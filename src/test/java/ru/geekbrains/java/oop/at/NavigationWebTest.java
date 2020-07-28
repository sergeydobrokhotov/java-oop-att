package ru.geekbrains.java.oop.at;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.geekbrains.java.oop.at.base.BaseWebTest;
import ru.geekbrains.java.oop.at.page.ContentPage;

import java.util.stream.Stream;

import static java.lang.Thread.sleep;

public class NavigationWebTest extends BaseWebTest {



    @BeforeEach
    public void beforeEach() {
        driver.get("https://geekbrains.ru/events");
    }

    @AfterEach
    void tearDown() {
        ContentPage contentPage = PageFactory.initElements(driver, ContentPage.class);

        wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getHeader()));
        wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getFooter()));
    }

    @DisplayName("Блог")
    @Test
    public void posts() {
        String namePage="Блог";
        ContentPage contentPage = new ContentPage(driver);

        contentPage.getNavigation().getButton(namePage).click();
        contentPage.getButtonClosePopUp1().click();
        contentPage.getButtonClosePopUp2().click();

        contentPage.checkNamePage(namePage);
    }

    @DisplayName("Нажатие на элемент навигации")
    @ParameterizedTest
    @MethodSource("dataProvider")
    public void courses(String namePage) {
        ContentPage contentPage = new ContentPage(driver);
        contentPage.getNavigation().getButton(namePage).click();
        contentPage.checkNamePage(namePage);
    }

    public static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("Форум"),
                Arguments.of("Вебинары"),
                Arguments.of("Тесты"),
                Arguments.of("Карьера")
//                Arguments.of("Курсы", "courses")
        );
    }


}
