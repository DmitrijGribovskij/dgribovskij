package calculator;
/**
* @author Dmitrij Gribovskij
* @version $Id$
*/
public class Calculator {
	/**
	* result.
	*/
	private double result;
	/**
	* sum.
	* @param first - first.
	*/
	public void sum(double first) {
		result = result + first;
	}
	/**
	* subtraction.
	* @param second - second
	*/
	public void subtraction(double second) {
		result = result - second;
	}
	/**
	* getResult.
	* @return - result
	*/
	public double getResult() {
		return result;
	}
}