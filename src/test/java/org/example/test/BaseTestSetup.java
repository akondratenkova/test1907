package org.example.test;
import org.example.page.FormPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract public class BaseTestSetup {
    public static FormPage formPage;
    static WebDriver driver = new ChromeDriver();

    @Before
    public void setup() {

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        formPage = new FormPage(driver);
    }



    @After
    public void tearDown() {
        driver.quit();
    }
}

