package counter;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Class CounterTest.
* @author Dmitrij Gribovskij
* @since 29.11.2016
*/
public class CounterTest {
	/**
	*CounterTest.
	*/
	private Counter counter = new Counter();
	/**
	*Calculates the sum from start to finish.
	*/
	@Test
	public void whenStartToFinishThenSum() {
		final int start = 2;
		final int finish = 10;
		final int resultTest = 30;
		assertThat(counter.add(start, finish), is(resultTest));
	}
}