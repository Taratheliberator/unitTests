import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {
    Calculator sut;

    @BeforeEach
    public void init() {
        System.out.println("test started");
        sut = new Calculator();
    }

    @BeforeAll
    static void started() {
        System.out.println("tests started");
    }

    @AfterEach
    public void finished() {
        System.out.println("test completed");
    }

    @AfterAll
    static void finishedAll() {
        System.out.println("tests completed");
    }

    @Test
    public void testarea() {

        int a = 5, b = 8, expected = 40;


        int result = sut.area(a, b);

        //assert
        assertEquals(result, expected);
    }

    @Test

    public void testperimeter() {

        int a = 6, b = 10, expected = 32;


        int result = sut.perimeter(a, b);

        
        assertEquals(result, expected);

    }
}
