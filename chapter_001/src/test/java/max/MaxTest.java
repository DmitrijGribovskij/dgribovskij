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
	@Test
	/**
	* Maximum number.
	*/
	public void whenTwoNumberThenMaximumNumber() {
		Max max = new Max();
		final int first = 1;
		final int second = 2;
		final int resultTest = 2;
		assertThat(max.max(first, second), is(resultTest));
	}
}