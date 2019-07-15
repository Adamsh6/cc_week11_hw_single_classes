import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAddNumbers(){
        assertEquals(21.5, calculator.add(20.4, 1.1), 0);
    }

    @Test
    public void canSubtractNumbers(){
        assertEquals(14.3, calculator.subtract(21.6, 7.3), 0);
    }

    @Test
    public void canMultiplyNumbers(){
        assertEquals(2.5, calculator.multiply(1.25, 2.0), 0);
    }

    @Test
    public void canDivideNumbers(){
        assertEquals(2.0, calculator.divide(6.4, 3.2), 0);
    }

}