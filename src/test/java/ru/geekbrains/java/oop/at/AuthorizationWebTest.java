package ru.geekbrains.java.oop.at;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.geekbrains.java.oop.at.base.BeforeAndAfterStep;
import ru.geekbrains.java.oop.at.block.HeaderBlock;
import ru.geekbrains.java.oop.at.page.sing.AuthorizationPage;

@Feature("Авторизация")
@Story("Проверка авторизации")
@DisplayName("Проверка авторизации")
public class AuthorizationWebTest extends BeforeAndAfterStep {

    @DisplayName("Проверка авторизации с корректными данными")
    @Test
    void events() {
        String login = "hao17583@bcaoo.com";
        String password = "hao17583";
        new AuthorizationPage(driver) {
            @Override
            public HeaderBlock getHeader() {
                return null;
            }
        }
                .openUrl()
                .authorization(login, password)
                .checkNamePage("Главная");
    }

}
