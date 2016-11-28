package calculator;

import org.junit.Test;
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * CalculatorTest.
 *
 * @author Dmitrij Gribovskij
 * @version $Id$
 * @since 0.1
 */
public class CalculatorTest {
    /**
     * Test sum.
     */
    @Test
    public void  whenFirstThenSumResult() {
		final double first = 5;
        Calculator calculator = new Calculator();
        calculator.sum(first);
		double result = calculator.getResult();
        assertThat(result, is(first));
    }
	/**
     * Test subtraction.
     */
	 @Test
	 public void  whenSecondThenSubtractionResult() {
		final double second = 5;
        Calculator calculator = new Calculator();
        calculator.subtraction(second);
		double result = 0 - calculator.getResult();
        assertThat(result, is(second));
    }
}