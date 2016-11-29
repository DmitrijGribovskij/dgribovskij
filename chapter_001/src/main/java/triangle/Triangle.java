package triangle;
/**
* Class Triangle.
* @author Dmitrij Gribovskij
* @since 29.11.2016
*/
public class Triangle {
	/**
	* References to three points.
	* @param a - point A
	*/
	private Point a;
	/**
	* @param b - point B
	*/
	private Point b;
	/**
	* @param c - point C
	*/
	private Point c;
	/**
	* Constructor.
	* Coordinates of three points are transferred.
	* @param a - coordinate point A.
	* @param b - coordinate point B.
	* @param c - coordinate point C.
	*/
	public Triangle(Point a, Point b, Point c) {
	this.a = a;
	this.b = b;
	this.c = c;
	}
	/**
	* Calculate the triangle area.
	* @return - triangleArea.
	*/
	public double area() {
        double distAandB, distBandC, distAandC;
        distAandB = a.distanceTo(b);
        distBandC = b.distanceTo(c);
        distAandC = a.distanceTo(c);
        double triangleArea;
        if ((distAandB < distAandC + distBandC) && (distBandC < distAandB + distAandC) &&  (distAandC < distAandB + distBandC)) {
            double halfPerimeter = (distAandB + distAandC + distBandC) / 2;
            triangleArea = Math.sqrt(halfPerimeter * (halfPerimeter - distAandB) * (halfPerimeter - distAandC) * (halfPerimeter - distBandC));
        } else {
			triangleArea = 0;
        }
        return triangleArea;
    }
}