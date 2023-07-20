package org.UI.page;

import org.UI.driverFactory.Driver;
import org.UI.helper.WebElementActions;
import org.openqa.selenium.support.PageFactory;
/**
 * @author Kayrat Japarbek
 */

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    WebElementActions webElementActions = new WebElementActions();
}
