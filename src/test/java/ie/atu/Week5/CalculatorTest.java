package ie.atu.Week5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator num;


    @BeforeEach
    void setUp() {
        num = new Calculator();

    }
    @Test
    void testAdd(){
        assertEquals(6, num.add(2,4));
    }
    @Test
    void testMultiply(){
        assertEquals(8, num.multiply(2,4));
    }
    @Test
    void testSubtract(){
        assertEquals(2, num.subtract(4,2));
    }


    @AfterEach
    void tearDown() {
    }
}