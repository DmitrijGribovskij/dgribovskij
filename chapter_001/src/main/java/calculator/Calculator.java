package calculator;
/**
* Class Calculator.
* @author Dmitrij Gribovskij
* @since 28.11.2016
*/
public class Calculator {
	/**
	* result - результат вычисления.
	*/
	private double result;
	/**
	* sum - сумма двух чисел.
	* @param first - первое число
	* @param second - второе число
	*/
	public void sum(double first, double second) {
		result = first + second;
	}
	/**
	* subtraction.
	* @param first - первое число
	* @param second - второе число
	*/
	public void subtraction(double first, double second) {
		result = first - second;
	}
	/**
	* subtraction.
	* @param first - первое число
	* @param second - второе число
	*/
	public void multiplication(double first, double second) {
		result = first * second;
	}
	/**
	* subtraction.
	* @param first - первое число
	* @param second - второе число
	*/
	public void divide(double first, double second) {
		if (second == 0) {
			result = 0;
		} else {
			result = first / second;
		}
	}
	/**
	* getResult.
	* @return - result результат вычисления
	*/
	public double getResult() {
		return result;
	}
}