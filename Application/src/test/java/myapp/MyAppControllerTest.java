package myapp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyAppControllerTest {
    @Test
    void test() {
        MyAppController sut = new MyAppController();
        assertEquals("index.html", sut.index());
    }
}
