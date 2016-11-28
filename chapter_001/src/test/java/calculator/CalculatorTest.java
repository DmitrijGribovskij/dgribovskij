package calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * CalculatorTest.
 *
 * @author Dmitrij Gribovskij
 * @since 28.11.2016
 */
public class CalculatorTest {
	/**
	* Test class.
	*/
	private Calculator calculator = new Calculator();
    /**
     * Test sum.
     */
	@Test
    public void  whenFirstAndSecondThenSumResult() {
		final double first = 5;
		final double second = 6;
		final double resultTest = 11;
		calculator.sum(first, second);
		assertThat(calculator.getResult(), is(resultTest));
    }
	/**
     * Test subtraction.
     */
	 @Test
	 public void  whenFirstAndSecondThenSubtractionResult() {
		final double first = 5;
		final double second = 6;
		final double resultTest = -1;
        calculator.subtraction(first, second);
        assertThat(calculator.getResult(), is(resultTest));
    }
	/**
     * Test multiplication.
     */
	 @Test
	 public void  whenFirstAndSecondThenMultiplicationResult() {
		final double first = 5;
		final double second = 6;
		final double resultTest = 30;
        calculator.multiplication(first, second);
        assertThat(calculator.getResult(), is(resultTest));
    }
	/**
     * Test divide.
     */
	 @Test
	 public void  whenFirstAndSecondThenDivideResult() {
		final double first = 6;
		final double second = 5;
		final double resultTest = 1.2;
        calculator.divide(first, second);
        assertThat(calculator.getResult(), is(resultTest));
    }
}