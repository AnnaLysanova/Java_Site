package com.example.Suit1.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckHelper {
    private WebDriver driver;

    public CheckHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void fillCheckForm(String name, String phone) {
        driver.findElement(By.id("FIRSTNAME-Имя"));
        driver.findElement(By.id("FIRSTNAME-Имя")).clear();
        driver.findElement(By.id("FIRSTNAME-Имя")).sendKeys(name);
        driver.findElement(By.name("PHONENUMBER-Телефон"));
        driver.findElement(By.name("PHONENUMBER-Телефон")).clear();
        driver.findElement(By.name("PHONENUMBER-Телефон")).sendKeys(phone);
    }
}
