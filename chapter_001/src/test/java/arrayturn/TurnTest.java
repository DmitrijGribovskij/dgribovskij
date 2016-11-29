package arrayturn;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class TurnTest.
 * @author Dmitrij Gribovskij
 * @ since 29.11.2016
 */
 public class TurnTest {
	 /**
	 * ArrayTurnTest.
	 */
	 private Turn turn = new Turn();
	 /**
	 *Test method overturns the array.
	 */
	  @Test
	 public void whenArrayThenTurnArray() {
			final int[] array = new int[]{1, 2, 3, 4, 5, 6, 7};
			final int[] expectArray = new int[]{7, 6, 5, 4, 3, 2, 1};
			turn.back(array);
			assertThat(array, is(expectArray));
	}
}