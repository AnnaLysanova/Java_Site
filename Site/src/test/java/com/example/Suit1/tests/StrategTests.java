package com.example.Suit1.tests;

import io.qameta.allure.Step;
import org.testng.annotations.Test;

public class StrategTests extends TestBase{

    @Test
    public void strategOpenTest() {

        app.openSecondMenu();
        app.openStrategPage();
    }

}
