package testtask;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class TestTaskTest.
 * @author Dmitrij Gribovskij
 * @ since 03.12.2016
 */
 public class TestTaskTest {
	 /**
	 * TestTaskTest.
	 */
	 private TestTask testtask = new TestTask();
	 /**
	 *Test method.
	 */
	 @Test
	 public void whenStringSubAndOriginThenBooleanResult() {
		 final String originTest = "www.job4j.ru";
		 final String subTest = "job4j";
		 assertThat(testtask.contains(originTest, subTest), is(true));
	 }
 }