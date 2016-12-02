package arrayturntwo;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class ArraySortTest.
 * @author Dmitrij Gribovskij
 * @ since 02.12.2016
 */
 public class ArrayTurnTwoTest {
	 /**
	 * ArrayTurnTwoTestTest.
	 */
	 private ArrayTurnTwo arrayturn = new ArrayTurnTwo();
	 /**
	 *Test method sort.
     */
	 @Test
     public void whenArrayThenTurnArray() {
		 final int[][] resultTest = {
			 {1, 2},
		     {3, 4},
			 };
		 final int[][] values = {
			 {2, 4},
		     {1, 3},
			 };
		 assertThat(arrayturn.turn(values), is(resultTest));
	 }
 }