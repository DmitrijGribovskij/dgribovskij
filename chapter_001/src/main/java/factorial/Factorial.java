package factorial;
/**
 * Class Factorial.
 * @author Dmitrij Gribovskij
 * @ since 29.11.2016
 */
 public class Factorial {
	/**
	*The method calculates the factorial of a number.
	* @param number - number
	* @return - calc
	*/
	public int calc(int number) {
		int calc;
		if (number < 0) {
			calc = 0;
		} else if (number == 0 || number == 1) {
			calc = 1;
		} else {
			calc = 1;
			for (int i = number; i > 1; i--) {
				calc = calc * i;
			}
		}
		return calc;
	}
 }