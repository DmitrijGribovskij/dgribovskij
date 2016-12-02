package arraycopy;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class ArrayCopyTest.
 * @author Dmitrij Gribovskij
 * @ since 02.12.2016
 */
 public class ArrayCopyTest {
	 /**
	 *ArrayCopyTest.
	 */
	 private ArrayCopy arraycopy = new ArrayCopy();
	 /**
	 *Test method duplicate.
	 */
	 @Test
	 public void whenArrayStringThenDeleteDuplicate() {
		 final String[] array = {"Book", "Book", "Array", "Array"};
		 final String[] resultTest = {"Book", "Array"};
		 assertThat(arraycopy.duplicate(array), is(resultTest));
	 }
 }