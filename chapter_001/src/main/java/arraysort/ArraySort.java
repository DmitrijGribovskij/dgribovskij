package arraysort;
/**
 * Class ArraySort.
 * @author Dmitrij Gribovskij
 * @ since 02.12.2016
 */
 public class ArraySort {
	 /**
	 *This method sort the array.
	 *@param values - array
	 *@return - values
	 */
	 public int[] sort(int[] values) {
	     for (int i = 0; i < values.length - 1; i++) {
			 boolean check = true;
			 for (int j = 0; j < values.length - i - 1; j++) {
				 if (values[j] > values[j + 1]) {
					 int value = values[j + 1];
					 values[j + 1] = values[j];
					 values[j] = value;
					 check = false;
				 }
			 }
			 if (check) {
				 break;
			 }
		 }
		 return values;
	 }
 }