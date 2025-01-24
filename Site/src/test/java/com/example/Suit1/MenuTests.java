package com.example.Suit1;

import org.testng.annotations.Test;


//import org.apache.commons.io.FileUtils;

public class MenuTests extends TestBase {

    @Test
    public void businessZayavkaTest() {
        app.gotoBusinessSection();
        app.fillCheckForm("Петр", "+7 999 999 99 99");
    }


}
