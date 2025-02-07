package com.example.Suit1.appmanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ApplicationManager {

    public WebDriver driver;

    private CheckHelper checkHelper;
    public String baseUrl;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "");
        driver = WebDriverManager.chromedriver().create();
        baseUrl = "https://www.bspb.ru/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        checkHelper = new CheckHelper (driver);
        openSite();
    }

    void openSite() {
        driver.get(baseUrl);
    }

    public void gotoBusinessSection() {
        driver.get("https://www.bspb.ru/business");
    }

    public void stop() {
        driver.quit();
    }

    @Step
    public void openStrategPage() {
        driver.findElement(By.linkText("Стратегм")).click();
    }

    @Step(value = "пользователь открывает меню второго уровня")
    public void openSecondMenu() {
        driver.findElement(By.xpath("//button[@id='popover-trigger-:R6kqdt9jltmH1:']/p")).click();
    }

    public CheckHelper getCheckHelper() {
        return checkHelper;
    }
}
