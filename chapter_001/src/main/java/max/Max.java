package max;
/**
* Class Max.
* @author Dmitrij Gribovskij
* @since 29.11.2016
*/
public class Max {
	/**
	* At most from two numbers.
	*/
	/**
	* method max two numbers.
	* @param first - first number.
	* @param second - second number.
	* @return - max number
	*/
	public int max(int first, int second) {
		return first > second ? first : second;
	}
	/**
	* method max three numbers.
	* @param first - first number.
	* @param second - second number.
	* @param third - third number.
	* @return - max number
	*/
	public int max(int first, int second, int third) {
		return max(max(first, second), max(second, third));
	}
}