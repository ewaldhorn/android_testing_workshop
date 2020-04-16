package za.co.nofuss.testingtests.calculators;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummingCalculatorTest {

    @Test
    public void sumThis() {
        SummingCalculator summingCalculator = new SummingCalculator();
        int expected = 10 + 20 + 30 + 40;

        int result = summingCalculator.sumThis(10, 20, 30, 40);

        assertEquals(result, expected);
    }
}