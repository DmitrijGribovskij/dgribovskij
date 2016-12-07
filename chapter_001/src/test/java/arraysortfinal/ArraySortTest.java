package arraysortfinal;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class ArraySortTest.
 * @author Dmitrij Gribovskij
 * @ since 07.12.2016
 */
public class ArraySortTest {
	/**
	 * ArraySortTest.
	 */
	private ArraySort arraysort = new ArraySort();
	/**
	 *Test method sort.
	 */
	@Test
	public void whenArrayThenSortArray() {
		final int[] result = {1, 2, 3, 4, 5, 6, 7, 8};
		final int[] arrayFirst = {1, 3, 5, 7};
		final int[] arraySecond = {2, 4, 6, 8};
		assertThat(arraysort.sort(arrayFirst, arraySecond), is(result));
	}
}