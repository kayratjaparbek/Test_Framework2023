package uiTests;

import org.UI.driverFactory.Driver;
import org.UI.helper.WebElementActions;
import org.UI.page.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseUITest {

    LoginPage loginPage;
    WebElementActions webElementActions;

    @BeforeClass
    public void setUpUiTest() {
        loginPage = new LoginPage();
        webElementActions = new WebElementActions();

    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
