package org.example.test;
import org.example.page.FormPage;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.test.Constants.URL;

public class BaseTestSetup {
    public static FormPage formPage;
    static WebDriver driver = new ChromeDriver();

    public static void setup(){
        formPage = new FormPage(driver);
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @Before
    public void init() {
        setup();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

