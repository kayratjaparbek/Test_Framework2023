package uiTests;

import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.UI.dataProviders.ConfigReader;
import org.UI.driverFactory.Driver;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class LoginTests extends BaseUITest{
    String expectedErrorMessage = "Имя пользователя или пароль неверны. Попробуйте еще раз, убедившись, что клавиша CAPS LOCK выключена.";
    String expectedEmptyErrorMessage = "'Логин или почта' является обязательным";


    @Owner(value = "Kayrat Japarbek")
    @Story("Позитивные тесты")
    @Test(description = "Авторизация с неправильным именем пользователя")
    public void loginWithInvalidUsernameTest() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("qwe", ConfigReader.getProperty("password"));
        loginPage.clickSubmitBtn();
        assertEquals(loginPage.errorMessage.getText(), expectedErrorMessage);
    }

    @Owner(value = "Kayrat Japarbek")
    @Story("Позитивные тесты")
    @Test(description = "Авторизация с неправильным именем пользователя")
    public void loginWithInvalidPasswordTest() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword(ConfigReader.getProperty("username"), "123");
        loginPage.clickSubmitBtn();
        assertEquals(loginPage.errorMessage.getText(), expectedErrorMessage);
    }

    @Owner(value = "Kayrat Japarbek")
    @Story("Позитивные тесты")
    @Test(description = "Авторизация с неправильным именем пользователя")
    public void loginWithInvalidPasswordAndUsernameTest() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("123", "123");
        loginPage.clickSubmitBtn();
        assertEquals(loginPage.errorMessage.getText(), expectedErrorMessage);
    }

    @Owner(value = "Kayrat Japarbek")
    @Story("Позитивные тесты")
    @Test(description = "Авторизация с неправильным именем пользователя")
    public void loginWithEmptyUsernameTest() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword("", "123");
        loginPage.clickSubmitBtn();
        assertEquals(loginPage.emptyErrorMessage.getText(), expectedEmptyErrorMessage);
    }

    @Owner(value = "Kayrat Japarbek")
    @Story("Позитивные тесты")
    @Test(description = "Авторизация с неправильным именем пользователя")
    public void loginWithEmptyPasswordTest() {
        Driver.getDriver().navigate().to(ConfigReader.getProperty("qa_env"));
        loginPage.fillUpUsernameAndPassword(ConfigReader.getProperty("username"), "");
        loginPage.clickSubmitBtn();
        assertEquals(loginPage.emptyErrorMessage.getText(), expectedEmptyErrorMessage);
    }
}
