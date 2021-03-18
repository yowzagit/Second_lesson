import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Autotest_Student_Registration_Form {


    @BeforeAll
    static void HiRes() {
        Configuration.startMaximized = true;
    }

    @Test
    void MiddleTest() {

        //присвоение имён
        String Name = "Gregory";
        String LastName = "Perelman";
        String Email = "who_know_i_not@gmail.com";
        String sex = "Male";
        String Number = "8005553535";

        //String Birth_date = "13.06.1996";
        String Address = "Budapeshtskaya street 98k3 kv.131 and kv.350, Saint-Petersburg, Russia";
        String state = "NCR";
        String city = "Delhi";

        //начинается магия, заходим на сайт
        open("https://demoqa.com/automation-practice-form");

        //вписываем значения
        $("#firstName").setValue(Name);
        $("#lastName").setValue(LastName);
        $("#userEmail").setValue(Email);
        $("#genterWrapper").find(byText(sex)).click();
        $("#userNumber").setValue(Number);

        //today
        //$("#dateOfBirthInput").pressEnter();

        $("#hobbiesWrapper").find(byText("Reading")).click();

        //$("#uploadPicture").pressEnter();

        $("#currentAddress").setValue(Address);

        $("#state").click();
        $(byText(state)).click();
        $("#city").click();
        $(byText(city)).click();
        sleep(6543);
        $("#submit").click();

        //проверка


        $("#closeLargeModal").click();

    }
}
