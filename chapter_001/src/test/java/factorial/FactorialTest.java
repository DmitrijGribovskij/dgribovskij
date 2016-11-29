package factorial;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Class FactorialTest.
* @author Dmitrij Gribovskij
* @since 29.11.2016
*/
public class FactorialTest {
	/**
	*FactorialTest.
	*/
	private Factorial factorial = new Factorial();
	/**
	* Test the factorial number zero or one.
	*/
	@Test
	public void whenNumberZeroOrOneThenFactorial() {
		final int resultTest = 1;
		assertThat(factorial.calc(0), is(resultTest));
	}
	/**
	* Test the factorial number less than zero.
	*/
	@Test
	public void whenNumberNegativeThenFactorial() {
		final int resultTest = 0;
		assertThat(factorial.calc(-1), is(resultTest));
	}
	/**
	* Test the factorial number greater than one.
	*/
	@Test
	public void whenNumberPositiveThenFactorial() {
		final int resultTest = 120;
		final int number = 5;
		assertThat(factorial.calc(number), is(resultTest));
	}
}