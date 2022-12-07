package org.example.calculator;
import org.example.Inputs;
import org.example.Logic;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class calculatorTest {

    Logic logic;
    Inputs inputs;

    @BeforeEach
    public void setUp() {
        logic = new Logic();
        inputs = new Inputs();
    }

    @Test
    @DisplayName("Adding two single digit numbers results in correct answer")
    void singleDigits_Addition_Correct() {
       double a = 2;
       double b = 3;
       double expectedResult = 5;
       double result = logic.calculate(a, b, "+");
       assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Adding two double digit numbers results in correct answer")
    void doubleDigits_Addition_Correct() {
        double a = 25;
        double b = 35;
        double expectedResult = 60;
        double result = logic.calculate(a, b, "+");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Adding two decimal numbers results in correct answer")
    void decimal_Addition_Correct() {
        double a = 5.5;
        double b = 1.2;
        double expectedResult = 6.7;
        double result = logic.calculate(a, b, "+");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Subtracting two single digit numbers results in correct answer")
    void singleDigits_Subtraction_Correct() {
        double a = 9;
        double b = 1;
        double expectedResult = 8;
        double result = logic.calculate(a, b, "-");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Subtracting two double digit numbers results in correct answer")
    void doubleDigits_Subtraction_Correct() {
        double a = 73;
        double b = 13;
        double expectedResult = 60;
        double result = logic.calculate(a, b, "-");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Subtracting two decimal numbers results in correct answer")
    void decimal_Subtraction_Correct() {
        double a = 23.67;
        double b = 0.67;
        double expectedResult = 23;
        double result = logic.calculate(a, b, "-");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Multiplying two single digit numbers results in correct answer")
    void singleDigits_Multiplication_Correct() {
        double a = 2;
        double b = 3;
        double expectedResult = 6;
        double result = logic.calculate(a, b, "*");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Multiplying two double digit numbers results in correct answer")
    void doubleDigits_Multiplication_Correct() {
        double a = 15;
        double b = 98;
        double expectedResult = 1470;
        double result = logic.calculate(a, b, "*");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Multiplying two decimal numbers results in correct answer")
    void decimal_Multiplication_Correct() {
        double a = 54.5;
        double b = 2.7;
        double expectedResult = 147.15;
        double result = logic.calculate(a, b, "*");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Dividing two single digit numbers results in correct answer")
    void singleDigits_Division_Correct() {
        double a = 9;
        double b = 3;
        double expectedResult = 3;
        double result = logic.calculate(a, b, "/");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Dividing two double digit numbers results in correct answer")
    void doubleDigits_Division_Correct() {
        double a = 45;
        double b = 15;
        double expectedResult = 3;
        double result = logic.calculate(a, b, "/");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Dividing two decimal numbers results in correct answer")
    void decimal_Division_Correct() {
        double a = 750.5;
        double b = 2.5;
        double expectedResult = 300.2;
        double result = logic.calculate(a, b, "/");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Squaring a number results in correct answer")
    void squaring_Correct() {
        double a = 4;
        double b = 2;
        double expectedResult = 16;
        double result = logic.calculate(a, b, "^");
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Square rooting a number results in correct answer")
    void squareRooting_Correct() {
        double a = 25;
        double expectedResult = 5;
        double result = logic.calculate(a, "√");
        assertEquals(expectedResult, result);
    }

}
