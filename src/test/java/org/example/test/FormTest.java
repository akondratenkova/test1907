package org.example.test;

import org.example.page.FormPage;
import org.junit.Test;
import static org.example.test.Constants.URL;

public class FormTest extends BaseTestSetup{

    @Test
    public void fillForm(){


        String firstName = "Name";
        String lastName = "Surname";
        String email = "email@email.com";
        String number = "45678922";
        String subjects = "Subject";
        String pathFile = "C:\\Users\\user_\\Downloads\\Wallpaper\\1660706803_64-kartinkin-net-p-korgi-oboi-na-rabochii-stol-krasivo-73.jpg";
        String address = "Country 14";

       // FormPage formPage = new FormPage(driver);
        formPage.fillForm(firstName, lastName, email, number, subjects, pathFile,address);

    }
}
