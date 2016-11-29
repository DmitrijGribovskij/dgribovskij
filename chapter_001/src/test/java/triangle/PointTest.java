package triangle;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
/**
* Class PointTest.
* @author Dmitrij Gribovskij
* @since 29.11.2016
*/
public class PointTest {
	/**
	* PointTest.
	*/
	@Test
	/**
	* Calculate distance between two points.
	*/
	 public void whenCoordinateTwoPointsThenDistance() {
		final Point pointA = new Point(0, 0);
		final Point pointB = new Point(0, 2);
		final double resultTest = 2.0;
		final double error = 0.01;
		double result = pointA.distanceTo(pointB);
        assertThat(result, closeTo(resultTest, error));
    }
}
