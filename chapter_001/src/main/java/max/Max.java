package max;
/**
* Class Max.
* @author Dmitrij Gribovskij
* @since 29.11.2016
*/
public class Max {
	/**
	* At most from two numbers
	*/
	/**
	* method max.
	* @param first - first number.
	* @param second - second number.
	* @return - max number
	*/
	public int max(int first, int second) {
		int max = first > second ? first : second;
		return max;
	}
}