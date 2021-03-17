package docs;

import org.junit.jupiter.api.*;

public class Junit5Examples {

    //всегда выполняется первым, 1 раз
    @BeforeAll
    static void setup() {
        System.out.println("Setup here");
    }

    //выполняется перед каждым новым тестом
    @BeforeEach
    void each() {
        System.out.println("Each here");
    }

    //рандомная проверка теста(независимые тесты)
    @Test
    void SomeTest() {
        System.out.println("SomeTest here");
    }

    @Test
    void AnotherTest() {
        System.out.println("AnotherTest here");
    }

    //выполняется после каждого нового теста
    @AfterEach
    void AfterEach() {
        System.out.println("AfterEach here");
    }

    //выполняется последним(после всего)
    @AfterAll
    static void AfterAll() {
        System.out.println("AfterAll here");
    }
}