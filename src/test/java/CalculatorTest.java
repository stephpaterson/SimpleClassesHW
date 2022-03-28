import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void beforeEach(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void canSubtract(){
        assertEquals(7, calculator.subtract(10, 3));
    }

    @Test
    public void canMultiply(){
        assertEquals(24, calculator.multiply(2, 12));
    }

    @Test
    public void canDivide(){
        assertEquals(2.0, calculator.divide(10.0, 5.0), 0.01);
    }
}
