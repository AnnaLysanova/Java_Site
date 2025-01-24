package com.example.Suit1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class ApplicationManager {
    protected WebDriver driver;
    protected String baseUrl;

    protected void init() {
        System.setProperty("webdriver.chrome.driver", "");
        driver = WebDriverManager.chromedriver().create();
        baseUrl = "https://www.bspb.ru/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        openSite();
    }

    void openSite() {
        driver.get(baseUrl);
    }

    protected void fillCheckForm(String name, String phone) {
        driver.findElement(By.id("FIRSTNAME-Имя"));
        driver.findElement(By.id("FIRSTNAME-Имя")).clear();
        driver.findElement(By.id("FIRSTNAME-Имя")).sendKeys(name);
        driver.findElement(By.name("PHONENUMBER-Телефон"));
        driver.findElement(By.name("PHONENUMBER-Телефон")).clear();
        driver.findElement(By.name("PHONENUMBER-Телефон")).sendKeys(phone);
    }

    protected void gotoBusinessSection() {
        driver.get("https://www.bspb.ru/business");
    }

    protected void stop() {
        driver.quit();
    }

    protected void openStrategPage() {
        driver.findElement(By.linkText("Стратег")).click();
    }

    protected void openSecondMenu() {
        driver.findElement(By.xpath("//button[@id='popover-trigger-:R6kqdt9jltmH1:']/p")).click();
    }
}
