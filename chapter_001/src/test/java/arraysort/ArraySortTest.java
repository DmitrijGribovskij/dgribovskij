package arraysort;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class ArraySortTest.
 * @author Dmitrij Gribovskij
 * @ since 02.12.2016
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
		 final int[] resultTest = {1, 2, 3, 4, 5, 6, 7, 8};
		 final int[] values = {7, 8, 5, 6, 4, 3, 1, 2};
		 assertThat(arraysort.sort(values), is(resultTest));
	 }
 }