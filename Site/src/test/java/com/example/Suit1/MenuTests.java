package com.example.Suit1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


//import org.apache.commons.io.FileUtils;

public class MenuTests {
    private WebDriver driver;
    private String baseUrl;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "");
        driver = WebDriverManager.chromedriver().create();
        baseUrl = "https://www.bspb.ru/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get(baseUrl);
    }

    @Test
    public void businessZayavkaTest() {
        driver.get("https://www.bspb.ru/business");
        driver.findElement(By.id("FIRSTNAME-Имя"));
        driver.findElement(By.id("FIRSTNAME-Имя")).clear();
        driver.findElement(By.id("FIRSTNAME-Имя")).sendKeys("Василий");
        driver.findElement(By.name("PHONENUMBER-Телефон"));
        driver.findElement(By.name("PHONENUMBER-Телефон")).clear();
        driver.findElement(By.name("PHONENUMBER-Телефон")).sendKeys("+7 999 999 99 99");
    }

    @Test
    public void StrategTest() {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//button[@id='popover-trigger-:R6kqdt9jltmH1:']/p")).click();
        driver.findElement(By.linkText("Стратег")).click();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();

    }

}
