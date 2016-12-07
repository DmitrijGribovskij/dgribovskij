package max;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Class MaxTest.
* @author Dmitrij Gribovskij
* @since 29.11.2016
*/
public class MaxTest {
	/**
	* MaxTest.
	*/
	/**
	* The maximum number from two numbers.
	*/
	@Test
	public void whenTwoNumbersThenMaximumNumber() {
		Max max = new Max();
		final int first = 1;
		final int second = 2;
		final int resultTest = 2;
		assertThat(max.max(first, second), is(resultTest));
	}
	/**
	* The maximum number from two numbers.
	*/
	@Test
	public void whenTwoNumbersThenMaximumNumberTwoTest() {
		Max max = new Max();
		final int first = 2;
		final int second = 1;
		final int resultTest = 2;
		assertThat(max.max(first, second), is(resultTest));
	}
	/**
	* The maximum number from three numbers.
	*/
	@Test
	public void whenThreeNumbersThenMaximumNumber() {
		Max max = new Max();
		final int first = 1;
		final int second = 2;
		final int third = 3;
		final int resultTest = 3;
		assertThat(max.max(first, second, third), is(resultTest));
	}
}