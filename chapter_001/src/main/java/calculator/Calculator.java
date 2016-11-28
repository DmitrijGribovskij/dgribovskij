package calculator;
/**
* Class Calculator.
* @author Dmitrij Gribovskij
* @since 28.11.2016
*/
public class Calculator {
	/**
	* result - ��������� ����������.
	*/
	private double result;
	/**
	* sum - ����� ���� �����.
	* @param first - ������ �����
	* @param second - ������ �����
	*/
	public void sum(double first, double second) {
		result = first + second;
	}
	/**
	* subtraction.
	* @param first - ������ �����
	* @param second - ������ �����
	*/
	public void subtraction(double first, double second) {
		result = first - second;
	}
	/**
	* subtraction.
	* @param first - ������ �����
	* @param second - ������ �����
	*/
	public void multiplication(double first, double second) {
		result = first * second;
	}
	/**
	* subtraction.
	* @param first - ������ �����
	* @param second - ������ �����
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
	* @return - result ��������� ����������
	*/
	public double getResult() {
		return result;
	}
}