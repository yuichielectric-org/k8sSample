package myapp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyAppControllerTest {
    @Test
    public void test() {
        MyAppController sut = new MyAppController();
        assertEquals("index.html", sut.index());
    }
}
