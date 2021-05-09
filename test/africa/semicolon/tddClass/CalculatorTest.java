package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import javax.print.attribute.HashPrintServiceAttributeSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void calculatorCanAddTest() {
        //given
        Calculator myCalculator = new Calculator();
        //when
        int result = myCalculator.add(2, 6);
        assertEquals(8, result);
    }



    @Test
    public  void testThatCalculatorCanMultiply() {
        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.multiply(3,4);
        // confirm
        assertEquals(12, result);
    }

    @Test
    public void testForSubtraction(){
        Calculator subtract = new Calculator();
        int result = subtract.subtract(2, 100);
        assertEquals(98, result);
    }

    @Test
    public void testForDifference(){
        Calculator difference = new Calculator();
        int outcome = difference.difference(44, 22);
        assertEquals(22, outcome);
    }

    @Test
    public void testForDivision(){
        Calculator divide = new Calculator();
        int result = divide.divide(50, 0);
        assertEquals(10, result);
    }


}
