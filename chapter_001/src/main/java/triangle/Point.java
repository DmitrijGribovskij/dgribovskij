package triangle;
/**
* Class Point.
* @author Dmitrij Gribovskij
* @since 29.11.2016
*/
public class Point {
	/**
	* Coordinate point.
	* @param x - x
	*/
	private double x;
	/**
	* @param y - y
	*/
	private double y;
	/**
	* Constructor.
	* @param x - x
	* @param y - y
	*/
	public Point(double x, double y) {
	this.x = x;
	this.y = y;
	}
	/**
	*calculate distance between two points.
	* @param point - coordinat second point
	* @return - distance between two point
	*/
	 public double distanceTo(Point point) {
        double distance = Math.sqrt(Math.pow((this.x - point.x), 2) + Math.pow((this.y - point.y), 2));
        return distance;
    }
}
