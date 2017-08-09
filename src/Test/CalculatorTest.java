package Test;

import Main.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

public class CalculatorTest {
    @Test
    public void testNewCalculatorHasAnAccumulatorOfZero() {
        Calculator calculator = new Calculator();
        assertEquals(BigDecimal.ZERO, calculator.getAccumulator());
    }
}
