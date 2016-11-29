package counter;
/**
 * Class Counter.
 * @author Dmitrij Gribovskij
 * @ since 29.11.2016
 */
 public class Counter {
	 /**
	 * The method calculates the sum from start to finish.
	 * @param start - starting value
	 * @param finish - finite value.
	 * @return - sum (sum of even numbers)
	 */
	 public int add(int start, int finish) {
		 int sum = 0;
		 for (int i = start; i <= finish; i++) {
			 if (i % 2 == 0) {
				 sum = sum + i;
			 }
		 }
		 return sum;
	 }
 }