package paint;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Class PaintTest.
 * @author Dmitrij Gribovskij
 * @ since 02.12.2016
 */
 public class PaintTest {
	 /**
	 * PiramidaPaintTest.
	 */
	 private Paint paint = new Paint();
	 /**
	 * Test method piramid.
	 */
	 @Test
	 public void whenNumberThenPaintPiramid() {
		 final int number = 2;
		 final String resultTest = "  ^  " + "\n" + " ^ ^ " + "\n";
		 assertThat(paint.piramid(number), is(resultTest));
	 }
 }