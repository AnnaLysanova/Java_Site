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
    }

    @Test
    public void test1() {
        driver.get(baseUrl);
        driver.findElement(By.xpath("//button[@id='popover-trigger-:R6kqdt9jltmH1:']/p")).click();
        driver.findElement(By.linkText("Стратег")).click();
    }
    @Test
    public void businessTest() {
        driver.get("https://www.bspb.ru/"); 
        driver.get("https://www.bspb.ru/business");
        driver.findElement(By.xpath("//*[@id='FIRSTNAME-Имя'")).click();
    }
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();

    }

}
