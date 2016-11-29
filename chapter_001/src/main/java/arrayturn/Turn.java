package arrayturn;
/**
 * Class Turn.
 * @author Dmitrij Gribovskij
 * @ since 29.11.2016
 */
 public class Turn {
	 /**
	 *This method overturns the array.
	 *@param array - array
	 */
	 public void back(int[] array) {
		 int value;
		 for (int i = 0; i < array.length / 2; i++) {
			value = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = value;
		 }
	 }
}