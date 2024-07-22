package org.example.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.concurrent.TimeUnit;

public class FormPage {
    public WebDriver driver;

    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement firstNameValue;
    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement lastNameValue;
    @FindBy(xpath = "//input[@id='userEmail']")
    private WebElement userEmailValue;
    @FindBy(xpath = "//*[@id='genterWrapper']/div[2]/div[1]/label")
    private WebElement radioBtn;
    @FindBy(xpath = "//input[@id='userNumber']")
    private WebElement userNumberValue;
    @FindBy(xpath = "//input[@id='dateOfBirthInput']")
    private WebElement dateOfBirthField;
    @FindBy(xpath = "//select[@class='react-datepicker__month-select']//option[text()='January']")
    private WebElement monthOfBirthValue;
    @FindBy(xpath = "//select[@class='react-datepicker__year-select']//option[text()='1990']")
    private WebElement yearOfBirthValue;
    @FindBy(xpath = "//div[@class='react-datepicker__month']//div[text()='19']")
    private WebElement dayOfBirthValue;
    @FindBy(xpath = "//input[@id='subjectsInput']")
    private WebElement subjectsValue;
    @FindBy(xpath = "//input[@id='hobbies-checkbox-1']")
    private WebElement checkBox;
    @FindBy(xpath = "//input[@id='uploadPicture']")
    private WebElement btnChooseFile;
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    private WebElement crntAddress;
    @FindBy(xpath = "//div[text()='Select State']")
    private WebElement selectStateList;
    @FindBy(xpath = "//*[@id='react-select-3-option-0']")
    private WebElement selectState;
    @FindBy(xpath = "//div[text()='Select City']")
    private WebElement selectCityList;
    @FindBy(xpath = "//*[@id='city']/div/div[1]/div[1]")
    private WebElement selectCity;
    @FindBy(xpath = "//button[@id='submit']")
    private WebElement submitBtn;

    public FormPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void fillForm (String firstName, String lastName, String email, String number,String subjects, String pathFile, String address){

        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        firstNameValue.sendKeys(firstName);
        lastNameValue.sendKeys(lastName);
        userEmailValue.sendKeys(email);
        radioBtn.click();
        userNumberValue.sendKeys(number);
        dateOfBirthField.click();
        monthOfBirthValue.click();
        yearOfBirthValue.click();
        dayOfBirthValue.click();
        subjectsValue.sendKeys(subjects);
        checkBox.click();
        btnChooseFile.sendKeys(pathFile);
        crntAddress.sendKeys(address);
        selectStateList.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        selectState.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        selectCityList.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        selectCity.click();
        selectCity.click();
        submitBtn.click();

    }
}
