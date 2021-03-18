import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
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
        String name = "Gregory";
        String lastName = "Perelman";
        String email = "who_know_i_not@gmail.com";
        String sex = "Male";
        String number = "8005553535";

        String addr = "Budapeshtskaya street 98k3 kv.131 and kv.350, Saint-Petersburg, Russia";
        String state = "NCR";
        String city = "Delhi";

        //начинается магия, заходим на сайт
        open("https://demoqa.com/automation-practice-form");

        //вписываем значения
        $("#firstName").setValue(name);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#genterWrapper").find(byText(sex)).click();
        $("#userNumber").setValue(number);

        //today
        //$("#dateOfBirthInput").pressEnter();
        $("#dateOfBirthInput").click();

        //костыль
        $(".react-datepicker__navigation.react-datepicker__navigation--next").click();
        $(".react-datepicker__navigation.react-datepicker__navigation--next").click();
        $(".react-datepicker__navigation.react-datepicker__navigation--next").click();
        //sleep(222);
        $(".react-datepicker__year-select").selectOptionByValue("1966");

        //sleep(222);
        $(".react-datepicker__day.react-datepicker__day--013").click();



        $("#currentAddress").setValue(addr);

        $("#state").click();
        $(byText(state)).click();
        $("#city").click();
        $(byText(city)).click();

        $("#uploadPicture").uploadFromClasspath("per.png");

        $("#submit").click();

        //проверка
        $(".table").shouldHave(text(name), text(lastName), text(email), text(sex), text(number), text(addr), text("per.png"), text(state), text(city));

        $("#closeLargeModal").click();

    }
}
