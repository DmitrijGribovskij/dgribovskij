package triangle;
import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
/**
* Class TriangleTest.
* @author Dmitrij Gribovskij
* @since 29.11.2016
*/
public class TriangleTest {
	/**
	* TriangleTest.
	*/
	@Test
	/**
	* Calculate triangle area.
	*/
	public void whenThreePointsThenCalculateArea() {
		Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 2), new Point(2, 0));
		double result = triangle.area();
		final double error = 0.01;
		final double resultTest = 2.0;
		assertThat(result, closeTo(resultTest, error));
	}
}