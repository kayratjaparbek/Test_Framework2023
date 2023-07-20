package org.UI;

import org.UI.dataProviders.ConfigReader;
import org.UI.driverFactory.Driver;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        System.out.println(ConfigReader.getProperty("browser"));

        Driver.getDriver().get("https://habr.com/ru/hub/it-infrastructure/");


        Thread.sleep(4000);
        Driver.closeDriver();



    }
}
