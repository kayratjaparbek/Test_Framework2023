package org.UI.driverFactory;

import org.UI.dataProviders.ConfigReader;
import org.openqa.selenium.WebDriver;
/**
 * @author Kayrat Japarbek
 */

public class Driver {
    private Driver() {}

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser").toLowerCase()) {
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();
                    break;
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.close();
                driver.quit();
                driver = null;
            }
        }catch (Exception e) {
            System.out.println("Ошибка закрытия драйвера!");
        }
    }
}
